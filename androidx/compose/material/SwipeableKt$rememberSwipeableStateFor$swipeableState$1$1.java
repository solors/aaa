package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Swipeable.kt */
@Metadata
/* loaded from: classes.dex */
final class SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1<T> extends Lambda implements Function1<T, Boolean> {
    public static final SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1 INSTANCE = new SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1();

    SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1() {
        super(1);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull T it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Boolean.TRUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((SwipeableKt$rememberSwipeableStateFor$swipeableState$1$1<T>) obj);
    }
}
