package com.pubmatic.sdk.webrendering.mraid;

import androidx.annotation.Nullable;

/* loaded from: classes7.dex */
public class POBViewRect {

    /* renamed from: a */
    final boolean f71214a;
    @Nullable

    /* renamed from: b */
    final String f71215b;

    /* renamed from: c */
    int f71216c;

    /* renamed from: d */
    int f71217d;

    /* renamed from: e */
    int f71218e;

    /* renamed from: f */
    int f71219f;

    public POBViewRect(int i, int i2, int i3, int i4, boolean z, @Nullable String str) {
        this.f71216c = i;
        this.f71217d = i2;
        this.f71218e = i3;
        this.f71219f = i4;
        this.f71214a = z;
        this.f71215b = str;
    }

    public int getHeight() {
        return this.f71218e;
    }

    @Nullable
    public String getStatusMsg() {
        return this.f71215b;
    }

    public int getWidth() {
        return this.f71219f;
    }

    public int getxPosition() {
        return this.f71216c;
    }

    public int getyPosition() {
        return this.f71217d;
    }

    public boolean isStatus() {
        return this.f71214a;
    }

    public POBViewRect(boolean z, @Nullable String str) {
        this.f71214a = z;
        this.f71215b = str;
    }
}
