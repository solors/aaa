package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: LayoutModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.LayoutModifier */
/* loaded from: classes.dex */
public interface LayoutModifier extends Modifier.Element {

    /* compiled from: LayoutModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.LayoutModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull LayoutModifier layoutModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return LayoutModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull LayoutModifier layoutModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return LayoutModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull LayoutModifier layoutModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) LayoutModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull LayoutModifier layoutModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) LayoutModifier.super.foldOut(r, operation);
        }

        @Deprecated
        public static int maxIntrinsicHeight(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.maxIntrinsicHeight(receiver, measurable, i);
        }

        @Deprecated
        public static int maxIntrinsicWidth(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.maxIntrinsicWidth(receiver, measurable, i);
        }

        @Deprecated
        public static int minIntrinsicHeight(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.minIntrinsicHeight(receiver, measurable, i);
        }

        @Deprecated
        public static int minIntrinsicWidth(@NotNull LayoutModifier layoutModifier, @NotNull IntrinsicMeasureScope receiver, @NotNull IntrinsicMeasurable measurable, int i) {
            Intrinsics.checkNotNullParameter(receiver, "receiver");
            Intrinsics.checkNotNullParameter(measurable, "measurable");
            return LayoutModifier.super.minIntrinsicWidth(receiver, measurable, i);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull LayoutModifier layoutModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return LayoutModifier.super.then(other);
        }
    }

    default int maxIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxHeight$ui_release(this, intrinsicMeasureScope, measurable, i);
    }

    default int maxIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.maxWidth$ui_release(this, intrinsicMeasureScope, measurable, i);
    }

    @NotNull
    /* renamed from: measure-3p2s80s */
    MeasureResult mo105929measure3p2s80s(@NotNull MeasureScope measureScope, @NotNull Measurable measurable, long j);

    default int minIntrinsicHeight(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minHeight$ui_release(this, intrinsicMeasureScope, measurable, i);
    }

    default int minIntrinsicWidth(@NotNull IntrinsicMeasureScope intrinsicMeasureScope, @NotNull IntrinsicMeasurable measurable, int i) {
        Intrinsics.checkNotNullParameter(intrinsicMeasureScope, "<this>");
        Intrinsics.checkNotNullParameter(measurable, "measurable");
        return MeasuringIntrinsics.INSTANCE.minWidth$ui_release(this, intrinsicMeasureScope, measurable, i);
    }
}
