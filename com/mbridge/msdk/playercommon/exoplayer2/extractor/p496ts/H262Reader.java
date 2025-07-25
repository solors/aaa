package com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts;

import android.util.Pair;
import com.mbridge.msdk.playercommon.exoplayer2.Format;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ExtractorOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.TrackOutput;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.TsPayloadReader;
import com.mbridge.msdk.playercommon.exoplayer2.util.NalUnitUtil;
import com.mbridge.msdk.playercommon.exoplayer2.util.ParsableByteArray;
import java.util.Arrays;

/* renamed from: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.H262Reader */
/* loaded from: classes6.dex */
public final class H262Reader implements ElementaryStreamReader {
    private static final double[] FRAME_RATE_VALUES = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};
    private static final int START_EXTENSION = 181;
    private static final int START_GROUP = 184;
    private static final int START_PICTURE = 0;
    private static final int START_SEQUENCE_HEADER = 179;
    private String formatId;
    private long frameDurationUs;
    private boolean hasOutputFormat;
    private TrackOutput output;
    private long pesTimeUs;
    private boolean sampleHasPicture;
    private boolean sampleIsKeyframe;
    private long samplePosition;
    private long sampleTimeUs;
    private boolean startedFirstSample;
    private long totalBytesWritten;
    private final boolean[] prefixFlags = new boolean[4];
    private final CsdBuffer csdBuffer = new CsdBuffer(128);

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.H262Reader$CsdBuffer */
    /* loaded from: classes6.dex */
    public static final class CsdBuffer {
        private static final byte[] START_CODE = {0, 0, 1};
        public byte[] data;
        private boolean isFilling;
        public int length;
        public int sequenceExtensionPosition;

        public CsdBuffer(int i) {
            this.data = new byte[i];
        }

        public final void onData(byte[] bArr, int i, int i2) {
            if (!this.isFilling) {
                return;
            }
            int i3 = i2 - i;
            byte[] bArr2 = this.data;
            int length = bArr2.length;
            int i4 = this.length;
            if (length < i4 + i3) {
                this.data = Arrays.copyOf(bArr2, (i4 + i3) * 2);
            }
            System.arraycopy(bArr, i, this.data, this.length, i3);
            this.length += i3;
        }

        public final boolean onStartCode(int i, int i2) {
            if (this.isFilling) {
                int i3 = this.length - i2;
                this.length = i3;
                if (this.sequenceExtensionPosition == 0 && i == H262Reader.START_EXTENSION) {
                    this.sequenceExtensionPosition = i3;
                } else {
                    this.isFilling = false;
                    return true;
                }
            } else if (i == H262Reader.START_SEQUENCE_HEADER) {
                this.isFilling = true;
            }
            byte[] bArr = START_CODE;
            onData(bArr, 0, bArr.length);
            return false;
        }

        public final void reset() {
            this.isFilling = false;
            this.length = 0;
            this.sequenceExtensionPosition = 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0068  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static android.util.Pair<com.mbridge.msdk.playercommon.exoplayer2.Format, java.lang.Long> parseCsdBuffer(com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.H262Reader.CsdBuffer r20, java.lang.String r21) {
        /*
            r0 = r20
            byte[] r1 = r0.data
            int r2 = r0.length
            byte[] r1 = java.util.Arrays.copyOf(r1, r2)
            r2 = 4
            r3 = r1[r2]
            r3 = r3 & 255(0xff, float:3.57E-43)
            r4 = 5
            r5 = r1[r4]
            r5 = r5 & 255(0xff, float:3.57E-43)
            r6 = 6
            r6 = r1[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            int r3 = r3 << r2
            int r7 = r5 >> 4
            r13 = r3 | r7
            r3 = r5 & 15
            int r3 = r3 << 8
            r14 = r3 | r6
            r3 = 7
            r5 = r1[r3]
            r5 = r5 & 240(0xf0, float:3.36E-43)
            int r5 = r5 >> r2
            r6 = 2
            if (r5 == r6) goto L43
            r6 = 3
            if (r5 == r6) goto L3d
            if (r5 == r2) goto L37
            r2 = 1065353216(0x3f800000, float:1.0)
        L34:
            r18 = r2
            goto L4b
        L37:
            int r2 = r14 * 121
            float r2 = (float) r2
            int r5 = r13 * 100
            goto L48
        L3d:
            int r2 = r14 * 16
            float r2 = (float) r2
            int r5 = r13 * 9
            goto L48
        L43:
            int r2 = r14 * 4
            float r2 = (float) r2
            int r5 = r13 * 3
        L48:
            float r5 = (float) r5
            float r2 = r2 / r5
            goto L34
        L4b:
            java.lang.String r9 = "video/mpeg2"
            r10 = 0
            r11 = -1
            r12 = -1
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            java.util.List r16 = java.util.Collections.singletonList(r1)
            r17 = -1
            r19 = 0
            r8 = r21
            com.mbridge.msdk.playercommon.exoplayer2.Format r2 = com.mbridge.msdk.playercommon.exoplayer2.Format.createVideoSampleFormat(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            r3 = r1[r3]
            r3 = r3 & 15
            int r3 = r3 + (-1)
            if (r3 < 0) goto L8d
            double[] r5 = com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.H262Reader.FRAME_RATE_VALUES
            int r6 = r5.length
            if (r3 >= r6) goto L8d
            r6 = r5[r3]
            int r0 = r0.sequenceExtensionPosition
            int r0 = r0 + 9
            r0 = r1[r0]
            r1 = r0 & 96
            int r1 = r1 >> r4
            r0 = r0 & 31
            if (r1 == r0) goto L85
            double r3 = (double) r1
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r3 = r3 + r8
            int r0 = r0 + 1
            double r0 = (double) r0
            double r3 = r3 / r0
            double r6 = r6 * r3
        L85:
            r0 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            double r0 = r0 / r6
            long r0 = (long) r0
            goto L8f
        L8d:
            r0 = 0
        L8f:
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            android.util.Pair r0 = android.util.Pair.create(r2, r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.H262Reader.parseCsdBuffer(com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.H262Reader$CsdBuffer, java.lang.String):android.util.Pair");
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.ElementaryStreamReader
    public final void consume(ParsableByteArray parsableByteArray) {
        boolean z;
        boolean z2;
        boolean z3;
        int i;
        int position = parsableByteArray.getPosition();
        int limit = parsableByteArray.limit();
        byte[] bArr = parsableByteArray.data;
        this.totalBytesWritten += parsableByteArray.bytesLeft();
        this.output.sampleData(parsableByteArray, parsableByteArray.bytesLeft());
        while (true) {
            int findNalUnit = NalUnitUtil.findNalUnit(bArr, position, limit, this.prefixFlags);
            if (findNalUnit == limit) {
                break;
            }
            int i2 = findNalUnit + 3;
            int i3 = parsableByteArray.data[i2] & 255;
            if (!this.hasOutputFormat) {
                int i4 = findNalUnit - position;
                if (i4 > 0) {
                    this.csdBuffer.onData(bArr, position, findNalUnit);
                }
                if (i4 < 0) {
                    i = -i4;
                } else {
                    i = 0;
                }
                if (this.csdBuffer.onStartCode(i3, i)) {
                    Pair<Format, Long> parseCsdBuffer = parseCsdBuffer(this.csdBuffer, this.formatId);
                    this.output.format((Format) parseCsdBuffer.first);
                    this.frameDurationUs = ((Long) parseCsdBuffer.second).longValue();
                    this.hasOutputFormat = true;
                }
            }
            if (i3 != 0 && i3 != START_SEQUENCE_HEADER) {
                if (i3 == START_GROUP) {
                    this.sampleIsKeyframe = true;
                }
            } else {
                int i5 = limit - findNalUnit;
                if (this.startedFirstSample && this.sampleHasPicture && this.hasOutputFormat) {
                    this.output.sampleMetadata(this.sampleTimeUs, this.sampleIsKeyframe ? 1 : 0, ((int) (this.totalBytesWritten - this.samplePosition)) - i5, i5, null);
                }
                boolean z4 = this.startedFirstSample;
                if (z4 && !this.sampleHasPicture) {
                    z = false;
                    z2 = true;
                } else {
                    this.samplePosition = this.totalBytesWritten - i5;
                    long j = this.pesTimeUs;
                    if (j == -9223372036854775807L) {
                        if (z4) {
                            j = this.sampleTimeUs + this.frameDurationUs;
                        } else {
                            j = 0;
                        }
                    }
                    this.sampleTimeUs = j;
                    z = false;
                    this.sampleIsKeyframe = false;
                    this.pesTimeUs = -9223372036854775807L;
                    z2 = true;
                    this.startedFirstSample = true;
                }
                if (i3 == 0) {
                    z3 = z2;
                } else {
                    z3 = z;
                }
                this.sampleHasPicture = z3;
            }
            position = i2;
        }
        if (!this.hasOutputFormat) {
            this.csdBuffer.onData(bArr, position, limit);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.ElementaryStreamReader
    public final void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.formatId = trackIdGenerator.getFormatId();
        this.output = extractorOutput.track(trackIdGenerator.getTrackId(), 2);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.ElementaryStreamReader
    public final void packetStarted(long j, boolean z) {
        this.pesTimeUs = j;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.ElementaryStreamReader
    public final void seek() {
        NalUnitUtil.clearPrefixFlags(this.prefixFlags);
        this.csdBuffer.reset();
        this.totalBytesWritten = 0L;
        this.startedFirstSample = false;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.extractor.p496ts.ElementaryStreamReader
    public final void packetFinished() {
    }
}
