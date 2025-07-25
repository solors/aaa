package com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import com.mbridge.msdk.playercommon.exoplayer2.util.TimestampAdjuster;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;

/* renamed from: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.SectionReader */
/* loaded from: classes6.dex */
public final class SectionReader implements TsPayloadReader {
    private static final int DEFAULT_SECTION_BUFFER_LENGTH = 32;
    private static final int MAX_SECTION_LENGTH = 4098;
    private static final int SECTION_HEADER_LENGTH = 3;
    private int bytesRead;
    private final SectionPayloadReader reader;
    private final ParsableByteArray sectionData = new ParsableByteArray(32);
    private boolean sectionSyntaxIndicator;
    private int totalSectionLength;
    private boolean waitingForPayloadStart;

    public SectionReader(SectionPayloadReader sectionPayloadReader) {
        this.reader = sectionPayloadReader;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.TsPayloadReader
    public final void consume(ParsableByteArray parsableByteArray, boolean z) {
        int i;
        if (z) {
            i = parsableByteArray.getPosition() + parsableByteArray.readUnsignedByte();
        } else {
            i = -1;
        }
        if (this.waitingForPayloadStart) {
            if (!z) {
                return;
            }
            this.waitingForPayloadStart = false;
            parsableByteArray.setPosition(i);
            this.bytesRead = 0;
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.bytesRead;
            boolean z2 = true;
            if (i2 < 3) {
                if (i2 == 0) {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    parsableByteArray.setPosition(parsableByteArray.getPosition() - 1);
                    if (readUnsignedByte == 255) {
                        this.waitingForPayloadStart = true;
                        return;
                    }
                }
                int min = Math.min(parsableByteArray.bytesLeft(), 3 - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.data, this.bytesRead, min);
                int i3 = this.bytesRead + min;
                this.bytesRead = i3;
                if (i3 == 3) {
                    this.sectionData.reset(3);
                    this.sectionData.skipBytes(1);
                    int readUnsignedByte2 = this.sectionData.readUnsignedByte();
                    int readUnsignedByte3 = this.sectionData.readUnsignedByte();
                    if ((readUnsignedByte2 & 128) == 0) {
                        z2 = false;
                    }
                    this.sectionSyntaxIndicator = z2;
                    this.totalSectionLength = (((readUnsignedByte2 & 15) << 8) | readUnsignedByte3) + 3;
                    int capacity = this.sectionData.capacity();
                    int i4 = this.totalSectionLength;
                    if (capacity < i4) {
                        ParsableByteArray parsableByteArray2 = this.sectionData;
                        byte[] bArr = parsableByteArray2.data;
                        parsableByteArray2.reset(Math.min(4098, Math.max(i4, bArr.length * 2)));
                        System.arraycopy(bArr, 0, this.sectionData.data, 0, 3);
                    }
                }
            } else {
                int min2 = Math.min(parsableByteArray.bytesLeft(), this.totalSectionLength - this.bytesRead);
                parsableByteArray.readBytes(this.sectionData.data, this.bytesRead, min2);
                int i5 = this.bytesRead + min2;
                this.bytesRead = i5;
                int i6 = this.totalSectionLength;
                if (i5 != i6) {
                    continue;
                } else {
                    if (this.sectionSyntaxIndicator) {
                        if (Util.crc(this.sectionData.data, 0, i6, -1) != 0) {
                            this.waitingForPayloadStart = true;
                            return;
                        }
                        this.sectionData.reset(this.totalSectionLength - 4);
                    } else {
                        this.sectionData.reset(i6);
                    }
                    this.reader.consume(this.sectionData);
                    this.bytesRead = 0;
                }
            }
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.TsPayloadReader
    public final void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.reader.init(timestampAdjuster, extractorOutput, trackIdGenerator);
        this.waitingForPayloadStart = true;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.TsPayloadReader
    public final void seek() {
        this.waitingForPayloadStart = true;
    }
}
