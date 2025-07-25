package io.ktor.utils.p731io;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: Coroutines.kt */
@Metadata
/* renamed from: io.ktor.utils.io.m */
/* loaded from: classes9.dex */
final class C37225m implements InterfaceC37240u, InterfaceC37242w, CoroutineScope {
    @NotNull

    /* renamed from: b */
    private final ByteChannelCtor f98307b;

    /* renamed from: c */
    private final /* synthetic */ CoroutineScope f98308c;

    public C37225m(@NotNull CoroutineScope delegate, @NotNull ByteChannelCtor channel) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(channel, "channel");
        this.f98307b = channel;
        this.f98308c = delegate;
    }

    @Override // io.ktor.utils.p731io.InterfaceC37242w
    @NotNull
    /* renamed from: b */
    public ByteChannelCtor mo18687a() {
        return this.f98307b;
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.f98308c.getCoroutineContext();
    }
}
