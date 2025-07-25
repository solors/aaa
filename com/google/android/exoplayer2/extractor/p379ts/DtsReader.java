package com.google.android.exoplayer2.extractor.p379ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.DtsUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* renamed from: com.google.android.exoplayer2.extractor.ts.DtsReader */
/* loaded from: classes4.dex */
public final class DtsReader implements ElementaryStreamReader {
    @Nullable

    /* renamed from: b */
    private final String f33385b;

    /* renamed from: c */
    private String f33386c;

    /* renamed from: d */
    private TrackOutput f33387d;

    /* renamed from: f */
    private int f33389f;

    /* renamed from: g */
    private int f33390g;

    /* renamed from: h */
    private long f33391h;

    /* renamed from: i */
    private Format f33392i;

    /* renamed from: j */
    private int f33393j;

    /* renamed from: a */
    private final ParsableByteArray f33384a = new ParsableByteArray(new byte[18]);

    /* renamed from: e */
    private int f33388e = 0;

    /* renamed from: k */
    private long f33394k = -9223372036854775807L;

    public DtsReader(@Nullable String str) {
        this.f33385b = str;
    }

    /* renamed from: a */
    private boolean m74362a(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.f33389f);
        parsableByteArray.readBytes(bArr, this.f33389f, min);
        int i2 = this.f33389f + min;
        this.f33389f = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m74361b() {
        byte[] data = this.f33384a.getData();
        if (this.f33392i == null) {
            Format parseDtsFormat = DtsUtil.parseDtsFormat(data, this.f33386c, this.f33385b, null);
            this.f33392i = parseDtsFormat;
            this.f33387d.format(parseDtsFormat);
        }
        this.f33393j = DtsUtil.getDtsFrameSize(data);
        this.f33391h = (int) ((DtsUtil.parseDtsAudioSampleCount(data) * 1000000) / this.f33392i.sampleRate);
    }

    /* renamed from: c */
    private boolean m74360c(ParsableByteArray parsableByteArray) {
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.f33390g << 8;
            this.f33390g = i;
            int readUnsignedByte = i | parsableByteArray.readUnsignedByte();
            this.f33390g = readUnsignedByte;
            if (DtsUtil.isSyncWord(readUnsignedByte)) {
                byte[] data = this.f33384a.getData();
                int i2 = this.f33390g;
                data[0] = (byte) ((i2 >> 24) & 255);
                data[1] = (byte) ((i2 >> 16) & 255);
                data[2] = (byte) ((i2 >> 8) & 255);
                data[3] = (byte) (i2 & 255);
                this.f33389f = 4;
                this.f33390g = 0;
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.f33387d);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.f33388e;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(parsableByteArray.bytesLeft(), this.f33393j - this.f33389f);
                        this.f33387d.sampleData(parsableByteArray, min);
                        int i2 = this.f33389f + min;
                        this.f33389f = i2;
                        int i3 = this.f33393j;
                        if (i2 == i3) {
                            long j = this.f33394k;
                            if (j != -9223372036854775807L) {
                                this.f33387d.sampleMetadata(j, 1, i3, 0, null);
                                this.f33394k += this.f33391h;
                            }
                            this.f33388e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (m74362a(parsableByteArray, this.f33384a.getData(), 18)) {
                    m74361b();
                    this.f33384a.setPosition(0);
                    this.f33387d.sampleData(this.f33384a, 18);
                    this.f33388e = 2;
                }
            } else if (m74360c(parsableByteArray)) {
                this.f33388e = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.f33386c = trackIdGenerator.getFormatId();
        this.f33387d = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f33394k = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void seek() {
        this.f33388e = 0;
        this.f33389f = 0;
        this.f33390g = 0;
        this.f33394k = -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetFinished() {
    }
}
