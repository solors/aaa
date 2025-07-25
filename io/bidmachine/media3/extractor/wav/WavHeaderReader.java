package io.bidmachine.media3.extractor.wav;

import android.util.Pair;
import io.bidmachine.media3.common.ParserException;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.ExtractorInput;
import java.io.IOException;

/* renamed from: io.bidmachine.media3.extractor.wav.b */
/* loaded from: classes9.dex */
final class WavHeaderReader {
    private static final String TAG = "WavHeaderReader";

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: WavHeaderReader.java */
    /* renamed from: io.bidmachine.media3.extractor.wav.b$a */
    /* loaded from: classes9.dex */
    public static final class C36661a {
        public static final int SIZE_IN_BYTES = 8;

        /* renamed from: id */
        public final int f97306id;
        public final long size;

        private C36661a(int i, long j) {
            this.f97306id = i;
            this.size = j;
        }

        public static C36661a peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new C36661a(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    public static boolean checkFileType(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i = C36661a.peek(extractorInput, parsableByteArray).f97306id;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt != 1463899717) {
            Log.m19949e(TAG, "Unsupported form type: " + readInt);
            return false;
        }
        return true;
    }

    public static WavFormat readFormat(ExtractorInput extractorInput) throws IOException {
        boolean z;
        byte[] bArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        C36661a skipToChunk = skipToChunk(1718449184, extractorInput, parsableByteArray);
        if (skipToChunk.size >= 16) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 16);
        parsableByteArray.setPosition(0);
        int readLittleEndianUnsignedShort = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort2 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianUnsignedShort3 = parsableByteArray.readLittleEndianUnsignedShort();
        int readLittleEndianUnsignedShort4 = parsableByteArray.readLittleEndianUnsignedShort();
        int i = ((int) skipToChunk.size) - 16;
        if (i > 0) {
            byte[] bArr2 = new byte[i];
            extractorInput.peekFully(bArr2, 0, i);
            bArr = bArr2;
        } else {
            bArr = Util.EMPTY_BYTE_ARRAY;
        }
        extractorInput.skipFully((int) (extractorInput.getPeekPosition() - extractorInput.getPosition()));
        return new WavFormat(readLittleEndianUnsignedShort, readLittleEndianUnsignedShort2, readLittleEndianUnsignedIntToInt, readLittleEndianUnsignedIntToInt2, readLittleEndianUnsignedShort3, readLittleEndianUnsignedShort4, bArr);
    }

    public static long readRf64SampleDataSize(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        C36661a peek = C36661a.peek(extractorInput, parsableByteArray);
        if (peek.f97306id != 1685272116) {
            extractorInput.resetPeekPosition();
            return -1L;
        }
        extractorInput.advancePeekPosition(8);
        parsableByteArray.setPosition(0);
        extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
        long readLittleEndianLong = parsableByteArray.readLittleEndianLong();
        extractorInput.skipFully(((int) peek.size) + 8);
        return readLittleEndianLong;
    }

    private static C36661a skipToChunk(int i, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
        C36661a peek = C36661a.peek(extractorInput, parsableByteArray);
        while (peek.f97306id != i) {
            Log.m19945w(TAG, "Ignoring unknown WAV chunk: " + peek.f97306id);
            long j = peek.size + 8;
            if (j <= 2147483647L) {
                extractorInput.skipFully((int) j);
                peek = C36661a.peek(extractorInput, parsableByteArray);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + peek.f97306id);
            }
        }
        return peek;
    }

    public static Pair<Long, Long> skipToSampleData(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        C36661a skipToChunk = skipToChunk(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(skipToChunk.size));
    }
}
