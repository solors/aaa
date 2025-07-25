package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusEventModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusEventModifier */
/* loaded from: classes.dex */
public interface FocusEventModifier extends Modifier.Element {

    /* compiled from: FocusEventModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.focus.FocusEventModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull FocusEventModifier focusEventModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusEventModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull FocusEventModifier focusEventModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusEventModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull FocusEventModifier focusEventModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusEventModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull FocusEventModifier focusEventModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusEventModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusEventModifier focusEventModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return FocusEventModifier.super.then(other);
        }
    }

    void onFocusEvent(@NotNull FocusState focusState);
}
