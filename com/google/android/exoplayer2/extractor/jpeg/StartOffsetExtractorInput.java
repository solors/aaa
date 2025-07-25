package com.google.android.exoplayer2.extractor.jpeg;

import com.google.android.exoplayer2.extractor.ExtractorInput;
import com.google.android.exoplayer2.extractor.ForwardingExtractorInput;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
final class StartOffsetExtractorInput extends ForwardingExtractorInput {

    /* renamed from: b */
    private final long f33045b;

    public StartOffsetExtractorInput(ExtractorInput extractorInput, long j) {
        super(extractorInput);
        boolean z;
        if (extractorInput.getPosition() >= j) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        this.f33045b = j;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return super.getLength() - this.f33045b;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return super.getPeekPosition() - this.f33045b;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return super.getPosition() - this.f33045b;
    }

    @Override // com.google.android.exoplayer2.extractor.ForwardingExtractorInput, com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        super.setRetryPosition(j + this.f33045b, e);
    }
}
