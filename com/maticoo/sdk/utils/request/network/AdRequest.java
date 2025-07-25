package com.maticoo.sdk.utils.request.network;

import com.maticoo.sdk.utils.request.network.Request;

/* loaded from: classes6.dex */
public final class AdRequest {
    public static Request.RequestBuilder get() {
        return Request.newBuilder().method(Request.Method.GET);
    }

    public static Request.RequestBuilder post() {
        return Request.newBuilder().method(Request.Method.POST);
    }
}
