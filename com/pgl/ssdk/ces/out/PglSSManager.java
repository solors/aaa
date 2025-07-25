package com.pgl.ssdk.ces.out;

import android.content.Context;
import android.view.MotionEvent;
import com.pgl.ssdk.C26652o0;
import com.pgl.ssdk.ces.C26615b;
import java.util.Map;

/* loaded from: classes7.dex */
public class PglSSManager {
    public static final int INIT_STATUS_FAIL_CONTEXT_NULL = 4;
    public static final int INIT_STATUS_FAIL_SO_LOADFAIL = 3;
    public static final int INIT_STATUS_FAIL_SO_MISSING = 2;
    public static final int INIT_STATUS_OK = 0;
    public static final int INIT_STATUS_UNINITIALIZE = 1;
    public static final String REPORT_SCENE_ADSHOW = "AdShow";

    /* renamed from: a */
    private static volatile PglSSManager f69892a;

    /* renamed from: b */
    private final C26615b f69893b;

    /* renamed from: c */
    private volatile int f69894c = 0;

    private PglSSManager(Context context, PglSSConfig pglSSConfig) {
        this.f69893b = C26615b.m40915a(context, pglSSConfig.getAppId(), pglSSConfig.getOVRegionType(), pglSSConfig.getCollectMode(), pglSSConfig.getAdSdkVersion());
    }

    public static int getInitStatus() {
        return C26615b.m40899g();
    }

    public static PglSSManager getInstance() {
        return f69892a;
    }

    public static String getLoadError() {
        if (C26615b.m40897i() != null) {
            return C26615b.m40897i().f69966b;
        }
        return null;
    }

    @DungeonFlag
    public static PglSSManager init(Context context, PglSSConfig pglSSConfig, String str, String str2, String str3, String str4) {
        if (context == null && pglSSConfig == null) {
            return null;
        }
        if (f69892a == null) {
            synchronized (PglSSManager.class) {
                if (f69892a == null) {
                    f69892a = new PglSSManager(context, pglSSConfig);
                    if (C26615b.m40899g() == 0) {
                        f69892a.f69893b.m40912a(str, str3, str2, str4);
                    }
                }
            }
        }
        return f69892a;
    }

    public void checkEventVirtual(MotionEvent motionEvent) {
        if (C26615b.m40899g() == 0) {
            this.f69893b.m40914a(motionEvent);
        }
    }

    public long getECForBidding() {
        if (C26615b.m40899g() == 0) {
            return this.f69893b.m40900f();
        }
        return 0L;
    }

    public Map<String, String> getFeatureHash(String str, byte[] bArr) {
        if (C26615b.m40899g() == 0) {
            return this.f69893b.m40910a(str, bArr);
        }
        return null;
    }

    public String getSofChara() {
        if (C26615b.m40899g() == 0) {
            return this.f69893b.m40896j();
        }
        return null;
    }

    public String getToken() {
        if (C26615b.m40899g() == 0) {
            return this.f69893b.m40895k();
        }
        return null;
    }

    public void reportNow(String str, Map<String, Object> map) {
        if (C26615b.m40899g() == 0) {
            if (REPORT_SCENE_ADSHOW.equals(str)) {
                this.f69893b.m40905c();
            }
            if (this.f69894c % 2 == 0) {
                this.f69893b.m40911a(str, map);
            }
            this.f69894c++;
        }
    }

    public void setCustomInfo(Map<String, Object> map) {
        if (C26615b.m40899g() == 0) {
            this.f69893b.m40909a(map);
            C26652o0.m40800b(new Runnable() { // from class: com.pgl.ssdk.ces.out.PglSSManager.1
                {
                    PglSSManager.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    PglSSManager.this.f69893b.m40908b();
                }
            });
        }
    }

    public void setDeviceId(String str) {
        if (C26615b.m40899g() == 0) {
            this.f69893b.m40913a(str);
        }
    }

    public void setGaid(String str) {
        if (C26615b.m40899g() == 0) {
            this.f69893b.m40906b(str);
        }
    }

    public void setOaid(String str) {
        if (C26615b.m40899g() == 0) {
            this.f69893b.m40902d(str);
        }
    }
}
