package sg.bigo.ads.common.p918h.p920b;

import java.text.DecimalFormat;

/* renamed from: sg.bigo.ads.common.h.b.j */
/* loaded from: classes10.dex */
final class C43700j {
    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public static String m5162a(float f) {
        String str;
        if (f >= 1048576.0f) {
            f = (f / 1024.0f) / 1024.0f;
            str = "mb/s";
        } else if (f >= 1024.0f) {
            f /= 1024.0f;
            str = "kb/s";
        } else {
            str = "b/s";
        }
        String format = new DecimalFormat("0.00").format(f);
        return format + str;
    }
}
