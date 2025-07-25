package com.bytedance.sdk.openadsdk.xxp.p362bg;

import android.graphics.Bitmap;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7754eqN;
import java.util.List;
import java.util.Map;

/* renamed from: com.bytedance.sdk.openadsdk.xxp.bg.IL */
/* loaded from: classes3.dex */
public class C9592IL {

    /* renamed from: IL */
    private byte[] f21393IL;

    /* renamed from: bX */
    private Bitmap f21394bX;

    /* renamed from: bg */
    int f21395bg;
    private Bitmap eqN;
    private Map<String, String> ldr;

    /* renamed from: zx */
    private List<Object> f21396zx;

    public C9592IL(byte[] bArr, int i) {
        this.f21394bX = null;
        this.eqN = null;
        this.f21396zx = null;
        this.ldr = null;
        this.f21393IL = bArr;
        this.f21395bg = i;
    }

    /* renamed from: IL */
    public Bitmap m82315IL() {
        return this.eqN;
    }

    /* renamed from: bX */
    public byte[] m82314bX() {
        try {
            if (this.f21393IL == null) {
                this.f21393IL = C7754eqN.m87835bg(this.f21394bX);
            }
        } catch (OutOfMemoryError e) {
            C7741PX.m87873bg("GifRequestResult", e.getMessage());
        }
        return this.f21393IL;
    }

    /* renamed from: bg */
    public Bitmap m82313bg() {
        return this.f21394bX;
    }

    public boolean eqN() {
        if (this.f21394bX != null) {
            return true;
        }
        byte[] bArr = this.f21393IL;
        if (bArr != null && bArr.length > 0) {
            return true;
        }
        return false;
    }

    public C9592IL(Bitmap bitmap, Bitmap bitmap2, int i) {
        this.f21393IL = null;
        this.f21396zx = null;
        this.ldr = null;
        this.eqN = bitmap2;
        this.f21394bX = bitmap;
        this.f21395bg = i;
    }
}
