package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6706Fy;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6752IL;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.Dxa */
/* loaded from: classes3.dex */
class Dxa {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C6706Fy m90576bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        String str = null;
        C6706Fy.EnumC6707bg enumC6707bg = null;
        C6752IL c6752il = null;
        C6752IL c6752il2 = null;
        C6752IL c6752il3 = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 101:
                    if (nextName.equals("e")) {
                        c = 0;
                        break;
                    }
                    break;
                case 109:
                    if (nextName.equals("m")) {
                        c = 1;
                        break;
                    }
                    break;
                case 111:
                    if (nextName.equals("o")) {
                        c = 2;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3324:
                    if (nextName.equals("hd")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3519:
                    if (nextName.equals("nm")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    c6752il2 = C6895eqN.m90517bg(jsonReader, c6832iR, false);
                    break;
                case 1:
                    enumC6707bg = C6706Fy.EnumC6707bg.m91070bg(jsonReader.nextInt());
                    break;
                case 2:
                    c6752il3 = C6895eqN.m90517bg(jsonReader, c6832iR, false);
                    break;
                case 3:
                    c6752il = C6895eqN.m90517bg(jsonReader, c6832iR, false);
                    break;
                case 4:
                    z = jsonReader.nextBoolean();
                    break;
                case 5:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C6706Fy(str, enumC6707bg, c6752il, c6752il2, c6752il3, z);
    }
}
