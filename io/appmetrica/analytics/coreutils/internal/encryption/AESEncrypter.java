package io.appmetrica.analytics.coreutils.internal.encryption;

import android.annotation.SuppressLint;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.coreapi.internal.crypto.Encrypter;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes9.dex */
public class AESEncrypter implements Encrypter {
    public static final String DEFAULT_ALGORITHM = "AES/CBC/PKCS5Padding";
    public static final int DEFAULT_KEY_LENGTH = 16;
    public static final String TAG = "[AESEncrypter]";

    /* renamed from: a */
    private final String f92420a;

    /* renamed from: b */
    private final byte[] f92421b;

    /* renamed from: c */
    private final byte[] f92422c;

    public AESEncrypter(String str, byte[] bArr, byte[] bArr2) {
        this.f92420a = str;
        this.f92421b = bArr;
        this.f92422c = bArr2;
    }

    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] decrypt(@NonNull byte[] bArr) {
        return decrypt(bArr, 0, bArr.length);
    }

    @Override // io.appmetrica.analytics.coreapi.internal.crypto.Encrypter
    @Nullable
    @SuppressLint({"TrulyRandom"})
    public byte[] encrypt(@NonNull byte[] bArr) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f92421b, "AES");
            Cipher cipher = Cipher.getInstance(this.f92420a);
            cipher.init(1, secretKeySpec, new IvParameterSpec(this.f92422c));
            return cipher.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    @VisibleForTesting
    public String getAlgorithm() {
        return this.f92420a;
    }

    @VisibleForTesting
    public byte[] getIV() {
        return this.f92422c;
    }

    @VisibleForTesting
    public byte[] getPassword() {
        return this.f92421b;
    }

    @Nullable
    public byte[] decrypt(@NonNull byte[] bArr, int i, int i2) {
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(this.f92421b, "AES");
            Cipher cipher = Cipher.getInstance(this.f92420a);
            cipher.init(2, secretKeySpec, new IvParameterSpec(this.f92422c));
            return cipher.doFinal(bArr, i, i2);
        } catch (Throwable unused) {
            return null;
        }
    }
}
