package com.google.android.play.core.review.internal;

import androidx.annotation.Nullable;
import com.google.android.gms.tasks.TaskCompletionSource;

/* compiled from: com.google.android.play:review@@2.0.0 */
/* loaded from: classes5.dex */
public abstract class zzj implements Runnable {
    @Nullable

    /* renamed from: b */
    private final TaskCompletionSource f39233b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zzj() {
        this.f39233b = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: a */
    public final TaskCompletionSource m70137a() {
        return this.f39233b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            zza();
        } catch (Exception e) {
            zzc(e);
        }
    }

    protected abstract void zza();

    public final void zzc(Exception exc) {
        TaskCompletionSource taskCompletionSource = this.f39233b;
        if (taskCompletionSource != null) {
            taskCompletionSource.trySetException(exc);
        }
    }

    public zzj(@Nullable TaskCompletionSource taskCompletionSource) {
        this.f39233b = taskCompletionSource;
    }
}
