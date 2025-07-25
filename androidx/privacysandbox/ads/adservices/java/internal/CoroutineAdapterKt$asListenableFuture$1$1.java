package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: CoroutineAdapter.kt */
@Metadata
/* loaded from: classes2.dex */
public final class CoroutineAdapterKt$asListenableFuture$1$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CallbackToFutureAdapter.Completer<T> $completer;
    final /* synthetic */ Deferred<T> $this_asListenableFuture;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CoroutineAdapterKt$asListenableFuture$1$1(CallbackToFutureAdapter.Completer<T> completer, Deferred<? extends T> deferred) {
        super(1);
        this.$completer = completer;
        this.$this_asListenableFuture = deferred;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.f99208a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(@Nullable Throwable th) {
        if (th != null) {
            if (th instanceof CancellationException) {
                this.$completer.setCancelled();
                return;
            } else {
                this.$completer.setException(th);
                return;
            }
        }
        this.$completer.set(this.$this_asListenableFuture.mo16072e());
    }
}
