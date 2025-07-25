package p995u6;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import androidx.annotation.Nullable;
import androidx.core.app.AlarmManagerCompat;
import androidx.core.app.NotificationCompat;
import com.meevii.push.local.alarm.AlarmReceiver;
import p636d7.PushLogUtil;

/* renamed from: u6.d */
/* loaded from: classes5.dex */
public class AlarmUtils {
    /* renamed from: a */
    public static void m2962a(Context context, int i) {
        m2961b(context, i, m2960c(context));
    }

    /* renamed from: b */
    public static void m2961b(Context context, int i, Intent intent) {
        intent.putExtra("meeviiAlarmId", i);
        PendingIntent m2958e = m2958e(context, i, intent, 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager != null && m2958e != null) {
            alarmManager.cancel(m2958e);
        }
    }

    /* renamed from: c */
    public static Intent m2960c(Context context) {
        Intent intent = new Intent();
        intent.setAction("android.intent.action.meevii.alarm");
        intent.setClass(context, AlarmReceiver.class);
        intent.setFlags(32);
        intent.addCategory("android.intent.category.DEFAULT");
        return intent;
    }

    /* renamed from: d */
    public static PendingIntent m2959d(Context context, int i, Intent intent, int i2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return PendingIntent.getActivity(context, i, intent, i2 | 67108864);
        }
        return PendingIntent.getActivity(context, i, intent, i2);
    }

    @Nullable
    /* renamed from: e */
    public static PendingIntent m2958e(Context context, int i, Intent intent, int i2) {
        PendingIntent broadcast;
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                broadcast = PendingIntent.getBroadcast(context, i, intent, i2 | 67108864);
            } else {
                broadcast = PendingIntent.getBroadcast(context, i, intent, i2);
            }
            return broadcast;
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return null;
        }
    }

    /* renamed from: f */
    public static void m2957f(Context context, int i, Intent intent, long j) {
        boolean canScheduleExactAlarms;
        intent.putExtra("meeviiAlarmId", i);
        PendingIntent m2958e = m2958e(context, i, intent, 134217728);
        AlarmManager alarmManager = (AlarmManager) context.getSystemService(NotificationCompat.CATEGORY_ALARM);
        if (alarmManager != null && m2958e != null) {
            try {
                if (Build.VERSION.SDK_INT >= 31) {
                    canScheduleExactAlarms = alarmManager.canScheduleExactAlarms();
                    if (!canScheduleExactAlarms) {
                        AlarmManagerCompat.setAndAllowWhileIdle(alarmManager, 0, j, m2958e);
                        return;
                    }
                }
                alarmManager.setExactAndAllowWhileIdle(0, j, m2958e);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
