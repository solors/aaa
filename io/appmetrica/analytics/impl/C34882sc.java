package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;

/* renamed from: io.appmetrica.analytics.impl.sc */
/* loaded from: classes9.dex */
public final class C34882sc {

    /* renamed from: c */
    public static final SparseArray f95327c;

    /* renamed from: a */
    public final String f95328a;

    /* renamed from: b */
    public final String f95329b;

    static {
        SparseArray sparseArray = new SparseArray();
        f95327c = sparseArray;
        EnumC34324Xa enumC34324Xa = EnumC34324Xa.EVENT_TYPE_UNDEFINED;
        sparseArray.put(5891, new C34882sc("jvm", "binder"));
        sparseArray.put(5890, new C34882sc("jvm", SDKConstants.PARAM_INTENT));
        sparseArray.put(5889, new C34882sc("jvm", "file"));
        sparseArray.put(5897, new C34882sc("jni_native", "file"));
        sparseArray.put(5898, new C34882sc("jni_native", "file"));
    }

    public C34882sc(String str, String str2) {
        this.f95328a = str;
        this.f95329b = str2;
    }
}
