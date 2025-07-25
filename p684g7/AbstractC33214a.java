package p684g7;

import android.text.TextUtils;
import com.ironsource.C21114v8;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.List;
import java.util.Set;
import p1077ze.C45275a0;
import p1077ze.C45292c0;
import p1077ze.HttpUrl;
import p1077ze.InterfaceC45333w;

/* renamed from: g7.a */
/* loaded from: classes5.dex */
public abstract class AbstractC33214a implements InterfaceC45333w {

    /* renamed from: a */
    public boolean f90777a;

    /* renamed from: b */
    public List<String> f90778b;

    /* renamed from: g7.a$b */
    /* loaded from: classes5.dex */
    public static class C33216b {

        /* renamed from: a */
        public String f90779a;

        /* renamed from: b */
        public RSAPublicKey f90780b;

        public /* synthetic */ C33216b(Certificate[] certificateArr, RSAPublicKey rSAPublicKey, C33215a c33215a) {
            StringBuilder sb2 = new StringBuilder();
            if (certificateArr != null) {
                for (int i = 0; i < certificateArr.length; i++) {
                    Certificate certificate = certificateArr[i];
                    sb2.append("---Certs[");
                    sb2.append(i);
                    sb2.append(C21114v8.C21123i.f54139e);
                    sb2.append("---\n");
                    if (certificate instanceof X509Certificate) {
                        X509Certificate x509Certificate = (X509Certificate) certificate;
                        sb2.append(x509Certificate.getIssuerX500Principal().toString());
                        sb2.append("\n");
                        sb2.append(x509Certificate.getSubjectX500Principal().toString());
                        sb2.append("\n");
                    }
                    sb2.append(certificate.getPublicKey().toString());
                    sb2.append("\n");
                }
            }
            this.f90779a = sb2.toString();
            this.f90780b = rSAPublicKey;
        }
    }

    /* renamed from: a */
    public final int m24269a(String str) {
        int i;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            i = 0;
        }
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 4;
                if (i != 4) {
                    return 0;
                }
            }
        }
        return i2;
    }

    /* renamed from: b */
    public abstract String mo23655b();

    /* renamed from: c */
    public final C45292c0 m24268c(InterfaceC45333w.InterfaceC45334a interfaceC45334a, C45275a0 c45275a0, boolean z) {
        C45275a0.C45276a c45276a;
        if (!z) {
            Set<String> m199d = c45275a0.m490f().m199d();
            if (m199d.contains("X-MI-XFLAG")) {
                c45276a = c45275a0.m487i().m475k("X-MI-XFLAG");
            } else {
                c45276a = null;
            }
            if (m199d.contains("X-MI-XKEY")) {
                if (c45276a == null) {
                    c45276a = c45275a0.m487i();
                }
                c45276a.m475k("X-MI-XKEY");
            }
            if (c45276a != null) {
                c45275a0 = c45276a.m484b();
            }
        }
        return interfaceC45334a.mo103a(c45275a0);
    }

    /* renamed from: e */
    public abstract boolean mo23654e(C45275a0 c45275a0);

    /* renamed from: f */
    public int m24266f(C45275a0 c45275a0) {
        List<String> list;
        int m24269a = m24269a(c45275a0.m492d("X-MI-XFLAG"));
        if (m24269a != 0) {
            return m24269a;
        }
        HttpUrl m486j = c45275a0.m486j();
        if (m486j != null) {
            String m171h = m486j.m171h();
            boolean z = false;
            if (!TextUtils.isEmpty(m171h) && (list = this.f90778b) != null && !list.isEmpty()) {
                int i = 0;
                while (true) {
                    if (i >= this.f90778b.size()) {
                        break;
                    } else if (m171h.endsWith(this.f90778b.get(i))) {
                        z = true;
                        break;
                    } else {
                        i++;
                    }
                }
            }
            if (z) {
                return 1;
            }
        }
        if (this.f90777a) {
            return 1;
        }
        return 4;
    }

    /* renamed from: g */
    public abstract C45275a0.C45276a mo23653g(C45275a0 c45275a0);

    /* JADX WARN: Removed duplicated region for block: B:70:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    @Override // p1077ze.InterfaceC45333w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final p1077ze.C45292c0 intercept(p1077ze.InterfaceC45333w.InterfaceC45334a r14) {
        /*
            Method dump skipped, instructions count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p684g7.AbstractC33214a.intercept(ze.w$a):ze.c0");
    }

    /* renamed from: d */
    public final void m24267d(Exception exc, C45292c0 c45292c0, byte[] bArr, C33216b c33216b) {
    }
}
