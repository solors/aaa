package p660f0;

import java.io.IOException;
import p677g0.AbstractC33178c;
import p707i0.ScaleXY;

/* renamed from: f0.c0 */
/* loaded from: classes2.dex */
public class ScaleXYParser implements ValueParser<ScaleXY> {

    /* renamed from: a */
    public static final ScaleXYParser f90243a = new ScaleXYParser();

    private ScaleXYParser() {
    }

    @Override // p660f0.ValueParser
    /* renamed from: b */
    public ScaleXY mo24962a(AbstractC33178c abstractC33178c, float f) throws IOException {
        boolean z;
        if (abstractC33178c.mo24494t() == AbstractC33178c.EnumC33180b.BEGIN_ARRAY) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            abstractC33178c.mo24504b();
        }
        float mo24498l = (float) abstractC33178c.mo24498l();
        float mo24498l2 = (float) abstractC33178c.mo24498l();
        while (abstractC33178c.mo24500i()) {
            abstractC33178c.mo24491x();
        }
        if (z) {
            abstractC33178c.mo24502f();
        }
        return new ScaleXY((mo24498l / 100.0f) * f, (mo24498l2 / 100.0f) * f);
    }
}
