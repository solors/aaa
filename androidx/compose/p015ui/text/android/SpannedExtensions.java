package androidx.compose.p015ui.text.android;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.compose.ui.text.android.SpannedExtensionsKt */
/* loaded from: classes.dex */
public final class SpannedExtensions {
    public static final boolean hasSpan(@NotNull Spanned spanned, @NotNull Class<?> clazz) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return spanned.nextSpanTransition(-1, spanned.length(), clazz) != spanned.length();
    }

    public static final boolean hasSpan(@NotNull Spanned spanned, @NotNull Class<?> clazz, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return spanned.nextSpanTransition(i - 1, i2, clazz) != i2;
    }
}
