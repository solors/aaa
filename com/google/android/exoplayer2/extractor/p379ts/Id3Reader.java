package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* renamed from: com.google.android.exoplayer2.extractor.ts.Id3Reader */
/* loaded from: classes4.dex */
public final class Id3Reader implements ElementaryStreamReader {

    /* renamed from: b */
    private TrackOutput f33520b;

    /* renamed from: c */
    private boolean f33521c;

    /* renamed from: e */
    private int f33523e;

    /* renamed from: f */
    private int f33524f;

    /* renamed from: a */
    private final ParsableByteArray f33519a = new ParsableByteArray(10);

    /* renamed from: d */
    private long f33522d = -9223372036854775807L;

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.f33520b);
        if (!this.f33521c) {
            return;
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        int i = this.f33524f;
        if (i < 10) {
            int min = Math.min(bytesLeft, 10 - i);
            System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), this.f33519a.getData(), this.f33524f, min);
            if (this.f33524f + min == 10) {
                this.f33519a.setPosition(0);
                if (73 == this.f33519a.readUnsignedByte() && 68 == this.f33519a.readUnsignedByte() && 51 == this.f33519a.readUnsignedByte()) {
                    this.f33519a.skipBytes(3);
                    this.f33523e = this.f33519a.readSynchSafeInt() + 10;
                } else {
                    Log.m72602w("Id3Reader", "Discarding invalid ID3 tag");
                    this.f33521c = false;
                    return;
                }
            }
        }
        int min2 = Math.min(bytesLeft, this.f33523e - this.f33524f);
        this.f33520b.sampleData(parsableByteArray, min2);
        this.f33524f += min2;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.f33520b = track;
        track.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType("application/id3").build());
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetFinished() {
        int i;
        Assertions.checkStateNotNull(this.f33520b);
        if (this.f33521c && (i = this.f33523e) != 0 && this.f33524f == i) {
            long j = this.f33522d;
            if (j != -9223372036854775807L) {
                this.f33520b.sampleMetadata(j, 1, i, 0, null);
            }
            this.f33521c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f33521c = true;
        if (j != -9223372036854775807L) {
            this.f33522d = j;
        }
        this.f33523e = 0;
        this.f33524f = 0;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void seek() {
        this.f33521c = false;
        this.f33522d = -9223372036854775807L;
    }
}
