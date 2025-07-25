package com.android.volley.toolbox;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.android.volley.Cache;
import com.android.volley.Header;
import com.android.volley.VolleyLog;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.android.volley.toolbox.d */
/* loaded from: classes2.dex */
public class DiskBasedCache implements Cache {

    /* renamed from: a */
    private final Map<String, C3760b> f3516a;

    /* renamed from: b */
    private long f3517b;

    /* renamed from: c */
    private final InterfaceC3762d f3518c;

    /* renamed from: d */
    private final int f3519d;

    /* compiled from: DiskBasedCache.java */
    /* renamed from: com.android.volley.toolbox.d$a */
    /* loaded from: classes2.dex */
    class C3759a implements InterfaceC3762d {

        /* renamed from: a */
        final /* synthetic */ File f3520a;

        C3759a(File file) {
            this.f3520a = file;
        }

        @Override // com.android.volley.toolbox.DiskBasedCache.InterfaceC3762d
        public File get() {
            return this.f3520a;
        }
    }

    /* compiled from: DiskBasedCache.java */
    /* renamed from: com.android.volley.toolbox.d$d */
    /* loaded from: classes2.dex */
    public interface InterfaceC3762d {
        File get();
    }

    public DiskBasedCache(File file, int i) {
        this.f3516a = new LinkedHashMap(16, 0.75f, true);
        this.f3517b = 0L;
        this.f3518c = new C3759a(file);
        this.f3519d = i;
    }

    /* renamed from: f */
    private String m102260f(String str) {
        int length = str.length() / 2;
        String valueOf = String.valueOf(str.substring(0, length).hashCode());
        return valueOf + String.valueOf(str.substring(length).hashCode());
    }

    /* renamed from: g */
    private void m102259g() {
        if (!this.f3518c.get().exists()) {
            VolleyLog.m102197b("Re-initializing cache after external clearing.", new Object[0]);
            this.f3516a.clear();
            this.f3517b = 0L;
            initialize();
        }
    }

    /* renamed from: h */
    private void m102258h() {
        if (this.f3517b < this.f3519d) {
            return;
        }
        if (VolleyLog.f3552b) {
            VolleyLog.m102194e("Pruning old cache entries.", new Object[0]);
        }
        long j = this.f3517b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator<Map.Entry<String, C3760b>> it = this.f3516a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            C3760b value = it.next().getValue();
            if (m102261e(value.f3523b).delete()) {
                this.f3517b -= value.f3522a;
            } else {
                String str = value.f3523b;
                VolleyLog.m102197b("Could not delete cache entry for key=%s, filename=%s", str, m102260f(str));
            }
            it.remove();
            i++;
            if (((float) this.f3517b) < this.f3519d * 0.9f) {
                break;
            }
        }
        if (VolleyLog.f3552b) {
            VolleyLog.m102194e("pruned %d files, %d bytes, %d ms", Integer.valueOf(i), Long.valueOf(this.f3517b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    /* renamed from: i */
    private void m102257i(String str, C3760b c3760b) {
        if (!this.f3516a.containsKey(str)) {
            this.f3517b += c3760b.f3522a;
        } else {
            this.f3517b += c3760b.f3522a - this.f3516a.get(str).f3522a;
        }
        this.f3516a.put(str, c3760b);
    }

    /* renamed from: j */
    private static int m102256j(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            return read;
        }
        throw new EOFException();
    }

    /* renamed from: k */
    static List<Header> m102255k(C3761c c3761c) throws IOException {
        List<Header> arrayList;
        int m102254l = m102254l(c3761c);
        if (m102254l >= 0) {
            if (m102254l == 0) {
                arrayList = Collections.emptyList();
            } else {
                arrayList = new ArrayList<>();
            }
            for (int i = 0; i < m102254l; i++) {
                arrayList.add(new Header(m102252n(c3761c).intern(), m102252n(c3761c).intern()));
            }
            return arrayList;
        }
        throw new IOException("readHeaderList size=" + m102254l);
    }

    /* renamed from: l */
    static int m102254l(InputStream inputStream) throws IOException {
        return (m102256j(inputStream) << 24) | (m102256j(inputStream) << 0) | 0 | (m102256j(inputStream) << 8) | (m102256j(inputStream) << 16);
    }

    /* renamed from: m */
    static long m102253m(InputStream inputStream) throws IOException {
        return ((m102256j(inputStream) & 255) << 0) | 0 | ((m102256j(inputStream) & 255) << 8) | ((m102256j(inputStream) & 255) << 16) | ((m102256j(inputStream) & 255) << 24) | ((m102256j(inputStream) & 255) << 32) | ((m102256j(inputStream) & 255) << 40) | ((m102256j(inputStream) & 255) << 48) | ((255 & m102256j(inputStream)) << 56);
    }

    /* renamed from: n */
    static String m102252n(C3761c c3761c) throws IOException {
        return new String(m102249q(c3761c, m102253m(c3761c)), "UTF-8");
    }

    /* renamed from: p */
    private void m102250p(String str) {
        C3760b remove = this.f3516a.remove(str);
        if (remove != null) {
            this.f3517b -= remove.f3522a;
        }
    }

    @VisibleForTesting
    /* renamed from: q */
    static byte[] m102249q(C3761c c3761c, long j) throws IOException {
        long m102240a = c3761c.m102240a();
        if (j >= 0 && j <= m102240a) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c3761c).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + m102240a);
    }

    /* renamed from: r */
    static void m102248r(List<Header> list, OutputStream outputStream) throws IOException {
        if (list != null) {
            m102247s(outputStream, list.size());
            for (Header header : list) {
                m102245u(outputStream, header.m102295a());
                m102245u(outputStream, header.m102294b());
            }
            return;
        }
        m102247s(outputStream, 0);
    }

    /* renamed from: s */
    static void m102247s(OutputStream outputStream, int i) throws IOException {
        outputStream.write((i >> 0) & 255);
        outputStream.write((i >> 8) & 255);
        outputStream.write((i >> 16) & 255);
        outputStream.write((i >> 24) & 255);
    }

    /* renamed from: t */
    static void m102246t(OutputStream outputStream, long j) throws IOException {
        outputStream.write((byte) (j >>> 0));
        outputStream.write((byte) (j >>> 8));
        outputStream.write((byte) (j >>> 16));
        outputStream.write((byte) (j >>> 24));
        outputStream.write((byte) (j >>> 32));
        outputStream.write((byte) (j >>> 40));
        outputStream.write((byte) (j >>> 48));
        outputStream.write((byte) (j >>> 56));
    }

    /* renamed from: u */
    static void m102245u(OutputStream outputStream, String str) throws IOException {
        byte[] bytes = str.getBytes("UTF-8");
        m102246t(outputStream, bytes.length);
        outputStream.write(bytes, 0, bytes.length);
    }

    @Override // com.android.volley.Cache
    /* renamed from: a */
    public synchronized void mo102265a(String str, boolean z) {
        Cache.C3744a c3744a = get(str);
        if (c3744a != null) {
            c3744a.f3450f = 0L;
            if (z) {
                c3744a.f3449e = 0L;
            }
            mo102264b(str, c3744a);
        }
    }

    @Override // com.android.volley.Cache
    /* renamed from: b */
    public synchronized void mo102264b(String str, Cache.C3744a c3744a) {
        BufferedOutputStream bufferedOutputStream;
        C3760b c3760b;
        long j = this.f3517b;
        byte[] bArr = c3744a.f3445a;
        long length = j + bArr.length;
        int i = this.f3519d;
        if (length > i && bArr.length > i * 0.9f) {
            return;
        }
        File m102261e = m102261e(str);
        try {
            bufferedOutputStream = new BufferedOutputStream(m102262d(m102261e));
            c3760b = new C3760b(str, c3744a);
        } catch (IOException unused) {
            if (!m102261e.delete()) {
                VolleyLog.m102197b("Could not clean up file %s", m102261e.getAbsolutePath());
            }
            m102259g();
        }
        if (c3760b.m102241d(bufferedOutputStream)) {
            bufferedOutputStream.write(c3744a.f3445a);
            bufferedOutputStream.close();
            c3760b.f3522a = m102261e.length();
            m102257i(str, c3760b);
            m102258h();
            return;
        }
        bufferedOutputStream.close();
        VolleyLog.m102197b("Failed to write header for %s", m102261e.getAbsolutePath());
        throw new IOException();
    }

    @VisibleForTesting
    /* renamed from: c */
    InputStream m102263c(File file) throws FileNotFoundException {
        return new FileInputStream(file);
    }

    @VisibleForTesting
    /* renamed from: d */
    OutputStream m102262d(File file) throws FileNotFoundException {
        return new FileOutputStream(file);
    }

    /* renamed from: e */
    public File m102261e(String str) {
        return new File(this.f3518c.get(), m102260f(str));
    }

    @Override // com.android.volley.Cache
    public synchronized Cache.C3744a get(String str) {
        C3760b c3760b = this.f3516a.get(str);
        if (c3760b == null) {
            return null;
        }
        File m102261e = m102261e(str);
        try {
            C3761c c3761c = new C3761c(new BufferedInputStream(m102263c(m102261e)), m102261e.length());
            try {
                C3760b m102243b = C3760b.m102243b(c3761c);
                if (!TextUtils.equals(str, m102243b.f3523b)) {
                    VolleyLog.m102197b("%s: key=%s, found=%s", m102261e.getAbsolutePath(), str, m102243b.f3523b);
                    m102250p(str);
                    return null;
                }
                return c3760b.m102242c(m102249q(c3761c, c3761c.m102240a()));
            } finally {
                c3761c.close();
            }
        } catch (IOException e) {
            VolleyLog.m102197b("%s: %s", m102261e.getAbsolutePath(), e.toString());
            m102251o(str);
            return null;
        }
    }

    @Override // com.android.volley.Cache
    public synchronized void initialize() {
        long length;
        C3761c c3761c;
        File file = this.f3518c.get();
        if (!file.exists()) {
            if (!file.mkdirs()) {
                VolleyLog.m102196c("Unable to create cache dir %s", file.getAbsolutePath());
            }
            return;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return;
        }
        for (File file2 : listFiles) {
            try {
                length = file2.length();
                c3761c = new C3761c(new BufferedInputStream(m102263c(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            }
            try {
                C3760b m102243b = C3760b.m102243b(c3761c);
                m102243b.f3522a = length;
                m102257i(m102243b.f3523b, m102243b);
                c3761c.close();
            } catch (Throwable th) {
                c3761c.close();
                throw th;
                break;
            }
        }
    }

    /* renamed from: o */
    public synchronized void m102251o(String str) {
        boolean delete = m102261e(str).delete();
        m102250p(str);
        if (!delete) {
            VolleyLog.m102197b("Could not delete cache entry for key=%s, filename=%s", str, m102260f(str));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskBasedCache.java */
    @VisibleForTesting
    /* renamed from: com.android.volley.toolbox.d$c */
    /* loaded from: classes2.dex */
    public static class C3761c extends FilterInputStream {

        /* renamed from: b */
        private final long f3530b;

        /* renamed from: c */
        private long f3531c;

        C3761c(InputStream inputStream, long j) {
            super(inputStream);
            this.f3530b = j;
        }

        /* renamed from: a */
        long m102240a() {
            return this.f3530b - this.f3531c;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f3531c++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f3531c += read;
            }
            return read;
        }
    }

    public DiskBasedCache(File file) {
        this(file, 5242880);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: DiskBasedCache.java */
    @VisibleForTesting
    /* renamed from: com.android.volley.toolbox.d$b */
    /* loaded from: classes2.dex */
    public static class C3760b {

        /* renamed from: a */
        long f3522a;

        /* renamed from: b */
        final String f3523b;

        /* renamed from: c */
        final String f3524c;

        /* renamed from: d */
        final long f3525d;

        /* renamed from: e */
        final long f3526e;

        /* renamed from: f */
        final long f3527f;

        /* renamed from: g */
        final long f3528g;

        /* renamed from: h */
        final List<Header> f3529h;

        private C3760b(String str, String str2, long j, long j2, long j3, long j4, List<Header> list) {
            this.f3523b = str;
            this.f3524c = "".equals(str2) ? null : str2;
            this.f3525d = j;
            this.f3526e = j2;
            this.f3527f = j3;
            this.f3528g = j4;
            this.f3529h = list;
        }

        /* renamed from: a */
        private static List<Header> m102244a(Cache.C3744a c3744a) {
            List<Header> list = c3744a.f3452h;
            if (list != null) {
                return list;
            }
            return HttpHeaderParser.m102231i(c3744a.f3451g);
        }

        /* renamed from: b */
        static C3760b m102243b(C3761c c3761c) throws IOException {
            if (DiskBasedCache.m102254l(c3761c) == 538247942) {
                return new C3760b(DiskBasedCache.m102252n(c3761c), DiskBasedCache.m102252n(c3761c), DiskBasedCache.m102253m(c3761c), DiskBasedCache.m102253m(c3761c), DiskBasedCache.m102253m(c3761c), DiskBasedCache.m102253m(c3761c), DiskBasedCache.m102255k(c3761c));
            }
            throw new IOException();
        }

        /* renamed from: c */
        Cache.C3744a m102242c(byte[] bArr) {
            Cache.C3744a c3744a = new Cache.C3744a();
            c3744a.f3445a = bArr;
            c3744a.f3446b = this.f3524c;
            c3744a.f3447c = this.f3525d;
            c3744a.f3448d = this.f3526e;
            c3744a.f3449e = this.f3527f;
            c3744a.f3450f = this.f3528g;
            c3744a.f3451g = HttpHeaderParser.m102230j(this.f3529h);
            c3744a.f3452h = Collections.unmodifiableList(this.f3529h);
            return c3744a;
        }

        /* renamed from: d */
        boolean m102241d(OutputStream outputStream) {
            try {
                DiskBasedCache.m102247s(outputStream, 538247942);
                DiskBasedCache.m102245u(outputStream, this.f3523b);
                String str = this.f3524c;
                if (str == null) {
                    str = "";
                }
                DiskBasedCache.m102245u(outputStream, str);
                DiskBasedCache.m102246t(outputStream, this.f3525d);
                DiskBasedCache.m102246t(outputStream, this.f3526e);
                DiskBasedCache.m102246t(outputStream, this.f3527f);
                DiskBasedCache.m102246t(outputStream, this.f3528g);
                DiskBasedCache.m102248r(this.f3529h, outputStream);
                outputStream.flush();
                return true;
            } catch (IOException e) {
                VolleyLog.m102197b("%s", e.toString());
                return false;
            }
        }

        C3760b(String str, Cache.C3744a c3744a) {
            this(str, c3744a.f3446b, c3744a.f3447c, c3744a.f3448d, c3744a.f3449e, c3744a.f3450f, m102244a(c3744a));
        }
    }
}
