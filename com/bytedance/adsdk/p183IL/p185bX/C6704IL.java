package com.bytedance.adsdk.p183IL.p185bX;

import android.graphics.PointF;
import com.bytedance.component.sdk.annotation.ColorInt;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.bX.IL */
/* loaded from: classes3.dex */
public class C6704IL {

    /* renamed from: IL */
    public String f14232IL;
    @ColorInt

    /* renamed from: Kg */
    public int f14233Kg;

    /* renamed from: PX */
    public PointF f14234PX;

    /* renamed from: Ta */
    public PointF f14235Ta;

    /* renamed from: VB */
    public boolean f14236VB;
    @ColorInt

    /* renamed from: WR */
    public int f14237WR;

    /* renamed from: bX */
    public float f14238bX;

    /* renamed from: bg */
    public String f14239bg;

    /* renamed from: eo */
    public float f14240eo;
    public EnumC6705bg eqN;

    /* renamed from: iR */
    public float f14241iR;
    public float ldr;

    /* renamed from: zx */
    public int f14242zx;

    /* renamed from: com.bytedance.adsdk.IL.bX.IL$bg */
    /* loaded from: classes3.dex */
    public enum EnumC6705bg {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C6704IL(String str, String str2, float f, EnumC6705bg enumC6705bg, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        m91075bg(str, str2, f, enumC6705bg, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    /* renamed from: bg */
    public void m91075bg(String str, String str2, float f, EnumC6705bg enumC6705bg, int i, float f2, float f3, @ColorInt int i2, @ColorInt int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.f14239bg = str;
        this.f14232IL = str2;
        this.f14238bX = f;
        this.eqN = enumC6705bg;
        this.f14242zx = i;
        this.ldr = f2;
        this.f14241iR = f3;
        this.f14233Kg = i2;
        this.f14237WR = i3;
        this.f14240eo = f4;
        this.f14236VB = z;
        this.f14234PX = pointF;
        this.f14235Ta = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f14239bg.hashCode() * 31) + this.f14232IL.hashCode()) * 31) + this.f14238bX)) * 31) + this.eqN.ordinal()) * 31) + this.f14242zx;
        long floatToRawIntBits = Float.floatToRawIntBits(this.ldr);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f14233Kg;
    }

    public C6704IL() {
    }
}
