package com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o;

import com.ironsource.C21114v8;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32465cioc2;
import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2i */
/* loaded from: classes8.dex */
public final class C32625c2oc2i implements Closeable {
    static final String c222o2o2c2o = "libcore.io.DiskLruCache";
    static final String c22o22co22i = "journal.tmp";
    private static final String c2ccocci = "REMOVE";
    static final String c2oicci2 = "journal";
    private static final int cc2iiooocc2 = 8192;
    private static final Charset ccoio = Charset.forName("UTF-8");
    static final String cici2o2oo = "1";
    private static final String ciiio2o = "READ";
    private static final String ciiioc2ioc = "DIRTY";
    static final long ciio2c = -1;
    private static final String cioc2 = "CLEAN";
    private final File c2oc2i;
    private final long c2oc2o;
    private final int cco22;
    private int cicic;
    private Writer ciii2coi2;
    private final int cioccoiococ;
    private final File coi222o222;
    private final File coo2iico;
    private long cii2c2 = 0;
    private final LinkedHashMap<String, C32626c2oc2i> coiic = new LinkedHashMap<>(0, 0.75f, true);
    private long cicc2iiccc = 0;
    private final ExecutorService ccoc2oic = C32465cioc2.c2oc2i;
    private final Callable<Void> coiio2 = new CallableC32630coo2iico();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2i$c2oc2i */
    /* loaded from: classes8.dex */
    public final class C32626c2oc2i {
        private boolean c2oc2i;
        private long c2oc2o;
        private C32628coi222o222 cioccoiococ;
        private final long[] coi222o222;
        private final String coo2iico;

        /* synthetic */ C32626c2oc2i(C32625c2oc2i c32625c2oc2i, String str, CallableC32630coo2iico callableC32630coo2iico) {
            this(str);
        }

        private C32626c2oc2i(String str) {
            this.coo2iico = str;
            this.coi222o222 = new long[C32625c2oc2i.this.cco22];
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void coi222o222(String[] strArr) throws IOException {
            if (strArr.length == C32625c2oc2i.this.cco22) {
                for (int i = 0; i < strArr.length; i++) {
                    try {
                        this.coi222o222[i] = Long.parseLong(strArr[i]);
                    } catch (NumberFormatException unused) {
                        throw coo2iico(strArr);
                    }
                }
                return;
            }
            throw coo2iico(strArr);
        }

        public String coo2iico() throws IOException {
            long[] jArr;
            StringBuilder sb2 = new StringBuilder();
            for (long j : this.coi222o222) {
                sb2.append(' ');
                sb2.append(j);
            }
            return sb2.toString();
        }

        public File coi222o222(int i) {
            File file = C32625c2oc2i.this.coo2iico;
            return new File(file, this.coo2iico + "." + i + ".tmp");
        }

        private IOException coo2iico(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        public File coo2iico(int i) {
            File file = C32625c2oc2i.this.coo2iico;
            return new File(file, this.coo2iico + "." + i);
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2i$cioccoiococ */
    /* loaded from: classes8.dex */
    public final class C32627cioccoiococ implements Closeable {
        private final InputStream[] c2oc2i;
        private final String[] cioccoiococ;
        private final long coi222o222;
        private final String coo2iico;

        /* synthetic */ C32627cioccoiococ(C32625c2oc2i c32625c2oc2i, String str, long j, InputStream[] inputStreamArr, String[] strArr, CallableC32630coo2iico callableC32630coo2iico) {
            this(str, j, inputStreamArr, strArr);
        }

        public String c2oc2i(int i) throws IOException {
            return C32625c2oc2i.coi222o222(coi222o222(i));
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            for (InputStream inputStream : this.c2oc2i) {
                C32625c2oc2i.coo2iico((Closeable) inputStream);
            }
        }

        public InputStream coi222o222(int i) {
            return this.c2oc2i[i];
        }

        public C32628coi222o222 coo2iico() throws IOException {
            return C32625c2oc2i.this.coo2iico(this.coo2iico, this.coi222o222);
        }

        private C32627cioccoiococ(String str, long j, InputStream[] inputStreamArr, String[] strArr) {
            this.coo2iico = str;
            this.coi222o222 = j;
            this.c2oc2i = inputStreamArr;
            this.cioccoiococ = strArr;
        }

        public String coo2iico(int i) {
            return this.cioccoiococ[i];
        }
    }

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2i$coi222o222 */
    /* loaded from: classes8.dex */
    public final class C32628coi222o222 {
        private boolean coi222o222;
        private final C32626c2oc2i coo2iico;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2i$coi222o222$coo2iico */
        /* loaded from: classes8.dex */
        public class C32629coo2iico extends FilterOutputStream {
            /* synthetic */ C32629coo2iico(C32628coi222o222 c32628coi222o222, OutputStream outputStream, CallableC32630coo2iico callableC32630coo2iico) {
                this(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public void close() {
                try {
                    ((FilterOutputStream) this).out.close();
                } catch (IOException unused) {
                    C32628coi222o222.this.coi222o222 = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Flushable
            public void flush() {
                try {
                    ((FilterOutputStream) this).out.flush();
                } catch (IOException unused) {
                    C32628coi222o222.this.coi222o222 = true;
                }
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(int i) {
                try {
                    ((FilterOutputStream) this).out.write(i);
                } catch (IOException unused) {
                    C32628coi222o222.this.coi222o222 = true;
                }
            }

            private C32629coo2iico(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream
            public void write(byte[] bArr, int i, int i2) {
                try {
                    ((FilterOutputStream) this).out.write(bArr, i, i2);
                } catch (IOException unused) {
                    C32628coi222o222.this.coi222o222 = true;
                }
            }
        }

        /* synthetic */ C32628coi222o222(C32625c2oc2i c32625c2oc2i, C32626c2oc2i c32626c2oc2i, CallableC32630coo2iico callableC32630coo2iico) {
            this(c32626c2oc2i);
        }

        public InputStream c2oc2i(int i) throws IOException {
            synchronized (C32625c2oc2i.this) {
                if (this.coo2iico.cioccoiococ == this) {
                    if (!this.coo2iico.c2oc2i) {
                        return null;
                    }
                    return new FileInputStream(this.coo2iico.coo2iico(i));
                }
                throw new IllegalStateException();
            }
        }

        public OutputStream cioccoiococ(int i) throws IOException {
            C32629coo2iico c32629coo2iico;
            synchronized (C32625c2oc2i.this) {
                if (this.coo2iico.cioccoiococ == this) {
                    c32629coo2iico = new C32629coo2iico(this, new FileOutputStream(this.coo2iico.coi222o222(i)), null);
                } else {
                    throw new IllegalStateException();
                }
            }
            return c32629coo2iico;
        }

        public String coi222o222(int i) throws IOException {
            InputStream c2oc2i = c2oc2i(i);
            if (c2oc2i != null) {
                return C32625c2oc2i.coi222o222(c2oc2i);
            }
            return null;
        }

        private C32628coi222o222(C32626c2oc2i c32626c2oc2i) {
            this.coo2iico = c32626c2oc2i;
        }

        public void coi222o222() throws IOException {
            if (this.coi222o222) {
                C32625c2oc2i.this.coo2iico(this, false);
                C32625c2oc2i.this.cioccoiococ(this.coo2iico.coo2iico);
                return;
            }
            C32625c2oc2i.this.coo2iico(this, true);
        }

        public String coo2iico(int i) {
            String absolutePath;
            synchronized (C32625c2oc2i.this) {
                if (this.coo2iico.cioccoiococ == this) {
                    absolutePath = this.coo2iico.coi222o222(i).getAbsolutePath();
                } else {
                    throw new IllegalStateException();
                }
            }
            return absolutePath;
        }

        public void coo2iico(int i, String str) throws IOException {
            OutputStreamWriter outputStreamWriter;
            OutputStreamWriter outputStreamWriter2 = null;
            try {
                outputStreamWriter = new OutputStreamWriter(cioccoiococ(i), C32625c2oc2i.ccoio);
            } catch (Throwable th) {
                th = th;
            }
            try {
                outputStreamWriter.write(str);
                C32625c2oc2i.coo2iico(outputStreamWriter);
            } catch (Throwable th2) {
                th = th2;
                outputStreamWriter2 = outputStreamWriter;
                C32625c2oc2i.coo2iico(outputStreamWriter2);
                throw th;
            }
        }

        public void coo2iico() throws IOException {
            C32625c2oc2i.this.coo2iico(this, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciiio2o.c2oc2i$coo2iico */
    /* loaded from: classes8.dex */
    public class CallableC32630coo2iico implements Callable<Void> {
        CallableC32630coo2iico() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: coo2iico */
        public Void call() throws Exception {
            synchronized (C32625c2oc2i.this) {
                if (C32625c2oc2i.this.ciii2coi2 != null) {
                    C32625c2oc2i.this.c2oicci2();
                    if (C32625c2oc2i.this.ciii2coi2()) {
                        C32625c2oc2i.this.ccoc2oic();
                        C32625c2oc2i.this.cicic = 0;
                    }
                    return null;
                }
                return null;
            }
        }
    }

    private C32625c2oc2i(File file, int i, int i2, long j) {
        this.coo2iico = file;
        this.cioccoiococ = i;
        this.coi222o222 = new File(file, c2oicci2);
        this.c2oc2i = new File(file, c22o22co22i);
        this.cco22 = i2;
        this.c2oc2o = j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c2oicci2() throws IOException {
        while (this.cii2c2 > this.c2oc2o) {
            cioccoiococ(this.coiic.entrySet().iterator().next().getKey());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ccoc2oic() throws IOException {
        Writer writer = this.ciii2coi2;
        if (writer != null) {
            writer.close();
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(this.c2oc2i), 8192);
        bufferedWriter.write(c222o2o2c2o);
        bufferedWriter.write("\n");
        bufferedWriter.write("1");
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.cioccoiococ));
        bufferedWriter.write("\n");
        bufferedWriter.write(Integer.toString(this.cco22));
        bufferedWriter.write("\n");
        bufferedWriter.write("\n");
        for (C32626c2oc2i c32626c2oc2i : this.coiic.values()) {
            if (c32626c2oc2i.cioccoiococ != null) {
                bufferedWriter.write("DIRTY " + c32626c2oc2i.coo2iico + '\n');
            } else {
                bufferedWriter.write("CLEAN " + c32626c2oc2i.coo2iico + c32626c2oc2i.coo2iico() + '\n');
            }
        }
        bufferedWriter.close();
        this.c2oc2i.renameTo(this.coi222o222);
        this.ciii2coi2 = new BufferedWriter(new FileWriter(this.coi222o222, true), 8192);
    }

    private void cicc2iiccc() throws IOException {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(this.coi222o222), 8192);
        try {
            String c2oc2i = c2oc2i(bufferedInputStream);
            String c2oc2i2 = c2oc2i(bufferedInputStream);
            String c2oc2i3 = c2oc2i(bufferedInputStream);
            String c2oc2i4 = c2oc2i(bufferedInputStream);
            String c2oc2i5 = c2oc2i(bufferedInputStream);
            if (!c222o2o2c2o.equals(c2oc2i) || !"1".equals(c2oc2i2) || !Integer.toString(this.cioccoiococ).equals(c2oc2i3) || !Integer.toString(this.cco22).equals(c2oc2i4) || !"".equals(c2oc2i5)) {
                throw new IOException("unexpected journal header: [" + c2oc2i + ", " + c2oc2i2 + ", " + c2oc2i4 + ", " + c2oc2i5 + C21114v8.C21123i.f54139e);
            }
            while (true) {
                try {
                    c2oc2i(c2oc2i(bufferedInputStream));
                } catch (EOFException unused) {
                    return;
                }
            }
        } finally {
            coo2iico((Closeable) bufferedInputStream);
        }
    }

    private void cicic() throws IOException {
        coi222o222(this.c2oc2i);
        Iterator<C32626c2oc2i> it = this.coiic.values().iterator();
        while (it.hasNext()) {
            C32626c2oc2i next = it.next();
            int i = 0;
            if (next.cioccoiococ != null) {
                next.cioccoiococ = null;
                while (i < this.cco22) {
                    coi222o222(next.coo2iico(i));
                    coi222o222(next.coi222o222(i));
                    i++;
                }
                it.remove();
            } else {
                while (i < this.cco22) {
                    this.cii2c2 += next.coi222o222[i];
                    i++;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean ciii2coi2() {
        int i = this.cicic;
        if (i >= 2000 && i >= this.coiic.size()) {
            return true;
        }
        return false;
    }

    public boolean cii2c2() {
        if (this.ciii2coi2 == null) {
            return true;
        }
        return false;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.ciii2coi2 == null) {
            return;
        }
        Iterator it = new ArrayList(this.coiic.values()).iterator();
        while (it.hasNext()) {
            C32626c2oc2i c32626c2oc2i = (C32626c2oc2i) it.next();
            if (c32626c2oc2i.cioccoiococ != null) {
                c32626c2oc2i.cioccoiococ.coo2iico();
            }
        }
        c2oicci2();
        this.ciii2coi2.close();
        this.ciii2coi2 = null;
    }

    public long coiic() {
        return this.c2oc2o;
    }

    public synchronized long coiio2() {
        return this.cii2c2;
    }

    public static String c2oc2i(InputStream inputStream) throws IOException {
        StringBuilder sb2 = new StringBuilder(80);
        while (true) {
            int read = inputStream.read();
            if (read == -1) {
                throw new EOFException();
            }
            if (read == 10) {
                int length = sb2.length();
                if (length > 0) {
                    int i = length - 1;
                    if (sb2.charAt(i) == '\r') {
                        sb2.setLength(i);
                    }
                }
                return sb2.toString();
            }
            sb2.append((char) read);
        }
    }

    private static void coi222o222(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public synchronized void c2oc2o() throws IOException {
        coi222o222();
        c2oicci2();
        this.ciii2coi2.flush();
    }

    public File cco22() {
        return this.coo2iico;
    }

    public synchronized boolean cioccoiococ(String str) throws IOException {
        coi222o222();
        c2oc2o(str);
        C32626c2oc2i c32626c2oc2i = this.coiic.get(str);
        if (c32626c2oc2i != null && c32626c2oc2i.cioccoiococ == null) {
            for (int i = 0; i < this.cco22; i++) {
                File coo2iico = c32626c2oc2i.coo2iico(i);
                if (coo2iico.delete()) {
                    this.cii2c2 -= c32626c2oc2i.coi222o222[i];
                    c32626c2oc2i.coi222o222[i] = 0;
                } else {
                    throw new IOException("failed to delete " + coo2iico);
                }
            }
            this.cicic++;
            this.ciii2coi2.append((CharSequence) ("REMOVE " + str + '\n'));
            this.coiic.remove(str);
            if (ciii2coi2()) {
                this.ccoc2oic.submit(this.coiio2);
            }
            return true;
        }
        return false;
    }

    public synchronized C32627cioccoiococ coi222o222(String str) throws IOException {
        coi222o222();
        c2oc2o(str);
        C32626c2oc2i c32626c2oc2i = this.coiic.get(str);
        if (c32626c2oc2i == null) {
            return null;
        }
        if (c32626c2oc2i.c2oc2i) {
            int i = this.cco22;
            InputStream[] inputStreamArr = new InputStream[i];
            String[] strArr = new String[i];
            for (int i2 = 0; i2 < this.cco22; i2++) {
                try {
                    strArr[i2] = c32626c2oc2i.coo2iico(i2).getAbsolutePath();
                    inputStreamArr[i2] = new FileInputStream(c32626c2oc2i.coo2iico(i2));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
            this.cicic++;
            this.ciii2coi2.append((CharSequence) ("READ " + str + '\n'));
            if (ciii2coi2()) {
                this.ccoc2oic.submit(this.coiio2);
            }
            return new C32627cioccoiococ(this, str, c32626c2oc2i.c2oc2o, inputStreamArr, strArr, null);
        }
        return null;
    }

    private void c2oc2o(String str) {
        if (str.contains(" ") || str.contains("\n") || str.contains("\r")) {
            throw new IllegalArgumentException("keys must not contain spaces or newlines: \"" + str + "\"");
        }
    }

    private static <T> T[] coo2iico(T[] tArr, int i, int i2) {
        int length = tArr.length;
        if (i <= i2) {
            if (i >= 0 && i <= length) {
                int i3 = i2 - i;
                int min = Math.min(i3, length - i);
                T[] tArr2 = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), i3));
                System.arraycopy(tArr, i, tArr2, 0, min);
                return tArr2;
            }
            throw new ArrayIndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    private void c2oc2i(String str) throws IOException {
        String[] split = str.split(" ");
        if (split.length >= 2) {
            String str2 = split[1];
            if (split[0].equals(c2ccocci) && split.length == 2) {
                this.coiic.remove(str2);
                return;
            }
            C32626c2oc2i c32626c2oc2i = this.coiic.get(str2);
            if (c32626c2oc2i == null) {
                c32626c2oc2i = new C32626c2oc2i(this, str2, null);
                this.coiic.put(str2, c32626c2oc2i);
            }
            if (split[0].equals(cioc2) && split.length == this.cco22 + 2) {
                c32626c2oc2i.c2oc2i = true;
                c32626c2oc2i.cioccoiococ = null;
                c32626c2oc2i.coi222o222((String[]) coo2iico(split, 2, split.length));
                return;
            } else if (split[0].equals(ciiioc2ioc) && split.length == 2) {
                c32626c2oc2i.cioccoiococ = new C32628coi222o222(this, c32626c2oc2i, null);
                return;
            } else if (split[0].equals(ciiio2o) && split.length == 2) {
                return;
            } else {
                throw new IOException("unexpected journal line: " + str);
            }
        }
        throw new IOException("unexpected journal line: " + str);
    }

    public static String coo2iico(Reader reader) throws IOException {
        try {
            StringWriter stringWriter = new StringWriter();
            char[] cArr = new char[1024];
            while (true) {
                int read = reader.read(cArr);
                if (read != -1) {
                    stringWriter.write(cArr, 0, read);
                } else {
                    return stringWriter.toString();
                }
            }
        } finally {
            reader.close();
        }
    }

    private void cioccoiococ() {
        try {
            c2oc2i();
        } catch (IOException | IllegalArgumentException unused) {
        }
    }

    private void coi222o222() {
        if (this.ciii2coi2 == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    public static void coo2iico(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (RuntimeException e) {
                throw e;
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String coi222o222(InputStream inputStream) throws IOException {
        return coo2iico((Reader) new InputStreamReader(inputStream, ccoio));
    }

    public static void coo2iico(File file) throws IOException {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    coo2iico(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IllegalArgumentException("not a directory: " + file);
    }

    public void c2oc2i() throws IOException {
        close();
        coo2iico(this.coo2iico);
    }

    public static C32625c2oc2i coo2iico(File file, int i, int i2, long j) throws IOException {
        if (j > 0) {
            if (i2 > 0) {
                C32625c2oc2i c32625c2oc2i = new C32625c2oc2i(file, i, i2, j);
                if (c32625c2oc2i.coi222o222.exists()) {
                    try {
                        c32625c2oc2i.cicc2iiccc();
                        c32625c2oc2i.cicic();
                        c32625c2oc2i.ciii2coi2 = new BufferedWriter(new FileWriter(c32625c2oc2i.coi222o222, true), 8192);
                        return c32625c2oc2i;
                    } catch (IOException unused) {
                        c32625c2oc2i.cioccoiococ();
                    }
                }
                file.mkdirs();
                C32625c2oc2i c32625c2oc2i2 = new C32625c2oc2i(file, i, i2, j);
                c32625c2oc2i2.ccoc2oic();
                return c32625c2oc2i2;
            }
            throw new IllegalArgumentException("valueCount <= 0");
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public C32628coi222o222 coo2iico(String str) throws IOException {
        return coo2iico(str, -1L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized C32628coi222o222 coo2iico(String str, long j) throws IOException {
        coi222o222();
        c2oc2o(str);
        C32626c2oc2i c32626c2oc2i = this.coiic.get(str);
        if (j == -1 || (c32626c2oc2i != null && c32626c2oc2i.c2oc2o == j)) {
            if (c32626c2oc2i != null) {
                if (c32626c2oc2i.cioccoiococ != null) {
                    return null;
                }
            } else {
                c32626c2oc2i = new C32626c2oc2i(this, str, null);
                this.coiic.put(str, c32626c2oc2i);
            }
            C32628coi222o222 c32628coi222o222 = new C32628coi222o222(this, c32626c2oc2i, null);
            c32626c2oc2i.cioccoiococ = c32628coi222o222;
            Writer writer = this.ciii2coi2;
            writer.write("DIRTY " + str + '\n');
            this.ciii2coi2.flush();
            return c32628coi222o222;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void coo2iico(C32628coi222o222 c32628coi222o222, boolean z) throws IOException {
        C32626c2oc2i c32626c2oc2i = c32628coi222o222.coo2iico;
        if (c32626c2oc2i.cioccoiococ == c32628coi222o222) {
            if (z && !c32626c2oc2i.c2oc2i) {
                for (int i = 0; i < this.cco22; i++) {
                    if (!c32626c2oc2i.coi222o222(i).exists()) {
                        c32628coi222o222.coo2iico();
                        throw new IllegalStateException("edit didn't create file " + i);
                    }
                }
            }
            for (int i2 = 0; i2 < this.cco22; i2++) {
                File coi222o222 = c32626c2oc2i.coi222o222(i2);
                if (z) {
                    if (coi222o222.exists()) {
                        File coo2iico = c32626c2oc2i.coo2iico(i2);
                        coi222o222.renameTo(coo2iico);
                        long j = c32626c2oc2i.coi222o222[i2];
                        long length = coo2iico.length();
                        c32626c2oc2i.coi222o222[i2] = length;
                        this.cii2c2 = (this.cii2c2 - j) + length;
                    }
                } else {
                    coi222o222(coi222o222);
                }
            }
            this.cicic++;
            c32626c2oc2i.cioccoiococ = null;
            if (!(c32626c2oc2i.c2oc2i | z)) {
                this.coiic.remove(c32626c2oc2i.coo2iico);
                this.ciii2coi2.write("REMOVE " + c32626c2oc2i.coo2iico + '\n');
            } else {
                c32626c2oc2i.c2oc2i = true;
                this.ciii2coi2.write("CLEAN " + c32626c2oc2i.coo2iico + c32626c2oc2i.coo2iico() + '\n');
                if (z) {
                    long j2 = this.cicc2iiccc;
                    this.cicc2iiccc = 1 + j2;
                    c32626c2oc2i.c2oc2o = j2;
                }
            }
            if (this.cii2c2 > this.c2oc2o || ciii2coi2()) {
                this.ccoc2oic.submit(this.coiio2);
            }
        } else {
            throw new IllegalStateException();
        }
    }
}
