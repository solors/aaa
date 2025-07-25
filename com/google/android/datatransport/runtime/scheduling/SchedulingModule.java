package com.google.android.datatransport.runtime.scheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoScheduler;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.WorkScheduler;
import com.google.android.datatransport.runtime.scheduling.persistence.EventStore;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.Monotonic;

@Module
/* loaded from: classes4.dex */
public abstract class SchedulingModule {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    /* renamed from: a */
    public static WorkScheduler m76279a(Context context, EventStore eventStore, SchedulerConfig schedulerConfig, @Monotonic Clock clock) {
        return new JobInfoScheduler(context, eventStore, schedulerConfig);
    }
}
