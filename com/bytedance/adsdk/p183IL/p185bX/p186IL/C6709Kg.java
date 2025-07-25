package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6753Kg;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6761eqN;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.Kg */
/* loaded from: classes3.dex */
public class C6709Kg {

    /* renamed from: IL */
    private final C6753Kg f14257IL;

    /* renamed from: bX */
    private final C6761eqN f14258bX;

    /* renamed from: bg */
    private final EnumC6710bg f14259bg;
    private final boolean eqN;

    /* renamed from: com.bytedance.adsdk.IL.bX.IL.Kg$bg */
    /* loaded from: classes3.dex */
    public enum EnumC6710bg {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public C6709Kg(EnumC6710bg enumC6710bg, C6753Kg c6753Kg, C6761eqN c6761eqN, boolean z) {
        this.f14259bg = enumC6710bg;
        this.f14257IL = c6753Kg;
        this.f14258bX = c6761eqN;
        this.eqN = z;
    }

    /* renamed from: IL */
    public C6753Kg m91065IL() {
        return this.f14257IL;
    }

    /* renamed from: bX */
    public C6761eqN m91064bX() {
        return this.f14258bX;
    }

    /* renamed from: bg */
    public EnumC6710bg m91063bg() {
        return this.f14259bg;
    }

    public boolean eqN() {
        return this.eqN;
    }
}
