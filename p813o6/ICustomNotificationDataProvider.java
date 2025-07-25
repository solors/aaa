package p813o6;

import android.content.Context;
import com.meevii.push.notification.IDisplayPushData;
import p799n6.CustomNotificationData;

/* renamed from: o6.a */
/* loaded from: classes5.dex */
public interface ICustomNotificationDataProvider<T extends IDisplayPushData> {
    /* renamed from: a */
    boolean mo13925a(T t);

    /* renamed from: b */
    CustomNotificationData mo13924b(T t, Context context);
}
