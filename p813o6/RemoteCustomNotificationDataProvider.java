package p813o6;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import com.meevii.push.data.NotificationBean;
import p636d7.BitMapLoadResult;
import p636d7.DimenUtil;
import p636d7.ImageUtil;
import p636d7.PushShowUnusualUtil;
import p799n6.CustomNotificationData;

/* renamed from: o6.c */
/* loaded from: classes5.dex */
public class RemoteCustomNotificationDataProvider implements ICustomNotificationDataProvider<NotificationBean> {
    @Override // p813o6.ICustomNotificationDataProvider
    /* renamed from: c */
    public CustomNotificationData mo13924b(NotificationBean notificationBean, Context context) {
        float f;
        CustomNotificationData customNotificationData = new CustomNotificationData();
        customNotificationData.m14670o(notificationBean.m47973o());
        customNotificationData.m14667r(notificationBean.m47972p());
        customNotificationData.m14665t(notificationBean.m47970r());
        customNotificationData.m14671n(notificationBean.m47979i());
        customNotificationData.m14674k(notificationBean.m47984c());
        customNotificationData.m14673l(notificationBean.m47981g());
        customNotificationData.m14672m(notificationBean.m47980h());
        BitMapLoadResult m25703e = ImageUtil.m25703e(context, notificationBean.m47983d());
        Bitmap m25714a = m25703e.m25714a();
        customNotificationData.m14669p(m25714a);
        if (m25714a != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f = 48.0f;
            } else {
                f = 64.0f;
            }
            customNotificationData.m14666s(ImageUtil.m25705c(DimenUtil.m25709a(context, f), m25714a));
        } else {
            PushShowUnusualUtil.m25691a(notificationBean.m47976l(), m25703e.m25712c(), m25703e.m25713b());
        }
        Bitmap m25704d = ImageUtil.m25704d(context, notificationBean.m47974n());
        if (m25704d == null) {
            m25704d = ImageUtil.m25707a(context);
        }
        customNotificationData.m14668q(m25704d);
        return customNotificationData;
    }

    @Override // p813o6.ICustomNotificationDataProvider
    /* renamed from: d */
    public boolean mo13925a(NotificationBean notificationBean) {
        String m47973o = notificationBean.m47973o();
        if (!TextUtils.equals("bg_color", m47973o) && !TextUtils.equals("bg_color_btn", m47973o) && !TextUtils.equals("bg_image", m47973o)) {
            return false;
        }
        return true;
    }
}
