package com.apm.insight.runtime.p131a;

import android.content.Context;
import android.os.Process;
import android.os.SystemClock;
import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import com.apm.insight.AttachUserData;
import com.apm.insight.CrashType;
import com.apm.insight.ICommonParams;
import com.apm.insight.NpthBus;
import com.apm.insight.entity.CrashBody;
import com.apm.insight.p130l.App;
import com.apm.insight.p130l.Stack;
import com.apm.insight.p130l.Storage;
import com.maticoo.sdk.utils.constant.KeyConstants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.a.c */
/* loaded from: classes2.dex */
public abstract class BaseAssembly {

    /* renamed from: a */
    protected CrashType f4023a;

    /* renamed from: b */
    protected Context f4024b;

    /* renamed from: c */
    private ICommonParams f4025c = NpthBus.m102029a().m101536c();

    /* renamed from: d */
    private ActivityDataManager f4026d;

    /* renamed from: e */
    private BatteryWatcher f4027e;

    /* compiled from: BaseAssembly.java */
    /* renamed from: com.apm.insight.runtime.a.c$a */
    /* loaded from: classes2.dex */
    public interface InterfaceC3847a {
        /* renamed from: a */
        CrashBody mo101447a(int i, CrashBody crashBody);

        /* renamed from: b */
        CrashBody mo101446b(int i, CrashBody crashBody);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public BaseAssembly(CrashType crashType, Context context, ActivityDataManager activityDataManager, BatteryWatcher batteryWatcher) {
        this.f4023a = crashType;
        this.f4024b = context;
        this.f4026d = activityDataManager;
        this.f4027e = batteryWatcher;
    }

    /* renamed from: a */
    public int mo101436a() {
        return 6;
    }

    /* renamed from: b */
    protected boolean mo101437b() {
        return true;
    }

    /* renamed from: c */
    protected boolean mo101434c() {
        return true;
    }

    /* renamed from: b */
    private CrashBody m101449b(CrashBody crashBody) {
        crashBody.m101966a(NpthBus.m102001q(), NpthBus.m102000r());
        if (NpthBus.m102004n()) {
            crashBody.m101960a("is_mp", (Object) 1);
        }
        try {
            crashBody.m101956a(this.f4025c.getPluginInfo());
        } catch (Throwable th) {
            try {
                HashMap hashMap = new HashMap();
                hashMap.put("Data fetch failed since source misstake:\n" + Stack.m101632a(th), 0);
                crashBody.m101956a(hashMap);
            } catch (Throwable unused) {
            }
        }
        crashBody.m101947b(NpthBus.m102002p());
        crashBody.m101960a("process_name", App.m101754d(NpthBus.m102011g()));
        return crashBody;
    }

    /* renamed from: c */
    private CrashBody m101448c(CrashBody crashBody) {
        ActivityDataManager activityDataManager;
        if (!App.m101755c(NpthBus.m102011g())) {
            crashBody.m101960a("remote_process", (Object) 1);
        }
        crashBody.m101960a(KeyConstants.RequestBody.KEY_PID, Integer.valueOf(Process.myPid()));
        crashBody.m101965a(NpthBus.m102008j());
        if (mo101437b() && (activityDataManager = this.f4026d) != null) {
            crashBody.m101962a(activityDataManager);
        }
        try {
            crashBody.m101957a(this.f4025c.getPatchInfo());
        } catch (Throwable th) {
            try {
                crashBody.m101957a(Arrays.asList("Data fetch failed since source misstake:\n" + Stack.m101632a(th)));
            } catch (Throwable unused) {
            }
        }
        String m102007k = NpthBus.m102007k();
        if (m102007k != null) {
            crashBody.m101960a("business", (Object) m102007k);
        }
        crashBody.m101960a("is_background", Boolean.valueOf(!App.m101759a(this.f4024b)));
        return crashBody;
    }

    /* renamed from: a */
    public CrashBody mo101438a(CrashBody crashBody) {
        return crashBody;
    }

    /* renamed from: a */
    public final CrashBody m101450a(@Nullable CrashBody crashBody, @Nullable InterfaceC3847a interfaceC3847a, boolean z) {
        if (crashBody == null) {
            crashBody = new CrashBody();
        }
        CrashBody crashBody2 = crashBody;
        for (int i = 0; i < mo101436a(); i++) {
            long uptimeMillis = SystemClock.uptimeMillis();
            if (interfaceC3847a != null) {
                try {
                    crashBody2 = interfaceC3847a.mo101447a(i, crashBody2);
                } catch (Throwable unused) {
                }
            }
            try {
                crashBody2 = mo101435a(i, crashBody2);
            } catch (Throwable unused2) {
            }
            if (interfaceC3847a != null) {
                try {
                    mo101436a();
                    crashBody2 = interfaceC3847a.mo101446b(i, crashBody2);
                } catch (Throwable unused3) {
                }
                if (z) {
                    if (i != 0) {
                        crashBody.m101941c(crashBody2.m101944c());
                    } else {
                        crashBody = crashBody2;
                    }
                    crashBody2 = new CrashBody();
                }
            }
            crashBody.m101948b("step_cost_".concat(String.valueOf(i)), String.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
        }
        return mo101438a(crashBody);
    }

    /* renamed from: a */
    public CrashBody mo101435a(int i, CrashBody crashBody) {
        if (crashBody == null) {
            crashBody = new CrashBody();
        }
        if (i != 0) {
            if (i == 1) {
                m101448c(crashBody);
                List<AttachUserData> m102184a = NpthBus.m102020b().m102184a(this.f4023a);
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject = crashBody.m101944c().optJSONObject("custom");
                if (optJSONObject == null) {
                    optJSONObject = new JSONObject();
                    crashBody.m101960a("custom", optJSONObject);
                }
                if (m102184a != null) {
                    for (int i2 = 0; i2 < m102184a.size(); i2++) {
                        try {
                            AttachUserData attachUserData = m102184a.get(i2);
                            long uptimeMillis = SystemClock.uptimeMillis();
                            CrashBody.m101952a(optJSONObject, attachUserData.getUserData(this.f4023a));
                            hashMap.put("custom_cost_" + attachUserData.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis));
                        } catch (Throwable th) {
                            CrashBody.m101953a(optJSONObject, th);
                        }
                    }
                }
                try {
                    optJSONObject.put("fd_count", AppDataCenter.m102149f());
                } catch (Throwable unused) {
                }
                List<AttachUserData> m102162b = NpthBus.m102020b().m102162b(this.f4023a);
                if (m102162b != null) {
                    JSONObject optJSONObject2 = crashBody.m101944c().optJSONObject("custom_long");
                    if (optJSONObject2 == null) {
                        optJSONObject2 = new JSONObject();
                        crashBody.m101960a("custom_long", optJSONObject2);
                    }
                    while (r0 < m102162b.size()) {
                        try {
                            AttachUserData attachUserData2 = m102162b.get(r0);
                            long uptimeMillis2 = SystemClock.uptimeMillis();
                            CrashBody.m101952a(optJSONObject2, attachUserData2.getUserData(this.f4023a));
                            hashMap.put("custom_cost_" + attachUserData2.getClass().getName() + "_" + hashMap.size(), Long.valueOf(SystemClock.uptimeMillis() - uptimeMillis2));
                        } catch (Throwable th2) {
                            CrashBody.m101953a(optJSONObject2, th2);
                        }
                        r0++;
                    }
                }
                for (Map.Entry entry : hashMap.entrySet()) {
                    try {
                        optJSONObject.put((String) entry.getKey(), entry.getValue());
                    } catch (Throwable unused2) {
                    }
                }
            } else if (i != 2) {
                if (i == 5 && mo101434c()) {
                    crashBody.m101946b(Storage.m101614a());
                }
            } else {
                BatteryWatcher batteryWatcher = this.f4027e;
                crashBody.m101960a(KeyConstants.RequestBody.KEY_BATTERY, Integer.valueOf(batteryWatcher != null ? batteryWatcher.m101445a() : 0));
                crashBody.m101942c(NpthBus.m102020b().m102186a());
            }
        } else {
            m101449b(crashBody);
        }
        return crashBody;
    }
}
