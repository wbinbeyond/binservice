package com.springapp.mvc.web.vo;

import java.io.Serializable;

/**
 * Created by Bin on 3/1/2015.
 */
public class Response implements Serializable{
    private String status;
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Response{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
