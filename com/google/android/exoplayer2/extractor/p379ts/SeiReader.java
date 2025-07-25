package com.google.android.exoplayer2.extractor.p379ts;

import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.CeaUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;
import java.util.List;

/* renamed from: com.google.android.exoplayer2.extractor.ts.SeiReader */
/* loaded from: classes4.dex */
public final class SeiReader {

    /* renamed from: a */
    private final List<Format> f33611a;

    /* renamed from: b */
    private final TrackOutput[] f33612b;

    public SeiReader(List<Format> list) {
        this.f33611a = list;
        this.f33612b = new TrackOutput[list.size()];
    }

    public void consume(long j, ParsableByteArray parsableByteArray) {
        CeaUtil.consume(j, parsableByteArray, this.f33612b);
    }

    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        boolean z;
        for (int i = 0; i < this.f33612b.length; i++) {
            trackIdGenerator.generateNewId();
            TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 3);
            Format format = this.f33611a.get(i);
            String str = format.sampleMimeType;
            if (!"application/cea-608".equals(str) && !"application/cea-708".equals(str)) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkArgument(z, "Invalid closed caption mime type provided: " + str);
            String str2 = format.f31633id;
            if (str2 == null) {
                str2 = trackIdGenerator.getFormatId();
            }
            track.format(new Format.Builder().setId(str2).setSampleMimeType(str).setSelectionFlags(format.selectionFlags).setLanguage(format.language).setAccessibilityChannel(format.accessibilityChannel).setInitializationData(format.initializationData).build());
            this.f33612b[i] = track;
        }
    }
}
