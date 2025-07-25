package com.bytedance.adsdk.p183IL.p193zx;

import android.graphics.PointF;
import android.util.JsonReader;
import com.bytedance.adsdk.p183IL.p185bX.C6704IL;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import java.io.IOException;

/* renamed from: com.bytedance.adsdk.IL.zx.WR */
/* loaded from: classes3.dex */
public class C6890WR implements InterfaceC6891bN<C6704IL> {

    /* renamed from: bg */
    public static final C6890WR f14794bg = new C6890WR();

    private C6890WR() {
    }

    @Override // com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN
    /* renamed from: bg */
    public C6704IL mo90496IL(JsonReader jsonReader, float f) throws IOException {
        C6704IL.EnumC6705bg enumC6705bg = C6704IL.EnumC6705bg.CENTER;
        jsonReader.beginObject();
        C6704IL.EnumC6705bg enumC6705bg2 = enumC6705bg;
        String str = null;
        String str2 = null;
        PointF pointF = null;
        PointF pointF2 = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        float f4 = 0.0f;
        float f5 = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            char c = 65535;
            switch (nextName.hashCode()) {
                case 102:
                    if (nextName.equals(InneractiveMediationDefs.GENDER_FEMALE)) {
                        c = 0;
                        break;
                    }
                    break;
                case 106:
                    if (nextName.equals("j")) {
                        c = 1;
                        break;
                    }
                    break;
                case 115:
                    if (nextName.equals("s")) {
                        c = 2;
                        break;
                    }
                    break;
                case 116:
                    if (nextName.equals("t")) {
                        c = 3;
                        break;
                    }
                    break;
                case 3261:
                    if (nextName.equals("fc")) {
                        c = 4;
                        break;
                    }
                    break;
                case 3452:
                    if (nextName.equals("lh")) {
                        c = 5;
                        break;
                    }
                    break;
                case 3463:
                    if (nextName.equals("ls")) {
                        c = 6;
                        break;
                    }
                    break;
                case 3543:
                    if (nextName.equals("of")) {
                        c = 7;
                        break;
                    }
                    break;
                case 3587:
                    if (nextName.equals("ps")) {
                        c = '\b';
                        break;
                    }
                    break;
                case 3664:
                    if (nextName.equals("sc")) {
                        c = '\t';
                        break;
                    }
                    break;
                case 3684:
                    if (nextName.equals("sw")) {
                        c = '\n';
                        break;
                    }
                    break;
                case 3687:
                    if (nextName.equals("sz")) {
                        c = 11;
                        break;
                    }
                    break;
                case 3710:
                    if (nextName.equals("tr")) {
                        c = '\f';
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    str2 = jsonReader.nextString();
                    break;
                case 1:
                    int nextInt = jsonReader.nextInt();
                    enumC6705bg2 = C6704IL.EnumC6705bg.CENTER;
                    if (nextInt <= enumC6705bg2.ordinal() && nextInt >= 0) {
                        enumC6705bg2 = C6704IL.EnumC6705bg.values()[nextInt];
                        break;
                    }
                    break;
                case 2:
                    f2 = (float) jsonReader.nextDouble();
                    break;
                case 3:
                    str = jsonReader.nextString();
                    break;
                case 4:
                    i2 = C6875Fy.m90572bg(jsonReader);
                    break;
                case 5:
                    f3 = (float) jsonReader.nextDouble();
                    break;
                case 6:
                    f4 = (float) jsonReader.nextDouble();
                    break;
                case 7:
                    z = jsonReader.nextBoolean();
                    break;
                case '\b':
                    jsonReader.beginArray();
                    PointF pointF3 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF = pointF3;
                    break;
                case '\t':
                    i3 = C6875Fy.m90572bg(jsonReader);
                    break;
                case '\n':
                    f5 = (float) jsonReader.nextDouble();
                    break;
                case 11:
                    jsonReader.beginArray();
                    PointF pointF4 = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
                    jsonReader.endArray();
                    pointF2 = pointF4;
                    break;
                case '\f':
                    i = jsonReader.nextInt();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        jsonReader.endObject();
        return new C6704IL(str, str2, f2, enumC6705bg2, i, f3, f4, i2, i3, f5, z, pointF, pointF2);
    }
}
