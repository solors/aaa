package com.mbridge.msdk.tracker;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.HashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.tracker.t */
/* loaded from: classes6.dex */
public class ReportMonitor {

    /* renamed from: d */
    private static volatile ReportMonitor f59906d;

    /* renamed from: b */
    private MBridgeTrackManager f59908b;

    /* renamed from: c */
    private TrackConfig f59909c;

    /* renamed from: e */
    private volatile boolean f59910e = false;

    /* renamed from: f */
    private int f59911f = 30000;

    /* renamed from: g */
    private final HashMap<String, String> f59912g = new HashMap<>();

    /* renamed from: a */
    Handler f59907a = new Handler(Looper.getMainLooper()) { // from class: com.mbridge.msdk.tracker.t.1
        {
            ReportMonitor.this = this;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what == 1) {
                try {
                    ReportMonitor.this.m49327c();
                    ReportMonitor.this.f59907a.removeMessages(1);
                    ReportMonitor.this.m49326d();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    };

    private ReportMonitor() {
    }

    /* renamed from: d */
    public void m49326d() {
        try {
            this.f59907a.sendEmptyMessageDelayed(1, this.f59911f);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    public final synchronized void m49328b() {
        if (this.f59910e) {
            return;
        }
        this.f59910e = true;
        m49326d();
    }

    /* renamed from: c */
    public final void m49327c() {
        MBridgeTrackManager[] m49530d = MBridgeTrackManager.m49530d();
        if (m49530d.length == 0) {
            return;
        }
        try {
            for (MBridgeTrackManager mBridgeTrackManager : m49530d) {
                String m49532c = mBridgeTrackManager.m49532c();
                if (!"monitor".equals(m49532c)) {
                    String m49534b = mBridgeTrackManager.m49534b();
                    long[] m49526h = mBridgeTrackManager.m49526h();
                    long j = m49526h[1];
                    if (j != 0) {
                        long j2 = m49526h[0];
                        if (this.f59912g.containsKey(m49532c)) {
                            if ((j2 + "").equals(this.f59912g.get(m49532c))) {
                            }
                        }
                        this.f59912g.put(m49532c, j2 + "");
                        if (this.f59908b != null) {
                            try {
                                C22885e c22885e = new C22885e("event_lib_monitor");
                                c22885e.m49598b(1);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("key", "m_report_rate");
                                jSONObject.put("task_name", m49532c);
                                jSONObject.put("task_count", j);
                                jSONObject.put("task_session_id", m49534b);
                                jSONObject.put("task_ts", j2);
                                c22885e.m49601a(jSONObject);
                                this.f59908b.m49540a(c22885e);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }
                        }
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m49330a(Context context, TrackConfig trackConfig, int i, JSONObject jSONObject) {
        this.f59909c = trackConfig;
        this.f59911f = i;
        MBridgeTrackManager m49536a = MBridgeTrackManager.m49536a("monitor", context, trackConfig);
        this.f59908b = m49536a;
        if (m49536a != null) {
            m49536a.m49535a(jSONObject);
            this.f59908b.m49541a();
        }
        m49328b();
    }

    /* renamed from: a */
    public static ReportMonitor m49331a() {
        if (f59906d == null) {
            synchronized (ReportMonitor.class) {
                if (f59906d == null) {
                    f59906d = new ReportMonitor();
                }
            }
        }
        return f59906d;
    }
}
