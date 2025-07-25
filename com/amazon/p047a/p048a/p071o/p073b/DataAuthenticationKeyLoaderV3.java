package com.amazon.p047a.p048a.p071o.p073b;

import android.app.Application;
import com.amazon.p047a.p048a.p063k.Resource;
import com.amazon.p047a.p048a.p065m.KiwiDataStore;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p047a.p048a.p071o.p073b.p074a.DataAuthenticationKeyLoadException;
import com.amazon.p081c.p082a.p083a.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;

/* renamed from: com.amazon.a.a.o.b.d */
/* loaded from: classes2.dex */
public class DataAuthenticationKeyLoaderV3 implements DataAuthenticationKeyLoader {

    /* renamed from: a */
    private static final KiwiLogger f2756a = new KiwiLogger("DataAuthenticationKeyLoaderV3");

    /* renamed from: b */
    private static final String f2757b = "AppstoreAuthenticationKey.pem";

    /* renamed from: c */
    private static final String f2758c = "-----BEGIN PUBLIC KEY-----";

    /* renamed from: d */
    private static final String f2759d = "-----END PUBLIC KEY-----";

    /* renamed from: e */
    private static final String f2760e = "RSA";
    @Resource

    /* renamed from: f */
    private Application f2761f;
    @Resource

    /* renamed from: g */
    private KiwiDataStore f2762g;

    /* renamed from: b */
    private PublicKey m102837b() {
        boolean z;
        if (KiwiLogger.f2770a) {
            f2756a.m102829a("Checking KiwiDataStore for key...");
        }
        PublicKey publicKey = (PublicKey) this.f2762g.m103005a(KiwiDataStore.f2522a);
        if (KiwiLogger.f2770a) {
            KiwiLogger kiwiLogger = f2756a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Key was cached: ");
            if (publicKey != null) {
                z = true;
            } else {
                z = false;
            }
            sb2.append(z);
            kiwiLogger.m102829a(sb2.toString());
        }
        return publicKey;
    }

    /* renamed from: c */
    private PublicKey m102836c() throws DataAuthenticationKeyLoadException {
        if (KiwiLogger.f2770a) {
            f2756a.m102829a("Loading authentication key from apk...");
        }
        StringBuilder sb2 = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(this.f2761f.getAssets().open(f2757b)));
                while (true) {
                    try {
                        String readLine = bufferedReader2.readLine();
                        if (readLine != null) {
                            sb2.append(readLine);
                        } else {
                            try {
                                break;
                            } catch (IOException e) {
                                if (KiwiLogger.f2770a) {
                                    f2756a.m102825b("Failed to close stream", e);
                                }
                            }
                        }
                    } catch (Exception e2) {
                        e = e2;
                        f2756a.m102825b("Unable to load authentication Key", e);
                        throw DataAuthenticationKeyLoadException.m102860d();
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e3) {
                                if (KiwiLogger.f2770a) {
                                    f2756a.m102825b("Failed to close stream", e3);
                                }
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
                return m102839a(sb2.toString());
            } catch (Exception e4) {
                e = e4;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // com.amazon.p047a.p048a.p071o.p073b.DataAuthenticationKeyLoader
    /* renamed from: a */
    public PublicKey mo102840a() throws DataAuthenticationKeyLoadException {
        if (KiwiLogger.f2770a) {
            f2756a.m102829a("Loading data authentication key...");
        }
        PublicKey m102837b = m102837b();
        if (m102837b != null) {
            return m102837b;
        }
        PublicKey m102836c = m102836c();
        m102838a(m102836c);
        return m102836c;
    }

    /* renamed from: a */
    private void m102838a(PublicKey publicKey) {
        if (KiwiLogger.f2770a) {
            f2756a.m102829a("Placing auth key into storage");
        }
        this.f2762g.m103003a(KiwiDataStore.f2522a, (String) publicKey);
    }

    /* renamed from: a */
    public PublicKey m102839a(String str) throws DataAuthenticationKeyLoadException {
        try {
            return KeyFactory.getInstance(f2760e).generatePublic(new X509EncodedKeySpec(Base64.m102678a(str.replace(f2758c, "").replace(f2759d, ""))));
        } catch (Exception e) {
            throw DataAuthenticationKeyLoadException.m102862a((Throwable) e);
        }
    }
}
