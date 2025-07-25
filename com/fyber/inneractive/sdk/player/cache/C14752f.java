package com.fyber.inneractive.sdk.player.cache;

import com.fyber.inneractive.sdk.util.IAlog;
import com.ironsource.C21114v8;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* renamed from: com.fyber.inneractive.sdk.player.cache.f */
/* loaded from: classes4.dex */
public final class C14752f implements Closeable {

    /* renamed from: o */
    public static final Pattern f27951o = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: a */
    public final File f27952a;

    /* renamed from: b */
    public final File f27953b;

    /* renamed from: c */
    public final File f27954c;

    /* renamed from: d */
    public final File f27955d;

    /* renamed from: i */
    public BufferedWriter f27960i;

    /* renamed from: k */
    public int f27962k;

    /* renamed from: l */
    public InterfaceC14751e f27963l;

    /* renamed from: h */
    public long f27959h = 0;

    /* renamed from: j */
    public final LinkedHashMap f27961j = new LinkedHashMap(0, 0.75f, true);

    /* renamed from: m */
    public final ThreadPoolExecutor f27964m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    public final CallableC14747a f27965n = new CallableC14747a(this);

    /* renamed from: e */
    public final int f27956e = 0;

    /* renamed from: g */
    public final int f27958g = 1;

    /* renamed from: f */
    public final long f27957f = 52428800;

    static {
        new C14748b();
    }

    public C14752f(File file) {
        this.f27952a = file;
        this.f27953b = new File(file, "journal");
        this.f27954c = new File(file, "journal.tmp");
        this.f27955d = new File(file, "journal.bkp");
    }

    /* renamed from: b */
    public static C14752f m77646b(File file) {
        File file2 = new File(file, "journal.bkp");
        if (file2.exists()) {
            File file3 = new File(file, "journal");
            if (file3.exists()) {
                file2.delete();
            } else if (!file2.renameTo(file3)) {
                throw new IOException();
            }
        }
        C14752f c14752f = new C14752f(file);
        if (c14752f.f27953b.exists()) {
            try {
                c14752f.m77647b();
                c14752f.m77650a();
                return c14752f;
            } catch (IOException e) {
                PrintStream printStream = System.out;
                printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                IAlog.m76525e("DiskLruCache delete cache", new Object[0]);
                c14752f.close();
                AbstractC14757k.m77641a(c14752f.f27952a);
            }
        }
        file.mkdirs();
        C14752f c14752f2 = new C14752f(file);
        c14752f2.m77644c();
        return c14752f2;
    }

    /* renamed from: a */
    public final void m77648a(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f27961j.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C14750d c14750d = (C14750d) this.f27961j.get(substring);
            if (c14750d == null) {
                c14750d = new C14750d(this, substring);
                this.f27961j.put(substring, c14750d);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c14750d.f27948c = true;
                c14750d.f27949d = null;
                if (split.length == c14750d.f27950e.f27958g) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            c14750d.f27947b[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c14750d.f27949d = new C14749c(this, c14750d);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            } else {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* renamed from: c */
    public final synchronized void m77644c() {
        long[] jArr;
        BufferedWriter bufferedWriter = this.f27960i;
        if (bufferedWriter != null) {
            bufferedWriter.close();
        }
        BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27954c), AbstractC14757k.f27973a));
        bufferedWriter2.write("libcore.io.DiskLruCache");
        bufferedWriter2.write("\n");
        bufferedWriter2.write("1");
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f27956e));
        bufferedWriter2.write("\n");
        bufferedWriter2.write(Integer.toString(this.f27958g));
        bufferedWriter2.write("\n");
        bufferedWriter2.write("\n");
        for (C14750d c14750d : this.f27961j.values()) {
            if (c14750d.f27949d != null) {
                bufferedWriter2.write("DIRTY " + c14750d.f27946a + '\n');
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("CLEAN ");
                sb2.append(c14750d.f27946a);
                StringBuilder sb3 = new StringBuilder();
                for (long j : c14750d.f27947b) {
                    sb3.append(' ');
                    sb3.append(j);
                }
                sb2.append(sb3.toString());
                sb2.append('\n');
                bufferedWriter2.write(sb2.toString());
            }
        }
        bufferedWriter2.close();
        if (this.f27953b.exists()) {
            File file = this.f27953b;
            File file2 = this.f27955d;
            m77649a(file2);
            if (!file.renameTo(file2)) {
                throw new IOException();
            }
        }
        if (this.f27954c.renameTo(this.f27953b)) {
            this.f27955d.delete();
            this.f27960i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27953b, true), AbstractC14757k.f27973a));
        } else {
            throw new IOException();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f27960i == null) {
            return;
        }
        Iterator it = new ArrayList(this.f27961j.values()).iterator();
        while (it.hasNext()) {
            C14749c c14749c = ((C14750d) it.next()).f27949d;
            if (c14749c != null) {
                c14749c.m77651a();
            }
        }
        m77643d();
        this.f27960i.close();
        this.f27960i = null;
    }

    /* renamed from: d */
    public final void m77643d() {
        while (this.f27959h > this.f27957f) {
            String str = (String) ((Map.Entry) this.f27961j.entrySet().iterator().next()).getKey();
            InterfaceC14751e interfaceC14751e = this.f27963l;
            if (interfaceC14751e != null) {
                Iterator it = ((C14759m) interfaceC14751e).f27979d.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (((String) it.next()).equalsIgnoreCase(str)) {
                            boolean z = false;
                            for (String str2 : this.f27961j.keySet()) {
                                Iterator it2 = ((C14759m) this.f27963l).f27979d.iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        if (((String) it2.next()).equalsIgnoreCase(str2)) {
                                            break;
                                        }
                                    } else {
                                        z |= m77645b(str2);
                                        break;
                                    }
                                }
                            }
                            if (!z) {
                                return;
                            }
                        }
                    } else {
                        m77645b(str);
                        break;
                    }
                }
            } else {
                m77645b(str);
            }
        }
    }

    /* renamed from: b */
    public final void m77647b() {
        FileInputStream fileInputStream = new FileInputStream(this.f27953b);
        Charset charset = AbstractC14757k.f27973a;
        C14756j c14756j = new C14756j(fileInputStream);
        try {
            String m77642a = c14756j.m77642a();
            String m77642a2 = c14756j.m77642a();
            String m77642a3 = c14756j.m77642a();
            String m77642a4 = c14756j.m77642a();
            String m77642a5 = c14756j.m77642a();
            if (!"libcore.io.DiskLruCache".equals(m77642a) || !"1".equals(m77642a2) || !Integer.toString(this.f27956e).equals(m77642a3) || !Integer.toString(this.f27958g).equals(m77642a4) || !"".equals(m77642a5)) {
                throw new IOException("unexpected journal header: [" + m77642a + ", " + m77642a2 + ", " + m77642a4 + ", " + m77642a5 + C21114v8.C21123i.f54139e);
            }
            int i = 0;
            while (true) {
                try {
                    m77648a(c14756j.m77642a());
                    i++;
                } catch (EOFException unused) {
                    this.f27962k = i - this.f27961j.size();
                    if (c14756j.f27972e == -1) {
                        m77644c();
                    } else {
                        this.f27960i = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f27953b, true), AbstractC14757k.f27973a));
                    }
                    try {
                        c14756j.close();
                        return;
                    } catch (RuntimeException e) {
                        throw e;
                    } catch (Exception unused2) {
                        return;
                    }
                }
            }
        } catch (Throwable th) {
            try {
                c14756j.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    /* renamed from: a */
    public final void m77650a() {
        m77649a(this.f27954c);
        Iterator it = this.f27961j.values().iterator();
        while (it.hasNext()) {
            C14750d c14750d = (C14750d) it.next();
            int i = 0;
            if (c14750d.f27949d == null) {
                while (i < this.f27958g) {
                    this.f27959h += c14750d.f27947b[i];
                    i++;
                }
            } else {
                c14750d.f27949d = null;
                while (i < this.f27958g) {
                    m77649a(new File(c14750d.f27950e.f27952a, c14750d.f27946a + "." + i));
                    m77649a(new File(c14750d.f27950e.f27952a, c14750d.f27946a + "." + i + ".tmp"));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: b */
    public final synchronized boolean m77645b(String str) {
        IAlog.m76525e("DiskLruCache remove %s", str);
        if (this.f27960i != null) {
            if (f27951o.matcher(str).matches()) {
                C14750d c14750d = (C14750d) this.f27961j.get(str);
                if (c14750d != null && c14750d.f27949d == null) {
                    for (int i = 0; i < this.f27958g; i++) {
                        File file = new File(c14750d.f27950e.f27952a, c14750d.f27946a + "." + i);
                        if (file.exists() && !file.delete()) {
                            throw new IOException("failed to delete " + file);
                        }
                        long j = this.f27959h;
                        long[] jArr = c14750d.f27947b;
                        this.f27959h = j - jArr[i];
                        jArr[i] = 0;
                    }
                    this.f27962k++;
                    this.f27960i.append((CharSequence) ("REMOVE " + str + '\n'));
                    this.f27961j.remove(str);
                    int i2 = this.f27962k;
                    if (i2 >= 2000 && i2 >= this.f27961j.size()) {
                        this.f27964m.submit(this.f27965n);
                    }
                    return true;
                }
                return false;
            }
            throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
        }
        throw new IllegalStateException("cache is closed");
    }

    /* renamed from: a */
    public static void m77649a(File file) {
        IAlog.m76525e("DiskLruCache deleteIfExists - %s", file);
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }
}
