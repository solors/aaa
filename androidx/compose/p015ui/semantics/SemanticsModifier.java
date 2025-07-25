package androidx.compose.p015ui.semantics;

import androidx.compose.p015ui.Modifier;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: SemanticsModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.semantics.SemanticsModifier */
/* loaded from: classes.dex */
public interface SemanticsModifier extends Modifier.Element {

    /* compiled from: SemanticsModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.semantics.SemanticsModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull SemanticsModifier semanticsModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return SemanticsModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull SemanticsModifier semanticsModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return SemanticsModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull SemanticsModifier semanticsModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) SemanticsModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull SemanticsModifier semanticsModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) SemanticsModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull SemanticsModifier semanticsModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return SemanticsModifier.super.then(other);
        }
    }

    int getId();

    @NotNull
    SemanticsConfiguration getSemanticsConfiguration();
}
