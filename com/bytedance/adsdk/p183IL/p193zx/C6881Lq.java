package com.bytedance.adsdk.p183IL.p193zx;

import android.graphics.Color;
import android.util.JsonReader;
import android.util.JsonToken;
import com.bytedance.adsdk.p183IL.ldr.C6859IL;
import com.bytedance.adsdk.p183IL.ldr.C6868zx;
import com.bytedance.adsdk.p183IL.p185bX.p186IL.C6722eqN;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.bytedance.adsdk.IL.zx.Lq */
/* loaded from: classes3.dex */
public class C6881Lq implements InterfaceC6891bN<C6722eqN> {

    /* renamed from: bg */
    private int f14787bg;

    public C6881Lq(int i) {
        this.f14787bg = i;
    }

    @Override // com.bytedance.adsdk.p183IL.p193zx.InterfaceC6891bN
    /* renamed from: bg */
    public C6722eqN mo90496IL(JsonReader jsonReader, float f) throws IOException {
        ArrayList arrayList = new ArrayList();
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        while (jsonReader.hasNext()) {
            arrayList.add(Float.valueOf((float) jsonReader.nextDouble()));
        }
        if (arrayList.size() == 4 && arrayList.get(0).floatValue() == 1.0f) {
            arrayList.set(0, Float.valueOf(0.0f));
            arrayList.add(Float.valueOf(1.0f));
            arrayList.add(arrayList.get(1));
            arrayList.add(arrayList.get(2));
            arrayList.add(arrayList.get(3));
            this.f14787bg = 2;
        }
        if (z) {
            jsonReader.endArray();
        }
        if (this.f14787bg == -1) {
            this.f14787bg = arrayList.size() / 4;
        }
        int i = this.f14787bg;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f14787bg * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 == 0) {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            } else if (i6 == 1) {
                i2 = (int) (floatValue * 255.0d);
            } else if (i6 == 2) {
                i3 = (int) (floatValue * 255.0d);
            } else if (i6 == 3) {
                iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
            }
        }
        return m90552bg(new C6722eqN(fArr, iArr), arrayList);
    }

    /* renamed from: bg */
    private C6722eqN m90552bg(C6722eqN c6722eqN, List<Float> list) {
        int i = this.f14787bg * 4;
        if (list.size() <= i) {
            return c6722eqN;
        }
        float[] m91028bg = c6722eqN.m91028bg();
        int[] m91030IL = c6722eqN.m91030IL();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] m90551bg = m90551bg(c6722eqN.m91028bg(), fArr);
        int length = m90551bg.length;
        int[] iArr = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = m90551bg[i3];
            int binarySearch = Arrays.binarySearch(m91028bg, f);
            int binarySearch2 = Arrays.binarySearch(fArr, f);
            if (binarySearch >= 0 && binarySearch2 <= 0) {
                iArr[i3] = m90554bg(f, m91030IL[binarySearch], fArr, fArr2);
            } else {
                if (binarySearch2 < 0) {
                    binarySearch2 = -(binarySearch2 + 1);
                }
                iArr[i3] = m90555bg(f, fArr2[binarySearch2], m91028bg, m91030IL);
            }
        }
        return new C6722eqN(m90551bg, iArr);
    }

    /* renamed from: bg */
    int m90555bg(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length >= 2 && f != fArr[0]) {
            for (int i = 1; i < fArr.length; i++) {
                float f3 = fArr[i];
                if (f3 >= f || i == fArr.length - 1) {
                    int i2 = i - 1;
                    float f4 = fArr[i2];
                    float f5 = (f - f4) / (f3 - f4);
                    int i3 = iArr[i];
                    int i4 = iArr[i2];
                    return Color.argb((int) (f2 * 255.0f), C6859IL.m90650bg(f5, Color.red(i4), Color.red(i3)), C6859IL.m90650bg(f5, Color.green(i4), Color.green(i3)), C6859IL.m90650bg(f5, Color.blue(i4), Color.blue(i3)));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return iArr[0];
    }

    /* renamed from: bg */
    private int m90554bg(float f, int i, float[] fArr, float[] fArr2) {
        float m90600bg;
        if (fArr2.length >= 2 && f > fArr[0]) {
            for (int i2 = 1; i2 < fArr.length; i2++) {
                float f2 = fArr[i2];
                int i3 = (f2 > f ? 1 : (f2 == f ? 0 : -1));
                if (i3 >= 0 || i2 == fArr.length - 1) {
                    if (i3 <= 0) {
                        m90600bg = fArr2[i2];
                    } else {
                        int i4 = i2 - 1;
                        float f3 = fArr[i4];
                        m90600bg = C6868zx.m90600bg(fArr2[i4], fArr2[i2], (f - f3) / (f2 - f3));
                    }
                    return Color.argb((int) (m90600bg * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
                }
            }
            throw new IllegalArgumentException("Unreachable code.");
        }
        return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
    }

    /* renamed from: bg */
    protected static float[] m90551bg(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (!Float.isNaN(f2) && f >= f2) {
                if (!Float.isNaN(f) && f2 >= f) {
                    fArr3[i4] = f;
                    i2++;
                    i3++;
                    i++;
                } else {
                    fArr3[i4] = f2;
                    i3++;
                }
            } else {
                fArr3[i4] = f;
                i2++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }
}
