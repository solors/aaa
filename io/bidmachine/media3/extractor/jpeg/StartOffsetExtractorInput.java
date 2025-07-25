package io.bidmachine.media3.extractor.jpeg;

import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.ExtractorInput;
import io.bidmachine.media3.extractor.ForwardingExtractorInput;

/* renamed from: io.bidmachine.media3.extractor.jpeg.a */
/* loaded from: classes9.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {
    private final long startOffset;

    public StartOffsetExtractorInput(ExtractorInput extractorInput, long j) {
        super(extractorInput);
        boolean z;
        if (extractorInput.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.startOffset = j;
    }

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public long getLength() {
        return super.getLength() - this.startOffset;
    }

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return super.getPeekPosition() - this.startOffset;
    }

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public long getPosition() {
        return super.getPosition() - this.startOffset;
    }

    @Override // io.bidmachine.media3.extractor.ForwardingExtractorInput, io.bidmachine.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        super.setRetryPosition(j + this.startOffset, e);
    }
}
