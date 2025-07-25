package p1061yc;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p1061yc.InterfaceC45101f;

@Metadata
/* renamed from: yc.e */
/* loaded from: classes9.dex */
public abstract class Pool<T> implements InterfaceC45101f<T> {
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        InterfaceC45101f.C45102a.m914a(this);
    }

    @Override // p1061yc.InterfaceC45101f
    /* renamed from: p */
    public void mo915p(@NotNull T instance) {
        Intrinsics.checkNotNullParameter(instance, "instance");
    }

    @Override // p1061yc.InterfaceC45101f
    public void dispose() {
    }
}
