package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: RemeasurementModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.RemeasurementModifier */
/* loaded from: classes.dex */
public interface RemeasurementModifier extends Modifier.Element {

    /* compiled from: RemeasurementModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.RemeasurementModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull RemeasurementModifier remeasurementModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return RemeasurementModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull RemeasurementModifier remeasurementModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return RemeasurementModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull RemeasurementModifier remeasurementModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) RemeasurementModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull RemeasurementModifier remeasurementModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) RemeasurementModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull RemeasurementModifier remeasurementModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return RemeasurementModifier.super.then(other);
        }
    }

    void onRemeasurementAvailable(@NotNull Remeasurement remeasurement);
}
