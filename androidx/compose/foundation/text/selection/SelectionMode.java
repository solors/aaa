package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SelectionMode.kt */
@Metadata
/* loaded from: classes.dex */
public enum SelectionMode {
    Vertical { // from class: androidx.compose.foundation.text.selection.SelectionMode.Vertical
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo106750compare3MmeM6k$foundation_release(long j, @NotNull Rect bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (bounds.m107317containsk4lQ0M(j)) {
                return 0;
            }
            if (Offset.m107292getYimpl(j) < bounds.getTop()) {
                return -1;
            }
            if (Offset.m107291getXimpl(j) < bounds.getLeft() && Offset.m107292getYimpl(j) < bounds.getBottom()) {
                return -1;
            }
            return 1;
        }
    },
    Horizontal { // from class: androidx.compose.foundation.text.selection.SelectionMode.Horizontal
        @Override // androidx.compose.foundation.text.selection.SelectionMode
        /* renamed from: compare-3MmeM6k$foundation_release */
        public int mo106750compare3MmeM6k$foundation_release(long j, @NotNull Rect bounds) {
            Intrinsics.checkNotNullParameter(bounds, "bounds");
            if (bounds.m107317containsk4lQ0M(j)) {
                return 0;
            }
            if (Offset.m107291getXimpl(j) < bounds.getLeft()) {
                return -1;
            }
            if (Offset.m107292getYimpl(j) < bounds.getTop() && Offset.m107291getXimpl(j) < bounds.getRight()) {
                return -1;
            }
            return 1;
        }
    };

    /* synthetic */ SelectionMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: compare-3MmeM6k$foundation_release  reason: not valid java name */
    public abstract int mo106750compare3MmeM6k$foundation_release(long j, @NotNull Rect rect);

    /* renamed from: isSelected-2x9bVx0$foundation_release  reason: not valid java name */
    public final boolean m106751isSelected2x9bVx0$foundation_release(@NotNull Rect bounds, long j, long j2) {
        boolean z;
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        boolean z2 = true;
        if (bounds.m107317containsk4lQ0M(j) || bounds.m107317containsk4lQ0M(j2)) {
            return true;
        }
        int mo106750compare3MmeM6k$foundation_release = mo106750compare3MmeM6k$foundation_release(j, bounds);
        int mo106750compare3MmeM6k$foundation_release2 = mo106750compare3MmeM6k$foundation_release(j2, bounds);
        if (mo106750compare3MmeM6k$foundation_release > 0) {
            z = true;
        } else {
            z = false;
        }
        if (mo106750compare3MmeM6k$foundation_release2 <= 0) {
            z2 = false;
        }
        return z ^ z2;
    }
}
