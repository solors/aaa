package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import com.yandex.mobile.ads.impl.pt0;
import com.yandex.mobile.ads.impl.vt0;
import java.io.IOException;

/* loaded from: classes8.dex */
public final class kr0 implements pt0, pt0.InterfaceC31153a {

    /* renamed from: b */
    public final vt0.C31682b f81534b;

    /* renamed from: c */
    private final long f81535c;

    /* renamed from: d */
    private final InterfaceC31192qc f81536d;

    /* renamed from: e */
    private vt0 f81537e;

    /* renamed from: f */
    private pt0 f81538f;
    @Nullable

    /* renamed from: g */
    private pt0.InterfaceC31153a f81539g;

    /* renamed from: h */
    private boolean f81540h;

    /* renamed from: i */
    private long f81541i = -9223372036854775807L;

    /* renamed from: com.yandex.mobile.ads.impl.kr0$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC30744a {
        /* renamed from: a */
        void m32453a(vt0.C31682b c31682b);

        /* renamed from: a */
        void m32452a(vt0.C31682b c31682b, IOException iOException);
    }

    public kr0(vt0.C31682b c31682b, InterfaceC31192qc interfaceC31192qc, long j) {
        this.f81534b = c31682b;
        this.f81536d = interfaceC31192qc;
        this.f81535c = j;
    }

    /* renamed from: a */
    public final void m32457a(vt0.C31682b c31682b) {
        long j = this.f81535c;
        long j2 = this.f81541i;
        if (j2 != -9223372036854775807L) {
            j = j2;
        }
        vt0 vt0Var = this.f81537e;
        vt0Var.getClass();
        pt0 mo28225a = vt0Var.mo28225a(c31682b, this.f81536d, j);
        this.f81538f = mo28225a;
        if (this.f81539g != null) {
            mo28225a.mo26217a(this, j);
        }
    }

    /* renamed from: b */
    public final long m32455b() {
        return this.f81535c;
    }

    /* renamed from: c */
    public final void m32454c() {
        if (this.f81538f != null) {
            vt0 vt0Var = this.f81537e;
            vt0Var.getClass();
            vt0Var.mo28226a(this.f81538f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.xs1
    public final boolean continueLoading(long j) {
        pt0 pt0Var = this.f81538f;
        if (pt0Var != null && pt0Var.continueLoading(j)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    public final void discardBuffer(long j, boolean z) {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        pt0Var.discardBuffer(j, z);
    }

    @Override // com.yandex.mobile.ads.impl.xs1
    public final long getBufferedPositionUs() {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        return pt0Var.getBufferedPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.xs1
    public final long getNextLoadPositionUs() {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        return pt0Var.getNextLoadPositionUs();
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    public final w02 getTrackGroups() {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        return pt0Var.getTrackGroups();
    }

    @Override // com.yandex.mobile.ads.impl.xs1
    public final boolean isLoading() {
        pt0 pt0Var = this.f81538f;
        if (pt0Var != null && pt0Var.isLoading()) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    public final void maybeThrowPrepareError() throws IOException {
        try {
            pt0 pt0Var = this.f81538f;
            if (pt0Var != null) {
                pt0Var.maybeThrowPrepareError();
                return;
            }
            vt0 vt0Var = this.f81537e;
            if (vt0Var != null) {
                vt0Var.maybeThrowSourceInfoRefreshError();
            }
        } catch (IOException e) {
            throw e;
        }
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    public final long readDiscontinuity() {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        return pt0Var.readDiscontinuity();
    }

    @Override // com.yandex.mobile.ads.impl.xs1
    public final void reevaluateBuffer(long j) {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        pt0Var.reevaluateBuffer(j);
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    public final long seekToUs(long j) {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        return pt0Var.seekToUs(j);
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    /* renamed from: a */
    public final long mo26222a(long j, qs1 qs1Var) {
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        return pt0Var.mo26222a(j, qs1Var);
    }

    /* renamed from: a */
    public final long m32459a() {
        return this.f81541i;
    }

    @Override // com.yandex.mobile.ads.impl.xs1.InterfaceC31839a
    /* renamed from: a */
    public final void mo27255a(pt0 pt0Var) {
        pt0.InterfaceC31153a interfaceC31153a = this.f81539g;
        int i = y32.f88010a;
        interfaceC31153a.mo27255a((pt0.InterfaceC31153a) this);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.yandex.mobile.ads.impl.pt0.InterfaceC31153a
    /* renamed from: a */
    public final void mo30586a(pt0 pt0Var) {
        pt0.InterfaceC31153a interfaceC31153a = this.f81539g;
        int i = y32.f88010a;
        interfaceC31153a.mo30586a((pt0) this);
    }

    /* renamed from: a */
    public final void m32458a(long j) {
        this.f81541i = j;
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    /* renamed from: a */
    public final void mo26217a(pt0.InterfaceC31153a interfaceC31153a, long j) {
        this.f81539g = interfaceC31153a;
        pt0 pt0Var = this.f81538f;
        if (pt0Var != null) {
            long j2 = this.f81535c;
            long j3 = this.f81541i;
            if (j3 != -9223372036854775807L) {
                j2 = j3;
            }
            pt0Var.mo26217a(this, j2);
        }
    }

    @Override // com.yandex.mobile.ads.impl.pt0
    /* renamed from: a */
    public final long mo26213a(v40[] v40VarArr, boolean[] zArr, ap1[] ap1VarArr, boolean[] zArr2, long j) {
        long j2;
        long j3 = this.f81541i;
        if (j3 == -9223372036854775807L || j != this.f81535c) {
            j2 = j;
        } else {
            this.f81541i = -9223372036854775807L;
            j2 = j3;
        }
        pt0 pt0Var = this.f81538f;
        int i = y32.f88010a;
        return pt0Var.mo26213a(v40VarArr, zArr, ap1VarArr, zArr2, j2);
    }

    /* renamed from: a */
    public final void m32456a(vt0 vt0Var) {
        if (this.f81537e == null) {
            this.f81537e = vt0Var;
            return;
        }
        throw new IllegalStateException();
    }
}
