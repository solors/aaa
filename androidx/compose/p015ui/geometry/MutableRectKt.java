package androidx.compose.p015ui.geometry;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: MutableRect.kt */
@Metadata
/* renamed from: androidx.compose.ui.geometry.MutableRectKt */
/* loaded from: classes.dex */
public final class MutableRectKt {
    @NotNull
    public static final Rect toRect(@NotNull MutableRect mutableRect) {
        Intrinsics.checkNotNullParameter(mutableRect, "<this>");
        return new Rect(mutableRect.getLeft(), mutableRect.getTop(), mutableRect.getRight(), mutableRect.getBottom());
    }
}
