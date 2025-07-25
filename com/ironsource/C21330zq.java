package com.ironsource;

import android.util.Log;
import com.ironsource.mediationsdk.logger.C20417d;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.server.HttpFunctions;
import com.ironsource.mediationsdk.server.ServerURL;
import org.json.JSONObject;

/* renamed from: com.ironsource.zq */
/* loaded from: classes6.dex */
public class C21330zq {

    /* renamed from: com.ironsource.zq$a */
    /* loaded from: classes6.dex */
    class RunnableC21331a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f54825a;

        /* renamed from: b */
        final /* synthetic */ boolean f54826b;

        /* renamed from: c */
        final /* synthetic */ int f54827c;

        RunnableC21331a(String str, boolean z, int i) {
            this.f54825a = str;
            this.f54826b = z;
            this.f54827c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C21330zq.m53740c(this.f54825a, this.f54826b, this.f54827c);
        }
    }

    /* renamed from: b */
    public static void m53741b(String str, boolean z, int i) {
        Thread thread = new Thread(new RunnableC21331a(str, z, i), "callAsyncRequestURL");
        thread.setUncaughtExceptionHandler(new C20417d());
        thread.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static void m53740c(String str, boolean z, int i) {
        try {
            new JSONObject(HttpFunctions.getStringFromURL(ServerURL.getRequestURL(str, z, i)));
            IronSourceLoggerManager logger = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.NETWORK;
            logger.log(ironSourceTag, "callRequestURL(reqUrl:" + str + ", hit:" + z + ")", 1);
        } catch (Throwable th) {
            C20086i9.m57997d().m58003a(th);
            StringBuilder sb2 = new StringBuilder("callRequestURL(reqUrl:");
            if (str == null) {
                str = "null";
            }
            sb2.append(str);
            sb2.append(", hit:");
            sb2.append(z);
            sb2.append(")");
            IronSourceLoggerManager logger2 = IronSourceLoggerManager.getLogger();
            IronSourceLogger.IronSourceTag ironSourceTag2 = IronSourceLogger.IronSourceTag.NETWORK;
            logger2.log(ironSourceTag2, sb2.toString() + ", e:" + Log.getStackTraceString(th), 0);
        }
    }
}
