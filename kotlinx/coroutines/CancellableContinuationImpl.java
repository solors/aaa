package kotlinx.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: kotlinx.coroutines.b0 */
/* loaded from: classes7.dex */
final class CancellableContinuationImpl {
    @Nullable

    /* renamed from: a */
    public final Object f99509a;
    @Nullable

    /* renamed from: b */
    public final AbstractC37773m f99510b;
    @Nullable

    /* renamed from: c */
    public final Function1<Throwable, Unit> f99511c;
    @Nullable

    /* renamed from: d */
    public final Object f99512d;
    @Nullable

    /* renamed from: e */
    public final Throwable f99513e;

    /* JADX WARN: Multi-variable type inference failed */
    public CancellableContinuationImpl(@Nullable Object obj, @Nullable AbstractC37773m abstractC37773m, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        this.f99509a = obj;
        this.f99510b = abstractC37773m;
        this.f99511c = function1;
        this.f99512d = obj2;
        this.f99513e = th;
    }

    /* renamed from: b */
    public static /* synthetic */ CancellableContinuationImpl m16414b(CancellableContinuationImpl cancellableContinuationImpl, Object obj, AbstractC37773m abstractC37773m, Function1 function1, Object obj2, Throwable th, int i, Object obj3) {
        if ((i & 1) != 0) {
            obj = cancellableContinuationImpl.f99509a;
        }
        if ((i & 2) != 0) {
            abstractC37773m = cancellableContinuationImpl.f99510b;
        }
        AbstractC37773m abstractC37773m2 = abstractC37773m;
        Function1<Throwable, Unit> function12 = function1;
        if ((i & 4) != 0) {
            function12 = cancellableContinuationImpl.f99511c;
        }
        Function1 function13 = function12;
        if ((i & 8) != 0) {
            obj2 = cancellableContinuationImpl.f99512d;
        }
        Object obj4 = obj2;
        if ((i & 16) != 0) {
            th = cancellableContinuationImpl.f99513e;
        }
        return cancellableContinuationImpl.m16415a(obj, abstractC37773m2, function13, obj4, th);
    }

    @NotNull
    /* renamed from: a */
    public final CancellableContinuationImpl m16415a(@Nullable Object obj, @Nullable AbstractC37773m abstractC37773m, @Nullable Function1<? super Throwable, Unit> function1, @Nullable Object obj2, @Nullable Throwable th) {
        return new CancellableContinuationImpl(obj, abstractC37773m, function1, obj2, th);
    }

    /* renamed from: c */
    public final boolean m16413c() {
        if (this.f99513e != null) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final void m16412d(@NotNull C37784p<?> c37784p, @NotNull Throwable th) {
        AbstractC37773m abstractC37773m = this.f99510b;
        if (abstractC37773m != null) {
            c37784p.m16144k(abstractC37773m, th);
        }
        Function1<Throwable, Unit> function1 = this.f99511c;
        if (function1 != null) {
            c37784p.m16143l(function1, th);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancellableContinuationImpl)) {
            return false;
        }
        CancellableContinuationImpl cancellableContinuationImpl = (CancellableContinuationImpl) obj;
        if (Intrinsics.m17075f(this.f99509a, cancellableContinuationImpl.f99509a) && Intrinsics.m17075f(this.f99510b, cancellableContinuationImpl.f99510b) && Intrinsics.m17075f(this.f99511c, cancellableContinuationImpl.f99511c) && Intrinsics.m17075f(this.f99512d, cancellableContinuationImpl.f99512d) && Intrinsics.m17075f(this.f99513e, cancellableContinuationImpl.f99513e)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        Object obj = this.f99509a;
        int i = 0;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        int i2 = hashCode * 31;
        AbstractC37773m abstractC37773m = this.f99510b;
        if (abstractC37773m == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = abstractC37773m.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Function1<Throwable, Unit> function1 = this.f99511c;
        if (function1 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = function1.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        Object obj2 = this.f99512d;
        if (obj2 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = obj2.hashCode();
        }
        int i5 = (i4 + hashCode4) * 31;
        Throwable th = this.f99513e;
        if (th != null) {
            i = th.hashCode();
        }
        return i5 + i;
    }

    @NotNull
    public String toString() {
        return "CompletedContinuation(result=" + this.f99509a + ", cancelHandler=" + this.f99510b + ", onCancellation=" + this.f99511c + ", idempotentResume=" + this.f99512d + ", cancelCause=" + this.f99513e + ')';
    }

    public /* synthetic */ CancellableContinuationImpl(Object obj, AbstractC37773m abstractC37773m, Function1 function1, Object obj2, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i & 2) != 0 ? null : abstractC37773m, (i & 4) != 0 ? null : function1, (i & 8) != 0 ? null : obj2, (i & 16) != 0 ? null : th);
    }
}
