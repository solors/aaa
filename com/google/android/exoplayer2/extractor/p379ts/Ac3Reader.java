package com.google.android.exoplayer2.extractor.p379ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.Util;

/* renamed from: com.google.android.exoplayer2.extractor.ts.Ac3Reader */
/* loaded from: classes4.dex */
public final class Ac3Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableBitArray f33320a;

    /* renamed from: b */
    private final ParsableByteArray f33321b;
    @Nullable

    /* renamed from: c */
    private final String f33322c;

    /* renamed from: d */
    private String f33323d;

    /* renamed from: e */
    private TrackOutput f33324e;

    /* renamed from: f */
    private int f33325f;

    /* renamed from: g */
    private int f33326g;

    /* renamed from: h */
    private boolean f33327h;

    /* renamed from: i */
    private long f33328i;

    /* renamed from: j */
    private Format f33329j;

    /* renamed from: k */
    private int f33330k;

    /* renamed from: l */
    private long f33331l;

    public Ac3Reader() {
        this(null);
    }

    /* renamed from: a */
    private boolean m74397a(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.f33326g);
        parsableByteArray.readBytes(bArr, this.f33326g, min);
        int i2 = this.f33326g + min;
        this.f33326g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m74396b() {
        this.f33320a.setPosition(0);
        Ac3Util.SyncFrameInfo parseAc3SyncframeInfo = Ac3Util.parseAc3SyncframeInfo(this.f33320a);
        Format format = this.f33329j;
        if (format == null || parseAc3SyncframeInfo.channelCount != format.channelCount || parseAc3SyncframeInfo.sampleRate != format.sampleRate || !Util.areEqual(parseAc3SyncframeInfo.mimeType, format.sampleMimeType)) {
            Format.Builder peakBitrate = new Format.Builder().setId(this.f33323d).setSampleMimeType(parseAc3SyncframeInfo.mimeType).setChannelCount(parseAc3SyncframeInfo.channelCount).setSampleRate(parseAc3SyncframeInfo.sampleRate).setLanguage(this.f33322c).setPeakBitrate(parseAc3SyncframeInfo.bitrate);
            if ("audio/ac3".equals(parseAc3SyncframeInfo.mimeType)) {
                peakBitrate.setAverageBitrate(parseAc3SyncframeInfo.bitrate);
            }
            Format build = peakBitrate.build();
            this.f33329j = build;
            this.f33324e.format(build);
        }
        this.f33330k = parseAc3SyncframeInfo.frameSize;
        this.f33328i = (parseAc3SyncframeInfo.sampleCount * 1000000) / this.f33329j.sampleRate;
    }

    /* renamed from: c */
    private boolean m74395c(ParsableByteArray parsableByteArray) {
        while (true) {
            boolean z = false;
            if (parsableByteArray.bytesLeft() <= 0) {
                return false;
            }
            if (!this.f33327h) {
                if (parsableByteArray.readUnsignedByte() == 11) {
                    z = true;
                }
                this.f33327h = z;
            } else {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte == 119) {
                    this.f33327h = false;
                    return true;
                }
                if (readUnsignedByte == 11) {
                    z = true;
                }
                this.f33327h = z;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.f33324e);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.f33325f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        int min = Math.min(parsableByteArray.bytesLeft(), this.f33330k - this.f33326g);
                        this.f33324e.sampleData(parsableByteArray, min);
                        int i2 = this.f33326g + min;
                        this.f33326g = i2;
                        int i3 = this.f33330k;
                        if (i2 == i3) {
                            long j = this.f33331l;
                            if (j != -9223372036854775807L) {
                                this.f33324e.sampleMetadata(j, 1, i3, 0, null);
                                this.f33331l += this.f33328i;
                            }
                            this.f33325f = 0;
                        }
                    }
                } else if (m74397a(parsableByteArray, this.f33321b.getData(), 128)) {
                    m74396b();
                    this.f33321b.setPosition(0);
                    this.f33324e.sampleData(this.f33321b, 128);
                    this.f33325f = 2;
                }
            } else if (m74395c(parsableByteArray)) {
                this.f33325f = 1;
                this.f33321b.getData()[0] = 11;
                this.f33321b.getData()[1] = 119;
                this.f33326g = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.f33323d = trackIdGenerator.getFormatId();
        this.f33324e = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f33331l = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void seek() {
        this.f33325f = 0;
        this.f33326g = 0;
        this.f33327h = false;
        this.f33331l = -9223372036854775807L;
    }

    public Ac3Reader(@Nullable String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[128]);
        this.f33320a = parsableBitArray;
        this.f33321b = new ParsableByteArray(parsableBitArray.data);
        this.f33325f = 0;
        this.f33331l = -9223372036854775807L;
        this.f33322c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetFinished() {
    }
}
