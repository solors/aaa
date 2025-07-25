package com.apm.insight.p121d;

import android.content.Context;
import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import com.apm.insight.NpthBus;
import com.apm.insight.entity.CrashBody;
import com.apm.insight.p119b.LooperMonitor;
import com.apm.insight.p129k.CrashUploadManager;
import com.apm.insight.p130l.App;
import com.apm.insight.runtime.NpthHandlerThread;
import com.apm.insight.runtime.p131a.CrashContextAssembly;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.d.a */
/* loaded from: classes2.dex */
public final class DartCrash {

    /* renamed from: a */
    public String f3703a;

    /* renamed from: b */
    public long f3704b;

    /* renamed from: a */
    public static void m102032a(String str, @Nullable Map<? extends String, ? extends String> map, @Nullable Map<String, String> map2, @Nullable LooperMonitor.InterfaceC3784a interfaceC3784a) {
        m102031a(str, map, map2, null, interfaceC3784a);
    }

    /* renamed from: b */
    public static DartCrash m102030b(String str) {
        DartCrash dartCrash = new DartCrash();
        dartCrash.f3703a = str;
        dartCrash.f3704b = System.currentTimeMillis();
        return dartCrash;
    }

    /* renamed from: a */
    public static void m102031a(final String str, @Nullable final Map<? extends String, ? extends String> map, @Nullable final Map<String, String> map2, @Nullable final Map<String, String> map3, @Nullable final LooperMonitor.InterfaceC3784a interfaceC3784a) {
        final long currentTimeMillis = System.currentTimeMillis();
        try {
            NpthHandlerThread.m101339a().m101309a(new Runnable() { // from class: com.apm.insight.d.a.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        Context m102011g = NpthBus.m102011g();
                        long j = currentTimeMillis;
                        String str2 = str;
                        CrashBody crashBody = new CrashBody();
                        crashBody.m101960a("is_dart", (Object) 1);
                        crashBody.m101960a("crash_time", Long.valueOf(j));
                        crashBody.m101960a("process_name", (Object) App.m101754d(m102011g));
                        crashBody.m101960a("data", (Object) str2);
                        App.m101758a(m102011g, crashBody.m101944c());
                        CrashBody m101441a = CrashContextAssembly.m101443a().m101441a(CrashType.DART, crashBody);
                        if (map != null) {
                            JSONObject optJSONObject = m101441a.m101944c().optJSONObject("custom");
                            if (optJSONObject == null) {
                                optJSONObject = new JSONObject();
                            }
                            CrashBody.m101952a(optJSONObject, map);
                            m101441a.m101960a("custom", optJSONObject);
                        }
                        if (map2 != null) {
                            JSONObject optJSONObject2 = m101441a.m101944c().optJSONObject("custom_long");
                            if (optJSONObject2 == null) {
                                optJSONObject2 = new JSONObject();
                            }
                            CrashBody.m101952a(optJSONObject2, map2);
                            m101441a.m101960a("custom_long", optJSONObject2);
                        }
                        if (map3 != null) {
                            JSONObject optJSONObject3 = m101441a.m101944c().optJSONObject("filters");
                            if (optJSONObject3 == null) {
                                optJSONObject3 = new JSONObject();
                                m101441a.m101960a("filters", optJSONObject3);
                            }
                            CrashBody.m101952a(optJSONObject3, map3);
                        }
                        CrashUploadManager.m101821a().m101820a(m101441a.m101944c());
                    } catch (Throwable unused) {
                    }
                }
            });
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m102033a(String str) {
        m102032a(str, null, null, null);
    }
}
