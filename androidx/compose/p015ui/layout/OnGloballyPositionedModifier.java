package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnGloballyPositionedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifier */
/* loaded from: classes.dex */
public interface OnGloballyPositionedModifier extends Modifier.Element {

    /* compiled from: OnGloballyPositionedModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.OnGloballyPositionedModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return OnGloballyPositionedModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return OnGloballyPositionedModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) OnGloballyPositionedModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) OnGloballyPositionedModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull OnGloballyPositionedModifier onGloballyPositionedModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return OnGloballyPositionedModifier.super.then(other);
        }
    }

    void onGloballyPositioned(@NotNull LayoutCoordinates layoutCoordinates);
}
