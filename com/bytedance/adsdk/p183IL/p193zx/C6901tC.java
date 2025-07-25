package com.bytedance.adsdk.p183IL.p193zx;

import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p183IL.C6832iR;
import com.bytedance.adsdk.p183IL.p189bg.p190IL.C6779WR;
import com.bytedance.adsdk.p183IL.p192iR.C6838bg;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.zx.tC */
/* loaded from: classes3.dex */
class C6901tC {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static <T> List<C6838bg<T>> m90498bg(JsonReader jsonReader, C6832iR c6832iR, float f, InterfaceC6891bN<T> interfaceC6891bN, boolean z) throws IOException {
        ArrayList arrayList = new ArrayList();
        if (jsonReader.peek() == JsonToken.STRING) {
            c6832iR.m90728bg("Lottie doesn't support expressions.");
            return arrayList;
        }
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("k")) {
                jsonReader.skipValue();
            } else if (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
                jsonReader.beginArray();
                if (jsonReader.peek() == JsonToken.NUMBER) {
                    arrayList.add(C6880LZ.m90557bg(jsonReader, c6832iR, f, interfaceC6891bN, false, z));
                } else {
                    while (jsonReader.hasNext()) {
                        arrayList.add(C6880LZ.m90557bg(jsonReader, c6832iR, f, interfaceC6891bN, true, z));
                    }
                }
                jsonReader.endArray();
            } else {
                arrayList.add(C6880LZ.m90557bg(jsonReader, c6832iR, f, interfaceC6891bN, false, z));
            }
        }
        jsonReader.endObject();
        m90497bg(arrayList);
        return arrayList;
    }

    /* renamed from: bg */
    public static <T> void m90497bg(List<? extends C6838bg<T>> list) {
        int i;
        T t;
        int size = list.size();
        int i2 = 0;
        while (true) {
            i = size - 1;
            if (i2 >= i) {
                break;
            }
            C6838bg<T> c6838bg = list.get(i2);
            i2++;
            C6838bg<T> c6838bg2 = list.get(i2);
            c6838bg.f14691iR = Float.valueOf(c6838bg2.ldr);
            if (c6838bg.f14681IL == null && (t = c6838bg2.f14689bg) != null) {
                c6838bg.f14681IL = t;
                if (c6838bg instanceof C6779WR) {
                    ((C6779WR) c6838bg).m90848bg();
                }
            }
        }
        C6838bg<T> c6838bg3 = list.get(i);
        if ((c6838bg3.f14689bg == null || c6838bg3.f14681IL == null) && list.size() > 1) {
            list.remove(c6838bg3);
        }
    }
}
