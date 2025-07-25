package p797n4;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.WorkerThread;
import com.learnings.learningsanalyze.repository.database.Database;
import com.p552ot.pubsub.p559g.C26542f;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;
import p770l4.LearningsAnalytics;
import p842q4.EventEntity;
import p858r4.SharedPreferencesManager;
import p979t4.EventSender;
import p992u3.NetworkUtils;
import p993u4.C44432k;
import p993u4.C44433l;

/* compiled from: EventManager.java */
/* renamed from: n4.c */
/* loaded from: classes6.dex */
public class C38423c {

    /* renamed from: a */
    private static long f101767a;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: EventManager.java */
    /* renamed from: n4.c$b */
    /* loaded from: classes6.dex */
    public static class C38425b {

        /* renamed from: a */
        private static final C38423c f101768a = new C38423c();
    }

    private C38423c() {
    }

    /* renamed from: b */
    public static long m14718b() {
        return f101767a;
    }

    /* renamed from: c */
    public static C38423c m14717c() {
        return C38425b.f101768a;
    }

    /* renamed from: a */
    public void m14719a() {
        Database.m53666d().mo53662c().mo13310g(LearningsAnalytics.m15694i().m15690m() - 259200000);
    }

    /* renamed from: d */
    public void m14716d(Context context) {
        f101767a = SharedPreferencesManager.m12681b().m12680c(context, "meevii_analyze", "key_event_num", f101767a);
    }

    @WorkerThread
    /* renamed from: e */
    public void m14715e(String str, Bundle bundle) {
        JSONObject m3000a = C44432k.m3000a(bundle);
        String uuid = UUID.randomUUID().toString();
        try {
            m3000a.put(C26542f.C26543a.f69514l, str);
            m3000a.put("analytics_event_num", String.valueOf(f101767a));
            m3000a.put("network_status", NetworkUtils.m3038c(LearningsAnalytics.m15694i().m15696g()));
        } catch (JSONException e) {
            C44433l.m2992f(e);
        }
        f101767a++;
        synchronized (PackageManager.f101769d) {
            EventEntity eventEntity = new EventEntity();
            eventEntity.m12990f(m3000a.toString());
            eventEntity.m12989g(uuid);
            eventEntity.m12988h(System.currentTimeMillis());
            eventEntity.m12991e(PackageManager.m14710c().m14711b());
            if (C44433l.m2994d()) {
                C44433l.m2997a("EventManager", "add event to dataBase event = " + eventEntity);
            }
            if (Database.m53666d().mo53662c().mo13316a(eventEntity) <= 0) {
                C44433l.m2996b("EventManager", "Insert event failed.");
            }
            PackageManager.m14710c().m14712a();
        }
    }

    @WorkerThread
    /* renamed from: f */
    public void m14714f(boolean z) {
        if (z) {
            EventSender.m3267g().m3258p();
        } else {
            EventSender.m3267g().m3259o();
        }
    }
}
