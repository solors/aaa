package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventReceiver;
import java.util.Locale;

/* loaded from: classes4.dex */
class CrashlyticsAnalyticsListener implements AnalyticsConnector.AnalyticsConnectorListener {

    /* renamed from: a */
    private AnalyticsEventReceiver f42247a;

    /* renamed from: b */
    private AnalyticsEventReceiver f42248b;

    /* renamed from: a */
    private static void m67232a(@Nullable AnalyticsEventReceiver analyticsEventReceiver, @NonNull String str, @NonNull Bundle bundle) {
        if (analyticsEventReceiver == null) {
            return;
        }
        analyticsEventReceiver.onEvent(str, bundle);
    }

    /* renamed from: b */
    private void m67231b(@NonNull String str, @NonNull Bundle bundle) {
        AnalyticsEventReceiver analyticsEventReceiver;
        if ("clx".equals(bundle.getString("_o"))) {
            analyticsEventReceiver = this.f42247a;
        } else {
            analyticsEventReceiver = this.f42248b;
        }
        m67232a(analyticsEventReceiver, str, bundle);
    }

    @Override // com.google.firebase.analytics.connector.AnalyticsConnector.AnalyticsConnectorListener
    public void onMessageTriggered(int i, @Nullable Bundle bundle) {
        String string;
        Logger.getLogger().m67210v(String.format(Locale.US, "Analytics listener received message. ID: %d, Extras: %s", Integer.valueOf(i), bundle));
        if (bundle != null && (string = bundle.getString("name")) != null) {
            Bundle bundle2 = bundle.getBundle("params");
            if (bundle2 == null) {
                bundle2 = new Bundle();
            }
            m67231b(string, bundle2);
        }
    }

    public void setBreadcrumbEventReceiver(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.f42248b = analyticsEventReceiver;
    }

    public void setCrashlyticsOriginEventReceiver(@Nullable AnalyticsEventReceiver analyticsEventReceiver) {
        this.f42247a = analyticsEventReceiver;
    }
}
