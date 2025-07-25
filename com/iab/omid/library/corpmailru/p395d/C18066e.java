package com.iab.omid.library.corpmailru.p395d;

import android.text.TextUtils;
import com.iab.omid.library.corpmailru.Omid;
import com.iab.omid.library.corpmailru.adsession.C18045a;
import com.iab.omid.library.corpmailru.adsession.CreativeType;
import com.iab.omid.library.corpmailru.adsession.ImpressionType;
import com.iab.omid.library.corpmailru.adsession.Owner;

/* renamed from: com.iab.omid.library.corpmailru.d.e */
/* loaded from: classes6.dex */
public class C18066e {
    /* renamed from: a */
    public static void m64123a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m64117b(C18045a c18045a) {
        if (!c18045a.m64217g()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m64116c(C18045a c18045a) {
        m64111h(c18045a);
        m64117b(c18045a);
    }

    /* renamed from: d */
    public static void m64115d(C18045a c18045a) {
        if (c18045a.getAdSessionStatePublisher().m64092c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: e */
    public static void m64114e(C18045a c18045a) {
        if (c18045a.getAdSessionStatePublisher().m64091d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: f */
    public static void m64113f(C18045a c18045a) {
        if (c18045a.m64216h()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: g */
    public static void m64112g(C18045a c18045a) {
        if (c18045a.m64215i()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: h */
    private static void m64111h(C18045a c18045a) {
        if (c18045a.m64218f()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: a */
    public static void m64122a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m64121a(C18045a c18045a) {
        if (c18045a.m64218f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m64120a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m64119a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m64118a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
