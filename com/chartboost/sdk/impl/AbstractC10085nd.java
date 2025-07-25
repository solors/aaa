package com.chartboost.sdk.impl;

import android.text.TextUtils;

/* renamed from: com.chartboost.sdk.impl.nd */
/* loaded from: classes3.dex */
public abstract class AbstractC10085nd {
    /* renamed from: a */
    public static void m80985a() {
        if (!AbstractC10147q7.m80758b()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m80979b(C9746bc c9746bc) {
        if (!c9746bc.m81976i()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m80978c(C9746bc c9746bc) {
        if (!c9746bc.m81971n()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    /* renamed from: d */
    public static void m80977d(C9746bc c9746bc) {
        if (c9746bc.m81971n()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: e */
    public static void m80976e(C9746bc c9746bc) {
        if (c9746bc.m81973l()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: f */
    public static void m80975f(C9746bc c9746bc) {
        if (c9746bc.m81972m()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: g */
    public static void m80974g(C9746bc c9746bc) {
        if (c9746bc.m81974k().m80569c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: h */
    public static void m80973h(C9746bc c9746bc) {
        if (c9746bc.m81974k().m80568d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: a */
    public static void m80983a(EnumC9849f8 enumC9849f8, EnumC10143q3 enumC10143q3, EnumC10098o6 enumC10098o6) {
        if (enumC9849f8 == EnumC9849f8.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (enumC10143q3 == EnumC10143q3.DEFINED_BY_JAVASCRIPT && enumC9849f8 == EnumC9849f8.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (enumC10098o6 == EnumC10098o6.DEFINED_BY_JAVASCRIPT && enumC9849f8 == EnumC9849f8.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m80984a(C9746bc c9746bc) {
        m80977d(c9746bc);
        m80979b(c9746bc);
    }

    /* renamed from: a */
    public static void m80982a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m80981a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m80980a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
