package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public final class RemovalListeners {
    private RemovalListeners() {
    }

    /* renamed from: a */
    public static /* synthetic */ void m69831a(RemovalListener removalListener, RemovalNotification removalNotification) {
        removalListener.onRemoval(removalNotification);
    }

    public static <K, V> RemovalListener<K, V> asynchronous(final RemovalListener<K, V> removalListener, final Executor executor) {
        Preconditions.checkNotNull(removalListener);
        Preconditions.checkNotNull(executor);
        return new RemovalListener() { // from class: com.google.common.cache.a
            @Override // com.google.common.cache.RemovalListener
            public final void onRemoval(RemovalNotification removalNotification) {
                RemovalListeners.m69830b(executor, removalListener, removalNotification);
            }
        };
    }

    /* renamed from: b */
    public static /* synthetic */ void m69830b(Executor executor, RemovalListener removalListener, RemovalNotification removalNotification) {
        m69828d(executor, removalListener, removalNotification);
    }

    /* renamed from: d */
    public static /* synthetic */ void m69828d(Executor executor, final RemovalListener removalListener, final RemovalNotification removalNotification) {
        executor.execute(new Runnable() { // from class: com.google.common.cache.b
            @Override // java.lang.Runnable
            public final void run() {
                RemovalListeners.m69831a(RemovalListener.this, removalNotification);
            }
        });
    }
}
