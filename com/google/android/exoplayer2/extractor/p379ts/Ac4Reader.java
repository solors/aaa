package com.google.android.exoplayer2.extractor.p379ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* renamed from: com.google.android.exoplayer2.extractor.ts.Ac4Reader */
/* loaded from: classes4.dex */
public final class Ac4Reader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableBitArray f33335a;

    /* renamed from: b */
    private final ParsableByteArray f33336b;
    @Nullable

    /* renamed from: c */
    private final String f33337c;

    /* renamed from: d */
    private String f33338d;

    /* renamed from: e */
    private TrackOutput f33339e;

    /* renamed from: f */
    private int f33340f;

    /* renamed from: g */
    private int f33341g;

    /* renamed from: h */
    private boolean f33342h;

    /* renamed from: i */
    private boolean f33343i;

    /* renamed from: j */
    private long f33344j;

    /* renamed from: k */
    private Format f33345k;

    /* renamed from: l */
    private int f33346l;

    /* renamed from: m */
    private long f33347m;

    public Ac4Reader() {
        this(null);
    }

    /* renamed from: a */
    private boolean m74392a(ParsableByteArray parsableByteArray, byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.f33341g);
        parsableByteArray.readBytes(bArr, this.f33341g, min);
        int i2 = this.f33341g + min;
        this.f33341g = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m74391b() {
        this.f33335a.setPosition(0);
        Ac4Util.SyncFrameInfo parseAc4SyncframeInfo = Ac4Util.parseAc4SyncframeInfo(this.f33335a);
        Format format = this.f33345k;
        if (format == null || parseAc4SyncframeInfo.channelCount != format.channelCount || parseAc4SyncframeInfo.sampleRate != format.sampleRate || !"audio/ac4".equals(format.sampleMimeType)) {
            Format build = new Format.Builder().setId(this.f33338d).setSampleMimeType("audio/ac4").setChannelCount(parseAc4SyncframeInfo.channelCount).setSampleRate(parseAc4SyncframeInfo.sampleRate).setLanguage(this.f33337c).build();
            this.f33345k = build;
            this.f33339e.format(build);
        }
        this.f33346l = parseAc4SyncframeInfo.frameSize;
        this.f33344j = (parseAc4SyncframeInfo.sampleCount * 1000000) / this.f33345k.sampleRate;
    }

    /* renamed from: c */
    private boolean m74390c(ParsableByteArray parsableByteArray) {
        boolean z;
        int readUnsignedByte;
        boolean z2;
        while (true) {
            z = false;
            if (parsableByteArray.bytesLeft() <= 0) {
                return false;
            }
            if (!this.f33342h) {
                if (parsableByteArray.readUnsignedByte() == 172) {
                    z = true;
                }
                this.f33342h = z;
            } else {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
                if (readUnsignedByte == 172) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f33342h = z2;
                if (readUnsignedByte == 64 || readUnsignedByte == 65) {
                    break;
                }
            }
        }
        if (readUnsignedByte == 65) {
            z = true;
        }
        this.f33343i = z;
        return true;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        int i;
        Assertions.checkStateNotNull(this.f33339e);
        while (parsableByteArray.bytesLeft() > 0) {
            int i2 = this.f33340f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(parsableByteArray.bytesLeft(), this.f33346l - this.f33341g);
                        this.f33339e.sampleData(parsableByteArray, min);
                        int i3 = this.f33341g + min;
                        this.f33341g = i3;
                        int i4 = this.f33346l;
                        if (i3 == i4) {
                            long j = this.f33347m;
                            if (j != -9223372036854775807L) {
                                this.f33339e.sampleMetadata(j, 1, i4, 0, null);
                                this.f33347m += this.f33344j;
                            }
                            this.f33340f = 0;
                        }
                    }
                } else if (m74392a(parsableByteArray, this.f33336b.getData(), 16)) {
                    m74391b();
                    this.f33336b.setPosition(0);
                    this.f33339e.sampleData(this.f33336b, 16);
                    this.f33340f = 2;
                }
            } else if (m74390c(parsableByteArray)) {
                this.f33340f = 1;
                this.f33336b.getData()[0] = -84;
                byte[] data = this.f33336b.getData();
                if (this.f33343i) {
                    i = 65;
                } else {
                    i = 64;
                }
                data[1] = (byte) i;
                this.f33341g = 2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.f33338d = trackIdGenerator.getFormatId();
        this.f33339e = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f33347m = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void seek() {
        this.f33340f = 0;
        this.f33341g = 0;
        this.f33342h = false;
        this.f33343i = false;
        this.f33347m = -9223372036854775807L;
    }

    public Ac4Reader(@Nullable String str) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(new byte[16]);
        this.f33335a = parsableBitArray;
        this.f33336b = new ParsableByteArray(parsableBitArray.data);
        this.f33340f = 0;
        this.f33341g = 0;
        this.f33342h = false;
        this.f33343i = false;
        this.f33347m = -9223372036854775807L;
        this.f33337c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetFinished() {
    }
}
