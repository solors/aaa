package com.appsflyer.internal;

import android.util.Log;
import com.appsflyer.AFLogger;
import com.appsflyer.AppsFlyerProperties;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class AFg1dSDK extends AFg1cSDK {
    @NotNull
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);

    @Metadata
    /* loaded from: classes2.dex */
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* loaded from: classes2.dex */
    public /* synthetic */ class AFa1zSDK {
        public static final /* synthetic */ int[] AFInAppEventParameterName;

        static {
            int[] iArr = new int[AFLogger.LogLevel.values().length];
            iArr[AFLogger.LogLevel.DEBUG.ordinal()] = 1;
            iArr[AFLogger.LogLevel.INFO.ordinal()] = 2;
            iArr[AFLogger.LogLevel.WARNING.ordinal()] = 3;
            iArr[AFLogger.LogLevel.VERBOSE.ordinal()] = 4;
            iArr[AFLogger.LogLevel.ERROR.ordinal()] = 5;
            iArr[AFLogger.LogLevel.NONE.ordinal()] = 6;
            AFInAppEventParameterName = iArr;
        }
    }

    private static boolean AFInAppEventParameterName(AFLogger.LogLevel logLevel) {
        if (logLevel.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel()) {
            return true;
        }
        return false;
    }

    private final void AFKeystoreWrapper(AFLogger.LogLevel logLevel, AFg1bSDK aFg1bSDK, String str, Throwable th) {
        if (AFInAppEventParameterName(logLevel)) {
            String AFInAppEventParameterName = AFInAppEventParameterName(str, aFg1bSDK);
            int i = AFa1zSDK.AFInAppEventParameterName[logLevel.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i == 5) {
                                Log.e("AppsFlyer_6.14.2", AFInAppEventParameterName, th);
                                return;
                            }
                            return;
                        }
                        Log.v("AppsFlyer_6.14.2", AFInAppEventParameterName);
                        return;
                    }
                    Log.w("AppsFlyer_6.14.2", AFInAppEventParameterName);
                    return;
                }
                Log.i("AppsFlyer_6.14.2", AFInAppEventParameterName);
                return;
            }
            Log.d("AppsFlyer_6.14.2", AFInAppEventParameterName);
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: d */
    public final void mo92131d(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFKeystoreWrapper(AFLogger.LogLevel.DEBUG, aFg1bSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: e */
    public final void mo92130e(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, @NotNull Throwable th, boolean z, boolean z2, boolean z3, boolean z4) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(th, "");
        if (z2) {
            AFKeystoreWrapper(AFLogger.LogLevel.ERROR, aFg1bSDK, str, th);
        } else if (z) {
            AFKeystoreWrapper(AFLogger.LogLevel.DEBUG, aFg1bSDK, str, null);
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final void force(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        if (!AppsFlyerProperties.getInstance().isLogsDisabledCompletely()) {
            Log.d("AppsFlyer_6.14.2", withTag$SDK_prodRelease(str, aFg1bSDK));
        }
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    public final boolean getShouldExtendMsg() {
        if (AFLogger.LogLevel.VERBOSE.getLevel() <= AppsFlyerProperties.getInstance().getLogLevel()) {
            return true;
        }
        return false;
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: i */
    public final void mo92129i(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFKeystoreWrapper(AFLogger.LogLevel.INFO, aFg1bSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: v */
    public final void mo92128v(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFKeystoreWrapper(AFLogger.LogLevel.VERBOSE, aFg1bSDK, str, null);
    }

    @Override // com.appsflyer.internal.AFg1cSDK
    /* renamed from: w */
    public final void mo92127w(@NotNull AFg1bSDK aFg1bSDK, @NotNull String str, boolean z) {
        Intrinsics.checkNotNullParameter(aFg1bSDK, "");
        Intrinsics.checkNotNullParameter(str, "");
        AFKeystoreWrapper(AFLogger.LogLevel.WARNING, aFg1bSDK, str, null);
    }
}
