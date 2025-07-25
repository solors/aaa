package com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts;

import androidx.core.view.InputDeviceCompat;
import com.fyber.inneractive.sdk.player.exoplayer2.extractor.InterfaceC14874j;
import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15121n;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C15129v;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.extractor.ts.w */
/* loaded from: classes4.dex */
public final class C14964w implements InterfaceC14941F {

    /* renamed from: a */
    public final InterfaceC14963v f29258a;

    /* renamed from: b */
    public final C15121n f29259b = new C15121n(32);

    /* renamed from: c */
    public int f29260c;

    /* renamed from: d */
    public int f29261d;

    /* renamed from: e */
    public boolean f29262e;

    /* renamed from: f */
    public boolean f29263f;

    public C14964w(InterfaceC14963v interfaceC14963v) {
        this.f29258a = interfaceC14963v;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14941F
    /* renamed from: a */
    public final void mo77399a(C15129v c15129v, InterfaceC14874j interfaceC14874j, C14940E c14940e) {
        this.f29258a.mo77396a(c15129v, interfaceC14874j, c14940e);
        this.f29263f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14941F
    /* renamed from: a */
    public final void mo77401a() {
        this.f29263f = true;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.extractor.p375ts.InterfaceC14941F
    /* renamed from: a */
    public final void mo77400a(C15121n c15121n, boolean z) {
        int m77192j = z ? c15121n.f29805b + c15121n.m77192j() : -1;
        if (this.f29263f) {
            if (!z) {
                return;
            }
            this.f29263f = false;
            c15121n.m77197e(m77192j);
            this.f29261d = 0;
        }
        while (true) {
            int i = c15121n.f29806c - c15121n.f29805b;
            if (i <= 0) {
                return;
            }
            int i2 = this.f29261d;
            if (i2 < 3) {
                if (i2 == 0) {
                    int m77192j2 = c15121n.m77192j();
                    c15121n.m77197e(c15121n.f29805b - 1);
                    if (m77192j2 == 255) {
                        this.f29263f = true;
                        return;
                    }
                }
                int min = Math.min(c15121n.f29806c - c15121n.f29805b, 3 - this.f29261d);
                c15121n.m77205a(this.f29259b.f29804a, this.f29261d, min);
                int i3 = this.f29261d + min;
                this.f29261d = i3;
                if (i3 == 3) {
                    this.f29259b.m77201c(3);
                    C15121n c15121n2 = this.f29259b;
                    c15121n2.m77197e(c15121n2.f29805b + 1);
                    int m77192j3 = this.f29259b.m77192j();
                    int m77192j4 = this.f29259b.m77192j();
                    this.f29262e = (m77192j3 & 128) != 0;
                    this.f29260c = (((m77192j3 & 15) << 8) | m77192j4) + 3;
                    int m77207a = this.f29259b.m77207a();
                    int i4 = this.f29260c;
                    if (m77207a < i4) {
                        C15121n c15121n3 = this.f29259b;
                        byte[] bArr = c15121n3.f29804a;
                        c15121n3.m77201c(Math.min((int) InputDeviceCompat.SOURCE_TOUCHSCREEN, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.f29259b.f29804a, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(i, this.f29260c - i2);
                c15121n.m77205a(this.f29259b.f29804a, this.f29261d, min2);
                int i5 = this.f29261d + min2;
                this.f29261d = i5;
                int i6 = this.f29260c;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.f29262e) {
                        byte[] bArr2 = this.f29259b.f29804a;
                        int i7 = -1;
                        for (int i8 = 0; i8 < i6; i8++) {
                            i7 = AbstractC15133z.f29839h[((i7 >>> 24) ^ (bArr2[i8] & 255)) & 255] ^ (i7 << 8);
                        }
                        int i9 = AbstractC15133z.f29832a;
                        if (i7 != 0) {
                            this.f29263f = true;
                            return;
                        }
                        this.f29259b.m77201c(this.f29260c - 4);
                    } else {
                        this.f29259b.m77201c(i6);
                    }
                    this.f29258a.mo77397a(this.f29259b);
                    this.f29261d = 0;
                }
            }
        }
    }
}
