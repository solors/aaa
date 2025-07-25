package p804nd;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1076zd.InterfaceC45268n;

@Metadata
/* renamed from: nd.a */
/* loaded from: classes5.dex */
public final class DeepRecursive<T, R> {
    @NotNull

    /* renamed from: a */
    private final InterfaceC45268n<AbstractC38492c<T, R>, T, Continuation<? super R>, Object> f101845a;

    /* JADX WARN: Multi-variable type inference failed */
    public DeepRecursive(@NotNull InterfaceC45268n<? super AbstractC38492c<T, R>, ? super T, ? super Continuation<? super R>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        this.f101845a = block;
    }

    @NotNull
    /* renamed from: a */
    public final InterfaceC45268n<AbstractC38492c<T, R>, T, Continuation<? super R>, Object> m14619a() {
        return this.f101845a;
    }
}
