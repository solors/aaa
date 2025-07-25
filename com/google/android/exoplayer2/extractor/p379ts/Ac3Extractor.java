package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.audio.Ac3Util;
import com.google.android.exoplayer2.extractor.Extractor;
import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.ExtractorsFactory;
import com.google.android.exoplayer2.extractor.PositionHolder;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.io.IOException;

/* renamed from: com.google.android.exoplayer2.extractor.ts.Ac3Extractor */
/* loaded from: classes4.dex */
public final class Ac3Extractor implements Extractor {
    public static final ExtractorsFactory FACTORY = new ExtractorsFactory() { // from class: com.google.android.exoplayer2.extractor.ts.a
        @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
        public final Extractor[] createExtractors() {
            Extractor[] m74398b;
            m74398b = Ac3Extractor.m74398b();
            return m74398b;
        }
    };

    /* renamed from: a */
    private final Ac3Reader f33317a = new Ac3Reader();

    /* renamed from: b */
    private final ParsableByteArray f33318b = new ParsableByteArray(2786);

    /* renamed from: c */
    private boolean f33319c;

    /* renamed from: b */
    public static /* synthetic */ Extractor[] m74398b() {
        return new Extractor[]{new Ac3Extractor()};
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.f33317a.createTracks(extractorOutput, new TsPayloadReader.TrackIdGenerator(0, 1));
        extractorOutput.endTracks();
        extractorOutput.seekMap(new SeekMap.Unseekable(-9223372036854775807L));
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        int read = extractorInput.read(this.f33318b.getData(), 0, 2786);
        if (read == -1) {
            return -1;
        }
        this.f33318b.setPosition(0);
        this.f33318b.setLimit(read);
        if (!this.f33319c) {
            this.f33317a.packetStarted(0L, 4);
            this.f33319c = true;
        }
        this.f33317a.consume(this.f33318b);
        return 0;
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void seek(long j, long j2) {
        this.f33319c = false;
        this.f33317a.seek();
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
            extractorInput.peekFully(parsableByteArray.getData(), 0, 6);
            parsableByteArray.setPosition(0);
            if (parsableByteArray.readUnsignedShort() != 2935) {
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
                int parseAc3SyncframeSize = Ac3Util.parseAc3SyncframeSize(parsableByteArray.getData());
                if (parseAc3SyncframeSize == -1) {
                    return false;
                }
                extractorInput.advancePeekPosition(parseAc3SyncframeSize - 6);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.Extractor
    public void release() {
    }
}
