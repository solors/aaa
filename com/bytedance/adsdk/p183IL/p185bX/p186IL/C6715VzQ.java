package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import com.bytedance.adsdk.p183IL.C6687WR;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6753Kg;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.C6816tuV;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.VzQ */
/* loaded from: classes3.dex */
public class C6715VzQ implements InterfaceC6718bX {

    /* renamed from: IL */
    private final int f14278IL;

    /* renamed from: bX */
    private final C6753Kg f14279bX;

    /* renamed from: bg */
    private final String f14280bg;
    private final boolean eqN;

    public C6715VzQ(String str, int i, C6753Kg c6753Kg, boolean z) {
        this.f14280bg = str;
        this.f14278IL = i;
        this.f14279bX = c6753Kg;
        this.eqN = z;
    }

    /* renamed from: IL */
    public C6753Kg m91048IL() {
        return this.f14279bX;
    }

    /* renamed from: bX */
    public boolean m91047bX() {
        return this.eqN;
    }

    /* renamed from: bg */
    public String m91046bg() {
        return this.f14280bg;
    }

    public String toString() {
        return "ShapePath{name=" + this.f14280bg + ", index=" + this.f14278IL + '}';
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p186IL.InterfaceC6718bX
    /* renamed from: bg */
    public InterfaceC6807bX mo90894bg(C6687WR c6687wr, C6832iR c6832iR, AbstractC6742bg abstractC6742bg) {
        return new C6816tuV(c6687wr, abstractC6742bg, this);
    }
}
