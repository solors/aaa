package androidx.window.embedding;

import android.graphics.Rect;
import android.os.Build;
import android.view.WindowMetrics;
import androidx.annotation.DoNotInline;
import androidx.annotation.RequiresApi;
import androidx.window.core.ExperimentalWindowApi;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: SplitRule.kt */
@ExperimentalWindowApi
@Metadata
/* loaded from: classes2.dex */
public class SplitRule extends EmbeddingRule {
    private final int layoutDirection;
    private final int minSmallestWidth;
    private final int minWidth;
    private final float splitRatio;

    /* compiled from: SplitRule.kt */
    @RequiresApi(30)
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Api30Impl {
        @NotNull
        public static final Api30Impl INSTANCE = new Api30Impl();

        private Api30Impl() {
        }

        @DoNotInline
        @NotNull
        public final Rect getBounds(@NotNull WindowMetrics windowMetrics) {
            Rect bounds;
            Intrinsics.checkNotNullParameter(windowMetrics, "windowMetrics");
            bounds = windowMetrics.getBounds();
            Intrinsics.checkNotNullExpressionValue(bounds, "windowMetrics.bounds");
            return bounds;
        }
    }

    /* compiled from: SplitRule.kt */
    @Retention(RetentionPolicy.SOURCE)
    @Metadata
    /* loaded from: classes2.dex */
    public @interface LayoutDir {
    }

    public SplitRule() {
        this(0, 0, 0.0f, 0, 15, null);
    }

    public final boolean checkParentMetrics(@NotNull WindowMetrics parentMetrics) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(parentMetrics, "parentMetrics");
        if (Build.VERSION.SDK_INT <= 30) {
            return false;
        }
        Rect bounds = Api30Impl.INSTANCE.getBounds(parentMetrics);
        if (this.minWidth != 0 && bounds.width() < this.minWidth) {
            z = false;
        } else {
            z = true;
        }
        if (this.minSmallestWidth != 0 && Math.min(bounds.width(), bounds.height()) < this.minSmallestWidth) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        boolean z;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SplitRule)) {
            return false;
        }
        SplitRule splitRule = (SplitRule) obj;
        if (this.minWidth != splitRule.minWidth || this.minSmallestWidth != splitRule.minSmallestWidth) {
            return false;
        }
        if (this.splitRatio == splitRule.splitRatio) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.layoutDirection == splitRule.layoutDirection) {
            return true;
        }
        return false;
    }

    public final int getLayoutDirection() {
        return this.layoutDirection;
    }

    public final int getMinSmallestWidth() {
        return this.minSmallestWidth;
    }

    public final int getMinWidth() {
        return this.minWidth;
    }

    public final float getSplitRatio() {
        return this.splitRatio;
    }

    public int hashCode() {
        return (((((this.minWidth * 31) + this.minSmallestWidth) * 31) + Float.hashCode(this.splitRatio)) * 31) + this.layoutDirection;
    }

    public /* synthetic */ SplitRule(int i, int i2, float f, int i3, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) != 0 ? 0 : i2, (i4 & 4) != 0 ? 0.5f : f, (i4 & 8) != 0 ? 3 : i3);
    }

    public SplitRule(int i, int i2, float f, int i3) {
        this.minWidth = i;
        this.minSmallestWidth = i2;
        this.splitRatio = f;
        this.layoutDirection = i3;
    }
}
