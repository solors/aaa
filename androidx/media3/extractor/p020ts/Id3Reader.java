package androidx.media3.extractor.p020ts;

import androidx.media3.common.Format;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.TrackOutput;
import androidx.media3.extractor.p020ts.TsPayloadReader;

@UnstableApi
/* renamed from: androidx.media3.extractor.ts.Id3Reader */
/* loaded from: classes2.dex */
public final class Id3Reader implements ElementaryStreamReader {
    private static final String TAG = "Id3Reader";
    private TrackOutput output;
    private int sampleBytesRead;
    private int sampleSize;
    private boolean writingSample;
    private final ParsableByteArray id3Header = new ParsableByteArray(10);
    private long sampleTimeUs = -9223372036854775807L;

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void consume(ParsableByteArray parsableByteArray) {
        Assertions.checkStateNotNull(this.output);
        if (!this.writingSample) {
            return;
        }
        int bytesLeft = parsableByteArray.bytesLeft();
        int i = this.sampleBytesRead;
        if (i < 10) {
            int min = Math.min(bytesLeft, 10 - i);
            System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), this.id3Header.getData(), this.sampleBytesRead, min);
            if (this.sampleBytesRead + min == 10) {
                this.id3Header.setPosition(0);
                if (73 == this.id3Header.readUnsignedByte() && 68 == this.id3Header.readUnsignedByte() && 51 == this.id3Header.readUnsignedByte()) {
                    this.id3Header.skipBytes(3);
                    this.sampleSize = this.id3Header.readSynchSafeInt() + 10;
                } else {
                    Log.m104564w(TAG, "Discarding invalid ID3 tag");
                    this.writingSample = false;
                    return;
                }
            }
        }
        int min2 = Math.min(bytesLeft, this.sampleSize - this.sampleBytesRead);
        this.output.sampleData(parsableByteArray, min2);
        this.sampleBytesRead += min2;
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void createTracks(ExtractorOutput extractorOutput, TsPayloadReader.TrackIdGenerator trackIdGenerator) {
        trackIdGenerator.generateNewId();
        TrackOutput track = extractorOutput.track(trackIdGenerator.getTrackId(), 5);
        this.output = track;
        track.format(new Format.Builder().setId(trackIdGenerator.getFormatId()).setSampleMimeType("application/id3").build());
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void packetFinished(boolean z) {
        int i;
        Assertions.checkStateNotNull(this.output);
        if (this.writingSample && (i = this.sampleSize) != 0 && this.sampleBytesRead == i) {
            long j = this.sampleTimeUs;
            if (j != -9223372036854775807L) {
                this.output.sampleMetadata(j, 1, i, 0, null);
            }
            this.writingSample = false;
        }
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void packetStarted(long j, int i) {
        if ((i & 4) == 0) {
            return;
        }
        this.writingSample = true;
        if (j != -9223372036854775807L) {
            this.sampleTimeUs = j;
        }
        this.sampleSize = 0;
        this.sampleBytesRead = 0;
    }

    @Override // androidx.media3.extractor.p020ts.ElementaryStreamReader
    public void seek() {
        this.writingSample = false;
        this.sampleTimeUs = -9223372036854775807L;
    }
}
