package com.yandex.mobile.ads.impl;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class ef1 implements vh1 {
    @NotNull

    /* renamed from: a */
    private final x92 f78534a;
    @NotNull

    /* renamed from: b */
    private final pj1 f78535b;
    @NotNull

    /* renamed from: c */
    private final oj1 f78536c;
    @NotNull

    /* renamed from: d */
    private final gf1 f78537d;

    /* renamed from: e */
    private boolean f78538e;

    public ef1(@NotNull x92 videoProgressMonitoringManager, @NotNull pj1 readyToPrepareProvider, @NotNull oj1 readyToPlayProvider, @NotNull gf1 playlistSchedulerListener) {
        Intrinsics.checkNotNullParameter(videoProgressMonitoringManager, "videoProgressMonitoringManager");
        Intrinsics.checkNotNullParameter(readyToPrepareProvider, "readyToPrepareProvider");
        Intrinsics.checkNotNullParameter(readyToPlayProvider, "readyToPlayProvider");
        Intrinsics.checkNotNullParameter(playlistSchedulerListener, "playlistSchedulerListener");
        this.f78534a = videoProgressMonitoringManager;
        this.f78535b = readyToPrepareProvider;
        this.f78536c = readyToPlayProvider;
        this.f78537d = playlistSchedulerListener;
    }

    @Override // com.yandex.mobile.ads.impl.vh1
    /* renamed from: a */
    public final void mo28308a(long j) {
        C31920yr m30974a = this.f78536c.m30974a(j);
        if (m30974a != null) {
            this.f78537d.mo30195a(m30974a);
            return;
        }
        C31920yr m30625a = this.f78535b.m30625a(j);
        if (m30625a != null) {
            this.f78537d.mo30193b(m30625a);
        }
    }

    /* renamed from: b */
    public final void m34596b() {
        if (this.f78538e) {
            this.f78534a.m27610a((vh1) null);
            this.f78534a.m27608b();
            this.f78538e = false;
        }
    }

    /* renamed from: a */
    public final void m34597a() {
        if (this.f78538e) {
            return;
        }
        this.f78538e = true;
        this.f78534a.m27610a(this);
        this.f78534a.m27611a();
    }
}
