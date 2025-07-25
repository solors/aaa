package com.meevii.push.amz;

import com.amazon.device.messaging.ADMMessageReceiver;

/* loaded from: classes4.dex */
public class MeeviiAmazonReceiver extends ADMMessageReceiver {
    private static final int JOB_ID = 1000;

    public MeeviiAmazonReceiver() {
        super(MeeviiADMMessageOldHandler.class);
        boolean z;
        try {
            Class.forName("com.amazon.device.messaging.ADMMessageHandlerJobBase");
            z = true;
        } catch (Throwable th) {
            th.printStackTrace();
            z = false;
        }
        if (z) {
            registerJobServiceClass(MeeviiADMMessageLatestHandler.class, 1000);
        }
    }
}
