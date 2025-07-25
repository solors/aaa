package androidx.compose.p015ui.platform;

import android.graphics.Rect;
import androidx.compose.p015ui.semantics.SemanticsNode;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidComposeViewAccessibilityDelegateCompat.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.SemanticsNodeWithAdjustedBounds */
/* loaded from: classes.dex */
public final class SemanticsNodeWithAdjustedBounds {
    @NotNull
    private final Rect adjustedBounds;
    @NotNull
    private final SemanticsNode semanticsNode;

    public SemanticsNodeWithAdjustedBounds(@NotNull SemanticsNode semanticsNode, @NotNull Rect adjustedBounds) {
        Intrinsics.checkNotNullParameter(semanticsNode, "semanticsNode");
        Intrinsics.checkNotNullParameter(adjustedBounds, "adjustedBounds");
        this.semanticsNode = semanticsNode;
        this.adjustedBounds = adjustedBounds;
    }

    @NotNull
    public final Rect getAdjustedBounds() {
        return this.adjustedBounds;
    }

    @NotNull
    public final SemanticsNode getSemanticsNode() {
        return this.semanticsNode;
    }
}
