package com.bytedance.sdk.openadsdk.core.settings;

import android.text.TextUtils;

/* renamed from: com.bytedance.sdk.openadsdk.core.settings.Kg */
/* loaded from: classes3.dex */
public class C8994Kg implements Comparable<C8994Kg> {

    /* renamed from: IL */
    private final String f20072IL;

    /* renamed from: Kg */
    private final String f20073Kg;

    /* renamed from: bX */
    private final int f20074bX;

    /* renamed from: bg */
    private final String f20075bg;
    private final int eqN;

    /* renamed from: iR */
    private final int f20076iR;
    private final int ldr;

    /* renamed from: zx */
    private String f20077zx;

    public C8994Kg(String str, String str2, int i, int i2, String str3, int i3, int i4, String str4) {
        this.f20075bg = str;
        this.f20072IL = str2;
        this.f20074bX = i;
        this.eqN = i2;
        this.f20077zx = str3;
        if (TextUtils.isEmpty(str3)) {
            this.f20077zx = "0";
        }
        this.ldr = i3;
        this.f20076iR = i4;
        this.f20073Kg = str4;
    }

    /* renamed from: bg */
    public int m83860bg() {
        return this.ldr;
    }

    @Override // java.lang.Comparable
    /* renamed from: bg */
    public int compareTo(C8994Kg c8994Kg) {
        if (this.ldr < c8994Kg.m83860bg()) {
            return -1;
        }
        return this.ldr == c8994Kg.m83860bg() ? 0 : 1;
    }
}
