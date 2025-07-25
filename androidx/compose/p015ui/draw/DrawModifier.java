package androidx.compose.p015ui.draw;

import androidx.compose.p015ui.Modifier;
import androidx.compose.p015ui.graphics.drawscope.ContentDrawScope;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: DrawModifier.kt */
@Metadata
/* renamed from: androidx.compose.ui.draw.DrawModifier */
/* loaded from: classes.dex */
public interface DrawModifier extends Modifier.Element {

    /* compiled from: DrawModifier.kt */
    @Metadata
    /* renamed from: androidx.compose.ui.draw.DrawModifier$DefaultImpls */
    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static boolean all(@NotNull DrawModifier drawModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return DrawModifier.super.all(predicate);
        }

        @Deprecated
        public static boolean any(@NotNull DrawModifier drawModifier, @NotNull Function1<? super Modifier.Element, Boolean> predicate) {
            Intrinsics.checkNotNullParameter(predicate, "predicate");
            return DrawModifier.super.any(predicate);
        }

        @Deprecated
        public static <R> R foldIn(@NotNull DrawModifier drawModifier, R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) DrawModifier.super.foldIn(r, operation);
        }

        @Deprecated
        public static <R> R foldOut(@NotNull DrawModifier drawModifier, R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
            Intrinsics.checkNotNullParameter(operation, "operation");
            return (R) DrawModifier.super.foldOut(r, operation);
        }

        @Deprecated
        @NotNull
        public static Modifier then(@NotNull DrawModifier drawModifier, @NotNull Modifier other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return DrawModifier.super.then(other);
        }
    }

    void draw(@NotNull ContentDrawScope contentDrawScope);
}
