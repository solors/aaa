package com.applovin.impl;

import android.net.Uri;
import java.util.Map;

/* renamed from: com.applovin.impl.sa */
/* loaded from: classes2.dex */
final class C5312sa implements InterfaceC4509h5 {

    /* renamed from: a */
    private final InterfaceC4509h5 f9613a;

    /* renamed from: b */
    private final int f9614b;

    /* renamed from: c */
    private final InterfaceC5313a f9615c;

    /* renamed from: d */
    private final byte[] f9616d;

    /* renamed from: e */
    private int f9617e;

    /* renamed from: com.applovin.impl.sa$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC5313a {
        /* renamed from: a */
        void mo95687a(C4066ah c4066ah);
    }

    public C5312sa(InterfaceC4509h5 interfaceC4509h5, int i, InterfaceC5313a interfaceC5313a) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC4100b1.m100580a(z);
        this.f9613a = interfaceC4509h5;
        this.f9614b = i;
        this.f9615c = interfaceC5313a;
        this.f9616d = new byte[1];
        this.f9617e = i;
    }

    /* renamed from: g */
    private boolean m95688g() {
        if (this.f9613a.mo94271a(this.f9616d, 0, 1) == -1) {
            return false;
        }
        int i = (this.f9616d[0] & 255) << 4;
        if (i == 0) {
            return true;
        }
        byte[] bArr = new byte[i];
        int i2 = i;
        int i3 = 0;
        while (i2 > 0) {
            int mo94271a = this.f9613a.mo94271a(bArr, i3, i2);
            if (mo94271a == -1) {
                return false;
            }
            i3 += mo94271a;
            i2 -= mo94271a;
        }
        while (i > 0 && bArr[i - 1] == 0) {
            i--;
        }
        if (i > 0) {
            this.f9615c.mo95687a(new C4066ah(bArr, i));
        }
        return true;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public void mo94272a(InterfaceC5862xo interfaceC5862xo) {
        AbstractC4100b1.m100583a(interfaceC5862xo);
        this.f9613a.mo94272a(interfaceC5862xo);
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: c */
    public Uri mo94270c() {
        return this.f9613a.mo94270c();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: e */
    public Map mo94269e() {
        return this.f9613a.mo94269e();
    }

    @Override // com.applovin.impl.InterfaceC4379f5
    /* renamed from: a */
    public int mo94271a(byte[] bArr, int i, int i2) {
        if (this.f9617e == 0) {
            if (!m95688g()) {
                return -1;
            }
            this.f9617e = this.f9614b;
        }
        int mo94271a = this.f9613a.mo94271a(bArr, i, Math.min(this.f9617e, i2));
        if (mo94271a != -1) {
            this.f9617e -= mo94271a;
        }
        return mo94271a;
    }

    @Override // com.applovin.impl.InterfaceC4509h5
    /* renamed from: a */
    public long mo94273a(C4698k5 c4698k5) {
        throw new UnsupportedOperationException();
    }
}
