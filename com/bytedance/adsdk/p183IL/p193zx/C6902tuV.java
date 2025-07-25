package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.tuV */
/* loaded from: classes3.dex */
public class C6902tuV implements InterfaceC6891bN<Integer> {

    /* renamed from: bg */
    public static final C6902tuV f14803bg = new C6902tuV();

    private C6902tuV() {
    }

    @Override // com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN
    /* renamed from: bg */
    public Integer mo90496IL(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(C6875Fy.m90575IL(jsonReader) * f));
    }
}
