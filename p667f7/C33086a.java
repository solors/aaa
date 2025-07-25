package p667f7;

import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.security.interfaces.RSAPublicKey;
import java.util.Arrays;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: f7.a */
/* loaded from: classes5.dex */
public class C33086a {

    /* renamed from: f */
    public static C33086a f90338f;

    /* renamed from: a */
    public byte[] f90339a;

    /* renamed from: b */
    public String f90340b;

    /* renamed from: c */
    public byte[] f90341c;

    /* renamed from: d */
    public byte[] f90342d;

    /* renamed from: e */
    public ConcurrentHashMap<RSAPublicKey, String> f90343e = new ConcurrentHashMap<>();

    public C33086a() {
        byte[] bArr = this.f90339a;
        if (bArr == null || bArr.length == 0) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
                keyGenerator.init(256);
                this.f90339a = keyGenerator.generateKey().getEncoded();
                this.f90340b = UUID.randomUUID().toString().replace("-", "");
                byte[] bArr2 = this.f90339a;
                if (bArr2 != null && bArr2.length == 32) {
                    this.f90341c = Arrays.copyOfRange(bArr2, 0, 16);
                    byte[] bArr3 = this.f90339a;
                    if (bArr3 != null && bArr3.length == 32) {
                        this.f90342d = Arrays.copyOfRange(bArr3, 16, bArr3.length);
                        return;
                    }
                    throw new IllegalArgumentException("");
                }
                throw new IllegalArgumentException("");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public static C33086a m24921c() {
        if (f90338f == null) {
            synchronized (C33086a.class) {
                if (f90338f == null) {
                    f90338f = new C33086a();
                }
            }
        }
        return f90338f;
    }

    /* renamed from: a */
    public String m24923a() {
        return this.f90340b;
    }

    /* renamed from: b */
    public byte[] m24922b(byte[] bArr) {
        byte[] bArr2 = this.f90341c;
        byte[] bArr3 = this.f90342d;
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
        IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
        Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
        cipher.init(1, secretKeySpec, ivParameterSpec);
        return cipher.doFinal(bArr);
    }
}
