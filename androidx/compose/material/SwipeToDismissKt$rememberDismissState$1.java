package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwipeToDismiss.kt */
@Metadata
/* loaded from: classes.dex */
final class SwipeToDismissKt$rememberDismissState$1 extends Lambda implements Function1<DismissValue, Boolean> {
    public static final SwipeToDismissKt$rememberDismissState$1 INSTANCE = new SwipeToDismissKt$rememberDismissState$1();

    SwipeToDismissKt$rememberDismissState$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull DismissValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }
}
