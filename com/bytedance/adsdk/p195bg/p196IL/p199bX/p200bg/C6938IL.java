package com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg;

import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6917LZ;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import com.bytedance.adsdk.p195bg.p204bg.C6973bg;
import java.util.Deque;

/* renamed from: com.bytedance.adsdk.bg.IL.bX.bg.IL */
/* loaded from: classes3.dex */
public class C6938IL extends AbstractC6946ldr {
    @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.AbstractC6946ldr
    /* renamed from: bg */
    public int mo90463bg(String str, int i, Deque<InterfaceC6913bg> deque, InterfaceC6937bg interfaceC6937bg) {
        if ('\'' != m90464bg(i, str)) {
            return interfaceC6937bg.mo90458bg(str, i, deque);
        }
        int i2 = i + 1;
        int length = str.length();
        int i3 = i2;
        while (i3 < length && m90464bg(i3, str) != '\'') {
            i3++;
        }
        if (m90464bg(i3, str) == '\'') {
            deque.push(new C6917LZ(str.substring(i2, i3)));
            return i3 + 1;
        }
        throw new C6973bg("String expression not surrounded by '", str.substring(i2 - 1));
    }
}
