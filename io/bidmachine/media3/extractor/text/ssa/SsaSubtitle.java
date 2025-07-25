package io.bidmachine.media3.extractor.text.ssa;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* renamed from: io.bidmachine.media3.extractor.text.ssa.b */
/* loaded from: classes9.dex */
final class SsaSubtitle implements Subtitle {
    private final List<Long> cueTimesUs;
    private final List<List<Cue>> cues;

    public SsaSubtitle(List<List<Cue>> list, List<Long> list2) {
        this.cues = list;
        this.cueTimesUs = list2;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        int binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) this.cueTimesUs, Long.valueOf(j), true, false);
        if (binarySearchFloor == -1) {
            return Collections.emptyList();
        }
        return this.cues.get(binarySearchFloor);
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public long getEventTime(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (i >= this.cueTimesUs.size()) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        return this.cueTimesUs.get(i).longValue();
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.cueTimesUs.size();
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil((List<? extends Comparable<? super Long>>) this.cueTimesUs, Long.valueOf(j), false, false);
        if (binarySearchCeil >= this.cueTimesUs.size()) {
            return -1;
        }
        return binarySearchCeil;
    }
}
