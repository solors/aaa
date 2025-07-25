package com.bytedance.adsdk.p183IL.p185bX;

import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.C6872yDt;
import com.bytedance.component.sdk.annotation.RestrictTo;

@RestrictTo({RestrictTo.Scope.LIBRARY})
/* renamed from: com.bytedance.adsdk.IL.bX.zx */
/* loaded from: classes3.dex */
public class C6769zx {

    /* renamed from: bg */
    private static final C6769zx f14472bg = new C6769zx();

    /* renamed from: IL */
    private final C6872yDt<String, C6832iR> f14473IL = new C6872yDt<>(20);

    C6769zx() {
    }

    /* renamed from: bg */
    public static C6769zx m90878bg() {
        return f14472bg;
    }

    /* renamed from: bg */
    public C6832iR m90877bg(String str) {
        if (str == null) {
            return null;
        }
        return this.f14473IL.m90586bg((C6872yDt<String, C6832iR>) str);
    }

    /* renamed from: bg */
    public void m90876bg(String str, C6832iR c6832iR) {
        if (str == null) {
            return;
        }
        this.f14473IL.m90585bg(str, c6832iR);
    }
}
