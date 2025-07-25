package com.five_corp.p372ad.internal;

import android.util.Log;
import com.five_corp.p372ad.FiveAdErrorCode;

/* renamed from: com.five_corp.ad.internal.s */
/* loaded from: classes4.dex */
public final class C14068s {

    /* renamed from: a */
    public final EnumC14106t f26240a;

    /* renamed from: b */
    public final String f26241b;

    /* renamed from: c */
    public final Throwable f26242c;

    /* renamed from: d */
    public final C14068s f26243d;

    public C14068s(EnumC14106t enumC14106t, String str, Throwable th, C14068s c14068s) {
        this.f26240a = enumC14106t;
        this.f26241b = str;
        this.f26242c = th;
        this.f26243d = c14068s;
    }

    /* renamed from: a */
    public final FiveAdErrorCode m78137a() {
        C14068s c14068s = this.f26243d;
        if (c14068s != null) {
            return c14068s.m78137a();
        }
        return this.f26240a.f26723b;
    }

    /* renamed from: b */
    public final String m78136b() {
        String str;
        C14068s c14068s = this.f26243d;
        if (c14068s != null) {
            str = c14068s.m78136b();
        } else {
            str = "null";
        }
        String name = this.f26240a.name();
        String valueOf = String.valueOf(this.f26241b);
        String stackTraceString = Log.getStackTraceString(this.f26242c);
        return "DetailedErrorCode: " + name + ", information: " + valueOf + ", exception: " + stackTraceString + ", cause: " + str;
    }
}
