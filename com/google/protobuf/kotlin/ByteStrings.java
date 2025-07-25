package com.google.protobuf.kotlin;

import com.google.protobuf.ByteString;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.google.protobuf.kotlin.ByteStringsKt */
/* loaded from: classes5.dex */
public final class ByteStrings {
    public static final byte get(@NotNull ByteString byteString, int i) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        return byteString.byteAt(i);
    }

    @NotNull
    public static final ByteString plus(@NotNull ByteString byteString, @NotNull ByteString other) {
        Intrinsics.checkNotNullParameter(byteString, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        ByteString concat = byteString.concat(other);
        Intrinsics.checkNotNullExpressionValue(concat, "concat(other)");
        return concat;
    }

    @NotNull
    public static final ByteString toByteString(@NotNull byte[] bArr) {
        Intrinsics.checkNotNullParameter(bArr, "<this>");
        ByteString copyFrom = ByteString.copyFrom(bArr);
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(this)");
        return copyFrom;
    }

    @NotNull
    public static final ByteString toByteStringUtf8(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        ByteString copyFromUtf8 = ByteString.copyFromUtf8(str);
        Intrinsics.checkNotNullExpressionValue(copyFromUtf8, "copyFromUtf8(this)");
        return copyFromUtf8;
    }

    @NotNull
    public static final ByteString toByteString(@NotNull ByteBuffer byteBuffer) {
        Intrinsics.checkNotNullParameter(byteBuffer, "<this>");
        ByteString copyFrom = ByteString.copyFrom(byteBuffer);
        Intrinsics.checkNotNullExpressionValue(copyFrom, "copyFrom(this)");
        return copyFrom;
    }
}
