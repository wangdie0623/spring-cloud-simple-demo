package com.wang.springboot.cloudbeans;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResultInfo {
    private boolean success;
    private String code;
    private String msg;
    private Object detail;

    public static ResultInfo ok(String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setSuccess(true);
        return resultInfo;
    }

    public static ResultInfo ok(String msg, Object detail) {
        ResultInfo ok = ok(msg);
        ok.setDetail(detail);
        return ok;
    }

    public static ResultInfo ok(String msg, String code, Object detail) {
        ResultInfo ok = ok(msg, detail);
        ok.setCode(code);
        return ok;
    }


    public static ResultInfo fail(String msg) {
        ResultInfo resultInfo = new ResultInfo();
        resultInfo.setMsg(msg);
        resultInfo.setSuccess(false);
        return resultInfo;
    }

    public static ResultInfo fail(String msg, Object detail) {
        ResultInfo fail = fail(msg);
        fail.setDetail(detail);
        return fail;
    }

    public static ResultInfo fail(String msg, String code, Object detail) {
        ResultInfo fail = fail(msg, detail);
        fail.setCode(code);
        return fail;
    }
}
