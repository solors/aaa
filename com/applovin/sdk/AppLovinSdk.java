package com.applovin.sdk;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.applovin.impl.AbstractC5969ze;
import com.applovin.impl.C5535t0;
import com.applovin.impl.mediation.MaxMediatedNetworkInfoImpl;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.mediation.MaxMediatedNetworkInfo;
import com.applovin.mediation.MaxSegmentCollection;
import com.p552ot.pubsub.p553a.C26484a;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AppLovinSdk {
    private static final String TAG = "AppLovinSdk";
    private static AppLovinSdk instance;
    private final C5416j coreSdk;
    public static final String VERSION = getVersion();
    public static final int VERSION_CODE = getVersionCode();
    private static final Object instanceLock = new Object();
    private static final Map<String, AppLovinSdk> sdkInstances = new HashMap(1);
    private static final Object sdkInstancesLock = new Object();

    /* loaded from: classes2.dex */
    public interface SdkInitializationListener {
        void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration);
    }

    /* renamed from: com.applovin.sdk.AppLovinSdk$a */
    /* loaded from: classes2.dex */
    public static class C6198a extends AppLovinSdkSettings {
        C6198a(Context context) {
            super(context);
        }
    }

    private AppLovinSdk(C5416j c5416j) {
        this.coreSdk = c5416j;
    }

    public static AppLovinSdk getInstance(Context context) {
        AppLovinSdk appLovinSdk;
        if (context != null) {
            if (C5535t0.m94571a(context).m94569a("applovin.sdk.key", (String) null) != null) {
                return getInstance(new C6198a(context), context);
            }
            synchronized (instanceLock) {
                if (instance == null) {
                    C5416j c5416j = new C5416j(context);
                    AppLovinSdk appLovinSdk2 = new AppLovinSdk(c5416j);
                    c5416j.m95138a(appLovinSdk2);
                    instance = appLovinSdk2;
                }
                appLovinSdk = instance;
            }
            return appLovinSdk;
        }
        throw new IllegalArgumentException("No context specified");
    }

    private static Collection<AppLovinSdk> getInstances() {
        Collection<AppLovinSdk> values;
        AppLovinSdk appLovinSdk = instance;
        if (appLovinSdk != null) {
            return Arrays.asList(appLovinSdk);
        }
        synchronized (sdkInstancesLock) {
            values = sdkInstances.values();
        }
        return values;
    }

    private static String getVersion() {
        return "13.0.1";
    }

    private static int getVersionCode() {
        return 13000199;
    }

    private void reinitialize(Boolean bool, Boolean bool2) {
        if (this.coreSdk.m95040x0().get() || this.coreSdk.m95046u0()) {
            this.coreSdk.m95173O0();
        }
        this.coreSdk.m95179L0();
        if (bool != null) {
            this.coreSdk.m95186I();
            if (C5434n.m94914a()) {
                C5434n m95186I = this.coreSdk.m95186I();
                m95186I.m94903d(TAG, "Toggled 'huc' to " + bool);
            }
            getEventService().trackEvent("huc", CollectionUtils.map("value", bool.toString()));
        }
        if (bool2 != null) {
            this.coreSdk.m95186I();
            if (C5434n.m94914a()) {
                C5434n m95186I2 = this.coreSdk.m95186I();
                m95186I2.m94903d(TAG, "Toggled 'dns' to " + bool2);
            }
            getEventService().trackEvent(C26484a.f69199P, CollectionUtils.map("value", bool2.toString()));
        }
    }

    public static void reinitializeAll(Boolean bool, Boolean bool2) {
        synchronized (sdkInstancesLock) {
            for (AppLovinSdk appLovinSdk : getInstances()) {
                appLovinSdk.reinitialize(bool, bool2);
            }
        }
    }

    /* renamed from: a */
    public C5416j m92221a() {
        return this.coreSdk;
    }

    public AppLovinAdService getAdService() {
        return this.coreSdk.m95081j();
    }

    public List<MaxMediatedNetworkInfo> getAvailableMediatedNetworks() {
        JSONArray m92415a = AbstractC5969ze.m92415a(this.coreSdk);
        ArrayList arrayList = new ArrayList(m92415a.length());
        for (int i = 0; i < m92415a.length(); i++) {
            arrayList.add(new MaxMediatedNetworkInfoImpl(JsonUtils.getJSONObject(m92415a, i, (JSONObject) null)));
        }
        return arrayList;
    }

    public AppLovinCmpService getCmpService() {
        return this.coreSdk.m95063p();
    }

    public AppLovinSdkConfiguration getConfiguration() {
        return this.coreSdk.m95054s();
    }

    public AppLovinEventService getEventService() {
        return this.coreSdk.m95037z();
    }

    public String getMediationProvider() {
        return this.coreSdk.m95176N();
    }

    @Deprecated
    public AppLovinPostbackService getPostbackService() {
        return this.coreSdk.m95158X();
    }

    public String getSdkKey() {
        return this.coreSdk.m95127a0();
    }

    public MaxSegmentCollection getSegmentCollection() {
        return this.coreSdk.m95115b0();
    }

    public AppLovinSdkSettings getSettings() {
        return this.coreSdk.m95093f0();
    }

    @Deprecated
    public String getUserIdentifier() {
        return this.coreSdk.m95067n0();
    }

    public void initialize(AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfiguration, @Nullable SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.m95136a(appLovinSdkInitializationConfiguration, sdkInitializationListener);
    }

    @Deprecated
    public void initializeSdk() {
    }

    public boolean isInitialized() {
        return this.coreSdk.m95052s0();
    }

    @Deprecated
    public void setMediationProvider(String str) {
        this.coreSdk.m95094f(str);
    }

    @Deprecated
    public void setPluginVersion(String str) {
        this.coreSdk.m95090g(str);
    }

    @Deprecated
    public void setUserIdentifier(String str) {
        this.coreSdk.m95086h(str);
    }

    public void showCreativeDebugger() {
        this.coreSdk.m95165S0();
    }

    public void showMediationDebugger() {
        this.coreSdk.m95163T0();
    }

    public String toString() {
        return "AppLovinSdk{sdkKey='" + getSdkKey() + "', isInitialized=" + isInitialized() + ", isFirstSession=" + this.coreSdk.m95049t0() + '}';
    }

    @Deprecated
    public void initializeSdk(SdkInitializationListener sdkInitializationListener) {
        this.coreSdk.m95139a(sdkInitializationListener);
    }

    public void showMediationDebugger(@Nullable Map<String, List<?>> map) {
        this.coreSdk.m95130a(map);
    }

    @Deprecated
    public static void initializeSdk(Context context) {
        initializeSdk(context, null);
    }

    @Deprecated
    public static void initializeSdk(Context context, SdkInitializationListener sdkInitializationListener) {
        if (context != null) {
            AppLovinSdk appLovinSdk = getInstance(context);
            if (appLovinSdk != null) {
                appLovinSdk.initializeSdk(sdkInitializationListener);
                return;
            } else {
                C5434n.m94898h(TAG, "Unable to initialize AppLovin SDK: SDK object not created");
                return;
            }
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Deprecated
    public static AppLovinSdk getInstance(AppLovinSdkSettings appLovinSdkSettings, Context context) {
        if (context != null) {
            return getInstance(C5535t0.m94571a(context).m94569a("applovin.sdk.key", ""), appLovinSdkSettings, context);
        }
        throw new IllegalArgumentException("No context specified");
    }

    @Deprecated
    public static AppLovinSdk getInstance(String str, AppLovinSdkSettings appLovinSdkSettings, Context context) {
        AppLovinSdk appLovinSdk;
        if (appLovinSdkSettings != null) {
            if (context != null) {
                synchronized (instanceLock) {
                    AppLovinSdk appLovinSdk2 = instance;
                    if (appLovinSdk2 != null && str.equals(appLovinSdk2.getSdkKey())) {
                        return instance;
                    }
                    synchronized (sdkInstancesLock) {
                        Map<String, AppLovinSdk> map = sdkInstances;
                        if (map.containsKey(str)) {
                            appLovinSdk = map.get(str);
                        } else {
                            if (!TextUtils.isEmpty(str)) {
                                String str2 = File.separator;
                                if (str.contains(str2)) {
                                    C5434n.m94898h(TAG, "\n**************************************************\nINVALID SDK KEY: " + str + "\n**************************************************\n");
                                    if (!map.isEmpty()) {
                                        return map.values().iterator().next();
                                    }
                                    str = str.replace(str2, "");
                                }
                            }
                            C5416j c5416j = new C5416j(context);
                            c5416j.m95134a(str, appLovinSdkSettings);
                            AppLovinSdk appLovinSdk3 = new AppLovinSdk(c5416j);
                            c5416j.m95138a(appLovinSdk3);
                            appLovinSdkSettings.attachAppLovinSdk(c5416j);
                            map.put(str, appLovinSdk3);
                            appLovinSdk = appLovinSdk3;
                        }
                        return appLovinSdk;
                    }
                }
            }
            throw new IllegalArgumentException("No context specified");
        }
        throw new IllegalArgumentException("No userSettings specified");
    }
}
