package com.bytedance.adsdk.p183IL.p193zx;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.Uq */
/* loaded from: classes3.dex */
public class C6884Uq implements InterfaceC6891bN<PointF> {

    /* renamed from: bg */
    public static final C6884Uq f14789bg = new C6884Uq();

    private C6884Uq() {
    }

    @Override // com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN
    /* renamed from: bg */
    public PointF mo90496IL(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return C6875Fy.m90574IL(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return C6875Fy.m90574IL(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
