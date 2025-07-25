package p660f0;

import java.io.IOException;
import p001a0.Font;
import p677g0.AbstractC33178c;

/* renamed from: f0.k */
/* loaded from: classes2.dex */
class FontParser {

    /* renamed from: a */
    private static final AbstractC33178c.C33179a f90260a = AbstractC33178c.C33179a.m24520a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Font m24998a(AbstractC33178c abstractC33178c) throws IOException {
        abstractC33178c.mo24503e();
        String str = null;
        String str2 = null;
        float f = 0.0f;
        String str3 = null;
        while (abstractC33178c.mo24500i()) {
            int mo24493v = abstractC33178c.mo24493v(f90260a);
            if (mo24493v != 0) {
                if (mo24493v != 1) {
                    if (mo24493v != 2) {
                        if (mo24493v != 3) {
                            abstractC33178c.mo24492w();
                            abstractC33178c.mo24491x();
                        } else {
                            f = (float) abstractC33178c.mo24498l();
                        }
                    } else {
                        str2 = abstractC33178c.mo24495r();
                    }
                } else {
                    str3 = abstractC33178c.mo24495r();
                }
            } else {
                str = abstractC33178c.mo24495r();
            }
        }
        abstractC33178c.mo24501h();
        return new Font(str, str3, str2, f);
    }
}
