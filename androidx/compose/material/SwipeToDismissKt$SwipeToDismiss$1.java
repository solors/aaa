package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* compiled from: SwipeToDismiss.kt */
@Metadata
/* loaded from: classes.dex */
final class SwipeToDismissKt$SwipeToDismiss$1 extends Lambda implements Function1<SwipeToDismiss, FractionalThreshold> {
    public static final SwipeToDismissKt$SwipeToDismiss$1 INSTANCE = new SwipeToDismissKt$SwipeToDismiss$1();

    SwipeToDismissKt$SwipeToDismiss$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final FractionalThreshold invoke(@NotNull SwipeToDismiss it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new FractionalThreshold(0.5f);
    }
}
