package androidx.compose.material;

import android.view.View;
import androidx.compose.p015ui.layout.LayoutCoordinates;
import androidx.compose.p015ui.node.Ref;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* compiled from: ExposedDropdownMenu.kt */
@Metadata
/* loaded from: classes.dex */
final class ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1 extends Lambda implements Functions<Unit> {
    final /* synthetic */ Ref<LayoutCoordinates> $coordinates;
    final /* synthetic */ SnapshotState<Integer> $menuHeight$delegate;
    final /* synthetic */ int $verticalMarginInPx;
    final /* synthetic */ View $view;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ExposedDropdownMenu.kt */
    @Metadata
    /* renamed from: androidx.compose.material.ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1$1 */
    /* loaded from: classes.dex */
    public static final class C07211 extends Lambda implements Function1<Integer, Unit> {
        final /* synthetic */ SnapshotState<Integer> $menuHeight$delegate;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C07211(SnapshotState<Integer> snapshotState) {
            super(1);
            this.$menuHeight$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
            invoke(num.intValue());
            return Unit.f99208a;
        }

        public final void invoke(int i) {
            ExposedDropdownMenuKt.m106950ExposedDropdownMenuBox$lambda5(this.$menuHeight$delegate, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExposedDropdownMenuKt$ExposedDropdownMenuBox$5$listener$1(View view, Ref<LayoutCoordinates> ref, int i, SnapshotState<Integer> snapshotState) {
        super(0);
        this.$view = view;
        this.$coordinates = ref;
        this.$verticalMarginInPx = i;
        this.$menuHeight$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        View rootView = this.$view.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView, "view.rootView");
        ExposedDropdownMenuKt.updateHeight(rootView, this.$coordinates.getValue(), this.$verticalMarginInPx, new C07211(this.$menuHeight$delegate));
    }
}
