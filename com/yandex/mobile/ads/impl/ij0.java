package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class ij0 {
    @Nullable

    /* renamed from: a */
    private final String f80484a;
    @Nullable

    /* renamed from: b */
    private final String f80485b;
    @Nullable

    /* renamed from: c */
    private final String f80486c;
    @Nullable

    /* renamed from: d */
    private final String f80487d;
    @Nullable

    /* renamed from: e */
    private final String f80488e;

    public ij0(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        this.f80484a = str;
        this.f80485b = str2;
        this.f80486c = str3;
        this.f80487d = str4;
        this.f80488e = str5;
    }

    @Nullable
    /* renamed from: a */
    public final String m33255a() {
        return this.f80484a;
    }

    @Nullable
    /* renamed from: b */
    public final String m33254b() {
        return this.f80488e;
    }

    @Nullable
    /* renamed from: c */
    public final String m33253c() {
        return this.f80486c;
    }

    @Nullable
    /* renamed from: d */
    public final String m33252d() {
        return this.f80485b;
    }

    @Nullable
    /* renamed from: e */
    public final String m33251e() {
        return this.f80487d;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ij0)) {
            return false;
        }
        ij0 ij0Var = (ij0) obj;
        if (Intrinsics.m17075f(this.f80484a, ij0Var.f80484a) && Intrinsics.m17075f(this.f80485b, ij0Var.f80485b) && Intrinsics.m17075f(this.f80486c, ij0Var.f80486c) && Intrinsics.m17075f(this.f80487d, ij0Var.f80487d) && Intrinsics.m17075f(this.f80488e, ij0Var.f80488e)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        String str = this.f80484a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f80485b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f80486c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f80487d;
        if (str4 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str4.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        String str5 = this.f80488e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return i5 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f80484a;
        String str2 = this.f80485b;
        String str3 = this.f80486c;
        String str4 = this.f80487d;
        String str5 = this.f80488e;
        return "InstreamAdInfo(adId=" + str + ", creativeId=" + str2 + ", bannerId=" + str3 + ", data=" + str4 + ", advertiserInfo=" + str5 + ")";
    }
}
