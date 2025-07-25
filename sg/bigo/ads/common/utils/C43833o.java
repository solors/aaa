package sg.bigo.ads.common.utils;

import android.webkit.ValueCallback;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.UnsupportedEncodingException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import sg.bigo.ads.common.p932t.C43782a;

/* renamed from: sg.bigo.ads.common.utils.o */
/* loaded from: classes10.dex */
public final class C43833o {

    /* renamed from: a */
    private static final byte[] f114672a = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

    /* renamed from: b */
    private static final byte[] f114673b = {1, 2, 3, 4, 5, 6, 7, 8, 9, 16, 17, 18, 19, 20, 21, 22};

    @Nullable
    /* renamed from: a */
    public static String m4857a(@NonNull String str, @NonNull String str2) {
        return m4852b(str, str2);
    }

    @Nullable
    /* renamed from: b */
    private static String m4852b(@NonNull String str, @NonNull String str2) {
        try {
            return C43836q.m4829a(m4854a(str.getBytes("UTF-8"), C43836q.m4824c(str2)));
        } catch (UnsupportedEncodingException e) {
            m4858a((ValueCallback<Exception>) null, e);
            return null;
        }
    }

    /* renamed from: a */
    public static String m4856a(@NonNull String str, @NonNull String str2, @Nullable ValueCallback<Exception> valueCallback) {
        try {
            byte[] m4851b = m4851b(str, str2, valueCallback);
            if (m4851b != null) {
                return new String(m4851b, "UTF-8");
            }
            return null;
        } catch (Exception e) {
            m4858a(valueCallback, e);
            C43782a.m5009a(0, "SDKCipher", "Failed to decrypt data: ".concat(String.valueOf(str)));
            return null;
        }
    }

    @Nullable
    /* renamed from: b */
    public static byte[] m4851b(@NonNull String str, @NonNull String str2, @Nullable ValueCallback<Exception> valueCallback) {
        try {
            return m4853a(C43836q.m4824c(str), C43836q.m4824c(str2), valueCallback);
        } catch (Exception e) {
            m4858a(valueCallback, e);
            C43782a.m5009a(0, "SDKCipher", "Failed to decrypt data: ".concat(String.valueOf(str)));
            return null;
        }
    }

    /* renamed from: a */
    private static void m4858a(ValueCallback<Exception> valueCallback, Exception exc) {
        if (valueCallback != null) {
            valueCallback.onReceiveValue(exc);
        }
    }

    @Nullable
    /* renamed from: b */
    public static byte[] m4850b(byte[] bArr) {
        return m4853a(bArr, f114673b, (ValueCallback<Exception>) null);
    }

    @Nullable
    /* renamed from: a */
    public static byte[] m4855a(byte[] bArr) {
        return m4854a(bArr, f114673b);
    }

    @Nullable
    /* renamed from: a */
    private static byte[] m4854a(byte[] bArr, byte[] bArr2) {
        if (bArr != null && bArr2 != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f114672a);
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(1, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                m4858a((ValueCallback<Exception>) null, e);
                if (e instanceof NoSuchAlgorithmException) {
                    C43782a.m5009a(0, "SDKCipher", "sdk cipher.encrypt failed, no such algorithm");
                    return bArr;
                }
                C43782a.m5009a(0, "SDKCipher", "sdk cipher.encrypt failed");
            }
        }
        return null;
    }

    @Nullable
    /* renamed from: a */
    private static byte[] m4853a(byte[] bArr, byte[] bArr2, ValueCallback<Exception> valueCallback) {
        if (bArr != null && bArr2 != null) {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            IvParameterSpec ivParameterSpec = new IvParameterSpec(f114672a);
            try {
                Cipher cipher = Cipher.getInstance(AESEncrypter.DEFAULT_ALGORITHM);
                cipher.init(2, secretKeySpec, ivParameterSpec);
                return cipher.doFinal(bArr);
            } catch (InvalidAlgorithmParameterException | InvalidKeyException | NoSuchAlgorithmException | BadPaddingException | IllegalBlockSizeException | NoSuchPaddingException e) {
                m4858a(valueCallback, e);
                C43782a.m5009a(0, "SDKCipher", "sdk cipher.decrypt new key failed,input len:" + bArr.length + ",input data:" + Arrays.toString(bArr));
                if (e instanceof NoSuchAlgorithmException) {
                    return bArr;
                }
            }
        }
        return null;
    }
}
