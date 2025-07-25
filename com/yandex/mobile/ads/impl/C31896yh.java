package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.yandex.mobile.ads.impl.yh */
/* loaded from: classes8.dex */
public final class C31896yh {
    @Nullable

    /* renamed from: a */
    private final String f88215a;
    @Nullable

    /* renamed from: b */
    private final String f88216b;
    @Nullable

    /* renamed from: c */
    private final String f88217c;
    @Nullable

    /* renamed from: d */
    private final String f88218d;

    public C31896yh(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
        this.f88215a = str;
        this.f88216b = str2;
        this.f88217c = str3;
        this.f88218d = str4;
    }

    @Nullable
    /* renamed from: a */
    public final String m26912a() {
        return this.f88218d;
    }

    @Nullable
    /* renamed from: b */
    public final String m26911b() {
        return this.f88217c;
    }

    @Nullable
    /* renamed from: c */
    public final String m26910c() {
        return this.f88216b;
    }

    @Nullable
    /* renamed from: d */
    public final String m26909d() {
        return this.f88215a;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31896yh)) {
            return false;
        }
        C31896yh c31896yh = (C31896yh) obj;
        if (Intrinsics.m17075f(this.f88215a, c31896yh.f88215a) && Intrinsics.m17075f(this.f88216b, c31896yh.f88216b) && Intrinsics.m17075f(this.f88217c, c31896yh.f88217c) && Intrinsics.m17075f(this.f88218d, c31896yh.f88218d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f88215a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        String str2 = this.f88216b;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str3 = this.f88217c;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str4 = this.f88218d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return i4 + i;
    }

    @NotNull
    public final String toString() {
        String str = this.f88215a;
        String str2 = this.f88216b;
        String str3 = this.f88217c;
        String str4 = this.f88218d;
        return "BackgroundColors(top=" + str + ", right=" + str2 + ", left=" + str3 + ", bottom=" + str4 + ")";
    }
}
