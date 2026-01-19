package com.wizarpos.payment.aidl;

import com.wizarpos.payment.aidl.IPaymentPayCallback;

interface IPaymentPay{
    /**
    * execute transaction with json parameters
    * this is a synchronized method and it will be blocked until return the payment result
    * */
	String transact(String jsonData);

	/**
	* add callback during payment steps, used for prompt User procedure information
	*/
    void addProcedureCallback(in IPaymentPayCallback callBack);

    /**
    * cancel previous request and will make transact return
    * this method return false when payment action can not be cancelled
    */
    boolean cancelRequest(String jsonData);

}