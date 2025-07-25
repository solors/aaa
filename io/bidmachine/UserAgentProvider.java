package io.bidmachine;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.google.firebase.sessions.settings.RemoteSettings;
import io.bidmachine.core.Utils;
import io.bidmachine.utils.DeviceUtils;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes9.dex */
public class UserAgentProvider {
    @Nullable
    private static String generatedUserAgent;
    @Nullable
    private static String systemHttpAgent;
    @Nullable
    private static String webUserAgent;
    @NonNull
    private static final AtomicBoolean WEB_USER_AGENT_PROCESSED = new AtomicBoolean(false);
    @VisibleForTesting
    static final long DEFAULT_EXPIRATION_MS = TimeUnit.DAYS.toMillis(14);

    /* renamed from: io.bidmachine.UserAgentProvider$a */
    /* loaded from: classes9.dex */
    private static class C35211a {
        private C35211a() {
        }

        private static void appendChromeToUserAgent(@NonNull PackageManager packageManager, @NonNull StringBuilder sb2) {
            String[] strArr = {"com.android.chrome", "com.google.android.webview", "com.android.webview"};
            for (int i = 0; i < 3; i++) {
                try {
                    PackageInfo packageInfo = packageManager.getPackageInfo(strArr[i], 0);
                    sb2.append(" Chrome/");
                    sb2.append(packageInfo.versionName);
                    return;
                } catch (Throwable unused) {
                }
            }
        }

        private static void appendMobileToUserAgent(@NonNull Context context, @NonNull PackageManager packageManager, @NonNull StringBuilder sb2) {
            String string;
            try {
                ApplicationInfo applicationInfo = context.getApplicationInfo();
                PackageInfo packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0);
                sb2.append(" Mobile");
                sb2.append(" ");
                int i = applicationInfo.labelRes;
                if (i == 0) {
                    string = applicationInfo.nonLocalizedLabel.toString();
                } else {
                    string = context.getString(i);
                }
                sb2.append(string);
                sb2.append(RemoteSettings.FORWARD_SLASH_STRING);
                sb2.append(packageInfo.versionName);
            } catch (Throwable unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        @NonNull
        public static String create(@NonNull Context context) {
            try {
                StringBuilder sb2 = new StringBuilder("Mozilla/5.0");
                sb2.append(" (Linux; Android ");
                sb2.append(DeviceUtils.getOsVersion());
                sb2.append("; ");
                sb2.append(DeviceUtils.getModel());
                sb2.append(" Build/");
                sb2.append(DeviceUtils.getBuildId());
                sb2.append("; wv)");
                sb2.append(" AppleWebKit/537.36 (KHTML, like Gecko)");
                sb2.append(" Version/4.0");
                PackageManager packageManager = context.getPackageManager();
                appendChromeToUserAgent(packageManager, sb2);
                appendMobileToUserAgent(context, packageManager, sb2);
                return sb2.toString();
            } catch (Throwable unused) {
                return "";
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: io.bidmachine.UserAgentProvider$b */
    /* loaded from: classes9.dex */
    public static class RunnableC35212b implements Runnable {
        @NonNull
        private final Context applicationContext;

        public RunnableC35212b(@NonNull Context context) {
            this.applicationContext = context.getApplicationContext();
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                String unused = UserAgentProvider.webUserAgent = WebSettings.getDefaultUserAgent(this.applicationContext);
                UserAgentProvider.storeUserAgent(this.applicationContext, UserAgentProvider.webUserAgent);
            } catch (Throwable unused2) {
            }
        }
    }

    static {
        try {
            systemHttpAgent = System.getProperty("http.agent", "");
        } catch (Throwable unused) {
        }
    }

    @VisibleForTesting
    static long calculateExpiration() {
        return System.currentTimeMillis() + DEFAULT_EXPIRATION_MS;
    }

    @VisibleForTesting
    static void clear() {
        WEB_USER_AGENT_PROCESSED.set(false);
        webUserAgent = null;
        generatedUserAgent = null;
        systemHttpAgent = null;
    }

    @Nullable
    @VisibleForTesting
    static String findStoredUserAgent(@NonNull Context context) {
        String userAgent = BidMachineSharedPreference.getUserAgent(context);
        String osVersion = DeviceUtils.getOsVersion();
        long userAgentExpirationMs = BidMachineSharedPreference.getUserAgentExpirationMs(context);
        if (!TextUtils.isEmpty(userAgent) && osVersion.equals(BidMachineSharedPreference.getUserAgentDeviceOs(context)) && userAgentExpirationMs > System.currentTimeMillis()) {
            return userAgent;
        }
        return null;
    }

    @VisibleForTesting
    static void findWebUserAgent(@NonNull Context context) {
        if (!WEB_USER_AGENT_PROCESSED.compareAndSet(false, true)) {
            return;
        }
        String findStoredUserAgent = findStoredUserAgent(context);
        if (findStoredUserAgent != null) {
            webUserAgent = findStoredUserAgent;
            return;
        }
        try {
            Utils.onUiThread(new RunnableC35212b(context));
        } catch (Throwable unused) {
        }
    }

    @Nullable
    public static String getUserAgent(@NonNull Context context) {
        if (webUserAgent == null) {
            findWebUserAgent(context);
        }
        if (!TextUtils.isEmpty(webUserAgent)) {
            return webUserAgent;
        }
        if (generatedUserAgent == null) {
            generatedUserAgent = C35211a.create(context);
        }
        if (!TextUtils.isEmpty(generatedUserAgent)) {
            return generatedUserAgent;
        }
        return systemHttpAgent;
    }

    public static void initialize(@NonNull Context context) {
        findWebUserAgent(context);
    }

    @VisibleForTesting
    static void storeUserAgent(@NonNull Context context, @NonNull String str) {
        BidMachineSharedPreference.setUserAgent(context, str);
        BidMachineSharedPreference.setUserAgentDeviceOs(context, DeviceUtils.getOsVersion());
        BidMachineSharedPreference.setUserAgentExpirationMs(context, calculateExpiration());
    }
}
