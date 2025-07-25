package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;

/* renamed from: io.appmetrica.analytics.impl.bm */
/* loaded from: classes9.dex */
public final class C34435bm extends AbstractC33959I4 {

    /* renamed from: g */
    public final InterfaceC34025Km f94045g;

    public C34435bm(@NonNull String str, @NonNull String str2, @NonNull InterfaceC34025Km interfaceC34025Km, @NonNull InterfaceC34867rn interfaceC34867rn, @NonNull AbstractC34196S2 abstractC34196S2) {
        super(0, str, str2, interfaceC34867rn, abstractC34196S2);
        this.f94045g = interfaceC34025Km;
    }

    @Override // io.appmetrica.analytics.impl.AbstractC33959I4
    /* renamed from: a */
    public final void mo21176a(@NonNull C34517en c34517en) {
        byte[] bytes;
        String str = (String) this.f94045g.mo21063a((String) this.f93008f);
        C34571gn c34571gn = c34517en.f94289d;
        if (str == null) {
            bytes = new byte[0];
        } else {
            bytes = str.getBytes();
        }
        c34571gn.f94478a = bytes;
    }

    @VisibleForTesting
    /* renamed from: h */
    public final InterfaceC34025Km m21923h() {
        return this.f94045g;
    }
}
