package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.ldr.C6863ldr;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6779WR;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.Uw */
/* loaded from: classes3.dex */
class C6885Uw {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C6779WR m90547bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_OBJECT) {
            z = true;
        } else {
            z = false;
        }
        return new C6779WR(c6832iR, C6880LZ.m90557bg(jsonReader, c6832iR, C6863ldr.m90621bg(), DDQ.f14783bg, z, false));
    }
}
