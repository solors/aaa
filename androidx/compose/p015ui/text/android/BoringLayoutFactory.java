package androidx.compose.p015ui.text.android;

import android.text.BoringLayout;
import android.text.Layout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: BoringLayoutFactory.kt */
@Metadata
/* renamed from: androidx.compose.ui.text.android.BoringLayoutFactory */
/* loaded from: classes.dex */
public final class BoringLayoutFactory {
    @NotNull
    public static final BoringLayoutFactory INSTANCE = new BoringLayoutFactory();

    private BoringLayoutFactory() {
    }

    public static /* synthetic */ BoringLayout create$default(BoringLayoutFactory boringLayoutFactory, CharSequence charSequence, TextPaint textPaint, int i, BoringLayout.Metrics metrics, Layout.Alignment alignment, boolean z, TextUtils.TruncateAt truncateAt, int i2, int i3, Object obj) {
        Layout.Alignment alignment2;
        boolean z2;
        TextUtils.TruncateAt truncateAt2;
        int i4;
        if ((i3 & 16) != 0) {
            alignment2 = Layout.Alignment.ALIGN_NORMAL;
        } else {
            alignment2 = alignment;
        }
        if ((i3 & 32) != 0) {
            z2 = true;
        } else {
            z2 = z;
        }
        if ((i3 & 64) != 0) {
            truncateAt2 = null;
        } else {
            truncateAt2 = truncateAt;
        }
        if ((i3 & 128) != 0) {
            i4 = i;
        } else {
            i4 = i2;
        }
        return boringLayoutFactory.create(charSequence, textPaint, i, metrics, alignment2, z2, truncateAt2, i4);
    }

    @NotNull
    public final BoringLayout create(@NotNull CharSequence text, @NotNull TextPaint paint, int i, @NotNull BoringLayout.Metrics metrics, @NotNull Layout.Alignment alignment, boolean z, @Nullable TextUtils.TruncateAt truncateAt, int i2) {
        boolean z2;
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(paint, "paint");
        Intrinsics.checkNotNullParameter(metrics, "metrics");
        Intrinsics.checkNotNullParameter(alignment, "alignment");
        boolean z3 = true;
        if (i >= 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (i2 < 0) {
                z3 = false;
            }
            if (z3) {
                if (truncateAt == null) {
                    return new BoringLayout(text, paint, i, alignment, 1.0f, 0.0f, metrics, z);
                }
                return new BoringLayout(text, paint, i, alignment, 1.0f, 0.0f, metrics, z, truncateAt, i2);
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Nullable
    public final BoringLayout.Metrics measure(@NotNull CharSequence text, @Nullable TextPaint textPaint, @NotNull TextDirectionHeuristic textDir) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(textDir, "textDir");
        if (textDir.isRtl(text, 0, text.length())) {
            return null;
        }
        return BoringLayout.isBoring(text, textPaint, null);
    }
}
