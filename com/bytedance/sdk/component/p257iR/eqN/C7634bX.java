package com.bytedance.sdk.component.p257iR.eqN;

/* renamed from: com.bytedance.sdk.component.iR.eqN.bX */
/* loaded from: classes3.dex */
public class C7634bX {

    /* renamed from: IL */
    private InterfaceC7636IL f16666IL;

    /* renamed from: bg */
    private EnumC7638bg f16667bg;

    /* renamed from: com.bytedance.sdk.component.iR.eqN.bX$IL */
    /* loaded from: classes3.dex */
    public interface InterfaceC7636IL {
    }

    /* renamed from: com.bytedance.sdk.component.iR.eqN.bX$bX */
    /* loaded from: classes3.dex */
    private static class C7637bX {

        /* renamed from: bg */
        private static final C7634bX f16668bg = new C7634bX();
    }

    /* renamed from: com.bytedance.sdk.component.iR.eqN.bX$bg */
    /* loaded from: classes3.dex */
    public enum EnumC7638bg {
        DEBUG,
        INFO,
        ERROR,
        OFF
    }

    /* renamed from: bg */
    public static void m88302bg(EnumC7638bg enumC7638bg) {
        synchronized (C7634bX.class) {
            C7637bX.f16668bg.f16667bg = enumC7638bg;
        }
    }

    private C7634bX() {
        this.f16667bg = EnumC7638bg.OFF;
        this.f16666IL = new C7633IL();
    }
}
