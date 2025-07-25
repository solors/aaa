package ke;

import ie.C33648p;
import kotlin.Metadata;
import kotlinx.coroutines.CoroutineDispatcher;
import org.jetbrains.annotations.NotNull;

/* compiled from: Dispatcher.kt */
@Metadata
/* renamed from: ke.c */
/* loaded from: classes8.dex */
public final class C37504c extends C37506f {
    @NotNull

    /* renamed from: i */
    public static final C37504c f99152i = new C37504c();

    private C37504c() {
        super(C37512l.f99165c, C37512l.f99166d, C37512l.f99167e, C37512l.f99163a);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public CoroutineDispatcher limitedParallelism(int i) {
        C33648p.m22931a(i);
        if (i >= C37512l.f99165c) {
            return this;
        }
        return super.limitedParallelism(i);
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    @NotNull
    public String toString() {
        return "Dispatchers.Default";
    }
}
