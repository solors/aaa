package p1039x6;

import android.app.Application;
import android.content.Context;
import com.meevii.push.notification.IDisplayPush;
import com.meevii.push.notification.IDisplayPushData;
import com.meevii.push.notification.MeeviiNotificationManager;
import p1010v6.LocalPushData;
import p981t6.LocalPushSdk;

/* renamed from: x6.e */
/* loaded from: classes5.dex */
public class LocalNotificationManager {

    /* renamed from: a */
    private Integer f117477a;

    /* renamed from: b */
    private String f117478b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: LocalNotificationManager.java */
    /* renamed from: x6.e$a */
    /* loaded from: classes5.dex */
    public class C44715a implements IDisplayPush {

        /* renamed from: a */
        final /* synthetic */ IDisplayNotification f117479a;

        C44715a(IDisplayNotification iDisplayNotification) {
            this.f117479a = iDisplayNotification;
        }

        @Override // com.meevii.push.notification.IDisplayPush
        public boolean isForegroundShow(IDisplayPushData iDisplayPushData) {
            IDisplayNotification iDisplayNotification = this.f117479a;
            if (iDisplayNotification != null) {
                return iDisplayNotification.isForegroundShow((LocalPushData) iDisplayPushData);
            }
            return false;
        }

        @Override // com.meevii.push.notification.IDisplayPush
        public boolean show(Context context, IDisplayPushData iDisplayPushData) {
            IDisplayNotification iDisplayNotification = this.f117479a;
            if (iDisplayNotification != null) {
                return iDisplayNotification.show((LocalPushData) iDisplayPushData);
            }
            return new DefaultDisplayNotification((Application) context).show((LocalPushData) iDisplayPushData);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: LocalNotificationManager.java */
    /* renamed from: x6.e$b */
    /* loaded from: classes5.dex */
    public static class C44716b {

        /* renamed from: a */
        private static final LocalNotificationManager f117481a = new LocalNotificationManager();
    }

    /* renamed from: a */
    public static LocalNotificationManager m1903a() {
        return C44716b.f117481a;
    }

    /* renamed from: e */
    private void m1899e(IDisplayNotification iDisplayNotification) {
        MeeviiNotificationManager.m47899b().m47900a("local", new C44715a(iDisplayNotification));
    }

    /* renamed from: b */
    public Integer m1902b() {
        return this.f117477a;
    }

    /* renamed from: c */
    public String m1901c() {
        return this.f117478b;
    }

    /* renamed from: d */
    public void m1900d(LocalPushSdk.C44361a c44361a) {
        m1899e(c44361a.m3233c());
        this.f117477a = c44361a.m3232d();
        this.f117478b = c44361a.m3231e();
    }
}
