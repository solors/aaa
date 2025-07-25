package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6752IL;
import com.bytedance.adsdk.p183IL.p185bX.p188bg.C6759bg;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.VB */
/* loaded from: classes3.dex */
public class C6886VB {

    /* renamed from: IL */
    private C6752IL f14790IL;

    /* renamed from: bX */
    private C6752IL f14791bX;

    /* renamed from: bg */
    private C6759bg f14792bg;
    private C6752IL eqN;

    /* renamed from: zx */
    private C6752IL f14793zx;

    /* renamed from: IL */
    private void m90546IL(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        jsonReader.beginObject();
        String str = "";
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("v")) {
                if (!nextName.equals("nm")) {
                    jsonReader.skipValue();
                } else {
                    str = jsonReader.nextString();
                }
            } else {
                str.hashCode();
                char c = 65535;
                switch (str.hashCode()) {
                    case 353103893:
                        if (str.equals("Distance")) {
                            c = 0;
                            break;
                        }
                        break;
                    case 397447147:
                        if (str.equals("Opacity")) {
                            c = 1;
                            break;
                        }
                        break;
                    case 1041377119:
                        if (str.equals("Direction")) {
                            c = 2;
                            break;
                        }
                        break;
                    case 1379387491:
                        if (str.equals("Shadow Color")) {
                            c = 3;
                            break;
                        }
                        break;
                    case 1383710113:
                        if (str.equals("Softness")) {
                            c = 4;
                            break;
                        }
                        break;
                }
                switch (c) {
                    case 0:
                        this.eqN = C6895eqN.m90520bg(jsonReader, c6832iR);
                        continue;
                    case 1:
                        this.f14790IL = C6895eqN.m90517bg(jsonReader, c6832iR, false);
                        continue;
                    case 2:
                        this.f14791bX = C6895eqN.m90517bg(jsonReader, c6832iR, false);
                        continue;
                    case 3:
                        this.f14792bg = C6895eqN.m90516iR(jsonReader, c6832iR);
                        continue;
                    case 4:
                        this.f14793zx = C6895eqN.m90520bg(jsonReader, c6832iR);
                        continue;
                    default:
                        jsonReader.skipValue();
                        continue;
                }
            }
        }
        jsonReader.endObject();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public C6894eo m90545bg(JsonReader jsonReader, C6832iR c6832iR) throws IOException {
        C6752IL c6752il;
        C6752IL c6752il2;
        C6752IL c6752il3;
        C6752IL c6752il4;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("ef")) {
                jsonReader.skipValue();
            } else {
                jsonReader.beginArray();
                while (jsonReader.hasNext()) {
                    m90546IL(jsonReader, c6832iR);
                }
                jsonReader.endArray();
            }
        }
        C6759bg c6759bg = this.f14792bg;
        if (c6759bg != null && (c6752il = this.f14790IL) != null && (c6752il2 = this.f14791bX) != null && (c6752il3 = this.eqN) != null && (c6752il4 = this.f14793zx) != null) {
            return new C6894eo(c6759bg, c6752il, c6752il2, c6752il3, c6752il4);
        }
        return null;
    }
}
