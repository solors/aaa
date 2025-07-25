package io.bidmachine.media3.extractor;

import io.bidmachine.media3.common.util.UnstableApi;

@UnstableApi
/* loaded from: classes9.dex */
public interface ExtractorOutput {
    public static final ExtractorOutput PLACEHOLDER = new C36528a();

    /* renamed from: io.bidmachine.media3.extractor.ExtractorOutput$a */
    /* loaded from: classes9.dex */
    class C36528a implements ExtractorOutput {
        C36528a() {
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public void endTracks() {
            throw new UnsupportedOperationException();
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public void seekMap(SeekMap seekMap) {
            throw new UnsupportedOperationException();
        }

        @Override // io.bidmachine.media3.extractor.ExtractorOutput
        public TrackOutput track(int i, int i2) {
            throw new UnsupportedOperationException();
        }
    }

    void endTracks();

    void seekMap(SeekMap seekMap);

    TrackOutput track(int i, int i2);
}
