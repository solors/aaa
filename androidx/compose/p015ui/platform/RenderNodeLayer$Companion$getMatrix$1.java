package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: RenderNodeLayer.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.RenderNodeLayer$Companion$getMatrix$1 */
/* loaded from: classes.dex */
final class RenderNodeLayer$Companion$getMatrix$1 extends Lambda implements Function2<DeviceRenderNode, Matrix, Unit> {
    public static final RenderNodeLayer$Companion$getMatrix$1 INSTANCE = new RenderNodeLayer$Companion$getMatrix$1();

    RenderNodeLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(DeviceRenderNode deviceRenderNode, Matrix matrix) {
        invoke2(deviceRenderNode, matrix);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull DeviceRenderNode rn, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(rn, "rn");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        rn.getMatrix(matrix);
    }
}
