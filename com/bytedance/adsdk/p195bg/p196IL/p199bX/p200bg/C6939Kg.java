package com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg;

import com.bytedance.adsdk.p195bg.p196IL.eqN.EnumC6953bX;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p197IL.p198bg.C6934xxp;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6960bg;
import java.util.Deque;

/* renamed from: com.bytedance.adsdk.bg.IL.bX.bg.Kg */
/* loaded from: classes3.dex */
public class C6939Kg extends AbstractC6946ldr {
    @Override // com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg.AbstractC6946ldr
    /* renamed from: bg */
    public int mo90463bg(String str, int i, Deque<InterfaceC6913bg> deque, InterfaceC6937bg interfaceC6937bg) {
        if (!C6960bg.eqN(m90464bg(i, str))) {
            return interfaceC6937bg.mo90458bg(str, i, deque);
        }
        int i2 = i + 1;
        String str2 = new String(new char[]{m90464bg(i, str), m90464bg(i2, str)});
        if (EnumC6953bX.m90450bg(str2) != null) {
            deque.push(new C6934xxp(EnumC6953bX.m90450bg(str2)));
            return i + 2;
        }
        String valueOf = String.valueOf(m90464bg(i, str));
        if (EnumC6953bX.m90450bg(valueOf) != null) {
            deque.push(new C6934xxp(EnumC6953bX.m90450bg(valueOf)));
            return i2;
        }
        throw new IllegalArgumentException("Unrecognized:" + valueOf + "examine:" + str.substring(0, i));
    }
}
