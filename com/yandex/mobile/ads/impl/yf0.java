package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.monetization.ads.exo.metadata.Metadata;
import com.yandex.mobile.ads.impl.xf0;
import java.io.EOFException;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class yf0 {

    /* renamed from: a */
    private final cc1 f88188a = new cc1(10);

    @Nullable
    /* renamed from: a */
    public final Metadata m26934a(C30513hy c30513hy, @Nullable xf0.InterfaceC31817a interfaceC31817a) throws IOException {
        Metadata metadata = null;
        int i = 0;
        while (true) {
            try {
                c30513hy.mo27615b(this.f88188a.m35291c(), 0, 10, false);
                this.f88188a.m35286e(0);
                if (this.f88188a.m35267w() != 4801587) {
                    break;
                }
                this.f88188a.m35284f(3);
                int m35271s = this.f88188a.m35271s();
                int i2 = m35271s + 10;
                if (metadata == null) {
                    byte[] bArr = new byte[i2];
                    System.arraycopy(this.f88188a.m35291c(), 0, bArr, 0, 10);
                    c30513hy.mo27615b(bArr, 10, m35271s, false);
                    metadata = new xf0(interfaceC31817a).m27533a(i2, bArr);
                } else {
                    c30513hy.m33444a(false, m35271s);
                }
                i += i2;
            } catch (EOFException unused) {
            }
        }
        c30513hy.mo27614c();
        c30513hy.m33444a(false, i);
        return metadata;
    }
}
