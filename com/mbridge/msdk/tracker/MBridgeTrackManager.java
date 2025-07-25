package com.mbridge.msdk.tracker;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.tracker.m */
/* loaded from: classes6.dex */
public final class MBridgeTrackManager {

    /* renamed from: b */
    private static final ConcurrentHashMap<String, MBridgeTrackManager> f59706b = new ConcurrentHashMap<>();

    /* renamed from: a */
    private final Global f59707a;

    private MBridgeTrackManager(String str, Context context, TrackConfig trackConfig) {
        Global global = new Global(str, this);
        this.f59707a = global;
        global.m49564a(context);
        global.m49562a(trackConfig);
    }

    /* renamed from: d */
    public static MBridgeTrackManager[] m49530d() {
        ConcurrentHashMap<String, MBridgeTrackManager> concurrentHashMap = f59706b;
        MBridgeTrackManager[] mBridgeTrackManagerArr = new MBridgeTrackManager[concurrentHashMap.size()];
        try {
            int i = 0;
            for (Map.Entry<String, MBridgeTrackManager> entry : concurrentHashMap.entrySet()) {
                mBridgeTrackManagerArr[i] = entry.getValue();
                i++;
            }
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "getAllTrackManager error", e);
            }
        }
        return mBridgeTrackManagerArr;
    }

    /* renamed from: b */
    public final String m49534b() {
        return this.f59707a.m49560b();
    }

    /* renamed from: c */
    public final String m49532c() {
        return this.f59707a.m49559c();
    }

    /* renamed from: e */
    public final boolean m49529e() {
        return !this.f59707a.m49544r();
    }

    /* renamed from: f */
    public final void m49528f() {
        try {
            this.f59707a.m49553i().m49567a(new Runnable() { // from class: com.mbridge.msdk.tracker.m.1
                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        ReportMonitor.m49331a().m49327c();
                        MBridgeTrackManager.this.f59707a.m49547o().m49352b();
                    } catch (Exception e) {
                        if (Common.f59651a) {
                            Log.e("TrackManager", "flush error", e);
                        }
                    }
                }
            });
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "flush error", e);
            }
        }
    }

    /* renamed from: g */
    public final JSONObject m49527g() {
        return this.f59707a.m49556f();
    }

    /* renamed from: h */
    public final long[] m49526h() {
        return this.f59707a.m49554h().mo49360a();
    }

    /* renamed from: i */
    public final void m49525i() {
        this.f59707a.m49543s();
    }

    /* renamed from: b */
    private boolean m49533b(C22885e c22885e) {
        try {
            return m49531c(c22885e);
        } catch (Exception unused) {
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public boolean m49531c(C22885e c22885e) {
        if (C22949y.m49289a(c22885e) || TextUtils.isEmpty(c22885e.m49606a())) {
            return false;
        }
        return this.f59707a.m49563a(c22885e);
    }

    /* renamed from: a */
    public static MBridgeTrackManager m49536a(String str, Context context, TrackConfig trackConfig) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        ConcurrentHashMap<String, MBridgeTrackManager> concurrentHashMap = f59706b;
        MBridgeTrackManager mBridgeTrackManager = concurrentHashMap.get(str);
        if (C22949y.m49289a(mBridgeTrackManager)) {
            MBridgeTrackManager mBridgeTrackManager2 = new MBridgeTrackManager(str, context, trackConfig);
            concurrentHashMap.put(str, mBridgeTrackManager2);
            return mBridgeTrackManager2;
        }
        return mBridgeTrackManager;
    }

    /* renamed from: a */
    public final String m49541a() {
        if (m49529e()) {
            if (Common.f59651a) {
                Log.e("TrackManager", "MBridgeTrackManager is already running");
            }
            return this.f59707a.m49560b();
        }
        return this.f59707a.m49565a();
    }

    /* renamed from: a */
    public final void m49535a(JSONObject jSONObject) {
        this.f59707a.m49561a(jSONObject);
    }

    /* renamed from: a */
    public final boolean m49537a(String str) {
        return m49533b(new C22885e(str));
    }

    /* renamed from: a */
    public final void m49540a(final C22885e c22885e) {
        if (this.f59707a.m49544r()) {
            if (Common.f59651a) {
                Log.d("TrackManager", "SDK is shutdown, track event will not be processed");
                return;
            }
            return;
        }
        try {
            this.f59707a.m49553i().m49567a(new Runnable() { // from class: com.mbridge.msdk.tracker.m.2
                @Override // java.lang.Runnable
                public final void run() {
                    if (!MBridgeTrackManager.this.m49531c(c22885e)) {
                        return;
                    }
                    MBridgeTrackManager.this.f59707a.m49554h().mo49359a(c22885e);
                    c22885e.m49595c(MBridgeTrackManager.this.f59707a.m49558d().f59924f);
                    JSONObject m49594d = c22885e.m49594d();
                    if (m49594d != null) {
                        try {
                            m49594d.put(SDKAnalyticsEvents.PARAMETER_SESSION_ID, MBridgeTrackManager.this.m49534b());
                            long[] m49526h = MBridgeTrackManager.this.m49526h();
                            m49594d.put("track_time", m49526h[0]);
                            m49594d.put("track_count", m49526h[1]);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                        c22885e.m49601a(m49594d);
                    }
                    MBridgeTrackManager.this.f59707a.m49554h().mo49358b(c22885e);
                }
            });
        } catch (Exception e) {
            if (Common.f59651a) {
                Log.e("TrackManager", "trackEvent error", e);
            }
        }
    }
}
