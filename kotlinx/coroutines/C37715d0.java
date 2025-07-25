package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CompletionState.kt */
@Metadata
/* renamed from: kotlinx.coroutines.d0 */
/* loaded from: classes7.dex */
public final class C37715d0 {
    @Nullable

    /* renamed from: a */
    public final Object f99527a;
    @NotNull

    /* renamed from: b */
    public final Function1<Throwable, Unit> f99528b;

    /* JADX WARN: Multi-variable type inference failed */
    public C37715d0(@Nullable Object obj, @NotNull Function1<? super Throwable, Unit> function1) {
        this.f99527a = obj;
        this.f99528b = function1;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C37715d0)) {
            return false;
        }
        C37715d0 c37715d0 = (C37715d0) obj;
        if (Intrinsics.m17075f(this.f99527a, c37715d0.f99527a) && Intrinsics.m17075f(this.f99528b, c37715d0.f99528b)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        Object obj = this.f99527a;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return (hashCode * 31) + this.f99528b.hashCode();
    }

    @NotNull
    public String toString() {
        return "CompletedWithCancellation(result=" + this.f99527a + ", onCancellation=" + this.f99528b + ')';
    }
}
