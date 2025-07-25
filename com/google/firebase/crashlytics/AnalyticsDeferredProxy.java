package com.google.firebase.crashlytics;

import android.os.Bundle;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import com.google.firebase.analytics.connector.AnalyticsConnector;
import com.google.firebase.annotations.DeferredApi;
import com.google.firebase.crashlytics.internal.Logger;
import com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BlockingAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.BreadcrumbAnalyticsEventReceiver;
import com.google.firebase.crashlytics.internal.analytics.CrashlyticsOriginAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.analytics.UnavailableAnalyticsEventLogger;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbHandler;
import com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource;
import com.google.firebase.crashlytics.internal.breadcrumbs.DisabledBreadcrumbSource;
import com.google.firebase.inject.Deferred;
import com.google.firebase.inject.Provider;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class AnalyticsDeferredProxy {

    /* renamed from: a */
    private final Deferred<AnalyticsConnector> f42243a;

    /* renamed from: b */
    private volatile AnalyticsEventLogger f42244b;

    /* renamed from: c */
    private volatile BreadcrumbSource f42245c;
    @GuardedBy("this")

    /* renamed from: d */
    private final List<BreadcrumbHandler> f42246d;

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred) {
        this(deferred, new DisabledBreadcrumbSource(), new UnavailableAnalyticsEventLogger());
    }

    /* renamed from: d */
    private void m67237d() {
        this.f42243a.whenAvailable(new Deferred.DeferredHandler() { // from class: com.google.firebase.crashlytics.c
            {
                AnalyticsDeferredProxy.this = this;
            }

            @Override // com.google.firebase.inject.Deferred.DeferredHandler
            public final void handle(Provider provider) {
                AnalyticsDeferredProxy.this.m67234g(provider);
            }
        });
    }

    /* renamed from: e */
    public /* synthetic */ void m67236e(String str, Bundle bundle) {
        this.f42244b.logEvent(str, bundle);
    }

    /* renamed from: f */
    public /* synthetic */ void m67235f(BreadcrumbHandler breadcrumbHandler) {
        synchronized (this) {
            if (this.f42245c instanceof DisabledBreadcrumbSource) {
                this.f42246d.add(breadcrumbHandler);
            }
            this.f42245c.registerBreadcrumbHandler(breadcrumbHandler);
        }
    }

    /* renamed from: g */
    public /* synthetic */ void m67234g(Provider provider) {
        Logger.getLogger().m67216d("AnalyticsConnector now available.");
        AnalyticsConnector analyticsConnector = (AnalyticsConnector) provider.get();
        CrashlyticsOriginAnalyticsEventLogger crashlyticsOriginAnalyticsEventLogger = new CrashlyticsOriginAnalyticsEventLogger(analyticsConnector);
        CrashlyticsAnalyticsListener crashlyticsAnalyticsListener = new CrashlyticsAnalyticsListener();
        if (m67233h(analyticsConnector, crashlyticsAnalyticsListener) != null) {
            Logger.getLogger().m67216d("Registered Firebase Analytics listener.");
            BreadcrumbAnalyticsEventReceiver breadcrumbAnalyticsEventReceiver = new BreadcrumbAnalyticsEventReceiver();
            BlockingAnalyticsEventLogger blockingAnalyticsEventLogger = new BlockingAnalyticsEventLogger(crashlyticsOriginAnalyticsEventLogger, 500, TimeUnit.MILLISECONDS);
            synchronized (this) {
                for (BreadcrumbHandler breadcrumbHandler : this.f42246d) {
                    breadcrumbAnalyticsEventReceiver.registerBreadcrumbHandler(breadcrumbHandler);
                }
                crashlyticsAnalyticsListener.setBreadcrumbEventReceiver(breadcrumbAnalyticsEventReceiver);
                crashlyticsAnalyticsListener.setCrashlyticsOriginEventReceiver(blockingAnalyticsEventLogger);
                this.f42245c = breadcrumbAnalyticsEventReceiver;
                this.f42244b = blockingAnalyticsEventLogger;
            }
            return;
        }
        Logger.getLogger().m67208w("Could not register Firebase Analytics listener; a listener is already registered.");
    }

    @DeferredApi
    /* renamed from: h */
    private static AnalyticsConnector.AnalyticsConnectorHandle m67233h(@NonNull AnalyticsConnector analyticsConnector, @NonNull CrashlyticsAnalyticsListener crashlyticsAnalyticsListener) {
        AnalyticsConnector.AnalyticsConnectorHandle registerAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("clx", crashlyticsAnalyticsListener);
        if (registerAnalyticsConnectorListener == null) {
            Logger.getLogger().m67216d("Could not register AnalyticsConnectorListener with Crashlytics origin.");
            registerAnalyticsConnectorListener = analyticsConnector.registerAnalyticsConnectorListener("crash", crashlyticsAnalyticsListener);
            if (registerAnalyticsConnectorListener != null) {
                Logger.getLogger().m67208w("A new version of the Google Analytics for Firebase SDK is now available. For improved performance and compatibility with Crashlytics, please update to the latest version.");
            }
        }
        return registerAnalyticsConnectorListener;
    }

    public AnalyticsEventLogger getAnalyticsEventLogger() {
        return new AnalyticsEventLogger() { // from class: com.google.firebase.crashlytics.b
            {
                AnalyticsDeferredProxy.this = this;
            }

            @Override // com.google.firebase.crashlytics.internal.analytics.AnalyticsEventLogger
            public final void logEvent(String str, Bundle bundle) {
                AnalyticsDeferredProxy.this.m67236e(str, bundle);
            }
        };
    }

    public BreadcrumbSource getDeferredBreadcrumbSource() {
        return new BreadcrumbSource() { // from class: com.google.firebase.crashlytics.a
            {
                AnalyticsDeferredProxy.this = this;
            }

            @Override // com.google.firebase.crashlytics.internal.breadcrumbs.BreadcrumbSource
            public final void registerBreadcrumbHandler(BreadcrumbHandler breadcrumbHandler) {
                AnalyticsDeferredProxy.this.m67235f(breadcrumbHandler);
            }
        };
    }

    public AnalyticsDeferredProxy(Deferred<AnalyticsConnector> deferred, @NonNull BreadcrumbSource breadcrumbSource, @NonNull AnalyticsEventLogger analyticsEventLogger) {
        this.f42243a = deferred;
        this.f42245c = breadcrumbSource;
        this.f42246d = new ArrayList();
        this.f42244b = analyticsEventLogger;
        m67237d();
    }
}
