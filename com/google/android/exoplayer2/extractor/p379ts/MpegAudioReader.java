package com.google.android.exoplayer2.extractor.p379ts;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.extractor.ExtractorOutput;
import com.google.android.exoplayer2.extractor.TrackOutput;
import com.google.android.exoplayer2.extractor.p379ts.TsPayloadReader;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ParsableByteArray;

/* renamed from: com.google.android.exoplayer2.extractor.ts.MpegAudioReader */
/* loaded from: classes4.dex */
public final class MpegAudioReader implements ElementaryStreamReader {

    /* renamed from: a */
    private final ParsableByteArray f33546a;

    /* renamed from: b */
    private final MpegAudioUtil.Header f33547b;
    @Nullable

    /* renamed from: c */
    private final String f33548c;

    /* renamed from: d */
    private TrackOutput f33549d;

    /* renamed from: e */
    private String f33550e;

    /* renamed from: f */
    private int f33551f;

    /* renamed from: g */
    private int f33552g;

    /* renamed from: h */
    private boolean f33553h;

    /* renamed from: i */
    private boolean f33554i;

    /* renamed from: j */
    private long f33555j;

    /* renamed from: k */
    private int f33556k;

    /* renamed from: l */
    private long f33557l;

    public MpegAudioReader() {
        this(null);
    }

    /* renamed from: a */
    private void m74333a(ParsableByteArray parsableByteArray) {
        boolean z;
        boolean z2;
        byte[] data = parsableByteArray.getData();
        int limit = parsableByteArray.limit();
        for (int position = parsableByteArray.getPosition(); position < limit; position++) {
            byte b = data[position];
            if ((b & 255) == 255) {
                z = true;
            } else {
                z = false;
            }
            if (this.f33554i && (b & 224) == 224) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f33554i = z;
            if (z2) {
                parsableByteArray.setPosition(position + 1);
                this.f33554i = false;
                this.f33546a.getData()[1] = data[position];
                this.f33552g = 2;
                this.f33551f = 1;
                return;
            }
        }
        parsableByteArray.setPosition(limit);
    }

    /* renamed from: b */
    private void m74332b(ParsableByteArray parsableByteArray) {
        int min = Math.min(parsableByteArray.bytesLeft(), this.f33556k - this.f33552g);
        this.f33549d.sampleData(parsableByteArray, min);
        int i = this.f33552g + min;
        this.f33552g = i;
        int i2 = this.f33556k;
        if (i < i2) {
            return;
        }
        long j = this.f33557l;
        if (j != -9223372036854775807L) {
            this.f33549d.sampleMetadata(j, 1, i2, 0, null);
            this.f33557l += this.f33555j;
        }
        this.f33552g = 0;
        this.f33551f = 0;
    }

    /* renamed from: c */
    private void m74331c(ParsableByteArray parsableByteArray) {
        int min = Math.min(parsableByteArray.bytesLeft(), 4 - this.f33552g);
        parsableByteArray.readBytes(this.f33546a.getData(), this.f33552g, min);
        int i = this.f33552g + min;
        this.f33552g = i;
        if (i < 4) {
            return;
        }
        this.f33546a.setPosition(0);
        if (!this.f33547b.setForHeaderData(this.f33546a.readInt())) {
            this.f33552g = 0;
            this.f33551f = 1;
            return;
        }
        MpegAudioUtil.Header header = this.f33547b;
        this.f33556k = header.frameSize;
        if (!this.f33553h) {
            this.f33555j = (header.samplesPerFrame * 1000000) / header.sampleRate;
            this.f33549d.format(new Format.Builder().setId(this.f33550e).setSampleMimeType(this.f33547b.mimeType).setMaxInputSize(4096).setChannelCount(this.f33547b.channels).setSampleRate(this.f33547b.sampleRate).setLanguage(this.f33548c).build());
            this.f33553h = true;
        }
        this.f33546a.setPosition(0);
        this.f33549d.sampleData(this.f33546a, 4);
        this.f33551f = 2;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.f33549d);
        while (parsableByteArray.bytesLeft() > 0) {
            int i = this.f33551f;
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        m74332b(parsableByteArray);
                    } else {
                        throw new IllegalStateException();
                    }
                } else {
                    m74331c(parsableByteArray);
                }
            } else {
                m74333a(parsableByteArray);
            }
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        this.f33550e = trackIdGenerator.getFormatId();
        this.f33549d = extractorOutput.track(trackIdGenerator.getTrackId(), 1);
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if (j != -9223372036854775807L) {
            this.f33557l = j;
        }
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void seek() {
        this.f33551f = 0;
        this.f33552g = 0;
        this.f33554i = false;
        this.f33557l = -9223372036854775807L;
    }

    public MpegAudioReader(@Nullable String str) {
        this.f33551f = 0;
        ParsableByteArray parsableByteArray = new ParsableByteArray(4);
        this.f33546a = parsableByteArray;
        parsableByteArray.getData()[0] = -1;
        this.f33547b = new MpegAudioUtil.Header();
        this.f33557l = -9223372036854775807L;
        this.f33548c = str;
    }

    @Override // com.google.android.exoplayer2.extractor.p379ts.ElementaryStreamReader
    public void packetFinished() {
    }
}
