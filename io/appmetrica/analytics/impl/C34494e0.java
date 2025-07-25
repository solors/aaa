package io.appmetrica.analytics.impl;

import android.util.Pair;

/* renamed from: io.appmetrica.analytics.impl.e0 */
/* loaded from: classes9.dex */
public final class C34494e0 {

    /* renamed from: a */
    public C34856rc f94228a;

    /* renamed from: b */
    public long f94229b;

    /* renamed from: c */
    public boolean f94230c;

    /* renamed from: d */
    public final C34968vk f94231d;

    public C34494e0(String str, long j, C34968vk c34968vk) {
        this.f94229b = j;
        try {
            this.f94228a = new C34856rc(str);
        } catch (Throwable unused) {
            this.f94228a = new C34856rc();
        }
        this.f94231d = c34968vk;
    }

    /* renamed from: a */
    public final synchronized void m21810a(Pair pair) {
        if (this.f94231d.m20863b(this.f94228a, (String) pair.first, (String) pair.second)) {
            this.f94230c = true;
        }
    }

    public final synchronized String toString() {
        return "Map size " + this.f94228a.size() + ". Is changed " + this.f94230c + ". Current revision " + this.f94229b;
    }

    /* renamed from: a */
    public final synchronized C34467d0 m21811a() {
        if (this.f94230c) {
            this.f94229b++;
            this.f94230c = false;
        }
        return new C34467d0(AbstractC34451cb.m21877b(this.f94228a), this.f94229b);
    }
}
