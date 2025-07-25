package androidx.compose.foundation.text;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: StringHelpers.jvm.kt */
@Metadata
/* loaded from: classes.dex */
public final class StringHelpers_jvmKt {
    @NotNull
    public static final StringBuilder appendCodePointX(@NotNull StringBuilder sb2, int i) {
        Intrinsics.checkNotNullParameter(sb2, "<this>");
        StringBuilder appendCodePointX = sb2.appendCodePoint(i);
        Intrinsics.checkNotNullExpressionValue(appendCodePointX, "appendCodePointX");
        return appendCodePointX;
    }
}
