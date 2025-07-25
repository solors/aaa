package com.bytedance.sdk.component.p238WR.p240bg;

/* renamed from: com.bytedance.sdk.component.WR.bg.bg */
/* loaded from: classes3.dex */
public class C7267bg {

    /* renamed from: IL */
    private static volatile C7267bg f15696IL;

    /* renamed from: bg */
    private volatile InterfaceC7266IL f15697bg;

    private C7267bg() {
    }

    /* renamed from: bg */
    public static C7267bg m89414bg() {
        if (f15696IL == null) {
            synchronized (C7267bg.class) {
                if (f15696IL == null) {
                    f15696IL = new C7267bg();
                }
            }
        }
        return f15696IL;
    }

    /* renamed from: IL */
    public InterfaceC7266IL m89415IL() {
        return this.f15697bg;
    }

    /* renamed from: bg */
    public void m89411bg(InterfaceC7266IL interfaceC7266IL) {
        this.f15697bg = interfaceC7266IL;
    }
}
