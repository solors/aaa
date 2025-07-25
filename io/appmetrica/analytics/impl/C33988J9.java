package io.appmetrica.analytics.impl;

import android.util.Base64;

/* renamed from: io.appmetrica.analytics.impl.J9 */
/* loaded from: classes9.dex */
public final class C33988J9 implements InterfaceC33839D8 {
    @Override // io.appmetrica.analytics.impl.InterfaceC33839D8
    /* renamed from: a */
    public final C35008x8 mo21958a(C34247U5 c34247u5) {
        throw new UnsupportedOperationException();
    }

    @Override // io.appmetrica.analytics.impl.InterfaceC33839D8
    /* renamed from: a */
    public final byte[] mo21957a(byte[] bArr) {
        try {
            return Base64.decode(bArr, 0);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: a */
    public final EnumC33889F8 m22519a() {
        return EnumC33889F8.EXTERNALLY_ENCRYPTED_EVENT_CRYPTER;
    }
}
