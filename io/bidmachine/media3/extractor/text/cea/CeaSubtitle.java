package io.bidmachine.media3.extractor.text.cea;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* renamed from: io.bidmachine.media3.extractor.text.cea.d */
/* loaded from: classes9.dex */
final class CeaSubtitle implements Subtitle {
    private final List<Cue> cues;

    public CeaSubtitle(List<Cue> list) {
        this.cues = list;
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
}
