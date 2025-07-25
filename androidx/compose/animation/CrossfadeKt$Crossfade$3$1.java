package androidx.compose.animation;

import androidx.compose.animation.core.Transition;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: Crossfade.kt */
@Metadata
/* loaded from: classes.dex */
final class CrossfadeKt$Crossfade$3$1<T> extends Lambda implements Function1<T, Boolean> {
    final /* synthetic */ Transition<T> $this_Crossfade;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CrossfadeKt$Crossfade$3$1(Transition<T> transition) {
        super(1);
        this.$this_Crossfade = transition;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(T t) {
        return Boolean.valueOf(!Intrinsics.m17075f(t, this.$this_Crossfade.getTargetState()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Boolean invoke(Object obj) {
        return invoke((CrossfadeKt$Crossfade$3$1<T>) obj);
    }
}
