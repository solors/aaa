package androidx.compose.p015ui;

import androidx.compose.runtime.Stable;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: Modifier.kt */
@Stable
@Metadata
/* renamed from: androidx.compose.ui.Modifier */
/* loaded from: classes.dex */
public interface Modifier {
    @NotNull
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: Modifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.Modifier$Companion */
    /* loaded from: classes.dex */
    public static final class Companion implements Modifier {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }

        @Override // androidx.compose.p015ui.Modifier
        public boolean all(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return true;
        }

        @Override // androidx.compose.p015ui.Modifier
        public boolean any(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return false;
        }

        @Override // androidx.compose.p015ui.Modifier
        public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @Override // androidx.compose.p015ui.Modifier
        public <R> R foldOut(R r, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return r;
        }

        @Override // androidx.compose.p015ui.Modifier
        @NotNull
        public Modifier then(@NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return other;
        }

        @NotNull
        public String toString() {
            return "Modifier";
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.Modifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        @NotNull
        public static Modifier then(@NotNull Modifier modifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return Modifier.super.then(other);
        }
    }

    /* compiled from: Modifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.Modifier$Element */
    /* loaded from: classes.dex */
    public interface Element extends Modifier {

        /* compiled from: Modifier.kt */
        @Metadata
        /* renamed from: androidx.compose.ui.Modifier$Element$DefaultImpls */
        /* loaded from: classes.dex */
        public static final class DefaultImpls {
            @Deprecated
            public static boolean all(@NotNull Element element, @NotNull Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return Element.super.all(predicate);
            }

            @Deprecated
            public static boolean any(@NotNull Element element, @NotNull Function1<? super Element, Boolean> predicate) {
                Intrinsics.checkNotNullParameter(predicate, "predicate");
                return Element.super.any(predicate);
            }

            @Deprecated
            public static <R> R foldIn(@NotNull Element element, R r, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) Element.super.foldIn(r, operation);
            }

            @Deprecated
            public static <R> R foldOut(@NotNull Element element, R r, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
                Intrinsics.checkNotNullParameter(operation, "operation");
                return (R) Element.super.foldOut(r, operation);
            }

            @Deprecated
            @NotNull
            public static Modifier then(@NotNull Element element, @NotNull Modifier other) {
                Intrinsics.checkNotNullParameter(other, "other");
                return Element.super.then(other);
            }
        }

        @Override // androidx.compose.p015ui.Modifier
        default boolean all(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.p015ui.Modifier
        default boolean any(@NotNull Function1<? super Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return predicate.invoke(this).booleanValue();
        }

        @Override // androidx.compose.p015ui.Modifier
        default <R> R foldIn(R r, @NotNull Function2<? super R, ? super Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.mo105910invoke(r, this);
        }

        @Override // androidx.compose.p015ui.Modifier
        default <R> R foldOut(R r, @NotNull Function2<? super Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return operation.mo105910invoke(this, r);
        }
    }

    boolean all(@NotNull Function1<? super Element, Boolean> function1);

    boolean any(@NotNull Function1<? super Element, Boolean> function1);

    <R> R foldIn(R r, @NotNull Function2<? super R, ? super Element, ? extends R> function2);

    <R> R foldOut(R r, @NotNull Function2<? super Element, ? super R, ? extends R> function2);

    @NotNull
    default Modifier then(@NotNull Modifier other) {
        Intrinsics.checkNotNullParameter(other, "other");
        if (other == Companion) {
            return this;
        }
        return new CombinedModifier(this, other);
    }
}
