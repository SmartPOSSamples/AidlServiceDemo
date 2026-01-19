// IPaymentPayCallback.aidl
package com.wizarpos.payment.aidl;

// Declare any non-default types here with import statements

interface IPaymentPayCallback {
   void process(int processCode, String processMsg);
}