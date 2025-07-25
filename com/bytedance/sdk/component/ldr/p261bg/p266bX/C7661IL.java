package com.bytedance.sdk.component.ldr.p261bg.p266bX;

import com.bytedance.sdk.component.ldr.p261bg.C7659Kg;
import com.bytedance.sdk.component.ldr.p261bg.InterfaceC7724zx;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.bytedance.sdk.component.ldr.bg.bX.IL */
/* loaded from: classes3.dex */
public class C7661IL {
    /* renamed from: bg */
    public static void m88148bg(AtomicLong atomicLong, int i) {
        InterfaceC7724zx m88153vb = C7659Kg.m88154iR().m88153vb();
        if (m88153vb != null && m88153vb.mo83353iR() && atomicLong != null) {
            atomicLong.getAndAdd(i);
        }
    }
}
