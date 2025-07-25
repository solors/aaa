package org.chromium.net;

import android.os.ParcelFileDescriptor;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/* loaded from: classes10.dex */
public final class UploadDataProviders {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: org.chromium.net.UploadDataProviders$a */
    /* loaded from: classes10.dex */
    public static class C39235a implements InterfaceC39238d {

        /* renamed from: a */
        final /* synthetic */ File f103035a;

        C39235a(File file) {
            this.f103035a = file;
        }

        @Override // org.chromium.net.UploadDataProviders.InterfaceC39238d
        /* renamed from: a */
        public FileChannel mo13386a() throws IOException {
            return new FileInputStream(this.f103035a).getChannel();
        }
    }

    /* renamed from: org.chromium.net.UploadDataProviders$b */
    /* loaded from: classes10.dex */
    static class C39236b implements InterfaceC39238d {

        /* renamed from: a */
        final /* synthetic */ ParcelFileDescriptor f103036a;

        C39236b(ParcelFileDescriptor parcelFileDescriptor) {
            this.f103036a = parcelFileDescriptor;
        }

        @Override // org.chromium.net.UploadDataProviders.InterfaceC39238d
        /* renamed from: a */
        public FileChannel mo13386a() throws IOException {
            if (this.f103036a.getStatSize() != -1) {
                return new ParcelFileDescriptor.AutoCloseInputStream(this.f103036a).getChannel();
            }
            this.f103036a.close();
            throw new IllegalArgumentException("Not a file: " + this.f103036a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.chromium.net.UploadDataProviders$c */
    /* loaded from: classes10.dex */
    public static final class C39237c extends UploadDataProvider {

        /* renamed from: b */
        private final ByteBuffer f103037b;

        /* synthetic */ C39237c(ByteBuffer byteBuffer, C39235a c39235a) {
            this(byteBuffer);
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() {
            return this.f103037b.limit();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) {
            if (byteBuffer.hasRemaining()) {
                if (byteBuffer.remaining() >= this.f103037b.remaining()) {
                    byteBuffer.put(this.f103037b);
                } else {
                    int limit = this.f103037b.limit();
                    ByteBuffer byteBuffer2 = this.f103037b;
                    byteBuffer2.limit(byteBuffer2.position() + byteBuffer.remaining());
                    byteBuffer.put(this.f103037b);
                    this.f103037b.limit(limit);
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) {
            this.f103037b.position(0);
            uploadDataSink.onRewindSucceeded();
        }

        private C39237c(ByteBuffer byteBuffer) {
            this.f103037b = byteBuffer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: org.chromium.net.UploadDataProviders$d */
    /* loaded from: classes10.dex */
    public interface InterfaceC39238d {
        /* renamed from: a */
        FileChannel mo13386a() throws IOException;
    }

    /* renamed from: org.chromium.net.UploadDataProviders$e */
    /* loaded from: classes10.dex */
    private static final class C39239e extends UploadDataProvider {

        /* renamed from: b */
        private volatile FileChannel f103038b;

        /* renamed from: c */
        private final InterfaceC39238d f103039c;

        /* renamed from: d */
        private final Object f103040d;

        /* synthetic */ C39239e(InterfaceC39238d interfaceC39238d, C39235a c39235a) {
            this(interfaceC39238d);
        }

        /* renamed from: a */
        private FileChannel m13385a() throws IOException {
            if (this.f103038b == null) {
                synchronized (this.f103040d) {
                    if (this.f103038b == null) {
                        this.f103038b = this.f103039c.mo13386a();
                    }
                }
            }
            return this.f103038b;
        }

        @Override // org.chromium.net.UploadDataProvider, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            FileChannel fileChannel = this.f103038b;
            if (fileChannel != null) {
                fileChannel.close();
            }
        }

        @Override // org.chromium.net.UploadDataProvider
        public long getLength() throws IOException {
            return m13385a().size();
        }

        @Override // org.chromium.net.UploadDataProvider
        public void read(UploadDataSink uploadDataSink, ByteBuffer byteBuffer) throws IOException {
            if (byteBuffer.hasRemaining()) {
                FileChannel m13385a = m13385a();
                int i = 0;
                while (i == 0) {
                    int read = m13385a.read(byteBuffer);
                    if (read == -1) {
                        break;
                    }
                    i += read;
                }
                uploadDataSink.onReadSucceeded(false);
                return;
            }
            throw new IllegalStateException("Cronet passed a buffer with no bytes remaining");
        }

        @Override // org.chromium.net.UploadDataProvider
        public void rewind(UploadDataSink uploadDataSink) throws IOException {
            m13385a().position(0L);
            uploadDataSink.onRewindSucceeded();
        }

        private C39239e(InterfaceC39238d interfaceC39238d) {
            this.f103040d = new Object();
            this.f103039c = interfaceC39238d;
        }
    }

    private UploadDataProviders() {
    }

    public static UploadDataProvider create(File file) {
        return new C39239e(new C39235a(file), null);
    }

    public static UploadDataProvider create(ParcelFileDescriptor parcelFileDescriptor) {
        return new C39239e(new C39236b(parcelFileDescriptor), null);
    }

    public static UploadDataProvider create(ByteBuffer byteBuffer) {
        return new C39237c(byteBuffer.slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr, int i, int i2) {
        return new C39237c(ByteBuffer.wrap(bArr, i, i2).slice(), null);
    }

    public static UploadDataProvider create(byte[] bArr) {
        return create(bArr, 0, bArr.length);
    }
}
