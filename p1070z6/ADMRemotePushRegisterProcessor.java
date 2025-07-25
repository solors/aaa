package p1070z6;

import com.amazon.device.messaging.ADM;
import p636d7.PushLogUtil;
import p755k6.PushConfigManager;
import p755k6.RemotePushManager;
import p844q6.RequestData;

/* renamed from: z6.a */
/* loaded from: classes5.dex */
public class ADMRemotePushRegisterProcessor implements IRemotePushRegisterProcessor {
    /* renamed from: b */
    private boolean m682b() {
        try {
            Class.forName("com.amazon.device.messaging.ADM");
            return true;
        } catch (Throwable th) {
            PushLogUtil.m25698a("register ADM failed, errorMsg:" + th);
            return false;
        }
    }

    @Override // p1070z6.IRemotePushRegisterProcessor
    /* renamed from: a */
    public void mo677a(RequestData requestData) {
        if (!m682b()) {
            PushLogUtil.m25698a("register ADM failed, ADM not available");
            return;
        }
        ADM adm = new ADM(PushConfigManager.m18207a().m18206b());
        String registrationId = adm.getRegistrationId();
        if (registrationId == null) {
            adm.startRegister();
        } else {
            RemotePushManager.m18148d().m18139m(requestData, registrationId);
        }
    }

    @Override // p1070z6.IRemotePushRegisterProcessor
    public void unregister() {
        if (!m682b()) {
            PushLogUtil.m25698a("unregister ADM failed, ADM not available");
        } else {
            new ADM(PushConfigManager.m18207a().m18206b()).startUnregister();
        }
    }
}
