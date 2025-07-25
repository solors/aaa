package io.appmetrica.analytics.networktasks.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.AppSetId;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreapi.internal.model.SdkEnvironment;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.SdkEnvironmentProvider;
import io.appmetrica.analytics.coreutils.internal.WrapUtils;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.coreutils.internal.system.ConstantDeviceInfo;

/* loaded from: classes9.dex */
public class BaseRequestConfig {

    /* renamed from: a */
    private String f95859a;

    /* renamed from: b */
    private SdkEnvironment f95860b;

    /* renamed from: c */
    private SdkIdentifiers f95861c;

    /* renamed from: d */
    private AdvertisingIdsHolder f95862d;

    /* renamed from: e */
    private AppSetId f95863e;

    /* renamed from: f */
    private RetryPolicyConfig f95864f;

    /* loaded from: classes9.dex */
    public static abstract class BaseRequestArguments<I, O> implements ArgumentsMerger<I, O> {
    }

    /* loaded from: classes9.dex */
    public static abstract class ComponentLoader<T extends BaseRequestConfig, A extends BaseRequestArguments, D extends DataSource<A>> implements RequestConfigLoader<T, D> {

        /* renamed from: a */
        final Context f95865a;

        /* renamed from: b */
        final String f95866b;

        public ComponentLoader(@NonNull Context context, @NonNull String str) {
            this.f95865a = context;
            this.f95866b = str;
        }

        @NonNull
        protected abstract T createBlankConfig();

        @NonNull
        public Context getContext() {
            return this.f95865a;
        }

        @NonNull
        public String getPackageName() {
            return this.f95866b;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // io.appmetrica.analytics.networktasks.internal.BaseRequestConfig.RequestConfigLoader
        @NonNull
        public /* bridge */ /* synthetic */ BaseRequestConfig load(@NonNull Object obj) {
            return load((ComponentLoader<T, A, D>) ((DataSource) obj));
        }

        @NonNull
        public T load(@NonNull D d) {
            T createBlankConfig = createBlankConfig();
            createBlankConfig.setSdkIdentifiers(d.sdkIdentifiers);
            createBlankConfig.setSdkEnvironment(d.sdkEnvironmentProvider.getSdkEnvironment());
            PlatformIdentifiers platformIdentifiers = d.platformIdentifiers;
            createBlankConfig.setAppSetId(platformIdentifiers.getAppSetIdProvider().getAppSetId());
            createBlankConfig.setAdvertisingIdsHolder(platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f95865a));
            createBlankConfig.setPackageName(this.f95866b);
            return createBlankConfig;
        }
    }

    /* loaded from: classes9.dex */
    public static class DataSource<A> {
        @NonNull
        public final A componentArguments;
        @NonNull
        public final PlatformIdentifiers platformIdentifiers;
        @NonNull
        public final SdkEnvironmentProvider sdkEnvironmentProvider;
        @NonNull
        public final SdkIdentifiers sdkIdentifiers;

        public DataSource(@NonNull SdkIdentifiers sdkIdentifiers, @NonNull SdkEnvironmentProvider sdkEnvironmentProvider, @NonNull PlatformIdentifiers platformIdentifiers, @NonNull A a) {
            this.sdkIdentifiers = sdkIdentifiers;
            this.componentArguments = a;
            this.sdkEnvironmentProvider = sdkEnvironmentProvider;
            this.platformIdentifiers = platformIdentifiers;
        }
    }

    /* loaded from: classes9.dex */
    public interface RequestConfigLoader<T extends BaseRequestConfig, D> {
        @NonNull
        T load(D d);
    }

    @Nullable
    public AdvertisingIdsHolder getAdvertisingIdsHolder() {
        return this.f95862d;
    }

    public String getAnalyticsSdkBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return "";
        }
        return sdkEnvironment.getSdkInfo().getSdkBuildNumber();
    }

    @NonNull
    public String getAnalyticsSdkBuildType() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return "";
        }
        return sdkEnvironment.getSdkInfo().getSdkBuildType();
    }

    public String getAnalyticsSdkVersionName() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return "";
        }
        return sdkEnvironment.getSdkInfo().getSdkVersionName();
    }

    public String getAppBuildNumber() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return "";
        }
        return sdkEnvironment.getAppVersionInfo().getAppBuildNumber();
    }

    @NonNull
    public String getAppFramework() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return "";
        }
        return sdkEnvironment.getAppFramework();
    }

    public String getAppPlatform() {
        return "android";
    }

    @NonNull
    public synchronized String getAppSetId() {
        String str;
        AppSetId appSetId = this.f95863e;
        if (appSetId != null && appSetId.getId() != null) {
            str = this.f95863e.getId();
        }
        str = "";
        return str;
    }

    @NonNull
    public synchronized String getAppSetIdScope() {
        String value;
        AppSetId appSetId = this.f95863e;
        if (appSetId == null) {
            value = "";
        } else {
            value = appSetId.getScope().getValue();
        }
        return value;
    }

    public String getAppVersion() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return "";
        }
        return sdkEnvironment.getAppVersionInfo().getAppVersionName();
    }

    @NonNull
    public synchronized String getDeviceIDHash() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f95861c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceIdHash() != null) {
            str = this.f95861c.getDeviceIdHash();
        }
        return str;
    }

    @NonNull
    public synchronized String getDeviceId() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f95861c;
        if (sdkIdentifiers != null && sdkIdentifiers.getDeviceId() != null) {
            str = this.f95861c.getDeviceId();
        }
        return str;
    }

    @NonNull
    public String getDeviceRootStatus() {
        return ConstantDeviceInfo.DEVICE_ROOT_STATUS;
    }

    @NonNull
    public String getDeviceType() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment != null) {
            return sdkEnvironment.getDeviceType();
        }
        return "phone";
    }

    @NonNull
    public String getLocale() {
        String str;
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null || (str = (String) CollectionUtils.getFirstOrNull(sdkEnvironment.getLocales())) == null) {
            return "";
        }
        return str;
    }

    @NonNull
    public String getManufacturer() {
        return (String) WrapUtils.getOrDefault(ConstantDeviceInfo.MANUFACTURER, "");
    }

    @NonNull
    public String getModel() {
        return ConstantDeviceInfo.MODEL;
    }

    public int getOsApiLevel() {
        return ConstantDeviceInfo.OS_API_LEVEL;
    }

    @NonNull
    public String getOsVersion() {
        return ConstantDeviceInfo.OS_VERSION;
    }

    public String getPackageName() {
        return this.f95859a;
    }

    public String getProtocolVersion() {
        return "2";
    }

    public RetryPolicyConfig getRetryPolicyConfig() {
        return this.f95864f;
    }

    public float getScaleFactor() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return 0.0f;
        }
        return sdkEnvironment.getScreenInfo().getScaleFactor();
    }

    public int getScreenDpi() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getDpi();
    }

    public int getScreenHeight() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getHeight();
    }

    public int getScreenWidth() {
        SdkEnvironment sdkEnvironment = this.f95860b;
        if (sdkEnvironment == null) {
            return 0;
        }
        return sdkEnvironment.getScreenInfo().getWidth();
    }

    @NonNull
    public synchronized String getUuid() {
        String str;
        str = "";
        SdkIdentifiers sdkIdentifiers = this.f95861c;
        if (sdkIdentifiers != null && sdkIdentifiers.getUuid() != null) {
            str = this.f95861c.getUuid();
        }
        return str;
    }

    public synchronized boolean isIdentifiersValid() {
        boolean z;
        String uuid;
        String deviceId;
        String deviceIdHash;
        SdkIdentifiers sdkIdentifiers = this.f95861c;
        if (sdkIdentifiers != null && (uuid = sdkIdentifiers.getUuid()) != null && uuid.length() != 0 && (deviceId = sdkIdentifiers.getDeviceId()) != null && deviceId.length() != 0 && (deviceIdHash = sdkIdentifiers.getDeviceIdHash()) != null) {
            if (deviceIdHash.length() != 0) {
                z = true;
            }
        }
        z = false;
        return z;
    }

    protected void setAdvertisingIdsHolder(@NonNull AdvertisingIdsHolder advertisingIdsHolder) {
        this.f95862d = advertisingIdsHolder;
    }

    protected void setAppSetId(@NonNull AppSetId appSetId) {
        this.f95863e = appSetId;
    }

    protected void setPackageName(String str) {
        this.f95859a = str;
    }

    public void setRetryPolicyConfig(RetryPolicyConfig retryPolicyConfig) {
        this.f95864f = retryPolicyConfig;
    }

    protected void setSdkEnvironment(@NonNull SdkEnvironment sdkEnvironment) {
        this.f95860b = sdkEnvironment;
    }

    protected void setSdkIdentifiers(@Nullable SdkIdentifiers sdkIdentifiers) {
        this.f95861c = sdkIdentifiers;
    }

    public String toString() {
        return "BaseRequestConfig{mPackageName='" + this.f95859a + "', sdkEnvironment=" + this.f95860b + ", mProtocolVersion='2', sdkIdentifiers=" + this.f95861c + ", retryPolicyConfig=" + this.f95864f + '}';
    }
}
