package com.unity3d.ads.core.extensions;

import android.util.Base64;
import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.unity3d.ads.core.extensions.ProtobufExtensionsKt */
/* loaded from: classes7.dex */
public final class ProtobufExtensions {
    private static final int URL_SAFE_AND_NO_WRAP = 10;

    @NotNull
    public static final ByteString fromBase64(@NotNull String str, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (z) {
            i = 10;
        } else {
            i = 2;
        }
        ByteString copyFrom = ByteString.copyFrom(Base64.decode(str, i));
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(android.util.Base64.decode(this, flag))");
        return copyFrom;
    }

    public static /* synthetic */ ByteString fromBase64$default(String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return fromBase64(str, z);
    }

    @NotNull
    public static final String toBase64(@NotNull ByteString byteString, boolean z) {
        int i;
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        if (z) {
            i = 10;
        } else {
            i = 2;
        }
        String encodeToString = Base64.encodeToString(byteString.toByteArray(), i);
        Intrinsics.checkNotNullExpressionValue(encodeToString, "encodeToString(this.toByteArray(), flag)");
        return encodeToString;
    }

    public static /* synthetic */ String toBase64$default(ByteString byteString, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return toBase64(byteString, z);
    }

    @NotNull
    public static final ByteString toByteString(@NotNull UUID uuid) {
        Intrinsics.checkNotNullParameter(uuid, "<this>");
        ByteString copyFrom = ByteString.copyFrom(ByteBuffer.wrap(new byte[16]).order(ByteOrder.BIG_ENDIAN).putLong(uuid.getMostSignificantBits()).putLong(uuid.getLeastSignificantBits()).array());
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(bytes.array())");
        return copyFrom;
    }

    @NotNull
    public static final ByteString toISO8859ByteString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        byte[] bytes = str.getBytes(Charsets.f99446f);
        Intrinsics.checkNotNullExpressionValue(bytes, "this as java.lang.String).getBytes(charset)");
        ByteString copyFrom = ByteString.copyFrom(bytes);
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(this.toByteArray(Charsets.ISO_8859_1))");
        return copyFrom;
    }

    @NotNull
    public static final String toISO8859String(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        String byteString2 = byteString.toString(Charsets.f99446f);
        Intrinsics.checkNotNullExpressionValue(byteString2, "this.toString(Charsets.ISO_8859_1)");
        return byteString2;
    }

    @NotNull
    public static final UUID toUUID(@NotNull ByteString byteString) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        ByteBuffer asReadOnlyByteBuffer = byteString.asReadOnlyByteBuffer();
        Intrinsics.checkNotNullExpressionValue(asReadOnlyByteBuffer, "this.asReadOnlyByteBuffer()");
        if (asReadOnlyByteBuffer.remaining() == 36) {
            UUID fromString = UUID.fromString(byteString.toStringUtf8());
            Intrinsics.checkNotNullExpressionValue(fromString, "fromString(uuidString)");
            return fromString;
        } else if (asReadOnlyByteBuffer.remaining() == 16) {
            return new UUID(asReadOnlyByteBuffer.getLong(), asReadOnlyByteBuffer.getLong());
        } else {
            throw new IllegalArgumentException("Expected 16 byte ByteString or UUID string");
        }
    }
}
