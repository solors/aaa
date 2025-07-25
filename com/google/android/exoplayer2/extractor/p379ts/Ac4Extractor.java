package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.audio.Ac4Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.Ac4Extractor */
/* loaded from: classes4.dex */
public final class Ac4Extractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ts.b
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] m74393b;
            m74393b = Ac4Extractor.m74393b();
            return m74393b;
        }
    };

    /* renamed from: a */
    private final Ac4Reader f33332a = new Ac4Reader();

    /* renamed from: b */
    private final ParsableByteArray f33333b = new ParsableByteArray(16384);

    /* renamed from: c */
    private boolean f33334c;

    /* renamed from: b */
    public static /* synthetic */ Extractor[] m74393b() {
        return new Extractor[]{new Ac4Extractor()};
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.f33332a.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int read = extractorInput.read(this.f33333b.getData(), 0, 16384);
        if (read == -1) {
            return -1;
        }
        this.f33333b.setPosition(0);
        this.f33333b.setLimit(read);
        if (!this.f33334c) {
            this.f33332a.packetStarted(0L, 4);
            this.f33334c = true;
        }
        this.f33332a.consume(this.f33333b);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.f33334c = false;
        this.f33332a.seek();
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        ParsableByteArray parsableByteArray = new ParsableByteArray(10);
        int i = 0;
        while (true) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 10);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedInt24() != 4801587) {
                break;
            }
            parsableByteArray.skipBytes(3);
            int readSynchSafeInt = parsableByteArray.readSynchSafeInt();
            i += readSynchSafeInt + 10;
            extractorInput.advancePeekPosition(readSynchSafeInt);
        }
        extractorInput.resetPeekPosition();
        extractorInput.advancePeekPosition(i);
        int i2 = 0;
        int i3 = i;
        while (true) {
            extractorInput.peekFully(parsableByteArray.getData(), 0, 7);
            parsableByteArray.setPosition(0);
            int readUnsignedShort = parsableByteArray.readUnsignedShort();
            if (readUnsignedShort != 44096 && readUnsignedShort != 44097) {
                extractorInput.resetPeekPosition();
                i3++;
                if (i3 - i >= 8192) {
                    return false;
                }
                extractorInput.advancePeekPosition(i3);
                i2 = 0;
            } else {
                i2++;
                if (i2 >= 4) {
                    return true;
                }
                int parseAc4SyncframeSize = Ac4Util.parseAc4SyncframeSize(parsableByteArray.getData(), readUnsignedShort);
                if (parseAc4SyncframeSize == -1) {
                    return false;
                }
                extractorInput.advancePeekPosition(parseAc4SyncframeSize - 7);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
