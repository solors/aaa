package com.smaato.sdk.core.mvvm.model.video;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public class HexEncoder {
    @NonNull
    private static final char[] HEX_DIGITS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    @NonNull
    public String encodeHexString(@NonNull byte[] bArr) {
        if (bArr != null) {
            Objects.requireNonNull(bArr);
            char[] cArr = new char[bArr.length << 1];
            int i = 0;
            for (byte b : bArr) {
                int i2 = i + 1;
                char[] cArr2 = HEX_DIGITS;
                cArr[i] = cArr2[(b & 240) >>> 4];
                i = i2 + 1;
                cArr[i2] = cArr2[b & 15];
            }
            return new String(cArr);
        }
        throw new NullPointerException("'data' specified as non-null is null");
    }
}
