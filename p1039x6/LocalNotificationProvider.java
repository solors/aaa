package p1039x6;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import com.meevii.push.normalfloat.FullScreenIntentManager;
import java.util.Map;
import p1010v6.LocalPushData;
import p636d7.C32857k;
import p786m6.ChannelData;
import p799n6.CustomNotificationManager;
import p995u6.AlarmUtils;

/* renamed from: x6.f */
/* loaded from: classes5.dex */
public class LocalNotificationProvider {
    /* renamed from: a */
    public static Bitmap m1897a(Context context, NotificationContentEntity notificationContentEntity) {
        if (!TextUtils.isEmpty(notificationContentEntity.m47931l())) {
            return BitmapFactory.decodeFile(notificationContentEntity.m47931l());
        }
        if (notificationContentEntity.m47930m() != 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), notificationContentEntity.m47930m());
            if (decodeResource != null) {
                return decodeResource;
            }
            if (!TextUtils.isEmpty(notificationContentEntity.m47929n())) {
                return BitmapFactory.decodeResource(context.getResources(), C32857k.m25681b(context, notificationContentEntity.m47929n()));
            }
            return null;
        }
        return null;
    }

    /* renamed from: b */
    public static Bitmap m1896b(Context context, NotificationContentEntity notificationContentEntity) {
        if (!TextUtils.isEmpty(notificationContentEntity.m47927p())) {
            return BitmapFactory.decodeFile(notificationContentEntity.m47927p());
        }
        if (notificationContentEntity.m47926q() != 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), notificationContentEntity.m47926q());
            if (decodeResource != null) {
                return decodeResource;
            }
            if (!TextUtils.isEmpty(notificationContentEntity.m47925r())) {
                return BitmapFactory.decodeResource(context.getResources(), C32857k.m25681b(context, notificationContentEntity.m47925r()));
            }
            return null;
        }
        return null;
    }

    /* renamed from: c */
    public static Notification m1895c(Context context, LocalPushData localPushData, ChannelData channelData) {
        NotificationContentEntity notificationContentEntity;
        Notification m14662c;
        if (localPushData.m2674b() == null || (notificationContentEntity = localPushData.m2674b().get(localPushData.m2673c())) == null) {
            return null;
        }
        String m2670f = localPushData.m2670f();
        String str = "void";
        if (!localPushData.m2673c().startsWith("void")) {
            str = localPushData.m2673c();
        }
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.putExtra("hms_source", "push");
        launchIntentForPackage.putExtra("hms_type", "local");
        launchIntentForPackage.putExtra("local_push_notification_id", localPushData.m2671e().m2321f());
        launchIntentForPackage.putExtra("local_push_event_id", m2670f);
        launchIntentForPackage.putExtra("local_push_content_id", str);
        launchIntentForPackage.putExtra("local_push_content_data", notificationContentEntity);
        launchIntentForPackage.putExtra("hms_push_click_intent", true);
        launchIntentForPackage.putExtra("hms_push_click_disposable_key", true);
        launchIntentForPackage.setFlags(270532608);
        Map<String, String> m2672d = localPushData.m2672d();
        if (m2672d != null && !m2672d.isEmpty()) {
            Bundle bundle = new Bundle();
            for (String str2 : m2672d.keySet()) {
                bundle.putString(str2, m2672d.get(str2));
            }
            launchIntentForPackage.putExtra("local_push_extension_key", bundle);
        }
        PendingIntent m2959d = AlarmUtils.m2959d(context, localPushData.m2671e().m2321f(), launchIntentForPackage, 134217728);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelData.m15378a());
        if (LocalNotificationManager.m1903a().m1902b() != null) {
            builder.setSmallIcon(LocalNotificationManager.m1903a().m1902b().intValue());
        }
        if (!TextUtils.isEmpty(LocalNotificationManager.m1903a().m1901c())) {
            builder.setColor(Color.parseColor(LocalNotificationManager.m1903a().m1901c()));
        }
        if (channelData.m15377b() != null && Build.VERSION.SDK_INT < 26) {
            builder.setSound(channelData.m15377b());
        }
        if (notificationContentEntity.m47919x()) {
            builder.setVibrate(DefaultDisplayNotification.DEFAULT_VIBRATION_PATTERN);
        }
        if (notificationContentEntity.m47920w()) {
            builder.setFullScreenIntent(AlarmUtils.m2959d(context, localPushData.m2671e().m2321f(), FullScreenIntentManager.get().getIntent(context, launchIntentForPackage, localPushData), 134217728), true).setPriority(1);
        }
        if (CustomNotificationManager.m14664a().m14663b("local", localPushData) && (m14662c = CustomNotificationManager.m14664a().m14662c("local", localPushData, context, builder, m2959d)) != null) {
            return m14662c;
        }
        Bitmap m1896b = m1896b(context, notificationContentEntity);
        Bitmap m1897a = m1897a(context, notificationContentEntity);
        if (m1897a != null) {
            builder.setStyle(new NotificationCompat.BigPictureStyle().setBigContentTitle(notificationContentEntity.m47922u()).setSummaryText(notificationContentEntity.m47933j()).bigPicture(m1897a));
            if (m1896b == null) {
                m1896b = m1897a;
            }
        } else {
            NotificationCompat.BigTextStyle bigTextStyle = new NotificationCompat.BigTextStyle();
            bigTextStyle.bigText(notificationContentEntity.m47933j()).setBigContentTitle(notificationContentEntity.m47922u());
            builder.setStyle(bigTextStyle);
        }
        builder.setTicker(notificationContentEntity.m47922u()).setContentTitle(notificationContentEntity.m47922u()).setLargeIcon(m1896b).setContentIntent(m2959d).setContentText(notificationContentEntity.m47933j()).setAutoCancel(true);
        return builder.build();
    }
}
