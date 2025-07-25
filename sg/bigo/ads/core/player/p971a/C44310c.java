package sg.bigo.ads.core.player.p971a;

import java.io.OutputStream;
import java.util.Locale;
import sg.bigo.ads.common.p918h.C43681a;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.core.player.p971a.p972a.C44308a;

/* renamed from: sg.bigo.ads.core.player.a.c */
/* loaded from: classes10.dex */
final class C44310c extends C44320i {

    /* renamed from: a */
    C44308a f116317a;

    public C44310c(C43681a c43681a) {
        this.f116352e = c43681a;
        C44308a c44308a = new C44308a(c43681a);
        this.f116317a = c44308a;
        this.f116349b = c44308a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static String m3416a(String str, Object... objArr) {
        return String.format(Locale.US, str, objArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public final void m3417a(OutputStream outputStream, long j) {
        byte[] bArr = new byte[8192];
        C43782a.m5010a(0, 3, "ProxyCache", "responseWithCache start thread=" + Thread.currentThread().getName());
        while (true) {
            int m3401a = m3401a(bArr, j);
            if (m3401a == -1) {
                C43782a.m5010a(0, 3, "ProxyCache", "responseWithCache end thread=" + Thread.currentThread().getName() + ",offset=" + j);
                outputStream.flush();
                return;
            }
            outputStream.write(bArr, 0, m3401a);
            j += m3401a;
        }
    }
}
