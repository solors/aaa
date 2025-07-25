package com.bytedance.sdk.component.p228IL.p229bg.p230IL;

/* renamed from: com.bytedance.sdk.component.IL.bg.IL.zx */
/* loaded from: classes3.dex */
final class C7186zx {

    /* renamed from: IL */
    int f15494IL;

    /* renamed from: bX */
    int f15495bX;

    /* renamed from: bg */
    final byte[] f15496bg;
    boolean eqN;

    /* renamed from: iR */
    C7186zx f15497iR;
    C7186zx ldr;

    /* renamed from: zx */
    boolean f15498zx;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C7186zx() {
        this.f15496bg = new byte[8192];
        this.f15498zx = true;
        this.eqN = false;
    }

    /* renamed from: IL */
    public final C7186zx m89664IL() {
        C7186zx c7186zx;
        C7186zx c7186zx2 = this.ldr;
        if (c7186zx2 != this) {
            c7186zx = c7186zx2;
        } else {
            c7186zx = null;
        }
        C7186zx c7186zx3 = this.f15497iR;
        if (c7186zx3 != null) {
            c7186zx3.ldr = c7186zx2;
        }
        C7186zx c7186zx4 = this.ldr;
        if (c7186zx4 != null) {
            c7186zx4.f15497iR = c7186zx3;
        }
        this.ldr = null;
        this.f15497iR = null;
        return c7186zx;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public final C7186zx m89663bg() {
        this.eqN = true;
        return new C7186zx(this.f15496bg, this.f15494IL, this.f15495bX, true, false);
    }

    /* renamed from: bg */
    public final C7186zx m89662bg(C7186zx c7186zx) {
        c7186zx.f15497iR = this;
        c7186zx.ldr = this.ldr;
        this.ldr.f15497iR = c7186zx;
        this.ldr = c7186zx;
        return c7186zx;
    }

    C7186zx(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f15496bg = bArr;
        this.f15494IL = i;
        this.f15495bX = i2;
        this.eqN = z;
        this.f15498zx = z2;
    }
}
