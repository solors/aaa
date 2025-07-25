package androidx.compose.p015ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.p015ui.Modifier;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: PointerInteropFilter.android.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInteropFilter_androidKt$pointerInteropFilter$2 */
/* loaded from: classes.dex */
final class PointerInteropFilter_androidKt$pointerInteropFilter$2 extends Lambda implements InterfaceC45268n<Modifier, Composer, Integer, Modifier> {
    final /* synthetic */ Function1<MotionEvent, Boolean> $onTouchEvent;
    final /* synthetic */ RequestDisallowInterceptTouchEvent $requestDisallowInterceptTouchEvent;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PointerInteropFilter_androidKt$pointerInteropFilter$2(Function1<? super MotionEvent, Boolean> function1, RequestDisallowInterceptTouchEvent requestDisallowInterceptTouchEvent) {
        super(3);
        this.$onTouchEvent = function1;
        this.$requestDisallowInterceptTouchEvent = requestDisallowInterceptTouchEvent;
    }

    @Override // p1076zd.InterfaceC45268n
    public /* bridge */ /* synthetic */ Modifier invoke(Modifier modifier, Composer composer, Integer num) {
        return invoke(modifier, composer, num.intValue());
    }

    @Composable
    @NotNull
    public final Modifier invoke(@NotNull Modifier composed, @Nullable Composer composer, int i) {
        Intrinsics.checkNotNullParameter(composed, "$this$composed");
        composer.startReplaceableGroup(374375707);
        composer.startReplaceableGroup(-492369756);
        Object rememberedValue = composer.rememberedValue();
        if (rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new PointerInteropFilter();
            composer.updateRememberedValue(rememberedValue);
        }
        composer.endReplaceableGroup();
        PointerInteropFilter pointerInteropFilter = (PointerInteropFilter) rememberedValue;
        pointerInteropFilter.setOnTouchEvent(this.$onTouchEvent);
        pointerInteropFilter.setRequestDisallowInterceptTouchEvent(this.$requestDisallowInterceptTouchEvent);
        composer.endReplaceableGroup();
        return pointerInteropFilter;
    }
}
