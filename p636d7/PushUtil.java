package p636d7;

import android.app.NotificationChannel;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import androidx.core.app.NotificationManagerCompat;
import com.meevii.push.data.NotificationBean;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import com.meevii.push.notification.RemoteNotification;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/* renamed from: d7.j */
/* loaded from: classes5.dex */
public class PushUtil {
    /* renamed from: a */
    public static boolean m25690a(Context context, String str) {
        List<NotificationChannel> arrayList;
        String id2;
        int importance;
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        if (!from.areNotificationsEnabled()) {
            return false;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                arrayList = from.getNotificationChannels();
            } catch (Exception e) {
                e.printStackTrace();
                arrayList = new ArrayList<>();
            }
            for (NotificationChannel notificationChannel : arrayList) {
                id2 = notificationChannel.getId();
                if (str.equals(id2)) {
                    importance = notificationChannel.getImportance();
                    if (importance == 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    /* renamed from: b */
    public static String m25689b(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("hms_content_id");
    }

    /* renamed from: c */
    public static String m25688c(Intent intent) {
        if (intent == null) {
            return null;
        }
        return intent.getStringExtra("hms_id");
    }

    /* renamed from: d */
    public static long m25687d(Intent intent) {
        if (intent == null) {
            return -1L;
        }
        String stringExtra = intent.getStringExtra("hms_ttl");
        if (TextUtils.isEmpty(stringExtra)) {
            return -1L;
        }
        try {
            return Long.parseLong(stringExtra);
        } catch (NumberFormatException e) {
            PushLogUtil.m25697b("parseLong HmsTtlTs error : " + e.getMessage());
            return -1L;
        }
    }

    @Nullable
    /* renamed from: e */
    public static NotificationBean m25686e(Intent intent) {
        if (!intent.hasExtra(RemoteNotification.MEEVII_PUSH_DATA_KEY)) {
            return null;
        }
        return (NotificationBean) intent.getParcelableExtra(RemoteNotification.MEEVII_PUSH_DATA_KEY);
    }

    @Nullable
    /* renamed from: f */
    public static NotificationContentEntity m25685f(Intent intent) {
        if (!intent.hasExtra("local_push_content_data")) {
            return null;
        }
        return (NotificationContentEntity) intent.getParcelableExtra("local_push_content_data");
    }

    /* renamed from: g */
    public static boolean m25684g(Intent intent) {
        return "true".equals(intent.getStringExtra("hms_command"));
    }

    /* renamed from: h */
    public static boolean m25683h(Calendar calendar, Calendar calendar2) {
        int i = calendar.get(1);
        int i2 = calendar.get(6);
        int i3 = calendar2.get(1);
        int i4 = calendar2.get(6);
        if (i == i3 && i2 == i4) {
            return true;
        }
        return false;
    }
}
