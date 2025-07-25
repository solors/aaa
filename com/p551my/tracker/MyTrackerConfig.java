package com.p551my.tracker;

import android.content.pm.PackageInfo;
import com.p551my.tracker.config.AntiFraudConfig;
import com.p551my.tracker.obfuscated.C26290a1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import p1077ze.OkHttpClient;

/* renamed from: com.my.tracker.MyTrackerConfig */
/* loaded from: classes7.dex */
public final class MyTrackerConfig {
    private final C26290a1 trackerConfig;

    /* renamed from: com.my.tracker.MyTrackerConfig$InstalledPackagesProvider */
    /* loaded from: classes7.dex */
    public interface InstalledPackagesProvider {
        List<PackageInfo> getInstalledPackages();
    }

    /* renamed from: com.my.tracker.MyTrackerConfig$OkHttpClientProvider */
    /* loaded from: classes7.dex */
    public interface OkHttpClientProvider {
        OkHttpClient getOkHttpClient();
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.my.tracker.MyTrackerConfig$Region */
    /* loaded from: classes7.dex */
    public @interface Region {

        /* renamed from: EU */
        public static final int f68438EU = 1;

        /* renamed from: RU */
        public static final int f68439RU = 0;
    }

    private MyTrackerConfig(C26290a1 c26290a1) {
        this.trackerConfig = c26290a1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MyTrackerConfig newConfig(C26290a1 c26290a1) {
        return new MyTrackerConfig(c26290a1);
    }

    public AntiFraudConfig getAntiFraudConfig() {
        return this.trackerConfig.m42200a();
    }

    public String getApkPreinstallParams() {
        return this.trackerConfig.m42190b();
    }

    public int getBufferingPeriod() {
        return this.trackerConfig.m42178e();
    }

    public int getForcingPeriod() {
        return this.trackerConfig.m42176f();
    }

    public String getId() {
        return this.trackerConfig.m42174g();
    }

    public int getLaunchTimeout() {
        return this.trackerConfig.m42172i();
    }

    @Deprecated
    public String getVendorAppPackage() {
        return this.trackerConfig.m42168m();
    }

    public boolean isAutotrackingPurchaseEnabled() {
        return this.trackerConfig.m42167n();
    }

    public boolean isTrackingEnvironmentEnabled() {
        return this.trackerConfig.m42166o();
    }

    public boolean isTrackingLaunchEnabled() {
        return this.trackerConfig.m42165p();
    }

    public boolean isTrackingLocationEnabled() {
        return this.trackerConfig.m42164q();
    }

    public boolean isTrackingPreinstallEnabled() {
        return this.trackerConfig.m42163r();
    }

    public boolean isTrackingPreinstallThirdPartyEnabled() {
        return this.trackerConfig.m42162s();
    }

    public void setAntiFraudConfig(AntiFraudConfig antiFraudConfig) {
        this.trackerConfig.m42195a(antiFraudConfig);
    }

    public MyTrackerConfig setApkPreinstallParams(String str) {
        this.trackerConfig.m42193a(str);
        return this;
    }

    public MyTrackerConfig setAutotrackingPurchaseEnabled(boolean z) {
        this.trackerConfig.m42191a(z);
        return this;
    }

    public MyTrackerConfig setBufferingPeriod(int i) {
        this.trackerConfig.m42199a(i);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setDefaultVendorAppPackage() {
        this.trackerConfig.m42160u();
        return this;
    }

    public MyTrackerConfig setForcingPeriod(int i) {
        this.trackerConfig.m42189b(i);
        return this;
    }

    public MyTrackerConfig setInstalledPackagesProvider(InstalledPackagesProvider installedPackagesProvider) {
        this.trackerConfig.m42197a(installedPackagesProvider);
        return this;
    }

    public MyTrackerConfig setLaunchTimeout(int i) {
        this.trackerConfig.m42185c(i);
        return this;
    }

    public MyTrackerConfig setOkHttpClientProvider(OkHttpClientProvider okHttpClientProvider) {
        this.trackerConfig.m42196a(okHttpClientProvider);
        return this;
    }

    public MyTrackerConfig setProxyHost(String str) {
        this.trackerConfig.m42184c(str);
        return this;
    }

    public MyTrackerConfig setRegion(int i) {
        this.trackerConfig.m42181d(i);
        return this;
    }

    public MyTrackerConfig setTrackingEnvironmentEnabled(boolean z) {
        this.trackerConfig.m42187b(z);
        return this;
    }

    public MyTrackerConfig setTrackingLaunchEnabled(boolean z) {
        this.trackerConfig.m42183c(z);
        return this;
    }

    public MyTrackerConfig setTrackingLocationEnabled(boolean z) {
        this.trackerConfig.m42179d(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallEnabled(boolean z) {
        this.trackerConfig.m42177e(z);
        return this;
    }

    public MyTrackerConfig setTrackingPreinstallThirdPartyEnabled(boolean z) {
        this.trackerConfig.m42175f(z);
        return this;
    }

    @Deprecated
    public MyTrackerConfig setVendorAppPackage(String str) {
        this.trackerConfig.m42180d(str);
        return this;
    }
}
