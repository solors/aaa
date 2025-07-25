package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.HashSet;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.ironsource.so */
/* loaded from: classes6.dex */
public class C20979so {

    /* renamed from: b */
    private static C20979so f53488b;

    /* renamed from: a */
    private final ConcurrentHashMap<String, NetworkSettings> f53489a = new ConcurrentHashMap<>();

    private C20979so() {
    }

    /* renamed from: a */
    public HashSet<String> m54923a(String str, String str2) {
        HashSet<String> hashSet = new HashSet<>();
        try {
            for (NetworkSettings networkSettings : this.f53489a.values()) {
                if (networkSettings.getProviderTypeForReflection().equals(str)) {
                    if (networkSettings.getRewardedVideoSettings() != null && networkSettings.getRewardedVideoSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getRewardedVideoSettings().optString(str2))) {
                        hashSet.add(networkSettings.getRewardedVideoSettings().optString(str2));
                    }
                    if (networkSettings.getInterstitialSettings() != null && networkSettings.getInterstitialSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getInterstitialSettings().optString(str2))) {
                        hashSet.add(networkSettings.getInterstitialSettings().optString(str2));
                    }
                    if (networkSettings.getBannerSettings() != null && networkSettings.getBannerSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getBannerSettings().optString(str2))) {
                        hashSet.add(networkSettings.getBannerSettings().optString(str2));
                    }
                    if (networkSettings.getNativeAdSettings() != null && networkSettings.getNativeAdSettings().length() > 0 && !TextUtils.isEmpty(networkSettings.getNativeAdSettings().optString(str2))) {
                        hashSet.add(networkSettings.getNativeAdSettings().optString(str2));
                    }
                }
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
        return hashSet;
    }

    /* renamed from: b */
    public NetworkSettings m54921b(String str) {
        NetworkSettings networkSettings = this.f53489a.get(str);
        if (networkSettings == null) {
            NetworkSettings networkSettings2 = new NetworkSettings(str);
            m54925a(networkSettings2);
            return networkSettings2;
        }
        return networkSettings;
    }

    @Nullable
    /* renamed from: c */
    public NetworkSettings m54919c(String str) {
        for (NetworkSettings networkSettings : this.f53489a.values()) {
            if ("IronSource".equals(networkSettings.getProviderTypeForReflection()) && str.equalsIgnoreCase(networkSettings.getSubProviderId())) {
                return networkSettings;
            }
        }
        return new NetworkSettings(str);
    }

    /* renamed from: d */
    public ConcurrentHashMap<String, NetworkSettings> m54918d() {
        return this.f53489a;
    }

    /* renamed from: c */
    public static synchronized C20979so m54920c() {
        C20979so c20979so;
        synchronized (C20979so.class) {
            if (f53488b == null) {
                f53488b = new C20979so();
            }
            c20979so = f53488b;
        }
        return c20979so;
    }

    /* renamed from: a */
    public void m54926a() {
        this.f53489a.clear();
    }

    /* renamed from: b */
    public void m54922b() {
        for (NetworkSettings networkSettings : this.f53489a.values()) {
            if (networkSettings.isMultipleInstances() && !TextUtils.isEmpty(networkSettings.getProviderTypeForReflection())) {
                NetworkSettings m54921b = m54921b(networkSettings.getProviderDefaultInstance());
                networkSettings.setApplicationSettings(IronSourceUtils.mergeJsons(networkSettings.getApplicationSettings(), m54921b.getApplicationSettings()));
                networkSettings.setInterstitialSettings(IronSourceUtils.mergeJsons(networkSettings.getInterstitialSettings(), m54921b.getInterstitialSettings()));
                networkSettings.setRewardedVideoSettings(IronSourceUtils.mergeJsons(networkSettings.getRewardedVideoSettings(), m54921b.getRewardedVideoSettings()));
                networkSettings.setBannerSettings(IronSourceUtils.mergeJsons(networkSettings.getBannerSettings(), m54921b.getBannerSettings()));
                networkSettings.setNativeAdSettings(IronSourceUtils.mergeJsons(networkSettings.getNativeAdSettings(), m54921b.getNativeAdSettings()));
            }
        }
    }

    /* renamed from: a */
    public void m54925a(NetworkSettings networkSettings) {
        if (networkSettings == null || TextUtils.isEmpty(networkSettings.getProviderName())) {
            return;
        }
        this.f53489a.put(networkSettings.getProviderName(), networkSettings);
    }

    /* renamed from: a */
    public boolean m54924a(String str) {
        return this.f53489a.containsKey(str);
    }
}
