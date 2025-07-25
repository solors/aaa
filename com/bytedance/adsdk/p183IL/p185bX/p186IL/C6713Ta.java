package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import com.bytedance.adsdk.p183IL.C6687WR;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.C6805VzQ;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.Ta */
/* loaded from: classes3.dex */
public class C6713Ta implements InterfaceC6718bX {

    /* renamed from: IL */
    private final InterfaceC6755Ta<Float, Float> f14272IL;

    /* renamed from: bg */
    private final String f14273bg;

    public C6713Ta(String str, InterfaceC6755Ta<Float, Float> interfaceC6755Ta) {
        this.f14273bg = str;
        this.f14272IL = interfaceC6755Ta;
    }

    /* renamed from: IL */
    public InterfaceC6755Ta<Float, Float> m91054IL() {
        return this.f14272IL;
    }

    /* renamed from: bg */
    public String m91053bg() {
        return this.f14273bg;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p186IL.InterfaceC6718bX
    /* renamed from: bg */
    public InterfaceC6807bX mo90894bg(C6687WR c6687wr, C6832iR c6832iR, AbstractC6742bg abstractC6742bg) {
        return new C6805VzQ(c6687wr, abstractC6742bg, this);
    }
}
