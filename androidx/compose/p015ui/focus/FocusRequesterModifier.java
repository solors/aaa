package androidx.compose.p015ui.focus;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: FocusRequesterModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.focus.FocusRequesterModifier */
/* loaded from: classes.dex */
public interface FocusRequesterModifier extends Modifier.Element {

    /* compiled from: FocusRequesterModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.focus.FocusRequesterModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull FocusRequesterModifier focusRequesterModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusRequesterModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull FocusRequesterModifier focusRequesterModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return FocusRequesterModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull FocusRequesterModifier focusRequesterModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusRequesterModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull FocusRequesterModifier focusRequesterModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) FocusRequesterModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull FocusRequesterModifier focusRequesterModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return FocusRequesterModifier.super.then(other);
        }
    }

    @NotNull
    FocusRequester getFocusRequester();
}
