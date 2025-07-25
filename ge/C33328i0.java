package ge;

import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import p674fe.BufferOverflow;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Share.kt */
@Metadata
/* renamed from: ge.i0 */
/* loaded from: classes8.dex */
public final class C33328i0<T> {
    @NotNull

    /* renamed from: a */
    public final InterfaceC33327h<T> f90954a;

    /* renamed from: b */
    public final int f90955b;
    @NotNull

    /* renamed from: c */
    public final BufferOverflow f90956c;
    @NotNull

    /* renamed from: d */
    public final CoroutineContext f90957d;

    /* JADX WARN: Multi-variable type inference failed */
    public C33328i0(@NotNull InterfaceC33327h<? extends T> interfaceC33327h, int i, @NotNull BufferOverflow bufferOverflow, @NotNull CoroutineContext coroutineContext) {
        this.f90954a = interfaceC33327h;
        this.f90955b = i;
        this.f90956c = bufferOverflow;
        this.f90957d = coroutineContext;
    }
}
