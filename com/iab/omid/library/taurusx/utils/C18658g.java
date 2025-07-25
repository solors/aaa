package com.iab.omid.library.taurusx.utils;

import android.text.TextUtils;
import com.iab.omid.library.taurusx.Omid;
import com.iab.omid.library.taurusx.adsession.C18621a;
import com.iab.omid.library.taurusx.adsession.CreativeType;
import com.iab.omid.library.taurusx.adsession.ImpressionType;
import com.iab.omid.library.taurusx.adsession.Owner;

/* renamed from: com.iab.omid.library.taurusx.utils.g */
/* loaded from: classes6.dex */
public class C18658g {
    /* renamed from: a */
    public static void m61871a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m61865b(C18621a c18621a) {
        if (!c18621a.m62021g()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m61864c(C18621a c18621a) {
        if (!c18621a.m62018j()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    /* renamed from: d */
    private static void m61863d(C18621a c18621a) {
        if (c18621a.m62018j()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: e */
    public static void m61862e(C18621a c18621a) {
        if (c18621a.m62020h()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: f */
    public static void m61861f(C18621a c18621a) {
        if (c18621a.m62019i()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: g */
    public static void m61860g(C18621a c18621a) {
        if (c18621a.getAdSessionStatePublisher().m61916c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: h */
    public static void m61859h(C18621a c18621a) {
        if (c18621a.getAdSessionStatePublisher().m61915d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: a */
    public static void m61870a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
        if (owner == Owner.NONE) {
            throw new IllegalArgumentException("Impression owner is none");
        }
        if (creativeType == CreativeType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
        if (impressionType == ImpressionType.DEFINED_BY_JAVASCRIPT && owner == Owner.NATIVE) {
            throw new IllegalArgumentException("ImpressionType/CreativeType can only be defined as DEFINED_BY_JAVASCRIPT if Impression Owner is JavaScript");
        }
    }

    /* renamed from: a */
    public static void m61869a(C18621a c18621a) {
        m61863d(c18621a);
        m61865b(c18621a);
    }

    /* renamed from: a */
    public static void m61868a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m61867a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m61866a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
