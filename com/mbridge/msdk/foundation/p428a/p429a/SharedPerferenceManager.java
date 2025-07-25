package com.mbridge.msdk.foundation.p428a.p429a;

import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDir;
import com.mbridge.msdk.foundation.same.p437b.MBridgeDirManager;
import com.mbridge.msdk.foundation.tools.FastKV;
import com.mbridge.msdk.foundation.tools.SameLogTool;

/* renamed from: com.mbridge.msdk.foundation.a.a.a */
/* loaded from: classes6.dex */
public class SharedPerferenceManager {

    /* renamed from: a */
    public static final String f56036a = "a";

    /* renamed from: c */
    private static SharedPerferenceManager f56037c;

    /* renamed from: b */
    FastKV f56038b;

    private SharedPerferenceManager() {
    }

    /* renamed from: a */
    public static synchronized SharedPerferenceManager m52898a() {
        SharedPerferenceManager sharedPerferenceManager;
        synchronized (SharedPerferenceManager.class) {
            if (f56037c == null) {
                f56037c = new SharedPerferenceManager();
            }
            sharedPerferenceManager = f56037c;
        }
        return sharedPerferenceManager;
    }

    /* renamed from: b */
    public final Long m52892b(String str) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                String str2 = f56036a;
                SameLogTool.m51827a(str2, "getLong error: " + e.getMessage());
            }
        }
        if (MBSDKContext.m52746m().m52792c() == null) {
            SameLogTool.m51824b(f56036a, "context is null in get");
            return 0L;
        }
        m52893b();
        FastKV fastKV = this.f56038b;
        if (fastKV != null) {
            try {
                return Long.valueOf(fastKV.getLong(str, 0L));
            } catch (Exception unused) {
                return 0L;
            }
        }
        return 0L;
    }

    /* renamed from: c */
    public final void m52890c(String str) {
        if (MBSDKContext.m52746m().m52792c() == null) {
            return;
        }
        m52893b();
        FastKV fastKV = this.f56038b;
        if (fastKV != null) {
            try {
                fastKV.remove(str);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public final String m52897a(String str) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                String str2 = f56036a;
                SameLogTool.m51827a(str2, "get error: " + e.getMessage());
            }
        }
        if (MBSDKContext.m52746m().m52792c() == null) {
            return null;
        }
        m52893b();
        FastKV fastKV = this.f56038b;
        if (fastKV != null) {
            try {
                return fastKV.getString(str, "");
            } catch (Exception unused) {
                return "";
            }
        }
        return null;
    }

    /* renamed from: a */
    public final int m52896a(String str, int i) {
        try {
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                String str2 = f56036a;
                SameLogTool.m51827a(str2, "getInt error: " + e.getMessage());
            }
        }
        if (MBSDKContext.m52746m().m52792c() == null) {
            return i;
        }
        m52893b();
        FastKV fastKV = this.f56038b;
        if (fastKV != null) {
            try {
                return fastKV.getInt(str, i);
            } catch (Exception unused) {
                return i;
            }
        }
        return i;
    }

    /* renamed from: b */
    public final void m52891b(String str, int i) {
        try {
            if (MBSDKContext.m52746m().m52792c() == null) {
                return;
            }
            m52893b();
            FastKV fastKV = this.f56038b;
            if (fastKV != null) {
                try {
                    fastKV.putInt(str, i);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: b */
    private void m52893b() {
        if (this.f56038b == null) {
            try {
                this.f56038b = new FastKV.Builder(MBridgeDirManager.m52273a(MBridgeDir.MBRIDGE_700_CONFIG), "mbridge").build();
            } catch (Exception unused) {
                this.f56038b = null;
            }
        }
    }

    /* renamed from: a */
    public final void m52894a(String str, String str2) {
        try {
            if (MBSDKContext.m52746m().m52792c() == null) {
                return;
            }
            m52893b();
            FastKV fastKV = this.f56038b;
            if (fastKV != null) {
                try {
                    fastKV.putString(str, str2);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                String str3 = f56036a;
                SameLogTool.m51827a(str3, "put error: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public final void m52895a(String str, long j) {
        try {
            if (MBSDKContext.m52746m().m52792c() == null) {
                SameLogTool.m51824b(f56036a, "context is null in put");
                return;
            }
            m52893b();
            FastKV fastKV = this.f56038b;
            if (fastKV != null) {
                try {
                    fastKV.putLong(str, j);
                } catch (Exception unused) {
                }
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                String str2 = f56036a;
                SameLogTool.m51827a(str2, "putLong error: " + e.getMessage());
            }
        }
    }
}
