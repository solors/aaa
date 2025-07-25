package androidx.compose.runtime;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ActualJvm.jvm.kt */
@Metadata
/* loaded from: classes.dex */
public final class AtomicInt {
    @NotNull
    private final AtomicInteger delegate;

    public AtomicInt(int i) {
        this.delegate = new AtomicInteger(i);
    }

    public final int add(int i) {
        return this.delegate.addAndGet(i);
    }

    public final int get() {
        return this.delegate.get();
    }

    @NotNull
    public final AtomicInteger getDelegate() {
        return this.delegate;
    }

    public final void set(int i) {
        this.delegate.set(i);
    }
}
