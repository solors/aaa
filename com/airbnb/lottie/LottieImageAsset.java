package com.airbnb.lottie;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

/* renamed from: com.airbnb.lottie.g */
/* loaded from: classes2.dex */
public class LottieImageAsset {

    /* renamed from: a */
    private final int f2209a;

    /* renamed from: b */
    private final int f2210b;

    /* renamed from: c */
    private final String f2211c;

    /* renamed from: d */
    private final String f2212d;

    /* renamed from: e */
    private final String f2213e;
    @Nullable

    /* renamed from: f */
    private Bitmap f2214f;

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public LottieImageAsset(int i, int i2, String str, String str2, String str3) {
        this.f2209a = i;
        this.f2210b = i2;
        this.f2211c = str;
        this.f2212d = str2;
        this.f2213e = str3;
    }

    @Nullable
    /* renamed from: a */
    public Bitmap m103264a() {
        return this.f2214f;
    }

    /* renamed from: b */
    public String m103263b() {
        return this.f2212d;
    }

    /* renamed from: c */
    public int m103262c() {
        return this.f2210b;
    }

    /* renamed from: d */
    public String m103261d() {
        return this.f2211c;
    }

    /* renamed from: e */
    public int m103260e() {
        return this.f2209a;
    }

    /* renamed from: f */
    public void m103259f(@Nullable Bitmap bitmap) {
        this.f2214f = bitmap;
    }
}
