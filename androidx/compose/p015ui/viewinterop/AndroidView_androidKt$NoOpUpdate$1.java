package androidx.compose.p015ui.viewinterop;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: AndroidView.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.viewinterop.AndroidView_androidKt$NoOpUpdate$1 */
/* loaded from: classes.dex */
final class AndroidView_androidKt$NoOpUpdate$1 extends Lambda implements Function1<View, Unit> {
    public static final AndroidView_androidKt$NoOpUpdate$1 INSTANCE = new AndroidView_androidKt$NoOpUpdate$1();

    AndroidView_androidKt$NoOpUpdate$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "$this$null");
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke2(view);
        return Unit.f99208a;
    }
}
