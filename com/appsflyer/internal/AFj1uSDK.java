package com.appsflyer.internal;

import android.net.Uri;
import com.appsflyer.AFLogger;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes2.dex */
public final class AFj1uSDK {
    @NotNull
    public static final String AFInAppEventParameterName;
    @NotNull
    public static final String AFInAppEventType;
    @NotNull
    public static String AFLogger;
    @NotNull
    public static final AFa1ySDK AFa1ySDK = new AFa1ySDK(null);
    @NotNull

    /* renamed from: d */
    public static final String f13085d;
    @NotNull

    /* renamed from: e */
    public static final String f13086e;
    @NotNull
    public static final String registerClient;
    @NotNull
    public static final String unregisterClient;
    @NotNull
    public static final String valueOf;
    @NotNull

    /* renamed from: w */
    private static final String f13087w;
    @NotNull
    public final AFj1rSDK AFKeystoreWrapper;
    @NotNull
    public final AFd1sSDK values;

    @Metadata
    /* loaded from: classes2.dex */
    public static final class AFa1ySDK {
        private AFa1ySDK() {
        }

        public /* synthetic */ AFa1ySDK(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        StringBuilder sb2 = new StringBuilder();
        String str = AFb1rSDK.valueOf;
        sb2.append(str);
        sb2.append("/androidevent?app_id=");
        String obj = sb2.toString();
        f13087w = obj;
        StringBuilder sb3 = new StringBuilder("https://%sattr.%s/api/v");
        sb3.append(obj);
        AFInAppEventParameterName = sb3.toString();
        AFInAppEventType = "https://%sadrevenue.%s/api/v2/generic/v6.14.2/android?app_id=";
        valueOf = "https://%sadrevenue.%s/api/v2/log/AdImpression/v6.14.2/android?app_id=";
        StringBuilder sb4 = new StringBuilder("https://%sconversions.%s/api/v");
        sb4.append(obj);
        f13086e = sb4.toString();
        StringBuilder sb5 = new StringBuilder("https://%slaunches.%s/api/v");
        sb5.append(obj);
        registerClient = sb5.toString();
        StringBuilder sb6 = new StringBuilder("https://%sinapps.%s/api/v");
        sb6.append(obj);
        f13085d = sb6.toString();
        unregisterClient = "https://%smonitorsdk.%s/api/remote-debug/v2.0?app_id=";
        StringBuilder sb7 = new StringBuilder("https://%svalidate.%s/api/v");
        sb7.append(str);
        sb7.append("/androidevent?buildnumber=6.14.2&app_id=");
        AFLogger = sb7.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public AFj1uSDK(@NotNull AFd1sSDK aFd1sSDK) {
        this(aFd1sSDK, null, 2, null);
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
    }

    public static String AFInAppEventParameterName() {
        return "https://aps-webhandler.appsflyer.com/api/trigger";
    }

    public static String AFInAppEventType(String str, boolean z) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        if (!z) {
            str2 = "&buildnumber=6.14.2";
        } else {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    public static Uri.Builder valueOf(Uri.Builder builder, String str, String str2) {
        String str3;
        if (str != null && str2 != null) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str2);
            sb2.append(str);
            builder.appendQueryParameter("af_sig", AFb1mSDK.AFInAppEventParameterName(sb2.toString(), str));
            return builder;
        }
        if (str == null) {
            str3 = "devKey";
        } else {
            str3 = "timestamp";
        }
        StringBuilder sb3 = new StringBuilder();
        sb3.append(str3);
        sb3.append(" is null at attempt to generate ddl event url");
        String obj = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str3);
        sb4.append(" is null");
        AFLogger.afErrorLog(obj, new IllegalStateException(sb4.toString()));
        return builder;
    }

    @NotNull
    public final String AFKeystoreWrapper(@NotNull AFh1jSDK aFh1jSDK) {
        Intrinsics.checkNotNullParameter(aFh1jSDK, "");
        if (aFh1jSDK instanceof AFh1fSDK) {
            return this.AFKeystoreWrapper.AFInAppEventParameterName("https://%ssdk-services.%s/validate-android-signature");
        }
        if (aFh1jSDK instanceof AFh1iSDK) {
            String AFInAppEventParameterName2 = this.AFKeystoreWrapper.AFInAppEventParameterName(AFLogger);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AFInAppEventParameterName2);
            sb2.append(this.values.valueOf.AFKeystoreWrapper.getPackageName());
            return sb2.toString();
        }
        throw new UnsupportedOperationException();
    }

    public final String values(String str) {
        String str2;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        String AFLogger2 = this.values.AFLogger();
        if (AFLogger2 != null) {
            str2 = "&channel=".concat(AFLogger2);
        } else {
            str2 = null;
        }
        if (str2 == null) {
            str2 = "";
        }
        sb2.append(str2);
        return sb2.toString();
    }

    private AFj1uSDK(@NotNull AFd1sSDK aFd1sSDK, @NotNull AFj1rSDK aFj1rSDK) {
        Intrinsics.checkNotNullParameter(aFd1sSDK, "");
        Intrinsics.checkNotNullParameter(aFj1rSDK, "");
        this.values = aFd1sSDK;
        this.AFKeystoreWrapper = aFj1rSDK;
    }

    public /* synthetic */ AFj1uSDK(AFd1sSDK aFd1sSDK, AFj1rSDK aFj1rSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(aFd1sSDK, (i & 2) != 0 ? new AFj1oSDK() : aFj1rSDK);
    }
}
