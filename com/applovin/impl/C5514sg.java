package com.applovin.impl;

import com.applovin.impl.AbstractC4474gl;
import com.applovin.impl.C4310e9;
import java.util.Arrays;

/* renamed from: com.applovin.impl.sg */
/* loaded from: classes2.dex */
final class C5514sg extends AbstractC4474gl {

    /* renamed from: o */
    private static final byte[] f10350o = {79, 112, 117, 115, 72, 101, 97, 100};

    /* renamed from: n */
    private boolean f10351n;

    /* renamed from: a */
    private long m94617a(byte[] bArr) {
        int i;
        int i2;
        byte b = bArr[0];
        int i3 = b & 255;
        int i4 = b & 3;
        if (i4 != 0) {
            i = 2;
            if (i4 != 1 && i4 != 2) {
                i = bArr[1] & 63;
            }
        } else {
            i = 1;
        }
        int i5 = i3 >> 3;
        return i * (i5 >= 16 ? 2500 << i2 : i5 >= 12 ? 10000 << (i5 & 1) : (i5 & 3) == 3 ? 60000 : 10000 << i2);
    }

    /* renamed from: b */
    public static boolean m94616b(C4066ah c4066ah) {
        int m100797a = c4066ah.m100797a();
        byte[] bArr = f10350o;
        if (m100797a < bArr.length) {
            return false;
        }
        byte[] bArr2 = new byte[bArr.length];
        c4066ah.m100790a(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    @Override // com.applovin.impl.AbstractC4474gl
    /* renamed from: a */
    protected long mo93214a(C4066ah c4066ah) {
        return m98921b(m94617a(c4066ah.m100787c()));
    }

    @Override // com.applovin.impl.AbstractC4474gl
    /* renamed from: a */
    protected boolean mo93213a(C4066ah c4066ah, long j, AbstractC4474gl.C4476b c4476b) {
        if (!this.f10351n) {
            byte[] copyOf = Arrays.copyOf(c4066ah.m100787c(), c4066ah.m100783e());
            c4476b.f6441a = new C4310e9.C4312b().m99606f("audio/opus").m99617c(AbstractC5562tg.m94445b(copyOf)).m99591n(48000).m99623a(AbstractC5562tg.m94447a(copyOf)).m99632a();
            this.f10351n = true;
            return true;
        }
        AbstractC4100b1.m100583a(c4476b.f6441a);
        boolean z = c4066ah.m100775j() == 1332770163;
        c4066ah.m100780f(0);
        return z;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.applovin.impl.AbstractC4474gl
    /* renamed from: a */
    public void mo93212a(boolean z) {
        super.mo93212a(z);
        if (z) {
            this.f10351n = false;
        }
    }
}
