package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.C14833b;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f */
/* loaded from: classes4.dex */
public final class C14919f {

    /* renamed from: a */
    public final C14920g f28976a = new C14920g();

    /* renamed from: b */
    public final C15121n f28977b = new C15121n(0, new byte[65025]);

    /* renamed from: c */
    public int f28978c = -1;

    /* renamed from: d */
    public int f28979d;

    /* renamed from: e */
    public boolean f28980e;

    /* renamed from: a */
    public final boolean m77436a(C14833b c14833b) {
        int i;
        int i2;
        int i3;
        if (this.f28980e) {
            this.f28980e = false;
            C15121n c15121n = this.f28977b;
            c15121n.f29805b = 0;
            c15121n.f29806c = 0;
        }
        while (true) {
            if (this.f28980e) {
                return true;
            }
            if (this.f28978c < 0) {
                if (!this.f28976a.m77435a(c14833b, true)) {
                    return false;
                }
                C14920g c14920g = this.f28976a;
                int i4 = c14920g.f28985d;
                if ((c14920g.f28982a & 1) == 1 && this.f28977b.f29806c == 0) {
                    this.f28979d = 0;
                    int i5 = 0;
                    do {
                        int i6 = this.f28979d;
                        C14920g c14920g2 = this.f28976a;
                        if (i6 >= c14920g2.f28984c) {
                            break;
                        }
                        int[] iArr = c14920g2.f28987f;
                        this.f28979d = i6 + 1;
                        i3 = iArr[i6];
                        i5 += i3;
                    } while (i3 == 255);
                    i4 += i5;
                    i2 = this.f28979d;
                } else {
                    i2 = 0;
                }
                c14833b.m77524a(i4);
                this.f28978c = i2;
            }
            int i7 = this.f28978c;
            this.f28979d = 0;
            int i8 = 0;
            do {
                int i9 = this.f28979d;
                int i10 = i7 + i9;
                C14920g c14920g3 = this.f28976a;
                if (i10 >= c14920g3.f28984c) {
                    break;
                }
                int[] iArr2 = c14920g3.f28987f;
                this.f28979d = i9 + 1;
                i = iArr2[i10];
                i8 += i;
            } while (i == 255);
            int i11 = this.f28978c + this.f28979d;
            if (i8 > 0) {
                int m77207a = this.f28977b.m77207a();
                C15121n c15121n2 = this.f28977b;
                int i12 = c15121n2.f29806c + i8;
                if (m77207a < i12) {
                    c15121n2.f29804a = Arrays.copyOf(c15121n2.f29804a, i12);
                }
                C15121n c15121n3 = this.f28977b;
                c14833b.m77519b(c15121n3.f29804a, c15121n3.f29806c, i8, false);
                C15121n c15121n4 = this.f28977b;
                c15121n4.m77199d(c15121n4.f29806c + i8);
                this.f28980e = this.f28976a.f28987f[i11 + (-1)] != 255;
            }
            if (i11 == this.f28976a.f28984c) {
                i11 = -1;
            }
            this.f28978c = i11;
        }
    }

    /* renamed from: a */
    public final void m77437a() {
        C15121n c15121n = this.f28977b;
        byte[] bArr = c15121n.f29804a;
        if (bArr.length == 65025) {
            return;
        }
        c15121n.f29804a = Arrays.copyOf(bArr, Math.max(65025, c15121n.f29806c));
    }
}
