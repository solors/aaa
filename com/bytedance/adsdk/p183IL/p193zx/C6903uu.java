package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6715VzQ;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6753Kg;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.uu */
/* loaded from: classes3.dex */
class C6903uu {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C6715VzQ m90494bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        String str = null;
        C6753Kg c6753Kg = null;
        int i = 0;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 0;
                        break;
                    }
                    break;
                case 3432:
                    if (nextName.equals("ks")) {
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
                case 104415:
                    if (nextName.equals("ind")) {
                        c = 3;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    z = jsonReader.nextBoolean();
                    break;
                case 1:
                    c6753Kg = C6895eqN.m90515zx(jsonReader, c6832iR);
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                case 3:
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C6715VzQ(str, i, c6753Kg, z);
    }
}
