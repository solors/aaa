package androidx.compose.material;

import androidx.compose.p015ui.unit.C1059Dp;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.material.BottomSheetScaffoldDefaults */
/* loaded from: classes.dex */
public final class BottomSheetScaffold {
    public static final int $stable = 0;
    @NotNull
    public static final BottomSheetScaffold INSTANCE = new BottomSheetScaffold();
    private static final float SheetElevation = C1059Dp.m109734constructorimpl(8);
    private static final float SheetPeekHeight = C1059Dp.m109734constructorimpl(56);

    private BottomSheetScaffold() {
    }

    /* renamed from: getSheetElevation-D9Ej5fM  reason: not valid java name */
    public final float m106814getSheetElevationD9Ej5fM() {
        return SheetElevation;
    }

    /* renamed from: getSheetPeekHeight-D9Ej5fM  reason: not valid java name */
    public final float m106815getSheetPeekHeightD9Ej5fM() {
        return SheetPeekHeight;
    }
}
