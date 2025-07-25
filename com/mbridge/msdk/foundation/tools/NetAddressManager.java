package com.mbridge.msdk.foundation.tools;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.broadcast.NetWorkChangeReceiver;
import com.mbridge.msdk.p411c.Setting;
import com.mbridge.msdk.p411c.SettingManager;
import com.mbridge.msdk.p411c.SettingRequestController;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.v */
/* loaded from: classes6.dex */
public final class NetAddressManager {

    /* renamed from: a */
    IntentFilter f57025a;

    /* renamed from: b */
    private JSONObject f57026b;

    /* renamed from: c */
    private SettingRequestController f57027c;

    /* renamed from: d */
    private long f57028d;

    /* renamed from: e */
    private final BroadcastReceiver f57029e;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: NetAddressManager.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.v$a */
    /* loaded from: classes6.dex */
    public static final class C22072a {

        /* renamed from: a */
        static final NetAddressManager f57030a = new NetAddressManager();
    }

    /* renamed from: a */
    public static NetAddressManager m51613a() {
        return C22072a.f57030a;
    }

    /* renamed from: b */
    public final String m51611b() {
        long j;
        try {
            if (this.f57026b == null) {
                this.f57026b = new JSONObject();
            }
            if (this.f57026b.length() < 2) {
                try {
                    this.f57026b.put("KEY_INFO", (String) AsyncSharedPreferencesUtils.m51664a(MBSDKContext.m52746m().m52792c(), "KEY_INFO", ""));
                } catch (Exception e) {
                    SameLogTool.m51824b("NetAddressManager", e.getMessage());
                }
                try {
                    this.f57026b.put("KEY_TIME", ((Long) AsyncSharedPreferencesUtils.m51664a(MBSDKContext.m52746m().m52792c(), "KEY_TIME", 0L)).longValue());
                } catch (Exception e2) {
                    SameLogTool.m51824b("NetAddressManager", e2.getMessage());
                }
            }
            String optString = this.f57026b.optString("KEY_INFO");
            if (TextUtils.isEmpty(optString)) {
                return "";
            }
            Setting m53284a = SettingManager.m53286a().m53284a(MBSDKContext.m52746m().m52779k());
            if (m53284a != null) {
                j = m53284a.m53431c();
            } else {
                j = 3600;
            }
            if (System.currentTimeMillis() - this.f57026b.optLong("KEY_TIME") > j * 1000) {
                return "";
            }
            return optString;
        } catch (Exception e3) {
            SameLogTool.m51824b("NetAddressManager", e3.getMessage());
            return "";
        }
    }

    /* renamed from: c */
    public final void m51610c() {
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.f57028d > 3000) {
            if (this.f57027c == null) {
                this.f57027c = new SettingRequestController();
            }
            this.f57027c.m53262a(MBSDKContext.m52746m().m52792c(), MBSDKContext.m52746m().m52779k(), MBSDKContext.m52746m().m52796b());
            this.f57028d = currentTimeMillis;
        }
    }

    /* renamed from: d */
    public final void m51609d() {
        Context m52792c;
        try {
            if (SettingManager.m53286a().m53284a(MBSDKContext.m52746m().m52779k()).m53481a() == 1 && (m52792c = MBSDKContext.m52746m().m52792c()) != null) {
                IntentFilter intentFilter = new IntentFilter();
                this.f57025a = intentFilter;
                intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
                m52792c.registerReceiver(this.f57029e, this.f57025a);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("NetAddressManager", e.getMessage());
        }
    }

    /* renamed from: e */
    public final void m51608e() {
        Context m52792c = MBSDKContext.m52746m().m52792c();
        if (m52792c != null) {
            try {
                m52792c.unregisterReceiver(this.f57029e);
            } catch (Exception e) {
                SameLogTool.m51824b("NetAddressManager", e.getMessage());
            }
        }
    }

    private NetAddressManager() {
        this.f57026b = new JSONObject();
        this.f57029e = new NetWorkChangeReceiver();
        IntentFilter intentFilter = new IntentFilter();
        this.f57025a = intentFilter;
        intentFilter.addAction("android.net.conn.CONNECTIVITY_CHANGE");
    }

    /* renamed from: a */
    public final void m51612a(String str) {
        if (this.f57026b == null) {
            this.f57026b = new JSONObject();
        }
        try {
            if (!this.f57026b.optString("KEY_INFO", "").equals(str)) {
                this.f57026b.put("KEY_INFO", str);
                AsyncSharedPreferencesUtils.m51663b(MBSDKContext.m52746m().m52792c(), "KEY_INFO", str);
            }
        } catch (Exception e) {
            SameLogTool.m51824b("NetAddressManager", e.getMessage());
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            long currentTimeMillis = System.currentTimeMillis();
            this.f57026b.put("KEY_TIME", currentTimeMillis);
            AsyncSharedPreferencesUtils.m51663b(MBSDKContext.m52746m().m52792c(), "KEY_TIME", Long.valueOf(currentTimeMillis));
        } catch (Exception e2) {
            SameLogTool.m51824b("NetAddressManager", e2.getMessage());
        }
    }
}
