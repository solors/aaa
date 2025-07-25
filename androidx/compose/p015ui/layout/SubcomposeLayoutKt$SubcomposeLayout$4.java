package androidx.compose.p015ui.layout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: SubcomposeLayout.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.SubcomposeLayoutKt$SubcomposeLayout$4 */
/* loaded from: classes.dex */
public final class SubcomposeLayoutKt$SubcomposeLayout$4 extends Lambda implements Functions<Unit> {
    final /* synthetic */ SubcomposeLayoutState $state;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubcomposeLayoutKt$SubcomposeLayout$4(SubcomposeLayoutState subcomposeLayoutState) {
        super(0);
        this.$state = subcomposeLayoutState;
    }

    @Override // kotlin.jvm.functions.Functions
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$state.forceRecomposeChildren$ui_release();
    }
}
