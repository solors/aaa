package io.bidmachine.media3.extractor.avi;

import io.bidmachine.media3.common.util.ParsableByteArray;

/* renamed from: io.bidmachine.media3.extractor.avi.g */
/* loaded from: classes9.dex */
final class StreamNameChunk implements AviChunk {
    public final String name;

    private StreamNameChunk(String str) {
        this.name = str;
    }

    public static StreamNameChunk parseFrom(ParsableByteArray parsableByteArray) {
        return new StreamNameChunk(parsableByteArray.readString(parsableByteArray.bytesLeft()));
    }

    @Override // io.bidmachine.media3.extractor.avi.AviChunk
    public int getType() {
        return 1852994675;
    }
}
