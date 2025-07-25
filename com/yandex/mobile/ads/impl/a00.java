package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import com.yandex.mobile.ads.impl.InterfaceC31376sl;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class a00 implements InterfaceC31376sl {

    /* renamed from: a */
    private final LinkedHashMap f76629a = new LinkedHashMap(16, 0.75f, true);

    /* renamed from: b */
    private long f76630b = 0;

    /* renamed from: c */
    private final InterfaceC29910d f76631c;

    /* renamed from: d */
    private final int f76632d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.yandex.mobile.ads.impl.a00$a */
    /* loaded from: classes8.dex */
    public final class C29907a implements InterfaceC29910d {

        /* renamed from: a */
        final /* synthetic */ File f76633a;

        C29907a(File file) {
            this.f76633a = file;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.a00$b */
    /* loaded from: classes8.dex */
    public static class C29908b {

        /* renamed from: a */
        long f76634a;

        /* renamed from: b */
        final String f76635b;

        /* renamed from: c */
        final String f76636c;

        /* renamed from: d */
        final long f76637d;

        /* renamed from: e */
        final long f76638e;

        /* renamed from: f */
        final long f76639f;

        /* renamed from: g */
        final long f76640g;

        /* renamed from: h */
        final List<tc0> f76641h;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public static List<tc0> m36026a(InterfaceC31376sl.C31377a c31377a) {
            List<tc0> list = c31377a.f85300h;
            if (list != null) {
                return list;
            }
            Map<String, String> map = c31377a.f85299g;
            ArrayList arrayList = new ArrayList(map.size());
            for (Map.Entry<String, String> entry : map.entrySet()) {
                arrayList.add(new tc0(entry.getKey(), entry.getValue()));
            }
            return arrayList;
        }

        private C29908b(String str, String str2, long j, long j2, long j3, long j4, List<tc0> list) {
            this.f76635b = str;
            this.f76636c = "".equals(str2) ? null : str2;
            this.f76637d = j;
            this.f76638e = j2;
            this.f76639f = j3;
            this.f76640g = j4;
            this.f76641h = list;
        }

        /* renamed from: a */
        static C29908b m36027a(C29909c c29909c) throws IOException {
            if (a00.m36031a(c29909c) == 538247942) {
                String str = new String(a00.m36034a(c29909c, a00.m36029b(c29909c)), "UTF-8");
                String str2 = new String(a00.m36034a(c29909c, a00.m36029b(c29909c)), "UTF-8");
                long m36029b = a00.m36029b(c29909c);
                long m36029b2 = a00.m36029b(c29909c);
                long m36029b3 = a00.m36029b(c29909c);
                long m36029b4 = a00.m36029b(c29909c);
                int m36031a = a00.m36031a(c29909c);
                if (m36031a >= 0) {
                    List emptyList = m36031a == 0 ? Collections.emptyList() : new ArrayList();
                    int i = 0;
                    while (i < m36031a) {
                        emptyList.add(new tc0(new String(a00.m36034a(c29909c, a00.m36029b(c29909c)), "UTF-8").intern(), new String(a00.m36034a(c29909c, a00.m36029b(c29909c)), "UTF-8").intern()));
                        i++;
                        m36029b4 = m36029b4;
                        m36029b3 = m36029b3;
                    }
                    return new C29908b(str, str2, m36029b, m36029b2, m36029b3, m36029b4, emptyList);
                }
                throw new IOException(C31736wd.m27978a("readHeaderList size=", m36031a));
            }
            throw new IOException();
        }

        /* renamed from: a */
        final InterfaceC31376sl.C31377a m36024a(byte[] bArr) {
            InterfaceC31376sl.C31377a c31377a = new InterfaceC31376sl.C31377a();
            c31377a.f85293a = bArr;
            c31377a.f85294b = this.f76636c;
            c31377a.f85295c = this.f76637d;
            c31377a.f85296d = this.f76638e;
            c31377a.f85297e = this.f76639f;
            c31377a.f85298f = this.f76640g;
            List<tc0> list = this.f76641h;
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            for (tc0 tc0Var : list) {
                treeMap.put(tc0Var.m29229a(), tc0Var.m29228b());
            }
            c31377a.f85299g = treeMap;
            c31377a.f85300h = Collections.unmodifiableList(this.f76641h);
            return c31377a;
        }

        /* renamed from: a */
        final boolean m36025a(BufferedOutputStream bufferedOutputStream) {
            try {
                a00.m36033a(bufferedOutputStream, 538247942);
                byte[] bytes = this.f76635b.getBytes("UTF-8");
                a00.m36032a(bufferedOutputStream, bytes.length);
                bufferedOutputStream.write(bytes, 0, bytes.length);
                String str = this.f76636c;
                if (str == null) {
                    str = "";
                }
                byte[] bytes2 = str.getBytes("UTF-8");
                a00.m36032a(bufferedOutputStream, bytes2.length);
                bufferedOutputStream.write(bytes2, 0, bytes2.length);
                a00.m36032a(bufferedOutputStream, this.f76637d);
                a00.m36032a(bufferedOutputStream, this.f76638e);
                a00.m36032a(bufferedOutputStream, this.f76639f);
                a00.m36032a(bufferedOutputStream, this.f76640g);
                List<tc0> list = this.f76641h;
                if (list != null) {
                    a00.m36033a(bufferedOutputStream, list.size());
                    for (tc0 tc0Var : list) {
                        byte[] bytes3 = tc0Var.m29229a().getBytes("UTF-8");
                        a00.m36032a(bufferedOutputStream, bytes3.length);
                        bufferedOutputStream.write(bytes3, 0, bytes3.length);
                        byte[] bytes4 = tc0Var.m29228b().getBytes("UTF-8");
                        a00.m36032a(bufferedOutputStream, bytes4.length);
                        bufferedOutputStream.write(bytes4, 0, bytes4.length);
                    }
                } else {
                    a00.m36033a(bufferedOutputStream, 0);
                }
                bufferedOutputStream.flush();
                return true;
            } catch (IOException e) {
                Object[] objArr = {e.toString()};
                boolean z = zc2.f88824a;
                um0.m28728a(objArr);
                return false;
            }
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.a00$d */
    /* loaded from: classes8.dex */
    public interface InterfaceC29910d {
    }

    public a00(File file, int i) {
        this.f76631c = new C29907a(file);
        this.f76632d = i;
    }

    /* renamed from: b */
    private void m36030b() {
        int length;
        int length2;
        if (this.f76630b < this.f76632d) {
            return;
        }
        if (zc2.f88824a) {
            um0.m28724e(new Object[0]);
        }
        long j = this.f76630b;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        Iterator it = this.f76629a.entrySet().iterator();
        int i = 0;
        while (it.hasNext()) {
            C29908b c29908b = (C29908b) ((Map.Entry) it.next()).getValue();
            String str = c29908b.f76635b;
            if (new File(((C29907a) this.f76631c).f76633a, String.valueOf(str.substring(0, str.length() / 2).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete()) {
                this.f76630b -= c29908b.f76634a;
            } else {
                String str2 = c29908b.f76635b;
                um0.m28728a(str2, String.valueOf(str2.substring(0, str2.length() / 2).hashCode()) + String.valueOf(str2.substring(length2).hashCode()));
            }
            it.remove();
            i++;
            if (((float) this.f76630b) < this.f76632d * 0.9f) {
                break;
            }
        }
        if (zc2.f88824a) {
            um0.m28724e(Integer.valueOf(i), Long.valueOf(this.f76630b - j), Long.valueOf(SystemClock.elapsedRealtime() - elapsedRealtime));
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31376sl
    /* renamed from: a */
    public final synchronized void mo29594a() {
        long length;
        C29909c c29909c;
        File file = ((C29907a) this.f76631c).f76633a;
        if (!file.exists()) {
            if (!file.mkdirs()) {
                Object[] objArr = {file.getAbsolutePath()};
                boolean z = zc2.f88824a;
                um0.m28727b(objArr);
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
                c29909c = new C29909c(new BufferedInputStream(new FileInputStream(file2)), length);
            } catch (IOException unused) {
                file2.delete();
            } catch (Throwable unused2) {
                Intrinsics.checkNotNullParameter(file2, "<this>");
                try {
                    file2.delete();
                } catch (Throwable unused3) {
                }
            }
            try {
                C29908b m36027a = C29908b.m36027a(c29909c);
                m36027a.f76634a = length;
                String str = m36027a.f76635b;
                if (this.f76629a.containsKey(str)) {
                    this.f76630b = (m36027a.f76634a - ((C29908b) this.f76629a.get(str)).f76634a) + this.f76630b;
                } else {
                    this.f76630b += m36027a.f76634a;
                }
                this.f76629a.put(str, m36027a);
                c29909c.close();
            } catch (Throwable th) {
                c29909c.close();
                throw th;
                break;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31376sl
    public final synchronized InterfaceC31376sl.C31377a get(String str) {
        int length;
        C29908b c29908b = (C29908b) this.f76629a.get(str);
        if (c29908b == null) {
            return null;
        }
        File file = new File(((C29907a) this.f76631c).f76633a, String.valueOf(str.substring(0, str.length() / 2).hashCode()) + String.valueOf(str.substring(length).hashCode()));
        try {
            C29909c c29909c = new C29909c(new BufferedInputStream(new FileInputStream(file)), file.length());
            try {
                C29908b m36027a = C29908b.m36027a(c29909c);
                if (!TextUtils.equals(str, m36027a.f76635b)) {
                    Object[] objArr = {file.getAbsolutePath(), str, m36027a.f76635b};
                    boolean z = zc2.f88824a;
                    um0.m28728a(objArr);
                    C29908b c29908b2 = (C29908b) this.f76629a.remove(str);
                    if (c29908b2 != null) {
                        this.f76630b -= c29908b2.f76634a;
                    }
                    return null;
                }
                return c29908b.m36024a(m36034a(c29909c, c29909c.f76642b - c29909c.f76643c));
            } finally {
                c29909c.close();
            }
        } catch (IOException e) {
            Object[] objArr2 = {file.getAbsolutePath(), e.toString()};
            boolean z2 = zc2.f88824a;
            um0.m28728a(objArr2);
            m36028b(str);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @VisibleForTesting
    /* renamed from: com.yandex.mobile.ads.impl.a00$c */
    /* loaded from: classes8.dex */
    public static class C29909c extends FilterInputStream {

        /* renamed from: b */
        private final long f76642b;

        /* renamed from: c */
        private long f76643c;

        C29909c(BufferedInputStream bufferedInputStream, long j) {
            super(bufferedInputStream);
            this.f76642b = j;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read() throws IOException {
            int read = super.read();
            if (read != -1) {
                this.f76643c++;
            }
            return read;
        }

        @Override // java.io.FilterInputStream, java.io.InputStream
        public final int read(byte[] bArr, int i, int i2) throws IOException {
            int read = super.read(bArr, i, i2);
            if (read != -1) {
                this.f76643c += read;
            }
            return read;
        }
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC31376sl
    /* renamed from: a */
    public final synchronized void mo29593a(String str) {
        InterfaceC31376sl.C31377a c31377a = get(str);
        if (c31377a != null) {
            c31377a.f85298f = 0L;
            c31377a.f85297e = 0L;
            mo29592a(str, c31377a);
        }
    }

    /* renamed from: b */
    static long m36029b(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            long j = read & 255;
            int read2 = inputStream.read();
            if (read2 != -1) {
                long j2 = j | ((read2 & 255) << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    long j3 = j2 | ((read3 & 255) << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        long j4 = j3 | ((read4 & 255) << 24);
                        int read5 = inputStream.read();
                        if (read5 != -1) {
                            long j5 = j4 | ((read5 & 255) << 32);
                            int read6 = inputStream.read();
                            if (read6 != -1) {
                                long j6 = j5 | ((read6 & 255) << 40);
                                int read7 = inputStream.read();
                                if (read7 != -1) {
                                    long j7 = j6 | ((read7 & 255) << 48);
                                    int read8 = inputStream.read();
                                    if (read8 != -1) {
                                        return ((read8 & 255) << 56) | j7;
                                    }
                                    throw new EOFException();
                                }
                                throw new EOFException();
                            }
                            throw new EOFException();
                        }
                        throw new EOFException();
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00f5 A[Catch: all -> 0x0123, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x0015, B:11:0x0022, B:12:0x005b, B:14:0x008a, B:16:0x0097, B:18:0x00ad, B:20:0x00c7, B:19:0x00b5, B:21:0x00d0, B:23:0x00d4, B:25:0x00db, B:26:0x00e7, B:30:0x00ef, B:32:0x00f5, B:33:0x0102, B:35:0x010e), top: B:46:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x010e A[Catch: all -> 0x0123, TRY_LEAVE, TryCatch #2 {, blocks: (B:4:0x0007, B:6:0x0015, B:11:0x0022, B:12:0x005b, B:14:0x008a, B:16:0x0097, B:18:0x00ad, B:20:0x00c7, B:19:0x00b5, B:21:0x00d0, B:23:0x00d4, B:25:0x00db, B:26:0x00e7, B:30:0x00ef, B:32:0x00f5, B:33:0x0102, B:35:0x010e), top: B:46:0x0007 }] */
    @Override // com.yandex.mobile.ads.impl.InterfaceC31376sl
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void mo29592a(java.lang.String r25, com.yandex.mobile.ads.impl.InterfaceC31376sl.C31377a r26) {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.a00.mo29592a(java.lang.String, com.yandex.mobile.ads.impl.sl$a):void");
    }

    /* renamed from: b */
    public final synchronized void m36028b(String str) {
        int length;
        int length2;
        boolean delete = new File(((C29907a) this.f76631c).f76633a, String.valueOf(str.substring(0, str.length() / 2).hashCode()) + String.valueOf(str.substring(length).hashCode())).delete();
        C29908b c29908b = (C29908b) this.f76629a.remove(str);
        if (c29908b != null) {
            this.f76630b -= c29908b.f76634a;
        }
        if (!delete) {
            Object[] objArr = {str, String.valueOf(str.substring(0, str.length() / 2).hashCode()) + String.valueOf(str.substring(length2).hashCode())};
            boolean z = zc2.f88824a;
            um0.m28728a(objArr);
        }
    }

    /* renamed from: a */
    static int m36031a(InputStream inputStream) throws IOException {
        int read = inputStream.read();
        if (read != -1) {
            int read2 = inputStream.read();
            if (read2 != -1) {
                int i = read | (read2 << 8);
                int read3 = inputStream.read();
                if (read3 != -1) {
                    int i2 = i | (read3 << 16);
                    int read4 = inputStream.read();
                    if (read4 != -1) {
                        return (read4 << 24) | i2;
                    }
                    throw new EOFException();
                }
                throw new EOFException();
            }
            throw new EOFException();
        }
        throw new EOFException();
    }

    @VisibleForTesting
    /* renamed from: a */
    static byte[] m36034a(C29909c c29909c, long j) throws IOException {
        long j2 = c29909c.f76642b - c29909c.f76643c;
        if (j >= 0 && j <= j2) {
            int i = (int) j;
            if (i == j) {
                byte[] bArr = new byte[i];
                new DataInputStream(c29909c).readFully(bArr);
                return bArr;
            }
        }
        throw new IOException("streamToBytes length=" + j + ", maxLength=" + j2);
    }

    /* renamed from: a */
    static void m36033a(BufferedOutputStream bufferedOutputStream, int i) throws IOException {
        bufferedOutputStream.write(i & 255);
        bufferedOutputStream.write((i >> 8) & 255);
        bufferedOutputStream.write((i >> 16) & 255);
        bufferedOutputStream.write((i >> 24) & 255);
    }

    /* renamed from: a */
    static void m36032a(BufferedOutputStream bufferedOutputStream, long j) throws IOException {
        bufferedOutputStream.write((byte) j);
        bufferedOutputStream.write((byte) (j >>> 8));
        bufferedOutputStream.write((byte) (j >>> 16));
        bufferedOutputStream.write((byte) (j >>> 24));
        bufferedOutputStream.write((byte) (j >>> 32));
        bufferedOutputStream.write((byte) (j >>> 40));
        bufferedOutputStream.write((byte) (j >>> 48));
        bufferedOutputStream.write((byte) (j >>> 56));
    }
}
