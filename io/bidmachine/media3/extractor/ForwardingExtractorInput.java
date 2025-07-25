package io.bidmachine.media3.extractor;

import io.bidmachine.media3.common.util.UnstableApi;
import java.io.IOException;

@UnstableApi
/* loaded from: classes9.dex */
public class ForwardingExtractorInput implements ExtractorInput {
    private final ExtractorInput input;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.input = extractorInput;
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        return this.input.advancePeekPosition(i, z);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public long getLength() {
        return this.input.getLength();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.input.getPeekPosition();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public long getPosition() {
        return this.input.getPosition();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public int peek(byte[] bArr, int i, int i2) throws IOException {
        return this.input.peek(bArr, i, i2);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.input.peekFully(bArr, i, i2, z);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput, io.bidmachine.media3.common.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.input.read(bArr, i, i2);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.input.readFully(bArr, i, i2, z);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.input.resetPeekPosition();
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        this.input.setRetryPosition(j, e);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public int skip(int i) throws IOException {
        return this.input.skip(i);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public boolean skipFully(int i, boolean z) throws IOException {
        return this.input.skipFully(i, z);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public void advancePeekPosition(int i) throws IOException {
        this.input.advancePeekPosition(i);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.input.peekFully(bArr, i, i2);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.input.readFully(bArr, i, i2);
    }

    @Override // io.bidmachine.media3.extractor.ExtractorInput
    public void skipFully(int i) throws IOException {
        this.input.skipFully(i);
    }
}
