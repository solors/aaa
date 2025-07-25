package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.io.IOException;

/* renamed from: com.yandex.mobile.ads.impl.ku */
/* loaded from: classes8.dex */
public class C30748ku extends IOException {

    /* renamed from: c */
    public static final /* synthetic */ int f81571c = 0;

    /* renamed from: b */
    public final int f81572b;

    public C30748ku(int i) {
        this.f81572b = i;
    }

    public C30748ku(int i, @Nullable String str) {
        super(str);
        this.f81572b = i;
    }

    public C30748ku(int i, @Nullable String str, @Nullable Throwable th) {
        super(str, th);
        this.f81572b = i;
    }

    public C30748ku(@Nullable Throwable th, int i) {
        super(th);
        this.f81572b = i;
    }
}
