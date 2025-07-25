package androidx.media3.extractor.heif;

import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.Extractor;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.ExtractorOutput;
import androidx.media3.extractor.PositionHolder;
import androidx.media3.extractor.SingleSampleExtractor;
import java.io.IOException;

@UnstableApi
/* loaded from: classes2.dex */
public final class HeifExtractor implements Extractor {
    private static final int FILE_SIGNATURE_SEGMENT_LENGTH = 4;
    private static final int HEIF_FILE_SIGNATURE_PART_1 = 1718909296;
    private static final int HEIF_FILE_SIGNATURE_PART_2 = 1751476579;
    private final ParsableByteArray scratch = new ParsableByteArray(4);
    private final SingleSampleExtractor imageExtractor = new SingleSampleExtractor(-1, -1, "image/heif");

    private boolean readAndCompareFourBytes(ExtractorInput extractorInput, int i) throws IOException {
        this.scratch.reset(4);
        extractorInput.peekFully(this.scratch.getData(), 0, 4);
        if (this.scratch.readUnsignedInt() != i) {
            return false;
        }
        return true;
    }

    @Override // androidx.media3.extractor.Extractor
    public void init(ExtractorOutput extractorOutput) {
        this.imageExtractor.init(extractorOutput);
    }

    @Override // androidx.media3.extractor.Extractor
    public int read(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        return this.imageExtractor.read(extractorInput, positionHolder);
    }

    @Override // androidx.media3.extractor.Extractor
    public void seek(long j, long j2) {
        this.imageExtractor.seek(j, j2);
    }

    @Override // androidx.media3.extractor.Extractor
    public boolean sniff(ExtractorInput extractorInput) throws IOException {
        extractorInput.advancePeekPosition(4);
        if (readAndCompareFourBytes(extractorInput, 1718909296) && readAndCompareFourBytes(extractorInput, 1751476579)) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.extractor.Extractor
    public void release() {
    }
}
