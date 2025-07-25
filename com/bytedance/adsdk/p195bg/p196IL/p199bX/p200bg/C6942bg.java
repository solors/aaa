package com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6955eqN;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6931tC;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import java.util.Deque;

/* renamed from: com.bytedance.adsdk.bg.IL.bX.bg.bg */
/* loaded from: classes3.dex */
public class C6942bg extends AbstractC6946ldr {
    @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.AbstractC6946ldr
    /* renamed from: bg */
    public int mo90463bg(String str, int i, Deque<InterfaceC6913bg> deque, InterfaceC6937bg interfaceC6937bg) {
        if (',' != m90464bg(i, str)) {
            return interfaceC6937bg.mo90458bg(str, i, deque);
        }
        deque.push(new C6931tC(EnumC6955eqN.COMMA));
        return i + 1;
    }
}
