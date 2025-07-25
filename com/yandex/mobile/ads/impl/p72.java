package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class p72 {
    @NotNull

    /* renamed from: a */
    private final f72<?> f83736a;
    @NotNull

    /* renamed from: b */
    private final m72 f83737b;
    @NotNull

    /* renamed from: c */
    private final Handler f83738c;

    /* renamed from: d */
    private boolean f83739d;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.p72$a */
    /* loaded from: classes8.dex */
    public final class RunnableC31095a implements Runnable {
        public RunnableC31095a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            long adPosition = p72.this.f83736a.getAdPosition();
            p72.this.f83737b.mo26256a(p72.this.f83736a.mo33529b(), adPosition);
            if (p72.this.f83739d) {
                p72.this.f83738c.postDelayed(this, 200L);
            }
        }
    }

    public /* synthetic */ p72(f72 f72Var, m72 m72Var) {
        this(f72Var, m72Var, new Handler(Looper.getMainLooper()));
    }

    /* renamed from: a */
    public final void m30821a() {
        if (this.f83739d) {
            return;
        }
        this.f83739d = true;
        this.f83737b.mo31650a();
        this.f83738c.post(new RunnableC31095a());
    }

    /* renamed from: b */
    public final void m30819b() {
        if (this.f83739d) {
            this.f83737b.mo31649b();
            this.f83738c.removeCallbacksAndMessages(null);
            this.f83739d = false;
        }
    }

    public p72(@NotNull f72<?> videoAdPlayer, @NotNull m72 videoAdProgressEventsObservable, @NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(videoAdPlayer, "videoAdPlayer");
        Intrinsics.checkNotNullParameter(videoAdProgressEventsObservable, "videoAdProgressEventsObservable");
        Intrinsics.checkNotNullParameter(handler, "handler");
        this.f83736a = videoAdPlayer;
        this.f83737b = videoAdProgressEventsObservable;
        this.f83738c = handler;
    }
}
