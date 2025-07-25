package com.inmobi.media;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.ironsource.C20747r8;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.a4 */
/* loaded from: classes6.dex */
public final class HandlerC19199a4 extends Handler {

    /* renamed from: a */
    public boolean f48065a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC19199a4(Looper looper) {
        super(looper);
        Intrinsics.checkNotNullParameter(looper, "looper");
    }

    @Override // android.os.Handler
    public final void handleMessage(Message msg) {
        WifiManager wifiManager;
        Intrinsics.checkNotNullParameter(msg, "msg");
        int i = msg.what;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    Intrinsics.checkNotNullExpressionValue("b4", "access$getTAG$cp(...)");
                    return;
                }
                Intrinsics.checkNotNullExpressionValue("b4", "access$getTAG$cp(...)");
                if (this.f48065a) {
                    sendEmptyMessage(2);
                    return;
                }
                C19012Lc c19012Lc = C19012Lc.f47446a;
                C19012Lc.f47447b = C18954Ha.m61068d();
                Looper myLooper = Looper.myLooper();
                synchronized (c19012Lc) {
                    if (C19012Lc.f47448c == null) {
                        Context m61068d = C18954Ha.m61068d();
                        if (m61068d != null) {
                            Object systemService = m61068d.getSystemService(C20747r8.f52730b);
                            if (systemService instanceof WifiManager) {
                                wifiManager = (WifiManager) systemService;
                            } else {
                                wifiManager = null;
                            }
                            if (wifiManager != null && wifiManager.isWifiEnabled()) {
                                Intrinsics.m17074g(myLooper);
                                Handler handler = new Handler(myLooper);
                                C19012Lc.f47448c = handler;
                                handler.postDelayed(C19012Lc.f47452g, 10000L);
                                if (!C19012Lc.f47449d) {
                                    C19012Lc.f47449d = true;
                                    Context context = C19012Lc.f47447b;
                                    if (context != null) {
                                        context.registerReceiver(C19012Lc.f47453h, C19012Lc.f47450e, null, C19012Lc.f47448c);
                                    }
                                }
                                wifiManager.startScan();
                            }
                        }
                    }
                }
                sendEmptyMessageDelayed(3, C19037Na.m60852a().getSampleInterval() * 1000);
                return;
            }
            Intrinsics.checkNotNullExpressionValue("b4", "access$getTAG$cp(...)");
            removeMessages(3);
            return;
        }
        Intrinsics.checkNotNullExpressionValue("b4", "access$getTAG$cp(...)");
        sendEmptyMessage(3);
    }
}
