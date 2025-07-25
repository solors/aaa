package io.bidmachine.media3.exoplayer.audio;

import io.bidmachine.media3.common.audio.AudioProcessor;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.decoder.DecoderInputBuffer;
import io.bidmachine.media3.extractor.OpusUtil;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

@UnstableApi
/* loaded from: classes9.dex */
public final class OggOpusAudioPacketizer {
    private static final int FIRST_AUDIO_SAMPLE_PAGE_SEQUENCE = 2;
    private ByteBuffer outputBuffer = AudioProcessor.EMPTY_BUFFER;
    private int granulePosition = 0;
    private int pageSequenceNumber = 2;

    private ByteBuffer packetizeInternal(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i = limit - position;
        int i2 = (i + 255) / 255;
        ByteBuffer replaceOutputBuffer = replaceOutputBuffer(i2 + 27 + i);
        replaceOutputBuffer.put((byte) 79);
        replaceOutputBuffer.put((byte) 103);
        replaceOutputBuffer.put((byte) 103);
        replaceOutputBuffer.put((byte) 83);
        replaceOutputBuffer.put((byte) 0);
        replaceOutputBuffer.put((byte) 0);
        int parsePacketAudioSampleCount = this.granulePosition + OpusUtil.parsePacketAudioSampleCount(byteBuffer);
        this.granulePosition = parsePacketAudioSampleCount;
        replaceOutputBuffer.putLong(parsePacketAudioSampleCount);
        replaceOutputBuffer.putInt(0);
        replaceOutputBuffer.putInt(this.pageSequenceNumber);
        this.pageSequenceNumber++;
        replaceOutputBuffer.putInt(0);
        replaceOutputBuffer.put((byte) i2);
        for (int i3 = 0; i3 < i2; i3++) {
            if (i >= 255) {
                replaceOutputBuffer.put((byte) -1);
                i -= 255;
            } else {
                replaceOutputBuffer.put((byte) i);
                i = 0;
            }
        }
        while (position < limit) {
            replaceOutputBuffer.put(byteBuffer.get(position));
            position++;
        }
        byteBuffer.position(byteBuffer.limit());
        replaceOutputBuffer.flip();
        replaceOutputBuffer.putInt(22, Util.crc32(replaceOutputBuffer.array(), replaceOutputBuffer.arrayOffset(), replaceOutputBuffer.limit() - replaceOutputBuffer.position(), 0));
        replaceOutputBuffer.position(0);
        return replaceOutputBuffer;
    }

    private ByteBuffer replaceOutputBuffer(int i) {
        if (this.outputBuffer.capacity() < i) {
            this.outputBuffer = ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
        } else {
            this.outputBuffer.clear();
        }
        return this.outputBuffer;
    }

    public void packetize(DecoderInputBuffer decoderInputBuffer) {
        Assertions.checkNotNull(decoderInputBuffer.data);
        if (decoderInputBuffer.data.limit() - decoderInputBuffer.data.position() == 0) {
            return;
        }
        this.outputBuffer = packetizeInternal(decoderInputBuffer.data);
        decoderInputBuffer.clear();
        decoderInputBuffer.ensureSpaceForWrite(this.outputBuffer.remaining());
        decoderInputBuffer.data.put(this.outputBuffer);
        decoderInputBuffer.flip();
    }

    public void reset() {
        this.outputBuffer = AudioProcessor.EMPTY_BUFFER;
        this.granulePosition = 0;
        this.pageSequenceNumber = 2;
    }
}
