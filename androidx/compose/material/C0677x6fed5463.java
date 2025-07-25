package androidx.compose.material;

import androidx.compose.p015ui.unit.Constraints;
import androidx.compose.p015ui.unit.ConstraintsKt;
import be.MathJVM;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: BackdropScaffold.kt */
@Metadata
/* renamed from: androidx.compose.material.BackdropScaffoldKt$BackdropScaffold$calculateBackLayerConstraints$1$1 */
/* loaded from: classes.dex */
final class C0677x6fed5463 extends Lambda implements Function1<Constraints, Constraints> {
    final /* synthetic */ float $headerHeightPx;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0677x6fed5463(float f) {
        super(1);
        this.$headerHeightPx = f;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Constraints invoke(Constraints constraints) {
        return Constraints.m109678boximpl(m106799invokeZezNO4M(constraints.m109696unboximpl()));
    }

    /* renamed from: invoke-ZezNO4M  reason: not valid java name */
    public final long m106799invokeZezNO4M(long j) {
        int m103791d;
        long m109681copyZbe2FdA$default = Constraints.m109681copyZbe2FdA$default(j, 0, 0, 0, 0, 10, null);
        m103791d = MathJVM.m103791d(this.$headerHeightPx);
        return ConstraintsKt.m109707offsetNN6EwU$default(m109681copyZbe2FdA$default, 0, -m103791d, 1, null);
    }
}
