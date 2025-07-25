package androidx.compose.p015ui;

import androidx.compose.p015ui.Modifier;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Modifier.kt */
@StabilityInferred(parameters = 0)
@Metadata
/* renamed from: androidx.compose.ui.CombinedModifier */
/* loaded from: classes.dex */
public final class CombinedModifier implements Modifier {
    public static final int $stable = 0;
    @NotNull
    private final Modifier inner;
    @NotNull
    private final Modifier outer;

    public CombinedModifier(@NotNull Modifier outer, @NotNull Modifier inner) {
        Intrinsics.checkNotNullParameter(outer, "outer");
        Intrinsics.checkNotNullParameter(inner, "inner");
        this.outer = outer;
        this.inner = inner;
    }

    @Override // androidx.compose.p015ui.Modifier
    public boolean all(@NotNull Function1<? super Modifier.Element, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (this.outer.all(predicate) && this.inner.all(predicate)) {
            return true;
        }
        return false;
    }

    @Override // androidx.compose.p015ui.Modifier
    public boolean any(@NotNull Function1<? super Modifier.Element, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        if (!this.outer.any(predicate) && !this.inner.any(predicate)) {
            return false;
        }
        return true;
    }

    public boolean equals(@Nullable Object obj) {
        if (obj instanceof CombinedModifier) {
            CombinedModifier combinedModifier = (CombinedModifier) obj;
            if (Intrinsics.m17075f(this.outer, combinedModifier.outer) && Intrinsics.m17075f(this.inner, combinedModifier.inner)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p015ui.Modifier
    public <R> R foldIn(R r, @NotNull Function2<? super R, ? super Modifier.Element, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.inner.foldIn(this.outer.foldIn(r, operation), operation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.p015ui.Modifier
    public <R> R foldOut(R r, @NotNull Function2<? super Modifier.Element, ? super R, ? extends R> operation) {
        Intrinsics.checkNotNullParameter(operation, "operation");
        return (R) this.outer.foldOut(this.inner.foldOut(r, operation), operation);
    }

    public int hashCode() {
        return this.outer.hashCode() + (this.inner.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return '[' + ((String) foldIn("", CombinedModifier$toString$1.INSTANCE)) + ']';
    }
}
