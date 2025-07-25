package androidx.core.text;

import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.text.CharSequenceKt */
/* loaded from: classes.dex */
public final class CharSequence {
    public static final boolean isDigitsOnly(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return TextUtils.isDigitsOnly(charSequence);
    }

    public static final int trimmedLength(@NotNull java.lang.CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        return TextUtils.getTrimmedLength(charSequence);
    }
}
