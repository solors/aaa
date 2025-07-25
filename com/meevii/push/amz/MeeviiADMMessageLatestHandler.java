package com.meevii.push.amz;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.messaging.ADMMessageHandlerJobBase;
import com.ironsource.C21114v8;
import p636d7.PushLogUtil;
import p755k6.PushSdk;
import p755k6.RemotePushManager;
import p844q6.DataManager;

/* loaded from: classes4.dex */
public class MeeviiADMMessageLatestHandler extends ADMMessageHandlerJobBase {
    protected void onMessage(Context context, Intent intent) {
        RemotePushManager.m18148d().m18142j(intent);
    }

    protected void onRegistered(Context context, String str) {
        PushLogUtil.m25698a("ADMMessageLatestHandler: onRegistered :[" + str + C21114v8.C21123i.f54139e);
        if (!PushSdk.m18190l()) {
            PushLogUtil.m25698a("ADMMessageLatestHandler: onRegistered : sdk not init.");
            return;
        }
        RemotePushManager.m18148d().m18139m(DataManager.m12928g().m12924k(), str);
        PushLogUtil.m25698a("ADMMessageLatestHandler onRegistered newRegistrationId:" + str);
    }

    protected void onRegistrationError(Context context, String str) {
        PushLogUtil.m25697b("ADMMessageLatestHandler onRegistrationError error_id:" + str);
    }

    protected void onUnregistered(Context context, String str) {
        PushLogUtil.m25698a("ADMMessageLatestHandler onUnregistered registrationId:" + str);
    }
}
