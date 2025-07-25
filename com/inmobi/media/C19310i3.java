package com.inmobi.media;

import com.ironsource.C21114v8;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import kotlin.collections.C37559r0;
import kotlin.jvm.internal.Intrinsics;
import p804nd.C38513v;

/* renamed from: com.inmobi.media.i3 */
/* loaded from: classes6.dex */
public final class C19310i3 implements Closeable {

    /* renamed from: p */
    public static final Pattern f48335p = Pattern.compile("[a-z0-9_-]{1,64}");

    /* renamed from: q */
    public static final C19240d3 f48336q = new C19240d3();

    /* renamed from: a */
    public final File f48337a;

    /* renamed from: b */
    public final File f48338b;

    /* renamed from: c */
    public final File f48339c;

    /* renamed from: d */
    public final File f48340d;

    /* renamed from: f */
    public final long f48342f;

    /* renamed from: g */
    public final C19557zc f48343g;

    /* renamed from: j */
    public BufferedWriter f48346j;

    /* renamed from: l */
    public int f48348l;

    /* renamed from: i */
    public long f48345i = 0;

    /* renamed from: k */
    public final LinkedHashMap f48347k = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: m */
    public long f48349m = 0;

    /* renamed from: n */
    public final ThreadPoolExecutor f48350n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: o */
    public final CallableC19226c3 f48351o = new CallableC19226c3(this);

    /* renamed from: e */
    public final int f48341e = 1;

    /* renamed from: h */
    public final int f48344h = 2;

    public C19310i3(File file, long j, C19557zc c19557zc) {
        this.f48337a = file;
        this.f48338b = new File(file, "journal");
        this.f48339c = new File(file, "journal.tmp");
        this.f48340d = new File(file, "journal.bkp");
        this.f48342f = j;
        this.f48343g = c19557zc;
    }

    /* renamed from: a */
    public static void m60254a(C19310i3 c19310i3, C19268f3 c19268f3, boolean z) {
        long[] jArr;
        synchronized (c19310i3) {
            C19282g3 c19282g3 = c19268f3.f48195a;
            if (c19282g3.f48249d == c19268f3) {
                if (z && !c19282g3.f48248c) {
                    for (int i = 0; i < c19310i3.f48344h; i++) {
                        if (c19268f3.f48196b[i]) {
                            if (!c19282g3.m60327b(i).exists()) {
                                m60254a(c19268f3.f48198d, c19268f3, false);
                                return;
                            }
                        } else {
                            m60254a(c19268f3.f48198d, c19268f3, false);
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        }
                    }
                }
                for (int i2 = 0; i2 < c19310i3.f48344h; i2++) {
                    File m60327b = c19282g3.m60327b(i2);
                    if (z) {
                        if (m60327b.exists()) {
                            File m60328a = c19282g3.m60328a(i2);
                            m60327b.renameTo(m60328a);
                            long j = c19282g3.f48247b[i2];
                            long length = m60328a.length();
                            c19282g3.f48247b[i2] = length;
                            c19310i3.f48345i = (c19310i3.f48345i - j) + length;
                        }
                    } else if (m60327b.exists() && !m60327b.delete()) {
                        throw new IOException();
                    }
                }
                c19310i3.f48348l++;
                c19282g3.f48249d = null;
                if (c19282g3.f48248c | z) {
                    c19282g3.f48248c = true;
                    BufferedWriter bufferedWriter = c19310i3.f48346j;
                    StringBuilder sb2 = new StringBuilder("CLEAN ");
                    sb2.append(c19282g3.f48246a);
                    StringBuilder sb3 = new StringBuilder();
                    for (long j2 : c19282g3.f48247b) {
                        sb3.append(' ');
                        sb3.append(j2);
                    }
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    bufferedWriter.write(sb2.toString());
                    if (z) {
                        c19310i3.f48349m++;
                    }
                } else {
                    c19310i3.f48347k.remove(c19282g3.f48246a);
                    c19310i3.f48346j.write("REMOVE " + c19282g3.f48246a + '\n');
                }
                c19310i3.f48346j.flush();
                if (c19310i3.f48345i > c19310i3.f48342f || c19310i3.m60255a()) {
                    c19310i3.f48350n.submit(c19310i3.f48351o);
                }
                return;
            }
            throw new IllegalStateException("CurrentEditor of Entry didn't match with CurrentEditor instance.");
        }
    }

    /* renamed from: b */
    public final void m60252b() {
        File file = this.f48339c;
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
        Iterator it = this.f48347k.values().iterator();
        while (it.hasNext()) {
            C19282g3 c19282g3 = (C19282g3) it.next();
            int i = 0;
            if (c19282g3.f48249d == null) {
                while (i < this.f48344h) {
                    this.f48345i += c19282g3.f48247b[i];
                    i++;
                }
            } else {
                c19282g3.f48249d = null;
                while (i < this.f48344h) {
                    File m60328a = c19282g3.m60328a(i);
                    if (m60328a.exists() && !m60328a.delete()) {
                        throw new IOException();
                    }
                    File m60327b = c19282g3.m60327b(i);
                    if (m60327b.exists() && !m60327b.delete()) {
                        throw new IOException();
                    }
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: c */
    public final void m60250c() {
        C19127Ua c19127Ua = new C19127Ua(new FileInputStream(this.f48338b), AbstractC19128Ub.f47847a);
        try {
            String m60639a = c19127Ua.m60639a();
            String m60639a2 = c19127Ua.m60639a();
            String m60639a3 = c19127Ua.m60639a();
            String m60639a4 = c19127Ua.m60639a();
            String m60639a5 = c19127Ua.m60639a();
            if (!"libcore.io.DiskLruCache".equals(m60639a) || !"1".equals(m60639a2) || !Integer.toString(this.f48341e).equals(m60639a3) || !Integer.toString(this.f48344h).equals(m60639a4) || !"".equals(m60639a5)) {
                throw new IOException("unexpected journal header: [" + m60639a + ", " + m60639a2 + ", " + m60639a4 + ", " + m60639a5 + C21114v8.C21123i.f54139e);
            }
            int i = 0;
            while (true) {
                try {
                    m60249c(c19127Ua.m60639a());
                    i++;
                } catch (EOFException unused) {
                    this.f48348l = i - this.f48347k.size();
                    AbstractC19128Ub.m60638a(c19127Ua);
                    return;
                }
            }
        } catch (Throwable th) {
            AbstractC19128Ub.m60638a(c19127Ua);
            throw th;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f48346j == null) {
            return;
        }
        Iterator it = new ArrayList(this.f48347k.values()).iterator();
        while (it.hasNext()) {
            C19268f3 c19268f3 = ((C19282g3) it.next()).f48249d;
            if (c19268f3 != null) {
                m60254a(c19268f3.f48198d, c19268f3, false);
            }
        }
        while (this.f48345i > this.f48342f) {
            m60247d((String) ((Map.Entry) this.f48347k.entrySet().iterator().next()).getKey());
        }
        this.f48346j.close();
        this.f48346j = null;
    }

    /* renamed from: d */
    public final synchronized void m60248d() {
        long[] jArr;
        BufferedWriter bufferedWriter = this.f48346j;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48339c), AbstractC19128Ub.f47847a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f48341e));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f48344h));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (C19282g3 c19282g3 : this.f48347k.values()) {
            if (c19282g3.f48249d != null) {
                bufferedWriter2.write("DIRTY " + c19282g3.f48246a + '\n');
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(c19282g3.f48246a);
                StringBuilder sb3 = new StringBuilder();
                for (long j : c19282g3.f48247b) {
                    sb3.append(' ');
                    sb3.append(j);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter2.write(sb2.toString());
            }
        }
        bufferedWriter2.close();
        if (this.f48338b.exists()) {
            File file = this.f48338b;
            File file2 = this.f48340d;
            if (file2.exists() && !file2.delete()) {
                throw new IOException();
            }
            if (!file.renameTo(file2)) {
                throw new IOException();
            }
        }
        if (this.f48339c.renameTo(this.f48338b)) {
            this.f48340d.delete();
            this.f48346j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f48338b, true), AbstractC19128Ub.f47847a));
        } else {
            throw new IOException();
        }
    }

    /* renamed from: c */
    public final void m60249c(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f48347k.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C19282g3 c19282g3 = (C19282g3) this.f48347k.get(substring);
            if (c19282g3 == null) {
                c19282g3 = new C19282g3(this, substring);
                this.f48347k.put(substring, c19282g3);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c19282g3.f48248c = true;
                c19282g3.f48249d = null;
                if (split.length == c19282g3.f48250e.f48344h) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            c19282g3.f48247b[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c19282g3.f48249d = new C19268f3(this, c19282g3);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            } else {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* renamed from: b */
    public final synchronized C19296h3 m60251b(String key) {
        InputStream inputStream;
        Map m17279o;
        if (this.f48346j != null) {
            if (f48335p.matcher(key).matches()) {
                C19282g3 c19282g3 = (C19282g3) this.f48347k.get(key);
                if (c19282g3 == null) {
                    return null;
                }
                if (c19282g3.f48248c) {
                    InputStream[] inputStreamArr = new InputStream[this.f48344h];
                    for (int i = 0; i < this.f48344h; i++) {
                        try {
                            inputStreamArr[i] = new FileInputStream(c19282g3.m60328a(i));
                        } catch (FileNotFoundException unused) {
                            if (this.f48343g != null) {
                                Intrinsics.checkNotNullParameter(key, "key");
                                m17279o = C37559r0.m17279o(C38513v.m14532a("urlKey", key));
                                C19262eb c19262eb = C19262eb.f48183a;
                                C19262eb.m60370b("ResourceDiskCacheFileMissing", m17279o, EnumC19332jb.f48415a);
                            }
                            for (int i2 = 0; i2 < this.f48344h && (inputStream = inputStreamArr[i2]) != null; i2++) {
                                AbstractC19128Ub.m60638a(inputStream);
                            }
                            return null;
                        }
                    }
                    this.f48348l++;
                    this.f48346j.append((CharSequence) ("READ " + key + '\n'));
                    if (m60255a()) {
                        this.f48350n.submit(this.f48351o);
                    }
                    return new C19296h3(inputStreamArr);
                }
                return null;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + key + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: d */
    public final synchronized void m60247d(String str) {
        Map m17279o;
        if (this.f48346j != null) {
            if (f48335p.matcher(str).matches()) {
                C19282g3 c19282g3 = (C19282g3) this.f48347k.get(str);
                if (c19282g3 != null && c19282g3.f48249d == null) {
                    for (int i = 0; i < this.f48344h; i++) {
                        File file = c19282g3.m60328a(i);
                        if (this.f48343g != null) {
                            Intrinsics.checkNotNullParameter(file, "file");
                            if (str != null && i == 0) {
                                String str2 = "";
                                try {
                                    String m60636a = AbstractC19128Ub.m60636a(new InputStreamReader(new FileInputStream(file), AbstractC19128Ub.f47848b));
                                    Intrinsics.checkNotNullExpressionValue(m60636a, "readFully(...)");
                                    str2 = m60636a;
                                } catch (Exception unused) {
                                }
                                m17279o = C37559r0.m17279o(C38513v.m14532a("urlKey", str), C38513v.m14532a("url", str2));
                                C19262eb c19262eb = C19262eb.f48183a;
                                C19262eb.m60370b("ResourceDiskCacheFileEvicted", m17279o, EnumC19332jb.f48415a);
                            }
                        }
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.f48345i;
                        long[] jArr = c19282g3.f48247b;
                        this.f48345i = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.f48348l++;
                    this.f48346j.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f48347k.remove(str);
                    if (m60255a()) {
                        this.f48350n.submit(this.f48351o);
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: a */
    public final C19268f3 m60253a(String str) {
        synchronized (this) {
            if (this.f48346j != null) {
                if (f48335p.matcher(str).matches()) {
                    C19282g3 c19282g3 = (C19282g3) this.f48347k.get(str);
                    if (c19282g3 == null) {
                        c19282g3 = new C19282g3(this, str);
                        this.f48347k.put(str, c19282g3);
                    } else if (c19282g3.f48249d != null) {
                        return null;
                    }
                    C19268f3 c19268f3 = new C19268f3(this, c19282g3);
                    c19282g3.f48249d = c19268f3;
                    BufferedWriter bufferedWriter = this.f48346j;
                    bufferedWriter.write("DIRTY " + str + '\n');
                    this.f48346j.flush();
                    return c19268f3;
                }
                throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,64}: \"" + str + "\"");
            }
            throw new IllegalStateException("cache is closed");
        }
    }

    /* renamed from: a */
    public final boolean m60255a() {
        int i = this.f48348l;
        return i >= 2000 && i >= this.f48347k.size();
    }
}
