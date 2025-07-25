package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31983zg;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.gn */
/* loaded from: classes8.dex */
final class C30405gn extends AbstractC30628jj {
    @Nullable

    /* renamed from: i */
    private int[] f79705i;
    @Nullable

    /* renamed from: j */
    private int[] f79706j;

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final void mo26237a(ByteBuffer byteBuffer) {
        int[] iArr = this.f79706j;
        iArr.getClass();
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m32907a = m32907a(((limit - position) / this.f80926b.f88855d) * this.f80927c.f88855d);
        while (position < limit) {
            for (int i : iArr) {
                m32907a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f80926b.f88855d;
        }
        byteBuffer.position(limit);
        m32907a.flip();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: b */
    public final InterfaceC31983zg.C31984a mo29000b(InterfaceC31983zg.C31984a c31984a) throws InterfaceC31983zg.C31985b {
        boolean z;
        boolean z2;
        int[] iArr = this.f79705i;
        if (iArr == null) {
            return InterfaceC31983zg.C31984a.f88851e;
        }
        if (c31984a.f88854c == 2) {
            if (c31984a.f88853b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < c31984a.f88853b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new InterfaceC31983zg.C31985b(c31984a);
                }
            }
            if (z) {
                return new InterfaceC31983zg.C31984a(c31984a.f88852a, iArr.length, 2);
            }
            return InterfaceC31983zg.C31984a.f88851e;
        }
        throw new InterfaceC31983zg.C31985b(c31984a);
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: f */
    protected final void mo28999f() {
        this.f79706j = this.f79705i;
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: h */
    protected final void mo28997h() {
        this.f79706j = null;
        this.f79705i = null;
    }

    /* renamed from: a */
    public final void m33809a(@Nullable int[] iArr) {
        this.f79705i = iArr;
    }
}
