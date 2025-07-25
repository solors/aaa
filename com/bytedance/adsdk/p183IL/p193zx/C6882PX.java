package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.PX */
/* loaded from: classes3.dex */
public class C6882PX implements InterfaceC6891bN<Float> {

    /* renamed from: bg */
    public static final C6882PX f14788bg = new C6882PX();

    private C6882PX() {
    }

    @Override // com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN
    /* renamed from: bg */
    public Float mo90496IL(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(C6875Fy.m90575IL(jsonReader) * f);
    }
}
