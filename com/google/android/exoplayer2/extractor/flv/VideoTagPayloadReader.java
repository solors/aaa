package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.NalUnitUtil;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.video.AvcConfig;

/* loaded from: classes4.dex */
final class VideoTagPayloadReader extends TagPayloadReader {

    /* renamed from: b */
    private final ParsableByteArray f33029b;

    /* renamed from: c */
    private final ParsableByteArray f33030c;

    /* renamed from: d */
    private int f33031d;

    /* renamed from: e */
    private boolean f33032e;

    /* renamed from: f */
    private boolean f33033f;

    /* renamed from: g */
    private int f33034g;

    public VideoTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
        this.f33029b = new ParsableByteArray(NalUnitUtil.NAL_START_CODE);
        this.f33030c = new ParsableByteArray(4);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: a */
    protected boolean mo74638a(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i = (readUnsignedByte >> 4) & 15;
        int i2 = readUnsignedByte & 15;
        if (i2 == 7) {
            this.f33034g = i;
            if (i != 5) {
                return true;
            }
            return false;
        }
        throw new TagPayloadReader.UnsupportedFormatException("Video format not supported: " + i2);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: b */
    protected boolean mo74637b(ParsableByteArray parsableByteArray, long j) throws ParserException {
        int i;
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        long readInt24 = j + (parsableByteArray.readInt24() * 1000);
        if (readUnsignedByte == 0 && !this.f33032e) {
            ParsableByteArray parsableByteArray2 = new ParsableByteArray(new byte[parsableByteArray.bytesLeft()]);
            parsableByteArray.readBytes(parsableByteArray2.getData(), 0, parsableByteArray.bytesLeft());
            AvcConfig parse = AvcConfig.parse(parsableByteArray2);
            this.f33031d = parse.nalUnitLengthFieldLength;
            this.f33028a.format(new Format.Builder().setSampleMimeType("video/avc").setCodecs(parse.codecs).setWidth(parse.width).setHeight(parse.height).setPixelWidthHeightRatio(parse.pixelWidthHeightRatio).setInitializationData(parse.initializationData).build());
            this.f33032e = true;
            return false;
        } else if (readUnsignedByte != 1 || !this.f33032e) {
            return false;
        } else {
            if (this.f33034g == 1) {
                i = 1;
            } else {
                i = 0;
            }
            if (!this.f33033f && i == 0) {
                return false;
            }
            byte[] data = this.f33030c.getData();
            data[0] = 0;
            data[1] = 0;
            data[2] = 0;
            int i2 = 4 - this.f33031d;
            int i3 = 0;
            while (parsableByteArray.bytesLeft() > 0) {
                parsableByteArray.readBytes(this.f33030c.getData(), i2, this.f33031d);
                this.f33030c.setPosition(0);
                int readUnsignedIntToInt = this.f33030c.readUnsignedIntToInt();
                this.f33029b.setPosition(0);
                this.f33028a.sampleData(this.f33029b, 4);
                this.f33028a.sampleData(parsableByteArray, readUnsignedIntToInt);
                i3 = i3 + 4 + readUnsignedIntToInt;
            }
            this.f33028a.sampleMetadata(readInt24, i, i3, 0, null);
            this.f33033f = true;
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
        this.f33033f = false;
    }
}
