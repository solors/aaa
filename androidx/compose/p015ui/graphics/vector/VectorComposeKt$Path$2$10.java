package androidx.compose.p015ui.graphics.vector;

import androidx.compose.p015ui.graphics.StrokeCap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: VectorCompose.kt */
@Metadata
/* renamed from: androidx.compose.ui.graphics.vector.VectorComposeKt$Path$2$10 */
/* loaded from: classes.dex */
final class VectorComposeKt$Path$2$10 extends Lambda implements Function2<PathComponent, StrokeCap, Unit> {
    public static final VectorComposeKt$Path$2$10 INSTANCE = new VectorComposeKt$Path$2$10();

    VectorComposeKt$Path$2$10() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(PathComponent pathComponent, StrokeCap strokeCap) {
        m108125invokeCSYIeUk(pathComponent, strokeCap.m107830unboximpl());
        return Unit.f99208a;
    }

    /* renamed from: invoke-CSYIeUk  reason: not valid java name */
    public final void m108125invokeCSYIeUk(@NotNull PathComponent set, int i) {
        Intrinsics.checkNotNullParameter(set, "$this$set");
        set.m108110setStrokeLineCapBeK7IIE(i);
    }
}
