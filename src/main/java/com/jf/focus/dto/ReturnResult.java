package com.jf.focus.dto;

public class ReturnResult {
    String value;
    Integer code;
    public static final Integer SUCCESS = 1;
    public static final String SUCCESS_STATUS = "SUCCESS";
    public static final Integer FAILURE = 0;
    public static final String FAILURE_STATUS = "FAILURE";

    public ReturnResult(){}

    public ReturnResult SUCCESS(String status){
        return new ReturnResult(SUCCESS, status);
    }

    public static ReturnResult SUCCESS(){
        return new ReturnResult(SUCCESS, SUCCESS_STATUS);
    }

    public static ReturnResult FAILUER(String status){
        return new ReturnResult(FAILURE, status);
    }

    public static ReturnResult FAILUER(){
        return new ReturnResult(FAILURE, FAILURE_STATUS);
    }

    public ReturnResult(Integer code, String value){
        ReturnResult returnResult = new ReturnResult();
        returnResult.setCode(code);
        returnResult.setValue(value);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }


}
