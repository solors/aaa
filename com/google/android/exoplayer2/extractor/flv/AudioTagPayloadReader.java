package com.google.android.exoplayer2.extractor.flv;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.flv.TagPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* loaded from: classes4.dex */
final class AudioTagPayloadReader extends TagPayloadReader {

    /* renamed from: e */
    private static final int[] f33005e = {5512, 11025, 22050, 44100};

    /* renamed from: b */
    private boolean f33006b;

    /* renamed from: c */
    private boolean f33007c;

    /* renamed from: d */
    private int f33008d;

    public AudioTagPayloadReader(TrackOutput trackOutput) {
        super(trackOutput);
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: a */
    protected boolean mo74638a(ParsableByteArray parsableByteArray) throws TagPayloadReader.UnsupportedFormatException {
        String str;
        if (!this.f33006b) {
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int i = (readUnsignedByte >> 4) & 15;
            this.f33008d = i;
            if (i == 2) {
                this.f33028a.format(new Format.Builder().setSampleMimeType("audio/mpeg").setChannelCount(1).setSampleRate(f33005e[(readUnsignedByte >> 2) & 3]).build());
                this.f33007c = true;
            } else if (i != 7 && i != 8) {
                if (i != 10) {
                    throw new TagPayloadReader.UnsupportedFormatException("Audio format not supported: " + this.f33008d);
                }
            } else {
                if (i == 7) {
                    str = "audio/g711-alaw";
                } else {
                    str = "audio/g711-mlaw";
                }
                this.f33028a.format(new Format.Builder().setSampleMimeType(str).setChannelCount(1).setSampleRate(8000).build());
                this.f33007c = true;
            }
            this.f33006b = true;
        } else {
            parsableByteArray.skipBytes(1);
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    /* renamed from: b */
    protected boolean mo74637b(ParsableByteArray parsableByteArray, long j) throws ParserException {
        if (this.f33008d == 2) {
            int bytesLeft = parsableByteArray.bytesLeft();
            this.f33028a.sampleData(parsableByteArray, bytesLeft);
            this.f33028a.sampleMetadata(j, 1, bytesLeft, 0, null);
            return true;
        }
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if (readUnsignedByte == 0 && !this.f33007c) {
            int bytesLeft2 = parsableByteArray.bytesLeft();
            byte[] bArr = new byte[bytesLeft2];
            parsableByteArray.readBytes(bArr, 0, bytesLeft2);
            AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr);
            this.f33028a.format(new Format.Builder().setSampleMimeType("audio/mp4a-latm").setCodecs(parseAudioSpecificConfig.codecs).setChannelCount(parseAudioSpecificConfig.channelCount).setSampleRate(parseAudioSpecificConfig.sampleRateHz).setInitializationData(Collections.singletonList(bArr)).build());
            this.f33007c = true;
            return false;
        } else if (this.f33008d == 10 && readUnsignedByte != 1) {
            return false;
        } else {
            int bytesLeft3 = parsableByteArray.bytesLeft();
            this.f33028a.sampleData(parsableByteArray, bytesLeft3);
            this.f33028a.sampleMetadata(j, 1, bytesLeft3, 0, null);
            return true;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.flv.TagPayloadReader
    public void seek() {
    }
}
