package com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6954bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6928iR;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6930rri;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6960bg;
import java.util.Deque;

/* renamed from: com.bytedance.adsdk.bg.IL.bX.bg.bX */
/* loaded from: classes3.dex */
public class C6941bX extends AbstractC6946ldr {
    @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.AbstractC6946ldr
    /* renamed from: bg */
    public int mo90463bg(String str, int i, Deque<InterfaceC6913bg> deque, InterfaceC6937bg interfaceC6937bg) {
        if (!C6960bg.m90440IL(m90464bg(i, str))) {
            return interfaceC6937bg.mo90458bg(str, i, deque);
        }
        return m90467bg(str, i, deque);
    }

    /* renamed from: bg */
    private int m90467bg(String str, int i, Deque<InterfaceC6913bg> deque) {
        int i2;
        int i3 = 0;
        while (true) {
            i2 = i3 + i;
            char m90464bg = m90464bg(i2, str);
            if (!C6960bg.m90440IL(m90464bg) && !C6960bg.m90439bX(m90464bg) && '.' != m90464bg && '[' != m90464bg && ']' != m90464bg && '_' != m90464bg && '-' != m90464bg) {
                break;
            }
            i3++;
        }
        String substring = str.substring(i, i2);
        if (EnumC6954bg.m90449bg(substring) != null) {
            deque.push(new C6928iR(substring));
        } else {
            deque.push(new C6930rri(substring));
        }
        return i2;
    }
}
