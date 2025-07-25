package p813o6;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.text.TextUtils;
import com.meevii.push.local.data.p541db.NotificationContentEntity;
import p1010v6.LocalPushData;
import p1039x6.LocalNotificationProvider;
import p636d7.C32857k;
import p636d7.DimenUtil;
import p636d7.ImageUtil;
import p799n6.CustomNotificationData;

/* renamed from: o6.b */
/* loaded from: classes5.dex */
public class LocalCustomNotificationDataProvider implements ICustomNotificationDataProvider<LocalPushData> {
    /* renamed from: c */
    public static Bitmap m13928c(Context context, NotificationContentEntity notificationContentEntity) {
        if (!TextUtils.isEmpty(notificationContentEntity.m47938d())) {
            return BitmapFactory.decodeFile(notificationContentEntity.m47938d());
        }
        if (notificationContentEntity.m47937f() != 0) {
            Bitmap decodeResource = BitmapFactory.decodeResource(context.getResources(), notificationContentEntity.m47937f());
            if (decodeResource != null) {
                return decodeResource;
            }
            if (!TextUtils.isEmpty(notificationContentEntity.m47936g())) {
                return BitmapFactory.decodeResource(context.getResources(), C32857k.m25681b(context, notificationContentEntity.m47936g()));
            }
            return null;
        }
        return null;
    }

    @Override // p813o6.ICustomNotificationDataProvider
    /* renamed from: d */
    public CustomNotificationData mo13924b(LocalPushData localPushData, Context context) {
        float f;
        CustomNotificationData customNotificationData = new CustomNotificationData();
        if (localPushData.m2674b() == null) {
            return customNotificationData;
        }
        NotificationContentEntity notificationContentEntity = localPushData.m2674b().get(localPushData.m2673c());
        if (notificationContentEntity == null) {
            return customNotificationData;
        }
        customNotificationData.m14667r(localPushData.m2671e().m2321f());
        customNotificationData.m14670o(notificationContentEntity.m47928o());
        customNotificationData.m14665t(notificationContentEntity.m47922u());
        customNotificationData.m14671n(notificationContentEntity.m47933j());
        customNotificationData.m14674k(notificationContentEntity.m47939c());
        customNotificationData.m14673l(notificationContentEntity.m47935h());
        customNotificationData.m14672m(notificationContentEntity.m47934i());
        Bitmap m13928c = m13928c(context, notificationContentEntity);
        customNotificationData.m14669p(m13928c);
        if (m13928c != null) {
            if (Build.VERSION.SDK_INT >= 31) {
                f = 48.0f;
            } else {
                f = 64.0f;
            }
            customNotificationData.m14666s(ImageUtil.m25705c(DimenUtil.m25709a(context, f), m13928c));
        }
        Bitmap m1896b = LocalNotificationProvider.m1896b(context, notificationContentEntity);
        if (m1896b == null) {
            m1896b = ImageUtil.m25707a(context);
        }
        customNotificationData.m14668q(m1896b);
        return customNotificationData;
    }

    @Override // p813o6.ICustomNotificationDataProvider
    /* renamed from: e */
    public boolean mo13925a(LocalPushData localPushData) {
        NotificationContentEntity notificationContentEntity;
        if (localPushData.m2674b() == null || (notificationContentEntity = localPushData.m2674b().get(localPushData.m2673c())) == null) {
            return false;
        }
        String m47928o = notificationContentEntity.m47928o();
        if (!TextUtils.equals("bg_color", m47928o) && !TextUtils.equals("bg_color_btn", m47928o) && !TextUtils.equals("bg_image", m47928o)) {
            return false;
        }
        return true;
    }
}
