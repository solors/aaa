package com.p552ot.pubsub.p559g;

import android.content.Context;
import com.p552ot.pubsub.p553a.InterfaceC26486c;
import com.p552ot.pubsub.p555c.C26523c;
import com.p552ot.pubsub.util.C26577b;
import com.p552ot.pubsub.util.C26578c;
import com.p552ot.pubsub.util.C26580e;
import com.p552ot.pubsub.util.C26585i;
import com.p552ot.pubsub.util.C26586j;
import com.p552ot.pubsub.util.C26601v;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ot.pubsub.g.i */
/* loaded from: classes7.dex */
public class C26546i {

    /* renamed from: a */
    public static final long f69524a = 0;

    /* renamed from: b */
    public static final long f69525b = 1;

    /* renamed from: c */
    public static final long f69526c = 2;

    /* renamed from: d */
    public static final String f69527d = "projectid";

    /* renamed from: e */
    public static final String f69528e = "topic";

    /* renamed from: f */
    public static final String f69529f = "eventName";

    /* renamed from: g */
    public static final String f69530g = "data";

    /* renamed from: h */
    public static final String f69531h = "attributes";

    /* renamed from: i */
    public static final String f69532i = "needGzipAndEncrypt";

    /* renamed from: j */
    private static final String f69533j = "NetworkAccessManager";

    /* renamed from: k */
    private static final String f69534k = "ot_pubsub";

    /* renamed from: l */
    private static String f69535l = "ot_pubsub_netaccess_%s";

    /* renamed from: m */
    private static SimpleDateFormat f69536m = new SimpleDateFormat(C26601v.f69840g);

    /* renamed from: n */
    private static volatile boolean f69537n = true;

    /* renamed from: o */
    private static volatile boolean f69538o = false;

    /* renamed from: p */
    private static boolean f69539p = true;

    /* renamed from: a */
    public static boolean m41248a() {
        return f69539p;
    }

    /* renamed from: d */
    private static String m41238d() {
        Context m41121a = C26577b.m41121a();
        return m41121a.getFilesDir().getAbsolutePath() + File.separator + f69534k;
    }

    /* renamed from: a */
    public static void m41245a(boolean z) {
        f69539p = z;
    }

    /* renamed from: b */
    public static synchronized void m41242b(boolean z) {
        File file;
        synchronized (C26546i.class) {
            try {
                file = new File(m41238d());
            } catch (Exception e) {
                C26586j.m41074b(f69533j, "cta removeObsoleteEvent error: " + e.toString());
                e.printStackTrace();
            }
            if (file.exists() && file.isDirectory()) {
                String format = String.format(f69535l, f69536m.format(new Date()));
                File[] listFiles = file.listFiles();
                for (int i = 0; i < listFiles.length; i++) {
                    if (listFiles[i].isFile() && (z || !listFiles[i].getName().equalsIgnoreCase(format))) {
                        listFiles[i].delete();
                    }
                }
                if (file.listFiles().length == 0) {
                    f69537n = false;
                }
                return;
            }
            f69537n = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static synchronized void m41240c(String str, String str2, String str3, String str4, Map<String, String> map, boolean z) {
        BufferedWriter bufferedWriter;
        FileWriter fileWriter;
        synchronized (C26546i.class) {
            File file = new File(m41238d(), String.format(f69535l, f69536m.format(new Date())));
            FileWriter fileWriter2 = null;
            try {
                if (!file.exists()) {
                    if (file.getParentFile().exists()) {
                        file.createNewFile();
                    } else {
                        new File(file.getParentFile().getAbsolutePath()).mkdirs();
                        file.createNewFile();
                    }
                }
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("projectid", str);
                jSONObject.put("topic", str2);
                jSONObject.put("eventName", str3);
                jSONObject.put("data", str4);
                jSONObject.put(f69531h, C26578c.m41107a(map));
                jSONObject.put(f69532i, z);
                byte[] m41277a = C26538c.m41277a(jSONObject.toString());
                fileWriter = new FileWriter(file, true);
                try {
                    bufferedWriter = new BufferedWriter(fileWriter);
                } catch (Exception e) {
                    e = e;
                    bufferedWriter = null;
                } catch (Throwable th) {
                    th = th;
                    bufferedWriter = null;
                }
                try {
                    bufferedWriter.write(C26523c.m41352a(m41277a));
                    bufferedWriter.newLine();
                    f69537n = true;
                } catch (Exception e2) {
                    e = e2;
                    fileWriter2 = fileWriter;
                    try {
                        C26586j.m41074b(f69533j, "cta doSaveData error: " + e.toString());
                        e.printStackTrace();
                        fileWriter = fileWriter2;
                        C26585i.m41092a(bufferedWriter);
                        C26585i.m41092a(fileWriter);
                    } catch (Throwable th2) {
                        th = th2;
                        C26585i.m41092a(bufferedWriter);
                        C26585i.m41092a(fileWriter2);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    fileWriter2 = fileWriter;
                    C26585i.m41092a(bufferedWriter);
                    C26585i.m41092a(fileWriter2);
                    throw th;
                }
            } catch (Exception e3) {
                e = e3;
                bufferedWriter = null;
            } catch (Throwable th4) {
                th = th4;
                bufferedWriter = null;
            }
            C26585i.m41092a(bufferedWriter);
            C26585i.m41092a(fileWriter);
        }
    }

    /* renamed from: a */
    public static void m41246a(String str, String str2, String str3, String str4, Map<String, String> map, boolean z) {
        C26580e.m41105a(new RunnableC26547j(str, str2, str3, str4, map, z));
    }

    /* renamed from: a */
    public static synchronized void m41247a(InterfaceC26486c interfaceC26486c) {
        synchronized (C26546i.class) {
            if (!m41241c()) {
                C26586j.m41080a(f69533j, "analytics is publishing or no cache can be found，skip it!");
            } else if (!m41248a()) {
                C26586j.m41080a(f69533j, "network is unaccessable, cta");
            } else {
                f69538o = true;
                C26580e.m41105a(new RunnableC26548k(interfaceC26486c));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x009a A[Catch: all -> 0x00b9, TryCatch #5 {, blocks: (B:4:0x0003, B:9:0x002c, B:16:0x0052, B:34:0x0092, B:36:0x009a, B:37:0x00a7, B:39:0x00ad, B:43:0x00b2, B:44:0x00b8, B:33:0x008c), top: B:50:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ad A[Catch: all -> 0x00b9, TRY_LEAVE, TryCatch #5 {, blocks: (B:4:0x0003, B:9:0x002c, B:16:0x0052, B:34:0x0092, B:36:0x009a, B:37:0x00a7, B:39:0x00ad, B:43:0x00b2, B:44:0x00b8, B:33:0x008c), top: B:50:0x0003 }] */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static synchronized java.util.List<org.json.JSONObject> m41244b() {
        /*
            java.lang.Class<com.ot.pubsub.g.i> r0 = com.p552ot.pubsub.p559g.C26546i.class
            monitor-enter(r0)
            java.text.SimpleDateFormat r1 = com.p552ot.pubsub.p559g.C26546i.f69536m     // Catch: java.lang.Throwable -> Lb9
            java.util.Date r2 = new java.util.Date     // Catch: java.lang.Throwable -> Lb9
            r2.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = r1.format(r2)     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r2 = com.p552ot.pubsub.p559g.C26546i.f69535l     // Catch: java.lang.Throwable -> Lb9
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> Lb9
            r5 = 0
            r4[r5] = r1     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r1 = java.lang.String.format(r2, r4)     // Catch: java.lang.Throwable -> Lb9
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> Lb9
            java.lang.String r4 = m41238d()     // Catch: java.lang.Throwable -> Lb9
            r2.<init>(r4, r1)     // Catch: java.lang.Throwable -> Lb9
            boolean r1 = r2.exists()     // Catch: java.lang.Throwable -> Lb9
            r4 = 0
            if (r1 != 0) goto L2c
            monitor-exit(r0)
            return r4
        L2c:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> Lb9
            r1.<init>()     // Catch: java.lang.Throwable -> Lb9
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            r5.<init>(r2)     // Catch: java.lang.Throwable -> L69 java.lang.Exception -> L6c
            java.io.BufferedReader r2 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L63
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L5f java.lang.Exception -> L63
        L3b:
            java.lang.String r4 = r2.readLine()     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            if (r4 == 0) goto L52
            byte[] r4 = com.p552ot.pubsub.p555c.C26523c.m41353a(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            java.lang.String r4 = com.p552ot.pubsub.p559g.C26538c.m41273a(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r6.<init>(r4)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            r1.add(r6)     // Catch: java.lang.Throwable -> L59 java.lang.Exception -> L5b
            goto L3b
        L52:
            com.p552ot.pubsub.util.C26585i.m41092a(r2)     // Catch: java.lang.Throwable -> Lb9
            com.p552ot.pubsub.util.C26585i.m41092a(r5)     // Catch: java.lang.Throwable -> Lb9
            goto L92
        L59:
            r1 = move-exception
            goto L61
        L5b:
            r4 = move-exception
            r9 = r5
            r5 = r4
            goto L67
        L5f:
            r1 = move-exception
            r2 = r4
        L61:
            r4 = r5
            goto Lb2
        L63:
            r2 = move-exception
            r9 = r5
            r5 = r2
            r2 = r4
        L67:
            r4 = r9
            goto L6f
        L69:
            r1 = move-exception
            r2 = r4
            goto Lb2
        L6c:
            r2 = move-exception
            r5 = r2
            r2 = r4
        L6f:
            java.lang.String r6 = "NetworkAccessManager"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lb1
            r7.<init>()     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r8 = "cta getCacheData error: "
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r8 = r5.toString()     // Catch: java.lang.Throwable -> Lb1
            r7.append(r8)     // Catch: java.lang.Throwable -> Lb1
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Lb1
            com.p552ot.pubsub.util.C26586j.m41074b(r6, r7)     // Catch: java.lang.Throwable -> Lb1
            r5.printStackTrace()     // Catch: java.lang.Throwable -> Lb1
            com.p552ot.pubsub.util.C26585i.m41092a(r2)     // Catch: java.lang.Throwable -> Lb9
            com.p552ot.pubsub.util.C26585i.m41092a(r4)     // Catch: java.lang.Throwable -> Lb9
        L92:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lb9
            r4 = 100
            if (r2 <= r4) goto La7
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lb9
            int r2 = r2 - r4
            int r4 = r1.size()     // Catch: java.lang.Throwable -> Lb9
            java.util.List r1 = r1.subList(r2, r4)     // Catch: java.lang.Throwable -> Lb9
        La7:
            int r2 = r1.size()     // Catch: java.lang.Throwable -> Lb9
            if (r2 <= 0) goto Laf
            com.p552ot.pubsub.p559g.C26546i.f69537n = r3     // Catch: java.lang.Throwable -> Lb9
        Laf:
            monitor-exit(r0)
            return r1
        Lb1:
            r1 = move-exception
        Lb2:
            com.p552ot.pubsub.util.C26585i.m41092a(r2)     // Catch: java.lang.Throwable -> Lb9
            com.p552ot.pubsub.util.C26585i.m41092a(r4)     // Catch: java.lang.Throwable -> Lb9
            throw r1     // Catch: java.lang.Throwable -> Lb9
        Lb9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p552ot.pubsub.p559g.C26546i.m41244b():java.util.List");
    }

    /* renamed from: c */
    public static boolean m41241c() {
        return !f69538o && f69537n;
    }
}
