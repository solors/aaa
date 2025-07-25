package com.applovin.impl;

import com.applovin.impl.InterfaceC5099p1;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.d3 */
/* loaded from: classes2.dex */
final class C4224d3 extends AbstractC5942z1 {

    /* renamed from: i */
    private int[] f5448i;

    /* renamed from: j */
    private int[] f5449j;

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: a */
    public void mo92336a(ByteBuffer byteBuffer) {
        int[] iArr = (int[]) AbstractC4100b1.m100583a(this.f5449j);
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        ByteBuffer m92598a = m92598a(((limit - position) / this.f12408b.f8977d) * this.f12409c.f8977d);
        while (position < limit) {
            for (int i : iArr) {
                m92598a.putShort(byteBuffer.getShort((i * 2) + position));
            }
            position += this.f12408b.f8977d;
        }
        byteBuffer.position(limit);
        m92598a.flip();
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: b */
    public InterfaceC5099p1.C5100a mo92335b(InterfaceC5099p1.C5100a c5100a) {
        boolean z;
        boolean z2;
        int[] iArr = this.f5448i;
        if (iArr == null) {
            return InterfaceC5099p1.C5100a.f8973e;
        }
        if (c5100a.f8976c == 2) {
            if (c5100a.f8975b != iArr.length) {
                z = true;
            } else {
                z = false;
            }
            for (int i = 0; i < iArr.length; i++) {
                int i2 = iArr[i];
                if (i2 < c5100a.f8975b) {
                    if (i2 != i) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    z |= z2;
                } else {
                    throw new InterfaceC5099p1.C5101b(c5100a);
                }
            }
            if (z) {
                return new InterfaceC5099p1.C5100a(c5100a.f8974a, iArr.length, 2);
            }
            return InterfaceC5099p1.C5100a.f8973e;
        }
        throw new InterfaceC5099p1.C5101b(c5100a);
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: g */
    protected void mo92332g() {
        this.f5449j = this.f5448i;
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: i */
    protected void mo92330i() {
        this.f5449j = null;
        this.f5448i = null;
    }

    /* renamed from: a */
    public void m100025a(int[] iArr) {
        this.f5448i = iArr;
    }
}
