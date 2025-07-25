package androidx.room;

import androidx.annotation.RestrictTo;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.coroutines.ContinuationInterceptor;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: RoomDatabaseExt.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class TransactionElement implements CoroutineContext.Element {
    @NotNull
    public static final Key Key = new Key(null);
    @NotNull
    private final AtomicInteger referenceCount;
    @NotNull
    private final ContinuationInterceptor transactionDispatcher;

    /* compiled from: RoomDatabaseExt.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Key implements CoroutineContext.InterfaceC37576b<TransactionElement> {
        private Key() {
        }

        public /* synthetic */ Key(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public TransactionElement(@NotNull ContinuationInterceptor transactionDispatcher) {
        Intrinsics.checkNotNullParameter(transactionDispatcher, "transactionDispatcher");
        this.transactionDispatcher = transactionDispatcher;
        this.referenceCount = new AtomicInteger(0);
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public <R> R fold(R r, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.C37573a.m17118a(this, r, function2);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @Nullable
    public <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.InterfaceC37576b<E> interfaceC37576b) {
        return (E) CoroutineContext.Element.C37573a.m17117b(this, interfaceC37576b);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public CoroutineContext.InterfaceC37576b<TransactionElement> getKey() {
        return Key;
    }

    @NotNull
    public final ContinuationInterceptor getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext minusKey(@NotNull CoroutineContext.InterfaceC37576b<?> interfaceC37576b) {
        return CoroutineContext.Element.C37573a.m17116c(this, interfaceC37576b);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.C37573a.m17115d(this, coroutineContext);
    }

    public final void release() {
        if (this.referenceCount.decrementAndGet() >= 0) {
            return;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }
}
