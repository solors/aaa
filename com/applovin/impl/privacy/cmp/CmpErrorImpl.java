package com.applovin.impl.privacy.cmp;

import com.applovin.sdk.AppLovinCmpError;

/* loaded from: classes2.dex */
public class CmpErrorImpl implements AppLovinCmpError {

    /* renamed from: a */
    private final AppLovinCmpError.Code f9059a;

    /* renamed from: b */
    private final String f9060b;

    /* renamed from: c */
    private final int f9061c;

    /* renamed from: d */
    private final String f9062d;

    public CmpErrorImpl(AppLovinCmpError.Code code, String str) {
        this(code, str, -1, "");
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public int getCmpCode() {
        return this.f9061c;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getCmpMessage() {
        return this.f9062d;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public AppLovinCmpError.Code getCode() {
        return this.f9059a;
    }

    @Override // com.applovin.sdk.AppLovinCmpError
    public String getMessage() {
        return this.f9060b;
    }

    public String toString() {
        return "CmpErrorImpl(code=" + getCode() + ", message=" + getMessage() + ", cmpCode=" + getCmpCode() + ", cmpMessage=" + getCmpMessage() + ")";
    }

    public CmpErrorImpl(AppLovinCmpError.Code code, String str, int i, String str2) {
        this.f9059a = code;
        this.f9060b = str;
        this.f9061c = i;
        this.f9062d = str2;
    }
}
