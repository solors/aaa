package com.appsflyer.internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public abstract class AFi1xSDK {
    @NotNull
    public static final AFa1vSDK AFa1vSDK = new AFa1vSDK(null);
    @Nullable
    ConnectivityManager AFKeystoreWrapper;
    @Nullable
    private final TelephonyManager values;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class AFa1vSDK {
        private AFa1vSDK() {
        }

        public /* synthetic */ AFa1vSDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AFi1xSDK(@NotNull Context context) {
        ConnectivityManager connectivityManager;
        Intrinsics.checkNotNullParameter(context, "");
        Object systemService = context.getSystemService("connectivity");
        if (systemService instanceof ConnectivityManager) {
            connectivityManager = (ConnectivityManager) systemService;
        } else {
            connectivityManager = null;
        }
        this.AFKeystoreWrapper = connectivityManager;
        Object systemService2 = context.getSystemService("phone");
        this.values = systemService2 instanceof TelephonyManager ? (TelephonyManager) systemService2 : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public static boolean valueOf(@Nullable NetworkInfo networkInfo) {
        if (networkInfo != null) {
            return networkInfo.isConnectedOrConnecting();
        }
        return false;
    }

    public abstract boolean AFInAppEventParameterName();

    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[Catch: all -> 0x0025, TryCatch #0 {all -> 0x0025, blocks: (B:6:0x0009, B:8:0x000f, B:14:0x001b), top: B:26:0x0009 }] */
    @org.jetbrains.annotations.NotNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.appsflyer.internal.AFi1uSDK AFInAppEventType() {
        /*
            r6 = this;
            r0 = 0
            android.telephony.TelephonyManager r1 = r6.values     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L2b
            java.lang.String r2 = r1.getSimOperatorName()     // Catch: java.lang.Throwable -> L2d
            java.lang.String r0 = r1.getNetworkOperatorName()     // Catch: java.lang.Throwable -> L25
            if (r0 == 0) goto L18
            int r3 = r0.length()     // Catch: java.lang.Throwable -> L25
            if (r3 != 0) goto L16
            goto L18
        L16:
            r3 = 0
            goto L19
        L18:
            r3 = 1
        L19:
            if (r3 == 0) goto L37
            int r1 = r1.getPhoneType()     // Catch: java.lang.Throwable -> L25
            r3 = 2
            if (r1 != r3) goto L37
            java.lang.String r0 = "CDMA"
            goto L37
        L25:
            r1 = move-exception
            r5 = r1
            r1 = r0
            r0 = r2
            r2 = r5
            goto L30
        L2b:
            r2 = r0
            goto L37
        L2d:
            r1 = move-exception
            r2 = r1
            r1 = r0
        L30:
            java.lang.String r3 = "Exception while collecting network info. "
            com.appsflyer.AFLogger.afErrorLog(r3, r2)
            r2 = r0
            r0 = r1
        L37:
            com.appsflyer.internal.AFi1uSDK r1 = new com.appsflyer.internal.AFi1uSDK
            java.lang.String r3 = r6.values()
            boolean r4 = r6.AFInAppEventParameterName()
            r1.<init>(r3, r0, r2, r4)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFi1xSDK.AFInAppEventType():com.appsflyer.internal.AFi1uSDK");
    }

    @NotNull
    protected abstract String values();
}
