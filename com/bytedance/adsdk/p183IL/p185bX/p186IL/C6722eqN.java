package com.bytedance.adsdk.p183IL.p185bX.p186IL;

import com.bytedance.adsdk.p183IL.ldr.C6859IL;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import java.util.Arrays;

/* renamed from: com.bytedance.adsdk.IL.bX.IL.eqN */
/* loaded from: classes3.dex */
public class C6722eqN {

    /* renamed from: IL */
    private final int[] f14301IL;

    /* renamed from: bg */
    private final float[] f14302bg;

    public C6722eqN(float[] fArr, int[] iArr) {
        this.f14302bg = fArr;
        this.f14301IL = iArr;
    }

    /* renamed from: IL */
    public int[] m91030IL() {
        return this.f14301IL;
    }

    /* renamed from: bX */
    public int m91029bX() {
        return this.f14301IL.length;
    }

    /* renamed from: bg */
    public float[] m91028bg() {
        return this.f14302bg;
    }

    /* renamed from: bg */
    public void m91026bg(C6722eqN c6722eqN, C6722eqN c6722eqN2, float f) {
        if (c6722eqN.f14301IL.length == c6722eqN2.f14301IL.length) {
            for (int i = 0; i < c6722eqN.f14301IL.length; i++) {
                this.f14302bg[i] = C6868zx.m90600bg(c6722eqN.f14302bg[i], c6722eqN2.f14302bg[i], f);
                this.f14301IL[i] = C6859IL.m90650bg(f, c6722eqN.f14301IL[i], c6722eqN2.f14301IL[i]);
            }
            return;
        }
        throw new IllegalArgumentException("Cannot interpolate between gradients. Lengths vary (" + c6722eqN.f14301IL.length + " vs " + c6722eqN2.f14301IL.length + ")");
    }

    /* renamed from: bg */
    public C6722eqN m91025bg(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = m91027bg(fArr[i]);
        }
        return new C6722eqN(fArr, iArr);
    }

    /* renamed from: bg */
    private int m91027bg(float f) {
        int binarySearch = Arrays.binarySearch(this.f14302bg, f);
        if (binarySearch >= 0) {
            return this.f14301IL[binarySearch];
        }
        int i = -(binarySearch + 1);
        if (i == 0) {
            return this.f14301IL[0];
        }
        int[] iArr = this.f14301IL;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.f14302bg;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return C6859IL.m90650bg((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }
}
