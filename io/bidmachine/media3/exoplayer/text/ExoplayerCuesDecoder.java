package io.bidmachine.media3.exoplayer.text;

import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.extractor.text.CueDecoder;
import io.bidmachine.media3.extractor.text.Subtitle;
import io.bidmachine.media3.extractor.text.SubtitleDecoder;
import io.bidmachine.media3.extractor.text.SubtitleDecoderException;
import io.bidmachine.media3.extractor.text.SubtitleInputBuffer;
import io.bidmachine.media3.extractor.text.SubtitleOutputBuffer;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public final class ExoplayerCuesDecoder implements SubtitleDecoder {
    private static final int INPUT_BUFFER_AVAILABLE = 0;
    private static final int INPUT_BUFFER_DEQUEUED = 1;
    private static final int INPUT_BUFFER_QUEUED = 2;
    private static final int OUTPUT_BUFFERS_COUNT = 2;
    private int inputBufferState;
    private boolean released;
    private final CueDecoder cueDecoder = new CueDecoder();
    private final SubtitleInputBuffer inputBuffer = new SubtitleInputBuffer();
    private final Deque<SubtitleOutputBuffer> availableOutputBuffers = new ArrayDeque();

    /* renamed from: io.bidmachine.media3.exoplayer.text.ExoplayerCuesDecoder$a */
    /* loaded from: classes9.dex */
    class C36424a extends SubtitleOutputBuffer {
        C36424a() {
        }

        @Override // io.bidmachine.media3.decoder.DecoderOutputBuffer
        public void release() {
            ExoplayerCuesDecoder.this.releaseOutputBuffer(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: io.bidmachine.media3.exoplayer.text.ExoplayerCuesDecoder$b */
    /* loaded from: classes9.dex */
    public static final class C36425b implements Subtitle {
        private final ImmutableList<Cue> cues;
        private final long timeUs;

        public C36425b(long j, ImmutableList<Cue> immutableList) {
            this.timeUs = j;
            this.cues = immutableList;
        }

        @Override // io.bidmachine.media3.extractor.text.Subtitle
        public List<Cue> getCues(long j) {
            if (j >= this.timeUs) {
                return this.cues;
            }
            return ImmutableList.m69424of();
        }

        @Override // io.bidmachine.media3.extractor.text.Subtitle
        public long getEventTime(int i) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            return this.timeUs;
        }

        @Override // io.bidmachine.media3.extractor.text.Subtitle
        public int getEventTimeCount() {
            return 1;
        }

        @Override // io.bidmachine.media3.extractor.text.Subtitle
        public int getNextEventTimeIndex(long j) {
            if (this.timeUs > j) {
                return 0;
            }
            return -1;
        }
    }

    public ExoplayerCuesDecoder() {
        for (int i = 0; i < 2; i++) {
            this.availableOutputBuffers.addFirst(new C36424a());
        }
        this.inputBufferState = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void releaseOutputBuffer(SubtitleOutputBuffer subtitleOutputBuffer) {
        boolean z;
        if (this.availableOutputBuffers.size() < 2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        Assertions.checkArgument(!this.availableOutputBuffers.contains(subtitleOutputBuffer));
        subtitleOutputBuffer.clear();
        this.availableOutputBuffers.addFirst(subtitleOutputBuffer);
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public void flush() {
        Assertions.checkState(!this.released);
        this.inputBuffer.clear();
        this.inputBufferState = 0;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public void release() {
        this.released = true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    @Nullable
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(!this.released);
        if (this.inputBufferState != 0) {
            return null;
        }
        this.inputBufferState = 1;
        return this.inputBuffer;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(!this.released);
        if (this.inputBufferState != 2 || this.availableOutputBuffers.isEmpty()) {
            return null;
        }
        SubtitleOutputBuffer removeFirst = this.availableOutputBuffers.removeFirst();
        if (this.inputBuffer.isEndOfStream()) {
            removeFirst.addFlag(4);
        } else {
            SubtitleInputBuffer subtitleInputBuffer = this.inputBuffer;
            removeFirst.setContent(this.inputBuffer.timeUs, new C36425b(subtitleInputBuffer.timeUs, this.cueDecoder.decode(((ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data)).array())), 0L);
        }
        this.inputBuffer.clear();
        this.inputBufferState = 0;
        return removeFirst;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder, io.bidmachine.media3.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        Assertions.checkState(!this.released);
        Assertions.checkState(this.inputBufferState == 1);
        Assertions.checkArgument(this.inputBuffer == subtitleInputBuffer);
        this.inputBufferState = 2;
    }

    @Override // io.bidmachine.media3.extractor.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }
}
