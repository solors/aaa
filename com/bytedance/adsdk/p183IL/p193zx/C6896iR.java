package com.bytedance.adsdk.p183IL.p193zx;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.iR */
/* loaded from: classes3.dex */
public class C6896iR implements InterfaceC6891bN<Integer> {

    /* renamed from: bg */
    public static final C6896iR f14801bg = new C6896iR();

    private C6896iR() {
    }

    @Override // com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN
    /* renamed from: bg */
    public Integer mo90496IL(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        double d;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        double nextDouble = jsonReader.nextDouble();
        double nextDouble2 = jsonReader.nextDouble();
        double nextDouble3 = jsonReader.nextDouble();
        if (jsonReader.peek() == JsonToken.NUMBER) {
            d = jsonReader.nextDouble();
        } else {
            d = 1.0d;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (nextDouble <= 1.0d && nextDouble2 <= 1.0d && nextDouble3 <= 1.0d) {
            nextDouble *= 255.0d;
            nextDouble2 *= 255.0d;
            nextDouble3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) nextDouble, (int) nextDouble2, (int) nextDouble3));
    }
}
