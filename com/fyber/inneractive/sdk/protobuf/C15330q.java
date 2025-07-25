package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.AbstractC14857l;
import java.nio.charset.Charset;

/* renamed from: com.fyber.inneractive.sdk.protobuf.q */
/* loaded from: classes4.dex */
public class C15330q extends AbstractC15327p {
    private static final long serialVersionUID = 1;

    /* renamed from: d */
    public final byte[] f30292d;

    public C15330q(byte[] bArr) {
        bArr.getClass();
        this.f30292d = bArr;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: a */
    public void mo76832a(int i, byte[] bArr) {
        System.arraycopy(this.f30292d, 0, bArr, 0, i);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: c */
    public byte mo76828c(int i) {
        return this.f30292d[i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: d */
    public byte mo76826d(int i) {
        return this.f30292d[i];
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: e */
    public final AbstractC15336s mo76824e(int i) {
        int m76833a = AbstractC15336s.m76833a(0, i, size());
        if (m76833a == 0) {
            return AbstractC15336s.f30296b;
        }
        return new C15321n(this.f30292d, mo76836g(), m76833a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC15336s) || size() != ((AbstractC15336s) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C15330q) {
            C15330q c15330q = (C15330q) obj;
            int i = this.f30298a;
            int i2 = c15330q.f30298a;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size <= c15330q.size()) {
                if (size <= c15330q.size()) {
                    byte[] bArr = this.f30292d;
                    byte[] bArr2 = c15330q.f30292d;
                    int mo76836g = mo76836g() + size;
                    int mo76836g2 = mo76836g();
                    int mo76836g3 = c15330q.mo76836g();
                    while (mo76836g2 < mo76836g) {
                        if (bArr[mo76836g2] != bArr2[mo76836g3]) {
                            return false;
                        }
                        mo76836g2++;
                        mo76836g3++;
                    }
                    return true;
                }
                StringBuilder m77492a = AbstractC14857l.m77492a("Ran off end of other: 0, ", size, ", ");
                m77492a.append(c15330q.size());
                throw new IllegalArgumentException(m77492a.toString());
            }
            throw new IllegalArgumentException("Length too large: " + size + size());
        }
        return obj.equals(this);
    }

    /* renamed from: g */
    public int mo76836g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    public int size() {
        return this.f30292d.length;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: a */
    public final void mo76831a(AbstractC15312k abstractC15312k) {
        abstractC15312k.mo76687a(this.f30292d, mo76836g(), size());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: c */
    public final boolean mo76829c() {
        int mo76836g = mo76836g();
        return AbstractC15227E1.f30154a.m77029b(this.f30292d, mo76836g, size() + mo76836g);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: d */
    public final AbstractC15348w mo76827d() {
        byte[] bArr = this.f30292d;
        int mo76836g = mo76836g();
        int size = size();
        C15339t c15339t = new C15339t(bArr, mo76836g, size, true);
        try {
            c15339t.mo76780d(size);
            return c15339t;
        } catch (C15325o0 e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: a */
    public final int mo76834a(int i, int i2) {
        byte[] bArr = this.f30292d;
        int mo76836g = mo76836g();
        Charset charset = AbstractC15319m0.f30280a;
        for (int i3 = mo76836g; i3 < mo76836g + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.AbstractC15336s
    /* renamed from: e */
    public final String mo76825e() {
        return new String(this.f30292d, mo76836g(), size(), AbstractC15319m0.f30280a);
    }
}
