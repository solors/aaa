package p1023w6;

import com.meevii.push.local.data.p541db.NotificationContentEntity;
import com.meevii.push.local.data.p541db.PushDatabase;
import java.util.ArrayList;
import java.util.List;
import p636d7.PushLogUtil;

/* renamed from: w6.d */
/* loaded from: classes5.dex */
public class PushDaoProxy {
    /* renamed from: a */
    public static void m2350a(PushEntity pushEntity) {
        try {
            PushDatabase.m47914b().mo47912a().mo2333h(pushEntity);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
        }
    }

    /* renamed from: b */
    public static void m2349b(String str) {
        try {
            PushDatabase.m47914b().mo47912a().mo2338c(str);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
        }
    }

    /* renamed from: c */
    public static PushEntity m2348c(int i) {
        try {
            return PushDatabase.m47914b().mo47912a().mo2334g(i);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return null;
        }
    }

    /* renamed from: d */
    public static PushEntity m2347d(String str) {
        try {
            return PushDatabase.m47914b().mo47912a().query(str);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return null;
        }
    }

    /* renamed from: e */
    public static List<PushEntity> m2346e() {
        try {
            return PushDatabase.m47914b().mo47912a().mo2340a();
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return new ArrayList();
        }
    }

    /* renamed from: f */
    public static NotificationContentEntity m2345f(String str) {
        try {
            return PushDatabase.m47914b().mo47912a().mo2336e(str);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return null;
        }
    }

    /* renamed from: g */
    public static List<PushEntity> m2344g() {
        try {
            return PushDatabase.m47914b().mo47912a().mo2335f();
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return new ArrayList();
        }
    }

    /* renamed from: h */
    public static long m2343h(PushEntity pushEntity) {
        try {
            return PushDatabase.m47914b().mo47912a().mo2332i(pushEntity);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
            return -1L;
        }
    }

    /* renamed from: i */
    public static void m2342i(List<PushEntity> list) {
        try {
            PushDatabase.m47914b().mo47912a().mo2337d(list);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
        }
    }

    /* renamed from: j */
    public static void m2341j(List<NotificationContentEntity> list) {
        try {
            PushDatabase.m47914b().mo47912a().mo2339b(list);
        } catch (Throwable th) {
            PushLogUtil.m25696c(th);
        }
    }
}
