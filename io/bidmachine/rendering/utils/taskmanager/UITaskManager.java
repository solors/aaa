package io.bidmachine.rendering.utils.taskmanager;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class UITaskManager extends SingleThreadTaskManager {

    /* renamed from: a */
    private static final Handler f97974a = new Handler(Looper.getMainLooper());

    @Override // io.bidmachine.rendering.utils.taskmanager.SingleThreadTaskManager
    /* renamed from: a */
    protected Handler mo19013a() {
        return f97974a;
    }

    @Override // io.bidmachine.rendering.utils.taskmanager.SingleThreadTaskManager, io.bidmachine.rendering.utils.taskmanager.BaseTaskManager, io.bidmachine.rendering.utils.taskmanager.TaskManager
    public /* bridge */ /* synthetic */ void schedule(@NonNull Runnable runnable, long j) {
        super.schedule(runnable, j);
    }
}
