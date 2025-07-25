package p663f3;

import com.helpshift.log.HSLogger;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p710i3.UserManager;
import p752k3.SafeWrappedRunnable;

/* renamed from: f3.d */
/* loaded from: classes5.dex */
public class PollerController {

    /* renamed from: a */
    private FetchNotificationUpdate f90303a;

    /* renamed from: b */
    private ScheduledThreadPoolExecutor f90304b;

    /* renamed from: c */
    private ExponentialBackoff f90305c;

    /* renamed from: d */
    private UserManager f90306d;

    /* renamed from: e */
    private boolean f90307e;

    /* renamed from: f */
    private boolean f90308f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PollerController.java */
    /* renamed from: f3.d$a */
    /* loaded from: classes5.dex */
    public class RunnableC33079a implements Runnable {
        RunnableC33079a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            PollerController.this.m24948d(PollerController.this.f90303a.m24952a("sdkx_polling", PollerController.this.f90306d.m23193q()));
        }
    }

    public PollerController(FetchNotificationUpdate fetchNotificationUpdate, UserManager userManager, ExponentialBackoff exponentialBackoff, ScheduledThreadPoolExecutor scheduledThreadPoolExecutor) {
        this.f90303a = fetchNotificationUpdate;
        this.f90306d = userManager;
        this.f90305c = exponentialBackoff;
        this.f90304b = scheduledThreadPoolExecutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d */
    public void m24948d(int i) {
        if (!this.f90308f && this.f90306d.m23215Z() && i != -1) {
            this.f90305c.m24954b(this.f90306d.m23189u(), this.f90306d.m23188v());
            int m24955a = this.f90305c.m24955a(i);
            if (m24955a == -1) {
                HSLogger.m65441d("PolerCntlr", "Stopping poller, request failed");
                return;
            }
            HSLogger.m65441d("PolerCntlr", "Scheduling next poll with interval: " + m24955a);
            try {
                this.f90304b.schedule(new SafeWrappedRunnable(new RunnableC33079a()), m24955a, TimeUnit.MILLISECONDS);
                return;
            } catch (Exception e) {
                HSLogger.m65438e("PolerCntlr", "Error in scheduling next poll", e);
                return;
            }
        }
        HSLogger.m65441d("PolerCntlr", "Stopping poller, shouldPoll is false or STOP_POLLING received.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m24947e() {
        this.f90308f = false;
        if (!this.f90307e) {
            m24948d(0);
            this.f90307e = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public void m24946f() {
        this.f90308f = true;
        this.f90307e = false;
        this.f90305c.m24953c();
        try {
            this.f90304b.getQueue().clear();
        } catch (Exception e) {
            HSLogger.m65438e("PolerCntlr", "Error in clearing the polling queue.", e);
        }
    }
}
