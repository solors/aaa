package com.mbridge.msdk.foundation.p434db.p435a;

import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.p434db.CommonSDKDBHelper;
import com.mbridge.msdk.foundation.p434db.ReplaceTempDao;
import com.mbridge.msdk.foundation.same.p436a.LruReplaceTempCache;
import com.mbridge.msdk.foundation.same.p441f.ThreadPoolUtils;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.mbridge.msdk.foundation.db.a.b */
/* loaded from: classes6.dex */
public final class ReplaceTempDaoMiddle {

    /* renamed from: a */
    private LruReplaceTempCache f56208a;

    /* renamed from: b */
    private ReplaceTempDao f56209b;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: ReplaceTempDaoMiddle.java */
    /* renamed from: com.mbridge.msdk.foundation.db.a.b$a */
    /* loaded from: classes6.dex */
    public static class C21919a {

        /* renamed from: a */
        private static ReplaceTempDaoMiddle f56213a = new ReplaceTempDaoMiddle();
    }

    private ReplaceTempDaoMiddle() {
        this.f56208a = new LruReplaceTempCache(1000);
        try {
            ReplaceTempDao m52570a = ReplaceTempDao.m52570a(CommonSDKDBHelper.m52593a(MBSDKContext.m52746m().m52792c()));
            this.f56209b = m52570a;
            m52663a(m52570a.m52571a(), false);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m52663a(JSONObject jSONObject, final boolean z) {
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            final LruReplaceTempCache lruReplaceTempCache = new LruReplaceTempCache(100);
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = jSONObject.optJSONObject(next);
                this.f56208a.m52304a(next, optJSONObject);
                lruReplaceTempCache.m52304a(next, optJSONObject);
            }
            ThreadPoolUtils.m52227b().execute(new Runnable() { // from class: com.mbridge.msdk.foundation.db.a.b.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (z && ReplaceTempDaoMiddle.this.f56209b != null) {
                        for (String str : lruReplaceTempCache.m52307a()) {
                            ReplaceTempDaoMiddle.this.f56209b.m52568a(str, ReplaceTempDaoMiddle.this.f56208a.m52305a(str));
                        }
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final JSONArray m52662b() {
        return new JSONArray((Collection) this.f56208a.m52307a());
    }

    /* renamed from: a */
    public static ReplaceTempDaoMiddle m52666a() {
        return C21919a.f56213a;
    }

    /* renamed from: a */
    public final JSONObject m52664a(String str) {
        ReplaceTempDao replaceTempDao;
        JSONObject m52305a = this.f56208a.m52305a(str);
        if (m52305a == null && (replaceTempDao = this.f56209b) != null) {
            JSONObject m52569a = replaceTempDao.m52569a(str);
            if (m52569a != null) {
                this.f56208a.m52304a(str, m52569a);
            }
            return m52569a;
        }
        return m52305a;
    }
}
