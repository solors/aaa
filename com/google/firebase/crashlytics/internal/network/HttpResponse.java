package com.google.firebase.crashlytics.internal.network;

/* loaded from: classes4.dex */
public class HttpResponse {

    /* renamed from: a */
    private final int f42906a;

    /* renamed from: b */
    private final String f42907b;

    public HttpResponse(int i, String str) {
        this.f42906a = i;
        this.f42907b = str;
    }

    public String body() {
        return this.f42907b;
    }

    public int code() {
        return this.f42906a;
    }
}
