package com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg;

import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6926eo;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6960bg;
import java.util.Deque;

/* renamed from: com.bytedance.adsdk.bg.IL.bX.bg.zx */
/* loaded from: classes3.dex */
public class C6947zx extends AbstractC6946ldr {
    @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.AbstractC6946ldr
    /* renamed from: bg */
    public int mo90463bg(String str, int i, Deque<InterfaceC6913bg> deque, InterfaceC6937bg interfaceC6937bg) {
        char m90464bg;
        int i2 = i;
        while (true) {
            m90464bg = m90464bg(i2, str);
            if (!C6960bg.m90440IL(m90464bg) && !C6960bg.m90439bX(m90464bg)) {
                break;
            }
            i2++;
        }
        if (m90464bg != '(') {
            return interfaceC6937bg.mo90458bg(str, i, deque);
        }
        deque.push(new C6926eo(str.substring(i, i2)));
        return i2 + 1;
    }
}
