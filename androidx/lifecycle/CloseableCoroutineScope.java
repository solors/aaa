package androidx.lifecycle;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.C37733h2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;

/* compiled from: ViewModel.kt */
@Metadata
/* loaded from: classes.dex */
public final class CloseableCoroutineScope implements Closeable, CoroutineScope {
    @NotNull
    private final CoroutineContext coroutineContext;

    public CloseableCoroutineScope(@NotNull CoroutineContext coroutineContext) {
        this.coroutineContext = coroutineContext;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C37733h2.m16336e(getCoroutineContext(), null, 1, null);
    }

    @Override // kotlinx.coroutines.CoroutineScope
    @NotNull
    public CoroutineContext getCoroutineContext() {
        return this.coroutineContext;
    }
}
