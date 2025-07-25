package com.maticoo.sdk.utils.request.network;

import com.maticoo.sdk.utils.crash.CrashUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection;
import com.maticoo.sdk.utils.request.network.connect.HttpConnection;
import com.maticoo.sdk.utils.request.network.connect.HttpsConnection;
import java.net.URL;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public abstract class BaseTask {
    protected AbstractUrlConnection mConnection;
    protected Request mRequest;

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseTask(Request request) {
        try {
            this.mRequest = request;
            String protocol = new URL(request.getUrl()).getProtocol();
            if ("http".equalsIgnoreCase(protocol)) {
                this.mConnection = new HttpConnection();
            } else if ("https".equalsIgnoreCase(protocol)) {
                this.mConnection = new HttpsConnection();
            }
        } catch (Exception e) {
            DeveloperLog.LogD("BaseTask", e);
            CrashUtil.getSingleton().reportSDKException(e);
        }
    }
}
