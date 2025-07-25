package p689h;

import java.io.InputStream;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: ExifUtils.kt */
@Metadata
/* renamed from: h.k */
/* loaded from: classes2.dex */
final class C33441k extends InputStream {
    @NotNull

    /* renamed from: b */
    private final InputStream f91260b;

    /* renamed from: c */
    private int f91261c = 1073741824;

    public C33441k(@NotNull InputStream inputStream) {
        this.f91260b = inputStream;
    }

    /* renamed from: a */
    private final int m23937a(int i) {
        if (i == -1) {
            this.f91261c = 0;
        }
        return i;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f91261c;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f91260b.close();
    }

    @Override // java.io.InputStream
    public int read() {
        return m23937a(this.f91260b.read());
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f91260b.skip(j);
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] bArr) {
        return m23937a(this.f91260b.read(bArr));
    }

    @Override // java.io.InputStream
    public int read(@NotNull byte[] bArr, int i, int i2) {
        return m23937a(this.f91260b.read(bArr, i, i2));
    }
}
