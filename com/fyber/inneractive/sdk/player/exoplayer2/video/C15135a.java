package com.fyber.inneractive.sdk.player.exoplayer2.video;

import com.fyber.inneractive.sdk.player.exoplayer2.C15017r;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15111d;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15119l;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15118k;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.video.a */
/* loaded from: classes4.dex */
public final class C15135a {

    /* renamed from: a */
    public final List f29873a;

    /* renamed from: b */
    public final int f29874b;

    /* renamed from: c */
    public final int f29875c;

    /* renamed from: d */
    public final int f29876d;

    /* renamed from: e */
    public final float f29877e;

    public C15135a(ArrayList arrayList, int i, int i2, int i3, float f) {
        this.f29873a = arrayList;
        this.f29874b = i;
        this.f29875c = i2;
        this.f29876d = i3;
        this.f29877e = f;
    }

    /* renamed from: a */
    public static C15135a m77132a(C15121n c15121n) {
        int i;
        int i2;
        float f;
        try {
            c15121n.m77197e(c15121n.f29805b + 4);
            int m77192j = (c15121n.m77192j() & 3) + 1;
            if (m77192j != 3) {
                ArrayList arrayList = new ArrayList();
                int m77192j2 = c15121n.m77192j() & 31;
                for (int i3 = 0; i3 < m77192j2; i3++) {
                    int m77187o = c15121n.m77187o();
                    int i4 = c15121n.f29805b;
                    c15121n.m77197e(i4 + m77187o);
                    byte[] bArr = c15121n.f29804a;
                    byte[] bArr2 = new byte[m77187o + 4];
                    System.arraycopy(AbstractC15111d.f29774a, 0, bArr2, 0, 4);
                    System.arraycopy(bArr, i4, bArr2, 4, m77187o);
                    arrayList.add(bArr2);
                }
                int m77192j3 = c15121n.m77192j();
                for (int i5 = 0; i5 < m77192j3; i5++) {
                    int m77187o2 = c15121n.m77187o();
                    int i6 = c15121n.f29805b;
                    c15121n.m77197e(i6 + m77187o2);
                    byte[] bArr3 = c15121n.f29804a;
                    byte[] bArr4 = new byte[m77187o2 + 4];
                    System.arraycopy(AbstractC15111d.f29774a, 0, bArr4, 0, 4);
                    System.arraycopy(bArr3, i6, bArr4, 4, m77187o2);
                    arrayList.add(bArr4);
                }
                if (m77192j2 > 0) {
                    C15118k m77215a = AbstractC15119l.m77215a((byte[]) arrayList.get(0), m77192j, ((byte[]) arrayList.get(0)).length);
                    int i7 = m77215a.f29787b;
                    int i8 = m77215a.f29788c;
                    f = m77215a.f29789d;
                    i = i7;
                    i2 = i8;
                } else {
                    i = -1;
                    i2 = -1;
                    f = 1.0f;
                }
                return new C15135a(arrayList, m77192j, i, i2, f);
            }
            throw new IllegalStateException();
        } catch (ArrayIndexOutOfBoundsException e) {
            throw new C15017r("Error parsing AVC config", e);
        }
    }
}
