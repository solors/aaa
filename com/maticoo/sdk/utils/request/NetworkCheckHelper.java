package com.maticoo.sdk.utils.request;

import com.maticoo.sdk.p405ad.utils.AdsUtil;
import com.maticoo.sdk.utils.ApplicationUtil;
import com.maticoo.sdk.utils.log.DeveloperLog;
import com.maticoo.sdk.utils.request.network.AdRequest;
import com.maticoo.sdk.utils.request.network.Request;
import com.maticoo.sdk.utils.request.network.Response;

/* loaded from: classes6.dex */
public class NetworkCheckHelper {
    private static final String check_url = "https://www.google.com";

    /* loaded from: classes6.dex */
    private static final class Holder {
        private static final NetworkCheckHelper INSTANCE = new NetworkCheckHelper();

        private Holder() {
        }
    }

    public static NetworkCheckHelper getInstance() {
        return Holder.INSTANCE;
    }

    public void check(final String str) {
        AdRequest.get().url(check_url).readTimeout(60000).connectTimeout(60000).callback(new Request.OnRequestCallback() { // from class: com.maticoo.sdk.utils.request.NetworkCheckHelper.1
            @Override // com.maticoo.sdk.utils.request.network.Request.OnRequestCallback
            public void onRequestFailed(String str2) {
                DeveloperLog.LogD("NetworkCheckHelper, onRequestFailed, error = " + str2);
                String str3 = str;
                AdsUtil.reportParseDns(str3, "onRequestFailed, error = " + str2);
            }

            @Override // com.maticoo.sdk.utils.request.network.Request.OnRequestCallback
            public void onRequestSuccess(Response response) {
                if (response == null) {
                    return;
                }
                int code = response.code();
                DeveloperLog.LogD("NetworkCheckHelper, onRequestSuccess, code = " + code);
                String str2 = str;
                AdsUtil.reportParseDns(str2, "onRequestSuccess, code = " + code);
            }
        }).performRequest(ApplicationUtil.getInstance().getApplicationContext());
    }

    private NetworkCheckHelper() {
    }
}
