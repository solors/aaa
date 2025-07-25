package com.bytedance.adsdk.p183IL.p185bX.p188bg;

import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6722eqN;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.AbstractC6781bg;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6794zx;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.bX.bg.bX */
/* loaded from: classes3.dex */
public class C6758bX extends AbstractC6764yDt<C6722eqN, C6722eqN> {
    public C6758bX(List<C6838bg<C6722eqN>> list) {
        super(m90889bg(list));
    }

    /* renamed from: bg */
    private static List<C6838bg<C6722eqN>> m90889bg(List<C6838bg<C6722eqN>> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, m90890bg(list.get(i)));
        }
        return list;
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.AbstractC6764yDt, com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: IL */
    public /* bridge */ /* synthetic */ boolean mo90887IL() {
        return super.mo90887IL();
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.AbstractC6764yDt, com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: bX */
    public /* bridge */ /* synthetic */ List mo90886bX() {
        return super.mo90886bX();
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.AbstractC6764yDt
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    /* renamed from: bg */
    private static C6838bg<C6722eqN> m90890bg(C6838bg<C6722eqN> c6838bg) {
        C6722eqN c6722eqN = c6838bg.f14689bg;
        C6722eqN c6722eqN2 = c6838bg.f14681IL;
        if (c6722eqN == null || c6722eqN2 == null || c6722eqN.m91028bg().length == c6722eqN2.m91028bg().length) {
            return c6838bg;
        }
        float[] m90888bg = m90888bg(c6722eqN.m91028bg(), c6722eqN2.m91028bg());
        return c6838bg.m90714bg(c6722eqN.m91025bg(m90888bg), c6722eqN2.m91025bg(m90888bg));
    }

    /* renamed from: bg */
    static float[] m90888bg(float[] fArr, float[] fArr2) {
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        System.arraycopy(fArr, 0, fArr3, 0, fArr.length);
        System.arraycopy(fArr2, 0, fArr3, fArr.length, fArr2.length);
        Arrays.sort(fArr3);
        float f = Float.NaN;
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            float f2 = fArr3[i2];
            if (f2 != f) {
                fArr3[i] = f2;
                i++;
                f = fArr3[i2];
            }
        }
        return Arrays.copyOfRange(fArr3, 0, i);
    }

    @Override // com.bytedance.adsdk.p183IL.p185bX.p188bg.InterfaceC6755Ta
    /* renamed from: bg */
    public AbstractC6781bg<C6722eqN, C6722eqN> mo90885bg() {
        return new C6794zx(this.f14461bg);
    }
}
