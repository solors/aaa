package com.yandex.div.core;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import qa.HistogramReporter;

@Metadata
/* renamed from: com.yandex.div.core.k */
/* loaded from: classes8.dex */
public final class DivCreationTracker {
    @NotNull

    /* renamed from: f */
    public static final C29608a f75339f = new C29608a(null);
    @NotNull

    /* renamed from: g */
    private static final AtomicBoolean f75340g = new AtomicBoolean(true);
    @NotNull

    /* renamed from: h */
    private static final AtomicBoolean f75341h = new AtomicBoolean(true);

    /* renamed from: a */
    private final long f75342a;

    /* renamed from: b */
    private long f75343b = -1;
    @NotNull

    /* renamed from: c */
    private final AtomicBoolean f75344c = new AtomicBoolean(false);
    @NotNull

    /* renamed from: d */
    private final String f75345d;
    @NotNull

    /* renamed from: e */
    private final AtomicBoolean f75346e;

    /* compiled from: DivCreationTracker.kt */
    @Metadata
    /* renamed from: com.yandex.div.core.k$a */
    /* loaded from: classes8.dex */
    public static final class C29608a {
        private C29608a() {
        }

        public /* synthetic */ C29608a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final long m37199a() {
            return SystemClock.uptimeMillis();
        }
    }

    public DivCreationTracker(long j) {
        String str;
        this.f75342a = j;
        if (f75340g.compareAndSet(true, false)) {
            str = "Cold";
        } else {
            str = "Cool";
        }
        this.f75345d = str;
        this.f75346e = new AtomicBoolean(true);
    }

    /* renamed from: c */
    private final void m37201c(HistogramReporter histogramReporter) {
        long j = this.f75343b;
        if (j < 0) {
            return;
        }
        HistogramReporter.m12806b(histogramReporter, "Div.Context.Create", j - this.f75342a, null, this.f75345d, null, 20, null);
        this.f75343b = -1L;
    }

    @NotNull
    /* renamed from: a */
    public final String m37203a() {
        if (this.f75346e.compareAndSet(true, false)) {
            if (f75341h.compareAndSet(true, false)) {
                return "Cold";
            }
            return "Cool";
        }
        return "Warm";
    }

    /* renamed from: b */
    public final void m37202b() {
        if (this.f75343b >= 0) {
            return;
        }
        this.f75343b = f75339f.m37199a();
    }

    /* renamed from: d */
    public final void m37200d(long j, long j2, @NotNull HistogramReporter histogramReporter, @NotNull String viewCreateCallType) {
        Intrinsics.checkNotNullParameter(histogramReporter, "histogramReporter");
        Intrinsics.checkNotNullParameter(viewCreateCallType, "viewCreateCallType");
        if (j2 < 0) {
            return;
        }
        HistogramReporter.m12806b(histogramReporter, "Div.View.Create", j2 - j, null, viewCreateCallType, null, 20, null);
        if (this.f75344c.compareAndSet(false, true)) {
            m37201c(histogramReporter);
        }
    }
}
