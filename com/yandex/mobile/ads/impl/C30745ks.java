package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.ks */
/* loaded from: classes8.dex */
public final class C30745ks {
    @NotNull

    /* renamed from: a */
    private final Functions<Bitmap> f81543a;
    @Nullable

    /* renamed from: b */
    private final String f81544b;

    /* renamed from: c */
    private final int f81545c;

    /* renamed from: d */
    private final int f81546d;

    public C30745ks(@NotNull Functions<Bitmap> getBitmap, @Nullable String str, int i, int i2) {
        Intrinsics.checkNotNullParameter(getBitmap, "getBitmap");
        this.f81543a = getBitmap;
        this.f81544b = str;
        this.f81545c = i;
        this.f81546d = i2;
    }

    @Nullable
    /* renamed from: a */
    public final Bitmap m32450a() {
        return this.f81543a.invoke();
    }

    /* renamed from: b */
    public final int m32449b() {
        return this.f81546d;
    }

    @Nullable
    /* renamed from: c */
    public final String m32448c() {
        return this.f81544b;
    }

    /* renamed from: d */
    public final int m32447d() {
        return this.f81545c;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30745ks)) {
            return false;
        }
        C30745ks c30745ks = (C30745ks) obj;
        if (Intrinsics.m17075f(this.f81543a, c30745ks.f81543a) && Intrinsics.m17075f(this.f81544b, c30745ks.f81544b) && this.f81545c == c30745ks.f81545c && this.f81546d == c30745ks.f81546d) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f81543a.hashCode() * 31;
        String str = this.f81544b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        return Integer.hashCode(this.f81546d) + nt1.m31295a(this.f81545c, (hashCode2 + hashCode) * 31, 31);
    }

    @NotNull
    public final String toString() {
        Functions<Bitmap> functions = this.f81543a;
        String str = this.f81544b;
        int i = this.f81545c;
        int i2 = this.f81546d;
        return "CoreNativeAdImage(getBitmap=" + functions + ", sizeType=" + str + ", width=" + i + ", height=" + i2 + ")";
    }
}
