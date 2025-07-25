package com.p552ot.pubsub.util;

import android.text.TextUtils;
import android.util.LruCache;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/* renamed from: com.ot.pubsub.util.g */
/* loaded from: classes7.dex */
public class C26582g {

    /* renamed from: a */
    private static final String f69726a = "FileUtil";

    /* renamed from: b */
    private static final String f69727b = "onetrack";

    /* renamed from: c */
    private static final String f69728c = "tombstone";

    /* renamed from: d */
    private static LruCache<String, C26583a> f69729d = new C26584h(1048576);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.ot.pubsub.util.g$a */
    /* loaded from: classes7.dex */
    public static class C26583a {

        /* renamed from: a */
        String f69730a;

        private C26583a() {
        }

        /* synthetic */ C26583a(C26584h c26584h) {
            this();
        }
    }

    /* renamed from: a */
    public static void m41097a(String str, String str2) {
        Throwable th;
        BufferedWriter bufferedWriter;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        BufferedWriter bufferedWriter2 = null;
        try {
            C26583a c26583a = new C26583a(null);
            c26583a.f69730a = str2;
            f69729d.put(str, c26583a);
            String m41096b = m41096b();
            File file = new File(m41096b);
            if (!file.exists()) {
                file.mkdirs();
            }
            File file2 = new File(m41096b, str);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            bufferedWriter = new BufferedWriter(new FileWriter(file2), 1024);
        } catch (Exception e) {
            e = e;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            bufferedWriter.write(str2);
            bufferedWriter.flush();
        } catch (Exception e2) {
            bufferedWriter2 = bufferedWriter;
            e = e2;
            try {
                C26586j.m41069c(f69726a, "put error:" + e.toString());
                bufferedWriter = bufferedWriter2;
                C26585i.m41092a(bufferedWriter);
            } catch (Throwable th3) {
                th = th3;
                C26585i.m41092a(bufferedWriter2);
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            bufferedWriter2 = bufferedWriter;
            C26585i.m41092a(bufferedWriter2);
            throw th;
        }
        C26585i.m41092a(bufferedWriter);
    }

    /* renamed from: b */
    private static String m41096b() {
        return m41094c(f69727b);
    }

    /* renamed from: c */
    private static String m41094c(String str) {
        String str2 = C26577b.m41121a().getFilesDir().getAbsolutePath() + File.separator + str;
        File file = new File(str2);
        if (!file.exists()) {
            try {
                file.mkdirs();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return str2;
    }

    /* renamed from: b */
    public static void m41095b(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            f69729d.remove(str);
            File file = new File(m41096b(), str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Exception e) {
            C26586j.m41069c(f69726a, "clear error:" + e.toString());
        }
    }

    /* renamed from: a */
    public static String m41099a(String str) {
        BufferedReader bufferedReader;
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        C26583a c26583a = f69729d.get(str);
        if (c26583a != null) {
            return c26583a.f69730a;
        }
        BufferedReader bufferedReader2 = null;
        try {
            try {
                File file = new File(m41096b(), str);
                StringBuilder sb2 = new StringBuilder();
                if (file.exists()) {
                    bufferedReader = new BufferedReader(new FileReader(file));
                    while (true) {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                        } catch (Exception e) {
                            e = e;
                            bufferedReader2 = bufferedReader;
                            C26586j.m41069c(f69726a, "get error:" + e.toString());
                            C26585i.m41092a(bufferedReader2);
                            return "";
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            C26585i.m41092a(bufferedReader2);
                            throw th;
                        }
                    }
                } else {
                    bufferedReader = null;
                }
                String sb3 = sb2.toString();
                C26583a c26583a2 = new C26583a(null);
                c26583a2.f69730a = sb3;
                f69729d.put(str, c26583a2);
                C26585i.m41092a(bufferedReader);
                return sb3;
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    /* renamed from: a */
    public static String m41101a() {
        return m41094c(f69728c);
    }

    /* renamed from: a */
    public static String m41098a(String str, int i) {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            File file = new File(str);
            StringBuilder sb2 = new StringBuilder();
            if (file.exists()) {
                bufferedReader = new BufferedReader(new FileReader(file));
                do {
                    try {
                        try {
                            String readLine = bufferedReader.readLine();
                            if (readLine == null) {
                                break;
                            }
                            sb2.append(readLine);
                            sb2.append("\n");
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader2 = bufferedReader;
                            C26585i.m41092a(bufferedReader2);
                            throw th;
                        }
                    } catch (Exception e) {
                        e = e;
                        C26586j.m41069c(f69726a, "get error:" + e.toString());
                        C26585i.m41092a(bufferedReader);
                        return null;
                    }
                } while (sb2.length() <= i);
            } else {
                bufferedReader = null;
            }
            if (sb2.length() > i) {
                String substring = sb2.substring(0, i - 1);
                C26585i.m41092a(bufferedReader);
                return substring;
            }
            String sb3 = sb2.toString();
            C26585i.m41092a(bufferedReader);
            return sb3;
        } catch (Exception e2) {
            e = e2;
            bufferedReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    /* renamed from: a */
    public static void m41100a(File file) {
        try {
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        } catch (Exception e) {
            C26586j.m41069c(f69726a, "failed to remove file: " + file.getName() + "," + e.toString());
        }
    }
}
