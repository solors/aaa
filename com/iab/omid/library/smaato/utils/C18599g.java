package com.iab.omid.library.smaato.utils;

import android.text.TextUtils;
import com.iab.omid.library.smaato.Omid;
import com.iab.omid.library.smaato.adsession.C18559a;
import com.iab.omid.library.smaato.adsession.CreativeType;
import com.iab.omid.library.smaato.adsession.ImpressionType;
import com.iab.omid.library.smaato.adsession.Owner;

/* renamed from: com.iab.omid.library.smaato.utils.g */
/* loaded from: classes6.dex */
public class C18599g {
    /* renamed from: a */
    public static void m62111a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m62105b(C18559a c18559a) {
        if (!c18559a.m62277g()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m62104c(C18559a c18559a) {
        if (!c18559a.m62274j()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    /* renamed from: d */
    private static void m62103d(C18559a c18559a) {
        if (c18559a.m62274j()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: e */
    public static void m62102e(C18559a c18559a) {
        if (c18559a.m62276h()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: f */
    public static void m62101f(C18559a c18559a) {
        if (c18559a.m62275i()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: g */
    public static void m62100g(C18559a c18559a) {
        if (c18559a.getAdSessionStatePublisher().m62158c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: h */
    public static void m62099h(C18559a c18559a) {
        if (c18559a.getAdSessionStatePublisher().m62157d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: a */
    public static void m62110a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m62109a(C18559a c18559a) {
        m62103d(c18559a);
        m62105b(c18559a);
    }

    /* renamed from: a */
    public static void m62108a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m62107a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m62106a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
