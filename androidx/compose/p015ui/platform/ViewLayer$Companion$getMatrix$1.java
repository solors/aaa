package androidx.compose.p015ui.platform;

import android.graphics.Matrix;
import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewLayer.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.platform.ViewLayer$Companion$getMatrix$1 */
/* loaded from: classes.dex */
final class ViewLayer$Companion$getMatrix$1 extends Lambda implements Function2<View, Matrix, Unit> {
    public static final ViewLayer$Companion$getMatrix$1 INSTANCE = new ViewLayer$Companion$getMatrix$1();

    ViewLayer$Companion$getMatrix$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ Unit mo105910invoke(View view, Matrix matrix) {
        invoke2(view, matrix);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull View view, @NotNull Matrix matrix) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(matrix, "matrix");
        matrix.set(view.getMatrix());
    }
}
