package com.taurusx.tax.p583c.p588d;

import android.util.Log;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p583c.p588d.C28285b;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.d.a */
/* loaded from: classes7.dex */
public class RunnableC28284a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C28285b f73466a;

    public RunnableC28284a(C28285b c28285b) {
        this.f73466a = c28285b;
    }

    @Override // java.lang.Runnable
    public void run() {
        C28285b c28285b = this.f73466a;
        C28285b.InterfaceC28286a interfaceC28286a = c28285b.f73468b;
        C28285b.InterfaceC28286a.EnumC28287a enumC28287a = ((C28288c) interfaceC28286a).f73470a;
        if (enumC28287a == C28285b.InterfaceC28286a.EnumC28287a.GET) {
            try {
                String str = ((C28288c) interfaceC28286a).f73471b;
                String str2 = c28285b.f73467a;
                StringBuilder sb2 = new StringBuilder();
                StringFogImpl stringFogImpl = C28162a.f73047a;
                sb2.append(stringFogImpl.m23824a(new byte[]{-8, -101, -37, -111, -24, -44, -18, -111, -19, -127, -7, -121, -24, -95, -18, -104, -68, -99, -17, -44}, new byte[]{-100, -12}));
                sb2.append(str);
                Log.d(str2, sb2.toString());
                HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                httpURLConnection.setRequestMethod(stringFogImpl.m23824a(new byte[]{Byte.MAX_VALUE, -90, 108}, new byte[]{56, -29}));
                httpURLConnection.setConnectTimeout(((C28288c) c28285b.f73468b).f73474e * 1000);
                Map map = ((C28288c) c28285b.f73468b).f73473d;
                if (map != null && !map.isEmpty()) {
                    for (String str3 : map.keySet()) {
                        httpURLConnection.setRequestProperty(str3, (String) map.get(str3));
                    }
                }
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                if (responseCode >= 200 && responseCode < 400) {
                    ((C28288c) c28285b.f73468b).m38317a(httpURLConnection, true);
                } else {
                    ((C28288c) c28285b.f73468b).m38317a(httpURLConnection, false);
                }
            } catch (Error | Exception e) {
                e.printStackTrace();
                c28285b.m38318b(null);
            }
        } else if (enumC28287a == C28285b.InterfaceC28286a.EnumC28287a.POST) {
            C28285b.m38321a(c28285b);
        }
    }
}
