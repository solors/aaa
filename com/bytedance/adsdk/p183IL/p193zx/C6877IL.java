package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6752IL;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6756VB;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6759bg;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.IL */
/* loaded from: classes3.dex */
public class C6877IL {
    /* renamed from: IL */
    private static C6756VB m90569IL(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        jsonReader.beginObject();
        C6759bg c6759bg = null;
        C6759bg c6759bg2 = null;
        C6752IL c6752il = null;
        C6752IL c6752il2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 116:
                    if (nextName.equals("t")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        c = 2;
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c6752il2 = C6895eqN.m90520bg(jsonReader, c6832iR);
                    break;
                case 1:
                    c6759bg = C6895eqN.m90516iR(jsonReader, c6832iR);
                    break;
                case 2:
                    c6759bg2 = C6895eqN.m90516iR(jsonReader, c6832iR);
                    break;
                case 3:
                    c6752il = C6895eqN.m90520bg(jsonReader, c6832iR);
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C6756VB(c6759bg, c6759bg2, c6752il, c6752il2);
    }

    /* renamed from: bg */
    public static C6756VB m90568bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        jsonReader.beginObject();
        C6756VB c6756vb = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("a")) {
                jsonReader.skipValue();
            } else {
                c6756vb = m90569IL(jsonReader, c6832iR);
            }
        }
        jsonReader.endObject();
        if (c6756vb == null) {
            return new C6756VB(null, null, null, null);
        }
        return c6756vb;
    }
}
