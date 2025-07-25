package com.bytedance.adsdk.p183IL.p185bX;

import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6729xxp;
import com.bytedance.component.sdk.annotation.RestrictTo;
import java.util.List;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.bX.eqN */
/* loaded from: classes3.dex */
public class C6766eqN {

    /* renamed from: IL */
    private final char f14463IL;

    /* renamed from: bX */
    private final double f14464bX;

    /* renamed from: bg */
    private final List<C6729xxp> f14465bg;
    private final double eqN;
    private final String ldr;

    /* renamed from: zx */
    private final String f14466zx;

    public C6766eqN(List<C6729xxp> list, char c, double d, double d2, String str, String str2) {
        this.f14465bg = list;
        this.f14463IL = c;
        this.f14464bX = d;
        this.eqN = d2;
        this.f14466zx = str;
        this.ldr = str2;
    }

    /* renamed from: bg */
    public static int m90882bg(char c, String str, String str2) {
        return (((c * 31) + str.hashCode()) * 31) + str2.hashCode();
    }

    /* renamed from: IL */
    public double m90884IL() {
        return this.eqN;
    }

    public int hashCode() {
        return m90882bg(this.f14463IL, this.ldr, this.f14466zx);
    }

    /* renamed from: bg */
    public List<C6729xxp> m90883bg() {
        return this.f14465bg;
    }
}
