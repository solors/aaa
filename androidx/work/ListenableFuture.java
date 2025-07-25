package androidx.work;

import androidx.work.impl.utils.futures.SettableFuture;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.InterfaceC37708b2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.work.JobListenableFuture */
/* loaded from: classes2.dex */
public final class ListenableFuture<R> implements com.google.common.util.concurrent.ListenableFuture<R> {
    @NotNull
    private final InterfaceC37708b2 job;
    @NotNull
    private final SettableFuture<R> underlying;

    /* compiled from: ListenableFuture.kt */
    @Metadata
    /* renamed from: androidx.work.JobListenableFuture$1 */
    /* loaded from: classes2.dex */
    static final class C32331 extends Lambda implements Function1<Throwable, Unit> {
        final /* synthetic */ ListenableFuture<R> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C32331(ListenableFuture<R> listenableFuture) {
            super(1);
            this.this$0 = listenableFuture;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.f99208a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(@Nullable Throwable th) {
            if (th == null) {
                if (!((ListenableFuture) this.this$0).underlying.isDone()) {
                    throw new IllegalArgumentException("Failed requirement.".toString());
                }
            } else if (th instanceof CancellationException) {
                ((ListenableFuture) this.this$0).underlying.cancel(true);
            } else {
                SettableFuture settableFuture = ((ListenableFuture) this.this$0).underlying;
                Throwable cause = th.getCause();
                if (cause != null) {
                    th = cause;
                }
                settableFuture.setException(th);
            }
        }
    }

    public ListenableFuture(@NotNull InterfaceC37708b2 job, @NotNull SettableFuture<R> underlying) {
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.job = job;
        this.underlying = underlying;
        job.mo16119k(new C32331(this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.underlying.addListener(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.underlying.cancel(z);
    }

    public final void complete(R r) {
        this.underlying.set(r);
    }

    @Override // java.util.concurrent.Future
    public R get() {
        return this.underlying.get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return this.underlying.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return this.underlying.isDone();
    }

    @Override // java.util.concurrent.Future
    public R get(long j, TimeUnit timeUnit) {
        return this.underlying.get(j, timeUnit);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public /* synthetic */ ListenableFuture(kotlinx.coroutines.InterfaceC37708b2 r1, androidx.work.impl.utils.futures.SettableFuture r2, int r3, kotlin.jvm.internal.DefaultConstructorMarker r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto Ld
            androidx.work.impl.utils.futures.SettableFuture r2 = androidx.work.impl.utils.futures.SettableFuture.create()
            java.lang.String r3 = "create()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        Ld:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.ListenableFuture.<init>(kotlinx.coroutines.b2, androidx.work.impl.utils.futures.SettableFuture, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }
}
