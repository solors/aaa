package p752k3;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.helpshift.activities.HSMainActivity;
import com.helpshift.log.HSLogger;

/* renamed from: k3.b */
/* loaded from: classes5.dex */
public class ApplicationUtil {
    /* renamed from: a */
    public static void m18274a(Context context) {
        HSLogger.m65441d("AppUtil", "Cancelling notification");
        NotificationManager m18270e = m18270e(context);
        if (m18270e != null) {
            m18270e.cancel(m18273b(HSMainActivity.class), 121);
        }
    }

    /* renamed from: b */
    private static String m18273b(Class<? extends Activity> cls) {
        return "hsft_notification_tag_" + cls.getName();
    }

    /* renamed from: c */
    public static Intent m18272c(Context context, String str) {
        try {
            return context.getPackageManager().getLaunchIntentForPackage(str);
        } catch (Exception e) {
            HSLogger.m65438e("AppUtil", "Error getting launch activity for package : " + str, e);
            return null;
        }
    }

    /* renamed from: d */
    public static int m18271d(Context context) {
        int i = context.getApplicationInfo().logo;
        if (i == 0) {
            return context.getApplicationInfo().icon;
        }
        return i;
    }

    @Nullable
    /* renamed from: e */
    public static NotificationManager m18270e(Context context) {
        try {
            return (NotificationManager) context.getSystemService("notification");
        } catch (Exception e) {
            HSLogger.m65438e("AppUtil", "Unable to get notification manager from System service", e);
            return null;
        }
    }

    /* renamed from: f */
    public static int m18269f(Context context, String str, String str2, String str3) {
        return context.getResources().getIdentifier(str, str2, str3);
    }

    /* renamed from: g */
    public static int m18268g(Context context) {
        try {
            return context.getApplicationInfo().targetSdkVersion;
        } catch (Exception e) {
            HSLogger.m65440d("AppUtil", "Target SDK version not found", e);
            return 0;
        }
    }

    /* renamed from: h */
    public static boolean m18267h(@NonNull Context context) {
        if ((context.getApplicationInfo().flags & 2) != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public static boolean m18266i(Context context, String str) {
        try {
            if (ContextCompat.checkSelfPermission(context, str) != 0) {
                return false;
            }
            return true;
        } catch (Exception e) {
            HSLogger.m65440d("AppUtil", "Error checking for permission : " + str, e);
            return false;
        }
    }

    /* renamed from: j */
    public static void m18265j(Context context, Notification notification, Class<? extends Activity> cls) {
        if (notification == null) {
            HSLogger.m65441d("AppUtil", "notification is null, not showing.");
            return;
        }
        NotificationManager m18270e = m18270e(context);
        if (m18270e == null) {
            HSLogger.m65441d("AppUtil", "NotificationManager is null, not showing.");
            return;
        }
        try {
            boolean areNotificationsEnabled = NotificationManagerCompat.from(context).areNotificationsEnabled();
            HSLogger.m65441d("AppUtil", "areNotificationAllowed : " + areNotificationsEnabled);
            if (areNotificationsEnabled) {
                String m18273b = m18273b(cls);
                HSLogger.m65441d("AppUtil", "Showing notification : Tag : " + m18273b);
                m18270e.notify(m18273b, 121, notification);
            }
        } catch (Exception e) {
            HSLogger.m65438e("AppUtil", "Error showing notification", e);
        }
    }
}
