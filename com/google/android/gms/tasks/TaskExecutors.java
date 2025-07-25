package com.google.android.gms.tasks;

import androidx.annotation.NonNull;
import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-tasks@@18.1.0 */
/* loaded from: classes5.dex */
public final class TaskExecutors {
    @NonNull
    public static final Executor MAIN_THREAD = new zzu();
    static final Executor zza = new zzt();

    private TaskExecutors() {
    }
}
