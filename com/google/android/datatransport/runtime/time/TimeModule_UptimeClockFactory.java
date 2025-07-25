package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes4.dex */
public final class TimeModule_UptimeClockFactory implements Factory<Clock> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {

        /* renamed from: a */
        private static final TimeModule_UptimeClockFactory f31325a = new TimeModule_UptimeClockFactory();

        private InstanceHolder() {
        }
    }

    public static TimeModule_UptimeClockFactory create() {
        return InstanceHolder.f31325a;
    }

    public static Clock uptimeClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.m76133b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public Clock get() {
        return uptimeClock();
    }
}
