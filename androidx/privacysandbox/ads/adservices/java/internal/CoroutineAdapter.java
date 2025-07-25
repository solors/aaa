package androidx.privacysandbox.ads.adservices.java.internal;

import androidx.concurrent.futures.CallbackToFutureAdapter;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Deferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: androidx.privacysandbox.ads.adservices.java.internal.CoroutineAdapterKt */
/* loaded from: classes2.dex */
public final class CoroutineAdapter {
    @NotNull
    public static final <T> ListenableFuture<T> asListenableFuture(@NotNull final Deferred<? extends T> deferred, @Nullable final Object obj) {
        Intrinsics.checkNotNullParameter(deferred, "<this>");
        ListenableFuture<T> future = CallbackToFutureAdapter.getFuture(new CallbackToFutureAdapter.Resolver() { // from class: androidx.privacysandbox.ads.adservices.java.internal.a
            @Override // androidx.concurrent.futures.CallbackToFutureAdapter.Resolver
            public final Object attachCompleter(CallbackToFutureAdapter.Completer completer) {
                Object asListenableFuture$lambda$0;
                asListenableFuture$lambda$0 = CoroutineAdapter.asListenableFuture$lambda$0(deferred, obj, completer);
                return asListenableFuture$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(future, "getFuture { completer ->…        }\n    }\n    tag\n}");
        return future;
    }

    public static /* synthetic */ ListenableFuture asListenableFuture$default(Deferred deferred, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            obj = "Deferred.asListenableFuture";
        }
        return asListenableFuture(deferred, obj);
    }

    public static final Object asListenableFuture$lambda$0(Deferred this_asListenableFuture, Object obj, CallbackToFutureAdapter.Completer completer) {
        Intrinsics.checkNotNullParameter(this_asListenableFuture, "$this_asListenableFuture");
        Intrinsics.checkNotNullParameter(completer, "completer");
        this_asListenableFuture.mo16119k(new CoroutineAdapterKt$asListenableFuture$1$1(completer, this_asListenableFuture));
        return obj;
    }
}
