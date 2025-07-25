package kotlin.coroutines;

import androidx.concurrent.futures.C1074a;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.Result;
import sd.C42688d;

@Metadata
/* renamed from: kotlin.coroutines.h */
/* loaded from: classes7.dex */
public final class SafeContinuationJvm<T> implements Continuation<T>, CoroutineStackFrame {
    @NotNull

    /* renamed from: c */
    private static final C37587a f99290c = new C37587a(null);

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater<SafeContinuationJvm<?>, Object> f99291d = AtomicReferenceFieldUpdater.newUpdater(SafeContinuationJvm.class, Object.class, "result");
    @NotNull

    /* renamed from: b */
    private final Continuation<T> f99292b;
    @Nullable
    private volatile Object result;

    /* compiled from: SafeContinuationJvm.kt */
    @Metadata
    /* renamed from: kotlin.coroutines.h$a */
    /* loaded from: classes7.dex */
    private static final class C37587a {
        private C37587a() {
        }

        public /* synthetic */ C37587a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SafeContinuationJvm(@NotNull Continuation<? super T> delegate, @Nullable Object obj) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f99292b = delegate;
        this.result = obj;
    }

    @Nullable
    /* renamed from: a */
    public final Object m17101a() {
        Object m6959e;
        Object m6959e2;
        Object m6959e3;
        Object obj = this.result;
        sd.Intrinsics intrinsics = sd.Intrinsics.f111780c;
        if (obj == intrinsics) {
            AtomicReferenceFieldUpdater<SafeContinuationJvm<?>, Object> atomicReferenceFieldUpdater = f99291d;
            m6959e2 = C42688d.m6959e();
            if (C1074a.m105283a(atomicReferenceFieldUpdater, this, intrinsics, m6959e2)) {
                m6959e3 = C42688d.m6959e();
                return m6959e3;
            }
            obj = this.result;
        }
        if (obj == sd.Intrinsics.f111781d) {
            m6959e = C42688d.m6959e();
            return m6959e;
        } else if (!(obj instanceof Result.C38507b)) {
            return obj;
        } else {
            throw ((Result.C38507b) obj).f101872b;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.CoroutineStackFrame
    @Nullable
    public CoroutineStackFrame getCallerFrame() {
        Continuation<T> continuation = this.f99292b;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    @NotNull
    public CoroutineContext getContext() {
        return this.f99292b.getContext();
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(@NotNull Object obj) {
        Object m6959e;
        Object m6959e2;
        while (true) {
            Object obj2 = this.result;
            sd.Intrinsics intrinsics = sd.Intrinsics.f111780c;
            if (obj2 != intrinsics) {
                m6959e = C42688d.m6959e();
                if (obj2 == m6959e) {
                    AtomicReferenceFieldUpdater<SafeContinuationJvm<?>, Object> atomicReferenceFieldUpdater = f99291d;
                    m6959e2 = C42688d.m6959e();
                    if (C1074a.m105283a(atomicReferenceFieldUpdater, this, m6959e2, sd.Intrinsics.f111781d)) {
                        this.f99292b.resumeWith(obj);
                        return;
                    }
                } else {
                    throw new IllegalStateException("Already resumed");
                }
            } else if (C1074a.m105283a(f99291d, this, intrinsics, obj)) {
                return;
            }
        }
    }

    @NotNull
    public String toString() {
        return "SafeContinuation for " + this.f99292b;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SafeContinuationJvm(@NotNull Continuation<? super T> delegate) {
        this(delegate, sd.Intrinsics.f111780c);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
    }
}
