package io.bidmachine.media3.extractor.text.dvb;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.extractor.text.Subtitle;
import java.util.List;

/* renamed from: io.bidmachine.media3.extractor.text.dvb.b */
/* loaded from: classes9.dex */
final class DvbSubtitle implements Subtitle {
    private final List<Cue> cues;

    public DvbSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        return this.cues;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        return 0L;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        return -1;
    }
}
