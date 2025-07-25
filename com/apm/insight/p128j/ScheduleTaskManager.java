package com.apm.insight.p128j;

import android.content.Context;
import android.os.Handler;
import com.apm.insight.AppDataCenter;
import com.apm.insight.p130l.App;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.apm.insight.j.d */
/* loaded from: classes2.dex */
public final class ScheduleTaskManager {

    /* renamed from: a */
    private List<BaseTask> f3825a = new ArrayList(3);

    private ScheduleTaskManager(Handler handler, Context context) {
        if (App.m101755c(context)) {
            this.f3825a.add(new DeviceIdTask(handler));
        }
    }

    /* renamed from: a */
    public static ScheduleTaskManager m101855a(Handler handler, Context context) {
        return new ScheduleTaskManager(handler, context);
    }

    /* renamed from: a */
    public final void m101856a() {
        AppDataCenter.m102179a((Object) ("[ScheduleTaskManager] execute, task size=" + this.f3825a.size()));
        for (BaseTask baseTask : this.f3825a) {
            try {
                baseTask.m101860a();
            } catch (Throwable unused) {
            }
        }
    }
}
