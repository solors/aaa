package com.p551my.target;

import android.view.View;
import com.p551my.target.nativeads.INativeAd;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: com.my.target.r6 */
/* loaded from: classes7.dex */
public abstract class AbstractC26059r6 {

    /* renamed from: a */
    public static final WeakHashMap f67759a = new WeakHashMap();

    /* renamed from: a */
    public static void m43064a(View view, INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        m43063a(iNativeAd);
        WeakHashMap weakHashMap = f67759a;
        WeakReference weakReference = (WeakReference) weakHashMap.get(view);
        if (weakReference != null && (iNativeAd2 = (INativeAd) weakReference.get()) != null) {
            iNativeAd2.unregisterView();
        }
        weakHashMap.put(view, new WeakReference(iNativeAd));
    }

    /* renamed from: a */
    public static void m43063a(INativeAd iNativeAd) {
        INativeAd iNativeAd2;
        for (Map.Entry entry : f67759a.entrySet()) {
            View view = (View) entry.getKey();
            WeakReference weakReference = (WeakReference) entry.getValue();
            if (weakReference != null && ((iNativeAd2 = (INativeAd) weakReference.get()) == null || iNativeAd2 == iNativeAd)) {
                f67759a.remove(view);
                return;
            }
        }
    }
}
