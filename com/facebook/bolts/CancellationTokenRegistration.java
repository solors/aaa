package com.facebook.bolts;

import java.io.Closeable;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: CancellationTokenRegistration.kt */
@Metadata
/* loaded from: classes2.dex */
public final class CancellationTokenRegistration implements Closeable {
    @Nullable
    private Runnable action;
    private boolean closed;
    @Nullable
    private CancellationTokenSource tokenSource;

    public CancellationTokenRegistration(@NotNull CancellationTokenSource tokenSource, @Nullable Runnable runnable) {
        Intrinsics.checkNotNullParameter(tokenSource, "tokenSource");
        this.action = runnable;
        this.tokenSource = tokenSource;
    }

    private final void throwIfClosed() {
        if (!this.closed) {
            return;
        }
        throw new IllegalStateException("Object already closed".toString());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        synchronized (this) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            CancellationTokenSource cancellationTokenSource = this.tokenSource;
            if (cancellationTokenSource != null) {
                cancellationTokenSource.unregister$facebook_bolts_release(this);
            }
            this.tokenSource = null;
            this.action = null;
            Unit unit = Unit.f99208a;
        }
    }

    public final void runAction$facebook_bolts_release() {
        synchronized (this) {
            throwIfClosed();
            Runnable runnable = this.action;
            if (runnable != null) {
                runnable.run();
            }
            close();
            Unit unit = Unit.f99208a;
        }
    }
}
