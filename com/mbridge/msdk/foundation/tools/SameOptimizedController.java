package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import com.mbridge.msdk.p411c.Setting;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.tools.ah */
/* loaded from: classes6.dex */
public final class SameOptimizedController {

    /* renamed from: a */
    public volatile JSONObject f56902a;

    /* renamed from: b */
    private final Object f56903b;

    /* renamed from: c */
    private final Object f56904c;

    /* renamed from: d */
    private final Object f56905d;

    /* renamed from: e */
    private final Object f56906e;

    /* renamed from: f */
    private String f56907f;

    /* renamed from: g */
    private volatile ConcurrentHashMap<String, Boolean> f56908g;

    /* renamed from: h */
    private volatile ConcurrentHashMap<String, Integer> f56909h;

    /* renamed from: i */
    private volatile Setting f56910i;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SameOptimizedController.java */
    /* renamed from: com.mbridge.msdk.foundation.tools.ah$a */
    /* loaded from: classes6.dex */
    public static final class C22042a {

        /* renamed from: a */
        private static final SameOptimizedController f56911a = new SameOptimizedController();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: a */
        public static /* synthetic */ SameOptimizedController m51801a() {
            return f56911a;
        }
    }

    /* renamed from: a */
    public static SameOptimizedController m51814a() {
        return C22042a.f56911a;
    }

    /* renamed from: b */
    private int m51805b(String str, String str2, int i) {
        if (m51808a(true)) {
            return i;
        }
        try {
            String optString = this.f56902a.optString(str, "");
            if (TextUtils.isEmpty(optString)) {
                return i;
            }
            String m51603a = SameBase64Tool.m51603a(optString);
            return TextUtils.isEmpty(m51603a) ? i : new JSONObject(m51603a).optInt(str2, i);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: c */
    private ConcurrentHashMap<String, Boolean> m51802c() {
        synchronized (this.f56905d) {
            if (this.f56908g == null) {
                this.f56908g = new ConcurrentHashMap<>();
            }
        }
        return this.f56908g;
    }

    private SameOptimizedController() {
        this.f56903b = new Object();
        this.f56904c = new Object();
        this.f56905d = new Object();
        this.f56906e = new Object();
    }

    /* renamed from: a */
    private static Integer m51811a(String str, ConcurrentHashMap<String, Integer> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public final int m51813a(String str, int i) {
        Integer valueOf;
        try {
            if (TextUtils.isEmpty(str)) {
                return i;
            }
            ConcurrentHashMap<String, Integer> m51807b = m51807b();
            Integer m51811a = m51811a(str, m51807b);
            if (m51811a != null) {
                return m51811a.intValue();
            }
            try {
                valueOf = Integer.valueOf(m51806b(str, i));
            } catch (Exception unused) {
                valueOf = Integer.valueOf(i);
            }
            m51807b.put(str, valueOf);
            return valueOf.intValue();
        } catch (Exception unused2) {
            return i;
        }
    }

    /* renamed from: b */
    private int m51806b(String str, int i) {
        if (m51808a(true)) {
            return i;
        }
        try {
            return this.f56902a.optInt(str, i);
        } catch (Exception unused) {
            return i;
        }
    }

    /* renamed from: b */
    private ConcurrentHashMap<String, Integer> m51807b() {
        synchronized (this.f56903b) {
            if (this.f56909h == null) {
                this.f56909h = new ConcurrentHashMap<>();
            }
        }
        return this.f56909h;
    }

    /* renamed from: a */
    public final int m51812a(String str, String str2, int i) {
        Integer valueOf;
        try {
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
                String str3 = str + "_" + str2;
                ConcurrentHashMap<String, Integer> m51807b = m51807b();
                Integer m51811a = m51811a(str3, m51807b);
                if (m51811a != null) {
                    return m51811a.intValue();
                }
                try {
                    valueOf = Integer.valueOf(m51805b(str, str2, i));
                } catch (Exception unused) {
                    valueOf = Integer.valueOf(i);
                }
                m51807b.put(str3, valueOf);
                return valueOf.intValue();
            }
            return m51813a(str2, i);
        } catch (Exception unused2) {
            return i;
        }
    }

    /* renamed from: b */
    private static Boolean m51804b(String str, ConcurrentHashMap<String, Boolean> concurrentHashMap) {
        try {
            return concurrentHashMap.get(str);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private boolean m51803b(String str, boolean z, boolean z2) {
        if (m51808a(z2)) {
            return z;
        }
        try {
            return this.f56902a.optInt(str, z ? 1 : 0) != 0;
        } catch (Exception unused) {
            return z;
        }
    }

    /* renamed from: a */
    public final boolean m51810a(String str, boolean z) {
        try {
            return m51809a(str, z, true);
        } catch (Exception unused) {
            return z;
        }
    }

    /* renamed from: a */
    public final boolean m51809a(String str, boolean z, boolean z2) {
        Boolean valueOf;
        Boolean m51804b;
        try {
            if (TextUtils.isEmpty(str)) {
                return z;
            }
            ConcurrentHashMap<String, Boolean> m51802c = m51802c();
            if (z2 && (m51804b = m51804b(str, m51802c)) != null) {
                return m51804b.booleanValue();
            }
            try {
                valueOf = Boolean.valueOf(m51803b(str, z, z2));
            } catch (Exception unused) {
                valueOf = Boolean.valueOf(z);
            }
            m51802c.put(str, valueOf);
            return valueOf.booleanValue();
        } catch (Exception unused2) {
            return z;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0016, code lost:
        if (r5 != false) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean m51808a(boolean r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.f56906e
            monitor-enter(r0)
            com.mbridge.msdk.c.g r1 = r4.f56910i     // Catch: java.lang.Throwable -> L53
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L18
            com.mbridge.msdk.c.g r1 = r4.f56910i     // Catch: java.lang.Throwable -> L53
            int r1 = r1.m53497K()     // Catch: java.lang.Throwable -> L53
            if (r1 != r3) goto L13
            r1 = r3
            goto L14
        L13:
            r1 = r2
        L14:
            if (r1 != 0) goto L18
            if (r5 != 0) goto L3c
        L18:
            java.lang.String r5 = r4.f56907f     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            boolean r5 = android.text.TextUtils.isEmpty(r5)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            if (r5 == 0) goto L2c
            com.mbridge.msdk.foundation.a.a.a r5 = com.mbridge.msdk.foundation.p428a.p429a.SharedPerferenceManager.m52898a()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            java.lang.String r1 = "sdk_app_id"
            java.lang.String r5 = r5.m52897a(r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            r4.f56907f = r5     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
        L2c:
            com.mbridge.msdk.c.h r5 = com.mbridge.msdk.p411c.SettingManager.m53286a()     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            java.lang.String r1 = r4.f56907f     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            com.mbridge.msdk.c.g r5 = r5.m53284a(r1)     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            r4.f56910i = r5     // Catch: java.lang.Exception -> L39 java.lang.Throwable -> L53
            goto L3c
        L39:
            r5 = 0
            r4.f56910i = r5     // Catch: java.lang.Throwable -> L53
        L3c:
            com.mbridge.msdk.c.g r5 = r4.f56910i     // Catch: java.lang.Throwable -> L53
            if (r5 == 0) goto L48
            com.mbridge.msdk.c.g r5 = r4.f56910i     // Catch: java.lang.Throwable -> L53
            org.json.JSONObject r5 = r5.m53450am()     // Catch: java.lang.Throwable -> L53
            r4.f56902a = r5     // Catch: java.lang.Throwable -> L53
        L48:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            com.mbridge.msdk.c.g r5 = r4.f56910i
            if (r5 == 0) goto L51
            org.json.JSONObject r5 = r4.f56902a
            if (r5 != 0) goto L52
        L51:
            r2 = r3
        L52:
            return r2
        L53:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L53
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.tools.SameOptimizedController.m51808a(boolean):boolean");
    }
}
