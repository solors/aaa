package p1051y2;

import android.app.Application;

/* renamed from: y2.c */
/* loaded from: classes5.dex */
public class HSAppLifeCycleController {

    /* renamed from: b */
    private static HSAppLifeCycleController f118451b;

    /* renamed from: a */
    private BaseLifeCycleTracker f118452a;

    /* renamed from: a */
    public static HSAppLifeCycleController m1096a() {
        if (f118451b == null) {
            f118451b = new HSAppLifeCycleController();
        }
        return f118451b;
    }

    /* renamed from: b */
    public void m1095b(Application application, boolean z, HSAppLifeCycleEventsHandler hSAppLifeCycleEventsHandler) {
        if (this.f118452a != null) {
            return;
        }
        if (z) {
            this.f118452a = new ManualAppLifeCycleTracker(hSAppLifeCycleEventsHandler);
        } else {
            this.f118452a = new DefaultAppLifeCycleTracker(application, hSAppLifeCycleEventsHandler);
        }
    }

    /* renamed from: c */
    public void m1094c() {
        BaseLifeCycleTracker baseLifeCycleTracker = this.f118452a;
        if (baseLifeCycleTracker == null) {
            return;
        }
        baseLifeCycleTracker.m1097b();
    }
}
