package com.ironsource;

import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.t1 */
/* loaded from: classes6.dex */
public class C20996t1 {
    /* renamed from: a */
    public static int m54870a(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_ALL_SMASHES_SESSION_CAPPED;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_ALL_SMASHES_SESSION_CAPPED;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    /* renamed from: b */
    public static int m54869b(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1021;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return 1020;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return 1019;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return 1018;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    /* renamed from: c */
    public static int m54868c(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_INSTANCE_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_INSTANCE_INIT_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return 612;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return IronSourceError.ERROR_NT_INSTANCE_INIT_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    /* renamed from: d */
    public static int m54867d(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1027;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_DURING_SHOW;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    /* renamed from: e */
    public static int m54866e(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1024;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == IronSource.AD_UNIT.BANNER) {
            return IronSourceError.ERROR_BN_LOAD_FAILED_NO_CANDIDATES;
        }
        if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
            return IronSourceError.ERROR_NT_LOAD_FAILED_NO_CANDIDATES;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    /* renamed from: f */
    public static int m54865f(IronSource.AD_UNIT ad_unit) {
        if (ad_unit != IronSource.AD_UNIT.INTERSTITIAL && ad_unit != IronSource.AD_UNIT.REWARDED_VIDEO) {
            if (ad_unit == IronSource.AD_UNIT.BANNER) {
                return 604;
            }
            if (ad_unit == IronSource.AD_UNIT.NATIVE_AD) {
                return IronSourceError.ERROR_NT_LOAD_PLACEMENT_CAPPED;
            }
            IronLog ironLog = IronLog.INTERNAL;
            ironLog.warning("ad unit not supported - " + ad_unit);
            return 510;
        }
        return IronSourceError.ERROR_PLACEMENT_CAPPED;
    }

    /* renamed from: g */
    public static int m54864g(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return 1022;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_CALLED_DURING_SHOW;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }

    /* renamed from: h */
    public static int m54863h(IronSource.AD_UNIT ad_unit) {
        if (ad_unit == IronSource.AD_UNIT.REWARDED_VIDEO) {
            return IronSourceError.ERROR_RV_SHOW_EXCEPTION;
        }
        if (ad_unit == IronSource.AD_UNIT.INTERSTITIAL) {
            return IronSourceError.ERROR_IS_SHOW_EXCEPTION;
        }
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.warning("ad unit not supported - " + ad_unit);
        return 510;
    }
}
