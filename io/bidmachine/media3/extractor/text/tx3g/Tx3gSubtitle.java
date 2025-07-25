package io.bidmachine.media3.extractor.text.tx3g;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* renamed from: io.bidmachine.media3.extractor.text.tx3g.a */
/* loaded from: classes9.dex */
final class Tx3gSubtitle implements Subtitle {
    public static final Tx3gSubtitle EMPTY = new Tx3gSubtitle();
    private final List<Cue> cues;

    public Tx3gSubtitle(Cue cue) {
        this.cues = Collections.singletonList(cue);
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        if (j >= 0) {
            return this.cues;
        }
        return Collections.emptyList();
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
        return 0L;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }

    private Tx3gSubtitle() {
        this.cues = Collections.emptyList();
    }
}
