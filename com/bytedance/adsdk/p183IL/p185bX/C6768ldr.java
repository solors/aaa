package com.bytedance.adsdk.p183IL.p185bX;

/* renamed from: com.bytedance.adsdk.IL.bX.ldr */
/* loaded from: classes3.dex */
public class C6768ldr {

    /* renamed from: IL */
    public final float f14469IL;

    /* renamed from: bX */
    private final String f14470bX;

    /* renamed from: bg */
    public final float f14471bg;

    public C6768ldr(String str, float f, float f2) {
        this.f14470bX = str;
        this.f14469IL = f2;
        this.f14471bg = f;
    }

    /* renamed from: bg */
    public boolean m90879bg(String str) {
        if (this.f14470bX.equalsIgnoreCase(str)) {
            return true;
        }
        if (this.f14470bX.endsWith("\r")) {
            String str2 = this.f14470bX;
            if (str2.substring(0, str2.length() - 1).equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }
}
