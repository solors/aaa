package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
final class zzu implements Executor {
    private final Handler zza = new com.google.android.gms.internal.tasks.zza(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(@NonNull Runnable runnable) {
        this.zza.post(runnable);
    }
}
