package androidx.core.util;

import android.annotation.SuppressLint;
import androidx.annotation.RequiresApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
@SuppressLint({"ClassVerificationFailure"})
/* renamed from: androidx.core.util.HalfKt */
/* loaded from: classes.dex */
public final class Half {
    @RequiresApi(26)
    @NotNull
    public static final android.util.Half toHalf(short s) {
        android.util.Half valueOf;
        valueOf = android.util.Half.valueOf(s);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    @NotNull
    public static final android.util.Half toHalf(float f) {
        android.util.Half valueOf;
        valueOf = android.util.Half.valueOf(f);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    @NotNull
    public static final android.util.Half toHalf(@NotNull String str) {
        android.util.Half valueOf;
        Intrinsics.checkNotNullParameter(str, "<this>");
        valueOf = android.util.Half.valueOf(str);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }

    @RequiresApi(26)
    @NotNull
    public static final android.util.Half toHalf(double d) {
        android.util.Half valueOf;
        valueOf = android.util.Half.valueOf((float) d);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }
}
