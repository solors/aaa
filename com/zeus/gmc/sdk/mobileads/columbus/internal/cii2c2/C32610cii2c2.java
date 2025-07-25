package com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2;

import android.text.TextUtils;
import com.iab.omid.library.xiaomi.adsession.CreativeType;
import com.iab.omid.library.xiaomi.adsession.ImpressionType;
import com.iab.omid.library.xiaomi.adsession.Owner;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coi222o222.C32707coiic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.coo2iico.C32732coo2iico;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.cii2c2.cii2c2 */
/* loaded from: classes8.dex */
public class C32610cii2c2 {
    public static void c2oc2i(C32707coiic c32707coiic) {
        if (!c32707coiic.c22o22co22i()) {
            return;
        }
        throw new IllegalStateException("AdSession is started");
    }

    public static void c2oc2o(C32707coiic c32707coiic) {
        if (c32707coiic.coiio2()) {
            return;
        }
        throw new IllegalStateException("Impression event is not expected from the Native AdSession");
    }

    public static void cco22(C32707coiic c32707coiic) {
        if (c32707coiic.c2oicci2()) {
            return;
        }
        throw new IllegalStateException("Cannot create MediaEvents for JavaScript AdSession");
    }

    public static void cii2c2(C32707coiic c32707coiic) {
        if (c32707coiic.c2oc2i().c2oc2i() == null) {
            return;
        }
        throw new IllegalStateException("AdEvents already exists for AdSession");
    }

    public static void ciii2coi2(C32707coiic c32707coiic) {
        if (c32707coiic.c2oc2i().cioccoiococ() == null) {
            return;
        }
        throw new IllegalStateException("MediaEvents already exists for AdSession");
    }

    private static void cioccoiococ(C32707coiic c32707coiic) {
        if (c32707coiic.c22o22co22i()) {
            return;
        }
        throw new IllegalStateException("AdSession is not started");
    }

    public static void coi222o222(C32707coiic c32707coiic) {
        if (!c32707coiic.ccoc2oic()) {
            return;
        }
        throw new IllegalStateException("AdSession is finished");
    }

    public static void coo2iico() {
        if (!C32732coo2iico.coi222o222()) {
            throw new IllegalStateException("Method called before OM SDK activation");
        }
    }

    public static void coo2iico(Owner owner, CreativeType creativeType, ImpressionType impressionType) {
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

    public static void coo2iico(C32707coiic c32707coiic) {
        cioccoiococ(c32707coiic);
        coi222o222(c32707coiic);
    }

    public static void coo2iico(Object obj, String str) {
        if (obj == null) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void coo2iico(String str, int i, String str2) {
        if (str.length() > i) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void coo2iico(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException(str2);
        }
    }
}
