package com.amazon.aps.ads;

import androidx.annotation.NonNull;
import com.amazon.aps.ads.model.ApsAdFormat;
import com.amazon.aps.shared.APSAnalytics;
import com.amazon.aps.shared.analytics.APSEventSeverity;
import com.amazon.aps.shared.analytics.APSEventType;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DtbDeviceDataRetriever;

/* loaded from: classes2.dex */
public class ApsAdFormatUtils {
    static final int BANNER_HEIGHT = 50;
    static final int BANNER_WIDTH = 320;
    static final int DEFAULT_VIDEO_REQ_HEIGHT = 480;
    static final int DEFAULT_VIDEO_REQ_WIDTH = 320;
    static final int INTERSTITIAL_HEIGHT_BY_AAX = 9999;
    static final int INTERSTITIAL_WIDTH_BY_AAX = 9999;
    static final int MREC_HEIGHT = 250;
    static final int MREC_WIDTH = 300;
    static final int TABLET_BANNER_HEIGHT = 90;
    static final int TABLET_BANNER_WIDTH = 728;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.amazon.aps.ads.ApsAdFormatUtils$1 */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class C35751 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdType;

        static {
            int[] iArr = new int[AdType.values().length];
            $SwitchMap$com$amazon$device$ads$AdType = iArr;
            try {
                iArr[AdType.DISPLAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdType[AdType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdType[AdType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[ApsAdFormat.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat = iArr2;
            try {
                iArr2[ApsAdFormat.BANNER_SMART.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.BANNER.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.MREC.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.LEADERBOARD.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[ApsAdFormat.REWARDED_VIDEO.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    private ApsAdFormatUtils() {
    }

    public static ApsAdFormat getAdFormat(AdType adType, int i, int i2) {
        if (adType != null) {
            try {
                int i3 = C35751.$SwitchMap$com$amazon$device$ads$AdType[adType.ordinal()];
                if (i3 != 1) {
                    if (i3 == 2 || i3 == 3) {
                        return ApsAdFormat.INTERSTITIAL;
                    }
                    return null;
                } else if (i == 50 && i2 == 320) {
                    return ApsAdFormat.BANNER;
                } else {
                    if (i == 250 && i2 == 300) {
                        return ApsAdFormat.MREC;
                    }
                    if (i == 90 && i2 == TABLET_BANNER_WIDTH) {
                        return ApsAdFormat.LEADERBOARD;
                    }
                    return null;
                }
            } catch (RuntimeException e) {
                APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error on getting AdFormat", e);
                return null;
            }
        }
        return null;
    }

    public static int getHeight(@NonNull ApsAdFormat apsAdFormat) {
        try {
            int i = C35751.$SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[apsAdFormat.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return 50;
                }
                if (i != 3) {
                    if (i == 4) {
                        return 90;
                    }
                    if (i == 5) {
                        return 480;
                    }
                    return 9999;
                }
                return 250;
            } else if (DtbDeviceDataRetriever.isTablet()) {
                return 90;
            } else {
                return 50;
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error on getting height from ApsAdFormat", e);
            return 9999;
        }
    }

    public static int getWidth(@NonNull ApsAdFormat apsAdFormat) {
        try {
            int i = C35751.$SwitchMap$com$amazon$aps$ads$model$ApsAdFormat[apsAdFormat.ordinal()];
            if (i != 1) {
                if (i == 2) {
                    return 320;
                }
                if (i != 3) {
                    if (i == 4) {
                        return TABLET_BANNER_WIDTH;
                    }
                    if (i == 5) {
                        return 320;
                    }
                    return 9999;
                }
                return 300;
            } else if (DtbDeviceDataRetriever.isTablet()) {
                return TABLET_BANNER_WIDTH;
            } else {
                return 320;
            }
        } catch (RuntimeException e) {
            APSAnalytics.logEvent(APSEventSeverity.FATAL, APSEventType.EXCEPTION, "Error on getting width dimension from ApsAdFormat", e);
            return 9999;
        }
    }
}
