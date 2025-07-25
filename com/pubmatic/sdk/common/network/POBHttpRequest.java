package com.pubmatic.sdk.common.network;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class POBHttpRequest implements Cloneable {
    @Nullable

    /* renamed from: d */
    private String f70193d;
    @Nullable

    /* renamed from: e */
    private String f70194e;
    @Nullable

    /* renamed from: f */
    private String f70195f;

    /* renamed from: a */
    private int f70190a = 5000;

    /* renamed from: b */
    private int f70191b = 0;

    /* renamed from: c */
    private float f70192c = 1.0f;

    /* renamed from: h */
    private HTTP_METHOD f70197h = HTTP_METHOD.GET;
    @NonNull

    /* renamed from: g */
    private Map<String, String> f70196g = new HashMap();

    /* loaded from: classes7.dex */
    public enum HTTP_METHOD {
        GET,
        POST,
        PUT,
        DELETE
    }

    @NonNull
    public Map<String, String> getHeaders() {
        return this.f70196g;
    }

    @Nullable
    public String getPostData() {
        return this.f70195f;
    }

    public HTTP_METHOD getRequestMethod() {
        return this.f70197h;
    }

    @Nullable
    public String getRequestTag() {
        return this.f70193d;
    }

    public float getRetryBackoffMultiplier() {
        return this.f70192c;
    }

    public int getRetryCount() {
        return this.f70191b;
    }

    public int getTimeout() {
        return this.f70190a;
    }

    @Nullable
    public String getUrl() {
        return this.f70194e;
    }

    public void setHeaders(@NonNull Map<String, String> map) {
        this.f70196g = map;
    }

    public void setPostData(@Nullable String str) {
        this.f70195f = str;
    }

    public void setRequestMethod(HTTP_METHOD http_method) {
        this.f70197h = http_method;
    }

    public void setRequestTag(@Nullable String str) {
        this.f70193d = str;
    }

    public void setRetryBackoffMultiplier(float f) {
        this.f70192c = f;
    }

    public void setRetryCount(int i) {
        this.f70191b = i;
    }

    public void setTimeout(int i) {
        this.f70190a = i;
    }

    public void setUrl(@Nullable String str) {
        this.f70194e = str;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(getUrl());
        if (getRequestMethod() == HTTP_METHOD.POST) {
            sb2.append("\nPOST Data : ");
            sb2.append(getPostData());
        } else {
            sb2.append(getPostData());
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: clone */
    public POBHttpRequest m110237clone() throws CloneNotSupportedException {
        return (POBHttpRequest) super.clone();
    }
}
