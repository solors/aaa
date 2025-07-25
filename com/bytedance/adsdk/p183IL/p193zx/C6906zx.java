package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6719bg;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.zx */
/* loaded from: classes3.dex */
class C6906zx {
    /* renamed from: IL */
    private static C6719bg m90491IL(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        jsonReader.beginObject();
        C6719bg c6719bg = null;
        while (true) {
            boolean z = false;
            while (jsonReader.hasNext()) {
                String nextName = jsonReader.nextName();
                nextName.hashCode();
                if (!nextName.equals("v")) {
                    if (!nextName.equals("ty")) {
                        jsonReader.skipValue();
                    } else if (jsonReader.nextInt() == 0) {
                        z = true;
                    }
                } else if (z) {
                    c6719bg = new C6719bg(C6895eqN.m90520bg(jsonReader, c6832iR));
                } else {
                    jsonReader.skipValue();
                }
            }
            jsonReader.endObject();
            return c6719bg;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C6719bg m90490bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        C6719bg c6719bg = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    C6719bg m90491IL = m90491IL(jsonReader, c6832iR);
                    if (m90491IL != null) {
                        c6719bg = m90491IL;
                    }
                }
                jsonReader.endArray();
            }
        }
        return c6719bg;
    }
}
