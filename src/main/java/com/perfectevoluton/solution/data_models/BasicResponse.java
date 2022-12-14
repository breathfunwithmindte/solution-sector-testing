package com.perfectevoluton.solution.data_models;

import java.util.HashMap;

public class BasicResponse {
    private Integer status = 200;
    private String message;
    private HashMap<String, Object> data;

    public BasicResponse(Integer status, String message, HashMap<String, Object> data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public BasicResponse () {
        this.status = 200;
        this.message = "ok";
    }

    public BasicResponse(Integer status, String message) {
        this.status = status;
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HashMap<String, Object> getData() {
        return data;
    }

    public void setData(HashMap<String, Object> data) {
        this.data = data;
    }


}
