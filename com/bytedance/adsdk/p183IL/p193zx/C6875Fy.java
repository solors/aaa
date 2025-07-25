package com.bytedance.adsdk.p183IL.p193zx;

import android.graphics.Color;
import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.component.sdk.annotation.ColorInt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.zx.Fy */
/* loaded from: classes3.dex */
class C6875Fy {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.bytedance.adsdk.IL.zx.Fy$1 */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class C68761 {

        /* renamed from: bg */
        static final /* synthetic */ int[] f14784bg;

        static {
            int[] iArr = new int[JsonToken.values().length];
            f14784bg = iArr;
            try {
                iArr[JsonToken.NUMBER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14784bg[JsonToken.BEGIN_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14784bg[JsonToken.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public static PointF m90574IL(JsonReader jsonReader, float f) throws IOException {
        int i = C68761.f14784bg[jsonReader.peek().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return m90570zx(jsonReader, f);
                }
                throw new IllegalArgumentException("Unknown point starts with " + jsonReader.peek());
            }
            return eqN(jsonReader, f);
        }
        return m90573bX(jsonReader, f);
    }

    /* renamed from: bX */
    private static PointF m90573bX(JsonReader jsonReader, float f) throws IOException {
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @ColorInt
    /* renamed from: bg */
    public static int m90572bg(JsonReader jsonReader) throws IOException {
        jsonReader.beginArray();
        int nextDouble = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble2 = (int) (jsonReader.nextDouble() * 255.0d);
        int nextDouble3 = (int) (jsonReader.nextDouble() * 255.0d);
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return Color.argb(255, nextDouble, nextDouble2, nextDouble3);
    }

    private static PointF eqN(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginArray();
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.peek() != JsonToken.END_ARRAY) {
            jsonReader.skipValue();
        }
        jsonReader.endArray();
        return new PointF(nextDouble * f, nextDouble2 * f);
    }

    /* renamed from: zx */
    private static PointF m90570zx(JsonReader jsonReader, float f) throws IOException {
        jsonReader.beginObject();
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            if (!nextName.equals("x")) {
                if (!nextName.equals("y")) {
                    jsonReader.skipValue();
                } else {
                    f3 = m90575IL(jsonReader);
                }
            } else {
                f2 = m90575IL(jsonReader);
            }
        }
        jsonReader.endObject();
        return new PointF(f2 * f, f3 * f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: IL */
    public static float m90575IL(JsonReader jsonReader) throws IOException {
        JsonToken peek = jsonReader.peek();
        int i = C68761.f14784bg[peek.ordinal()];
        if (i != 1) {
            if (i == 2) {
                jsonReader.beginArray();
                float nextDouble = (float) jsonReader.nextDouble();
                while (jsonReader.hasNext()) {
                    jsonReader.skipValue();
                }
                jsonReader.endArray();
                return nextDouble;
            }
            throw new IllegalArgumentException("Unknown value for token of type ".concat(String.valueOf(peek)));
        }
        return (float) jsonReader.nextDouble();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: bg */
    public static List<PointF> m90571bg(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.peek() == JsonToken.BEGIN_ARRAY) {
            jsonReader.beginArray();
            arrayList.add(m90574IL(jsonReader, f));
            jsonReader.endArray();
        }
        jsonReader.endArray();
        return arrayList;
    }
}
