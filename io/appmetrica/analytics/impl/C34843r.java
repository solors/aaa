package io.appmetrica.analytics.impl;

import android.app.Activity;
import java.util.WeakHashMap;

/* renamed from: io.appmetrica.analytics.impl.r */
/* loaded from: classes9.dex */
public final class C34843r {

    /* renamed from: a */
    public final WeakHashMap f95246a = new WeakHashMap();

    /* renamed from: a */
    public final boolean m21065a(Activity activity, EnumC34817q enumC34817q) {
        if (activity != null && this.f95246a.get(activity) == enumC34817q) {
            return false;
        }
        if (activity != null) {
            this.f95246a.put(activity, enumC34817q);
            return true;
        }
        return true;
    }
}
