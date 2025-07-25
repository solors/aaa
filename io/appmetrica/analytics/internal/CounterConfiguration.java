package io.appmetrica.analytics.internal;

import android.content.ContentValues;
import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.ReporterConfig;
import io.appmetrica.analytics.coreutils.internal.LocationUtils;
import io.appmetrica.analytics.impl.AbstractC34679kn;

/* loaded from: classes9.dex */
public class CounterConfiguration implements Parcelable {
    public static final Parcelable.Creator<CounterConfiguration> CREATOR = new C35078b();

    /* renamed from: a */
    private final ContentValues f95708a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ CounterConfiguration(ContentValues contentValues, int i) {
        this(contentValues);
    }

    /* renamed from: a */
    private void m20698a(String str) {
        if (AbstractC34679kn.m21472a(str)) {
            setApiKey(str);
        }
    }

    /* renamed from: b */
    private void m20695b(String str) {
        if ("20799a27-fa80-4b36-b2db-0f8141f24180".equals(str)) {
            setReporterType(CounterConfigurationReporterType.SELF_SDK);
        } else {
            setReporterType(CounterConfigurationReporterType.MANUAL);
        }
    }

    /* renamed from: c */
    private void m20694c(Integer num) {
        if (AbstractC34679kn.m21472a(num)) {
            this.f95708a.put("MAX_REPORTS_IN_DB_COUNT", num);
        }
    }

    /* renamed from: d */
    private void m20693d(Integer num) {
        if (AbstractC34679kn.m21472a(num)) {
            setSessionTimeout(num.intValue());
        }
    }

    public static CounterConfiguration fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        try {
            return (CounterConfiguration) bundle.getParcelable("COUNTER_CFG_OBJ");
        } catch (Throwable unused) {
            return null;
        }
    }

    public synchronized void applyFromConfig(@NonNull AppMetricaConfig appMetricaConfig) {
        m20698a(appMetricaConfig.apiKey);
        m20693d(appMetricaConfig.sessionTimeout);
        if (AbstractC34679kn.m21472a(appMetricaConfig.location)) {
            setManualLocation(appMetricaConfig.location);
        }
        if (AbstractC34679kn.m21472a(appMetricaConfig.locationTracking)) {
            setLocationTracking(appMetricaConfig.locationTracking.booleanValue());
        }
        if (AbstractC34679kn.m21472a(appMetricaConfig.deviceType)) {
            setDeviceType(appMetricaConfig.deviceType);
        }
        m20699a(appMetricaConfig.dispatchPeriodSeconds);
        m20696b(appMetricaConfig.maxReportsCount);
        m20697b(appMetricaConfig.logs);
        if (!TextUtils.isEmpty(appMetricaConfig.appVersion)) {
            setCustomAppVersion(appMetricaConfig.appVersion);
        }
        if (AbstractC34679kn.m21472a(appMetricaConfig.appBuildNumber)) {
            setAppBuildNumber(appMetricaConfig.appBuildNumber.intValue());
        }
        if (AbstractC34679kn.m21472a(appMetricaConfig.firstActivationAsUpdate)) {
            setFirstActivationAsUpdate(appMetricaConfig.firstActivationAsUpdate.booleanValue());
        }
        m20700a(appMetricaConfig.dataSendingEnabled);
        m20694c(appMetricaConfig.maxReportsInDatabaseCount);
        Boolean bool = appMetricaConfig.nativeCrashReporting;
        if (AbstractC34679kn.m21472a(bool)) {
            this.f95708a.put("CFG_NATIVE_CRASHES_ENABLED", bool);
        }
        if (AbstractC34679kn.m21472a(appMetricaConfig.revenueAutoTrackingEnabled)) {
            setRevenueAutoTrackingEnabled(appMetricaConfig.revenueAutoTrackingEnabled.booleanValue());
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getApiKey() {
        return this.f95708a.getAsString("CFG_API_KEY");
    }

    public String getAppBuildNumber() {
        return this.f95708a.getAsString("CFG_APP_VERSION_CODE");
    }

    public String getAppVersion() {
        return this.f95708a.getAsString("CFG_APP_VERSION");
    }

    public Boolean getDataSendingEnabled() {
        return this.f95708a.getAsBoolean("CFG_DATA_SENDING_ENABLED");
    }

    @Nullable
    public String getDeviceType() {
        return this.f95708a.getAsString("CFG_DEVICE_SIZE_TYPE");
    }

    @Nullable
    public Integer getDispatchPeriod() {
        return this.f95708a.getAsInteger("CFG_DISPATCH_PERIOD");
    }

    public Location getManualLocation() {
        if (this.f95708a.containsKey("CFG_MANUAL_LOCATION")) {
            return LocationUtils.bytesToLocation(this.f95708a.getAsByteArray("CFG_MANUAL_LOCATION"));
        }
        return null;
    }

    @Nullable
    public Integer getMaxReportsCount() {
        return this.f95708a.getAsInteger("CFG_MAX_REPORTS_COUNT");
    }

    @Nullable
    public Integer getMaxReportsInDbCount() {
        return this.f95708a.getAsInteger("MAX_REPORTS_IN_DB_COUNT");
    }

    @Nullable
    public Boolean getReportNativeCrashesEnabled() {
        return this.f95708a.getAsBoolean("CFG_NATIVE_CRASHES_ENABLED");
    }

    @NonNull
    public CounterConfigurationReporterType getReporterType() {
        return CounterConfigurationReporterType.fromStringValue(this.f95708a.getAsString("CFG_REPORTER_TYPE"));
    }

    @Nullable
    public Integer getSessionTimeout() {
        return this.f95708a.getAsInteger("CFG_SESSION_TIMEOUT");
    }

    public String getUuid() {
        return this.f95708a.getAsString("CFG_UUID");
    }

    @Nullable
    public Boolean isFirstActivationAsUpdate() {
        return this.f95708a.getAsBoolean("CFG_IS_FIRST_ACTIVATION_AS_UPDATE");
    }

    @Nullable
    public Boolean isLocationTrackingEnabled() {
        return this.f95708a.getAsBoolean("CFG_LOCATION_TRACKING");
    }

    @Nullable
    public Boolean isLogEnabled() {
        return this.f95708a.getAsBoolean("CFG_IS_LOG_ENABLED");
    }

    @Nullable
    public synchronized Boolean isRevenueAutoTrackingEnabled() {
        return this.f95708a.getAsBoolean("CFG_REVENUE_AUTO_TRACKING_ENABLED");
    }

    @VisibleForTesting
    public synchronized void setApiKey(String str) {
        this.f95708a.put("CFG_API_KEY", str);
    }

    public synchronized void setAppBuildNumber(int i) {
        this.f95708a.put("CFG_APP_VERSION_CODE", String.valueOf(i));
    }

    public final synchronized void setCustomAppVersion(String str) {
        this.f95708a.put("CFG_APP_VERSION", str);
    }

    public final synchronized void setDataSendingEnabled(boolean z) {
        this.f95708a.put("CFG_DATA_SENDING_ENABLED", Boolean.valueOf(z));
    }

    public final synchronized void setDeviceType(@Nullable String str) {
        ContentValues contentValues = this.f95708a;
        if (TextUtils.isEmpty(str)) {
            str = null;
        }
        contentValues.put("CFG_DEVICE_SIZE_TYPE", str);
    }

    @VisibleForTesting
    public synchronized void setDispatchPeriod(int i) {
        this.f95708a.put("CFG_DISPATCH_PERIOD", Integer.valueOf(i));
    }

    public final synchronized void setFirstActivationAsUpdate(boolean z) {
        this.f95708a.put("CFG_IS_FIRST_ACTIVATION_AS_UPDATE", Boolean.valueOf(z));
    }

    public synchronized void setLocationTracking(boolean z) {
        this.f95708a.put("CFG_LOCATION_TRACKING", Boolean.valueOf(z));
    }

    public synchronized void setLogEnabled(boolean z) {
        this.f95708a.put("CFG_IS_LOG_ENABLED", Boolean.valueOf(z));
    }

    public final synchronized void setManualLocation(@Nullable Location location) {
        this.f95708a.put("CFG_MANUAL_LOCATION", LocationUtils.locationToBytes(location));
    }

    @VisibleForTesting
    public synchronized void setMaxReportsCount(int i) {
        ContentValues contentValues = this.f95708a;
        if (i <= 0) {
            i = Integer.MAX_VALUE;
        }
        contentValues.put("CFG_MAX_REPORTS_COUNT", Integer.valueOf(i));
    }

    @VisibleForTesting
    public void setMaxReportsInDbCount(int i) {
        this.f95708a.put("MAX_REPORTS_IN_DB_COUNT", Integer.valueOf(i));
    }

    public synchronized void setReporterType(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this.f95708a.put("CFG_REPORTER_TYPE", counterConfigurationReporterType.getStringValue());
    }

    public synchronized void setRevenueAutoTrackingEnabled(boolean z) {
        this.f95708a.put("CFG_REVENUE_AUTO_TRACKING_ENABLED", Boolean.valueOf(z));
    }

    @VisibleForTesting
    public synchronized void setSessionTimeout(int i) {
        this.f95708a.put("CFG_SESSION_TIMEOUT", Integer.valueOf(i));
    }

    public synchronized void setUuid(String str) {
        this.f95708a.put("CFG_UUID", str);
    }

    public synchronized void toBundle(Bundle bundle) {
        bundle.putParcelable("COUNTER_CFG_OBJ", this);
    }

    public synchronized String toString() {
        return "CounterConfiguration{mParamsMapping=" + this.f95708a + '}';
    }

    @Override // android.os.Parcelable
    public synchronized void writeToParcel(Parcel parcel, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("io.appmetrica.analytics.internal.CounterConfiguration.data", this.f95708a);
        parcel.writeBundle(bundle);
    }

    public CounterConfiguration(@NonNull CounterConfiguration counterConfiguration) {
        synchronized (counterConfiguration) {
            this.f95708a = new ContentValues(counterConfiguration.f95708a);
        }
    }

    /* renamed from: a */
    private void m20699a(Integer num) {
        if (AbstractC34679kn.m21472a(num)) {
            setDispatchPeriod(num.intValue());
        }
    }

    /* renamed from: b */
    private void m20696b(Integer num) {
        if (AbstractC34679kn.m21472a(num)) {
            setMaxReportsCount(num.intValue());
        }
    }

    /* renamed from: a */
    private void m20700a(Boolean bool) {
        if (AbstractC34679kn.m21472a(bool)) {
            setDataSendingEnabled(bool.booleanValue());
        }
    }

    /* renamed from: b */
    private void m20697b(Boolean bool) {
        if (AbstractC34679kn.m21472a(bool)) {
            setLogEnabled(bool.booleanValue());
        }
    }

    public CounterConfiguration() {
        this.f95708a = new ContentValues();
    }

    public CounterConfiguration(@NonNull String str) {
        this();
        synchronized (this) {
            setApiKey(str);
        }
    }

    public CounterConfiguration(@NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(AppMetricaConfig appMetricaConfig, @NonNull CounterConfigurationReporterType counterConfigurationReporterType) {
        this();
        synchronized (this) {
            applyFromConfig(appMetricaConfig);
            setReporterType(counterConfigurationReporterType);
        }
    }

    public CounterConfiguration(@NonNull ReporterConfig reporterConfig) {
        this();
        synchronized (this) {
            m20698a(reporterConfig.apiKey);
            m20693d(reporterConfig.sessionTimeout);
            m20699a(reporterConfig.dispatchPeriodSeconds);
            m20696b(reporterConfig.maxReportsCount);
            m20697b(reporterConfig.logs);
            m20700a(reporterConfig.dataSendingEnabled);
            m20694c(reporterConfig.maxReportsInDatabaseCount);
            m20695b(reporterConfig.apiKey);
        }
    }

    private CounterConfiguration(ContentValues contentValues) {
        this.f95708a = contentValues;
    }
}
