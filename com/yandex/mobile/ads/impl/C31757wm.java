package com.yandex.mobile.ads.impl;

import androidx.annotation.Nullable;
import java.nio.ByteBuffer;

/* renamed from: com.yandex.mobile.ads.impl.wm */
/* loaded from: classes8.dex */
public final class C31757wm extends AbstractC31461tj {

    /* renamed from: n */
    private final C30423gx f87302n;

    /* renamed from: o */
    private final cc1 f87303o;

    /* renamed from: p */
    private long f87304p;
    @Nullable

    /* renamed from: q */
    private InterfaceC31671vm f87305q;

    /* renamed from: r */
    private long f87306r;

    public C31757wm() {
        super(6);
        this.f87302n = new C30423gx(1);
        this.f87303o = new cc1();
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31461tj, com.yandex.mobile.ads.impl.me1.InterfaceC30845b
    /* renamed from: a */
    public final void mo27835a(int i, @Nullable Object obj) throws a40 {
        if (i == 8) {
            this.f87305q = (InterfaceC31671vm) obj;
        }
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: d */
    public final boolean mo27806d() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.pk1, com.yandex.mobile.ads.impl.qk1
    public final String getName() {
        return "CameraMotionRenderer";
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31461tj
    /* renamed from: u */
    protected final void mo27802u() {
        InterfaceC31671vm interfaceC31671vm = this.f87305q;
        if (interfaceC31671vm != null) {
            interfaceC31671vm.mo28258f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31461tj
    /* renamed from: a */
    protected final void mo27832a(long j, boolean z) {
        this.f87306r = Long.MIN_VALUE;
        InterfaceC31671vm interfaceC31671vm = this.f87305q;
        if (interfaceC31671vm != null) {
            interfaceC31671vm.mo28258f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.AbstractC31461tj
    /* renamed from: a */
    protected final void mo27870a(v90[] v90VarArr, long j, long j2) {
        this.f87304p = j2;
    }

    @Override // com.yandex.mobile.ads.impl.pk1
    /* renamed from: a */
    public final void mo27872a(long j, long j2) {
        float[] fArr;
        while (!mo29134e() && this.f87306r < 100000 + j) {
            this.f87302n.mo28933b();
            if (m29140a(m29123q(), this.f87302n, 0) != -4 || this.f87302n.m34134f()) {
                return;
            }
            C30423gx c30423gx = this.f87302n;
            this.f87306r = c30423gx.f79795f;
            if (this.f87305q != null && !c30423gx.m34135e()) {
                this.f87302n.m33760h();
                ByteBuffer byteBuffer = this.f87302n.f79793d;
                int i = y32.f88010a;
                if (byteBuffer.remaining() != 16) {
                    fArr = null;
                } else {
                    this.f87303o.m35296a(byteBuffer.limit(), byteBuffer.array());
                    this.f87303o.m35286e(byteBuffer.arrayOffset() + 4);
                    float[] fArr2 = new float[3];
                    for (int i2 = 0; i2 < 3; i2++) {
                        fArr2[i2] = Float.intBitsToFloat(this.f87303o.m35279k());
                    }
                    fArr = fArr2;
                }
                if (fArr != null) {
                    this.f87305q.mo28259a(this.f87306r - this.f87304p, fArr);
                }
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.qk1
    /* renamed from: a */
    public final int mo27871a(v90 v90Var) {
        if ("application/x-camera-motion".equals(v90Var.f86623m)) {
            return qk1.m30280a(4, 0, 0);
        }
        return qk1.m30280a(0, 0, 0);
    }
}
