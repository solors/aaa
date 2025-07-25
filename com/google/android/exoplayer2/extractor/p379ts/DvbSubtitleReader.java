package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.DvbSubtitleReader */
/* loaded from: classes4.dex */
public final class DvbSubtitleReader implements ElementaryStreamReader {

    /* renamed from: a */
    private final List<TsPayloadReader.DvbSubtitleInfo> f33395a;

    /* renamed from: b */
    private final TrackOutput[] f33396b;

    /* renamed from: c */
    private boolean f33397c;

    /* renamed from: d */
    private int f33398d;

    /* renamed from: e */
    private int f33399e;

    /* renamed from: f */
    private long f33400f = -9223372036854775807L;

    public DvbSubtitleReader(List<TsPayloadReader.DvbSubtitleInfo> list) {
        this.f33395a = list;
        this.f33396b = new TrackOutput[list.size()];
    }

    /* renamed from: a */
    private boolean m74359a(ParsableByteArray parsableByteArray, int i) {
        if (parsableByteArray.bytesLeft() == 0) {
            return false;
        }
        if (parsableByteArray.readUnsignedByte() != i) {
            this.f33397c = false;
        }
        this.f33398d--;
        return this.f33397c;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        TrackOutput[] trackOutputArr;
        if (this.f33397c) {
            if (this.f33398d == 2 && !m74359a(parsableByteArray, 32)) {
                return;
            }
            if (this.f33398d == 1 && !m74359a(parsableByteArray, 0)) {
                return;
            }
            int position = parsableByteArray.getPosition();
            int bytesLeft = parsableByteArray.bytesLeft();
            for (TrackOutput trackOutput : this.f33396b) {
                parsableByteArray.setPosition(position);
                trackOutput.sampleData(parsableByteArray, bytesLeft);
            }
            this.f33399e += bytesLeft;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        for (int i = 0; i < this.f33396b.length; i++) {
            TsPayloadReader.DvbSubtitleInfo dvbSubtitleInfo = this.f33395a.get(i);
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            track.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType("application/dvbsubs").setInitializationData(Collections.singletonList(dvbSubtitleInfo.initializationData)).setLanguage(dvbSubtitleInfo.language).build());
            this.f33396b[i] = track;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetFinished() {
        if (this.f33397c) {
            if (this.f33400f != -9223372036854775807L) {
                for (TrackOutput trackOutput : this.f33396b) {
                    trackOutput.sampleMetadata(this.f33400f, 1, this.f33399e, 0, null);
                }
            }
            this.f33397c = false;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.f33397c = true;
        if (j != -9223372036854775807L) {
            this.f33400f = j;
        }
        this.f33399e = 0;
        this.f33398d = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void seek() {
        this.f33397c = false;
        this.f33400f = -9223372036854775807L;
    }
}
