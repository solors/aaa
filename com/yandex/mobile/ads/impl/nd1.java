package com.yandex.mobile.ads.impl;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC30672ju;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class nd1 implements InterfaceC30672ju {

    /* renamed from: a */
    public static final nd1 f82701a = new nd1();

    static {
        new InterfaceC30672ju.InterfaceC30673a() { // from class: com.yandex.mobile.ads.impl.ft2
            @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju.InterfaceC30673a
            /* renamed from: a */
            public final InterfaceC30672ju mo28285a() {
                return nd1.m31595e();
            }
        };
    }

    private nd1() {
    }

    /* renamed from: e */
    public static /* synthetic */ nd1 m31595e() {
        return new nd1();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final void mo28290a(y12 y12Var) {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    @Nullable
    public final Uri getUri() {
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30417gu
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    /* renamed from: a */
    public final long mo27541a(C30976nu c30976nu) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC30672ju
    public final void close() {
    }
}
