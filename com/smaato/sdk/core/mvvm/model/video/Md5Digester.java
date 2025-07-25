package com.smaato.sdk.core.mvvm.model.video;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes7.dex */
public class Md5Digester {
    @NonNull
    private static final String MD_5_DIGEST_NAME = "MD5";
    @NonNull
    private final Charset charset;
    @NonNull
    private final HexEncoder hexEncoder;

    public Md5Digester(@NonNull Charset charset, @NonNull HexEncoder hexEncoder) {
        this.charset = (Charset) Objects.requireNonNull(charset);
        this.hexEncoder = (HexEncoder) Objects.requireNonNull(hexEncoder);
    }

    @NonNull
    private synchronized MessageDigest getMd5Digest() throws NoSuchAlgorithmException {
        return MessageDigest.getInstance("MD5");
    }

    @NonNull
    public String md5Hex(@NonNull String str) throws NoSuchAlgorithmException {
        if (str != null) {
            Objects.requireNonNull(str);
            return this.hexEncoder.encodeHexString(getMd5Digest().digest(str.getBytes(this.charset)));
        }
        throw new NullPointerException("'data' specified as non-null is null");
    }
}
