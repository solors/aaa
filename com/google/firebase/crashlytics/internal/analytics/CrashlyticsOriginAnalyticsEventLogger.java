package com.google.firebase.crashlytics.internal.analytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;

/* loaded from: classes4.dex */
public class CrashlyticsOriginAnalyticsEventLogger implements AnalyticsEventLogger {
    @NonNull

    /* renamed from: a */
    private final AnalyticsConnector f42280a;

    public CrashlyticsOriginAnalyticsEventLogger(@NonNull AnalyticsConnector analyticsConnector) {
        this.f42280a = analyticsConnector;
    }

    @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
    public void logEvent(@NonNull String str, @Nullable Bundle bundle) {
        this.f42280a.logEvent("clx", str, bundle);
    }
}
