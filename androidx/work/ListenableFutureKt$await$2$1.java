package androidx.work;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.InterfaceC37780o;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: ListenableFuture.kt */
@Metadata
/* loaded from: classes2.dex */
public final class ListenableFutureKt$await$2$1 implements Runnable {
    final /* synthetic */ InterfaceC37780o<R> $cancellableContinuation;
    final /* synthetic */ ListenableFuture<R> $this_await;

    /* JADX WARN: Multi-variable type inference failed */
    public ListenableFutureKt$await$2$1(InterfaceC37780o<? super R> interfaceC37780o, ListenableFuture<R> listenableFuture) {
        this.$cancellableContinuation = interfaceC37780o;
        this.$this_await = listenableFuture;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Continuation continuation = this.$cancellableContinuation;
            Result.C38506a c38506a = Result.f101870c;
            continuation.resumeWith(Result.m14549b(this.$this_await.get()));
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                cause = th;
            }
            if (th instanceof CancellationException) {
                this.$cancellableContinuation.mo15166c(cause);
                return;
            }
            Continuation continuation2 = this.$cancellableContinuation;
            Result.C38506a c38506a2 = Result.f101870c;
            continuation2.resumeWith(Result.m14549b(C38508r.m14540a(cause)));
        }
    }
}
