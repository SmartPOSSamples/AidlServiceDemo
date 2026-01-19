package com.wizarpos.payment.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public class GlobalAidlRequest implements Parcelable {


    public static String Purchase = "Purchase";
    public static String PreAuth = "PreAuth";
    public static String AuthCompletion = "AuthCompletion";
    public static String BalanceInquiry = "BalanceInquiry";
    public static String Reversal = "Reversal";
    public static String Refund = "Refund";
    public static String Settle = "Settle";
    public static String GetPosInfo = "GetPosInfo";
    public static String QueryTransaction = "QueryTransaction";
    public static String PrintLast = "PrintLast";
    public static String PrintTotal = "PrintTotal";
    public static String PrintDetail = "PrintDetail";
    public static String PrintParameter = "PrintParameter";
    public static String VerifyCardPan = "VerifyCardPan";



    private String TransType;
    private String TransScheme;
    private String CallerName;
    private String TransIndexCode;
    private String TransAmount;
    private String OtherAmount;
    private String TipAmount;
    private String CurrencyCode;
    private String ReqTransDate;
    private String ReqTransTime;
    private String OriTransIndexCode;
    private String OriTraceNum;
    private String OriInvoiceNum;
    private String OriTransId;
    private String OriRrn;
    private boolean EnableReceipt;
    private String AppendingReceiptInfo;
    private boolean SkipConfirmProcedure;

    public GlobalAidlRequest(){}


    protected GlobalAidlRequest(Parcel in) {
        TransType = in.readString();
        TransScheme = in.readString();
        CallerName = in.readString();
        TransIndexCode = in.readString();
        TransAmount = in.readString();
        OtherAmount = in.readString();
        TipAmount = in.readString();
        CurrencyCode = in.readString();
        ReqTransDate = in.readString();
        ReqTransTime = in.readString();
        OriTransIndexCode = in.readString();
        OriTraceNum = in.readString();
        OriInvoiceNum = in.readString();
        OriTransId = in.readString();
        OriRrn = in.readString();
        EnableReceipt = in.readByte() != 0;
        AppendingReceiptInfo = in.readString();
        SkipConfirmProcedure = in.readByte() != 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(TransType);
        dest.writeString(TransScheme);
        dest.writeString(CallerName);
        dest.writeString(TransIndexCode);
        dest.writeString(TransAmount);
        dest.writeString(OtherAmount);
        dest.writeString(TipAmount);
        dest.writeString(CurrencyCode);
        dest.writeString(ReqTransDate);
        dest.writeString(ReqTransTime);
        dest.writeString(OriTransIndexCode);
        dest.writeString(OriTraceNum);
        dest.writeString(OriInvoiceNum);
        dest.writeString(OriTransId);
        dest.writeString(OriRrn);
        dest.writeByte((byte) (EnableReceipt ? 1 : 0));
        dest.writeString(AppendingReceiptInfo);
        dest.writeByte((byte) (SkipConfirmProcedure ? 1 : 0));
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<GlobalAidlRequest> CREATOR = new Creator<GlobalAidlRequest>() {
        @Override
        public GlobalAidlRequest createFromParcel(Parcel in) {
            return new GlobalAidlRequest(in);
        }

        @Override
        public GlobalAidlRequest[] newArray(int size) {
            return new GlobalAidlRequest[size];
        }
    };

    public String getTransType() {
        return TransType;
    }

    public void setTransType(String transType) {
        TransType = transType;
    }

    public String getTransScheme() {
        return TransScheme;
    }

    public void setTransScheme(String transScheme) {
        TransScheme = transScheme;
    }

    public String getCallerName() {
        return CallerName;
    }

    public void setCallerName(String callerName) {
        CallerName = callerName;
    }

    public String getTransIndexCode() {
        return TransIndexCode;
    }

    public void setTransIndexCode(String transIndexCode) {
        TransIndexCode = transIndexCode;
    }

    public String getTransAmount() {
        return TransAmount;
    }

    public void setTransAmount(String transAmount) {
        TransAmount = transAmount;
    }

    public String getOtherAmount() {
        return OtherAmount;
    }

    public void setOtherAmount(String otherAmount) {
        OtherAmount = otherAmount;
    }

    public String getTipAmount() {
        return TipAmount;
    }

    public void setTipAmount(String tipAmount) {
        TipAmount = tipAmount;
    }

    public String getCurrencyCode() {
        return CurrencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getReqTransDate() {
        return ReqTransDate;
    }

    public void setReqTransDate(String reqTransDate) {
        ReqTransDate = reqTransDate;
    }

    public String getReqTransTime() {
        return ReqTransTime;
    }

    public void setReqTransTime(String reqTransTime) {
        ReqTransTime = reqTransTime;
    }

    public String getOriTransIndexCode() {
        return OriTransIndexCode;
    }

    public void setOriTransIndexCode(String oriTransIndexCode) {
        OriTransIndexCode = oriTransIndexCode;
    }

    public String getOriTraceNum() {
        return OriTraceNum;
    }

    public void setOriTraceNum(String oriTraceNum) {
        OriTraceNum = oriTraceNum;
    }

    public String getOriInvoiceNum() {
        return OriInvoiceNum;
    }

    public void setOriInvoiceNum(String oriInvoiceNum) {
        OriInvoiceNum = oriInvoiceNum;
    }

    public String getOriTransId() {
        return OriTransId;
    }

    public void setOriTransId(String oriTransId) {
        OriTransId = oriTransId;
    }

    public String getOriRrn() {
        return OriRrn;
    }

    public void setOriRrn(String oriRrn) {
        OriRrn = oriRrn;
    }

    public boolean getEnableReceipt() {
        return EnableReceipt;
    }

    public void setEnableReceipt(boolean enableReceipt) {
        EnableReceipt = enableReceipt;
    }

    public String getAppendingReceiptInfo() {
        return AppendingReceiptInfo;
    }

    public void setAppendingReceiptInfo(String appendingReceiptInfo) {
        AppendingReceiptInfo = appendingReceiptInfo;
    }

    public boolean getSkipConfirmProcedure() {
        return SkipConfirmProcedure;
    }

    public void setSkipConfirmProcedure(boolean skipConfirmProcedure) {
        SkipConfirmProcedure = skipConfirmProcedure;
    }

    @Override
    public String toString() {
        return "GlobalAidlRequest{" +
                "TransType='" + TransType + '\'' +
                ", TransScheme='" + TransScheme + '\'' +
                ", CallerName='" + CallerName + '\'' +
                ", TransIndexCode='" + TransIndexCode + '\'' +
                ", TransAmount='" + TransAmount + '\'' +
                ", OtherAmount='" + OtherAmount + '\'' +
                ", TipAmount='" + TipAmount + '\'' +
                ", CurrencyCode='" + CurrencyCode + '\'' +
                ", ReqTransDate='" + ReqTransDate + '\'' +
                ", ReqTransTime='" + ReqTransTime + '\'' +
                ", OriTransIndexCode='" + OriTransIndexCode + '\'' +
                ", OriTraceNum='" + OriTraceNum + '\'' +
                ", OriInvoiceNum='" + OriInvoiceNum + '\'' +
                ", OriTransId='" + OriTransId + '\'' +
                ", OriRrn='" + OriRrn + '\'' +
                ", EnableReceipt=" + EnableReceipt +
                ", AppendingReceiptInfo='" + AppendingReceiptInfo + '\'' +
                ", SkipConfirmProcedure=" + SkipConfirmProcedure +
                '}';
    }
}
