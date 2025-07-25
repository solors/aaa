package com.pubmatic.sdk.common;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.cache.POBAdViewCacheService;
import com.pubmatic.sdk.common.cache.POBCacheManager;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBAppInfo;
import com.pubmatic.sdk.common.models.POBDeviceInfo;
import com.pubmatic.sdk.common.network.POBNetworkHandler;
import com.pubmatic.sdk.common.network.POBNetworkMonitor;
import com.pubmatic.sdk.common.network.POBTrackerHandler;
import com.pubmatic.sdk.common.session.POBAppSessionHandler;
import com.pubmatic.sdk.common.session.POBAppStateMonitor;
import com.pubmatic.sdk.common.session.POBImpDepthHandler;
import com.pubmatic.sdk.common.session.POBImpDepthHandling;
import com.pubmatic.sdk.common.utility.POBLocationDetector;
import com.pubmatic.sdk.crashanalytics.POBCrashAnalytics;

/* loaded from: classes7.dex */
public class POBInstanceProvider {
    @Nullable

    /* renamed from: a */
    private static volatile POBDeviceInfo f70013a;
    @Nullable

    /* renamed from: b */
    private static volatile POBAppInfo f70014b;
    @Nullable

    /* renamed from: c */
    private static volatile POBLocationDetector f70015c;
    @Nullable

    /* renamed from: d */
    private static volatile POBNetworkHandler f70016d;
    @Nullable

    /* renamed from: e */
    private static volatile POBSDKConfig f70017e;
    @Nullable

    /* renamed from: f */
    private static volatile POBCacheManager f70018f;
    @Nullable

    /* renamed from: g */
    private static volatile POBTrackerHandler f70019g;
    @Nullable

    /* renamed from: h */
    private static volatile POBNetworkMonitor f70020h;
    @Nullable

    /* renamed from: i */
    private static volatile POBAdViewCacheService f70021i;
    @Nullable

    /* renamed from: j */
    private static volatile POBCrashAnalysing f70022j;
    @Nullable

    /* renamed from: k */
    private static volatile POBAppSessionHandler f70023k;
    @Nullable

    /* renamed from: l */
    private static volatile POBImpDepthHandling f70024l;

    @NonNull
    public static POBAdViewCacheService getAdViewCacheService() {
        if (f70021i == null) {
            synchronized (POBAdViewCacheService.class) {
                if (f70021i == null) {
                    f70021i = new POBAdViewCacheService();
                }
            }
        }
        return f70021i;
    }

    @NonNull
    public static POBAppInfo getAppInfo(@NonNull Context context) {
        if (f70014b == null) {
            synchronized (POBAppInfo.class) {
                if (f70014b == null) {
                    f70014b = new POBAppInfo(context);
                }
            }
        }
        return f70014b;
    }

    @NonNull
    public static POBAppSessionHandler getApplicationSessionHandler(@NonNull Application application) {
        if (f70023k == null) {
            synchronized (POBAppSessionHandler.class) {
                if (f70023k == null) {
                    f70023k = new POBAppSessionHandler(POBAppStateMonitor.getInstance(application));
                }
            }
        }
        return f70023k;
    }

    @NonNull
    public static POBCacheManager getCacheManager(@NonNull Context context) {
        if (f70018f == null) {
            synchronized (POBCacheManager.class) {
                if (f70018f == null) {
                    f70018f = new POBCacheManager(context, getNetworkHandler(context));
                }
            }
        }
        return f70018f;
    }

    @Nullable
    public static synchronized POBCrashAnalysing getCrashAnalytics() {
        POBCrashAnalysing pOBCrashAnalysing;
        synchronized (POBInstanceProvider.class) {
            if (f70022j == null) {
                try {
                    POBCrashAnalytics.Companion companion = POBCrashAnalytics.Companion;
                    f70022j = (POBCrashAnalysing) POBCrashAnalytics.class.newInstance();
                } catch (Exception e) {
                    POBLog.error("POBInstanceProvider", "Exception caught while initializing CrashAnalytics. Message -> " + e.getMessage(), new Object[0]);
                }
            }
            pOBCrashAnalysing = f70022j;
        }
        return pOBCrashAnalysing;
    }

    @NonNull
    public static POBDeviceInfo getDeviceInfo(@NonNull Context context) {
        if (f70013a == null) {
            synchronized (POBDeviceInfo.class) {
                if (f70013a == null) {
                    f70013a = new POBDeviceInfo(context);
                }
            }
        }
        return f70013a;
    }

    @NonNull
    public static POBImpDepthHandling getImpDepthHandler(@NonNull POBAppSessionHandler pOBAppSessionHandler) {
        if (f70024l == null) {
            synchronized (POBImpDepthHandler.class) {
                if (f70024l == null) {
                    f70024l = new POBImpDepthHandler(pOBAppSessionHandler);
                }
            }
        }
        return f70024l;
    }

    @NonNull
    public static POBLocationDetector getLocationDetector(@NonNull Context context) {
        if (f70015c == null) {
            synchronized (POBLocationDetector.class) {
                if (f70015c == null) {
                    f70015c = new POBLocationDetector(context);
                    f70015c.setLocationUpdateIntervalInMs(getSdkConfig().getLocationDetectionDurationInMillis());
                }
            }
        }
        return f70015c;
    }

    @NonNull
    public static POBNetworkHandler getNetworkHandler(@NonNull Context context) {
        if (f70016d == null) {
            synchronized (POBNetworkHandler.class) {
                if (f70016d == null) {
                    f70016d = new POBNetworkHandler(context);
                }
            }
        }
        return f70016d;
    }

    @NonNull
    public static POBNetworkMonitor getNetworkMonitor(@NonNull Context context) {
        if (f70020h == null) {
            synchronized (POBNetworkMonitor.class) {
                if (f70020h == null) {
                    f70020h = new POBNetworkMonitor(context);
                }
            }
        }
        return f70020h;
    }

    @NonNull
    public static POBSDKConfig getSdkConfig() {
        if (f70017e == null) {
            synchronized (POBNetworkHandler.class) {
                if (f70017e == null) {
                    f70017e = new POBSDKConfig();
                }
            }
        }
        return f70017e;
    }

    @NonNull
    public static POBTrackerHandler getTrackerHandler(@NonNull POBNetworkHandler pOBNetworkHandler) {
        if (f70019g == null) {
            synchronized (POBTrackerHandler.class) {
                if (f70019g == null) {
                    f70019g = new POBTrackerHandler(pOBNetworkHandler);
                }
            }
        }
        return f70019g;
    }
}
