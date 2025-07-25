package androidx.compose.p015ui.text.android;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: StaticLayoutFactory.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.StaticLayoutFactory */
/* loaded from: classes.dex */
public final class StaticLayoutFactory {
    @NotNull
    public static final StaticLayoutFactory INSTANCE = new StaticLayoutFactory();
    @NotNull
    private static final StaticLayoutFactoryImpl delegate = new StaticLayoutFactory23();

    private StaticLayoutFactory() {
    }

    @NotNull
    public final StaticLayout create(@NotNull CharSequence text, int i, int i2, @NotNull TextPaint paint, int i3, @NotNull TextDirectionHeuristic textDir, @NotNull Layout.Alignment alignment, @IntRange(from = 0) int i4, @Nullable TextUtils.TruncateAt truncateAt, @IntRange(from = 0) int i5, @FloatRange(from = 0.0d) float f, float f2, int i6, boolean z, boolean z2, int i7, int i8, @Nullable int[] iArr, @Nullable int[] iArr2) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        return delegate.create(new StaticLayoutParams(text, i, i2, paint, i3, textDir, alignment, i4, truncateAt, i5, f, f2, i6, z, z2, i7, i8, iArr, iArr2));
    }
}
