package p660f0;

import android.graphics.Color;
import java.io.IOException;
import p677g0.AbstractC33178c;

/* renamed from: f0.f */
/* loaded from: classes2.dex */
public class ColorParser implements ValueParser<Integer> {

    /* renamed from: a */
    public static final ColorParser f90248a = new ColorParser();

    private ColorParser() {
    }

    @Override // p660f0.ValueParser
    /* renamed from: b */
    public Integer mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        boolean z;
        double d;
        if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC33178c.mo24504b();
        }
        double mo24498l = abstractC33178c.mo24498l();
        double mo24498l2 = abstractC33178c.mo24498l();
        double mo24498l3 = abstractC33178c.mo24498l();
        if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.NUMBER) {
            d = abstractC33178c.mo24498l();
        } else {
            d = 1.0d;
        }
        if (z) {
            abstractC33178c.mo24502f();
        }
        if (mo24498l <= 1.0d && mo24498l2 <= 1.0d && mo24498l3 <= 1.0d) {
            mo24498l *= 255.0d;
            mo24498l2 *= 255.0d;
            mo24498l3 *= 255.0d;
            if (d <= 1.0d) {
                d *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) d, (int) mo24498l, (int) mo24498l2, (int) mo24498l3));
    }
}
