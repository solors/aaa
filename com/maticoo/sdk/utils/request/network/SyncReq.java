package com.maticoo.sdk.utils.request.network;

import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.connect.AbstractUrlConnection;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public class SyncReq extends BaseTask {
    public SyncReq(Request request) {
        super(request);
    }

    public Response start() {
        String str;
        String str2;
        try {
            if (this.mConnection == null) {
                return null;
            }
            str = this.mRequest.getUrl();
            try {
                return this.mConnection.intercept(this.mRequest);
            } catch (Throwable th) {
                th = th;
                DeveloperLog.LogE("SyncReq, url = " + str, th);
                AbstractUrlConnection abstractUrlConnection = this.mConnection;
                if (abstractUrlConnection != null) {
                    try {
                        abstractUrlConnection.cancel();
                    } catch (Throwable th2) {
                        Request request = this.mRequest;
                        if (request != null) {
                            str2 = request.getUrl();
                        } else {
                            str2 = "";
                        }
                        DeveloperLog.LogE("AsyncReq url:" + str2, th2);
                    }
                }
                return null;
            }
        } catch (Throwable th3) {
            th = th3;
            str = null;
        }
    }
}
