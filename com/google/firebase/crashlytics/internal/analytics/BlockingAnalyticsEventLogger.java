package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.crashlytics.internal.Logger;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class BlockingAnalyticsEventLogger implements AnalyticsEventReceiver, AnalyticsEventLogger {

    /* renamed from: a */
    private final CrashlyticsOriginAnalyticsEventLogger f42273a;

    /* renamed from: b */
    private final int f42274b;

    /* renamed from: c */
    private final TimeUnit f42275c;

    /* renamed from: e */
    private CountDownLatch f42277e;

    /* renamed from: d */
    private final Object f42276d = new Object();

    /* renamed from: f */
    private boolean f42278f = false;

    public BlockingAnalyticsEventLogger(@NonNull CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger, int i, TimeUnit timeUnit) {
        this.f42273a = crashlyticsOriginAnalyticsEventLogger;
        this.f42274b = i;
        this.f42275c = timeUnit;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        synchronized (this.f42276d) {
            Logger logger = Logger.getLogger();
            logger.m67210v("Logging event " + str + " to Firebase Analytics with params " + bundle);
            this.f42277e = new CountDownLatch(1);
            this.f42278f = false;
            this.f42273a.logEvent(str, bundle);
            Logger.getLogger().m67210v("Awaiting app exception callback from Analytics...");
            try {
                if (this.f42277e.await(this.f42274b, this.f42275c)) {
                    this.f42278f = true;
                    Logger.getLogger().m67210v("App exception callback received from Analytics listener.");
                } else {
                    Logger.getLogger().m67208w("Timeout exceeded while awaiting app exception callback from Analytics listener.");
                }
            } catch (InterruptedException unused) {
                Logger.getLogger().m67214e("Interrupted while awaiting app exception callback from Analytics listener.");
            }
            this.f42277e = null;
        }
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver
    public void onEvent(@NonNull String str, @NonNull Bundle bundle) {
        CountDownLatch countDownLatch = this.f42277e;
        if (countDownLatch != null && "_ae".equals(str)) {
            countDownLatch.countDown();
        }
    }
}
