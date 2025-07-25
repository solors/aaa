package com.bytedance.sdk.openadsdk.api.model;

/* loaded from: classes3.dex */
public class PAGErrorModel {

    /* renamed from: IL */
    private final String f17737IL;

    /* renamed from: bg */
    private final int f17738bg;

    public PAGErrorModel(int i, String str) {
        this.f17738bg = i;
        this.f17737IL = str;
    }

    public int getErrorCode() {
        return this.f17738bg;
    }

    public String getErrorMessage() {
        return this.f17737IL;
    }
}
