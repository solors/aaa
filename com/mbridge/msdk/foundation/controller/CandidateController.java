package com.mbridge.msdk.foundation.controller;

import com.mbridge.msdk.foundation.p430b.CandidateUnitCacheManager;
import java.util.HashMap;

/* renamed from: com.mbridge.msdk.foundation.controller.b */
/* loaded from: classes6.dex */
public final class CandidateController {

    /* renamed from: a */
    private HashMap<String, CandidateUnitCacheManager> f56123a;

    /* compiled from: CandidateController.java */
    /* renamed from: com.mbridge.msdk.foundation.controller.b$a */
    /* loaded from: classes6.dex */
    static class C21901a {

        /* renamed from: a */
        static CandidateController f56124a = new CandidateController();
    }

    /* renamed from: a */
    public static CandidateController m52749a() {
        return C21901a.f56124a;
    }

    private CandidateController() {
        this.f56123a = new HashMap<>();
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007e  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final com.mbridge.msdk.foundation.p430b.CandidateUnitCacheManager m52748a(java.lang.String r7, org.json.JSONArray r8) {
        /*
            r6 = this;
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f56123a
            if (r0 != 0) goto Lb
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f56123a = r0
        Lb:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f56123a
            boolean r0 = r0.containsKey(r7)
            if (r0 != 0) goto L8a
            if (r8 != 0) goto L62
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch: java.lang.Exception -> L54
            r0.<init>()     // Catch: java.lang.Exception -> L54
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L52
            r8.<init>()     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "c_cb"
            r2 = 0
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "t_disc"
            r3 = 4606732058837280358(0x3fee666666666666, double:0.95)
            r8.put(r1, r3)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "u_disc"
            r8.put(r1, r3)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "max_ecppv_diff"
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "max_cache_num"
            r2 = 20
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "max_usage_limit"
            r2 = 10
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            java.lang.String r1 = "time_interval"
            r2 = 7200(0x1c20, float:1.009E-41)
            r8.put(r1, r2)     // Catch: java.lang.Exception -> L52
            r0.put(r8)     // Catch: java.lang.Exception -> L52
            goto L61
        L52:
            r8 = move-exception
            goto L58
        L54:
            r0 = move-exception
            r5 = r0
            r0 = r8
            r8 = r5
        L58:
            java.lang.String r1 = "CandidateController"
            java.lang.String r8 = r8.getMessage()
            android.util.Log.e(r1, r8)
        L61:
            r8 = r0
        L62:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f56123a
            if (r0 != 0) goto L6d
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r6.f56123a = r0
        L6d:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r0 = r6.f56123a
            boolean r0 = r0.containsKey(r7)
            if (r0 == 0) goto L7e
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r8 = r6.f56123a
            java.lang.Object r7 = r8.get(r7)
            com.mbridge.msdk.foundation.b.d r7 = (com.mbridge.msdk.foundation.p430b.CandidateUnitCacheManager) r7
            goto L89
        L7e:
            com.mbridge.msdk.foundation.b.d r0 = new com.mbridge.msdk.foundation.b.d
            r0.<init>(r7, r8)
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r8 = r6.f56123a
            r8.put(r7, r0)
            r7 = r0
        L89:
            return r7
        L8a:
            java.util.HashMap<java.lang.String, com.mbridge.msdk.foundation.b.d> r8 = r6.f56123a
            java.lang.Object r7 = r8.get(r7)
            com.mbridge.msdk.foundation.b.d r7 = (com.mbridge.msdk.foundation.p430b.CandidateUnitCacheManager) r7
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.foundation.controller.CandidateController.m52748a(java.lang.String, org.json.JSONArray):com.mbridge.msdk.foundation.b.d");
    }
}
