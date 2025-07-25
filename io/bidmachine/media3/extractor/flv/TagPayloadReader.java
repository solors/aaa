package io.bidmachine.media3.extractor.flv;

import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.extractor.TrackOutput;

/* loaded from: classes9.dex */
abstract class TagPayloadReader {
    protected final TrackOutput output;

    /* loaded from: classes9.dex */
    public static final class UnsupportedFormatException extends ParserException {
        public UnsupportedFormatException(String str) {
            super(str, null, false, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public TagPayloadReader(TrackOutput trackOutput) {
        this.output = trackOutput;
    }

    public final boolean consume(ParsableByteArray parsableByteArray, long j) throws ParserException {
        if (parseHeader(parsableByteArray) && parsePayload(parsableByteArray, j)) {
            return true;
        }
        return false;
    }

    protected abstract boolean parseHeader(ParsableByteArray parsableByteArray) throws ParserException;

    protected abstract boolean parsePayload(ParsableByteArray parsableByteArray, long j) throws ParserException;

    public abstract void seek();
}
