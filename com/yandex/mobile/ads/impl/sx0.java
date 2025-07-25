package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.util.Base64;
import com.ironsource.C19644bj;
import io.appmetrica.analytics.coreutils.internal.encryption.AESEncrypter;
import java.io.ByteArrayOutputStream;
import java.nio.ByteBuffer;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1046xd.Closeable;

/* loaded from: classes8.dex */
public final class sx0 {
    @NotNull

    /* renamed from: a */
    private final String f85433a;

    /* renamed from: b */
    private final int f85434b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sx0(int i, @NotNull String publicKey) {
        this(i, publicKey, 0);
        Intrinsics.checkNotNullParameter(publicKey, "publicKey");
    }

    @SuppressLint({"TrulyRandom"})
    @Nullable
    /* renamed from: a */
    public final byte[] m29346a(@NotNull byte[] input) {
        Intrinsics.checkNotNullParameter(input, "input");
        try {
            byte[] decode = Base64.decode(this.f85433a, 0);
            if (decode != null) {
                SecureRandom secureRandom = new SecureRandom();
                byte[] bArr = new byte[16];
                byte[] bArr2 = new byte[16];
                secureRandom.nextBytes(bArr2);
                secureRandom.nextBytes(bArr);
                PublicKey generatePublic = KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(decode));
                Intrinsics.m17074g(generatePublic);
                return m29345a(input, bArr2, bArr, generatePublic);
            }
            return null;
        } catch (Throwable th) {
            um0.m28727b(th);
            return null;
        }
    }

    private sx0(int i, String str, int i2) {
        this.f85433a = str;
        this.f85434b = i;
    }

    /* renamed from: a */
    private final byte[] m29345a(byte[] bArr, byte[] bArr2, byte[] bArr3, PublicKey publicKey) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr2.length + bArr3.length);
            byteArrayOutputStream.write(bArr2);
            byteArrayOutputStream.write(bArr3);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "toByteArray(...)");
            Closeable.m1220a(byteArrayOutputStream, null);
            Cipher cipher = Cipher.getInstance(C19644bj.f49292b);
            C30780lc c30780lc = new C30780lc(AESEncrypter.DEFAULT_ALGORITHM, bArr2, bArr3);
            cipher.init(1, publicKey);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream(bArr.length);
            byteArrayOutputStream2.write(ByteBuffer.allocate(4).putInt(this.f85434b).array());
            byteArrayOutputStream2.write(cipher.doFinal(byteArray));
            byteArrayOutputStream2.write(c30780lc.m32296a(bArr));
            byte[] byteArray2 = byteArrayOutputStream2.toByteArray();
            Closeable.m1220a(byteArrayOutputStream2, null);
            return byteArray2;
        } catch (Throwable th) {
            um0.m28727b(th);
            return null;
        }
    }
}
