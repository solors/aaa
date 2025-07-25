package androidx.core.text;

import android.text.Spanned;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: androidx.core.text.SpannedStringKt */
/* loaded from: classes.dex */
public final class SpannedString {
    public static final /* synthetic */ <T> T[] getSpans(Spanned spanned, int i, int i2) {
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.m17067n(4, "T");
        T[] tArr = (T[]) spanned.getSpans(i, i2, Object.class);
        Intrinsics.checkNotNullExpressionValue(tArr, "getSpans(start, end, T::class.java)");
        return tArr;
    }

    public static /* synthetic */ Object[] getSpans$default(Spanned spanned, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = spanned.length();
        }
        Intrinsics.checkNotNullParameter(spanned, "<this>");
        Intrinsics.m17067n(4, "T");
        Object[] spans = spanned.getSpans(i, i2, Object.class);
        Intrinsics.checkNotNullExpressionValue(spans, "getSpans(start, end, T::class.java)");
        return spans;
    }

    @NotNull
    public static final Spanned toSpanned(@NotNull CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "<this>");
        android.text.SpannedString valueOf = android.text.SpannedString.valueOf(charSequence);
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(this)");
        return valueOf;
    }
}
