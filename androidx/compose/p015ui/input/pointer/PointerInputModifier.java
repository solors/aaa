package androidx.compose.p015ui.input.pointer;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: PointerEvent.kt */
@Metadata
/* renamed from: androidx.compose.ui.input.pointer.PointerInputModifier */
/* loaded from: classes.dex */
public interface PointerInputModifier extends Modifier.Element {

    /* compiled from: PointerEvent.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.input.pointer.PointerInputModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull PointerInputModifier pointerInputModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return PointerInputModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull PointerInputModifier pointerInputModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return PointerInputModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull PointerInputModifier pointerInputModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) PointerInputModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull PointerInputModifier pointerInputModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) PointerInputModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull PointerInputModifier pointerInputModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return PointerInputModifier.super.then(other);
        }
    }

    @NotNull
    PointerInputFilter getPointerInputFilter();
}
