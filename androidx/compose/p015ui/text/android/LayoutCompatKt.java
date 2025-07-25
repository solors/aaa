package androidx.compose.p015ui.text.android;

import android.text.Layout;
import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutCompat.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.LayoutCompatKt */
/* loaded from: classes.dex */
public final class LayoutCompatKt {
    @InternalPlatformTextApi
    public static final int getLineForOffset(@NotNull Layout layout, @IntRange(from = 0) int i, boolean z) {
        Intrinsics.checkNotNullParameter(layout, "<this>");
        if (i <= 0) {
            return 0;
        }
        if (i >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart != i && lineEnd != i) {
            return lineForOffset;
        }
        if (lineStart == i) {
            if (z) {
                return lineForOffset - 1;
            }
            return lineForOffset;
        } else if (!z) {
            return lineForOffset + 1;
        } else {
            return lineForOffset;
        }
    }
}
