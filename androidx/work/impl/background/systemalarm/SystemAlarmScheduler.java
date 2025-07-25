package androidx.work.impl.background.systemalarm;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.work.Logger;
import androidx.work.impl.Scheduler;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.model.WorkSpecKt;

@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public class SystemAlarmScheduler implements Scheduler {
    private static final String TAG = Logger.tagWithPrefix("SystemAlarmScheduler");
    private final Context mContext;

    public SystemAlarmScheduler(@NonNull Context context) {
        this.mContext = context.getApplicationContext();
    }

    private void scheduleWorkSpec(@NonNull WorkSpec workSpec) {
        Logger logger = Logger.get();
        String str = TAG;
        logger.debug(str, "Scheduling work with workSpecId " + workSpec.f1521id);
        this.mContext.startService(CommandHandler.createScheduleWorkIntent(this.mContext, WorkSpecKt.generationalId(workSpec)));
    }

    @Override // androidx.work.impl.Scheduler
    public void cancel(@NonNull String str) {
        this.mContext.startService(CommandHandler.createStopWorkIntent(this.mContext, str));
    }

    @Override // androidx.work.impl.Scheduler
    public boolean hasLimitedSchedulingSlots() {
        return true;
    }

    @Override // androidx.work.impl.Scheduler
    public void schedule(@NonNull WorkSpec... workSpecArr) {
        for (WorkSpec workSpec : workSpecArr) {
            scheduleWorkSpec(workSpec);
        }
    }
}
