package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.ad */
/* loaded from: classes9.dex */
public abstract class AbstractC34399ad {

    /* renamed from: a */
    public static C34931u9 f93965a;

    /* renamed from: a */
    public static final synchronized C34931u9 m21996a(Context context) {
        C34931u9 c34931u9;
        synchronized (AbstractC34399ad.class) {
            c34931u9 = f93965a;
            if (c34931u9 == null) {
                c34931u9 = new C34931u9(context, "uuid.dat");
                f93965a = c34931u9;
            }
        }
        return c34931u9;
    }
}
