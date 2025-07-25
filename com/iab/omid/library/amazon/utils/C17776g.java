package com.iab.omid.library.amazon.utils;

import android.text.TextUtils;
import com.iab.omid.library.amazon.Omid;
import com.iab.omid.library.amazon.adsession.C17738a;
import com.iab.omid.library.amazon.adsession.CreativeType;
import com.iab.omid.library.amazon.adsession.ImpressionType;
import com.iab.omid.library.amazon.adsession.Owner;

/* renamed from: com.iab.omid.library.amazon.utils.g */
/* loaded from: classes6.dex */
public class C17776g {
    /* renamed from: a */
    public static void m65260a() {
        if (!Omid.isActive()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    /* renamed from: b */
    public static void m65254b(C17738a c17738a) {
        if (!c17738a.m65417g()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    /* renamed from: c */
    public static void m65253c(C17738a c17738a) {
        if (!c17738a.m65414j()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    /* renamed from: d */
    private static void m65252d(C17738a c17738a) {
        if (c17738a.m65414j()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    /* renamed from: e */
    public static void m65251e(C17738a c17738a) {
        if (c17738a.m65416h()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    /* renamed from: f */
    public static void m65250f(C17738a c17738a) {
        if (c17738a.m65415i()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    /* renamed from: g */
    public static void m65249g(C17738a c17738a) {
        if (c17738a.getAdSessionStatePublisher().m65306c() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    /* renamed from: h */
    public static void m65248h(C17738a c17738a) {
        if (c17738a.getAdSessionStatePublisher().m65305d() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    /* renamed from: a */
    public static void m65259a(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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
    public static void m65258a(C17738a c17738a) {
        m65252d(c17738a);
        m65254b(c17738a);
    }

    /* renamed from: a */
    public static void m65257a(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    /* renamed from: a */
    public static void m65256a(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    /* renamed from: a */
    public static void m65255a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
