package com.google.android.exoplayer2.text;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.util.Assertions;
import com.google.common.collect.ImmutableList;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

/* loaded from: classes4.dex */
public final class ExoplayerCuesDecoder implements SubtitleDecoder {

    /* renamed from: a */
    private final CueDecoder f34751a = new CueDecoder();

    /* renamed from: b */
    private final SubtitleInputBuffer f34752b = new SubtitleInputBuffer();

    /* renamed from: c */
    private final Deque<SubtitleOutputBuffer> f34753c = new ArrayDeque();

    /* renamed from: d */
    private int f34754d;

    /* renamed from: e */
    private boolean f34755e;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static final class SingleEventSubtitle implements Subtitle {

        /* renamed from: b */
        private final long f34757b;

        /* renamed from: c */
        private final ImmutableList<Cue> f34758c;

        public SingleEventSubtitle(long j, ImmutableList<Cue> immutableList) {
            this.f34757b = j;
            this.f34758c = immutableList;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public List<Cue> getCues(long j) {
            if (j >= this.f34757b) {
                return this.f34758c;
            }
            return ImmutableList.m69424of();
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public long getEventTime(int i) {
            boolean z;
            if (i == 0) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            return this.f34757b;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getEventTimeCount() {
            return 1;
        }

        @Override // com.google.android.exoplayer2.text.Subtitle
        public int getNextEventTimeIndex(long j) {
            if (this.f34757b > j) {
                return 0;
            }
            return -1;
        }
    }

    public ExoplayerCuesDecoder() {
        for (int i = 0; i < 2; i++) {
            this.f34753c.addFirst(new SubtitleOutputBuffer() { // from class: com.google.android.exoplayer2.text.ExoplayerCuesDecoder.1
                @Override // com.google.android.exoplayer2.decoder.DecoderOutputBuffer
                public void release() {
                    ExoplayerCuesDecoder.this.m73574b(this);
                }
            });
        }
        this.f34754d = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public void m73574b(SubtitleOutputBuffer subtitleOutputBuffer) {
        boolean z;
        if (this.f34753c.size() < 2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkState(z);
        Assertions.checkArgument(!this.f34753c.contains(subtitleOutputBuffer));
        subtitleOutputBuffer.clear();
        this.f34753c.addFirst(subtitleOutputBuffer);
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void flush() {
        Assertions.checkState(!this.f34755e);
        this.f34752b.clear();
        this.f34754d = 0;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public String getName() {
        return "ExoplayerCuesDecoder";
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void release() {
        this.f34755e = true;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleInputBuffer dequeueInputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(!this.f34755e);
        if (this.f34754d != 0) {
            return null;
        }
        this.f34754d = 1;
        return this.f34752b;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public SubtitleOutputBuffer dequeueOutputBuffer() throws SubtitleDecoderException {
        Assertions.checkState(!this.f34755e);
        if (this.f34754d != 2 || this.f34753c.isEmpty()) {
            return null;
        }
        SubtitleOutputBuffer removeFirst = this.f34753c.removeFirst();
        if (this.f34752b.isEndOfStream()) {
            removeFirst.addFlag(4);
        } else {
            SubtitleInputBuffer subtitleInputBuffer = this.f34752b;
            removeFirst.setContent(this.f34752b.timeUs, new SingleEventSubtitle(subtitleInputBuffer.timeUs, this.f34751a.decode(((ByteBuffer) Assertions.checkNotNull(subtitleInputBuffer.data)).array())), 0L);
        }
        this.f34752b.clear();
        this.f34754d = 0;
        return removeFirst;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public void queueInputBuffer(SubtitleInputBuffer subtitleInputBuffer) throws SubtitleDecoderException {
        Assertions.checkState(!this.f34755e);
        Assertions.checkState(this.f34754d == 1);
        Assertions.checkArgument(this.f34752b == subtitleInputBuffer);
        this.f34754d = 2;
    }

    @Override // com.google.android.exoplayer2.text.SubtitleDecoder
    public void setPositionUs(long j) {
    }
}
