package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.x02;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class j20 implements x02 {

    /* renamed from: a */
    private final byte[] f80707a = new byte[4096];

    @Override // com.yandex.mobile.ads.impl.x02
    /* renamed from: a */
    public final void mo26069a(long j, int i, int i2, int i3, @Nullable x02.C31785a c31785a) {
    }

    @Override // com.yandex.mobile.ads.impl.x02
    /* renamed from: b */
    public final void mo26056b(int i, cc1 cc1Var) {
        cc1Var.m35284f(i);
    }

    @Override // com.yandex.mobile.ads.impl.x02
    /* renamed from: a */
    public final void mo26064a(v90 v90Var) {
    }

    @Override // com.yandex.mobile.ads.impl.x02
    /* renamed from: a */
    public final int mo26065a(InterfaceC30417gu interfaceC30417gu, int i, boolean z) throws IOException {
        int read = interfaceC30417gu.read(this.f80707a, 0, Math.min(this.f80707a.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }
}
