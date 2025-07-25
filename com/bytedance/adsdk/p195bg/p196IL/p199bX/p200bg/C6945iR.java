package com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6918Lq;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6960bg;
import java.util.Deque;

/* renamed from: com.bytedance.adsdk.bg.IL.bX.bg.iR */
/* loaded from: classes3.dex */
public class C6945iR extends AbstractC6946ldr {
    /* renamed from: bg */
    private boolean m90466bg(String str, int i, Deque<InterfaceC6913bg> deque) {
        if ('-' == m90464bg(i, str)) {
            if (deque.peek() == null || EnumC6953bX.m90451bg(deque.peek().mo90469bg())) {
                if (C6960bg.m90439bX(m90464bg(i + 1, str))) {
                    return true;
                }
                throw new IllegalArgumentException("Unrecognized - symbol, not a negative number or operator, problem range:" + str.substring(0, i));
            }
            return false;
        }
        return C6960bg.m90439bX(m90464bg(i, str));
    }

    @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.AbstractC6946ldr
    /* renamed from: bg */
    public int mo90463bg(String str, int i, Deque<InterfaceC6913bg> deque, InterfaceC6937bg interfaceC6937bg) {
        char m90464bg;
        if (!m90466bg(str, i, deque)) {
            return interfaceC6937bg.mo90458bg(str, i, deque);
        }
        int i2 = m90464bg(i, str) == '-' ? i + 1 : i;
        boolean z = false;
        while (true) {
            m90464bg = m90464bg(i2, str);
            if (C6960bg.m90439bX(m90464bg) || (!z && m90464bg == '.')) {
                i2++;
                if (m90464bg == '.') {
                    z = true;
                }
            }
        }
        if (m90464bg != '.') {
            deque.push(new C6918Lq(str.substring(i, i2)));
            return i2;
        }
        throw new IllegalArgumentException("Illegal negative number format, problem interval:" + str.substring(i, i2));
    }
}
