package p660f0;

import android.graphics.Color;
import androidx.annotation.IntRange;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p035c0.GradientColor;
import p677g0.AbstractC33178c;
import p690h0.MiscUtils;

/* renamed from: f0.l */
/* loaded from: classes2.dex */
public class GradientColorParser implements ValueParser<GradientColor> {

    /* renamed from: a */
    private int f90261a;

    public GradientColorParser(int i) {
        this.f90261a = i;
    }

    /* renamed from: b */
    private void m24997b(GradientColor gradientColor, List<Float> list) {
        int i = this.f90261a * 4;
        if (list.size() <= i) {
            return;
        }
        int size = (list.size() - i) / 2;
        double[] dArr = new double[size];
        double[] dArr2 = new double[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                dArr[i2] = list.get(i).floatValue();
            } else {
                dArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        for (int i3 = 0; i3 < gradientColor.m103772c(); i3++) {
            int i4 = gradientColor.m103774a()[i3];
            gradientColor.m103774a()[i3] = Color.argb(m24996c(gradientColor.m103773b()[i3], dArr, dArr2), Color.red(i4), Color.green(i4), Color.blue(i4));
        }
    }

    @IntRange(from = 0, m105510to = 255)
    /* renamed from: c */
    private int m24996c(double d, double[] dArr, double[] dArr2) {
        double d2;
        int i = 1;
        while (true) {
            if (i < dArr.length) {
                int i2 = i - 1;
                double d3 = dArr[i2];
                double d4 = dArr[i];
                if (d4 >= d) {
                    d2 = MiscUtils.m23866j(dArr2[i2], dArr2[i], MiscUtils.m23874b((d - d3) / (d4 - d3), 0.0d, 1.0d));
                    break;
                }
                i++;
            } else {
                d2 = dArr2[dArr2.length - 1];
                break;
            }
        }
        return (int) (d2 * 255.0d);
    }

    @Override // p660f0.ValueParser
    /* renamed from: d */
    public GradientColor mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC33178c.mo24504b();
        }
        while (abstractC33178c.mo24500i()) {
            arrayList.add(Float.valueOf((float) abstractC33178c.mo24498l()));
        }
        if (z) {
            abstractC33178c.mo24502f();
        }
        if (this.f90261a == -1) {
            this.f90261a = arrayList.size() / 4;
        }
        int i = this.f90261a;
        float[] fArr = new float[i];
        int[] iArr = new int[i];
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < this.f90261a * 4; i4++) {
            int i5 = i4 / 4;
            double floatValue = arrayList.get(i4).floatValue();
            int i6 = i4 % 4;
            if (i6 != 0) {
                if (i6 != 1) {
                    if (i6 != 2) {
                        if (i6 == 3) {
                            iArr[i5] = Color.argb(255, i2, i3, (int) (floatValue * 255.0d));
                        }
                    } else {
                        i3 = (int) (floatValue * 255.0d);
                    }
                } else {
                    i2 = (int) (floatValue * 255.0d);
                }
            } else {
                if (i5 > 0) {
                    float f2 = (float) floatValue;
                    if (fArr[i5 - 1] >= f2) {
                        fArr[i5] = f2 + 0.01f;
                    }
                }
                fArr[i5] = (float) floatValue;
            }
        }
        GradientColor gradientColor = new GradientColor(fArr, iArr);
        m24997b(gradientColor, arrayList);
        return gradientColor;
    }
}
