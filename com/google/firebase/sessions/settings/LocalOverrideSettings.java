package com.google.firebase.sessions.settings;

import android.content.Context;
import android.os.Bundle;
import com.google.firebase.sessions.settings.SettingsProvider;
import ee.DurationUnitJvm;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.C37700c;
import kotlin.time.Duration;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LocalOverrideSettings.kt */
@Metadata
/* loaded from: classes4.dex */
public final class LocalOverrideSettings implements SettingsProvider {
    @Deprecated
    @NotNull
    public static final String SAMPLING_RATE = "firebase_sessions_sampling_rate";
    @Deprecated
    @NotNull
    public static final String SESSIONS_ENABLED = "firebase_sessions_enabled";
    @Deprecated
    @NotNull
    public static final String SESSION_RESTART_TIMEOUT = "firebase_sessions_sessions_restart_timeout";
    @NotNull

    /* renamed from: b */
    private static final Companion f43818b = new Companion(null);

    /* renamed from: a */
    private final Bundle f43819a;

    /* compiled from: LocalOverrideSettings.kt */
    @Metadata
    /* loaded from: classes4.dex */
    private static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public LocalOverrideSettings(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
        this.f43819a = bundle == null ? Bundle.EMPTY : bundle;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Double getSamplingRate() {
        if (this.f43819a.containsKey(SAMPLING_RATE)) {
            return Double.valueOf(this.f43819a.getDouble(SAMPLING_RATE));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Boolean getSessionEnabled() {
        if (this.f43819a.containsKey(SESSIONS_ENABLED)) {
            return Boolean.valueOf(this.f43819a.getBoolean(SESSIONS_ENABLED));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    /* renamed from: getSessionRestartTimeout-FghU774  reason: not valid java name */
    public Duration mo110201getSessionRestartTimeoutFghU774() {
        if (this.f43819a.containsKey(SESSION_RESTART_TIMEOUT)) {
            return Duration.m16494g(C37700c.m16452s(this.f43819a.getInt(SESSION_RESTART_TIMEOUT), DurationUnitJvm.f90130g));
        }
        return null;
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    public boolean isSettingsStale() {
        return SettingsProvider.DefaultImpls.isSettingsStale(this);
    }

    @Override // com.google.firebase.sessions.settings.SettingsProvider
    @Nullable
    public Object updateSettings(@NotNull Continuation<? super Unit> continuation) {
        return SettingsProvider.DefaultImpls.updateSettings(this, continuation);
    }
}
