package com.google.android.exoplayer2.extractor.p379ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableBitArray;
import com.google.android.exoplayer2.util.ParsableByteArray;
import com.google.android.exoplayer2.util.TimestampAdjuster;

/* renamed from: com.google.android.exoplayer2.extractor.ts.PesReader */
/* loaded from: classes4.dex */
public final class PesReader implements TsPayloadReader {

    /* renamed from: a */
    private final ElementaryStreamReader f33564a;

    /* renamed from: b */
    private final ParsableBitArray f33565b = new ParsableBitArray(new byte[10]);

    /* renamed from: c */
    private int f33566c = 0;

    /* renamed from: d */
    private int f33567d;

    /* renamed from: e */
    private TimestampAdjuster f33568e;

    /* renamed from: f */
    private boolean f33569f;

    /* renamed from: g */
    private boolean f33570g;

    /* renamed from: h */
    private boolean f33571h;

    /* renamed from: i */
    private int f33572i;

    /* renamed from: j */
    private int f33573j;

    /* renamed from: k */
    private boolean f33574k;

    /* renamed from: l */
    private long f33575l;

    public PesReader(ElementaryStreamReader elementaryStreamReader) {
        this.f33564a = elementaryStreamReader;
    }

    /* renamed from: a */
    private boolean m74329a(ParsableByteArray parsableByteArray, @Nullable byte[] bArr, int i) {
        int min = Math.min(parsableByteArray.bytesLeft(), i - this.f33567d);
        if (min <= 0) {
            return true;
        }
        if (bArr == null) {
            parsableByteArray.skipBytes(min);
        } else {
            parsableByteArray.readBytes(bArr, this.f33567d, min);
        }
        int i2 = this.f33567d + min;
        this.f33567d = i2;
        if (i2 == i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private boolean m74328b() {
        this.f33565b.setPosition(0);
        int readBits = this.f33565b.readBits(24);
        if (readBits != 1) {
            Log.m72602w("PesReader", "Unexpected start code prefix: " + readBits);
            this.f33573j = -1;
            return false;
        }
        this.f33565b.skipBits(8);
        int readBits2 = this.f33565b.readBits(16);
        this.f33565b.skipBits(5);
        this.f33574k = this.f33565b.readBit();
        this.f33565b.skipBits(2);
        this.f33569f = this.f33565b.readBit();
        this.f33570g = this.f33565b.readBit();
        this.f33565b.skipBits(6);
        int readBits3 = this.f33565b.readBits(8);
        this.f33572i = readBits3;
        if (readBits2 == 0) {
            this.f33573j = -1;
        } else {
            int i = ((readBits2 + 6) - 9) - readBits3;
            this.f33573j = i;
            if (i < 0) {
                Log.m72602w("PesReader", "Found negative packet payload size: " + this.f33573j);
                this.f33573j = -1;
            }
        }
        return true;
    }

    /* renamed from: c */
    private void m74327c() {
        this.f33565b.setPosition(0);
        this.f33575l = -9223372036854775807L;
        if (this.f33569f) {
            this.f33565b.skipBits(4);
            this.f33565b.skipBits(1);
            this.f33565b.skipBits(1);
            long readBits = (this.f33565b.readBits(3) << 30) | (this.f33565b.readBits(15) << 15) | this.f33565b.readBits(15);
            this.f33565b.skipBits(1);
            if (!this.f33571h && this.f33570g) {
                this.f33565b.skipBits(4);
                this.f33565b.skipBits(1);
                this.f33565b.skipBits(1);
                this.f33565b.skipBits(1);
                this.f33568e.adjustTsTimestamp((this.f33565b.readBits(3) << 30) | (this.f33565b.readBits(15) << 15) | this.f33565b.readBits(15));
                this.f33571h = true;
            }
            this.f33575l = this.f33568e.adjustTsTimestamp(readBits);
        }
    }

    /* renamed from: d */
    private void m74326d(int i) {
        this.f33566c = i;
        this.f33567d = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader
    public final void consume(ParsableByteArray parsableByteArray, int i) throws ParserException {
        Assertions.checkStateNotNull(this.f33568e);
        if ((i & 1) != 0) {
            int i2 = this.f33566c;
            if (i2 != 0 && i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        if (this.f33573j != -1) {
                            Log.m72602w("PesReader", "Unexpected start indicator: expected " + this.f33573j + " more bytes");
                        }
                        this.f33564a.packetFinished();
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    Log.m72602w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m74326d(1);
        }
        while (parsableByteArray.bytesLeft() > 0) {
            int i3 = this.f33566c;
            if (i3 != 0) {
                int i4 = 0;
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 == 3) {
                            int bytesLeft = parsableByteArray.bytesLeft();
                            int i5 = this.f33573j;
                            if (i5 != -1) {
                                i4 = bytesLeft - i5;
                            }
                            if (i4 > 0) {
                                bytesLeft -= i4;
                                parsableByteArray.setLimit(parsableByteArray.getPosition() + bytesLeft);
                            }
                            this.f33564a.consume(parsableByteArray);
                            int i6 = this.f33573j;
                            if (i6 != -1) {
                                int i7 = i6 - bytesLeft;
                                this.f33573j = i7;
                                if (i7 == 0) {
                                    this.f33564a.packetFinished();
                                    m74326d(1);
                                }
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        if (m74329a(parsableByteArray, this.f33565b.data, Math.min(10, this.f33572i)) && m74329a(parsableByteArray, null, this.f33572i)) {
                            m74327c();
                            if (this.f33574k) {
                                i4 = 4;
                            }
                            i |= i4;
                            this.f33564a.packetStarted(this.f33575l, i);
                            m74326d(3);
                        }
                    }
                } else if (m74329a(parsableByteArray, this.f33565b.data, 9)) {
                    if (m74328b()) {
                        i4 = 2;
                    }
                    m74326d(i4);
                }
            } else {
                parsableByteArray.skipBytes(parsableByteArray.bytesLeft());
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader
    public void init(TimestampAdjuster timestampAdjuster, ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        this.f33568e = timestampAdjuster;
        this.f33564a.createTracks(extractorOutput, trackIdGenerator);
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader
    public final void seek() {
        this.f33566c = 0;
        this.f33567d = 0;
        this.f33571h = false;
        this.f33564a.seek();
    }
}
