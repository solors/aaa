package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.ak */
/* loaded from: classes9.dex */
public final class C34406ak {

    /* renamed from: d */
    public static final String f93976d = "SESSION_SLEEP_START";

    /* renamed from: e */
    public static final String f93977e = "SESSION_LAST_EVENT_OFFSET";

    /* renamed from: f */
    public static final String f93978f = "SESSION_ID";

    /* renamed from: g */
    public static final String f93979g = "SESSION_COUNTER_ID";

    /* renamed from: h */
    public static final String f93980h = "SESSION_INIT_TIME";

    /* renamed from: i */
    public static final String f93981i = "SESSION_IS_ALIVE_REPORT_NEEDED";

    /* renamed from: a */
    public final String f93982a;
    @NonNull

    /* renamed from: b */
    protected final C34778oe f93983b;

    /* renamed from: c */
    public C34424bb f93984c;

    public C34406ak(@NonNull C34778oe c34778oe, @NonNull String str) {
        this.f93983b = c34778oe;
        this.f93982a = str;
        C34424bb c34424bb = new C34424bb();
        try {
            String m21195h = c34778oe.m21195h(str);
            if (!TextUtils.isEmpty(m21195h)) {
                c34424bb = new C34424bb(m21195h);
            }
        } catch (Throwable unused) {
        }
        this.f93984c = c34424bb;
    }

    /* renamed from: a */
    public final C34406ak m21987a(long j) {
        m21986a(f93980h, Long.valueOf(j));
        return this;
    }

    /* renamed from: b */
    public final C34406ak m21983b(long j) {
        m21986a(f93977e, Long.valueOf(j));
        return this;
    }

    @Nullable
    /* renamed from: c */
    public final Long m21982c() {
        return this.f93984c.m21935a(f93980h);
    }

    /* renamed from: d */
    public final C34406ak m21979d(long j) {
        m21986a(f93978f, Long.valueOf(j));
        return this;
    }

    @Nullable
    /* renamed from: e */
    public final Long m21978e() {
        return this.f93984c.m21935a(f93979g);
    }

    @Nullable
    /* renamed from: f */
    public final Long m21976f() {
        return this.f93984c.m21935a(f93978f);
    }

    @Nullable
    /* renamed from: g */
    public final Long m21975g() {
        return this.f93984c.m21935a(f93976d);
    }

    /* renamed from: h */
    public final boolean m21974h() {
        if (this.f93984c.length() > 0) {
            return true;
        }
        return false;
    }

    @Nullable
    /* renamed from: i */
    public final Boolean m21973i() {
        C34424bb c34424bb = this.f93984c;
        c34424bb.getClass();
        try {
            return Boolean.valueOf(c34424bb.getBoolean(f93981i));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final C34406ak m21985a(boolean z) {
        m21986a(f93981i, Boolean.valueOf(z));
        return this;
    }

    /* renamed from: b */
    public final void m21984b() {
        this.f93983b.m21199e(this.f93982a, this.f93984c.toString());
        this.f93983b.m21149b();
    }

    /* renamed from: c */
    public final C34406ak m21981c(long j) {
        m21986a(f93979g, Long.valueOf(j));
        return this;
    }

    @Nullable
    /* renamed from: d */
    public final Long m21980d() {
        return this.f93984c.m21935a(f93977e);
    }

    /* renamed from: e */
    public final C34406ak m21977e(long j) {
        m21986a(f93976d, Long.valueOf(j));
        return this;
    }

    /* renamed from: a */
    public final void m21986a(String str, Object obj) {
        try {
            this.f93984c.put(str, obj);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void m21988a() {
        this.f93984c = new C34424bb();
        m21984b();
    }
}
