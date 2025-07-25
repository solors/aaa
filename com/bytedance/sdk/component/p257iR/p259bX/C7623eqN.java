package com.bytedance.sdk.component.p257iR.p259bX;

import java.util.Map;

/* renamed from: com.bytedance.sdk.component.iR.bX.eqN */
/* loaded from: classes3.dex */
public class C7623eqN {

    /* renamed from: bg */
    public boolean f16635bg = false;

    /* renamed from: IL */
    public boolean f16627IL = true;

    /* renamed from: bX */
    public Map<String, Integer> f16634bX = null;
    public Map<String, String> eqN = null;

    /* renamed from: zx */
    public int f16638zx = 10;
    public int ldr = 1;

    /* renamed from: iR */
    public int f16637iR = 1;

    /* renamed from: Kg */
    public int f16628Kg = 10;

    /* renamed from: WR */
    public int f16633WR = 1;

    /* renamed from: eo */
    public int f16636eo = 1;

    /* renamed from: VB */
    public int f16632VB = 900;

    /* renamed from: PX */
    public int f16630PX = 120;

    /* renamed from: Ta */
    public String f16631Ta = null;
    public int yDt = 0;

    /* renamed from: Lq */
    public long f16629Lq = 0;

    public String toString() {
        int i;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(" localEnable: ");
        sb2.append(this.f16635bg);
        sb2.append(" probeEnable: ");
        sb2.append(this.f16627IL);
        sb2.append(" hostFilter: ");
        Map<String, Integer> map = this.f16634bX;
        int i2 = 0;
        if (map != null) {
            i = map.size();
        } else {
            i = 0;
        }
        sb2.append(i);
        sb2.append(" hostMap: ");
        Map<String, String> map2 = this.eqN;
        if (map2 != null) {
            i2 = map2.size();
        }
        sb2.append(i2);
        sb2.append(" reqTo: ");
        sb2.append(this.f16638zx);
        sb2.append("#");
        sb2.append(this.ldr);
        sb2.append("#");
        sb2.append(this.f16637iR);
        sb2.append(" reqErr: ");
        sb2.append(this.f16628Kg);
        sb2.append("#");
        sb2.append(this.f16633WR);
        sb2.append("#");
        sb2.append(this.f16636eo);
        sb2.append(" updateInterval: ");
        sb2.append(this.f16632VB);
        sb2.append(" updateRandom: ");
        sb2.append(this.f16630PX);
        sb2.append(" httpBlack: ");
        sb2.append(this.f16631Ta);
        return sb2.toString();
    }
}
