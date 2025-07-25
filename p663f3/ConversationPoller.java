package p663f3;

import com.helpshift.log.HSLogger;
import p710i3.UserManager;

/* renamed from: f3.a */
/* loaded from: classes5.dex */
public class ConversationPoller {

    /* renamed from: a */
    private PollerController f90291a;

    /* renamed from: b */
    private UserManager f90292b;

    public ConversationPoller(PollerController pollerController, UserManager userManager) {
        this.f90291a = pollerController;
        this.f90292b = userManager;
    }

    /* renamed from: a */
    public synchronized void m24957a() {
        boolean m23215Z = this.f90292b.m23215Z();
        boolean m23239B = this.f90292b.m23239B();
        if (m23215Z && !m23239B) {
            HSLogger.m65441d("ConvPolr", "Starting poller.");
            this.f90291a.m24947e();
            return;
        }
        HSLogger.m65441d("ConvPolr", "Not starting poller, shouldPoll: " + m23215Z + ",  push synced: " + m23239B);
    }

    /* renamed from: b */
    public synchronized void m24956b() {
        HSLogger.m65441d("ConvPolr", "Stopping poller.");
        this.f90291a.m24946f();
    }
}
