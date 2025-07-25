package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@StabilityInferred(parameters = 0)
/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.i */
/* loaded from: classes7.dex */
public final class C25032i {
    @Nullable

    /* renamed from: a */
    public final String f64916a;
    @Nullable

    /* renamed from: b */
    public final Integer f64917b;
    @Nullable

    /* renamed from: c */
    public final String f64918c;
    @Nullable

    /* renamed from: d */
    public final String f64919d;
    @NotNull

    /* renamed from: e */
    public final AbstractC25033j f64920e;

    public C25032i(@Nullable String str, @Nullable Integer num, @Nullable String str2, @Nullable String str3, @NotNull AbstractC25033j child) {
        Intrinsics.checkNotNullParameter(child, "child");
        this.f64916a = str;
        this.f64917b = num;
        this.f64918c = str2;
        this.f64919d = str3;
        this.f64920e = child;
    }

    @Nullable
    /* renamed from: a */
    public final String m45256a() {
        return this.f64919d;
    }

    @NotNull
    /* renamed from: b */
    public final AbstractC25033j m45255b() {
        return this.f64920e;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25032i)) {
            return false;
        }
        C25032i c25032i = (C25032i) obj;
        if (Intrinsics.m17075f(this.f64916a, c25032i.f64916a) && Intrinsics.m17075f(this.f64917b, c25032i.f64917b) && Intrinsics.m17075f(this.f64918c, c25032i.f64918c) && Intrinsics.m17075f(this.f64919d, c25032i.f64919d) && Intrinsics.m17075f(this.f64920e, c25032i.f64920e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        String str = this.f64916a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i2 = hashCode * 31;
        Integer num = this.f64917b;
        if (num == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = num.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        String str2 = this.f64918c;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        String str3 = this.f64919d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((i4 + i) * 31) + this.f64920e.hashCode();
    }

    @NotNull
    public String toString() {
        return "Creative(id=" + this.f64916a + ", sequence=" + this.f64917b + ", adId=" + this.f64918c + ", apiFramework=" + this.f64919d + ", child=" + this.f64920e + ')';
    }
}
