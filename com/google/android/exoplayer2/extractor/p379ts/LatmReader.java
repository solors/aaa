package com.google.android.exoplayer2.extractor.p379ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;

/* renamed from: com.google.android.exoplayer2.extractor.ts.LatmReader */
/* loaded from: classes4.dex */
public final class LatmReader implements ElementaryStreamReader {
    @Nullable

    /* renamed from: a */
    private final String f33525a;

    /* renamed from: b */
    private final ParsableByteArray f33526b;

    /* renamed from: c */
    private final ParsableBitArray f33527c;

    /* renamed from: d */
    private TrackOutput f33528d;

    /* renamed from: e */
    private String f33529e;

    /* renamed from: f */
    private Format f33530f;

    /* renamed from: g */
    private int f33531g;

    /* renamed from: h */
    private int f33532h;

    /* renamed from: i */
    private int f33533i;

    /* renamed from: j */
    private int f33534j;

    /* renamed from: k */
    private long f33535k;

    /* renamed from: l */
    private boolean f33536l;

    /* renamed from: m */
    private int f33537m;

    /* renamed from: n */
    private int f33538n;

    /* renamed from: o */
    private int f33539o;

    /* renamed from: p */
    private boolean f33540p;

    /* renamed from: q */
    private long f33541q;

    /* renamed from: r */
    private int f33542r;

    /* renamed from: s */
    private long f33543s;

    /* renamed from: t */
    private int f33544t;
    @Nullable

    /* renamed from: u */
    private String f33545u;

    public LatmReader(@Nullable String str) {
        this.f33525a = str;
        ParsableByteArray parsableByteArray = new ParsableByteArray(1024);
        this.f33526b = parsableByteArray;
        this.f33527c = new ParsableBitArray(parsableByteArray.getData());
        this.f33535k = -9223372036854775807L;
    }

    /* renamed from: a */
    private static long m74341a(ParsableBitArray parsableBitArray) {
        return parsableBitArray.readBits((parsableBitArray.readBits(2) + 1) * 8);
    }

    /* renamed from: b */
    private void m74340b(ParsableBitArray parsableBitArray) throws ParserException {
        if (!parsableBitArray.readBit()) {
            this.f33536l = true;
            m74335g(parsableBitArray);
        } else if (!this.f33536l) {
            return;
        }
        if (this.f33537m == 0) {
            if (this.f33538n == 0) {
                m74336f(parsableBitArray, m74337e(parsableBitArray));
                if (this.f33540p) {
                    parsableBitArray.skipBits((int) this.f33541q);
                    return;
                }
                return;
            }
            throw ParserException.createForMalformedContainer(null, null);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    /* renamed from: c */
    private int m74339c(ParsableBitArray parsableBitArray) throws ParserException {
        int bitsLeft = parsableBitArray.bitsLeft();
        AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(parsableBitArray, true);
        this.f33545u = parseAudioSpecificConfig.codecs;
        this.f33542r = parseAudioSpecificConfig.sampleRateHz;
        this.f33544t = parseAudioSpecificConfig.channelCount;
        return bitsLeft - parsableBitArray.bitsLeft();
    }

    /* renamed from: d */
    private void m74338d(ParsableBitArray parsableBitArray) {
        int readBits = parsableBitArray.readBits(3);
        this.f33539o = readBits;
        if (readBits != 0) {
            if (readBits != 1) {
                if (readBits != 3 && readBits != 4 && readBits != 5) {
                    if (readBits != 6 && readBits != 7) {
                        throw new IllegalStateException();
                    }
                    parsableBitArray.skipBits(1);
                    return;
                }
                parsableBitArray.skipBits(6);
                return;
            }
            parsableBitArray.skipBits(9);
            return;
        }
        parsableBitArray.skipBits(8);
    }

    /* renamed from: e */
    private int m74337e(ParsableBitArray parsableBitArray) throws ParserException {
        int readBits;
        if (this.f33539o == 0) {
            int i = 0;
            do {
                readBits = parsableBitArray.readBits(8);
                i += readBits;
            } while (readBits == 255);
            return i;
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    /* renamed from: f */
    private void m74336f(ParsableBitArray parsableBitArray, int i) {
        int position = parsableBitArray.getPosition();
        if ((position & 7) == 0) {
            this.f33526b.setPosition(position >> 3);
        } else {
            parsableBitArray.readBits(this.f33526b.getData(), 0, i * 8);
            this.f33526b.setPosition(0);
        }
        this.f33528d.sampleData(this.f33526b, i);
        long j = this.f33535k;
        if (j != -9223372036854775807L) {
            this.f33528d.sampleMetadata(j, 1, i, 0, null);
            this.f33535k += this.f33543s;
        }
    }

    /* renamed from: g */
    private void m74335g(ParsableBitArray parsableBitArray) throws ParserException {
        int i;
        boolean readBit;
        int readBits = parsableBitArray.readBits(1);
        if (readBits == 1) {
            i = parsableBitArray.readBits(1);
        } else {
            i = 0;
        }
        this.f33537m = i;
        if (i == 0) {
            if (readBits == 1) {
                m74341a(parsableBitArray);
            }
            if (parsableBitArray.readBit()) {
                this.f33538n = parsableBitArray.readBits(6);
                int readBits2 = parsableBitArray.readBits(4);
                int readBits3 = parsableBitArray.readBits(3);
                if (readBits2 == 0 && readBits3 == 0) {
                    if (readBits == 0) {
                        int position = parsableBitArray.getPosition();
                        int m74339c = m74339c(parsableBitArray);
                        parsableBitArray.setPosition(position);
                        byte[] bArr = new byte[(m74339c + 7) / 8];
                        parsableBitArray.readBits(bArr, 0, m74339c);
                        Format build = new Format.Builder().setId(this.f33529e).setSampleMimeType("audio/mp4a-latm").setCodecs(this.f33545u).setChannelCount(this.f33544t).setSampleRate(this.f33542r).setInitializationData(Collections.singletonList(bArr)).setLanguage(this.f33525a).build();
                        if (!build.equals(this.f33530f)) {
                            this.f33530f = build;
                            this.f33543s = 1024000000 / build.sampleRate;
                            this.f33528d.format(build);
                        }
                    } else {
                        parsableBitArray.skipBits(((int) m74341a(parsableBitArray)) - m74339c(parsableBitArray));
                    }
                    m74338d(parsableBitArray);
                    boolean readBit2 = parsableBitArray.readBit();
                    this.f33540p = readBit2;
                    this.f33541q = 0L;
                    if (readBit2) {
                        if (readBits == 1) {
                            this.f33541q = m74341a(parsableBitArray);
                        } else {
                            do {
                                readBit = parsableBitArray.readBit();
                                this.f33541q = (this.f33541q << 8) + parsableBitArray.readBits(8);
                            } while (readBit);
                        }
                    }
                    if (parsableBitArray.readBit()) {
                        parsableBitArray.skipBits(8);
                        return;
                    }
                    return;
                }
                throw ParserException.createForMalformedContainer(null, null);
            }
            throw ParserException.createForMalformedContainer(null, null);
        }
        throw ParserException.createForMalformedContainer(null, null);
    }

    /* renamed from: h */
    private void m74334h(int i) {
        this.f33526b.reset(i);
        this.f33527c.reset(this.f33526b.getData());
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) throws ParserException {
        Assertions.checkStateNotNull(this.f33528d);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.f33531g;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            int min = Math.min(parsableByteArray.bytesLeft(), this.f33533i - this.f33532h);
                            parsableByteArray.readBytes(this.f33527c.data, this.f33532h, min);
                            int i2 = this.f33532h + min;
                            this.f33532h = i2;
                            if (i2 == this.f33533i) {
                                this.f33527c.setPosition(0);
                                m74340b(this.f33527c);
                                this.f33531g = 0;
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        int readUnsignedByte = ((this.f33534j & (-225)) << 8) | parsableByteArray.readUnsignedByte();
                        this.f33533i = readUnsignedByte;
                        if (readUnsignedByte > this.f33526b.getData().length) {
                            m74334h(this.f33533i);
                        }
                        this.f33532h = 0;
                        this.f33531g = 3;
                    }
                } else {
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if ((readUnsignedByte2 & 224) == 224) {
                        this.f33534j = readUnsignedByte2;
                        this.f33531g = 2;
                    } else if (readUnsignedByte2 != 86) {
                        this.f33531g = 0;
                    }
                }
            } else if (parsableByteArray.readUnsignedByte() == 86) {
                this.f33531g = 1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.f33528d = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
        this.f33529e = trackIdGenerator.getFormatId();
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f33535k = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void seek() {
        this.f33531g = 0;
        this.f33535k = -9223372036854775807L;
        this.f33536l = false;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetFinished() {
    }
}
