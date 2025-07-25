package com.ironsource;

import android.app.Activity;
import android.content.Context;
import com.ironsource.mediationsdk.C20346c;
import com.ironsource.mediationsdk.C20423p;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.IronSourceBannerLayout;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseWrapper;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.sdk.LevelPlayBannerListener;
import com.ironsource.mediationsdk.sdk.LevelPlayInterstitialListener;
import com.ironsource.mediationsdk.sdk.LevelPlayRewardedVideoBaseListener;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.collections.C37559r0;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p804nd.C38513v;

@Metadata
/* renamed from: com.ironsource.zs */
/* loaded from: classes6.dex */
public final class C21333zs {
    @NotNull

    /* renamed from: a */
    public static final C21333zs f54830a = new C21333zs();

    private C21333zs() {
    }

    /* renamed from: a */
    public final int m53737a() {
        return C19821el.f49880p.m58785d().mo57096f().mo57133j();
    }

    @Nullable
    /* renamed from: b */
    public final String m53718b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C21109v3.m54522b(context, m53714c(context));
    }

    @Nullable
    /* renamed from: c */
    public final String m53714c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C21109v3.m54515g(context);
    }

    @NotNull
    /* renamed from: d */
    public final ConcurrentHashMap<String, List<String>> m53713d() {
        ConcurrentHashMap<String, List<String>> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.putAll(C20346c.m57031b().m57024c());
        concurrentHashMap.putAll(C20278lj.m57433b().m57431c());
        return concurrentHashMap;
    }

    /* renamed from: e */
    public final boolean m53712e() {
        return IronSource.isInterstitialReady();
    }

    /* renamed from: f */
    public final boolean m53711f() {
        return IronSource.isRewardedVideoAvailable();
    }

    /* renamed from: g */
    public final void m53710g() {
        IronSource.loadInterstitial();
    }

    /* renamed from: h */
    public final void m53709h() {
        IronSource.loadRewardedVideo();
    }

    /* renamed from: i */
    public final void m53708i() {
        C20423p.m56615m().m56729R();
    }

    @NotNull
    /* renamed from: a */
    public final ISBannerSize m53723a(@Nullable String str, int i, int i2) {
        return new ISBannerSize(str, i, i2);
    }

    @NotNull
    /* renamed from: b */
    public final JSONObject m53720b() {
        JSONObject m54143b = C21220xc.m54147a().m54143b();
        Intrinsics.checkNotNullExpressionValue(m54143b, "getProperties().toJSON()");
        return m54143b;
    }

    @NotNull
    /* renamed from: c */
    public final JSONObject m53715c() {
        JSONObject jSONObject = new JSONObject();
        try {
            ConcurrentHashMap<String, AdapterBaseWrapper> networkAdaptersMap = C20346c.m57031b().m57021d();
            Intrinsics.checkNotNullExpressionValue(networkAdaptersMap, "networkAdaptersMap");
            for (Map.Entry<String, AdapterBaseWrapper> entry : networkAdaptersMap.entrySet()) {
                if (entry.getValue().getAdapterBaseInterface() != null) {
                    C21333zs c21333zs = f54830a;
                    String key = entry.getKey();
                    Intrinsics.checkNotNullExpressionValue(key, "entry.key");
                    String m53724a = c21333zs.m53724a(key);
                    AdapterBaseInterface adapterBaseInterface = entry.getValue().getAdapterBaseInterface();
                    Intrinsics.checkNotNullExpressionValue(adapterBaseInterface, "entry.value.adapterBaseInterface");
                    String adapterVersion = adapterBaseInterface.getAdapterVersion();
                    Intrinsics.checkNotNullExpressionValue(adapterVersion, "adapterBaseInterface.adapterVersion");
                    jSONObject.putOpt(m53724a, c21333zs.m53722a(adapterVersion, adapterBaseInterface.getNetworkSDKVersion()));
                }
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
        }
        return jSONObject;
    }

    @NotNull
    /* renamed from: a */
    public final IronSourceBannerLayout m53734a(@NotNull Activity activity, @NotNull ISBannerSize size) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(size, "size");
        IronSourceBannerLayout m56660b = C20423p.m56615m().m56660b(activity, size);
        Intrinsics.checkNotNullExpressionValue(m56660b, "getInstance().createBanner(activity, size)");
        return m56660b;
    }

    /* renamed from: b */
    public final void m53719b(@Nullable Activity activity) {
        if (activity != null) {
            IronSource.showRewardedVideo(activity);
        } else {
            IronSource.showRewardedVideo();
        }
    }

    @Nullable
    /* renamed from: a */
    public final String m53733a(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return C21109v3.m54525a(context, m53714c(context));
    }

    /* renamed from: b */
    public final void m53717b(@Nullable IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.loadBanner(ironSourceBannerLayout);
    }

    @NotNull
    /* renamed from: a */
    public final String m53730a(@NotNull NetworkSettings networkSettings) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        String providerDefaultInstance = networkSettings.getProviderDefaultInstance();
        return providerDefaultInstance == null ? new String() : providerDefaultInstance;
    }

    /* renamed from: b */
    public final void m53716b(@NotNull String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        IronLog.INTERNAL.error(message);
    }

    @NotNull
    /* renamed from: a */
    public final String m53728a(@Nullable Placement placement) {
        String placementName;
        return (placement == null || (placementName = placement.getPlacementName()) == null) ? new String() : placementName;
    }

    @NotNull
    /* renamed from: a */
    public final String m53724a(@NotNull String key) {
        boolean m16592R;
        List m16611C0;
        Object m17577B0;
        boolean m16592R2;
        List m16611C02;
        Object m17531p0;
        boolean m16592R3;
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            m16592R = C37690r.m16592R(key, "-", false, 2, null);
            if (!m16592R) {
                m16592R3 = C37690r.m16592R(key, "_", false, 2, null);
                if (!m16592R3) {
                    return key;
                }
                m16611C02 = C37690r.m16611C0(key, new String[]{"_"}, false, 0, 6, null);
            } else {
                m16611C0 = C37690r.m16611C0(key, new String[]{"-"}, false, 0, 6, null);
                m17577B0 = _Collections.m17577B0(m16611C0);
                String str = (String) m17577B0;
                m16592R2 = C37690r.m16592R(str, "_", false, 2, null);
                if (!m16592R2) {
                    return str;
                }
                m16611C02 = C37690r.m16611C0(str, new String[]{"_"}, false, 0, 6, null);
            }
            m17531p0 = _Collections.m17531p0(m16611C02);
            return (String) m17531p0;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.getMessage());
            return key;
        }
    }

    /* renamed from: a */
    private final JSONObject m53722a(String str, String str2) {
        Map m17281m;
        m17281m = C37559r0.m17281m(C38513v.m14532a(C20722qs.f52658c, str), C38513v.m14532a("sdkVersion", str2));
        return new JSONObject(m17281m);
    }

    @NotNull
    /* renamed from: a */
    public final JSONObject m53721a(boolean z) {
        JSONObject mediationAdditionalData = IronSourceUtils.getMediationAdditionalData(z);
        Intrinsics.checkNotNullExpressionValue(mediationAdditionalData, "getMediationAdditionalData(isDemandOnlyMode)");
        return mediationAdditionalData;
    }

    /* renamed from: a */
    public final void m53736a(int i, @NotNull JSONObject data) {
        Intrinsics.checkNotNullParameter(data, "data");
        C20772rp.m55443i().mo57283a(new C20200kb(i, data));
    }

    /* renamed from: a */
    public final void m53735a(@Nullable Activity activity) {
        if (activity != null) {
            IronSource.showInterstitial(activity);
        } else {
            IronSource.showInterstitial();
        }
    }

    /* renamed from: a */
    public final void m53732a(@NotNull IronSource.AD_UNIT adUnit, @NotNull C21046ts loadAdConfig) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(loadAdConfig, "loadAdConfig");
        C20423p.m56615m().m56698a(adUnit, loadAdConfig);
    }

    /* renamed from: a */
    public final void m53731a(@Nullable IronSourceBannerLayout ironSourceBannerLayout) {
        IronSource.destroyBanner(ironSourceBannerLayout);
    }

    /* renamed from: a */
    public final void m53727a(@Nullable LevelPlayBannerListener levelPlayBannerListener) {
        C20309m5.m57329a().m57320b(levelPlayBannerListener);
    }

    /* renamed from: a */
    public final void m53726a(@Nullable LevelPlayInterstitialListener levelPlayInterstitialListener) {
        C19971gf.m58436a().m58426b(levelPlayInterstitialListener);
    }

    /* renamed from: a */
    public final void m53725a(@Nullable LevelPlayRewardedVideoBaseListener levelPlayRewardedVideoBaseListener) {
        C21023to.m54776a().m54764b(levelPlayRewardedVideoBaseListener);
    }

    /* renamed from: a */
    public final boolean m53729a(@NotNull NetworkSettings networkSettings, @NotNull IronSource.AD_UNIT adUnit) {
        Intrinsics.checkNotNullParameter(networkSettings, "networkSettings");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        return networkSettings.isBidder(adUnit);
    }
}
