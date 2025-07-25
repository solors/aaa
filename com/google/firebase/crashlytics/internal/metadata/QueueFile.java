package com.google.firebase.crashlytics.internal.metadata;

import com.ironsource.C21114v8;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public class QueueFile implements Closeable {

    /* renamed from: i */
    private static final Logger f42453i = Logger.getLogger(QueueFile.class.getName());

    /* renamed from: b */
    private final RandomAccessFile f42454b;

    /* renamed from: c */
    int f42455c;

    /* renamed from: d */
    private int f42456d;

    /* renamed from: f */
    private Element f42457f;

    /* renamed from: g */
    private Element f42458g;

    /* renamed from: h */
    private final byte[] f42459h = new byte[16];

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes4.dex */
    public static class Element {

        /* renamed from: c */
        static final Element f42463c = new Element(0, 0);

        /* renamed from: a */
        final int f42464a;

        /* renamed from: b */
        final int f42465b;

        Element(int i, int i2) {
            this.f42464a = i;
            this.f42465b = i2;
        }

        public String toString() {
            return getClass().getSimpleName() + "[position = " + this.f42464a + ", length = " + this.f42465b + C21114v8.C21123i.f54139e;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public final class ElementInputStream extends InputStream {

        /* renamed from: b */
        private int f42466b;

        /* renamed from: c */
        private int f42467c;

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            QueueFile.m67027k(bArr, "buffer");
            if ((i | i2) >= 0 && i2 <= bArr.length - i) {
                int i3 = this.f42467c;
                if (i3 > 0) {
                    if (i2 > i3) {
                        i2 = i3;
                    }
                    QueueFile.this.m67021t(this.f42466b, bArr, i, i2);
                    this.f42466b = QueueFile.this.m67018w(this.f42466b + i2);
                    this.f42467c -= i2;
                    return i2;
                }
                return -1;
            }
            throw new ArrayIndexOutOfBoundsException();
        }

        private ElementInputStream(Element element) {
            this.f42466b = QueueFile.this.m67018w(element.f42464a + 4);
            this.f42467c = element.f42465b;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            if (this.f42467c == 0) {
                return -1;
            }
            QueueFile.this.f42454b.seek(this.f42466b);
            int read = QueueFile.this.f42454b.read();
            this.f42466b = QueueFile.this.m67018w(this.f42466b + 1);
            this.f42467c--;
            return read;
        }
    }

    /* loaded from: classes4.dex */
    public interface ElementReader {
        void read(InputStream inputStream, int i) throws IOException;
    }

    public QueueFile(File file) throws IOException {
        if (!file.exists()) {
            m67028i(file);
        }
        this.f42454b = m67026l(file);
        m67024n();
    }

    /* renamed from: I */
    private static void m67034I(byte[] bArr, int... iArr) {
        int i = 0;
        for (int i2 : iArr) {
            m67016y(bArr, i, i2);
            i += 4;
        }
    }

    /* renamed from: h */
    private void m67029h(int i) throws IOException {
        int i2 = i + 4;
        int m67022s = m67022s();
        if (m67022s >= i2) {
            return;
        }
        int i3 = this.f42455c;
        do {
            m67022s += i3;
            i3 <<= 1;
        } while (m67022s < i2);
        m67019v(i3);
        Element element = this.f42458g;
        int m67018w = m67018w(element.f42464a + 4 + element.f42465b);
        if (m67018w < this.f42457f.f42464a) {
            FileChannel channel = this.f42454b.getChannel();
            channel.position(this.f42455c);
            long j = m67018w - 4;
            if (channel.transferTo(16L, j, channel) != j) {
                throw new AssertionError("Copied insufficient number of bytes!");
            }
        }
        int i4 = this.f42458g.f42464a;
        int i5 = this.f42457f.f42464a;
        if (i4 < i5) {
            int i6 = (this.f42455c + i4) - 16;
            m67017x(i3, this.f42456d, i5, i6);
            this.f42458g = new Element(i6, this.f42458g.f42465b);
        } else {
            m67017x(i3, this.f42456d, i5, i4);
        }
        this.f42455c = i3;
    }

    /* renamed from: i */
    private static void m67028i(File file) throws IOException {
        File file2 = new File(file.getPath() + ".tmp");
        RandomAccessFile m67026l = m67026l(file2);
        try {
            m67026l.setLength(4096L);
            m67026l.seek(0L);
            byte[] bArr = new byte[16];
            m67034I(bArr, 4096, 0, 0, 0);
            m67026l.write(bArr);
            m67026l.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Rename failed!");
        } catch (Throwable th) {
            m67026l.close();
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static <T> T m67027k(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }

    /* renamed from: l */
    private static RandomAccessFile m67026l(File file) throws FileNotFoundException {
        return new RandomAccessFile(file, "rwd");
    }

    /* renamed from: m */
    private Element m67025m(int i) throws IOException {
        if (i == 0) {
            return Element.f42463c;
        }
        this.f42454b.seek(i);
        return new Element(i, this.f42454b.readInt());
    }

    /* renamed from: n */
    private void m67024n() throws IOException {
        this.f42454b.seek(0L);
        this.f42454b.readFully(this.f42459h);
        int m67023r = m67023r(this.f42459h, 0);
        this.f42455c = m67023r;
        if (m67023r <= this.f42454b.length()) {
            this.f42456d = m67023r(this.f42459h, 4);
            int m67023r2 = m67023r(this.f42459h, 8);
            int m67023r3 = m67023r(this.f42459h, 12);
            this.f42457f = m67025m(m67023r2);
            this.f42458g = m67025m(m67023r3);
            return;
        }
        throw new IOException("File is truncated. Expected length: " + this.f42455c + ", Actual length: " + this.f42454b.length());
    }

    /* renamed from: r */
    private static int m67023r(byte[] bArr, int i) {
        return ((bArr[i] & 255) << 24) + ((bArr[i + 1] & 255) << 16) + ((bArr[i + 2] & 255) << 8) + (bArr[i + 3] & 255);
    }

    /* renamed from: s */
    private int m67022s() {
        return this.f42455c - usedBytes();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: t */
    public void m67021t(int i, byte[] bArr, int i2, int i3) throws IOException {
        int m67018w = m67018w(i);
        int i4 = m67018w + i3;
        int i5 = this.f42455c;
        if (i4 <= i5) {
            this.f42454b.seek(m67018w);
            this.f42454b.readFully(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m67018w;
        this.f42454b.seek(m67018w);
        this.f42454b.readFully(bArr, i2, i6);
        this.f42454b.seek(16L);
        this.f42454b.readFully(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: u */
    private void m67020u(int i, byte[] bArr, int i2, int i3) throws IOException {
        int m67018w = m67018w(i);
        int i4 = m67018w + i3;
        int i5 = this.f42455c;
        if (i4 <= i5) {
            this.f42454b.seek(m67018w);
            this.f42454b.write(bArr, i2, i3);
            return;
        }
        int i6 = i5 - m67018w;
        this.f42454b.seek(m67018w);
        this.f42454b.write(bArr, i2, i6);
        this.f42454b.seek(16L);
        this.f42454b.write(bArr, i2 + i6, i3 - i6);
    }

    /* renamed from: v */
    private void m67019v(int i) throws IOException {
        this.f42454b.setLength(i);
        this.f42454b.getChannel().force(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: w */
    public int m67018w(int i) {
        int i2 = this.f42455c;
        if (i >= i2) {
            return (i + 16) - i2;
        }
        return i;
    }

    /* renamed from: x */
    private void m67017x(int i, int i2, int i3, int i4) throws IOException {
        m67034I(this.f42459h, i, i2, i3, i4);
        this.f42454b.seek(0L);
        this.f42454b.write(this.f42459h);
    }

    /* renamed from: y */
    private static void m67016y(byte[] bArr, int i, int i2) {
        bArr[i] = (byte) (i2 >> 24);
        bArr[i + 1] = (byte) (i2 >> 16);
        bArr[i + 2] = (byte) (i2 >> 8);
        bArr[i + 3] = (byte) i2;
    }

    public void add(byte[] bArr) throws IOException {
        add(bArr, 0, bArr.length);
    }

    public synchronized void clear() throws IOException {
        m67017x(4096, 0, 0, 0);
        this.f42456d = 0;
        Element element = Element.f42463c;
        this.f42457f = element;
        this.f42458g = element;
        if (this.f42455c > 4096) {
            m67019v(4096);
        }
        this.f42455c = 4096;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f42454b.close();
    }

    public synchronized void forEach(ElementReader elementReader) throws IOException {
        int i = this.f42457f.f42464a;
        for (int i2 = 0; i2 < this.f42456d; i2++) {
            Element m67025m = m67025m(i);
            elementReader.read(new ElementInputStream(m67025m), m67025m.f42465b);
            i = m67018w(m67025m.f42464a + 4 + m67025m.f42465b);
        }
    }

    public boolean hasSpaceFor(int i, int i2) {
        if (usedBytes() + 4 + i <= i2) {
            return true;
        }
        return false;
    }

    public synchronized boolean isEmpty() {
        boolean z;
        if (this.f42456d == 0) {
            z = true;
        } else {
            z = false;
        }
        return z;
    }

    public synchronized byte[] peek() throws IOException {
        if (isEmpty()) {
            return null;
        }
        Element element = this.f42457f;
        int i = element.f42465b;
        byte[] bArr = new byte[i];
        m67021t(element.f42464a + 4, bArr, 0, i);
        return bArr;
    }

    public synchronized void remove() throws IOException {
        if (!isEmpty()) {
            if (this.f42456d == 1) {
                clear();
            } else {
                Element element = this.f42457f;
                int m67018w = m67018w(element.f42464a + 4 + element.f42465b);
                m67021t(m67018w, this.f42459h, 0, 4);
                int m67023r = m67023r(this.f42459h, 0);
                m67017x(this.f42455c, this.f42456d - 1, m67018w, this.f42458g.f42464a);
                this.f42456d--;
                this.f42457f = new Element(m67018w, m67023r);
            }
        } else {
            throw new NoSuchElementException();
        }
    }

    public synchronized int size() {
        return this.f42456d;
    }

    public String toString() {
        final StringBuilder sb2 = new StringBuilder();
        sb2.append(getClass().getSimpleName());
        sb2.append('[');
        sb2.append("fileLength=");
        sb2.append(this.f42455c);
        sb2.append(", size=");
        sb2.append(this.f42456d);
        sb2.append(", first=");
        sb2.append(this.f42457f);
        sb2.append(", last=");
        sb2.append(this.f42458g);
        sb2.append(", element lengths=[");
        try {
            forEach(new ElementReader() { // from class: com.google.firebase.crashlytics.internal.metadata.QueueFile.1

                /* renamed from: a */
                boolean f42460a = true;

                @Override // com.google.firebase.crashlytics.internal.metadata.QueueFile.ElementReader
                public void read(InputStream inputStream, int i) throws IOException {
                    if (this.f42460a) {
                        this.f42460a = false;
                    } else {
                        sb2.append(", ");
                    }
                    sb2.append(i);
                }
            });
        } catch (IOException e) {
            f42453i.log(Level.WARNING, "read error", (Throwable) e);
        }
        sb2.append("]]");
        return sb2.toString();
    }

    public int usedBytes() {
        if (this.f42456d == 0) {
            return 16;
        }
        Element element = this.f42458g;
        int i = element.f42464a;
        int i2 = this.f42457f.f42464a;
        if (i >= i2) {
            return (i - i2) + 4 + element.f42465b + 16;
        }
        return (((i + 4) + element.f42465b) + this.f42455c) - i2;
    }

    public synchronized void add(byte[] bArr, int i, int i2) throws IOException {
        int m67018w;
        m67027k(bArr, "buffer");
        if ((i | i2) >= 0 && i2 <= bArr.length - i) {
            m67029h(i2);
            boolean isEmpty = isEmpty();
            if (isEmpty) {
                m67018w = 16;
            } else {
                Element element = this.f42458g;
                m67018w = m67018w(element.f42464a + 4 + element.f42465b);
            }
            Element element2 = new Element(m67018w, i2);
            m67016y(this.f42459h, 0, i2);
            m67020u(element2.f42464a, this.f42459h, 0, 4);
            m67020u(element2.f42464a + 4, bArr, i, i2);
            m67017x(this.f42455c, this.f42456d + 1, isEmpty ? element2.f42464a : this.f42457f.f42464a, element2.f42464a);
            this.f42458g = element2;
            this.f42456d++;
            if (isEmpty) {
                this.f42457f = element2;
            }
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    public synchronized void peek(ElementReader elementReader) throws IOException {
        if (this.f42456d > 0) {
            elementReader.read(new ElementInputStream(this.f42457f), this.f42457f.f42465b);
        }
    }
}
