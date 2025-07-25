package p998u9;

import android.graphics.Canvas;
import android.text.Layout;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import sb.DivTextRangeBackground;
import sb.DivTextRangeBorder;

/* compiled from: DivTextRangesBackgroundRenderer.kt */
@Metadata
/* renamed from: u9.c */
/* loaded from: classes8.dex */
public abstract class AbstractC44446c {
    /* renamed from: c */
    private final int m2937c(Layout layout, int i) {
        boolean z;
        boolean z2;
        boolean z3;
        int lineBottom = layout.getLineBottom(i);
        boolean z4 = true;
        if (i == layout.getLineCount() - 1) {
            z = true;
        } else {
            z = false;
        }
        float spacingAdd = layout.getSpacingAdd();
        float spacingMultiplier = layout.getSpacingMultiplier();
        if (spacingAdd == 0.0f) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (spacingMultiplier == 1.0f) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                z4 = false;
            }
        }
        if (z4 && !z) {
            if (Float.compare(spacingMultiplier, 1.0f) != 0) {
                float m2936d = m2936d(layout, i);
                spacingAdd = m2936d - ((m2936d - spacingAdd) / spacingMultiplier);
            }
            return (int) (lineBottom - spacingAdd);
        }
        return lineBottom;
    }

    /* renamed from: d */
    private final int m2936d(Layout layout, int i) {
        return layout.getLineTop(i + 1) - layout.getLineTop(i);
    }

    /* renamed from: a */
    public abstract void mo2932a(@NotNull Canvas canvas, @NotNull Layout layout, int i, int i2, int i3, int i4, @Nullable DivTextRangeBorder divTextRangeBorder, @Nullable DivTextRangeBackground divTextRangeBackground);

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final int m2938b(@NotNull Layout layout, int i) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        int m2937c = m2937c(layout, i);
        if (i == layout.getLineCount() - 1) {
            return m2937c - layout.getBottomPadding();
        }
        return m2937c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: e */
    public final int m2935e(@NotNull Layout layout, int i) {
        Intrinsics.checkNotNullParameter(layout, "layout");
        int lineTop = layout.getLineTop(i);
        if (i == 0) {
            return lineTop - layout.getTopPadding();
        }
        return lineTop;
    }
}
