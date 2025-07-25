package androidx.compose.p015ui.layout;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.unit.Density;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ParentDataModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.layout.ParentDataModifier */
/* loaded from: classes.dex */
public interface ParentDataModifier extends Modifier.Element {

    /* compiled from: ParentDataModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.layout.ParentDataModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull ParentDataModifier parentDataModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return ParentDataModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull ParentDataModifier parentDataModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return ParentDataModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull ParentDataModifier parentDataModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) ParentDataModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull ParentDataModifier parentDataModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) ParentDataModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull ParentDataModifier parentDataModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return ParentDataModifier.super.then(other);
        }
    }

    @Nullable
    Object modifyParentData(@NotNull Density density, @Nullable Object obj);
}
