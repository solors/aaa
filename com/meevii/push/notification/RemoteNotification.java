package com.meevii.push.notification;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.os.Build;
import android.text.TextUtils;
import androidx.browser.customtabs.CustomTabsCallback;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;
import com.meevii.push.data.NotificationBean;
import com.meevii.push.normalfloat.FullScreenIntentManager;
import java.util.Objects;
import net.pubnative.lite.sdk.models.Protocol;
import p1039x6.DefaultDisplayNotification;
import p636d7.BitMapLoadResult;
import p636d7.ImageUtil;
import p636d7.PushShowFailUtil;
import p636d7.PushShowUnusualUtil;
import p772l6.PushEvent;
import p786m6.ChannelData;
import p786m6.ChannelManager;
import p786m6.RemoteChannel;
import p799n6.CustomNotificationManager;
import p844q6.DataManager;
import p995u6.AlarmUtils;

/* renamed from: com.meevii.push.notification.d */
/* loaded from: classes5.dex */
public class RemoteNotification implements IDisplayPush {
    public static final String MEEVII_PUSH_DATA_KEY = "meevii_push_data_msg";
    private final Integer smallIcon;
    private final String smallIconBackgroundColor;

    public RemoteNotification(Integer num) {
        this(num, null);
    }

    protected Notification createNotification(Context context, NotificationBean notificationBean, ChannelData channelData) {
        Notification m14662c;
        int m47972p = notificationBean.m47972p();
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        launchIntentForPackage.putExtra(MEEVII_PUSH_DATA_KEY, notificationBean);
        launchIntentForPackage.putExtra("hms_source", "push");
        launchIntentForPackage.putExtra("hms_type", CustomTabsCallback.ONLINE_EXTRAS_KEY);
        launchIntentForPackage.putExtra("hms_push_click_intent", true);
        launchIntentForPackage.putExtra("hms_push_click_disposable_key", true);
        launchIntentForPackage.setFlags(270532608);
        PendingIntent m2959d = AlarmUtils.m2959d(context, m47972p, launchIntentForPackage, 134217728);
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, channelData.m15378a());
        Integer num = this.smallIcon;
        if (num != null) {
            builder.setSmallIcon(num.intValue());
        }
        if (!TextUtils.isEmpty(this.smallIconBackgroundColor)) {
            builder.setColor(Color.parseColor(this.smallIconBackgroundColor));
        }
        if (channelData.m15377b() != null && Build.VERSION.SDK_INT < 26) {
            builder.setSound(channelData.m15377b());
        }
        if (notificationBean.m47968t()) {
            builder.setVibrate(DefaultDisplayNotification.DEFAULT_VIBRATION_PATTERN);
        }
        if (notificationBean.m47969s()) {
            builder.setFullScreenIntent(AlarmUtils.m2959d(context, m47972p, FullScreenIntentManager.get().getIntent(context, launchIntentForPackage, notificationBean), 134217728), true).setPriority(1);
        }
        if (CustomNotificationManager.m14664a().m14663b(CustomTabsCallback.ONLINE_EXTRAS_KEY, notificationBean) && (m14662c = CustomNotificationManager.m14664a().m14662c(CustomTabsCallback.ONLINE_EXTRAS_KEY, notificationBean, context, builder, m2959d)) != null) {
            return m14662c;
        }
        String m47979i = notificationBean.m47979i();
        String m47970r = notificationBean.m47970r();
        String m47974n = notificationBean.m47974n();
        String m47982f = notificationBean.m47982f();
        if (Objects.equals(notificationBean.m47975m(), Protocol.VAST_1_0_WRAPPER)) {
            Bitmap m25704d = ImageUtil.m25704d(context, m47974n);
            BitMapLoadResult m25703e = ImageUtil.m25703e(context, m47982f);
            Bitmap m25714a = m25703e.m25714a();
            if (m25714a == null) {
                PushShowUnusualUtil.m25691a(notificationBean.m47976l(), m25703e.m25712c(), m25703e.m25713b());
            }
            NotificationCompat.BigPictureStyle bigPicture = new NotificationCompat.BigPictureStyle().setBigContentTitle(m47970r).setSummaryText(m47979i).bigPicture(m25714a);
            if (m25704d == null) {
                m25704d = m25714a;
            }
            builder.setLargeIcon(m25704d).setStyle(bigPicture);
        } else if (Objects.equals(notificationBean.m47975m(), "3")) {
            builder.setLargeIcon(ImageUtil.m25704d(context, m47974n));
        } else if (Objects.equals(notificationBean.m47975m(), "2")) {
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(m47979i).setBigContentTitle(m47970r));
        } else if (Objects.equals(notificationBean.m47975m(), "5")) {
            Bitmap m25704d2 = ImageUtil.m25704d(context, m47974n);
            builder.setStyle(new NotificationCompat.BigTextStyle().bigText(m47979i).setBigContentTitle(m47970r));
            builder.setLargeIcon(m25704d2);
        }
        builder.setContentText(m47979i).setContentTitle(m47970r).setTicker(m47970r).setContentIntent(m2959d).setAutoCancel(true);
        return builder.build();
    }

    protected String getChannelId() {
        return DefaultDisplayNotification.DEFAULT_CHANNEL_ID;
    }

    protected String getChannelName() {
        return DefaultDisplayNotification.DEFAULT_CHANNEL_NAME;
    }

    @Override // com.meevii.push.notification.IDisplayPush
    public boolean isForegroundShow(IDisplayPushData iDisplayPushData) {
        return false;
    }

    @Override // com.meevii.push.notification.IDisplayPush
    public boolean show(Context context, IDisplayPushData iDisplayPushData) {
        String str;
        NotificationBean notificationBean = (NotificationBean) iDisplayPushData;
        if (!DataManager.m12928g().m12920o()) {
            PushShowFailUtil.m25692b(notificationBean.m47976l(), 1002);
            return false;
        }
        NotificationManagerCompat from = NotificationManagerCompat.from(context);
        if (!from.areNotificationsEnabled()) {
            PushShowFailUtil.m25692b(notificationBean.m47976l(), 1001);
            return false;
        }
        Notification createNotification = createNotification(context, notificationBean, ChannelManager.m15375b().m15376a(CustomTabsCallback.ONLINE_EXTRAS_KEY, notificationBean, context, from, getChannelId(), getChannelName()));
        int m47972p = notificationBean.m47972p();
        from.cancel(m47972p);
        from.notify(m47972p, createNotification);
        String m47976l = notificationBean.m47976l();
        if (notificationBean.m47969s()) {
            str = "normal_float";
        } else {
            str = "normal";
        }
        PushEvent.m15657q(m47976l, str, CustomTabsCallback.ONLINE_EXTRAS_KEY, notificationBean.m47978j(), RemoteChannel.m15369e(notificationBean.m47971q()), notificationBean.m47968t(), notificationBean.m47973o());
        return true;
    }

    public RemoteNotification(Integer num, String str) {
        this.smallIcon = num;
        this.smallIconBackgroundColor = str;
    }
}
