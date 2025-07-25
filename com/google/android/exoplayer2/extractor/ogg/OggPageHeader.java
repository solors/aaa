package com.google.android.exoplayer2.extractor.ogg;

import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorUtil;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* loaded from: classes4.dex */
final class OggPageHeader {
    public static final int EMPTY_PAGE_HEADER_SIZE = 27;
    public static final int MAX_PAGE_PAYLOAD = 65025;
    public static final int MAX_PAGE_SIZE = 65307;
    public static final int MAX_SEGMENT_COUNT = 255;
    public int bodySize;
    public long granulePosition;
    public int headerSize;
    public long pageChecksum;
    public int pageSegmentCount;
    public long pageSequenceNumber;
    public int revision;
    public long streamSerialNumber;
    public int type;
    public final int[] laces = new int[255];

    /* renamed from: a */
    private final ParsableByteArray f33293a = new ParsableByteArray(255);

    public boolean populate(ExtractorInput extractorInput, boolean z) throws IOException {
        reset();
        this.f33293a.reset(27);
        if (!ExtractorUtil.peekFullyQuietly(extractorInput, this.f33293a.getData(), 0, 27, z) || this.f33293a.readUnsignedInt() != 1332176723) {
            return false;
        }
        int readUnsignedByte = this.f33293a.readUnsignedByte();
        this.revision = readUnsignedByte;
        if (readUnsignedByte != 0) {
            if (z) {
                return false;
            }
            throw ParserException.createForUnsupportedContainerFeature("unsupported bit stream revision");
        }
        this.type = this.f33293a.readUnsignedByte();
        this.granulePosition = this.f33293a.readLittleEndianLong();
        this.streamSerialNumber = this.f33293a.readLittleEndianUnsignedInt();
        this.pageSequenceNumber = this.f33293a.readLittleEndianUnsignedInt();
        this.pageChecksum = this.f33293a.readLittleEndianUnsignedInt();
        int readUnsignedByte2 = this.f33293a.readUnsignedByte();
        this.pageSegmentCount = readUnsignedByte2;
        this.headerSize = readUnsignedByte2 + 27;
        this.f33293a.reset(readUnsignedByte2);
        if (!ExtractorUtil.peekFullyQuietly(extractorInput, this.f33293a.getData(), 0, this.pageSegmentCount, z)) {
            return false;
        }
        for (int i = 0; i < this.pageSegmentCount; i++) {
            this.laces[i] = this.f33293a.readUnsignedByte();
            this.bodySize += this.laces[i];
        }
        return true;
    }

    public void reset() {
        this.revision = 0;
        this.type = 0;
        this.granulePosition = 0L;
        this.streamSerialNumber = 0L;
        this.pageSequenceNumber = 0L;
        this.pageChecksum = 0L;
        this.pageSegmentCount = 0;
        this.headerSize = 0;
        this.bodySize = 0;
    }

    public boolean skipToNextPage(ExtractorInput extractorInput) throws IOException {
        return skipToNextPage(extractorInput, -1L);
    }

    public boolean skipToNextPage(ExtractorInput extractorInput, long j) throws IOException {
        int i;
        Assertions.checkArgument(extractorInput.getPosition() == extractorInput.getPeekPosition());
        this.f33293a.reset(4);
        while (true) {
            i = (j > (-1L) ? 1 : (j == (-1L) ? 0 : -1));
            if ((i == 0 || extractorInput.getPosition() + 4 < j) && ExtractorUtil.peekFullyQuietly(extractorInput, this.f33293a.getData(), 0, 4, true)) {
                this.f33293a.setPosition(0);
                if (this.f33293a.readUnsignedInt() == 1332176723) {
                    extractorInput.resetPeekPosition();
                    return true;
                }
                extractorInput.skipFully(1);
            }
        }
        do {
            if (i != 0 && extractorInput.getPosition() >= j) {
                break;
            }
        } while (extractorInput.skip(1) != -1);
        return false;
    }
}
