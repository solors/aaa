package androidx.compose.material;

import androidx.compose.runtime.Composer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1076zd.InterfaceC45268n;

/* compiled from: SnackbarHost.kt */
@Metadata
/* loaded from: classes.dex */
final class FadeInFadeOutAnimationItem<T> {
    private final T key;
    @NotNull
    private final InterfaceC45268n<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> transition;

    /* JADX WARN: Multi-variable type inference failed */
    public FadeInFadeOutAnimationItem(T t, @NotNull InterfaceC45268n<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.key = t;
        this.transition = transition;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FadeInFadeOutAnimationItem copy$default(FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem, Object obj, InterfaceC45268n interfaceC45268n, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = fadeInFadeOutAnimationItem.key;
        }
        if ((i & 2) != 0) {
            interfaceC45268n = fadeInFadeOutAnimationItem.transition;
        }
        return fadeInFadeOutAnimationItem.copy(obj, interfaceC45268n);
    }

    public final T component1() {
        return this.key;
    }

    @NotNull
    public final InterfaceC45268n<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> component2() {
        return this.transition;
    }

    @NotNull
    public final FadeInFadeOutAnimationItem<T> copy(T t, @NotNull InterfaceC45268n<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit> transition) {
        Intrinsics.checkNotNullParameter(transition, "transition");
        return new FadeInFadeOutAnimationItem<>(t, transition);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FadeInFadeOutAnimationItem)) {
            return false;
        }
        FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) obj;
        if (Intrinsics.m17075f(this.key, fadeInFadeOutAnimationItem.key) && Intrinsics.m17075f(this.transition, fadeInFadeOutAnimationItem.transition)) {
            return true;
        }
        return false;
    }

    public final T getKey() {
        return this.key;
    }

    @NotNull
    public final InterfaceC45268n<Function2<? super Composer, ? super Integer, Unit>, Composer, Integer, Unit> getTransition() {
        return this.transition;
    }

    public int hashCode() {
        int hashCode;
        T t = this.key;
        if (t == null) {
            hashCode = 0;
        } else {
            hashCode = t.hashCode();
        }
        return (hashCode * 31) + this.transition.hashCode();
    }

    @NotNull
    public String toString() {
        return "FadeInFadeOutAnimationItem(key=" + this.key + ", transition=" + this.transition + ')';
    }
}
