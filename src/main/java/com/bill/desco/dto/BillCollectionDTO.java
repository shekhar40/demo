package com.bill.desco.dto;

import java.time.LocalDateTime;

public class BillCollectionDTO {
    private String BILL_NO ;
    private String BUNDLE_NO;
    private String BANK_CODE ;
    private String SCROLL_NO ;
    private LocalDateTime COLLECTION_DATE;
    private double TOTAL_PAYBLE_AMOUNT ;
    private double TOTAL_PAID_AMOUNT ;
    private double LPC;
    private double STAMPCHARGE ;
    private String PAID;
    private LocalDateTime DUE_DATE ;
    private String COLLECTED_VAT;
    private String C_TARIFF ;
    private String REMOTE_POSTED ;
    private String DEPARTMENT_ID ;
    private String ACCOUNT_NO ;
    private String OLD_ACCOUNT_NO;
    private String USER_ID ;
    private String BRANCH_ID ;
    private String BILL_PERIOD ;
    private String BILL_TRANSACTIONID ;

    public BillCollectionDTO() {

    }

    public BillCollectionDTO(String BILL_NO, String BUNDLE_NO, String BANK_CODE, String SCROLL_NO, LocalDateTime COLLECTION_DATE, double TOTAL_PAYBLE_AMOUNT, double TOTAL_PAID_AMOUNT, double LPC, double STAMPCHARGE, String PAID, LocalDateTime DUE_DATE, String COLLECTED_VAT, String c_TARIFF, String REMOTE_POSTED, String DEPARTMENT_ID, String ACCOUNT_NO, String OLD_ACCOUNT_NO, String USER_ID, String BRANCH_ID, String BILL_PERIOD, String BILL_TRANSACTIONID) {
        this.BILL_NO = BILL_NO;
        this.BUNDLE_NO = BUNDLE_NO;
        this.BANK_CODE = BANK_CODE;
        this.SCROLL_NO = SCROLL_NO;
        this.COLLECTION_DATE = COLLECTION_DATE;
        this.TOTAL_PAYBLE_AMOUNT = TOTAL_PAYBLE_AMOUNT;
        this.TOTAL_PAID_AMOUNT = TOTAL_PAID_AMOUNT;
        this.LPC = LPC;
        this.STAMPCHARGE = STAMPCHARGE;
        this.PAID = PAID;
        this.DUE_DATE = DUE_DATE;
        this.COLLECTED_VAT = COLLECTED_VAT;
        C_TARIFF = c_TARIFF;
        this.REMOTE_POSTED = REMOTE_POSTED;
        this.DEPARTMENT_ID = DEPARTMENT_ID;
        this.ACCOUNT_NO = ACCOUNT_NO;
        this.OLD_ACCOUNT_NO = OLD_ACCOUNT_NO;
        this.USER_ID = USER_ID;
        this.BRANCH_ID = BRANCH_ID;
        this.BILL_PERIOD = BILL_PERIOD;
        this.BILL_TRANSACTIONID = BILL_TRANSACTIONID;
    }

    public String getBILL_NO() {
        return BILL_NO;
    }

    public void setBILL_NO(String BILL_NO) {
        this.BILL_NO = BILL_NO;
    }

    public String getBUNDLE_NO() {
        return BUNDLE_NO;
    }

    public void setBUNDLE_NO(String BUNDLE_NO) {
        this.BUNDLE_NO = BUNDLE_NO;
    }

    public String getBANK_CODE() {
        return BANK_CODE;
    }

    public void setBANK_CODE(String BANK_CODE) {
        this.BANK_CODE = BANK_CODE;
    }

    public String getSCROLL_NO() {
        return SCROLL_NO;
    }

    public void setSCROLL_NO(String SCROLL_NO) {
        this.SCROLL_NO = SCROLL_NO;
    }

    public LocalDateTime getCOLLECTION_DATE() {
        return COLLECTION_DATE;
    }

    public void setCOLLECTION_DATE(LocalDateTime COLLECTION_DATE) {
        this.COLLECTION_DATE = COLLECTION_DATE;
    }

    public double getTOTAL_PAYBLE_AMOUNT() {
        return TOTAL_PAYBLE_AMOUNT;
    }

    public void setTOTAL_PAYBLE_AMOUNT(double TOTAL_PAYBLE_AMOUNT) {
        this.TOTAL_PAYBLE_AMOUNT = TOTAL_PAYBLE_AMOUNT;
    }

    public double getTOTAL_PAID_AMOUNT() {
        return TOTAL_PAID_AMOUNT;
    }

    public void setTOTAL_PAID_AMOUNT(double TOTAL_PAID_AMOUNT) {
        this.TOTAL_PAID_AMOUNT = TOTAL_PAID_AMOUNT;
    }

    public double getLPC() {
        return LPC;
    }

    public void setLPC(double LPC) {
        this.LPC = LPC;
    }

    public double getSTAMPCHARGE() {
        return STAMPCHARGE;
    }

    public void setSTAMPCHARGE(double STAMPCHARGE) {
        this.STAMPCHARGE = STAMPCHARGE;
    }

    public String getPAID() {
        return PAID;
    }

    public void setPAID(String PAID) {
        this.PAID = PAID;
    }

    public LocalDateTime getDUE_DATE() {
        return DUE_DATE;
    }

    public void setDUE_DATE(LocalDateTime DUE_DATE) {
        this.DUE_DATE = DUE_DATE;
    }

    public String getCOLLECTED_VAT() {
        return COLLECTED_VAT;
    }

    public void setCOLLECTED_VAT(String COLLECTED_VAT) {
        this.COLLECTED_VAT = COLLECTED_VAT;
    }

    public String getC_TARIFF() {
        return C_TARIFF;
    }

    public void setC_TARIFF(String c_TARIFF) {
        C_TARIFF = c_TARIFF;
    }

    public String getREMOTE_POSTED() {
        return REMOTE_POSTED;
    }

    public void setREMOTE_POSTED(String REMOTE_POSTED) {
        this.REMOTE_POSTED = REMOTE_POSTED;
    }

    public String getDEPARTMENT_ID() {
        return DEPARTMENT_ID;
    }

    public void setDEPARTMENT_ID(String DEPARTMENT_ID) {
        this.DEPARTMENT_ID = DEPARTMENT_ID;
    }

    public String getACCOUNT_NO() {
        return ACCOUNT_NO;
    }

    public void setACCOUNT_NO(String ACCOUNT_NO) {
        this.ACCOUNT_NO = ACCOUNT_NO;
    }

    public String getOLD_ACCOUNT_NO() {
        return OLD_ACCOUNT_NO;
    }

    public void setOLD_ACCOUNT_NO(String OLD_ACCOUNT_NO) {
        this.OLD_ACCOUNT_NO = OLD_ACCOUNT_NO;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

    public String getBRANCH_ID() {
        return BRANCH_ID;
    }

    public void setBRANCH_ID(String BRANCH_ID) {
        this.BRANCH_ID = BRANCH_ID;
    }

    public String getBILL_PERIOD() {
        return BILL_PERIOD;
    }

    public void setBILL_PERIOD(String BILL_PERIOD) {
        this.BILL_PERIOD = BILL_PERIOD;
    }

    public String getBILL_TRANSACTIONID() {
        return BILL_TRANSACTIONID;
    }

    public void setBILL_TRANSACTIONID(String BILL_TRANSACTIONID) {
        this.BILL_TRANSACTIONID = BILL_TRANSACTIONID;
    }
}
