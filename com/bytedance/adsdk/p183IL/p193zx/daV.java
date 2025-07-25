package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6713Ta;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6752IL;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.daV */
/* loaded from: classes3.dex */
public class daV {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C6713Ta m90528bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        String str = null;
        C6752IL c6752il = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 114:
                    if (nextName.equals("r")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 1;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c6752il = C6895eqN.m90517bg(jsonReader, c6832iR, true);
                    break;
                case 1:
                    z = jsonReader.nextBoolean();
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        if (z) {
            return null;
        }
        return new C6713Ta(str, c6752il);
    }
}
