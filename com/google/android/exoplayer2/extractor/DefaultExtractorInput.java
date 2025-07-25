package com.google.android.exoplayer2.extractor;

import com.google.android.exoplayer2.ExoPlayerLibraryInfo;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class DefaultExtractorInput implements ExtractorInput {

    /* renamed from: b */
    private final DataReader f32889b;

    /* renamed from: c */
    private final long f32890c;

    /* renamed from: d */
    private long f32891d;

    /* renamed from: f */
    private int f32893f;

    /* renamed from: g */
    private int f32894g;

    /* renamed from: e */
    private byte[] f32892e = new byte[65536];

    /* renamed from: a */
    private final byte[] f32888a = new byte[4096];

    static {
        ExoPlayerLibraryInfo.registerModule("goog.exo.extractor");
    }

    public DefaultExtractorInput(DataReader dataReader, long j, long j2) {
        this.f32889b = dataReader;
        this.f32891d = j;
        this.f32890c = j2;
    }

    /* renamed from: b */
    private void m74734b(int i) {
        if (i != -1) {
            this.f32891d += i;
        }
    }

    /* renamed from: c */
    private void m74733c(int i) {
        int i2 = this.f32893f + i;
        byte[] bArr = this.f32892e;
        if (i2 > bArr.length) {
            this.f32892e = Arrays.copyOf(this.f32892e, Util.constrainValue(bArr.length * 2, 65536 + i2, i2 + 524288));
        }
    }

    /* renamed from: d */
    private int m74732d(byte[] bArr, int i, int i2) {
        int i3 = this.f32894g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f32892e, 0, bArr, i, min);
        m74729g(min);
        return min;
    }

    /* renamed from: e */
    private int m74731e(byte[] bArr, int i, int i2, int i3, boolean z) throws IOException {
        if (!Thread.interrupted()) {
            int read = this.f32889b.read(bArr, i + i3, i2 - i3);
            if (read == -1) {
                if (i3 == 0 && z) {
                    return -1;
                }
                throw new EOFException();
            }
            return i3 + read;
        }
        throw new InterruptedIOException();
    }

    /* renamed from: f */
    private int m74730f(int i) {
        int min = Math.min(this.f32894g, i);
        m74729g(min);
        return min;
    }

    /* renamed from: g */
    private void m74729g(int i) {
        byte[] bArr;
        int i2 = this.f32894g - i;
        this.f32894g = i2;
        this.f32893f = 0;
        byte[] bArr2 = this.f32892e;
        if (i2 < bArr2.length - 524288) {
            bArr = new byte[65536 + i2];
        } else {
            bArr = bArr2;
        }
        System.arraycopy(bArr2, i, bArr, 0, i2);
        this.f32892e = bArr;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        m74733c(i);
        int i2 = this.f32894g - this.f32893f;
        while (i2 < i) {
            i2 = m74731e(this.f32892e, this.f32893f, i, i2, z);
            if (i2 == -1) {
                return false;
            }
            this.f32894g = this.f32893f + i2;
        }
        this.f32893f += i;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.f32890c;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.f32891d + this.f32893f;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.f32891d;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i, int i2) throws IOException {
        int min;
        m74733c(i2);
        int i3 = this.f32894g;
        int i4 = this.f32893f;
        int i5 = i3 - i4;
        if (i5 == 0) {
            min = m74731e(this.f32892e, i4, i2, 0, true);
            if (min == -1) {
                return -1;
            }
            this.f32894g += min;
        } else {
            min = Math.min(i2, i5);
        }
        System.arraycopy(this.f32892e, this.f32893f, bArr, i, min);
        this.f32893f += min;
        return min;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        if (advancePeekPosition(i2, z)) {
            System.arraycopy(this.f32892e, this.f32893f - i2, bArr, i, i2);
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int m74732d = m74732d(bArr, i, i2);
        if (m74732d == 0) {
            m74732d = m74731e(bArr, i, i2, 0, true);
        }
        m74734b(m74732d);
        return m74732d;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        int m74732d = m74732d(bArr, i, i2);
        while (m74732d < i2 && m74732d != -1) {
            m74732d = m74731e(bArr, i, i2, m74732d, z);
        }
        m74734b(m74732d);
        return m74732d != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.f32893f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f32891d = j;
        throw e;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i) throws IOException {
        int m74730f = m74730f(i);
        if (m74730f == 0) {
            byte[] bArr = this.f32888a;
            m74730f = m74731e(bArr, 0, Math.min(i, bArr.length), 0, true);
        }
        m74734b(m74730f);
        return m74730f;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i, boolean z) throws IOException {
        int m74730f = m74730f(i);
        while (m74730f < i && m74730f != -1) {
            m74730f = m74731e(this.f32888a, -m74730f, Math.min(i, this.f32888a.length + m74730f), m74730f, z);
        }
        m74734b(m74730f);
        return m74730f != -1;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        peekFully(bArr, i, i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        readFully(bArr, i, i2, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i) throws IOException {
        skipFully(i, false);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i) throws IOException {
        advancePeekPosition(i, false);
    }
}
