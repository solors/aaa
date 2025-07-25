package com.bytedance.sdk.component.p257iR;

import com.bytedance.sdk.component.p228IL.p229bg.C7214eo;
import java.io.File;
import java.util.Map;

/* renamed from: com.bytedance.sdk.component.iR.IL */
/* loaded from: classes3.dex */
public class C7608IL {

    /* renamed from: IL */
    final String f16579IL;

    /* renamed from: WR */
    private final boolean f16581WR;

    /* renamed from: bX */
    final Map<String, String> f16582bX;

    /* renamed from: bg */
    final int f16583bg;
    final String eqN;

    /* renamed from: iR */
    C7214eo f16585iR;
    final long ldr;

    /* renamed from: zx */
    final long f16586zx;

    /* renamed from: Kg */
    private File f16580Kg = null;

    /* renamed from: eo */
    private byte[] f16584eo = null;

    public C7608IL(boolean z, int i, String str, Map<String, String> map, String str2, long j, long j2) {
        this.f16581WR = z;
        this.f16583bg = i;
        this.f16579IL = str;
        this.f16582bX = map;
        this.eqN = str2;
        this.f16586zx = j;
        this.ldr = j2;
    }

    /* renamed from: IL */
    public String m88414IL() {
        return this.f16579IL;
    }

    /* renamed from: bX */
    public Map<String, String> m88413bX() {
        return this.f16582bX;
    }

    /* renamed from: bg */
    public int m88412bg() {
        return this.f16583bg;
    }

    public String eqN() {
        return this.eqN;
    }

    /* renamed from: iR */
    public C7214eo m88408iR() {
        return this.f16585iR;
    }

    public boolean ldr() {
        return this.f16581WR;
    }

    /* renamed from: zx */
    public File m88407zx() {
        return this.f16580Kg;
    }

    /* renamed from: bg */
    public void m88410bg(File file) {
        this.f16580Kg = file;
    }

    /* renamed from: bg */
    public void m88409bg(byte[] bArr) {
        this.f16584eo = bArr;
    }

    /* renamed from: bg */
    public void m88411bg(C7214eo c7214eo) {
        this.f16585iR = c7214eo;
    }
}
