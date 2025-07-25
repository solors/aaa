package io.appmetrica.analytics.impl;

import android.content.Context;
import java.util.HashMap;

/* renamed from: io.appmetrica.analytics.impl.X9 */
/* loaded from: classes9.dex */
public final class C34323X9 {

    /* renamed from: c */
    public static volatile C34323X9 f93723c;

    /* renamed from: a */
    public final Context f93724a;

    /* renamed from: b */
    public final HashMap f93725b = new HashMap();

    public C34323X9(Context context) {
        this.f93724a = context;
    }

    /* renamed from: a */
    public static C34323X9 m22105a(Context context) {
        if (f93723c == null) {
            synchronized (C34323X9.class) {
                if (f93723c == null) {
                    f93723c = new C34323X9(context);
                }
            }
        }
        return f93723c;
    }

    /* renamed from: a */
    public final C34931u9 m22104a(String str) {
        if (!this.f93725b.containsKey(str)) {
            synchronized (this) {
                if (!this.f93725b.containsKey(str)) {
                    this.f93725b.put(str, new C34931u9(this.f93724a, str));
                }
            }
        }
        return (C34931u9) this.f93725b.get(str);
    }
}
