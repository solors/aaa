package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.InterfaceC31983zg;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes8.dex */
public final class vw1 implements InterfaceC31983zg {

    /* renamed from: b */
    private int f86911b;

    /* renamed from: c */
    private float f86912c = 1.0f;

    /* renamed from: d */
    private float f86913d = 1.0f;

    /* renamed from: e */
    private InterfaceC31983zg.C31984a f86914e;

    /* renamed from: f */
    private InterfaceC31983zg.C31984a f86915f;

    /* renamed from: g */
    private InterfaceC31983zg.C31984a f86916g;

    /* renamed from: h */
    private InterfaceC31983zg.C31984a f86917h;

    /* renamed from: i */
    private boolean f86918i;
    @Nullable

    /* renamed from: j */
    private uw1 f86919j;

    /* renamed from: k */
    private ByteBuffer f86920k;

    /* renamed from: l */
    private ShortBuffer f86921l;

    /* renamed from: m */
    private ByteBuffer f86922m;

    /* renamed from: n */
    private long f86923n;

    /* renamed from: o */
    private long f86924o;

    /* renamed from: p */
    private boolean f86925p;

    public vw1() {
        InterfaceC31983zg.C31984a c31984a = InterfaceC31983zg.C31984a.f88851e;
        this.f86914e = c31984a;
        this.f86915f = c31984a;
        this.f86916g = c31984a;
        this.f86917h = c31984a;
        ByteBuffer byteBuffer = InterfaceC31983zg.f88850a;
        this.f86920k = byteBuffer;
        this.f86921l = byteBuffer.asShortBuffer();
        this.f86922m = byteBuffer;
        this.f86911b = -1;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final InterfaceC31983zg.C31984a mo26238a(InterfaceC31983zg.C31984a c31984a) throws InterfaceC31983zg.C31985b {
        if (c31984a.f88854c == 2) {
            int i = this.f86911b;
            if (i == -1) {
                i = c31984a.f88852a;
            }
            this.f86914e = c31984a;
            InterfaceC31983zg.C31984a c31984a2 = new InterfaceC31983zg.C31984a(i, c31984a.f88853b, 2);
            this.f86915f = c31984a2;
            this.f86918i = true;
            return c31984a2;
        }
        throw new InterfaceC31983zg.C31985b(c31984a);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: b */
    public final void mo26236b() {
        this.f86912c = 1.0f;
        this.f86913d = 1.0f;
        InterfaceC31983zg.C31984a c31984a = InterfaceC31983zg.C31984a.f88851e;
        this.f86914e = c31984a;
        this.f86915f = c31984a;
        this.f86916g = c31984a;
        this.f86917h = c31984a;
        ByteBuffer byteBuffer = InterfaceC31983zg.f88850a;
        this.f86920k = byteBuffer;
        this.f86921l = byteBuffer.asShortBuffer();
        this.f86922m = byteBuffer;
        this.f86911b = -1;
        this.f86918i = false;
        this.f86919j = null;
        this.f86923n = 0L;
        this.f86924o = 0L;
        this.f86925p = false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: c */
    public final ByteBuffer mo26235c() {
        int m28610b;
        uw1 uw1Var = this.f86919j;
        if (uw1Var != null && (m28610b = uw1Var.m28610b()) > 0) {
            if (this.f86920k.capacity() < m28610b) {
                ByteBuffer order = ByteBuffer.allocateDirect(m28610b).order(ByteOrder.nativeOrder());
                this.f86920k = order;
                this.f86921l = order.asShortBuffer();
            } else {
                this.f86920k.clear();
                this.f86921l.clear();
            }
            uw1Var.m28613a(this.f86921l);
            this.f86924o += m28610b;
            this.f86920k.limit(m28610b);
            this.f86922m = this.f86920k;
        }
        ByteBuffer byteBuffer = this.f86922m;
        this.f86922m = InterfaceC31983zg.f88850a;
        return byteBuffer;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: d */
    public final void mo26234d() {
        uw1 uw1Var = this.f86919j;
        if (uw1Var != null) {
            uw1Var.m28605e();
        }
        this.f86925p = true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    public final void flush() {
        if (isActive()) {
            InterfaceC31983zg.C31984a c31984a = this.f86914e;
            this.f86916g = c31984a;
            InterfaceC31983zg.C31984a c31984a2 = this.f86915f;
            this.f86917h = c31984a2;
            if (this.f86918i) {
                this.f86919j = new uw1(c31984a.f88852a, c31984a.f88853b, this.f86912c, this.f86913d, c31984a2.f88852a);
            } else {
                uw1 uw1Var = this.f86919j;
                if (uw1Var != null) {
                    uw1Var.m28615a();
                }
            }
        }
        this.f86922m = InterfaceC31983zg.f88850a;
        this.f86923n = 0L;
        this.f86924o = 0L;
        this.f86925p = false;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    public final boolean isActive() {
        if (this.f86915f.f88852a != -1 && (Math.abs(this.f86912c - 1.0f) >= 1.0E-4f || Math.abs(this.f86913d - 1.0f) >= 1.0E-4f || this.f86915f.f88852a != this.f86914e.f88852a)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final long m28197a(long j) {
        if (this.f86924o >= 1024) {
            long j2 = this.f86923n;
            uw1 uw1Var = this.f86919j;
            uw1Var.getClass();
            long m28607c = j2 - uw1Var.m28607c();
            int i = this.f86917h.f88852a;
            int i2 = this.f86916g.f88852a;
            if (i == i2) {
                return y32.m27088a(j, m28607c, this.f86924o);
            }
            return y32.m27088a(j, m28607c * i, this.f86924o * i2);
        }
        return (long) (this.f86912c * j);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final boolean mo26239a() {
        uw1 uw1Var;
        return this.f86925p && ((uw1Var = this.f86919j) == null || uw1Var.m28610b() == 0);
    }

    /* renamed from: b */
    public final void m28196b(float f) {
        if (this.f86912c != f) {
            this.f86912c = f;
            this.f86918i = true;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31983zg
    /* renamed from: a */
    public final void mo26237a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            uw1 uw1Var = this.f86919j;
            uw1Var.getClass();
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f86923n += remaining;
            uw1Var.m28609b(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    /* renamed from: a */
    public final void m28198a(float f) {
        if (this.f86913d != f) {
            this.f86913d = f;
            this.f86918i = true;
        }
    }
}
