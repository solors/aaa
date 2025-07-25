package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.UserDataReader */
/* loaded from: classes4.dex */
final class UserDataReader {

    /* renamed from: a */
    private final List<Format> f33657a;

    /* renamed from: b */
    private final TrackOutput[] f33658b;

    public UserDataReader(List<Format> list) {
        this.f33657a = list;
        this.f33658b = new TrackOutput[list.size()];
    }

    public void consume(long j, ParsableByteArray parsableByteArray) {
        if (parsableByteArray.bytesLeft() < 9) {
            return;
        }
        int readInt = parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if (readInt == 434 && readInt2 == 1195456820 && readUnsignedByte == 3) {
            CeaUtil.consumeCcData(j, parsableByteArray, this.f33658b);
        }
    }

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        boolean z;
        for (int i = 0; i < this.f33658b.length; i++) {
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.f33657a.get(i);
            String str = format.sampleMimeType;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkArgument(z, "Invalid closed caption mime type provided: " + str);
            track.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.f33658b[i] = track;
        }
    }
}
