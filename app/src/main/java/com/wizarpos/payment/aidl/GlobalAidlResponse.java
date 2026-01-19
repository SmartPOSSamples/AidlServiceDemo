package com.wizarpos.payment.aidl;

import android.os.Parcel;
import android.os.Parcelable;

public class GlobalAidlResponse implements Parcelable {

    private String TransType;
    private String TransScheme;
    private String CallerName;
    private String TransIndexCode;
    private boolean TransResult;
    private String RespCode;
    private String RespDesc;
    private String CardNum;
    private int EntryMode;
    private String ExpiryDate;
    private String CardBrand;
    private String TransAmount;
    private String OtherAmount;
    private String TipAmount;
    private String Balance;
    private String CurrencyCode;
    private String DccOriCurrencyCode;
    private String DccOriAmount;
    private String DccFee;
    private String DccExchangeRate;
    private String DccMarkUp;
    private String DccFooterText;
    private String TransDate;
    private String TransTime;
    private String CountryCode;
    private String MID;
    private String TID;
    private String MerchantName;
    private String MerchantAddress;
    private String TraceNum;
    private String TransID;
    private String InvoiceNum;
    private String RRN;
    private String AuthCode;
    private String OriTransIndexCode;
    private String OriInvoiceNum;
    private String OriTransId;
    private String OriRrn;
    private String EmvAid;
    private String EmvAppName;
    private String EmvCryptogram;
    private String EmvTVR;

    public GlobalAidlResponse(){}

    public GlobalAidlResponse(boolean transResult, String respCode, String respDesc) {
        init();//测试用 直接写死
        TransResult = transResult;
        RespCode = respCode;
        RespDesc = respDesc;
    }

    private void init(){
        TransID = "ID123456";
        InvoiceNum = "123456";
        TID = "12345678";
        MID = "000000000000000";
        CurrencyCode = "0156";
        CountryCode = "0156";
        TransDate = "20240101";
        TransTime = "010101";
        EntryMode = 0x07;
        TransIndexCode = "123456";
        CallerName = "test";
        TransType = "Purchase";
        TransAmount = "100";
    }

    protected GlobalAidlResponse(Parcel in) {
        TransType = in.readString();
        TransScheme = in.readString();
        CallerName = in.readString();
        TransIndexCode = in.readString();
        TransResult = in.readByte() != 0;
        RespCode = in.readString();
        RespDesc = in.readString();
        CardNum = in.readString();
        EntryMode = in.readInt();
        ExpiryDate = in.readString();
        CardBrand = in.readString();
        TransAmount = in.readString();
        OtherAmount = in.readString();
        TipAmount = in.readString();
        Balance = in.readString();
        CurrencyCode = in.readString();
        DccOriCurrencyCode = in.readString();
        DccOriAmount = in.readString();
        DccFee = in.readString();
        DccExchangeRate = in.readString();
        DccMarkUp = in.readString();
        DccFooterText = in.readString();
        TransDate = in.readString();
        TransTime = in.readString();
        CountryCode = in.readString();
        MID = in.readString();
        TID = in.readString();
        MerchantName = in.readString();
        MerchantAddress = in.readString();
        TraceNum = in.readString();
        TransID = in.readString();
        InvoiceNum = in.readString();
        RRN = in.readString();
        AuthCode = in.readString();
        OriTransIndexCode = in.readString();
        OriInvoiceNum = in.readString();
        OriTransId = in.readString();
        OriRrn = in.readString();
        EmvAid = in.readString();
        EmvAppName = in.readString();
        EmvCryptogram = in.readString();
        EmvTVR = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(TransType);
        dest.writeString(TransScheme);
        dest.writeString(CallerName);
        dest.writeString(TransIndexCode);
        dest.writeByte((byte) (TransResult ? 1 : 0));
        dest.writeString(RespCode);
        dest.writeString(RespDesc);
        dest.writeString(CardNum);
        dest.writeInt(EntryMode);
        dest.writeString(ExpiryDate);
        dest.writeString(CardBrand);
        dest.writeString(TransAmount);
        dest.writeString(OtherAmount);
        dest.writeString(TipAmount);
        dest.writeString(Balance);
        dest.writeString(CurrencyCode);
        dest.writeString(DccOriCurrencyCode);
        dest.writeString(DccOriAmount);
        dest.writeString(DccFee);
        dest.writeString(DccExchangeRate);
        dest.writeString(DccMarkUp);
        dest.writeString(DccFooterText);
        dest.writeString(TransDate);
        dest.writeString(TransTime);
        dest.writeString(CountryCode);
        dest.writeString(MID);
        dest.writeString(TID);
        dest.writeString(MerchantName);
        dest.writeString(MerchantAddress);
        dest.writeString(TraceNum);
        dest.writeString(TransID);
        dest.writeString(InvoiceNum);
        dest.writeString(RRN);
        dest.writeString(AuthCode);
        dest.writeString(OriTransIndexCode);
        dest.writeString(OriInvoiceNum);
        dest.writeString(OriTransId);
        dest.writeString(OriRrn);
        dest.writeString(EmvAid);
        dest.writeString(EmvAppName);
        dest.writeString(EmvCryptogram);
        dest.writeString(EmvTVR);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<GlobalAidlResponse> CREATOR = new Creator<GlobalAidlResponse>() {
        @Override
        public GlobalAidlResponse createFromParcel(Parcel in) {
            return new GlobalAidlResponse(in);
        }

        @Override
        public GlobalAidlResponse[] newArray(int size) {
            return new GlobalAidlResponse[size];
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

    public String getTransIndexCode() {
        return TransIndexCode;
    }

    public void setTransIndexCode(String transIndexCode) {
        TransIndexCode = transIndexCode;
    }

    public String getCallerName() {
        return CallerName;
    }

    public void setCallerName(String callerName) {
        CallerName = callerName;
    }

    public boolean getTransResult() {
        return TransResult;
    }

    public void setTransResult(boolean transResult) {
        TransResult = transResult;
    }

    public String getRespCode() {
        return RespCode;
    }

    public void setRespCode(String respCode) {
        RespCode = respCode;
    }

    public String getRespDesc() {
        return RespDesc;
    }

    public void setRespDesc(String respDesc) {
        RespDesc = respDesc;
    }

    public String getCardNum() {
        return CardNum;
    }

    public void setCardNum(String cardNum) {
        CardNum = cardNum;
    }

    public int getEntryMode() {
        return EntryMode;
    }

    public void setEntryMode(int entryMode) {
        EntryMode = entryMode;
    }

    public String getExpiryDate() {
        return ExpiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        ExpiryDate = expiryDate;
    }

    public String getCardBrand() {
        return CardBrand;
    }

    public void setCardBrand(String cardBrand) {
        CardBrand = cardBrand;
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

    public String getBalance() {
        return Balance;
    }

    public void setBalance(String balance) {
        Balance = balance;
    }

    public void setCurrencyCode(String currencyCode) {
        CurrencyCode = currencyCode;
    }

    public String getDccOriCurrencyCode() {
        return DccOriCurrencyCode;
    }

    public void setDccOriCurrencyCode(String dccOriCurrencyCode) {
        DccOriCurrencyCode = dccOriCurrencyCode;
    }

    public String getDccOriAmount() {
        return DccOriAmount;
    }

    public void setDccOriAmount(String dccOriAmount) {
        DccOriAmount = dccOriAmount;
    }

    public String getDccFee() {
        return DccFee;
    }

    public void setDccFee(String dccFee) {
        DccFee = dccFee;
    }

    public String getDccExchangeRate() {
        return DccExchangeRate;
    }

    public void setDccExchangeRate(String dccExchangeRate) {
        DccExchangeRate = dccExchangeRate;
    }

    public String getDccMarkUp() {
        return DccMarkUp;
    }

    public void setDccMarkUp(String dccMarkUp) {
        DccMarkUp = dccMarkUp;
    }

    public String getDccFooterText() {
        return DccFooterText;
    }

    public void setDccFooterText(String dccFooterText) {
        DccFooterText = dccFooterText;
    }

    public String getTransDate() {
        return TransDate;
    }

    public void setTransDate(String transDate) {
        TransDate = transDate;
    }

    public String getTransTime() {
        return TransTime;
    }

    public void setTransTime(String transTime) {
        TransTime = transTime;
    }

    public String getCountryCode() {
        return CountryCode;
    }

    public void setCountryCode(String countryCode) {
        CountryCode = countryCode;
    }

    public String getMID() {
        return MID;
    }

    public void setMID(String MID) {
        this.MID = MID;
    }

    public String getTID() {
        return TID;
    }

    public void setTID(String TID) {
        this.TID = TID;
    }

    public String getMerchantName() {
        return MerchantName;
    }

    public void setMerchantName(String merchantName) {
        MerchantName = merchantName;
    }

    public String getMerchantAddress() {
        return MerchantAddress;
    }

    public void setMerchantAddress(String merchantAddress) {
        MerchantAddress = merchantAddress;
    }

    public String getTraceNum() {
        return TraceNum;
    }

    public void setTraceNum(String traceNum) {
        TraceNum = traceNum;
    }

    public String getTransID() {
        return TransID;
    }

    public void setTransID(String transID) {
        TransID = transID;
    }

    public String getInvoiceNum() {
        return InvoiceNum;
    }

    public void setInvoiceNum(String invoiceNum) {
        this.InvoiceNum = invoiceNum;
    }

    public String getRRN() {
        return RRN;
    }

    public void setRRN(String RRN) {
        this.RRN = RRN;
    }

    public String getAuthCode() {
        return AuthCode;
    }

    public void setAuthCode(String authCode) {
        AuthCode = authCode;
    }

    public String getOriTransIndexCode() {
        return OriTransIndexCode;
    }

    public void setOriTransIndexCode(String oriTransIndexCode) {
        OriTransIndexCode = oriTransIndexCode;
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

    public String getEmvAid() {
        return EmvAid;
    }

    public void setEmvAid(String emvAid) {
        EmvAid = emvAid;
    }

    public String getEmvAppName() {
        return EmvAppName;
    }

    public void setEmvAppName(String emvAppName) {
        EmvAppName = emvAppName;
    }

    public String getEmvCryptogram() {
        return EmvCryptogram;
    }

    public void setEmvCryptogram(String emvCryptogram) {
        EmvCryptogram = emvCryptogram;
    }

    public String getEmvTVR() {
        return EmvTVR;
    }

    public void setEmvTVR(String emvTVR) {
        EmvTVR = emvTVR;
    }

    @Override
    public String toString() {
        return "GlobalAidlResponse{" +
                "TransType='" + TransType + '\'' +
                ", TransScheme='" + TransScheme + '\'' +
                ", CallerName='" + CallerName + '\'' +
                ", TransIndexCode='" + TransIndexCode + '\'' +
                ", TransResult=" + TransResult +
                ", RespCode='" + RespCode + '\'' +
                ", RespDesc='" + RespDesc + '\'' +
                ", CardNum='" + CardNum + '\'' +
                ", EntryMode=" + EntryMode +
                ", ExpiryDate='" + ExpiryDate + '\'' +
                ", CardBrand='" + CardBrand + '\'' +
                ", TransAmount='" + TransAmount + '\'' +
                ", OtherAmount='" + OtherAmount + '\'' +
                ", TipAmount='" + TipAmount + '\'' +
                ", Balance='" + Balance + '\'' +
                ", CurrencyCode='" + CurrencyCode + '\'' +
                ", DccOriCurrencyCode='" + DccOriCurrencyCode + '\'' +
                ", DccOriAmount='" + DccOriAmount + '\'' +
                ", DccFee='" + DccFee + '\'' +
                ", DccExchangeRate='" + DccExchangeRate + '\'' +
                ", DccMarkUp='" + DccMarkUp + '\'' +
                ", DccFooterText='" + DccFooterText + '\'' +
                ", TransDate='" + TransDate + '\'' +
                ", TransTime='" + TransTime + '\'' +
                ", CountryCode='" + CountryCode + '\'' +
                ", MID='" + MID + '\'' +
                ", TID='" + TID + '\'' +
                ", MerchantName='" + MerchantName + '\'' +
                ", MerchantAddress='" + MerchantAddress + '\'' +
                ", TraceNum='" + TraceNum + '\'' +
                ", TransID='" + TransID + '\'' +
                ", InvoiceNum='" + InvoiceNum + '\'' +
                ", RRN='" + RRN + '\'' +
                ", AuthCode='" + AuthCode + '\'' +
                ", OriTransIndexCode='" + OriTransIndexCode + '\'' +
                ", OriInvoiceNum='" + OriInvoiceNum + '\'' +
                ", OriTransId='" + OriTransId + '\'' +
                ", OriRrn='" + OriRrn + '\'' +
                ", EmvAid='" + EmvAid + '\'' +
                ", EmvAppName='" + EmvAppName + '\'' +
                ", EmvCryptogram='" + EmvCryptogram + '\'' +
                ", EmvTVR='" + EmvTVR + '\'' +
                '}';
    }
}
