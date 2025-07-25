package com.google.android.exoplayer2.extractor.wav;

import android.util.Pair;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
final class WavHeaderReader {

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class ChunkHeader {
        public static final int SIZE_IN_BYTES = 8;

        /* renamed from: id */
        public final int f33688id;
        public final long size;

        private ChunkHeader(int i, long j) {
            this.f33688id = i;
            this.size = j;
        }

        public static ChunkHeader peek(ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 8);
            parsableByteArray.setPosition(0);
            return new ChunkHeader(parsableByteArray.readInt(), parsableByteArray.readLittleEndianUnsignedInt());
        }
    }

    private WavHeaderReader() {
    }

    /* renamed from: a */
    private static ChunkHeader m74263a(int i, ExtractorInput extractorInput, ParsableByteArray parsableByteArray) throws IOException {
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        while (peek.f33688id != i) {
            Log.m72602w("WavHeaderReader", "Ignoring unknown WAV chunk: " + peek.f33688id);
            long j = peek.size + 8;
            if (j <= 2147483647L) {
                extractorInput.skipFully((int) j);
                peek = ChunkHeader.peek(extractorInput, parsableByteArray);
            } else {
                throw ParserException.createForUnsupportedContainerFeature("Chunk is too large (~2GB+) to skip; id: " + peek.f33688id);
            }
        }
        return peek;
    }

    public static boolean checkFileType(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(8);
        int i = ChunkHeader.peek(extractorInput, parsableByteArray).f33688id;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        extractorInput.peekFully(parsableByteArray.getData(), 0, 4);
        parsableByteArray.setPosition(0);
        int readInt = parsableByteArray.readInt();
        if (readInt != 1463899717) {
            Log.m72606e("WavHeaderReader", "Unsupported form type: " + readInt);
            return false;
        }
        return true;
    }

    public static WavFormat readFormat(ExtractorInput extractorInput) throws IOException {
        boolean z;
        byte[] bArr;
        ParsableByteArray parsableByteArray = new ParsableByteArray(16);
        ChunkHeader m74263a = m74263a(1718449184, extractorInput, parsableByteArray);
        if (m74263a.size >= 16) {
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
        int i = ((int) m74263a.size) - 16;
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
        ChunkHeader peek = ChunkHeader.peek(extractorInput, parsableByteArray);
        if (peek.f33688id != 1685272116) {
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

    public static Pair<Long, Long> skipToSampleData(ExtractorInput extractorInput) throws IOException {
        extractorInput.resetPeekPosition();
        ChunkHeader m74263a = m74263a(1684108385, extractorInput, new ParsableByteArray(8));
        extractorInput.skipFully(8);
        return Pair.create(Long.valueOf(extractorInput.getPosition()), Long.valueOf(m74263a.size));
    }
}
