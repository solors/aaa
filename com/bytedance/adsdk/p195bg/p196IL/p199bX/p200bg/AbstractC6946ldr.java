package com.bytedance.adsdk.p195bg.p196IL.p199bX.p200bg;

import com.bytedance.adsdk.p195bg.p196IL.p197IL.InterfaceC6913bg;
import com.bytedance.adsdk.p195bg.p196IL.p199bX.InterfaceC6937bg;
import com.bytedance.adsdk.p195bg.p196IL.p202zx.C6960bg;
import java.util.Deque;

/* renamed from: com.bytedance.adsdk.bg.IL.bX.bg.ldr */
/* loaded from: classes3.dex */
public abstract class AbstractC6946ldr {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: IL */
    public int m90465IL(int i, String str) {
        while (C6960bg.m90438bg(m90464bg(i, str))) {
            i++;
        }
        return i;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: bg */
    public char m90464bg(int i, String str) {
        if (i >= str.length()) {
            return (char) 26;
        }
        return str.charAt(i);
    }

    /* renamed from: bg */
    public abstract int mo90463bg(String str, int i, Deque<InterfaceC6913bg> deque, InterfaceC6937bg interfaceC6937bg);
}
