package com.bytedance.sdk.component.p275zx.p277bX.p280bg.p282bg;

import android.util.Log;
import com.bytedance.sdk.component.p275zx.p277bX.p279bX.C7795IL;
import com.ironsource.C21114v8;
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
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.regex.Pattern;

/* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bg */
/* loaded from: classes3.dex */
public final class C7812bg implements Closeable {

    /* renamed from: IL */
    final ExecutorService f17044IL;

    /* renamed from: Kg */
    private final int f17045Kg;

    /* renamed from: PX */
    private Writer f17047PX;

    /* renamed from: WR */
    private long f17050WR;

    /* renamed from: eo */
    private final int f17051eo;
    private final File eqN;

    /* renamed from: iR */
    private final File f17052iR;
    private final File ldr;
    private int yDt;

    /* renamed from: zx */
    private final File f17054zx;

    /* renamed from: bg */
    static final Pattern f17043bg = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: bX */
    public static final OutputStream f17042bX = new OutputStream() { // from class: com.bytedance.sdk.component.zx.bX.bg.bg.bg.2
        @Override // java.io.OutputStream
        public void write(int i) throws IOException {
        }
    };

    /* renamed from: VB */
    private long f17049VB = 0;

    /* renamed from: Ta */
    private final LinkedHashMap<String, C7815IL> f17048Ta = new LinkedHashMap<>(0, 0.75f, true);

    /* renamed from: Lq */
    private long f17046Lq = -1;

    /* renamed from: vb */
    private long f17053vb = 0;
    private final Callable<Void> xxp = new Callable<Void>() { // from class: com.bytedance.sdk.component.zx.bX.bg.bg.bg.1
        @Override // java.util.concurrent.Callable
        /* renamed from: bg */
        public Void call() throws Exception {
            synchronized (C7812bg.this) {
                if (C7812bg.this.f17047PX != null) {
                    C7812bg.this.m87669Kg();
                    if (C7812bg.this.ldr()) {
                        C7812bg.this.m87654zx();
                        C7812bg.this.yDt = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bg$IL */
    /* loaded from: classes3.dex */
    public final class C7815IL {

        /* renamed from: IL */
        private final String f17056IL;

        /* renamed from: bX */
        private final long[] f17057bX;
        private boolean eqN;
        private long ldr;

        /* renamed from: zx */
        private C7817bg f17059zx;

        private C7815IL(String str) {
            this.f17056IL = str;
            this.f17057bX = new long[C7812bg.this.f17051eo];
        }

        /* renamed from: IL */
        private IOException m87648IL(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* renamed from: IL */
        public File m87650IL(int i) {
            File file = C7812bg.this.eqN;
            return new File(file, this.f17056IL + "." + i + ".tmp");
        }

        /* renamed from: bg */
        public String m87646bg() throws IOException {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j : this.f17057bX) {
                sb2.append(' ');
                sb2.append(j);
            }
            return sb2.toString();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: bg */
        public void m87639bg(String[] strArr) throws IOException {
            if (strArr.length == C7812bg.this.f17051eo) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.f17057bX[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw m87648IL(strArr);
                    }
                }
                return;
            }
            throw m87648IL(strArr);
        }

        /* renamed from: bg */
        public File m87645bg(int i) {
            File file = C7812bg.this.eqN;
            return new File(file, this.f17056IL + "." + i);
        }
    }

    /* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bg$bX */
    /* loaded from: classes3.dex */
    public final class C7816bX implements Closeable {

        /* renamed from: IL */
        private final String f17060IL;

        /* renamed from: bX */
        private final long f17061bX;
        private final InputStream[] eqN;

        /* renamed from: zx */
        private final long[] f17063zx;

        /* renamed from: bg */
        public InputStream m87637bg(int i) {
            return this.eqN[i];
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.eqN) {
                C7795IL.m87725bg(inputStream);
            }
        }

        private C7816bX(String str, long j, InputStream[] inputStreamArr, long[] jArr) {
            this.f17060IL = str;
            this.f17061bX = j;
            this.eqN = inputStreamArr;
            this.f17063zx = jArr;
        }
    }

    /* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bg$bg */
    /* loaded from: classes3.dex */
    public final class C7817bg {

        /* renamed from: IL */
        private final C7815IL f17064IL;

        /* renamed from: bX */
        private final boolean[] f17065bX;
        private boolean eqN;

        /* renamed from: zx */
        private boolean f17067zx;

        /* renamed from: com.bytedance.sdk.component.zx.bX.bg.bg.bg$bg$bg */
        /* loaded from: classes3.dex */
        private class C7818bg extends FilterOutputStream {
            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C7817bg.this.eqN = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C7817bg.this.eqN = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C7817bg.this.eqN = true;
                }
            }

            private C7818bg(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C7817bg.this.eqN = true;
                }
            }
        }

        private C7817bg(C7815IL c7815il) {
            this.f17064IL = c7815il;
            this.f17065bX = c7815il.eqN ? null : new boolean[C7812bg.this.f17051eo];
        }

        /* renamed from: IL */
        public void m87636IL() throws IOException {
            C7812bg.this.m87664bg(this, false);
        }

        /* renamed from: bg */
        public OutputStream m87633bg(int i) throws IOException {
            FileOutputStream fileOutputStream;
            C7818bg c7818bg;
            if (i < 0 || i >= C7812bg.this.f17051eo) {
                throw new IllegalArgumentException("Expected index " + i + " to be greater than 0 and less than the maximum value count of " + C7812bg.this.f17051eo);
            }
            synchronized (C7812bg.this) {
                if (this.f17064IL.f17059zx == this) {
                    if (!this.f17064IL.eqN) {
                        this.f17065bX[i] = true;
                    }
                    File m87650IL = this.f17064IL.m87650IL(i);
                    try {
                        fileOutputStream = new FileOutputStream(m87650IL);
                    } catch (FileNotFoundException unused) {
                        C7812bg.this.eqN.mkdirs();
                        try {
                            fileOutputStream = new FileOutputStream(m87650IL);
                        } catch (FileNotFoundException unused2) {
                            return C7812bg.f17042bX;
                        }
                    }
                    c7818bg = new C7818bg(fileOutputStream);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c7818bg;
        }

        /* renamed from: bg */
        public void m87634bg() throws IOException {
            if (this.eqN) {
                C7812bg.this.m87664bg(this, false);
                C7812bg.this.m87666bX(this.f17064IL.f17056IL);
            } else {
                C7812bg.this.m87664bg(this, true);
            }
            this.f17067zx = true;
        }
    }

    private C7812bg(File file, int i, int i2, long j, ExecutorService executorService) {
        this.eqN = file;
        this.f17045Kg = i;
        this.f17054zx = new File(file, "journal");
        this.ldr = new File(file, "journal.tmp");
        this.f17052iR = new File(file, "journal.bkp");
        this.f17051eo = i2;
        this.f17050WR = j;
        this.f17044IL = executorService;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: Kg */
    public void m87669Kg() throws IOException {
        long j = this.f17050WR;
        long j2 = this.f17046Lq;
        if (j2 >= 0) {
            j = j2;
        }
        while (this.f17049VB > j) {
            m87666bX(this.f17048Ta.entrySet().iterator().next().getKey());
        }
        this.f17046Lq = -1L;
    }

    /* renamed from: iR */
    private void m87655iR() {
        if (this.f17047PX != null) {
            return;
        }
        throw new IllegalStateException("cache is closed");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f17047PX == null) {
            return;
        }
        Iterator it = new ArrayList(this.f17048Ta.values()).iterator();
        while (it.hasNext()) {
            C7815IL c7815il = (C7815IL) it.next();
            if (c7815il.f17059zx != null) {
                c7815il.f17059zx.m87636IL();
            }
        }
        m87669Kg();
        this.f17047PX.close();
        this.f17047PX = null;
    }

    /* renamed from: bX */
    private void m87668bX() throws IOException {
        C7810bX c7810bX = new C7810bX(new FileInputStream(this.f17054zx), C7819eqN.f17070bg);
        try {
            String m87674bg = c7810bX.m87674bg();
            String m87674bg2 = c7810bX.m87674bg();
            String m87674bg3 = c7810bX.m87674bg();
            String m87674bg4 = c7810bX.m87674bg();
            String m87674bg5 = c7810bX.m87674bg();
            if (!"libcore.io.DiskLruCache".equals(m87674bg) || !"1".equals(m87674bg2) || !Integer.toString(this.f17045Kg).equals(m87674bg3) || !Integer.toString(this.f17051eo).equals(m87674bg4) || !"".equals(m87674bg5)) {
                throw new IOException("unexpected journal header: [" + m87674bg + ", " + m87674bg2 + ", " + m87674bg4 + ", " + m87674bg5 + C21114v8.C21123i.f54139e);
            }
            int i = 0;
            while (true) {
                try {
                    eqN(c7810bX.m87674bg());
                    i++;
                } catch (EOFException unused) {
                    this.yDt = i - this.f17048Ta.size();
                    if (c7810bX.m87676IL()) {
                        m87654zx();
                    } else {
                        this.f17047PX = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17054zx, true), C7819eqN.f17070bg));
                    }
                    C7795IL.m87725bg(c7810bX);
                    return;
                }
            }
        } catch (Throwable th) {
            C7795IL.m87725bg(c7810bX);
            throw th;
        }
    }

    private void eqN(String str) throws IOException {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    this.f17048Ta.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C7815IL c7815il = this.f17048Ta.get(substring);
            if (c7815il == null) {
                c7815il = new C7815IL(substring);
                this.f17048Ta.put(substring, c7815il);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c7815il.eqN = true;
                c7815il.f17059zx = null;
                c7815il.m87639bg(split);
                return;
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c7815il.f17059zx = new C7817bg(c7815il);
                return;
            } else if (indexOf2 != -1 || indexOf != 4 || !str.startsWith("READ")) {
                throw new IOException("unexpected journal line: ".concat(str));
            } else {
                return;
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ldr() {
        int i = this.yDt;
        return i >= 2000 && i >= this.f17048Ta.size();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: zx */
    public synchronized void m87654zx() throws IOException {
        Writer writer = this.f17047PX;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.ldr), C7819eqN.f17070bg));
        bufferedWriter.write("libcore.io.DiskLruCache");
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f17045Kg));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.f17051eo));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C7815IL c7815il : this.f17048Ta.values()) {
            if (c7815il.f17059zx != null) {
                bufferedWriter.write("DIRTY " + c7815il.f17056IL + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c7815il.f17056IL + c7815il.m87646bg() + '\n');
            }
        }
        bufferedWriter.close();
        if (this.f17054zx.exists()) {
            m87658bg(this.f17054zx, this.f17052iR, true);
        }
        m87658bg(this.ldr, this.f17054zx, false);
        this.f17052iR.delete();
        this.f17047PX = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f17054zx, true), C7819eqN.f17070bg));
    }

    /* renamed from: IL */
    public C7817bg m87670IL(String str) throws IOException {
        return m87656bg(str, -1L);
    }

    /* renamed from: IL */
    public void m87672IL() throws IOException {
        close();
        C7819eqN.m87630bg(this.eqN);
    }

    /* renamed from: bg */
    public static C7812bg m87659bg(File file, int i, int i2, long j, ExecutorService executorService) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        m87658bg(file2, file3, false);
                    }
                }
                C7812bg c7812bg = new C7812bg(file, i, i2, j, executorService);
                if (c7812bg.f17054zx.exists()) {
                    try {
                        c7812bg.m87668bX();
                        c7812bg.eqN();
                        return c7812bg;
                    } catch (IOException e) {
                        Log.w("DiskLruCache ", file + " is corrupt: " + e.getMessage() + ", removing");
                        c7812bg.m87672IL();
                    }
                }
                file.mkdirs();
                C7812bg c7812bg2 = new C7812bg(file, i, i2, j, executorService);
                c7812bg2.m87654zx();
                return c7812bg2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    private void eqN() throws IOException {
        m87660bg(this.ldr);
        Iterator<C7815IL> it = this.f17048Ta.values().iterator();
        while (it.hasNext()) {
            C7815IL next = it.next();
            int i = 0;
            if (next.f17059zx != null) {
                next.f17059zx = null;
                while (i < this.f17051eo) {
                    m87660bg(next.m87645bg(i));
                    m87660bg(next.m87650IL(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.f17051eo) {
                    this.f17049VB += next.f17057bX[i];
                    i++;
                }
            }
        }
    }

    /* renamed from: bX */
    public synchronized boolean m87666bX(String str) throws IOException {
        m87655iR();
        m87652zx(str);
        C7815IL c7815il = this.f17048Ta.get(str);
        if (c7815il != null && c7815il.f17059zx == null) {
            for (int i = 0; i < this.f17051eo; i++) {
                File m87645bg = c7815il.m87645bg(i);
                if (m87645bg.exists() && !m87645bg.delete()) {
                    throw new IOException("failed to delete ".concat(String.valueOf(m87645bg)));
                }
                this.f17049VB -= c7815il.f17057bX[i];
                c7815il.f17057bX[i] = 0;
            }
            this.yDt++;
            this.f17047PX.append((CharSequence) ("REMOVE " + str + '\n'));
            this.f17048Ta.remove(str);
            if (ldr()) {
                this.f17044IL.submit(this.xxp);
            }
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    private static void m87660bg(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* renamed from: bg */
    private static void m87658bg(File file, File file2, boolean z) throws IOException {
        if (z) {
            m87660bg(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* renamed from: zx */
    private void m87652zx(String str) {
        if (f17043bg.matcher(str).matches()) {
            return;
        }
        throw new IllegalArgumentException("keys must match regex [a-z0-9_-]{1,120}: \"" + str + "\"");
    }

    /* renamed from: bg */
    public synchronized C7816bX m87657bg(String str) throws IOException {
        InputStream inputStream;
        m87655iR();
        m87652zx(str);
        C7815IL c7815il = this.f17048Ta.get(str);
        if (c7815il == null) {
            return null;
        }
        if (c7815il.eqN) {
            InputStream[] inputStreamArr = new InputStream[this.f17051eo];
            for (int i = 0; i < this.f17051eo; i++) {
                try {
                    inputStreamArr[i] = new FileInputStream(c7815il.m87645bg(i));
                } catch (FileNotFoundException unused) {
                    for (int i2 = 0; i2 < this.f17051eo && (inputStream = inputStreamArr[i2]) != null; i2++) {
                        C7795IL.m87725bg(inputStream);
                    }
                    return null;
                }
            }
            this.yDt++;
            this.f17047PX.append((CharSequence) ("READ " + str + '\n'));
            if (ldr()) {
                this.f17044IL.submit(this.xxp);
            }
            return new C7816bX(str, c7815il.ldr, inputStreamArr, c7815il.f17057bX);
        }
        return null;
    }

    /* renamed from: bg */
    private synchronized C7817bg m87656bg(String str, long j) throws IOException {
        m87655iR();
        m87652zx(str);
        C7815IL c7815il = this.f17048Ta.get(str);
        if (j == -1 || (c7815il != null && c7815il.ldr == j)) {
            if (c7815il != null) {
                if (c7815il.f17059zx != null) {
                    return null;
                }
            } else {
                c7815il = new C7815IL(str);
                this.f17048Ta.put(str, c7815il);
            }
            C7817bg c7817bg = new C7817bg(c7815il);
            c7815il.f17059zx = c7817bg;
            Writer writer = this.f17047PX;
            writer.write("DIRTY " + str + '\n');
            this.f17047PX.flush();
            return c7817bg;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bg */
    public synchronized void m87664bg(C7817bg c7817bg, boolean z) throws IOException {
        C7815IL c7815il = c7817bg.f17064IL;
        if (c7815il.f17059zx == c7817bg) {
            if (z && !c7815il.eqN) {
                for (int i = 0; i < this.f17051eo; i++) {
                    if (c7817bg.f17065bX[i]) {
                        if (!c7815il.m87650IL(i).exists()) {
                            c7817bg.m87636IL();
                            return;
                        }
                    } else {
                        c7817bg.m87636IL();
                        throw new IllegalStateException("Newly created entry didn't create value for index ".concat(String.valueOf(i)));
                    }
                }
            }
            for (int i2 = 0; i2 < this.f17051eo; i2++) {
                File m87650IL = c7815il.m87650IL(i2);
                if (z) {
                    if (m87650IL.exists()) {
                        File m87645bg = c7815il.m87645bg(i2);
                        m87650IL.renameTo(m87645bg);
                        long j = c7815il.f17057bX[i2];
                        long length = m87645bg.length();
                        c7815il.f17057bX[i2] = length;
                        this.f17049VB = (this.f17049VB - j) + length;
                    }
                } else {
                    m87660bg(m87650IL);
                }
            }
            this.yDt++;
            c7815il.f17059zx = null;
            if (!(c7815il.eqN | z)) {
                this.f17048Ta.remove(c7815il.f17056IL);
                this.f17047PX.write("REMOVE " + c7815il.f17056IL + '\n');
            } else {
                c7815il.eqN = true;
                this.f17047PX.write("CLEAN " + c7815il.f17056IL + c7815il.m87646bg() + '\n');
                if (z) {
                    long j2 = this.f17053vb;
                    this.f17053vb = 1 + j2;
                    c7815il.ldr = j2;
                }
            }
            this.f17047PX.flush();
            if (this.f17049VB > this.f17050WR || ldr()) {
                this.f17044IL.submit(this.xxp);
            }
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: bg */
    public synchronized void m87665bg() throws IOException {
        m87655iR();
        m87669Kg();
        this.f17047PX.flush();
    }
}
