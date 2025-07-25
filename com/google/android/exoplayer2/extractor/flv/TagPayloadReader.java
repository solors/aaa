package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* loaded from: classes4.dex */
abstract class TagPayloadReader {

    /* renamed from: a */
    protected final TrackOutput f33028a;

    /* loaded from: classes4.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TagPayloadReader(TrackOutput trackOutput) {
        this.f33028a = trackOutput;
    }

    /* renamed from: a */
    protected abstract boolean mo74638a(ParsableByteArray parsableByteArray) throws ParserException;

    /* renamed from: b */
    protected abstract boolean mo74637b(ParsableByteArray parsableByteArray, long j) throws ParserException;

    public final boolean consume(ParsableByteArray parsableByteArray, long j) throws ParserException {
        if (mo74638a(parsableByteArray) && mo74637b(parsableByteArray, j)) {
            return true;
        }
        return false;
    }

    public abstract void seek();
}
