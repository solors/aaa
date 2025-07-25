package p630d1;

import android.util.Pair;
import java.security.Key;
import java.security.KeyStore;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import p1049y0.C44996b;
import p646e1.C32898a;

/* renamed from: d1.c */
/* loaded from: classes3.dex */
public final class C32834c {

    /* renamed from: b */
    public C32835d f89473b;

    /* renamed from: c */
    public C32833b f89474c;

    /* renamed from: a */
    public SecretKey f89472a = null;

    /* renamed from: d */
    public final AlgorithmParameterSpec f89475d = new C32898a().m25529a();

    /* renamed from: a */
    public final Pair m25799a(String str) {
        if (this.f89473b != null) {
            return C32835d.m25796a(this.f89472a, str);
        }
        return null;
    }

    /* renamed from: b */
    public final String m25798b(String str, byte[] bArr) {
        if (this.f89474c != null) {
            return AbstractC32832a.m25801a(AbstractC32832a.m25800b(2, bArr, this.f89472a), str);
        }
        return null;
    }

    /* renamed from: c */
    public final void m25797c() {
        C44996b.m1101a("%s : init", "EncryptionManager");
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        if (!keyStore.containsAlias("dtx_ignite_service_storage")) {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
            keyGenerator.init(this.f89475d);
            keyGenerator.generateKey();
        }
        Key key = keyStore.getKey("dtx_ignite_service_storage", null);
        if (key instanceof SecretKey) {
            this.f89472a = (SecretKey) key;
            this.f89473b = new C32835d();
            this.f89474c = new C32833b();
        }
    }
}
