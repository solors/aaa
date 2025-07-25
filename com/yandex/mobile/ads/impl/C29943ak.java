package com.yandex.mobile.ads.impl;

import androidx.annotation.IntRange;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.ak */
/* loaded from: classes8.dex */
final class C29943ak extends C30423gx {

    /* renamed from: j */
    private long f76813j;

    /* renamed from: k */
    private int f76814k;

    /* renamed from: l */
    private int f76815l;

    public C29943ak() {
        super(2);
        this.f76815l = 32;
    }

    /* renamed from: a */
    public final boolean m35853a(C30423gx c30423gx) {
        ByteBuffer byteBuffer;
        if (!c30423gx.m33759i()) {
            if (!c30423gx.m34137d()) {
                if (!c30423gx.m34134f()) {
                    if (m35849m()) {
                        if (this.f76814k < this.f76815l && c30423gx.m34135e() == m34135e()) {
                            ByteBuffer byteBuffer2 = c30423gx.f79793d;
                            if (byteBuffer2 != null && (byteBuffer = this.f79793d) != null) {
                                if (byteBuffer2.remaining() + byteBuffer.position() > 3072000) {
                                    return false;
                                }
                            }
                        } else {
                            return false;
                        }
                    }
                    int i = this.f76814k;
                    this.f76814k = i + 1;
                    if (i == 0) {
                        this.f79795f = c30423gx.f79795f;
                        if (c30423gx.m34133g()) {
                            m34136d(1);
                        }
                    }
                    if (c30423gx.m34135e()) {
                        m34136d(Integer.MIN_VALUE);
                    }
                    ByteBuffer byteBuffer3 = c30423gx.f79793d;
                    if (byteBuffer3 != null) {
                        m33761e(byteBuffer3.remaining());
                        this.f79793d.put(byteBuffer3);
                    }
                    this.f76813j = c30423gx.f79795f;
                    return true;
                }
                throw new IllegalArgumentException();
            }
            throw new IllegalArgumentException();
        }
        throw new IllegalArgumentException();
    }

    @Override // com.yandex.mobile.ads.impl.C30423gx, com.yandex.mobile.ads.impl.AbstractC30321fl
    /* renamed from: b */
    public final void mo28933b() {
        super.mo28933b();
        this.f76814k = 0;
    }

    /* renamed from: f */
    public final void m35852f(@IntRange(from = 1) int i) {
        if (i > 0) {
            this.f76815l = i;
            return;
        }
        throw new IllegalArgumentException();
    }

    /* renamed from: k */
    public final long m35851k() {
        return this.f76813j;
    }

    /* renamed from: l */
    public final int m35850l() {
        return this.f76814k;
    }

    /* renamed from: m */
    public final boolean m35849m() {
        if (this.f76814k > 0) {
            return true;
        }
        return false;
    }
}
