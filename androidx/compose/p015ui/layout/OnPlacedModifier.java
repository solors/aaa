package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnPlacedModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnPlacedModifier */
/* loaded from: classes.dex */
public interface OnPlacedModifier extends Modifier.Element {

    /* compiled from: OnPlacedModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.OnPlacedModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull OnPlacedModifier onPlacedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return OnPlacedModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull OnPlacedModifier onPlacedModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return OnPlacedModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull OnPlacedModifier onPlacedModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) OnPlacedModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull OnPlacedModifier onPlacedModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) OnPlacedModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull OnPlacedModifier onPlacedModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return OnPlacedModifier.super.then(other);
        }
    }

    void onPlaced(@NotNull LayoutCoordinates layoutCoordinates);
}
