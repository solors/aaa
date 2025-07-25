package com.google.android.exoplayer2.extractor;

import java.io.IOException;

/* loaded from: classes4.dex */
public class ForwardingExtractorInput implements ExtractorInput {

    /* renamed from: a */
    private final ExtractorInput f32918a;

    public ForwardingExtractorInput(ExtractorInput extractorInput) {
        this.f32918a = extractorInput;
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean advancePeekPosition(int i, boolean z) throws IOException {
        return this.f32918a.advancePeekPosition(i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getLength() {
        return this.f32918a.getLength();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPeekPosition() {
        return this.f32918a.getPeekPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public long getPosition() {
        return this.f32918a.getPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int peek(byte[] bArr, int i, int i2) throws IOException {
        return this.f32918a.peek(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean peekFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f32918a.peekFully(bArr, i, i2, z);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput, com.google.android.exoplayer2.upstream.DataReader
    public int read(byte[] bArr, int i, int i2) throws IOException {
        return this.f32918a.read(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean readFully(byte[] bArr, int i, int i2, boolean z) throws IOException {
        return this.f32918a.readFully(bArr, i, i2, z);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void resetPeekPosition() {
        this.f32918a.resetPeekPosition();
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public <E extends Throwable> void setRetryPosition(long j, E e) throws Throwable {
        this.f32918a.setRetryPosition(j, e);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public int skip(int i) throws IOException {
        return this.f32918a.skip(i);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public boolean skipFully(int i, boolean z) throws IOException {
        return this.f32918a.skipFully(i, z);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void advancePeekPosition(int i) throws IOException {
        this.f32918a.advancePeekPosition(i);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void peekFully(byte[] bArr, int i, int i2) throws IOException {
        this.f32918a.peekFully(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void readFully(byte[] bArr, int i, int i2) throws IOException {
        this.f32918a.readFully(bArr, i, i2);
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorInput
    public void skipFully(int i) throws IOException {
        this.f32918a.skipFully(i);
    }
}
