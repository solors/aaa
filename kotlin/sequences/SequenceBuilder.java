package kotlin.sequences;

import ae.KMarkers;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.C37586g;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.C37591h;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.C38508r;
import p804nd.Result;
import sd.C42688d;

@Metadata
/* renamed from: kotlin.sequences.i */
/* loaded from: classes7.dex */
public final class SequenceBuilder<T> extends AbstractC37648j<T> implements Iterator<T>, Continuation<Unit>, KMarkers {

    /* renamed from: b */
    private int f99398b;
    @Nullable

    /* renamed from: c */
    private T f99399c;
    @Nullable

    /* renamed from: d */
    private Iterator<? extends T> f99400d;
    @Nullable

    /* renamed from: f */
    private Continuation<? super Unit> f99401f;

    /* renamed from: f */
    private final Throwable m16880f() {
        int i = this.f99398b;
        if (i != 4) {
            if (i != 5) {
                return new IllegalStateException("Unexpected state of the iterator: " + this.f99398b);
            }
            return new IllegalStateException("Iterator has failed.");
        }
        return new NoSuchElementException();
    }

    /* renamed from: g */
    private final T m16879g() {
        if (hasNext()) {
            return next();
        }
        throw new NoSuchElementException();
    }

    @Override // kotlin.sequences.AbstractC37648j
    @Nullable
    /* renamed from: a */
    public Object mo16877a(T t, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m6959e2;
        Object m6959e3;
        this.f99399c = t;
        this.f99398b = 3;
        this.f99401f = continuation;
        m6959e = C42688d.m6959e();
        m6959e2 = C42688d.m6959e();
        if (m6959e == m6959e2) {
            C37591h.m17084c(continuation);
        }
        m6959e3 = C42688d.m6959e();
        if (m6959e == m6959e3) {
            return m6959e;
        }
        return Unit.f99208a;
    }

    @Override // kotlin.sequences.AbstractC37648j
    @Nullable
    /* renamed from: b */
    public Object mo16876b(@NotNull Iterator<? extends T> it, @NotNull Continuation<? super Unit> continuation) {
        Object m6959e;
        Object m6959e2;
        Object m6959e3;
        if (!it.hasNext()) {
            return Unit.f99208a;
        }
        this.f99400d = it;
        this.f99398b = 2;
        this.f99401f = continuation;
        m6959e = C42688d.m6959e();
        m6959e2 = C42688d.m6959e();
        if (m6959e == m6959e2) {
            C37591h.m17084c(continuation);
        }
        m6959e3 = C42688d.m6959e();
        if (m6959e == m6959e3) {
            return m6959e;
        }
        return Unit.f99208a;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return C37586g.f99289b;
    }

    /* renamed from: h */
    public final void m16878h(@Nullable Continuation<? super Unit> continuation) {
        this.f99401f = continuation;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        while (true) {
            int i = this.f99398b;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2 || i == 3) {
                        return true;
                    }
                    if (i == 4) {
                        return false;
                    }
                    throw m16880f();
                }
                Iterator<? extends T> it = this.f99400d;
                Intrinsics.m17074g(it);
                if (it.hasNext()) {
                    this.f99398b = 2;
                    return true;
                }
                this.f99400d = null;
            }
            this.f99398b = 5;
            Continuation<? super Unit> continuation = this.f99401f;
            Intrinsics.m17074g(continuation);
            this.f99401f = null;
            Result.C38506a c38506a = Result.f101870c;
            continuation.resumeWith(Result.m14549b(Unit.f99208a));
        }
    }

    @Override // java.util.Iterator
    public T next() {
        int i = this.f99398b;
        if (i != 0 && i != 1) {
            if (i != 2) {
                if (i == 3) {
                    this.f99398b = 0;
                    T t = this.f99399c;
                    this.f99399c = null;
                    return t;
                }
                throw m16880f();
            }
            this.f99398b = 1;
            Iterator<? extends T> it = this.f99400d;
            Intrinsics.m17074g(it);
            return it.next();
        }
        return m16879g();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        C38508r.m14539b(obj);
        this.f99398b = 4;
    }
}
