package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* renamed from: io.appmetrica.analytics.impl.lk */
/* loaded from: classes9.dex */
public final class C34703lk implements InterfaceC34867rn {

    /* renamed from: a */
    public final C34844r0 f94871a;

    public C34703lk(@NonNull C34844r0 c34844r0) {
        this.f94871a = c34844r0;
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC34867rn
    /* renamed from: a */
    public final C34814pn mo20778a(@Nullable Void r3) {
        boolean z;
        this.f94871a.getClass();
        synchronized (C34818q0.class) {
            z = C34818q0.f95196f;
        }
        if (z) {
            return new C34814pn(this, true, "");
        }
        return new C34814pn(this, false, "AppMetrica isn't initialized. Use AppMetrica#activate(android.content.Context, String) method to activate.");
    }

    /* renamed from: a */
    public final C34814pn m21411a() {
        return mo20778a((Void) null);
    }
}
