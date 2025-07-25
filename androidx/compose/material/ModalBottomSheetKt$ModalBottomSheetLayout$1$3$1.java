package androidx.compose.material;

import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.unit.IntSize;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModalBottomSheet.kt */
@Metadata
/* loaded from: classes.dex */
final class ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1 extends Lambda implements Function1<LayoutCoordinates, Unit> {
    final /* synthetic */ SnapshotState<Float> $sheetHeightState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ModalBottomSheetKt$ModalBottomSheetLayout$1$3$1(SnapshotState<Float> snapshotState) {
        super(1);
        this.$sheetHeightState = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LayoutCoordinates layoutCoordinates) {
        invoke2(layoutCoordinates);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        this.$sheetHeightState.setValue(Float.valueOf(IntSize.m109893getHeightimpl(it.mo109022getSizeYbymL2g())));
    }
}
