package com.meevii.push.permission;

import android.app.Activity;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import androidx.core.app.NotificationManagerCompat;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import p844q6.DataManager;

/* renamed from: com.meevii.push.permission.h */
/* loaded from: classes5.dex */
public class PushPermissionUtils {
    /* renamed from: a */
    private static boolean m47864a(Context context, Intent intent) {
        if (intent.resolveActivity(context.getPackageManager()) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m47863b(Context context) {
        if (Build.VERSION.SDK_INT >= 34) {
            return ((NotificationManager) context.getSystemService("notification")).canUseFullScreenIntent();
        }
        return true;
    }

    /* renamed from: c */
    public static boolean m47862c(Context context) {
        return NotificationManagerCompat.from(context).areNotificationsEnabled();
    }

    /* renamed from: d */
    private static Intent m47861d(Context context) {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.parse("package:" + context.getPackageName()));
        if (!m47864a(context, intent)) {
            Intent intent2 = new Intent("android.settings.APPLICATION_SETTINGS");
            if (!m47864a(context, intent2)) {
                return new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS");
            }
            return intent2;
        }
        return intent;
    }

    /* renamed from: e */
    public static Intent m47860e(Context context) {
        Intent intent = null;
        try {
            if (Build.VERSION.SDK_INT < 34) {
                return null;
            }
            Intent intent2 = new Intent("android.settings.MANAGE_APP_USE_FULL_SCREEN_INTENT");
            try {
                intent2.setData(Uri.parse("package:" + context.getPackageName()));
                if (!m47864a(context, intent2)) {
                    return null;
                }
                return intent2;
            } catch (Throwable th) {
                th = th;
                intent = intent2;
                th.printStackTrace();
                return intent;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: f */
    public static Intent m47859f(Context context) {
        Intent intent = null;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                Intent intent2 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
                try {
                    intent2.putExtra("android.provider.extra.APP_PACKAGE", context.getPackageName());
                    intent = intent2;
                } catch (Throwable th) {
                    th = th;
                    intent = intent2;
                    th.printStackTrace();
                    return intent;
                }
            }
            if (intent == null || !m47864a(context, intent)) {
                return m47861d(context);
            }
            return intent;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: g */
    private static void m47858g(Activity activity) {
        Intent m47859f = m47859f(activity);
        if (m47859f != null) {
            activity.startActivityForResult(m47859f, 10000);
            PushPermissionManager.m47887a().m47875m();
            return;
        }
        throw new IllegalArgumentException("Cannot get pushPermissionIntent");
    }

    /* renamed from: h */
    public static boolean m47857h(int i) {
        if (i == 10002) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m47856i(int i) {
        if (i != 10001 && i != 10000) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    public static void m47855j(Activity activity) {
        Intent m47860e = m47860e(activity);
        if (m47860e != null) {
            activity.startActivityForResult(m47860e, Sdk$SDKError.EnumC29425b.AD_LOAD_TOO_FREQUENTLY_VALUE);
            PushPermissionManager.m47887a().m47878j();
            return;
        }
        throw new IllegalArgumentException("Cannot get pushFullIntentPermissionIntent");
    }

    /* renamed from: k */
    public static void m47854k(Activity activity) {
        if (activity.getApplicationInfo().targetSdkVersion >= 33 && Build.VERSION.SDK_INT >= 33) {
            if (activity.shouldShowRequestPermissionRationale("android.permission.POST_NOTIFICATIONS")) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 10001);
                DataManager.m12928g().m12918q("key_is_show_system_permission_dialog", true);
                return;
            } else if (!DataManager.m12928g().m12930e("key_is_show_system_permission_dialog", false)) {
                activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 10001);
                DataManager.m12928g().m12918q("key_is_show_system_permission_dialog", true);
                return;
            }
        }
        m47858g(activity);
    }

    /* renamed from: l */
    public static void m47853l(Activity activity, int i) {
        if (i != 1) {
            if (i != 2) {
                m47858g(activity);
            } else {
                m47854k(activity);
            }
        } else if (activity.getApplicationInfo().targetSdkVersion >= 33 && Build.VERSION.SDK_INT >= 33) {
            activity.requestPermissions(new String[]{"android.permission.POST_NOTIFICATIONS"}, 10001);
            DataManager.m12928g().m12918q("key_is_show_system_permission_dialog", true);
        } else {
            m47858g(activity);
        }
    }
}
