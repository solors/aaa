package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.coreutils.internal.p726io.FileUtils;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.K1 */
/* loaded from: classes9.dex */
public final class C34004K1 {

    /* renamed from: a */
    public final C34347Y9 f93095a;

    /* renamed from: b */
    public boolean f93096b;

    public C34004K1() {
        this(new C34347Y9());
    }

    /* renamed from: a */
    public final synchronized long m22505a(Context context) {
        long j;
        String m22569a;
        try {
            this.f93095a.getClass();
            m22569a = AbstractC33941Ha.m22569a(FileUtils.getFileFromAppStorage(context, "metrica_service_settings.dat"));
        } catch (Throwable unused) {
        }
        if (!TextUtils.isEmpty(m22569a)) {
            j = new JSONObject(m22569a).optLong("delay");
        }
        j = 0;
        return j;
    }

    /* renamed from: b */
    public final void m22504b(Context context) {
        synchronized (this) {
        }
        if (!this.f93096b) {
            long m22505a = m22505a(context);
            if (m22505a > 0) {
                try {
                    Thread.sleep(m22505a);
                } catch (Throwable unused) {
                }
            }
            this.f93096b = true;
        }
    }

    public C34004K1(C34347Y9 c34347y9) {
        this.f93096b = false;
        this.f93095a = c34347y9;
    }
}
