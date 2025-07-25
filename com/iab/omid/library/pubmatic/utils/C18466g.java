package com.iab.omid.library.pubmatic.utils;

import android.text.TextUtils;
import com.iab.omid.library.pubmatic.Omid;
import com.iab.omid.library.pubmatic.adsession.C18426a;
import com.iab.omid.library.pubmatic.adsession.CreativeType;
import com.iab.omid.library.pubmatic.adsession.ImpressionType;
import com.iab.omid.library.pubmatic.adsession.Owner;

/* renamed from: com.iab.omid.library.pubmatic.utils.g */
/* loaded from: classes6.dex */
public class C18466g {
    /* renamed from: a */
    public static void m62617a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m62611b(C18426a c18426a) {
        if (!c18426a.m62783g()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m62610c(C18426a c18426a) {
        if (!c18426a.m62780j()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    /* renamed from: d */
    private static void m62609d(C18426a c18426a) {
        if (c18426a.m62780j()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: e */
    public static void m62608e(C18426a c18426a) {
        if (c18426a.m62782h()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: f */
    public static void m62607f(C18426a c18426a) {
        if (c18426a.m62781i()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: g */
    public static void m62606g(C18426a c18426a) {
        if (c18426a.getAdSessionStatePublisher().m62664c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: h */
    public static void m62605h(C18426a c18426a) {
        if (c18426a.getAdSessionStatePublisher().m62663d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: a */
    public static void m62616a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m62615a(C18426a c18426a) {
        m62609d(c18426a);
        m62611b(c18426a);
    }

    /* renamed from: a */
    public static void m62614a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m62613a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m62612a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
