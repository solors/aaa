package com.google.android.exoplayer2.source.mediaparser;

import android.annotation.SuppressLint;
import android.media.MediaParser;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.upstream.DataReader;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

@RequiresApi(30)
@SuppressLint({"Override"})
/* loaded from: classes4.dex */
public final class InputReaderAdapterV30 implements MediaParser.SeekableInputReader {
    @Nullable

    /* renamed from: a */
    private DataReader f34665a;

    /* renamed from: b */
    private long f34666b;

    /* renamed from: c */
    private long f34667c;

    /* renamed from: d */
    private long f34668d;

    public long getAndResetSeekPosition() {
        long j = this.f34668d;
        this.f34668d = -1L;
        return j;
    }

    @Override // android.media.MediaParser.InputReader
    public long getLength() {
        return this.f34666b;
    }

    @Override // android.media.MediaParser.InputReader
    public long getPosition() {
        return this.f34667c;
    }

    @Override // android.media.MediaParser.InputReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        int read = ((DataReader) Util.castNonNull(this.f34665a)).read(bArr, i, i2);
        this.f34667c += read;
        return read;
    }

    @Override // android.media.MediaParser.SeekableInputReader
    public void seekToPosition(long j) {
        this.f34668d = j;
    }

    public void setCurrentPosition(long j) {
        this.f34667c = j;
    }

    public void setDataReader(DataReader dataReader, long j) {
        this.f34665a = dataReader;
        this.f34666b = j;
        this.f34668d = -1L;
    }
}
