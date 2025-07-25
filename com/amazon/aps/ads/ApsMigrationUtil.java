package com.amazon.aps.ads;

import androidx.annotation.NonNull;
import com.amazon.aps.ads.model.ApsAdNetwork;
import com.amazon.aps.ads.model.ApsAdRequestErrorCode;
import com.amazon.aps.ads.model.ApsAdType;
import com.amazon.aps.ads.model.ApsLogLevel;
import com.amazon.aps.ads.model.ApsMraidPolicy;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdType;
import com.amazon.device.ads.DTBAdNetwork;
import com.amazon.device.ads.DTBLogLevel;
import com.amazon.device.ads.MRAIDPolicy;

/* loaded from: classes2.dex */
public class ApsMigrationUtil {
    private static boolean isApsInitCalled = false;
    private static boolean isApsInitInProgress = false;
    private static boolean isApsRemoteConfigInProgress = false;

    /* renamed from: com.amazon.aps.ads.ApsMigrationUtil$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C35811 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsAdType;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$aps$ads$model$ApsMraidPolicy;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdError$ErrorCode;
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$MRAIDPolicy;

        static {
            int[] iArr = new int[ApsAdNetwork.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork = iArr;
            try {
                iArr[ApsAdNetwork.AD_GENERATION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork[ApsAdNetwork.ADMOB.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork[ApsAdNetwork.UNITY_LEVELPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork[ApsAdNetwork.MAX.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork[ApsAdNetwork.NIMBUS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork[ApsAdNetwork.OTHER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork[ApsAdNetwork.CUSTOM_MEDIATION.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[MRAIDPolicy.values().length];
            $SwitchMap$com$amazon$device$ads$MRAIDPolicy = iArr2;
            try {
                iArr2[MRAIDPolicy.DFP.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MRAIDPolicy[MRAIDPolicy.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MRAIDPolicy[MRAIDPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$MRAIDPolicy[MRAIDPolicy.AUTO_DETECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr3 = new int[ApsMraidPolicy.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsMraidPolicy = iArr3;
            try {
                iArr3[ApsMraidPolicy.DFP.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsMraidPolicy[ApsMraidPolicy.CUSTOM.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsMraidPolicy[ApsMraidPolicy.NONE.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsMraidPolicy[ApsMraidPolicy.AUTO_DETECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            int[] iArr4 = new int[ApsLogLevel.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel = iArr4;
            try {
                iArr4[ApsLogLevel.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[ApsLogLevel.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[ApsLogLevel.Info.ordinal()] = 3;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[ApsLogLevel.Warn.ordinal()] = 4;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[ApsLogLevel.Debug.ordinal()] = 5;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[ApsLogLevel.Trace.ordinal()] = 6;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[ApsLogLevel.Fatal.ordinal()] = 7;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[ApsLogLevel.Error.ordinal()] = 8;
            } catch (NoSuchFieldError unused23) {
            }
            int[] iArr5 = new int[ApsAdType.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsAdType = iArr5;
            try {
                iArr5[ApsAdType.VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdType[ApsAdType.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdType[ApsAdType.DISPLAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused26) {
            }
            int[] iArr6 = new int[AdError.ErrorCode.values().length];
            $SwitchMap$com$amazon$device$ads$AdError$ErrorCode = iArr6;
            try {
                iArr6[AdError.ErrorCode.NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused27) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused28) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.NETWORK_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused29) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused30) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.REQUEST_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused31) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused32) {
            }
            int[] iArr7 = new int[ApsAdRequestErrorCode.values().length];
            $SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode = iArr7;
            try {
                iArr7[ApsAdRequestErrorCode.NO_ERROR.ordinal()] = 1;
            } catch (NoSuchFieldError unused33) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode[ApsAdRequestErrorCode.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused34) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode[ApsAdRequestErrorCode.NETWORK_TIMEOUT.ordinal()] = 3;
            } catch (NoSuchFieldError unused35) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode[ApsAdRequestErrorCode.NO_FILL.ordinal()] = 4;
            } catch (NoSuchFieldError unused36) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode[ApsAdRequestErrorCode.REQUEST_ERROR.ordinal()] = 5;
            } catch (NoSuchFieldError unused37) {
            }
            try {
                $SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode[ApsAdRequestErrorCode.INTERNAL_ERROR.ordinal()] = 6;
            } catch (NoSuchFieldError unused38) {
            }
        }
    }

    public static AdType getAdType(ApsAdType apsAdType) {
        int i = C35811.$SwitchMap$com$amazon$aps$ads$model$ApsAdType[apsAdType.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return AdType.DISPLAY;
            }
            return AdType.INTERSTITIAL;
        }
        return AdType.VIDEO;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ApsAdRequestErrorCode getApsAdRequestErrorCode(AdError.ErrorCode errorCode) {
        int i = C35811.$SwitchMap$com$amazon$device$ads$AdError$ErrorCode[errorCode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return ApsAdRequestErrorCode.INTERNAL_ERROR;
                        }
                        return ApsAdRequestErrorCode.REQUEST_ERROR;
                    }
                    return ApsAdRequestErrorCode.NO_FILL;
                }
                return ApsAdRequestErrorCode.NETWORK_TIMEOUT;
            }
            return ApsAdRequestErrorCode.NETWORK_ERROR;
        }
        return ApsAdRequestErrorCode.NO_ERROR;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ApsMraidPolicy getApsMraidPolicy(@NonNull MRAIDPolicy mRAIDPolicy) {
        int i = C35811.$SwitchMap$com$amazon$device$ads$MRAIDPolicy[mRAIDPolicy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return ApsMraidPolicy.AUTO_DETECT;
                }
                return ApsMraidPolicy.NONE;
            }
            return ApsMraidPolicy.CUSTOM;
        }
        return ApsMraidPolicy.DFP;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBAdNetwork getDTBAdNetworkInfo(ApsAdNetwork apsAdNetwork) {
        int i = C35811.$SwitchMap$com$amazon$aps$ads$model$ApsAdNetwork[apsAdNetwork.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return DTBAdNetwork.OTHER;
                        }
                        return DTBAdNetwork.NIMBUS;
                    }
                    return DTBAdNetwork.MAX;
                }
                return DTBAdNetwork.IRON_SOURCE;
            }
            return DTBAdNetwork.ADMOB;
        }
        return DTBAdNetwork.AD_GENERATION;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static DTBLogLevel getDTBLogLevel(@NonNull ApsLogLevel apsLogLevel) {
        switch (C35811.$SwitchMap$com$amazon$aps$ads$model$ApsLogLevel[apsLogLevel.ordinal()]) {
            case 1:
                return DTBLogLevel.All;
            case 2:
                return DTBLogLevel.Off;
            case 3:
                return DTBLogLevel.Info;
            case 4:
                return DTBLogLevel.Warn;
            case 5:
                return DTBLogLevel.Debug;
            case 6:
                return DTBLogLevel.Trace;
            case 7:
                return DTBLogLevel.Fatal;
            default:
                return DTBLogLevel.Error;
        }
    }

    static AdError.ErrorCode getErrorCode(ApsAdRequestErrorCode apsAdRequestErrorCode) {
        int i = C35811.$SwitchMap$com$amazon$aps$ads$model$ApsAdRequestErrorCode[apsAdRequestErrorCode.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i != 5) {
                            return AdError.ErrorCode.INTERNAL_ERROR;
                        }
                        return AdError.ErrorCode.REQUEST_ERROR;
                    }
                    return AdError.ErrorCode.NO_FILL;
                }
                return AdError.ErrorCode.NETWORK_TIMEOUT;
            }
            return AdError.ErrorCode.NETWORK_ERROR;
        }
        return AdError.ErrorCode.NO_ERROR;
    }

    public static synchronized boolean getIsApsInitCalled() {
        boolean z;
        synchronized (ApsMigrationUtil.class) {
            z = isApsInitCalled;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static MRAIDPolicy getMRAIDPolicy(@NonNull ApsMraidPolicy apsMraidPolicy) {
        int i = C35811.$SwitchMap$com$amazon$aps$ads$model$ApsMraidPolicy[apsMraidPolicy.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    return MRAIDPolicy.AUTO_DETECT;
                }
                return MRAIDPolicy.NONE;
            }
            return MRAIDPolicy.CUSTOM;
        }
        return MRAIDPolicy.DFP;
    }

    public static synchronized boolean isApsInitInProgress() {
        boolean z;
        synchronized (ApsMigrationUtil.class) {
            z = isApsInitInProgress;
        }
        return z;
    }

    public static synchronized boolean isApsRemoteConfigInProgress() {
        boolean z;
        synchronized (ApsMigrationUtil.class) {
            z = isApsRemoteConfigInProgress;
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setApsInitInProgress(boolean z) {
        synchronized (ApsMigrationUtil.class) {
            isApsInitInProgress = z;
        }
    }

    public static synchronized void setApsRemoteConfigInProgress(boolean z) {
        synchronized (ApsMigrationUtil.class) {
            isApsRemoteConfigInProgress = z;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static synchronized void setIsApsInitCalled(boolean z) {
        synchronized (ApsMigrationUtil.class) {
            isApsInitCalled = z;
        }
    }
}
