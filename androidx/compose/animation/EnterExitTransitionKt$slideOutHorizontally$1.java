package androidx.compose.animation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: EnterExitTransition.kt */
@Metadata
/* loaded from: classes.dex */
final class EnterExitTransitionKt$slideOutHorizontally$1 extends Lambda implements Function1<Integer, Integer> {
    public static final EnterExitTransitionKt$slideOutHorizontally$1 INSTANCE = new EnterExitTransitionKt$slideOutHorizontally$1();

    EnterExitTransitionKt$slideOutHorizontally$1() {
        super(1);
    }

    @NotNull
    public final Integer invoke(int i) {
        return Integer.valueOf((-i) / 2);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
        return invoke(num.intValue());
    }
}
