package com.chartboost.sdk.impl;

import android.content.SharedPreferences;
import com.chartboost.sdk.impl.AbstractC10232u;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.t9 */
/* loaded from: classes3.dex */
public final class C10221t9 {

    /* renamed from: a */
    public final SharedPreferences f23172a;

    /* renamed from: b */
    public String f23173b;

    /* renamed from: c */
    public long f23174c;

    /* renamed from: d */
    public int f23175d;

    /* renamed from: e */
    public int f23176e;

    /* renamed from: f */
    public int f23177f;

    /* renamed from: g */
    public int f23178g;

    public C10221t9(SharedPreferences mPrefs) {
        Intrinsics.checkNotNullParameter(mPrefs, "mPrefs");
        this.f23172a = mPrefs;
        this.f23175d = m80520f();
    }

    /* renamed from: a */
    public final void m80527a() {
        this.f23173b = m80525b();
        this.f23174c = System.currentTimeMillis();
        this.f23176e = 0;
        this.f23177f = 0;
        this.f23178g = 0;
        this.f23175d++;
        m80519g();
    }

    /* renamed from: b */
    public final int m80524b(AbstractC10232u abstractC10232u) {
        if (Intrinsics.m17075f(abstractC10232u, AbstractC10232u.C10234b.f23214g)) {
            return this.f23176e;
        }
        if (Intrinsics.m17075f(abstractC10232u, AbstractC10232u.C10235c.f23215g)) {
            return this.f23177f;
        }
        if (Intrinsics.m17075f(abstractC10232u, AbstractC10232u.C10233a.f23213g)) {
            return this.f23178g;
        }
        return 0;
    }

    /* renamed from: c */
    public final int m80523c() {
        return this.f23175d;
    }

    /* renamed from: d */
    public final long m80522d() {
        return System.currentTimeMillis() - this.f23174c;
    }

    /* renamed from: e */
    public final String m80521e() {
        return this.f23173b;
    }

    /* renamed from: f */
    public final int m80520f() {
        return this.f23172a.getInt("session_key", 0);
    }

    /* renamed from: g */
    public final void m80519g() {
        SharedPreferences.Editor putInt;
        SharedPreferences.Editor edit = this.f23172a.edit();
        if (edit != null && (putInt = edit.putInt("session_key", this.f23175d)) != null) {
            putInt.apply();
        }
    }

    /* renamed from: h */
    public final C10266u9 m80518h() {
        return new C10266u9(this.f23173b, m80522d(), this.f23175d, m80524b(AbstractC10232u.C10233a.f23213g), m80524b(AbstractC10232u.C10235c.f23215g), m80524b(AbstractC10232u.C10234b.f23214g));
    }

    /* renamed from: b */
    public final String m80525b() {
        String uuid = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
        return C10180s1.m80638a(uuid);
    }

    /* renamed from: a */
    public final void m80526a(AbstractC10232u type) {
        Intrinsics.checkNotNullParameter(type, "type");
        if (Intrinsics.m17075f(type, AbstractC10232u.C10234b.f23214g)) {
            this.f23176e++;
        } else if (Intrinsics.m17075f(type, AbstractC10232u.C10235c.f23215g)) {
            this.f23177f++;
        } else if (Intrinsics.m17075f(type, AbstractC10232u.C10233a.f23213g)) {
            this.f23178g++;
        }
    }
}
