package com.google.firebase.sessions;

import android.os.SystemClock;
import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.time.C37700c;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;

/* compiled from: TimeProvider.kt */
@Metadata
/* loaded from: classes4.dex */
public final class WallClock implements TimeProvider {
    @NotNull
    public static final WallClock INSTANCE = new WallClock();

    private WallClock() {
    }

    @Override // com.google.firebase.sessions.TimeProvider
    public long currentTimeUs() {
        return System.currentTimeMillis() * 1000;
    }

    @Override // com.google.firebase.sessions.TimeProvider
    /* renamed from: elapsedRealtime-UwyO8pc */
    public long mo110200elapsedRealtimeUwyO8pc() {
        Duration.C37699a c37699a = Duration.f99494c;
        return C37700c.m16451t(SystemClock.elapsedRealtime(), DurationUnitJvm.f90129f);
    }
}
