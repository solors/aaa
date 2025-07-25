package androidx.compose.p015ui.modifier;

import androidx.compose.p015ui.Modifier;
import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ModifierLocalConsumer.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumer */
/* loaded from: classes.dex */
public interface ModifierLocalConsumer extends Modifier.Element {

    /* compiled from: ModifierLocalConsumer.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.modifier.ModifierLocalConsumer$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ModifierLocalConsumer modifierLocalConsumer, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return ModifierLocalConsumer.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull ModifierLocalConsumer modifierLocalConsumer, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return ModifierLocalConsumer.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull ModifierLocalConsumer modifierLocalConsumer, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) ModifierLocalConsumer.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull ModifierLocalConsumer modifierLocalConsumer, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) ModifierLocalConsumer.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ModifierLocalConsumer modifierLocalConsumer, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return ModifierLocalConsumer.super.then(other);
        }
    }

    void onModifierLocalsUpdated(@NotNull ModifierLocalReadScope modifierLocalReadScope);
}
