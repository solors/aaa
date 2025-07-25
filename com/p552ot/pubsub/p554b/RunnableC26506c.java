package com.p552ot.pubsub.p554b;

import android.os.Message;
import android.text.TextUtils;
import com.p552ot.pubsub.p554b.C26502a;
import com.p552ot.pubsub.util.C26586j;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.b.c */
/* loaded from: classes7.dex */
class RunnableC26506c implements Runnable {

    /* renamed from: a */
    final /* synthetic */ JSONObject f69324a;

    /* renamed from: b */
    final /* synthetic */ C26502a f69325b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC26506c(C26502a c26502a, JSONObject jSONObject) {
        this.f69325b = c26502a;
        this.f69324a = jSONObject;
    }

    @Override // java.lang.Runnable
    public void run() {
        String optString;
        int optInt;
        boolean m41417h;
        ConcurrentHashMap concurrentHashMap;
        boolean z;
        C26502a.HandlerC26504b handlerC26504b;
        ConcurrentHashMap concurrentHashMap2;
        ConcurrentHashMap concurrentHashMap3;
        C26586j.m41080a("AppConfigUpdater", "checkAppConfigVersion start");
        JSONArray optJSONArray = this.f69324a.optJSONArray("config");
        if (optJSONArray != null) {
            for (int i = 0; i < optJSONArray.length(); i++) {
                JSONObject optJSONObject = optJSONArray.optJSONObject(i);
                if (optJSONObject == null) {
                    optString = "";
                } else {
                    optString = optJSONObject.optString("appId");
                }
                C26586j.m41080a("AppConfigUpdater", "appId: " + optString);
                if (!TextUtils.isEmpty(optString)) {
                    if (optJSONObject == null) {
                        optInt = 0;
                    } else {
                        optInt = optJSONObject.optInt("version");
                    }
                    int m41389e = C26511h.m41408a().m41389e(optString);
                    m41417h = C26502a.m41417h(optString);
                    concurrentHashMap = C26502a.f69292A;
                    if (concurrentHashMap.containsKey(optString)) {
                        concurrentHashMap3 = C26502a.f69292A;
                        if (((Boolean) concurrentHashMap3.get(optString)).booleanValue()) {
                            z = true;
                            C26586j.m41080a("AppConfigUpdater", "local version: " + m41389e + ", server version: " + optInt + ", canUpdate: " + m41417h + ", isScheduling: " + z);
                            if (optInt > 0 && optInt > m41389e && m41417h && !z) {
                                Message obtain = Message.obtain();
                                obtain.what = 0;
                                obtain.obj = optString;
                                long random = (long) (Math.random() * 1800000.0d);
                                C26586j.m41080a("AppConfigUpdater", "the message will be handled after " + random + " ms");
                                handlerC26504b = C26502a.f69319y;
                                handlerC26504b.sendMessageDelayed(obtain, random);
                                concurrentHashMap2 = C26502a.f69292A;
                                concurrentHashMap2.put(optString, Boolean.TRUE);
                            }
                        }
                    }
                    z = false;
                    C26586j.m41080a("AppConfigUpdater", "local version: " + m41389e + ", server version: " + optInt + ", canUpdate: " + m41417h + ", isScheduling: " + z);
                    if (optInt > 0) {
                        Message obtain2 = Message.obtain();
                        obtain2.what = 0;
                        obtain2.obj = optString;
                        long random2 = (long) (Math.random() * 1800000.0d);
                        C26586j.m41080a("AppConfigUpdater", "the message will be handled after " + random2 + " ms");
                        handlerC26504b = C26502a.f69319y;
                        handlerC26504b.sendMessageDelayed(obtain2, random2);
                        concurrentHashMap2 = C26502a.f69292A;
                        concurrentHashMap2.put(optString, Boolean.TRUE);
                    }
                }
            }
        }
    }
}
