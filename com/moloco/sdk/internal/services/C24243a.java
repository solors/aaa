package com.moloco.sdk.internal.services;

import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.services.analytics.InterfaceC24247a;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.moloco.sdk.internal.services.a */
/* loaded from: classes7.dex */
public final class C24243a implements DefaultLifecycleObserver {
    @NotNull

    /* renamed from: b */
    public final InterfaceC24247a f62784b;
    @NotNull

    /* renamed from: c */
    public final InterfaceC24382o f62785c;
    @Nullable

    /* renamed from: d */
    public Long f62786d;

    /* renamed from: f */
    public boolean f62787f;

    public C24243a(@NotNull InterfaceC24247a analyticsService, @NotNull InterfaceC24382o timeProviderService) {
        Intrinsics.checkNotNullParameter(analyticsService, "analyticsService");
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f62784b = analyticsService;
        this.f62785c = timeProviderService;
    }

    /* renamed from: a */
    public final void m46729a() {
        this.f62787f = true;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStart(owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStart", false, 4, null);
        Long l = this.f62786d;
        if (l != null) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Background event has been recorded, recording foreground", false, 4, null);
            this.f62784b.mo46723a(this.f62785c.invoke(), l.longValue());
            this.f62786d = null;
            this.f62787f = false;
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(@NotNull LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        super.onStop(owner);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Application onStop", false, 4, null);
        if (this.f62787f) {
            MolocoLogger.debug$default(molocoLogger, "SingleObserverBackgroundThenForegroundAnalyticsListener", "Tracking of event is true. Recording background", false, 4, null);
            long invoke = this.f62785c.invoke();
            this.f62786d = Long.valueOf(invoke);
            this.f62784b.mo46724a(invoke);
        }
    }
}
