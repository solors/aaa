package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6716WR;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.Ja */
/* loaded from: classes3.dex */
class C6878Ja {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static C6716WR m90566bg(JsonReader jsonReader) throws IOException {
        String str = null;
        C6716WR.EnumC6717bg enumC6717bg = null;
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
                case 3488:
                    if (nextName.equals("mm")) {
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
                    z = jsonReader.nextBoolean();
                    break;
                case 1:
                    enumC6717bg = C6716WR.EnumC6717bg.m91042bg(jsonReader.nextInt());
                    break;
                case 2:
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new C6716WR(str, enumC6717bg, z);
    }
}
