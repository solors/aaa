package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusOrderModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusOrderModifier */
/* loaded from: classes.dex */
public interface FocusOrderModifier extends Modifier.Element {

    /* compiled from: FocusOrderModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.focus.FocusOrderModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusOrderModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusOrderModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull FocusOrderModifier focusOrderModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusOrderModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull FocusOrderModifier focusOrderModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusOrderModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusOrderModifier focusOrderModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return FocusOrderModifier.super.then(other);
        }
    }

    void populateFocusOrder(@NotNull FocusOrder focusOrder);
}
