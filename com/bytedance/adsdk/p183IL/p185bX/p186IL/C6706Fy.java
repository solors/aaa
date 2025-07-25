package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import com.bytedance.adsdk.p183IL.C6687WR;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6752IL;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.C6815tC;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.Fy */
/* loaded from: classes3.dex */
public class C6706Fy implements InterfaceC6718bX {

    /* renamed from: IL */
    private final EnumC6707bg f14246IL;

    /* renamed from: bX */
    private final C6752IL f14247bX;

    /* renamed from: bg */
    private final String f14248bg;
    private final C6752IL eqN;
    private final boolean ldr;

    /* renamed from: zx */
    private final C6752IL f14249zx;

    /* renamed from: com.bytedance.adsdk.IL.bX.IL.Fy$bg */
    /* loaded from: classes3.dex */
    public enum EnumC6707bg {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        /* renamed from: bg */
        public static EnumC6707bg m91070bg(int i) {
            if (i != 1) {
                if (i == 2) {
                    return INDIVIDUALLY;
                }
                throw new IllegalArgumentException("Unknown trim path type ".concat(String.valueOf(i)));
            }
            return SIMULTANEOUSLY;
        }
    }

    public C6706Fy(String str, EnumC6707bg enumC6707bg, C6752IL c6752il, C6752IL c6752il2, C6752IL c6752il3, boolean z) {
        this.f14248bg = str;
        this.f14246IL = enumC6707bg;
        this.f14247bX = c6752il;
        this.eqN = c6752il2;
        this.f14249zx = c6752il3;
        this.ldr = z;
    }

    /* renamed from: IL */
    public EnumC6707bg m91074IL() {
        return this.f14246IL;
    }

    /* renamed from: bX */
    public C6752IL m91073bX() {
        return this.eqN;
    }

    /* renamed from: bg */
    public String m91072bg() {
        return this.f14248bg;
    }

    public C6752IL eqN() {
        return this.f14247bX;
    }

    public boolean ldr() {
        return this.ldr;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f14247bX + ", end: " + this.eqN + ", offset: " + this.f14249zx + "}";
    }

    /* renamed from: zx */
    public C6752IL m91071zx() {
        return this.f14249zx;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p186IL.InterfaceC6718bX
    /* renamed from: bg */
    public InterfaceC6807bX mo90894bg(C6687WR c6687wr, C6832iR c6832iR, AbstractC6742bg abstractC6742bg) {
        return new C6815tC(abstractC6742bg, this);
    }
}
