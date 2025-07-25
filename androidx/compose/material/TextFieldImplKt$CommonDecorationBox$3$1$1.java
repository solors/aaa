package androidx.compose.material;

import androidx.compose.p015ui.geometry.Size;
import androidx.compose.p015ui.geometry.SizeKt;
import androidx.compose.runtime.SnapshotState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* compiled from: TextFieldImpl.kt */
@Metadata
/* loaded from: classes.dex */
final class TextFieldImplKt$CommonDecorationBox$3$1$1 extends Lambda implements Function1<Size, Unit> {
    final /* synthetic */ float $labelProgress;
    final /* synthetic */ SnapshotState<Size> $labelSize;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldImplKt$CommonDecorationBox$3$1$1(float f, SnapshotState<Size> snapshotState) {
        super(1);
        this.$labelProgress = f;
        this.$labelSize = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Size size) {
        m107130invokeuvyYCjk(size.m107365unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-uvyYCjk  reason: not valid java name */
    public final void m107130invokeuvyYCjk(long j) {
        boolean z;
        float m107360getWidthimpl = Size.m107360getWidthimpl(j) * this.$labelProgress;
        float m107357getHeightimpl = Size.m107357getHeightimpl(j) * this.$labelProgress;
        boolean z2 = true;
        if (Size.m107360getWidthimpl(this.$labelSize.getValue().m107365unboximpl()) == m107360getWidthimpl) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (Size.m107357getHeightimpl(this.$labelSize.getValue().m107365unboximpl()) != m107357getHeightimpl) {
                z2 = false;
            }
            if (z2) {
                return;
            }
        }
        this.$labelSize.setValue(Size.m107348boximpl(SizeKt.Size(m107360getWidthimpl, m107357getHeightimpl)));
    }
}
