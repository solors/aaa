package com.bykv.p135vk.openvk.preload.geckox.p167a;

import com.bykv.p135vk.openvk.preload.geckox.p181f.ChannelUpdateLock;
import com.bykv.p135vk.openvk.preload.geckox.p181f.SelectChannelVersionLock;
import com.bykv.p135vk.openvk.preload.geckox.utils.AppUtils;
import com.bykv.p135vk.openvk.preload.geckox.utils.C6661b;
import com.bykv.p135vk.openvk.preload.geckox.utils.IOSerialExecutor;
import com.bykv.p135vk.openvk.preload.geckox.utils.PiecemealSerialExecutor;
import com.bykv.p135vk.openvk.preload.p155a.p156a.SerializedName;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bykv.vk.openvk.preload.geckox.a.c */
/* loaded from: classes3.dex */
public final class ChannelCleanHelper {
    @SerializedName(m91667a = "gecko_accesskey")

    /* renamed from: a */
    private List<String> f13963a;
    @SerializedName(m91667a = "os")

    /* renamed from: b */
    private int f13964b = 0;
    @SerializedName(m91667a = "msg_type")

    /* renamed from: c */
    private int f13965c = 1;

    public ChannelCleanHelper(List<String> list) {
        this.f13963a = list;
    }

    /* renamed from: a */
    public static void m91401a(final String str) {
        PiecemealSerialExecutor.m91214a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.1
            @Override // java.lang.Runnable
            public final void run() {
                try {
                    ChannelCleanHelper.m91398c(str);
                } catch (Throwable th) {
                    AppUtils.m91228a(new RuntimeException("delete old channel version failed，path：" + str, th));
                }
            }
        });
    }

    /* renamed from: b */
    public static boolean m91399b(String str) {
        try {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            String str2 = File.separator;
            sb2.append(str2);
            sb2.append("update.lock");
            ChannelUpdateLock m91273a = ChannelUpdateLock.m91273a(sb2.toString());
            if (m91273a == null) {
                return true;
            }
            SelectChannelVersionLock m91271a = SelectChannelVersionLock.m91271a(str + str2 + "select.lock");
            try {
                C6661b.m91220c(new File(str));
            } catch (Throwable unused) {
            }
            m91271a.m91272a();
            m91273a.m91274a();
            return true;
        } catch (Throwable unused2) {
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065 A[Catch: all -> 0x0097, LOOP:0: B:19:0x005f->B:21:0x0065, LOOP_END, TRY_LEAVE, TryCatch #1 {all -> 0x009c, blocks: (B:4:0x001c, B:23:0x0089, B:26:0x0090, B:5:0x0034, B:7:0x0044, B:9:0x0047, B:12:0x004c, B:15:0x0054, B:18:0x005b, B:19:0x005f, B:21:0x0065), top: B:36:0x001c }] */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static /* synthetic */ void m91398c(java.lang.String r4) throws java.lang.Exception {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
            java.lang.String r1 = java.io.File.separator
            r0.append(r1)
            java.lang.String r2 = "update.lock"
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.bykv.vk.openvk.preload.geckox.f.a r0 = com.bykv.p135vk.openvk.preload.geckox.p181f.ChannelUpdateLock.m91273a(r0)
            if (r0 == 0) goto La1
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L9c
            r2.<init>()     // Catch: java.lang.Throwable -> L9c
            r2.append(r4)     // Catch: java.lang.Throwable -> L9c
            r2.append(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = "select.lock"
            r2.append(r1)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Throwable -> L9c
            com.bykv.vk.openvk.preload.geckox.f.b r1 = com.bykv.p135vk.openvk.preload.geckox.p181f.SelectChannelVersionLock.m91271a(r1)     // Catch: java.lang.Throwable -> L9c
            java.io.File r2 = new java.io.File     // Catch: java.lang.Throwable -> L97
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L97
            com.bykv.vk.openvk.preload.geckox.a.c$2 r4 = new com.bykv.vk.openvk.preload.geckox.a.c$2     // Catch: java.lang.Throwable -> L97
            r4.<init>()     // Catch: java.lang.Throwable -> L97
            java.io.File[] r4 = r2.listFiles(r4)     // Catch: java.lang.Throwable -> L97
            if (r4 == 0) goto L51
            int r2 = r4.length     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L51
            int r2 = r4.length     // Catch: java.lang.Throwable -> L97
            r3 = 1
            if (r2 != r3) goto L4c
            goto L51
        L4c:
            java.util.List r4 = m91400a(r4)     // Catch: java.lang.Throwable -> L97
            goto L52
        L51:
            r4 = 0
        L52:
            if (r4 == 0) goto L90
            boolean r2 = r4.isEmpty()     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L5b
            goto L90
        L5b:
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> L97
        L5f:
            boolean r2 = r4.hasNext()     // Catch: java.lang.Throwable -> L97
            if (r2 == 0) goto L89
            java.lang.Object r2 = r4.next()     // Catch: java.lang.Throwable -> L97
            java.io.File r2 = (java.io.File) r2     // Catch: java.lang.Throwable -> L97
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L97
            r3.<init>()     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r2.getAbsolutePath()     // Catch: java.lang.Throwable -> L97
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = java.io.File.separator     // Catch: java.lang.Throwable -> L97
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = "using.lock"
            r3.append(r2)     // Catch: java.lang.Throwable -> L97
            java.lang.String r2 = r3.toString()     // Catch: java.lang.Throwable -> L97
            com.bykv.p135vk.openvk.preload.geckox.p181f.UsingLock.m91268c(r2)     // Catch: java.lang.Throwable -> L97
            goto L5f
        L89:
            r1.m91272a()     // Catch: java.lang.Throwable -> L9c
            r0.m91274a()
            return
        L90:
            r1.m91272a()     // Catch: java.lang.Throwable -> L9c
            r0.m91274a()
            return
        L97:
            r4 = move-exception
            r1.m91272a()     // Catch: java.lang.Throwable -> L9c
            throw r4     // Catch: java.lang.Throwable -> L9c
        L9c:
            r4 = move-exception
            r0.m91274a()
            throw r4
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bykv.p135vk.openvk.preload.geckox.p167a.ChannelCleanHelper.m91398c(java.lang.String):void");
    }

    /* renamed from: a */
    private static List<File> m91400a(File[] fileArr) {
        long j;
        ArrayList<File> arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        File file = null;
        long j2 = -1;
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (name.endsWith("--updating")) {
                arrayList.add(file2);
            } else if (name.endsWith("--pending-delete")) {
                m91402a(file2);
            } else {
                try {
                    long parseLong = Long.parseLong(name);
                    if (parseLong > j2) {
                        if (file != null) {
                            try {
                                arrayList2.add(file);
                            } catch (Exception unused) {
                                j2 = parseLong;
                                m91402a(file2);
                            }
                        }
                        file = file2;
                        j2 = parseLong;
                    } else {
                        arrayList2.add(file2);
                    }
                } catch (Exception unused2) {
                }
            }
        }
        for (File file3 : arrayList) {
            String name2 = file3.getName();
            int indexOf = name2.indexOf("--updating");
            if (indexOf == -1) {
                m91402a(file3);
            } else {
                try {
                    j = Long.parseLong(name2.substring(0, indexOf));
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    j = -1;
                }
                if (j <= j2) {
                    m91402a(file3);
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: a */
    private static void m91402a(final File file) {
        IOSerialExecutor.m91218a().execute(new Runnable() { // from class: com.bykv.vk.openvk.preload.geckox.a.c.3
            @Override // java.lang.Runnable
            public final void run() {
                C6661b.m91224a(file);
            }
        });
    }
}
