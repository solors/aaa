package com.taurusx.tax.p606j.p615y;

import com.google.common.primitives.SignedBytes;
import com.google.common.primitives.UnsignedBytes;
import com.taurusx.tax.C28162a;
import com.taurusx.tax.p606j.C28517d;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.j.y.c */
/* loaded from: classes7.dex */
public final class C28553c implements Closeable {

    /* renamed from: o */
    public static final String f74009o;

    /* renamed from: p */
    public static final String f74010p;

    /* renamed from: q */
    public static final String f74011q;

    /* renamed from: r */
    public static final String f74012r;

    /* renamed from: s */
    public static final Pattern f74013s;

    /* renamed from: t */
    public static final String f74014t;

    /* renamed from: u */
    public static final String f74015u;

    /* renamed from: v */
    public static final String f74016v;

    /* renamed from: w */
    public static final String f74017w;

    /* renamed from: a */
    public final int f74018a;

    /* renamed from: b */
    public long f74019b;

    /* renamed from: c */
    public final int f74020c;

    /* renamed from: e */
    public Writer f74022e;

    /* renamed from: g */
    public int f74024g;

    /* renamed from: h */
    public final File f74025h;

    /* renamed from: i */
    public final File f74026i;

    /* renamed from: j */
    public final File f74027j;

    /* renamed from: k */
    public final File f74028k;

    /* renamed from: d */
    public long f74021d = 0;

    /* renamed from: f */
    public final LinkedHashMap<String, C28558c> f74023f = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: l */
    public long f74029l = 0;

    /* renamed from: m */
    public final ThreadPoolExecutor f74030m = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* renamed from: n */
    public final Callable<Void> f74031n = new CallableC28554a();

    /* renamed from: com.taurusx.tax.j.y.c$a */
    /* loaded from: classes7.dex */
    public class CallableC28554a implements Callable<Void> {
        public CallableC28554a() {
        }

        @Override // java.util.concurrent.Callable
        public Void call() throws Exception {
            synchronized (C28553c.this) {
                C28553c c28553c = C28553c.this;
                if (c28553c.f74022e != null) {
                    c28553c.m37938f();
                    if (C28553c.this.m37947b()) {
                        C28553c.this.m37942d();
                        C28553c.this.f74024g = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    /* renamed from: com.taurusx.tax.j.y.c$b */
    /* loaded from: classes7.dex */
    public final class C28555b {

        /* renamed from: a */
        public final C28558c f74033a;

        /* renamed from: b */
        public final boolean[] f74034b;

        /* renamed from: c */
        public boolean f74035c;

        public C28555b(C28558c c28558c) {
            boolean[] zArr;
            this.f74033a = c28558c;
            if (c28558c.f74040c) {
                zArr = null;
            } else {
                zArr = new boolean[C28553c.this.f74020c];
            }
            this.f74034b = zArr;
        }

        /* renamed from: com.taurusx.tax.j.y.c$b$b */
        /* loaded from: classes7.dex */
        public class C28557b extends FilterOutputStream {
            public C28557b(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C28555b.this.f74035c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C28555b.this.f74035c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C28555b.this.f74035c = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C28555b.this.f74035c = true;
                }
            }
        }

        /* renamed from: a */
        public OutputStream m37936a(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C28557b c28557b;
            synchronized (C28553c.this) {
                C28558c c28558c = this.f74033a;
                if (c28558c.f74041d == this) {
                    if (!c28558c.f74040c) {
                        this.f74034b[i] = true;
                    }
                    File m37929b = c28558c.m37929b(i);
                    try {
                        fileOutputStream = new FileOutputStream(m37929b);
                    } catch (FileNotFoundException unused) {
                        C28553c.this.f74025h.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(m37929b);
                        } catch (FileNotFoundException unused2) {
                            return new C28556a(this);
                        }
                    }
                    c28557b = new C28557b(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c28557b;
        }

        /* renamed from: a */
        public void m37937a() throws IOException {
            C28553c.m37953a(C28553c.this, this, false);
        }

        /* renamed from: com.taurusx.tax.j.y.c$b$a */
        /* loaded from: classes7.dex */
        public class C28556a extends OutputStream {
            public C28556a(C28555b c28555b) {
            }

            @Override // java.io.OutputStream
            public void write(int i) throws IOException {
            }
        }
    }

    /* renamed from: com.taurusx.tax.j.y.c$c */
    /* loaded from: classes7.dex */
    public final class C28558c {

        /* renamed from: a */
        public final String f74038a;

        /* renamed from: b */
        public final long[] f74039b;

        /* renamed from: c */
        public boolean f74040c;

        /* renamed from: d */
        public C28555b f74041d;

        /* renamed from: e */
        public long f74042e;

        public C28558c(String str) {
            this.f74038a = str;
            this.f74039b = new long[C28553c.this.f74020c];
        }

        /* renamed from: b */
        public File m37929b(int i) {
            File file = C28553c.this.f74025h;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f74038a);
            StringFogImpl stringFogImpl = C28162a.f73047a;
            sb2.append(stringFogImpl.m23824a(new byte[]{30}, new byte[]{48, 17}));
            sb2.append(i);
            sb2.append(stringFogImpl.m23824a(new byte[]{107, -87, 40, -83}, new byte[]{69, -35}));
            return new File(file, sb2.toString());
        }

        /* renamed from: a */
        public String m37934a() throws IOException {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j : this.f74039b) {
                sb2.append(' ');
                sb2.append(j);
            }
            return sb2.toString();
        }

        /* renamed from: a */
        public final IOException m37930a(String[] strArr) throws IOException {
            throw new IOException(C28162a.f73047a.m23824a(new byte[]{-101, SignedBytes.MAX_POWER_OF_TWO, -117, 86, -98, 75, -115, 90, -117, 74, -50, 68, -127, 91, -100, SignedBytes.MAX_POWER_OF_TWO, -113, 66, -50, 66, -121, SignedBytes.MAX_POWER_OF_TWO, -117, 20, -50}, new byte[]{-18, 46}) + Arrays.toString(strArr));
        }

        /* renamed from: a */
        public File m37933a(int i) {
            File file = C28553c.this.f74025h;
            return new File(file, this.f74038a + C28162a.f73047a.m23824a(new byte[]{104}, new byte[]{70, 63}) + i);
        }
    }

    /* renamed from: com.taurusx.tax.j.y.c$d */
    /* loaded from: classes7.dex */
    public final class C28559d implements Closeable {

        /* renamed from: a */
        public final InputStream[] f74044a;

        public C28559d(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f74044a = inputStreamArr;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.f74044a) {
                C28553c.this.m37952a(inputStream);
            }
        }
    }

    static {
        StringFogImpl stringFogImpl = C28162a.f73047a;
        f74009o = stringFogImpl.m23824a(new byte[]{105, 28, 118, 1, 109, 18, 111}, new byte[]{3, 115});
        stringFogImpl.m23824a(new byte[]{66, 96, 93, 125, 70, 110, 68, 33, 92, 98, 88}, new byte[]{40, 15});
        f74010p = stringFogImpl.m23824a(new byte[]{-81, -117, -80, -106, -85, -123, -87, -54, -89, -113, -75}, new byte[]{-59, -28});
        f74011q = stringFogImpl.m23824a(new byte[]{101, -80, 107, -70, 102, -85, 108, -9, 96, -74, 39, -99, 96, -86, 98, -107, 123, -84, 74, -72, 106, -79, 108}, new byte[]{9, -39});
        f74012r = stringFogImpl.m23824a(new byte[]{116}, new byte[]{69, 88});
        f74014t = stringFogImpl.m23824a(new byte[]{-17, 37, -23, 40, -30}, new byte[]{-84, 105});
        f74015u = stringFogImpl.m23824a(new byte[]{-56, 110, -34, 115, -43}, new byte[]{-116, 39});
        f74016v = stringFogImpl.m23824a(new byte[]{-73, 74, -88, SignedBytes.MAX_POWER_OF_TWO, -77, 74}, new byte[]{-27, 15});
        f74017w = stringFogImpl.m23824a(new byte[]{20, 89, 7, 88}, new byte[]{70, 28});
        f74013s = Pattern.compile(stringFogImpl.m23824a(new byte[]{-121, 114, -15, 105, -20, 62, -27, 76, -15, 78, -89, 34, -16, 37, -24, 110}, new byte[]{-36, 19}));
    }

    public C28553c(File file, int i, int i2, long j) {
        this.f74025h = file;
        this.f74018a = i;
        this.f74026i = new File(file, C28162a.m38504a(new byte[]{-33, 65, -64, 92, -37, 79, -39}, new byte[]{-75, 46}));
        this.f74027j = new File(file, C28162a.m38504a(new byte[]{83, 122, 76, 103, 87, 116, 85, 59, 77, 120, 73}, new byte[]{57, 21}));
        this.f74028k = new File(file, C28162a.m38504a(new byte[]{116, 13, 107, 16, 112, 3, 114, 76, 124, 9, 110}, new byte[]{30, 98}));
        this.f74020c = i2;
        this.f74019b = j;
    }

    /* renamed from: b */
    public static void m37946b(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: c */
    public final void m37943c(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                String str2 = f74016v;
                if (indexOf == str2.length() && str.startsWith(str2)) {
                    this.f74023f.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C28558c c28558c = this.f74023f.get(substring);
            if (c28558c == null) {
                c28558c = new C28558c(substring);
                this.f74023f.put(substring, c28558c);
            }
            if (indexOf2 != -1) {
                String str3 = f74014t;
                if (indexOf == str3.length() && str.startsWith(str3)) {
                    String[] split = str.substring(indexOf2 + 1).split(" ");
                    c28558c.f74040c = true;
                    c28558c.f74041d = null;
                    if (split.length == C28553c.this.f74020c) {
                        for (int i2 = 0; i2 < split.length; i2++) {
                            try {
                                c28558c.f74039b[i2] = Long.parseLong(split[i2]);
                            } catch (NumberFormatException unused) {
                                c28558c.m37930a(split);
                                throw null;
                            }
                        }
                        return;
                    }
                    c28558c.m37930a(split);
                    throw null;
                }
            }
            if (indexOf2 == -1) {
                String str4 = f74015u;
                if (indexOf == str4.length() && str.startsWith(str4)) {
                    c28558c.f74041d = new C28555b(c28558c);
                    return;
                }
            }
            if (indexOf2 == -1) {
                String str5 = f74017w;
                if (indexOf == str5.length() && str.startsWith(str5)) {
                    return;
                }
            }
            throw new IOException(C28162a.f73047a.m23824a(new byte[]{-63, 90, -47, 76, -60, 81, -41, SignedBytes.MAX_POWER_OF_TWO, -47, 80, -108, 94, -37, 65, -58, 90, -43, 88, -108, 88, -35, 90, -47, 14, -108}, new byte[]{-76, 52}) + str);
        }
        throw new IOException(C28162a.f73047a.m23824a(new byte[]{0, 119, 16, 97, 5, 124, 22, 109, 16, 125, 85, 115, 26, 108, 7, 119, 20, 117, 85, 117, 28, 119, 16, 35, 85}, new byte[]{117, 25}) + str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f74022e == null) {
            return;
        }
        Iterator it = new ArrayList(this.f74023f.values()).iterator();
        while (it.hasNext()) {
            C28555b c28555b = ((C28558c) it.next()).f74041d;
            if (c28555b != null) {
                c28555b.m37937a();
            }
        }
        m37938f();
        this.f74022e.close();
        this.f74022e = null;
    }

    /* renamed from: d */
    public final synchronized void m37942d() throws IOException {
        Writer writer = this.f74022e;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f74027j), C28517d.f73959a));
        bufferedWriter.write(f74011q);
        bufferedWriter.write("\n");
        bufferedWriter.write(f74012r);
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f74018a));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f74020c));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C28558c c28558c : this.f74023f.values()) {
            if (c28558c.f74041d != null) {
                bufferedWriter.write(C28162a.f73047a.m23824a(new byte[]{-118, -76, -100, -87, -105, -35}, new byte[]{-50, -3}) + c28558c.f74038a + '\n');
            } else {
                bufferedWriter.write(C28162a.f73047a.m23824a(new byte[]{-31, 72, -25, 69, -20, 36}, new byte[]{-94, 4}) + c28558c.f74038a + c28558c.m37934a() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f74026i.exists()) {
            m37949a(this.f74026i, this.f74028k, true);
        }
        m37949a(this.f74027j, this.f74026i, false);
        this.f74028k.delete();
        this.f74022e = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f74026i, true), C28517d.f73959a));
    }

    /* renamed from: e */
    public final void m37940e() throws IOException {
        C28551b c28551b = new C28551b(new FileInputStream(this.f74026i), 8192, C28517d.f73959a);
        try {
            String m37956b = c28551b.m37956b();
            String m37956b2 = c28551b.m37956b();
            String m37956b3 = c28551b.m37956b();
            String m37956b4 = c28551b.m37956b();
            String m37956b5 = c28551b.m37956b();
            int i = 0;
            if (!f74011q.equals(m37956b) || !f74012r.equals(m37956b2) || !Integer.toString(this.f74018a).equals(m37956b3) || !Integer.toString(this.f74020c).equals(m37956b4) || !"".equals(m37956b5)) {
                StringBuilder sb2 = new StringBuilder();
                StringFogImpl stringFogImpl = C28162a.f73047a;
                sb2.append(stringFogImpl.m23824a(new byte[]{36, -32, 52, -10, 33, -21, 50, -6, 52, -22, 113, -28, 62, -5, 35, -32, 48, -30, 113, -26, 52, -17, 53, -21, 35, -76, 113, -43}, new byte[]{81, -114}));
                sb2.append(m37956b);
                sb2.append(stringFogImpl.m23824a(new byte[]{41, 101}, new byte[]{5, 69}));
                sb2.append(m37956b2);
                sb2.append(stringFogImpl.m23824a(new byte[]{-32, -84}, new byte[]{-52, -116}));
                sb2.append(m37956b4);
                sb2.append(stringFogImpl.m23824a(new byte[]{-80, 114}, new byte[]{-100, 82}));
                sb2.append(m37956b5);
                sb2.append(stringFogImpl.m23824a(new byte[]{6}, new byte[]{91, 104}));
                throw new IOException(sb2.toString());
            }
            while (true) {
                try {
                    m37943c(c28551b.m37956b());
                    i++;
                } catch (EOFException unused) {
                    this.f74024g = i - this.f74023f.size();
                    m37952a(c28551b);
                    return;
                }
            }
        } catch (Throwable th) {
            m37952a(c28551b);
            throw th;
        }
    }

    /* renamed from: f */
    public final void m37938f() throws IOException {
        while (this.f74021d > this.f74019b) {
            m37941d(this.f74023f.entrySet().iterator().next().getKey());
        }
    }

    /* renamed from: a */
    public static C28553c m37950a(File file, int i, int i2, long j) throws IOException {
        if (j <= 0) {
            throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -52, -107, -2, -124, -41, -120, -115, -47, -112, -51, -99}, new byte[]{-19, -83}));
        } else if (i2 > 0) {
            File file2 = new File(file, f74010p);
            if (file2.exists()) {
                File file3 = new File(file, f74009o);
                if (file3.exists()) {
                    file2.delete();
                } else {
                    m37949a(file2, file3, false);
                }
            }
            C28553c c28553c = new C28553c(file, i, i2, j);
            if (c28553c.f74026i.exists()) {
                try {
                    c28553c.m37940e();
                    c28553c.m37944c();
                    c28553c.f74022e = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(c28553c.f74026i, true), C28517d.f73959a));
                    return c28553c;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    StringBuilder sb2 = new StringBuilder();
                    StringFogImpl stringFogImpl = C28162a.f73047a;
                    sb2.append(stringFogImpl.m23824a(new byte[]{-23, -98, -34, -100, -31, -123, -40, -76, -52, -108, -59, -110, -115}, new byte[]{-83, -9}));
                    sb2.append(file);
                    sb2.append(stringFogImpl.m23824a(new byte[]{90, 33, 9, 104, 25, 39, 8, 58, 15, 56, 14, 114, 90}, new byte[]{122, 72}));
                    sb2.append(e.getMessage());
                    sb2.append(stringFogImpl.m23824a(new byte[]{81, 31, 15, 90, 16, 80, 11, 86, 19, 88}, new byte[]{125, 63}));
                    printStream.println(sb2.toString());
                    c28553c.close();
                    c28553c.m37951a(c28553c.f74025h);
                }
            }
            file.mkdirs();
            C28553c c28553c2 = new C28553c(file, i, i2, j);
            c28553c2.m37942d();
            return c28553c2;
        } else {
            throw new IllegalArgumentException(C28162a.f73047a.m23824a(new byte[]{-7, 40, -29, 60, -22, 10, -32, 60, -31, 61, -81, 117, -78, 105, -65}, new byte[]{-113, 73}));
        }
    }

    /* renamed from: b */
    public synchronized C28559d m37945b(String str) throws IOException {
        InputStream inputStream;
        m37955a();
        m37939e(str);
        C28558c c28558c = this.f74023f.get(str);
        if (c28558c == null) {
            return null;
        }
        if (c28558c.f74040c) {
            InputStream[] inputStreamArr = new InputStream[this.f74020c];
            for (int i = 0; i < this.f74020c; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(c28558c.m37933a(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.f74020c && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        m37952a(inputStream);
                    }
                    return null;
                }
            }
            this.f74024g++;
            this.f74022e.append((CharSequence) (C28162a.f73047a.m23824a(new byte[]{-14, 30, -31, 31, UnsignedBytes.MAX_POWER_OF_TWO}, new byte[]{-96, 91}) + str + '\n'));
            if (m37947b()) {
                this.f74030m.submit(this.f74031n);
            }
            return new C28559d(str, c28558c.f74042e, inputStreamArr, c28558c.f74039b);
        }
        return null;
    }

    /* renamed from: b */
    public final boolean m37947b() {
        int i = this.f74024g;
        return i >= 2000 && i >= this.f74023f.size();
    }

    /* renamed from: e */
    public final void m37939e(String str) {
        if (f74013s.matcher(str).matches()) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        StringFogImpl stringFogImpl = C28162a.f73047a;
        sb2.append(stringFogImpl.m23824a(new byte[]{-12, 63, -26, 41, -65, 55, -22, 41, -21, 122, -14, 59, -21, 57, -9, 122, -19, 63, -8, 63, -25, 122, -60, 59, -78, 32, -81, 119, -90, 5, -78, 7, -28, 107, -77, 108, -85, 39, -91, 122, -67}, new byte[]{-97, 90}));
        sb2.append(str);
        sb2.append(stringFogImpl.m23824a(new byte[]{-77}, new byte[]{-111, 34}));
        throw new IllegalArgumentException(sb2.toString());
    }

    /* renamed from: c */
    public final void m37944c() throws IOException {
        m37946b(this.f74027j);
        Iterator<C28558c> it = this.f74023f.values().iterator();
        while (it.hasNext()) {
            C28558c next = it.next();
            int i = 0;
            if (next.f74041d == null) {
                while (i < this.f74020c) {
                    this.f74021d += next.f74039b[i];
                    i++;
                }
            } else {
                next.f74041d = null;
                while (i < this.f74020c) {
                    m37946b(next.m37933a(i));
                    m37946b(next.m37929b(i));
                    i++;
                }
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public static void m37949a(File file, File file2, boolean z) throws IOException {
        if (z) {
            m37946b(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: d */
    public synchronized boolean m37941d(String str) throws IOException {
        m37955a();
        m37939e(str);
        C28558c c28558c = this.f74023f.get(str);
        if (c28558c != null && c28558c.f74041d == null) {
            for (int i = 0; i < this.f74020c; i++) {
                File m37933a = c28558c.m37933a(i);
                if (m37933a.exists() && !m37933a.delete()) {
                    throw new IOException(C28162a.f73047a.m23824a(new byte[]{-11, -52, -6, -63, -10, -55, -77, -39, -4, -115, -9, -56, -1, -56, -25, -56, -77}, new byte[]{-109, -83}) + m37933a);
                }
                long j = this.f74021d;
                long[] jArr = c28558c.f74039b;
                this.f74021d = j - jArr[i];
                jArr[i] = 0;
            }
            this.f74024g++;
            this.f74022e.append((CharSequence) (C28162a.f73047a.m23824a(new byte[]{-58, 33, -39, 43, -62, 33, -76}, new byte[]{-108, 100}) + str + '\n'));
            this.f74023f.remove(str);
            if (m37947b()) {
                this.f74030m.submit(this.f74031n);
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C28555b m37948a(String str) throws IOException {
        synchronized (this) {
            m37955a();
            m37939e(str);
            C28558c c28558c = this.f74023f.get(str);
            if (c28558c == null) {
                c28558c = new C28558c(str);
                this.f74023f.put(str, c28558c);
            } else if (c28558c.f74041d != null) {
                return null;
            }
            C28555b c28555b = new C28555b(c28558c);
            c28558c.f74041d = c28555b;
            Writer writer = this.f74022e;
            writer.write(C28162a.f73047a.m23824a(new byte[]{-36, 94, -54, 67, -63, 55}, new byte[]{-104, 23}) + str + '\n');
            this.f74022e.flush();
            return c28555b;
        }
    }

    /* renamed from: a */
    public final void m37955a() {
        if (this.f74022e != null) {
            return;
        }
        throw new IllegalStateException(C28162a.f73047a.m23824a(new byte[]{-8, 76, -8, 69, -2, 13, -14, 94, -69, 78, -9, 66, -24, 72, -1}, new byte[]{-101, 45}));
    }

    /* renamed from: a */
    public static void m37953a(C28553c c28553c, C28555b c28555b, boolean z) throws IOException {
        synchronized (c28553c) {
            C28558c c28558c = c28555b.f74033a;
            if (c28558c.f74041d == c28555b) {
                if (z && !c28558c.f74040c) {
                    for (int i = 0; i < c28553c.f74020c; i++) {
                        if (c28555b.f74034b[i]) {
                            if (!c28558c.m37929b(i).exists()) {
                                c28555b.m37937a();
                                return;
                            }
                        } else {
                            c28555b.m37937a();
                            throw new IllegalStateException(C28162a.f73047a.m23824a(new byte[]{-53, 67, -14, 74, -4, 6, -26, 84, -32, 71, -15, 67, -31, 6, -32, 72, -15, 84, -4, 6, -31, 79, -31, 72, -94, 82, -91, 69, -9, 67, -28, 82, -32, 6, -13, 71, -23, 83, -32, 6, -29, 73, -9, 6, -20, 72, -31, 67, -3, 6}, new byte[]{-123, 38}) + i);
                        }
                    }
                }
                for (int i2 = 0; i2 < c28553c.f74020c; i2++) {
                    File m37929b = c28558c.m37929b(i2);
                    if (z) {
                        if (m37929b.exists()) {
                            File m37933a = c28558c.m37933a(i2);
                            m37929b.renameTo(m37933a);
                            long j = c28558c.f74039b[i2];
                            long length = m37933a.length();
                            c28558c.f74039b[i2] = length;
                            c28553c.f74021d = (c28553c.f74021d - j) + length;
                        }
                    } else {
                        m37946b(m37929b);
                    }
                }
                c28553c.f74024g++;
                c28558c.f74041d = null;
                if (c28558c.f74040c | z) {
                    c28558c.f74040c = true;
                    c28553c.f74022e.write(C28162a.f73047a.m23824a(new byte[]{-123, 105, -125, 100, -120, 5}, new byte[]{-58, 37}) + c28558c.f74038a + c28558c.m37934a() + '\n');
                    if (z) {
                        long j2 = c28553c.f74029l;
                        c28553c.f74029l = 1 + j2;
                        c28558c.f74042e = j2;
                    }
                } else {
                    c28553c.f74023f.remove(c28558c.f74038a);
                    c28553c.f74022e.write(C28162a.f73047a.m23824a(new byte[]{114, 98, 109, 104, 118, 98, 0}, new byte[]{32, 39}) + c28558c.f74038a + '\n');
                }
                c28553c.f74022e.flush();
                if (c28553c.f74021d > c28553c.f74019b || c28553c.m37947b()) {
                    c28553c.f74030m.submit(c28553c.f74031n);
                }
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    public final void m37951a(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    m37951a(file2);
                }
                if (!file2.delete()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(C28162a.f73047a.m23824a(new byte[]{-26, -17, -23, -30, -27, -22, -96, -6, -17, -82, -28, -21, -20, -21, -12, -21, -96, -24, -23, -30, -27, -76, -96}, new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -114}));
                    sb2.append(file2);
                    throw new IOException(sb2.toString());
                }
            }
            return;
        }
        throw new IOException(C28162a.f73047a.m23824a(new byte[]{39, -26, 61, -87, 40, -87, 59, -20, 40, -19, 40, -21, 37, -20, 105, -19, 32, -5, 44, -22, 61, -26, 59, -16, 115, -87}, new byte[]{73, -119}) + file);
    }

    /* renamed from: a */
    public final void m37952a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }
}
