package com.bykv.p135vk.openvk.preload.geckox.model;

import android.webkit.WebResourceResponse;

/* renamed from: com.bykv.vk.openvk.preload.geckox.model.WebResourceResponseModel */
/* loaded from: classes3.dex */
public class WebResourceResponseModel {
    public static final int ERROR_DEFAULT = -1;
    public static final int ERROR_INTERCEPT = 1;
    public static final int ERROR_NOT_FIND_BY_RESOURCE = 2;
    int errorType;
    WebResourceResponse webResourceResponse;

    public WebResourceResponseModel(int i, WebResourceResponse webResourceResponse) {
        this.errorType = i;
        this.webResourceResponse = webResourceResponse;
    }

    public int getMsg() {
        return this.errorType;
    }

    public WebResourceResponse getWebResourceResponse() {
        return this.webResourceResponse;
    }

    public void setMsg(int i) {
        this.errorType = i;
    }

    public void setWebResourceResponse(WebResourceResponse webResourceResponse) {
        this.webResourceResponse = webResourceResponse;
    }
}
