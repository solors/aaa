package com.mobilefuse.sdk.encoding;

import android.util.Base64;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Base64.kt */
@Metadata
/* loaded from: classes7.dex */
public final class Base64Kt {
    @Nullable
    public static final byte[] base64Decode(@NotNull String base64Decode) {
        Intrinsics.checkNotNullParameter(base64Decode, "$this$base64Decode");
        try {
            return Base64.decode(base64Decode, 0);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    public static final String base64Encode(@NotNull byte[] base64Encode) {
        Intrinsics.checkNotNullParameter(base64Encode, "$this$base64Encode");
        try {
            return Base64.encodeToString(base64Encode, 0);
        } catch (Throwable unused) {
            return null;
        }
    }
}
