package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import com.bytedance.adsdk.p183IL.C6687WR;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p187bX.AbstractC6742bg;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.C6801PX;
import com.bytedance.adsdk.p183IL.p189bg.p191bg.InterfaceC6807bX;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.WR */
/* loaded from: classes3.dex */
public class C6716WR implements InterfaceC6718bX {

    /* renamed from: IL */
    private final EnumC6717bg f14281IL;

    /* renamed from: bX */
    private final boolean f14282bX;

    /* renamed from: bg */
    private final String f14283bg;

    /* renamed from: com.bytedance.adsdk.IL.bX.IL.WR$bg */
    /* loaded from: classes3.dex */
    public enum EnumC6717bg {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: bg */
        public static EnumC6717bg m91042bg(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public C6716WR(String str, EnumC6717bg enumC6717bg, boolean z) {
        this.f14283bg = str;
        this.f14281IL = enumC6717bg;
        this.f14282bX = z;
    }

    /* renamed from: IL */
    public EnumC6717bg m91045IL() {
        return this.f14281IL;
    }

    /* renamed from: bX */
    public boolean m91044bX() {
        return this.f14282bX;
    }

    /* renamed from: bg */
    public String m91043bg() {
        return this.f14283bg;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f14281IL + '}';
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p186IL.InterfaceC6718bX
    /* renamed from: bg */
    public InterfaceC6807bX mo90894bg(C6687WR c6687wr, C6832iR c6832iR, AbstractC6742bg abstractC6742bg) {
        return new C6801PX(this);
    }
}
