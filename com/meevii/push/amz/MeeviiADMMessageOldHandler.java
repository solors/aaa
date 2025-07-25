package com.meevii.push.amz;

import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerBase;
import com.ironsource.C21114v8;
import p636d7.PushLogUtil;
import p755k6.PushSdk;
import p755k6.RemotePushManager;
import p844q6.DataManager;

/* loaded from: classes4.dex */
public class MeeviiADMMessageOldHandler extends ADMMessageHandlerBase {
    public MeeviiADMMessageOldHandler(String str) {
        super(str);
    }

    protected void onMessage(Intent intent) {
        RemotePushManager.m18148d().m18142j(intent);
    }

    protected void onRegistered(String str) {
        PushLogUtil.m25698a("ADMMessageOldHandler: onRegistered :[" + str + C21114v8.C21123i.f54139e);
        if (!PushSdk.m18190l()) {
            PushLogUtil.m25698a("ADMMessageOldHandler: onRegistered : sdk not init.");
            return;
        }
        RemotePushManager.m18148d().m18139m(DataManager.m12928g().m12924k(), str);
        PushLogUtil.m25698a("ADMMessageOldHandler onRegistered newRegistrationId:" + str);
    }

    protected void onRegistrationError(String str) {
        PushLogUtil.m25697b("ADMMessageOldHandler onRegistrationError error_id:" + str);
    }

    protected void onUnregistered(String str) {
        PushLogUtil.m25698a("ADMMessageOldHandler onUnregistered registrationId:" + str);
    }

    public MeeviiADMMessageOldHandler() {
        super(MeeviiADMMessageOldHandler.class.getName());
    }
}
