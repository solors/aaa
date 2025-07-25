package p809o2;

import android.app.Application;
import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import p1051y2.HSAppLifeCycleController;
import p1051y2.HSAppLifeCycleEventsHandler;
import p632d3.CoreNotificationManager;
import p693h3.HSPersistentStorage;
import p752k3.ApplicationUtil;
import p752k3.ConfigValues;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: o2.b */
/* loaded from: classes5.dex */
public class HSInstallHelper {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, Object> m13996a(Map<String, Object> map) {
        if (map == null) {
            map = new HashMap<>();
        }
        Map<String, Object> m18262a = ConfigValues.m18262a();
        m18262a.putAll(map);
        return m18262a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static void m13995b(Map<String, Object> map, HSPersistentStorage hSPersistentStorage) {
        boolean z;
        Object obj = map.get("enableInAppNotification");
        if (obj instanceof Boolean) {
            z = ((Boolean) obj).booleanValue();
        } else {
            z = true;
        }
        hSPersistentStorage.m23782Z(z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m13994c(Context context, CoreNotificationManager coreNotificationManager, Map<String, Object> map) {
        String packageName = context.getPackageName();
        Object obj = map.get("notificationChannelId");
        if (obj instanceof String) {
            coreNotificationManager.mo25788e((String) obj);
        }
        Object obj2 = map.get("notificationSoundId");
        if (obj2 instanceof Integer) {
            coreNotificationManager.mo25786g(((Integer) obj2).intValue());
        } else if (obj2 instanceof String) {
            coreNotificationManager.mo25786g(ApplicationUtil.m18269f(context, (String) obj2, "raw", packageName));
        }
        Object obj3 = map.get("notificationIcon");
        if (obj3 instanceof Integer) {
            coreNotificationManager.mo25792a(((Integer) obj3).intValue());
        } else if (obj3 instanceof String) {
            coreNotificationManager.mo25792a(ApplicationUtil.m18269f(context, (String) obj3, "drawable", packageName));
        }
        Object obj4 = map.get("notificationLargeIcon");
        if (obj4 instanceof Integer) {
            coreNotificationManager.mo25791b(((Integer) obj4).intValue());
        } else if (obj4 instanceof String) {
            coreNotificationManager.mo25791b(ApplicationUtil.m18269f(context, (String) obj4, "drawable", packageName));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static void m13993d(Map<String, Object> map, HSPersistentStorage hSPersistentStorage) {
        int i;
        Object obj = map.get("screenOrientation");
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        } else {
            i = -1;
        }
        hSPersistentStorage.m23752o0(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public static void m13992e(Application application, Map<String, Object> map) {
        boolean z;
        Object obj = map.get("manualLifecycleTracking");
        if ((obj instanceof Boolean) && ((Boolean) obj).booleanValue()) {
            z = true;
        } else {
            z = false;
        }
        HSAppLifeCycleController.m1096a().m1095b(application, z, new HSAppLifeCycleEventsHandler());
    }
}
