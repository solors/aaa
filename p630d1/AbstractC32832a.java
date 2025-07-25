package p630d1;

import android.util.Base64;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;

/* renamed from: d1.a */
/* loaded from: classes3.dex */
public abstract class AbstractC32832a {
    /* renamed from: a */
    public static String m25801a(Cipher cipher, String str) {
        CipherInputStream cipherInputStream = new CipherInputStream(new ByteArrayInputStream(Base64.decode(str, 0)), cipher);
        ArrayList arrayList = new ArrayList();
        while (true) {
            int read = cipherInputStream.read();
            if (read == -1) {
                break;
            }
            arrayList.add(Byte.valueOf((byte) read));
        }
        byte[] bArr = new byte[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            bArr[i] = ((Byte) arrayList.get(i)).byteValue();
        }
        return new String(bArr, "UTF-8");
    }

    /* renamed from: b */
    public static Cipher m25800b(int i, byte[] bArr, SecretKey secretKey) {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        cipher.init(i, secretKey, new GCMParameterSpec(128, bArr));
        return cipher;
    }
}
