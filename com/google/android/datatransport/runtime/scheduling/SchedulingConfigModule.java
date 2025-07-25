package com.google.android.datatransport.runtime.scheduling;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.SchedulerConfig;
import com.google.android.datatransport.runtime.time.Clock;
import com.google.android.datatransport.runtime.time.WallTime;

@Module
/* loaded from: classes4.dex */
public abstract class SchedulingConfigModule {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    /* renamed from: a */
    public static SchedulerConfig m76280a(@WallTime Clock clock) {
        return SchedulerConfig.getDefault(clock);
    }
}
