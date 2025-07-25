package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.data.IBinaryDataHelper;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.Tj */
/* loaded from: classes9.dex */
public final class C34237Tj {

    /* renamed from: a */
    public final String f93541a;

    /* renamed from: b */
    public final C34118Oj f93542b;

    /* renamed from: c */
    public final C34213Sj f93543c;

    /* renamed from: d */
    public final IBinaryDataHelper f93544d;

    public C34237Tj(Context context, C34391a5 c34391a5) {
        c34391a5.m22022a();
        this.f93541a = "session_extras";
        this.f93542b = new C34118Oj();
        this.f93543c = new C34213Sj();
        this.f93544d = C34393a7.m22013a(context).m22012a(c34391a5);
    }

    /* renamed from: a */
    public final Map m22223a() {
        boolean z;
        try {
            byte[] bArr = this.f93544d.get(this.f93541a);
            if (bArr != null) {
                if (bArr.length == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return this.f93542b.toModel(this.f93543c.toState(bArr));
                }
            }
        } catch (Throwable unused) {
        }
        C34118Oj c34118Oj = this.f93542b;
        this.f93543c.getClass();
        return c34118Oj.toModel(new C34166Qj());
    }
}
