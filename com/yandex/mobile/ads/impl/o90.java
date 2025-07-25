package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.InterfaceC31983zg;
import java.nio.ByteBuffer;

/* loaded from: classes8.dex */
final class o90 extends AbstractC30628jj {

    /* renamed from: i */
    private static final int f83370i = Float.floatToIntBits(Float.NaN);

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final void mo26237a(ByteBuffer byteBuffer) {
        ByteBuffer m32907a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f80926b.f88854c;
        if (i2 != 536870912) {
            if (i2 == 805306368) {
                m32907a = m32907a(i);
                while (position < limit) {
                    int floatToIntBits = Float.floatToIntBits((float) (((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24)) * 4.656612875245797E-10d));
                    if (floatToIntBits == f83370i) {
                        floatToIntBits = Float.floatToIntBits(0.0f);
                    }
                    m32907a.putInt(floatToIntBits);
                    position += 4;
                }
            } else {
                throw new IllegalStateException();
            }
        } else {
            m32907a = m32907a((i / 3) * 4);
            while (position < limit) {
                int floatToIntBits2 = Float.floatToIntBits((float) ((((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24)) * 4.656612875245797E-10d));
                if (floatToIntBits2 == f83370i) {
                    floatToIntBits2 = Float.floatToIntBits(0.0f);
                }
                m32907a.putInt(floatToIntBits2);
                position += 3;
            }
        }
        byteBuffer.position(byteBuffer.limit());
        m32907a.flip();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC30628jj
    /* renamed from: b */
    public final InterfaceC31983zg.C31984a mo29000b(InterfaceC31983zg.C31984a c31984a) throws InterfaceC31983zg.C31985b {
        int i = c31984a.f88854c;
        if (i != 536870912 && i != 805306368 && i != 4) {
            throw new InterfaceC31983zg.C31985b(c31984a);
        }
        if (i != 4) {
            return new InterfaceC31983zg.C31984a(c31984a.f88852a, c31984a.f88853b, 4);
        }
        return InterfaceC31983zg.C31984a.f88851e;
    }
}
