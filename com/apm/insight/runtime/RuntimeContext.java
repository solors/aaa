package com.apm.insight.runtime;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.apm.insight.AppDataCenter;
import com.apm.insight.Ensure;
import com.apm.insight.NpthBus;
import com.apm.insight.p130l.C3822f;
import com.apm.insight.p130l.LogPath;
import com.apm.insight.runtime.p131a.ActivityDataManager;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.p552ot.pubsub.util.C26601v;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.apm.insight.runtime.q */
/* loaded from: classes2.dex */
public final class RuntimeContext {

    /* renamed from: a */
    private static RuntimeContext f4090a;

    /* renamed from: b */
    private File f4091b;

    /* renamed from: c */
    private File f4092c;

    /* renamed from: d */
    private File f4093d;

    /* renamed from: e */
    private Context f4094e;

    /* renamed from: f */
    private C3862a f4095f = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: RuntimeContext.java */
    /* renamed from: com.apm.insight.runtime.q$a */
    /* loaded from: classes2.dex */
    public static class C3862a {

        /* renamed from: a */
        private long f4098a;

        /* renamed from: b */
        private long f4099b;

        /* renamed from: c */
        private File f4100c;

        /* renamed from: d */
        private JSONObject f4101d;

        /* synthetic */ C3862a(File file, byte b) {
            this(file);
        }

        /* renamed from: d */
        static /* synthetic */ void m101315d(C3862a c3862a) {
            c3862a.f4100c.delete();
        }

        private C3862a(File file) {
            this.f4101d = null;
            this.f4100c = file;
            String[] split = file.getName().split("-|\\.");
            if (split.length >= 2) {
                this.f4098a = Long.parseLong(split[0]);
                this.f4099b = Long.parseLong(split[1]);
                return;
            }
            String name = file.getName();
            if (TextUtils.isEmpty(name) || name.length() < 13) {
                return;
            }
            String substring = name.substring(0, 13);
            if (TextUtils.isDigitsOnly(substring)) {
                long parseLong = Long.parseLong(substring);
                this.f4098a = parseLong;
                this.f4099b = parseLong;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public JSONObject m101320a() {
            if (this.f4101d == null) {
                try {
                    this.f4101d = new JSONObject(C3822f.m101714a(this.f4100c.getAbsolutePath(), "\n"));
                } catch (Throwable unused) {
                }
                if (this.f4101d == null) {
                    this.f4101d = new JSONObject();
                }
            }
            return this.f4101d;
        }

        /* renamed from: a */
        static /* synthetic */ boolean m101318a(C3862a c3862a, long j) {
            long j2 = c3862a.f4098a;
            if (j2 <= j || j2 - j <= C26601v.f69834a) {
                long j3 = c3862a.f4099b;
                if (j3 >= j || j - j3 <= C26601v.f69834a) {
                    return c3862a.f4100c.lastModified() < j && j - c3862a.f4100c.lastModified() > C26601v.f69834a;
                }
                return true;
            }
            return true;
        }
    }

    private RuntimeContext(Context context) {
        File m101669c = LogPath.m101669c(context);
        if (!m101669c.exists() || (!m101669c.isDirectory() && m101669c.delete())) {
            m101669c.mkdirs();
            ActivityDataManager.m101502a();
        }
        this.f4091b = m101669c;
        this.f4092c = new File(m101669c, KeyConstants.RequestBody.KEY_DID);
        this.f4093d = new File(m101669c, "device_uuid");
        this.f4094e = context;
    }

    /* renamed from: a */
    public static RuntimeContext m101330a() {
        if (f4090a == null) {
            f4090a = new RuntimeContext(NpthBus.m102011g());
        }
        return f4090a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: b */
    public final String m101325b() {
        try {
            return C3822f.m101714a(this.f4092c.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return "0";
        }
    }

    /* renamed from: c */
    public final String m101322c() {
        try {
            return C3822f.m101714a(this.f4093d.getAbsolutePath(), "\n");
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private ArrayList<C3862a> m101321c(final String str) {
        File[] listFiles = this.f4091b.listFiles(new FilenameFilter() { // from class: com.apm.insight.runtime.q.1
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str2) {
                if (str2.endsWith(str) && Pattern.compile("^\\d{1,13}-\\d{1,13}.*").matcher(str2).matches()) {
                    return true;
                }
                return false;
            }
        });
        ArrayList<C3862a> arrayList = new ArrayList<>();
        if (listFiles == null) {
            return arrayList;
        }
        AppDataCenter.m102179a((Object) ("foundRuntimeContextFiles " + listFiles.length));
        C3862a c3862a = null;
        for (File file : listFiles) {
            try {
                C3862a c3862a2 = new C3862a(file, (byte) 0);
                arrayList.add(c3862a2);
                if (this.f4095f == null && ".ctx".equals(str) && (c3862a == null || c3862a2.f4099b >= c3862a.f4099b)) {
                    c3862a = c3862a2;
                }
            } catch (Throwable th) {
                Ensure.m102051a();
                MonitorCrashInner.m101391a(th, "NPTH_CATCH");
            }
        }
        if (this.f4095f == null && c3862a != null) {
            this.f4095f = c3862a;
        }
        return arrayList;
    }

    /* renamed from: b */
    public final void m101323b(String str) {
        try {
            C3822f.m101721a(this.f4093d, str, false);
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x008c A[Catch: all -> 0x00a7, TryCatch #0 {all -> 0x00a7, blocks: (B:28:0x007e, B:31:0x008c, B:32:0x0090, B:34:0x0096, B:36:0x00a2), top: B:42:0x007e }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m101326a(java.util.Map<java.lang.String, java.lang.Object> r11, org.json.JSONArray r12) {
        /*
            r10 = this;
            android.content.Context r0 = r10.f4094e
            com.apm.insight.entity.Header r0 = com.apm.insight.entity.Header.m101982a(r0)
            org.json.JSONObject r6 = r0.m101980a(r11)
            boolean r11 = com.apm.insight.entity.Header.m101973c(r6)
            if (r11 == 0) goto L11
            return
        L11:
            long r8 = java.lang.System.currentTimeMillis()
            com.apm.insight.runtime.q$a r11 = r10.f4095f
            if (r11 != 0) goto L1e
            java.lang.String r11 = ".ctx"
            r10.m101321c(r11)
        L1e:
            com.apm.insight.runtime.q$a r11 = r10.f4095f
            if (r11 != 0) goto L2a
            r1 = r10
            r2 = r8
            r4 = r8
            r7 = r12
            r1.m101328a(r2, r4, r6, r7)
            return
        L2a:
            org.json.JSONObject r0 = com.apm.insight.runtime.RuntimeContext.C3862a.m101319a(r11)
            boolean r1 = com.apm.insight.entity.Header.m101973c(r0)
            r2 = 1
            r3 = 2
            if (r1 != 0) goto L5f
            boolean r1 = com.apm.insight.entity.Header.m101973c(r6)
            if (r1 == 0) goto L3e
            r0 = 0
            goto L60
        L3e:
            java.lang.String r1 = "update_version_code"
            java.lang.Object r4 = r6.opt(r1)
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.Object r1 = r0.opt(r1)
            java.lang.String r1 = java.lang.String.valueOf(r1)
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L5f
            boolean r0 = com.apm.insight.entity.Header.m101971d(r0)
            if (r0 == 0) goto L5f
            r0 = r2
            goto L60
        L5f:
            r0 = r3
        L60:
            if (r0 == r2) goto L6d
            if (r0 == r3) goto L65
            goto L7e
        L65:
            r1 = r10
            r2 = r8
            r4 = r8
            r7 = r12
            r1.m101328a(r2, r4, r6, r7)
            goto L7e
        L6d:
            long r2 = com.apm.insight.runtime.RuntimeContext.C3862a.m101317b(r11)
            r1 = r10
            r4 = r8
            r7 = r12
            r1.m101328a(r2, r4, r6, r7)
            java.io.File r11 = com.apm.insight.runtime.RuntimeContext.C3862a.m101316c(r11)
            com.apm.insight.p130l.C3822f.m101727a(r11)
        L7e:
            java.lang.String r11 = ""
            java.util.ArrayList r11 = r10.m101321c(r11)     // Catch: java.lang.Throwable -> La7
            int r12 = r11.size()     // Catch: java.lang.Throwable -> La7
            r0 = 6
            if (r12 > r0) goto L8c
            return
        L8c:
            java.util.Iterator r11 = r11.iterator()     // Catch: java.lang.Throwable -> La7
        L90:
            boolean r12 = r11.hasNext()     // Catch: java.lang.Throwable -> La7
            if (r12 == 0) goto La6
            java.lang.Object r12 = r11.next()     // Catch: java.lang.Throwable -> La7
            com.apm.insight.runtime.q$a r12 = (com.apm.insight.runtime.RuntimeContext.C3862a) r12     // Catch: java.lang.Throwable -> La7
            boolean r0 = com.apm.insight.runtime.RuntimeContext.C3862a.m101318a(r12, r8)     // Catch: java.lang.Throwable -> La7
            if (r0 == 0) goto L90
            com.apm.insight.runtime.RuntimeContext.C3862a.m101315d(r12)     // Catch: java.lang.Throwable -> La7
            goto L90
        La6:
            return
        La7:
            r11 = move-exception
            com.apm.insight.Ensure.m102051a()
            java.lang.String r12 = "NPTH_CATCH"
            com.apm.insight.runtime.MonitorCrashInner.m101391a(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.runtime.RuntimeContext.m101326a(java.util.Map, org.json.JSONArray):void");
    }

    @Nullable
    /* renamed from: b */
    public final JSONArray m101324b(long j) {
        File file;
        String str;
        Iterator<C3862a> it = m101321c(".allData").iterator();
        while (true) {
            if (!it.hasNext()) {
                file = null;
                break;
            }
            C3862a next = it.next();
            if (j >= next.f4098a && j <= next.f4099b) {
                file = next.f4100c;
                break;
            }
        }
        if (file == null) {
            Iterator<C3862a> it2 = m101321c(".allData").iterator();
            C3862a c3862a = null;
            while (it2.hasNext()) {
                C3862a next2 = it2.next();
                if (c3862a == null || Math.abs(c3862a.f4099b - j) > Math.abs(next2.f4099b - j)) {
                    c3862a = next2;
                }
            }
            file = c3862a == null ? null : c3862a.f4100c;
        }
        if (file != null) {
            try {
                str = C3822f.m101714a(file.getAbsolutePath(), "\n");
            } catch (Throwable th) {
                th = th;
                str = null;
            }
            try {
                return new JSONArray(str);
            } catch (Throwable th2) {
                th = th2;
                Ensure.m102051a();
                MonitorCrashInner.m101391a(new IOException("content :".concat(String.valueOf(str)), th), "NPTH_CATCH");
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    private void m101328a(long j, long j2, JSONObject jSONObject, JSONArray jSONArray) {
        File file = this.f4091b;
        File file2 = new File(file, j + "-" + j2 + ".ctx");
        File file3 = this.f4091b;
        File file4 = new File(file3, j + "-" + j2 + ".allData");
        try {
            C3822f.m101718a(file2, jSONObject);
            C3822f.m101719a(file4, jSONArray);
            this.f4095f = new C3862a(file2, (byte) 0);
        } catch (IOException e) {
            Ensure.m102051a();
            MonitorCrashInner.m101391a(e, "NPTH_CATCH");
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public final void m101327a(String str) {
        try {
            C3822f.m101721a(this.f4092c, str, false);
        } catch (Throwable unused) {
        }
    }

    @Nullable
    /* renamed from: a */
    public final JSONObject m101329a(long j) {
        JSONObject jSONObject;
        File file;
        boolean z;
        String str;
        Iterator<C3862a> it = m101321c(".ctx").iterator();
        while (true) {
            jSONObject = null;
            if (!it.hasNext()) {
                file = null;
                break;
            }
            C3862a next = it.next();
            if (j >= next.f4098a && j <= next.f4099b) {
                file = next.f4100c;
                break;
            }
        }
        if (file == null) {
            Iterator<C3862a> it2 = m101321c(".ctx").iterator();
            C3862a c3862a = null;
            while (it2.hasNext()) {
                C3862a next2 = it2.next();
                if (c3862a == null || Math.abs(c3862a.f4099b - j) > Math.abs(next2.f4099b - j)) {
                    c3862a = next2;
                }
            }
            file = c3862a == null ? null : c3862a.f4100c;
            z = true;
        } else {
            z = false;
        }
        if (file != null) {
            try {
                str = C3822f.m101714a(file.getAbsolutePath(), "\n");
            } catch (Throwable th) {
                th = th;
                str = null;
            }
            try {
                jSONObject = new JSONObject(str);
            } catch (Throwable th2) {
                th = th2;
                Ensure.m102051a();
                MonitorCrashInner.m101391a(new IOException("content :".concat(String.valueOf(str)), th), "NPTH_CATCH");
                if (jSONObject != null) {
                    try {
                        jSONObject.put("unauthentic_version", 1);
                    } catch (JSONException e) {
                        Ensure.m102051a();
                        MonitorCrashInner.m101391a(e, "NPTH_CATCH");
                    }
                }
                return jSONObject;
            }
        }
        if (jSONObject != null && z) {
            jSONObject.put("unauthentic_version", 1);
        }
        return jSONObject;
    }
}
