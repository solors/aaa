package ie;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.InterfaceC37825z2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ThreadContext.kt */
@Metadata
/* renamed from: ie.r0 */
/* loaded from: classes8.dex */
public final class C33652r0 {
    @NotNull

    /* renamed from: a */
    public final CoroutineContext f92129a;
    @NotNull

    /* renamed from: b */
    private final Object[] f92130b;
    @NotNull

    /* renamed from: c */
    private final InterfaceC37825z2<Object>[] f92131c;

    /* renamed from: d */
    private int f92132d;

    public C33652r0(@NotNull CoroutineContext coroutineContext, int i) {
        this.f92129a = coroutineContext;
        this.f92130b = new Object[i];
        this.f92131c = new InterfaceC37825z2[i];
    }

    /* renamed from: a */
    public final void m22915a(@NotNull InterfaceC37825z2<?> interfaceC37825z2, @Nullable Object obj) {
        Object[] objArr = this.f92130b;
        int i = this.f92132d;
        objArr[i] = obj;
        InterfaceC37825z2<Object>[] interfaceC37825z2Arr = this.f92131c;
        this.f92132d = i + 1;
        Intrinsics.m17073h(interfaceC37825z2, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        interfaceC37825z2Arr[i] = interfaceC37825z2;
    }

    /* renamed from: b */
    public final void m22914b(@NotNull CoroutineContext coroutineContext) {
        int length = this.f92131c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i = length - 1;
            InterfaceC37825z2<Object> interfaceC37825z2 = this.f92131c[length];
            Intrinsics.m17074g(interfaceC37825z2);
            interfaceC37825z2.restoreThreadContext(coroutineContext, this.f92130b[length]);
            if (i >= 0) {
                length = i;
            } else {
                return;
            }
        }
    }
}
