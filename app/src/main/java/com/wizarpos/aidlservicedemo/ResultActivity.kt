package com.wizarpos.aidlservicedemo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import com.wizarpos.aidlservicedemo.databinding.ActivityResultBinding
import com.wizarpos.payment.aidl.GlobalAidlResponse
import org.greenrobot.eventbus.EventBus


import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode
import java.util.*


class ResultActivity : Activity() {

    private lateinit var binding: ActivityResultBinding

    var timerTask: TimerTask? = null
    var timer = Timer()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("resultactivity", "onCreate: ")

        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //EventBus.getDefault().register(this)//注册eventbus

        val value = intent.getStringExtra("req")
        binding.showResult.text = value
        startTimer(6)
    }

    override fun onNewIntent(intent: Intent?) {
        super.onNewIntent(intent)
        Log.i("resultactivity", "onNewIntent")
    }

    fun stopTimer() {
        Log.i("ResultActivity", "stopTimer: ")
        if (timerTask != null) {
            timerTask!!.cancel()
            timerTask = null
        }
    }

    private fun startTimer(timeOut: Int) {
        Log.i("ResultActivity", "startTimer: ")
        timerTask = object : TimerTask() {
            override fun run() {
                stopTimer()
                //transaction finished
                AidlService.exitAidl(GlobalAidlResponse(true, "00", "approval"))
                finish()
            }
        }
      timer.schedule(timerTask, (timeOut * 1000).toLong())
    }

}