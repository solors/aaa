package p1051y2;

import com.helpshift.log.HSLogger;

/* renamed from: y2.a */
/* loaded from: classes5.dex */
public abstract class BaseLifeCycleTracker {

    /* renamed from: b */
    private HSAppLifeCycleEventsHandler f118446b;

    public BaseLifeCycleTracker(HSAppLifeCycleEventsHandler hSAppLifeCycleEventsHandler) {
        this.f118446b = hSAppLifeCycleEventsHandler;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1098a() {
        HSLogger.m65441d("LifecycleTkr", "App is in background");
        this.f118446b.m1093a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m1097b() {
        HSLogger.m65441d("LifecycleTkr", "App is in foreground");
        this.f118446b.m1092b();
    }
}
