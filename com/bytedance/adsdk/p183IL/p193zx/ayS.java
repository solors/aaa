package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p183IL.p192iR.C6837bX;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.ayS */
/* loaded from: classes3.dex */
public class ayS implements InterfaceC6891bN<C6837bX> {

    /* renamed from: bg */
    public static final ayS f14796bg = new ayS();

    private ayS() {
    }

    @Override // com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN
    /* renamed from: bg */
    public C6837bX mo90496IL(JsonReader jsonReader, float f) throws IOException {
        boolean z;
        if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new C6837bX((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
