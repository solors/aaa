package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import com.bytedance.adsdk.p183IL.C6687WR;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.C6812eqN;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.xxp */
/* loaded from: classes3.dex */
public class C6729xxp implements InterfaceC6718bX {

    /* renamed from: IL */
    private final List<InterfaceC6718bX> f14333IL;

    /* renamed from: bX */
    private final boolean f14334bX;

    /* renamed from: bg */
    private final String f14335bg;

    public C6729xxp(String str, List<InterfaceC6718bX> list, boolean z) {
        this.f14335bg = str;
        this.f14333IL = list;
        this.f14334bX = z;
    }

    /* renamed from: IL */
    public List<InterfaceC6718bX> m91003IL() {
        return this.f14333IL;
    }

    /* renamed from: bX */
    public boolean m91002bX() {
        return this.f14334bX;
    }

    /* renamed from: bg */
    public String m91001bg() {
        return this.f14335bg;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f14335bg + "' Shapes: " + Arrays.toString(this.f14333IL.toArray()) + '}';
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p186IL.InterfaceC6718bX
    /* renamed from: bg */
    public InterfaceC6807bX mo90894bg(C6687WR c6687wr, C6832iR c6832iR, AbstractC6742bg abstractC6742bg) {
        return new C6812eqN(c6687wr, abstractC6742bg, this, c6832iR);
    }
}
