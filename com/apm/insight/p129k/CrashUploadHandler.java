package com.apm.insight.p129k;

import androidx.annotation.Nullable;
import com.apm.insight.CrashType;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.k.c */
/* loaded from: classes2.dex */
public abstract class CrashUploadHandler {

    /* renamed from: a */
    private static ConcurrentLinkedQueue<CrashUploadHandler> f3859a = new ConcurrentLinkedQueue<>();

    /* compiled from: CrashUploadHandler.java */
    /* renamed from: com.apm.insight.k.c$1 */
    /* loaded from: classes2.dex */
    static /* synthetic */ class C38081 {

        /* renamed from: a */
        static final /* synthetic */ int[] f3860a;

        static {
            int[] iArr = new int[CrashType.values().length];
            f3860a = iArr;
            try {
                iArr[CrashType.JAVA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3860a[CrashType.LAUNCH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3860a[CrashType.NATIVE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: CrashUploadHandler.java */
    /* renamed from: com.apm.insight.k.c$a */
    /* loaded from: classes2.dex */
    public static class C3809a {

        /* renamed from: a */
        private JSONObject f3861a;

        /* renamed from: b */
        private JSONObject f3862b;

        /* renamed from: c */
        private CrashType f3863c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C3809a(JSONObject jSONObject, CrashType crashType) {
            this.f3863c = crashType;
            if (crashType == CrashType.LAUNCH) {
                this.f3861a = ((JSONArray) jSONObject.opt("data")).optJSONObject(0);
            } else {
                this.f3861a = jSONObject;
            }
            this.f3862b = jSONObject.optJSONObject("header");
        }

        @Nullable
        /* renamed from: a */
        public final String m101824a() {
            return this.f3861a.optString("crash_thread_name", null);
        }

        /* renamed from: b */
        public final long m101823b() {
            return this.f3861a.optInt("app_start_time", -1);
        }

        @Nullable
        /* renamed from: c */
        public final String m101822c() {
            int i = C38081.f3860a[this.f3863c.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        return null;
                    }
                    return this.f3861a.optString("data", null);
                }
                return this.f3861a.optString("stack", null);
            }
            return this.f3861a.optString("data", null);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static void m101825a(CrashType crashType, JSONObject jSONObject) {
        ConcurrentLinkedQueue<CrashUploadHandler> concurrentLinkedQueue = f3859a;
        if (concurrentLinkedQueue != null && !concurrentLinkedQueue.isEmpty()) {
            new C3809a(jSONObject, crashType);
            while (!f3859a.isEmpty()) {
                f3859a.poll();
            }
            f3859a = null;
        }
    }
}
