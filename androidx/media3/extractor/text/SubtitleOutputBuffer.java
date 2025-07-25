package androidx.media3.extractor.text;

import androidx.annotation.Nullable;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.decoder.DecoderOutputBuffer;
import java.util.List;

@UnstableApi
/* loaded from: classes2.dex */
public abstract class SubtitleOutputBuffer extends DecoderOutputBuffer implements Subtitle {
    private long subsampleOffsetUs;
    @Nullable
    private Subtitle subtitle;

    @Override // androidx.media3.decoder.DecoderOutputBuffer, androidx.media3.decoder.Buffer
    public void clear() {
        super.clear();
        this.subtitle = null;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getCues(j - this.subsampleOffsetUs);
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTime(i) + this.subsampleOffsetUs;
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getEventTimeCount();
    }

    @Override // androidx.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        return ((Subtitle) Assertions.checkNotNull(this.subtitle)).getNextEventTimeIndex(j - this.subsampleOffsetUs);
    }

    public void setContent(long j, Subtitle subtitle, long j2) {
        this.timeUs = j;
        this.subtitle = subtitle;
        if (j2 != Long.MAX_VALUE) {
            j = j2;
        }
        this.subsampleOffsetUs = j;
    }
}
