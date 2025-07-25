package com.meevii.push.local.alarm;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.meevii.push.local.alarm.AlarmReceiver;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import com.meevii.push.local.data.p541db.PushDatabase;
import com.meevii.push.notification.MeeviiNotificationManager;
import java.util.HashMap;
import java.util.Random;
import p030b7.PushWork;
import p1010v6.LocalPushData;
import p1023w6.PushDaoProxy;
import p1023w6.PushEntity;
import p636d7.PushLogUtil;
import p636d7.PushShowFailUtil;
import p772l6.PushEvent;
import p981t6.LocalPushSdk;
import p995u6.AlarmManager;

/* loaded from: classes5.dex */
public class AlarmReceiver extends BroadcastReceiver {
    /* renamed from: b */
    public /* synthetic */ void m47960b(Context context, int i) {
        try {
            if (PushDatabase.m47914b() == null) {
                PushDatabase.m47913c(context);
            }
            PushEntity m2348c = PushDaoProxy.m2348c(i);
            if (m2348c == null) {
                PushLogUtil.m25698a("alarm receive: query is null");
                PushEvent.m15660n("void", "local", "void");
                PushShowFailUtil.m25693a(null, 1005);
                return;
            }
            m47959c(context, m2348c);
            m47958d(m2348c);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
        }
    }

    /* renamed from: c */
    private void m47959c(Context context, PushEntity pushEntity) {
        String str;
        PushLogUtil.m25698a("alarm receive:" + pushEntity);
        if (pushEntity.m2315l()) {
            PushLogUtil.m25698a("push disturb, disturbType: " + pushEntity.m2324c());
        } else if (pushEntity.m2326a() != null && !pushEntity.m2326a().isEmpty()) {
            String str2 = pushEntity.m2326a().get(new Random().nextInt(pushEntity.m2326a().size()));
            PushEvent.m15660n(pushEntity.m2323d(), "local", str2);
            NotificationContentEntity m2345f = PushDaoProxy.m2345f(str2);
            if (m2345f == null) {
                PushLogUtil.m25698a("DataBase does not contain content contentId = " + str2);
                PushShowFailUtil.m25693a(null, 1008);
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put(str2, m2345f);
            LocalPushData localPushData = new LocalPushData(pushEntity, hashMap);
            localPushData.m2669g(str2);
            if (MeeviiNotificationManager.m47899b().m47898c(context, "local", localPushData)) {
                String m2323d = pushEntity.m2323d();
                if (m2345f.m47920w()) {
                    str = "normal_float";
                } else {
                    str = "normal";
                }
                PushEvent.m15657q(m2323d, str, "local", str2, m2345f.m47923t(), m2345f.m47919x(), m2345f.m47928o());
            }
        } else {
            PushLogUtil.m25698a("DataBase does not contains any contentId.");
            PushEvent.m15660n(pushEntity.m2323d(), "local", "void");
            PushShowFailUtil.m25693a(null, 1007);
        }
    }

    /* renamed from: d */
    private void m47958d(PushEntity pushEntity) {
        if (pushEntity.m2318i() == -1) {
            PushLogUtil.m25698a("update repeat alarm when receive");
            if (AlarmManager.m2973a().m2964j(pushEntity)) {
                AlarmManager.m2973a().m2971c(pushEntity);
                return;
            }
            return;
        }
        AlarmManager.m2973a().m2970d(pushEntity.m2323d());
        PushLogUtil.m25698a("alarm delete for database:" + pushEntity);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(final Context context, Intent intent) {
        try {
            if (!LocalPushSdk.f116495a) {
                PushLogUtil.m25698a("local push sdk not initialize");
                return;
            }
            final int intExtra = intent.getIntExtra("meeviiAlarmId", 0);
            if (intExtra == 0) {
                PushLogUtil.m25698a("alarm receive: alarmId is 0");
                PushEvent.m15660n("void", "local", "void");
                PushShowFailUtil.m25693a(null, 1005);
                return;
            }
            PushWork.m103897b(new Runnable() { // from class: u6.b
                {
                    AlarmReceiver.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AlarmReceiver.this.m47960b(context, intExtra);
                }
            });
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
        }
    }
}
