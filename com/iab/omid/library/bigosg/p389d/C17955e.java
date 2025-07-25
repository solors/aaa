package com.iab.omid.library.bigosg.p389d;

import android.text.TextUtils;
import com.iab.omid.library.bigosg.Omid;
import com.iab.omid.library.bigosg.adsession.C17933a;
import com.iab.omid.library.bigosg.adsession.CreativeType;
import com.iab.omid.library.bigosg.adsession.ImpressionType;
import com.iab.omid.library.bigosg.adsession.Owner;

/* renamed from: com.iab.omid.library.bigosg.d.e */
/* loaded from: classes6.dex */
public class C17955e {
    /* renamed from: a */
    public static void m64573a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m64567b(C17933a c17933a) {
        if (!c17933a.m64672g()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m64566c(C17933a c17933a) {
        m64561h(c17933a);
        m64567b(c17933a);
    }

    /* renamed from: d */
    public static void m64565d(C17933a c17933a) {
        if (c17933a.getAdSessionStatePublisher().m64542c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: e */
    public static void m64564e(C17933a c17933a) {
        if (c17933a.getAdSessionStatePublisher().m64541d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: f */
    public static void m64563f(C17933a c17933a) {
        if (c17933a.m64671h()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: g */
    public static void m64562g(C17933a c17933a) {
        if (c17933a.m64670i()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: h */
    private static void m64561h(C17933a c17933a) {
        if (c17933a.m64673f()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: a */
    public static void m64572a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m64571a(C17933a c17933a) {
        if (c17933a.m64673f()) {
            throw new IllegalStateException("AdSession is started");
        }
    }

    /* renamed from: a */
    public static void m64570a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m64569a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m64568a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
