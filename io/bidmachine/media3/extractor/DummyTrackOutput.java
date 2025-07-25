package io.bidmachine.media3.extractor;

import androidx.annotation.Nullable;
import io.bidmachine.media3.common.DataReader;
import io.bidmachine.media3.common.Format;
import io.bidmachine.media3.common.util.ParsableByteArray;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.TrackOutput;
import java.io.EOFException;
import java.io.IOException;

@UnstableApi
/* loaded from: classes9.dex */
public final class DummyTrackOutput implements TrackOutput {
    private final byte[] readBuffer = new byte[4096];

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public /* bridge */ /* synthetic */ int sampleData(DataReader dataReader, int i, boolean z) throws IOException {
        return super.sampleData(dataReader, i, z);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public /* bridge */ /* synthetic */ void sampleData(ParsableByteArray parsableByteArray, int i) {
        super.sampleData(parsableByteArray, i);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public int sampleData(DataReader dataReader, int i, boolean z, int i2) throws IOException {
        int read = dataReader.read(this.readBuffer, 0, Math.min(this.readBuffer.length, i));
        if (read == -1) {
            if (z) {
                return -1;
            }
            throw new EOFException();
        }
        return read;
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void sampleData(ParsableByteArray parsableByteArray, int i, int i2) {
        parsableByteArray.skipBytes(i);
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void format(Format format) {
    }

    @Override // io.bidmachine.media3.extractor.TrackOutput
    public void sampleMetadata(long j, int i, int i2, int i3, @Nullable TrackOutput.CryptoData cryptoData) {
    }
}
