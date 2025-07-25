package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.Module;
import com.google.android.datatransport.runtime.dagger.Provides;

@Module
/* loaded from: classes4.dex */
public abstract class TimeModule {
    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @WallTime
    /* renamed from: a */
    public static Clock m76134a() {
        return new WallTimeClock();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Provides
    @Monotonic
    /* renamed from: b */
    public static Clock m76133b() {
        return new UptimeClock();
    }
}
