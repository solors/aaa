package com.applovin.impl;

import com.applovin.impl.InterfaceC5099p1;
import java.nio.ByteBuffer;

/* renamed from: com.applovin.impl.b9 */
/* loaded from: classes2.dex */
final class C4111b9 extends AbstractC5942z1 {

    /* renamed from: i */
    private static final int f4959i = Float.floatToIntBits(Float.NaN);

    @Override // com.applovin.impl.InterfaceC5099p1
    /* renamed from: a */
    public void mo92336a(ByteBuffer byteBuffer) {
        ByteBuffer m92598a;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = this.f12408b.f8976c;
        if (i2 == 536870912) {
            m92598a = m92598a((i / 3) * 4);
            while (position < limit) {
                m100487a(((byteBuffer.get(position) & 255) << 8) | ((byteBuffer.get(position + 1) & 255) << 16) | ((byteBuffer.get(position + 2) & 255) << 24), m92598a);
                position += 3;
            }
        } else if (i2 == 805306368) {
            m92598a = m92598a(i);
            while (position < limit) {
                m100487a((byteBuffer.get(position) & 255) | ((byteBuffer.get(position + 1) & 255) << 8) | ((byteBuffer.get(position + 2) & 255) << 16) | ((byteBuffer.get(position + 3) & 255) << 24), m92598a);
                position += 4;
            }
        } else {
            throw new IllegalStateException();
        }
        byteBuffer.position(byteBuffer.limit());
        m92598a.flip();
    }

    @Override // com.applovin.impl.AbstractC5942z1
    /* renamed from: b */
    public InterfaceC5099p1.C5100a mo92335b(InterfaceC5099p1.C5100a c5100a) {
        int i = c5100a.f8976c;
        if (AbstractC5863xp.m92961f(i)) {
            if (i != 4) {
                return new InterfaceC5099p1.C5100a(c5100a.f8974a, c5100a.f8975b, 4);
            }
            return InterfaceC5099p1.C5100a.f8973e;
        }
        throw new InterfaceC5099p1.C5101b(c5100a);
    }

    /* renamed from: a */
    private static void m100487a(int i, ByteBuffer byteBuffer) {
        int floatToIntBits = Float.floatToIntBits((float) (i * 4.656612875245797E-10d));
        if (floatToIntBits == f4959i) {
            floatToIntBits = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(floatToIntBits);
    }
}
