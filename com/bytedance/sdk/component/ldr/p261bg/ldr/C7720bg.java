package com.bytedance.sdk.component.ldr.p261bg.ldr;

import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;

/* renamed from: com.bytedance.sdk.component.ldr.bg.ldr.bg */
/* loaded from: classes3.dex */
public class C7720bg {

    /* renamed from: bg */
    private static volatile InterfaceC7714IL f16887bg;

    /* renamed from: bg */
    public static InterfaceC7714IL m87958bg() {
        if (f16887bg == null) {
            synchronized (InterfaceC7714IL.class) {
                if (f16887bg == null) {
                    f16887bg = new C7716bX(C7659Kg.m88154iR().ldr(), new C7722ldr(C7659Kg.m88154iR().ldr()));
                }
            }
        }
        return f16887bg;
    }
}
