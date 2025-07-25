package com.mobilefuse.sdk.crypto;

import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mobilefuse.sdk.StabilityHelper;
import com.unity3d.ads.core.data.datasource.AndroidStaticDeviceInfoDataSource;
import java.security.MessageDigest;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.mobilefuse.sdk.crypto.Crypto */
/* loaded from: classes7.dex */
public final class hash_algorithms {
    private static final String hashString(String str, String str2) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str2);
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
            byte[] digest = messageDigest.digest(bytes);
            Intrinsics.checkNotNullExpressionValue(digest, "MessageDigest\n          …gest(input.toByteArray())");
            StringBuilder sb2 = new StringBuilder();
            int length = digest.length;
            for (int i = 0; i < length; i++) {
                String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(digest[i])}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(this, *args)");
                sb2.append(format);
                Intrinsics.checkNotNullExpressionValue(sb2, "sb.append(\"%02x\".format(it))");
            }
            return sb2.toString();
        } catch (Throwable th) {
            StabilityHelper.logException("Hash " + str2, th);
            return null;
        }
    }

    @Nullable
    public static final String md5(@NotNull String md5) {
        Intrinsics.checkNotNullParameter(md5, "$this$md5");
        return hashString(md5, SameMD5.TAG);
    }

    @Nullable
    public static final String sha1(@NotNull String sha1) {
        Intrinsics.checkNotNullParameter(sha1, "$this$sha1");
        return hashString(sha1, AndroidStaticDeviceInfoDataSource.ALGORITHM_SHA1);
    }

    @Nullable
    public static final String sha256(@NotNull String sha256) {
        Intrinsics.checkNotNullParameter(sha256, "$this$sha256");
        return hashString(sha256, "SHA-256");
    }
}
