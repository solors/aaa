package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import com.fyber.inneractive.sdk.player.exoplayer2.util.AbstractC15133z;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.upstream.l */
/* loaded from: classes4.dex */
public final class C15093l implements InterfaceC15070b {

    /* renamed from: b */
    public int f29713b;

    /* renamed from: c */
    public int f29714c;

    /* renamed from: d */
    public int f29715d = 0;

    /* renamed from: e */
    public C15069a[] f29716e = new C15069a[100];

    /* renamed from: a */
    public final C15069a[] f29712a = new C15069a[1];

    /* renamed from: a */
    public final synchronized void m77244a(int i) {
        boolean z = i < this.f29713b;
        this.f29713b = i;
        if (z) {
            m77245a();
        }
    }

    /* renamed from: a */
    public final synchronized void m77243a(C15069a[] c15069aArr) {
        int i = this.f29715d;
        int length = c15069aArr.length + i;
        C15069a[] c15069aArr2 = this.f29716e;
        if (length >= c15069aArr2.length) {
            this.f29716e = (C15069a[]) Arrays.copyOf(c15069aArr2, Math.max(c15069aArr2.length * 2, i + c15069aArr.length));
        }
        for (C15069a c15069a : c15069aArr) {
            byte[] bArr = c15069a.f29622a;
            if (bArr != null && bArr.length != 65536) {
                throw new IllegalArgumentException();
            }
            C15069a[] c15069aArr3 = this.f29716e;
            int i2 = this.f29715d;
            this.f29715d = i2 + 1;
            c15069aArr3[i2] = c15069a;
        }
        this.f29714c -= c15069aArr.length;
        notifyAll();
    }

    /* renamed from: a */
    public final synchronized void m77245a() {
        int i = this.f29713b;
        int i2 = AbstractC15133z.f29832a;
        int max = Math.max(0, ((i + 65535) / 65536) - this.f29714c);
        int i3 = this.f29715d;
        if (max >= i3) {
            return;
        }
        Arrays.fill(this.f29716e, max, i3, (Object) null);
        this.f29715d = max;
    }
}
