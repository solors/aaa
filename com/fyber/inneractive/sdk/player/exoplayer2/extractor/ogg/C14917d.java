package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.C15014o;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15113f;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.d */
/* loaded from: classes4.dex */
public final class C14917d extends AbstractC14925l {

    /* renamed from: n */
    public C15113f f28973n;

    /* renamed from: o */
    public C14916c f28974o;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final void mo77425a(boolean z) {
        super.mo77425a(z);
        if (z) {
            this.f28973n = null;
            this.f28974o = null;
        }
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final long mo77427a(C15121n c15121n) {
        int i;
        int i2;
        int i3;
        byte b;
        int i4;
        byte[] bArr = c15121n.f29804a;
        int i5 = -1;
        if (bArr[0] == -1) {
            int i6 = (bArr[2] & 255) >> 4;
            switch (i6) {
                case 1:
                    i5 = 192;
                    break;
                case 2:
                case 3:
                case 4:
                case 5:
                    i = i6 - 2;
                    i2 = 576;
                    i5 = i2 << i;
                    break;
                case 6:
                case 7:
                    c15121n.m77197e(c15121n.f29805b + 4);
                    long j = c15121n.f29804a[c15121n.f29805b];
                    int i7 = 7;
                    while (true) {
                        if (i7 >= 0) {
                            if (((1 << i7) & j) != 0) {
                                i7--;
                            } else if (i7 < 6) {
                                j &= i4 - 1;
                                i3 = 7 - i7;
                            } else if (i7 == 7) {
                                i3 = 1;
                            }
                        }
                    }
                    i3 = 0;
                    if (i3 != 0) {
                        for (int i8 = 1; i8 < i3; i8++) {
                            if ((c15121n.f29804a[c15121n.f29805b + i8] & 192) != 128) {
                                throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                            }
                            j = (j << 6) | (b & 63);
                        }
                        c15121n.f29805b += i3;
                        int m77192j = i6 == 6 ? c15121n.m77192j() : c15121n.m77187o();
                        c15121n.m77197e(0);
                        i5 = m77192j + 1;
                        break;
                    } else {
                        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
                    }
                case 8:
                case 9:
                case 10:
                case 11:
                case 12:
                case 13:
                case 14:
                case 15:
                    i = i6 - 8;
                    i2 = 256;
                    i5 = i2 << i;
                    break;
            }
            return i5;
        }
        return -1L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.AbstractC14925l
    /* renamed from: a */
    public final boolean mo77426a(C15121n c15121n, long j, C14923j c14923j) {
        byte[] bArr = c15121n.f29804a;
        if (this.f28973n == null) {
            this.f28973n = new C15113f(bArr);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 9, c15121n.f29806c);
            copyOfRange[4] = UnsignedBytes.MAX_POWER_OF_TWO;
            List singletonList = Collections.singletonList(copyOfRange);
            C15113f c15113f = this.f28973n;
            int i = c15113f.f29780c;
            int i2 = c15113f.f29778a;
            c14923j.f28992a = C15014o.m77309a(null, "audio/flac", -1, i * i2, c15113f.f29779b, i2, singletonList, null, null);
        } else {
            byte b = bArr[0];
            if ((b & Byte.MAX_VALUE) == 3) {
                C14916c c14916c = new C14916c(this);
                this.f28974o = c14916c;
                c15121n.m77197e(c15121n.f29805b + 1);
                int m77190l = c15121n.m77190l() / 18;
                c14916c.f28968a = new long[m77190l];
                c14916c.f28969b = new long[m77190l];
                for (int i3 = 0; i3 < m77190l; i3++) {
                    c14916c.f28968a[i3] = c15121n.m77195g();
                    c14916c.f28969b[i3] = c15121n.m77195g();
                    c15121n.m77197e(c15121n.f29805b + 2);
                }
            } else if (b == -1) {
                C14916c c14916c2 = this.f28974o;
                if (c14916c2 != null) {
                    c14916c2.f28970c = j;
                    c14923j.f28993b = c14916c2;
                }
                return false;
            }
        }
        return true;
    }
}
