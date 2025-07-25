package com.iab.omid.library.mobilefuse.utils;

import android.text.TextUtils;
import com.iab.omid.library.mobilefuse.Omid;
import com.iab.omid.library.mobilefuse.adsession.C18356a;
import com.iab.omid.library.mobilefuse.adsession.CreativeType;
import com.iab.omid.library.mobilefuse.adsession.ImpressionType;
import com.iab.omid.library.mobilefuse.adsession.Owner;

/* renamed from: com.iab.omid.library.mobilefuse.utils.g */
/* loaded from: classes6.dex */
public class C18396g {
    /* renamed from: a */
    public static void m62870a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m62864b(C18356a c18356a) {
        if (!c18356a.m63036g()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m62863c(C18356a c18356a) {
        if (!c18356a.m63033j()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    /* renamed from: d */
    private static void m62862d(C18356a c18356a) {
        if (c18356a.m63033j()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: e */
    public static void m62861e(C18356a c18356a) {
        if (c18356a.m63035h()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: f */
    public static void m62860f(C18356a c18356a) {
        if (c18356a.m63034i()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: g */
    public static void m62859g(C18356a c18356a) {
        if (c18356a.getAdSessionStatePublisher().m62917c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: h */
    public static void m62858h(C18356a c18356a) {
        if (c18356a.getAdSessionStatePublisher().m62916d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: a */
    public static void m62869a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m62868a(C18356a c18356a) {
        m62862d(c18356a);
        m62864b(c18356a);
    }

    /* renamed from: a */
    public static void m62867a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m62866a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m62865a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
