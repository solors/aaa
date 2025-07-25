package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.lm */
/* loaded from: classes9.dex */
public class C34705lm implements InterfaceC35045yj {

    /* renamed from: a */
    public final InterfaceC33816Ca f94874a;

    /* renamed from: b */
    public final Object f94875b = new Object();

    /* renamed from: c */
    public boolean f94876c = false;

    /* renamed from: d */
    public final InterfaceC34119Ok f94877d;

    public C34705lm(@NonNull InterfaceC33816Ca interfaceC33816Ca, @NonNull InterfaceC34119Ok interfaceC34119Ok) {
        this.f94874a = interfaceC33816Ca;
        this.f94877d = interfaceC34119Ok;
    }

    /* renamed from: b */
    public final void m21404b() {
        synchronized (this.f94875b) {
            if (!this.f94876c) {
                m21401e();
                mo21405a();
            }
        }
    }

    @NonNull
    /* renamed from: c */
    public final InterfaceC33816Ca m21403c() {
        return this.f94874a;
    }

    @NonNull
    @VisibleForTesting
    /* renamed from: d */
    public final InterfaceC34119Ok m21402d() {
        return this.f94877d;
    }

    /* renamed from: e */
    public final void m21401e() {
        synchronized (this.f94875b) {
            if (!this.f94876c) {
                mo21400f();
            }
        }
    }

    /* renamed from: f */
    public void mo21400f() {
        this.f94877d.mo21772a();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final void onCreate() {
        synchronized (this.f94875b) {
            if (this.f94876c) {
                this.f94876c = false;
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC35045yj
    public final void onDestroy() {
        synchronized (this.f94875b) {
            if (!this.f94876c) {
                mo21405a();
                this.f94876c = true;
            }
        }
    }

    /* renamed from: a */
    public void mo21405a() {
    }
}
