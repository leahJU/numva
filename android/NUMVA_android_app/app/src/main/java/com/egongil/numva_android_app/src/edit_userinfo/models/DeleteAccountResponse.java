package com.egongil.numva_android_app.src.edit_userinfo.models;

import com.egongil.numva_android_app.src.config.RetrofitResponse;
import com.google.gson.annotations.SerializedName;

import javax.xml.transform.Result;

public class DeleteAccountResponse extends RetrofitResponse {
    @SerializedName("result")
    private Result result;
    public Result getResult(){return result;}
}
