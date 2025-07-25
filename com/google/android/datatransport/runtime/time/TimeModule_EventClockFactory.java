package com.google.android.datatransport.runtime.time;

import com.google.android.datatransport.runtime.dagger.internal.Factory;
import com.google.android.datatransport.runtime.dagger.internal.Preconditions;

/* loaded from: classes4.dex */
public final class TimeModule_EventClockFactory implements Factory<Clock> {

    /* loaded from: classes4.dex */
    private static final class InstanceHolder {

        /* renamed from: a */
        private static final TimeModule_EventClockFactory f31324a = new TimeModule_EventClockFactory();

        private InstanceHolder() {
        }
    }

    public static TimeModule_EventClockFactory create() {
        return InstanceHolder.f31324a;
    }

    public static Clock eventClock() {
        return (Clock) Preconditions.checkNotNull(TimeModule.m76134a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // com.google.android.datatransport.runtime.dagger.internal.Factory, md.Provider
    public Clock get() {
        return eventClock();
    }
}
