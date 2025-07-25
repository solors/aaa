package androidx.compose.foundation.text.selection;

import androidx.compose.p015ui.geometry.Offset;
import androidx.compose.p015ui.geometry.OffsetKt;
import androidx.compose.p015ui.semantics.SemanticsPropertyKey;
import androidx.compose.p015ui.unit.C1059Dp;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: SelectionHandles.kt */
@Metadata
/* loaded from: classes.dex */
public final class SelectionHandlesKt {
    private static final float HandleHeight;
    private static final float HandleWidth;
    @NotNull
    private static final SemanticsPropertyKey<SelectionHandles> SelectionHandleInfoKey = new SemanticsPropertyKey<>("SelectionHandleInfo", null, 2, null);

    static {
        float f = 25;
        HandleWidth = C1059Dp.m109734constructorimpl(f);
        HandleHeight = C1059Dp.m109734constructorimpl(f);
    }

    /* renamed from: getAdjustedCoordinates-k-4lQ0M  reason: not valid java name */
    public static final long m106704getAdjustedCoordinatesk4lQ0M(long j) {
        return OffsetKt.Offset(Offset.m107291getXimpl(j), Offset.m107292getYimpl(j) - 1.0f);
    }

    public static final float getHandleHeight() {
        return HandleHeight;
    }

    public static final float getHandleWidth() {
        return HandleWidth;
    }

    @NotNull
    public static final SemanticsPropertyKey<SelectionHandles> getSelectionHandleInfoKey() {
        return SelectionHandleInfoKey;
    }
}
