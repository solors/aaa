package androidx.compose.foundation.gestures;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: ScrollableState.kt */
@Metadata
/* loaded from: classes.dex */
final class ScrollableStateKt$rememberScrollableState$1$1 extends Lambda implements Function1<Float, Float> {
    final /* synthetic */ State<Function1<Float, Float>> $lambdaState;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ScrollableStateKt$rememberScrollableState$1$1(State<? extends Function1<? super Float, Float>> state) {
        super(1);
        this.$lambdaState = state;
    }

    @NotNull
    public final Float invoke(float f) {
        return this.$lambdaState.getValue().invoke(Float.valueOf(f));
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Float invoke(Float f) {
        return invoke(f.floatValue());
    }
}
