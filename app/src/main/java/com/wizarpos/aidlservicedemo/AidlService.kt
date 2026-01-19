package com.wizarpos.aidlservicedemo

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.google.gson.Gson
import com.wizarpos.payment.aidl.GlobalAidlResponse
import com.wizarpos.payment.aidl.IPaymentPay
import com.wizarpos.payment.aidl.IPaymentPayCallback
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import org.greenrobot.eventbus.EventBus
import java.util.concurrent.Semaphore

class AidlService : Service() {

	companion object {
		private val TAG = "AidlService"
		private var semaphore = Semaphore(0)

		private var globalResult: GlobalAidlResponse? = null

		fun exitAidl(result: GlobalAidlResponse) {
			globalResult = result
//			releaseSemaphore()
		}

		//阻塞-申请令牌
		private fun requireSemaphore() {
			Log.i(TAG, "requireSemaphore In")
			try {
				while (semaphore.availablePermits() > 0)
					semaphore.release()
				semaphore.acquire()
			} catch (e: InterruptedException) {
				throw RuntimeException(e)
			}
			Log.i(TAG, "requireSemaphore Out")
		}

		//返回令牌
		private fun releaseSemaphore() {
			Log.i(TAG, "releaseSemaphore In")
			if (semaphore.availablePermits() == 0) {
				semaphore.release()
			}
			Log.i(TAG, "releaseSemaphore Out")
		}

	}
	var aidlProcessCallback: IPaymentPayCallback? = null


	override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
		Log.i(TAG, "onStartCommand: $intent flags:$flags startId:$startId")
		//context = this
		return super.onStartCommand(intent, flags, startId)
	}

	override fun onBind(intent: Intent?): IBinder? {

		Log.i(TAG, "onBind:$intent")
		return mBinder
	}

	override fun onUnbind(intent: Intent?): Boolean {
		Log.i(TAG, "onUnbind:$intent")
		return super.onUnbind(intent)
	}

	override fun onRebind(intent: Intent?) {
		Log.i(TAG, "onReBind:$intent")
		super.onRebind(intent)
	}

	override fun onDestroy() {
		super.onDestroy()

	}


	private val mBinder = object : IPaymentPay.Stub() {
		override fun transact(jsonData: String?): String {
			Log.i(TAG, "transact:$jsonData")

			GlobalScope.launch (Dispatchers.Main){
				val intent = Intent(this@AidlService, ResultActivity::class.java)
				intent.putExtra("req", jsonData)
				intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_BROUGHT_TO_FRONT

				startActivity(intent)
			}

			aidlProcessCallback?.process(0, "trans procrssing..")

//			requireSemaphore()//阻塞当前服务的线程

			return Gson().toJson(globalResult)
		}

		override fun cancelRequest(jsonData: String?): Boolean {
			return true
		}

		override fun addProcedureCallback(callBack: IPaymentPayCallback?) {
			aidlProcessCallback = callBack
		}

	}

}