package io.appmetrica.analytics.impl;

import android.content.Context;

/* renamed from: io.appmetrica.analytics.impl.a */
/* loaded from: classes9.dex */
public final class C34385a {

    /* renamed from: a */
    public final Context f93900a;

    public C34385a(Context context) {
        this.f93900a = context;
    }

    /* renamed from: a */
    public final byte[] m22027a() {
        try {
            return AbstractC35044yi.m20736a(new StringBuilder(this.f93900a.getPackageName()).reverse().toString());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }

    /* renamed from: b */
    public final byte[] m22026b() {
        try {
            return AbstractC35044yi.m20736a(this.f93900a.getPackageName());
        } catch (Throwable unused) {
            return new byte[16];
        }
    }
}
