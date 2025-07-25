package com.fyber.inneractive.sdk.util;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.amazon.device.ads.DtbConstants;
import com.fyber.inneractive.sdk.config.AbstractC14392k;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.network.C14689X;
import com.fyber.inneractive.sdk.network.C14700e;
import com.fyber.inneractive.sdk.network.C14702f;
import com.fyber.inneractive.sdk.network.RunnableC14696c;
import java.lang.ref.WeakReference;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.util.c0 */
/* loaded from: classes4.dex */
public final class HandlerC15440c0 extends Handler {

    /* renamed from: a */
    public final WeakReference f30588a;

    public HandlerC15440c0(Looper looper, C14702f c14702f) {
        super(looper);
        this.f30588a = new WeakReference(c14702f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v20, types: [org.json.JSONObject] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        String str;
        String str2;
        super.handleMessage(message);
        InterfaceC15442d0 interfaceC15442d0 = (InterfaceC15442d0) AbstractC15471s.m76459a(this.f30588a);
        if (interfaceC15442d0 != null) {
            C14702f c14702f = (C14702f) interfaceC15442d0;
            int i = message.what;
            if (i == 12312329 || i == 20150330) {
                if (c14702f.f27870f && c14702f.f27865a.size() > 0) {
                    while (true) {
                        str = null;
                        if (c14702f.f27865a.size() <= 0) {
                            break;
                        }
                        try {
                            str = (JSONObject) c14702f.f27865a.poll();
                        } catch (Throwable unused) {
                        }
                        if (str != null) {
                            c14702f.f27866b.put(str);
                        }
                    }
                    if (c14702f.f27866b.length() > 0) {
                        JSONArray jSONArray = c14702f.f27866b;
                        int i2 = AbstractC14392k.f27223a;
                        String property = System.getProperty("ia.testEnvironmentConfiguration.name");
                        if (TextUtils.isEmpty(property)) {
                            str2 = DtbConstants.HTTPS + IAConfigManager.f27060O.f27085i.f27109f;
                        } else if (Pattern.compile("^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\.([01]?\\d\\d?|2[0-4]\\d|25[0-5])$").matcher(property).matches()) {
                            str2 = DtbConstants.HTTPS + property + "/simpleM2M/Event";
                        } else {
                            str2 = DtbConstants.HTTPS + property + ".inner-active.mobi/simpleM2M/Event";
                        }
                        long currentTimeMillis = System.currentTimeMillis();
                        try {
                            str = jSONArray.toString();
                        } catch (Throwable unused2) {
                        }
                        if (str != null) {
                            IAConfigManager.f27060O.f27095s.m77724b(new C14689X(new C14700e(str2, jSONArray, currentTimeMillis), str2, str));
                        }
                        c14702f.f27866b = new JSONArray();
                    }
                }
                HandlerC15440c0 handlerC15440c0 = c14702f.f27868d;
                if (handlerC15440c0 != null) {
                    handlerC15440c0.removeMessages(12312329);
                    long j = c14702f.f27869e * 1000;
                    HandlerC15440c0 handlerC15440c02 = c14702f.f27868d;
                    if (handlerC15440c02 != null) {
                        handlerC15440c02.post(new RunnableC14696c(c14702f, 12312329, j));
                    }
                }
            }
        }
    }
}
