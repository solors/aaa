package androidx.compose.animation.core;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [V] */
/* compiled from: Animation.kt */
@Metadata
/* loaded from: classes.dex */
final class AnimationKt$createAnimation$1<V> extends Lambda implements Function1<V, V> {
    public static final AnimationKt$createAnimation$1 INSTANCE = new AnimationKt$createAnimation$1();

    AnimationKt$createAnimation$1() {
        super(1);
    }

    /* JADX WARN: Incorrect return type in method signature: (TV;)TV; */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final AnimationVectors invoke(@NotNull AnimationVectors it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it;
    }
}
