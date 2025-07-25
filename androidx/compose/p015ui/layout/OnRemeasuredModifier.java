package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: OnRemeasuredModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.OnRemeasuredModifier */
/* loaded from: classes.dex */
public interface OnRemeasuredModifier extends Modifier.Element {

    /* compiled from: OnRemeasuredModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.OnRemeasuredModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull OnRemeasuredModifier onRemeasuredModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return OnRemeasuredModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull OnRemeasuredModifier onRemeasuredModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return OnRemeasuredModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull OnRemeasuredModifier onRemeasuredModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) OnRemeasuredModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull OnRemeasuredModifier onRemeasuredModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) OnRemeasuredModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull OnRemeasuredModifier onRemeasuredModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return OnRemeasuredModifier.super.then(other);
        }
    }

    /* renamed from: onRemeasured-ozmzZPI */
    void mo106147onRemeasuredozmzZPI(long j);
}
