package com.bytedance.sdk.component.p228IL.p229bg.p230IL;

/* renamed from: com.bytedance.sdk.component.IL.bg.IL.ldr */
/* loaded from: classes3.dex */
final class C7185ldr {

    /* renamed from: IL */
    static long f15492IL;

    /* renamed from: bg */
    static C7186zx f15493bg;

    private C7185ldr() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C7186zx m89666bg() {
        synchronized (C7185ldr.class) {
            C7186zx c7186zx = f15493bg;
            if (c7186zx != null) {
                f15493bg = c7186zx.ldr;
                c7186zx.ldr = null;
                f15492IL -= 8192;
                return c7186zx;
            }
            return new C7186zx();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static void m89665bg(C7186zx c7186zx) {
        if (c7186zx.ldr == null && c7186zx.f15497iR == null) {
            if (c7186zx.eqN) {
                return;
            }
            synchronized (C7185ldr.class) {
                long j = f15492IL;
                if (j + 8192 > 65536) {
                    return;
                }
                f15492IL = j + 8192;
                c7186zx.ldr = f15493bg;
                c7186zx.f15495bX = 0;
                c7186zx.f15494IL = 0;
                f15493bg = c7186zx;
                return;
            }
        }
        throw new IllegalArgumentException();
    }
}
