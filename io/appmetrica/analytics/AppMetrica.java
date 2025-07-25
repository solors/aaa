package io.appmetrica.analytics;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.webkit.WebView;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.impl.AbstractC33831D0;
import io.appmetrica.analytics.impl.AbstractC34738n1;
import io.appmetrica.analytics.impl.C34711m1;
import io.appmetrica.analytics.plugins.AppMetricaPlugins;
import io.appmetrica.analytics.profile.UserProfile;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/* loaded from: classes9.dex */
public final class AppMetrica {
    public static void activate(@NonNull Context context, @NonNull AppMetricaConfig appMetricaConfig) {
        AbstractC34738n1.f94968a.m21393a(context, appMetricaConfig);
    }

    public static void activateReporter(@NonNull Context context, @NonNull ReporterConfig reporterConfig) {
        AbstractC34738n1.f94968a.m21392a(context, reporterConfig);
    }

    public static void clearAppEnvironment() {
        AbstractC34738n1.f94968a.m21397a();
    }

    public static void enableActivityAutoTracking(@NonNull Application application) {
        AbstractC34738n1.f94968a.m21395a(application);
    }

    @Nullable
    public static String getDeviceId(@NonNull Context context) {
        return AbstractC34738n1.f94968a.m21368b();
    }

    public static int getLibraryApiLevel() {
        return 115;
    }

    @NonNull
    public static String getLibraryVersion() {
        return "7.3.0";
    }

    @NonNull
    public static AppMetricaPlugins getPluginExtension() {
        return AbstractC33831D0.f92684a;
    }

    @NonNull
    public static IReporter getReporter(@NonNull Context context, @NonNull String str) {
        return AbstractC34738n1.f94968a.m21390a(context, str);
    }

    @Nullable
    public static String getUuid(@NonNull Context context) {
        return AbstractC34738n1.f94968a.m21394a(context).f95711id;
    }

    @MainThread
    public static void initWebViewReporting(@NonNull WebView webView) {
        AbstractC34738n1.f94968a.m21387a(webView);
    }

    public static void pauseSession(@Nullable Activity activity) {
        AbstractC34738n1.f94968a.m21396a(activity);
    }

    public static void putAppEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC34738n1.f94968a.m21376a(str, str2);
    }

    public static void putErrorEnvironmentValue(@NonNull String str, @Nullable String str2) {
        AbstractC34738n1.f94968a.m21364b(str, str2);
    }

    public static void registerAnrListener(@NonNull AnrListener anrListener) {
        AbstractC34738n1.f94968a.m21385a(anrListener);
    }

    public static void reportAdRevenue(@NonNull AdRevenue adRevenue) {
        AbstractC34738n1.f94968a.m21386a(adRevenue);
    }

    public static void reportAnr(@NonNull Map<Thread, StackTraceElement[]> map) {
        AbstractC34738n1.f94968a.m21371a(map);
    }

    public static void reportAppOpen(@NonNull Activity activity) {
        AbstractC34738n1.f94968a.m21367b(activity);
    }

    public static void reportECommerce(@NonNull ECommerceEvent eCommerceEvent) {
        AbstractC34738n1.f94968a.m21380a(eCommerceEvent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2) {
        AbstractC34738n1.f94968a.m21375a(str, str2, (Throwable) null);
    }

    public static void reportEvent(@NonNull String str) {
        AbstractC34738n1.f94968a.m21365b(str);
    }

    public static void reportExternalAdRevenue(@NonNull Object... objArr) {
        AbstractC34738n1.f94968a.m21362b(objArr);
    }

    public static void reportExternalAttribution(@NonNull ExternalAttribution externalAttribution) {
        AbstractC34738n1.f94968a.m21382a(externalAttribution);
    }

    public static void reportReferralUrl(@NonNull String str) {
        AbstractC34738n1.f94968a.m21356d(str);
    }

    public static void reportRevenue(@NonNull Revenue revenue) {
        AbstractC34738n1.f94968a.m21381a(revenue);
    }

    public static void reportUnhandledException(@NonNull Throwable th) {
        AbstractC34738n1.f94968a.m21372a(th);
    }

    public static void reportUserProfile(@NonNull UserProfile userProfile) {
        AbstractC34738n1.f94968a.m21378a(userProfile);
    }

    public static void requestDeferredDeeplink(@NonNull DeferredDeeplinkListener deferredDeeplinkListener) {
        AbstractC34738n1.f94968a.m21384a(deferredDeeplinkListener);
    }

    public static void requestDeferredDeeplinkParameters(@NonNull DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        AbstractC34738n1.f94968a.m21383a(deferredDeeplinkParametersListener);
    }

    public static void requestStartupParams(@NonNull Context context, @NonNull StartupParamsCallback startupParamsCallback, @NonNull List<String> list) {
        C34711m1 c34711m1 = AbstractC34738n1.f94968a;
        if (list.isEmpty()) {
            list = Arrays.asList(StartupParamsCallback.APPMETRICA_UUID, StartupParamsCallback.APPMETRICA_DEVICE_ID, StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH);
        }
        c34711m1.m21391a(context, startupParamsCallback, list);
    }

    public static void resumeSession(@Nullable Activity activity) {
        AbstractC34738n1.f94968a.m21360c(activity);
    }

    public static void sendEventsBuffer() {
        AbstractC34738n1.f94968a.m21352f();
    }

    public static void setDataSendingEnabled(boolean z) {
        AbstractC34738n1.f94968a.m21370a(z);
    }

    public static void setLocation(@Nullable Location location) {
        AbstractC34738n1.f94968a.m21388a(location);
    }

    public static void setLocationTracking(boolean z) {
        AbstractC34738n1.f94968a.m21363b(z);
    }

    public static void setUserProfileID(@Nullable String str) {
        AbstractC34738n1.f94968a.m21353e(str);
    }

    public static void reportAppOpen(@NonNull Intent intent) {
        AbstractC34738n1.f94968a.m21389a(intent);
    }

    public static void reportError(@NonNull String str, @Nullable String str2, @Nullable Throwable th) {
        AbstractC34738n1.f94968a.m21375a(str, str2, th);
    }

    public static void reportEvent(@NonNull String str, @Nullable String str2) {
        AbstractC34738n1.f94968a.m21358c(str, str2);
    }

    public static void reportAppOpen(@NonNull String str) {
        AbstractC34738n1.f94968a.m21377a(str);
    }

    public static void reportError(@NonNull String str, @Nullable Throwable th) {
        AbstractC34738n1.f94968a.m21374a(str, th);
    }

    public static void reportEvent(@NonNull String str, @Nullable Map<String, Object> map) {
        AbstractC34738n1.f94968a.m21373a(str, map);
    }
}
