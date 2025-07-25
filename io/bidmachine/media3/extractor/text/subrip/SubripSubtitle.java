package io.bidmachine.media3.extractor.text.subrip;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.Util;
import io.bidmachine.media3.extractor.text.Subtitle;
import java.util.Collections;
import java.util.List;

/* renamed from: io.bidmachine.media3.extractor.text.subrip.a */
/* loaded from: classes9.dex */
final class SubripSubtitle implements Subtitle {
    private final long[] cueTimesUs;
    private final Cue[] cues;

    public SubripSubtitle(Cue[] cueArr, long[] jArr) {
        this.cues = cueArr;
        this.cueTimesUs = jArr;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public List<Cue> getCues(long j) {
        Cue cue;
        int binarySearchFloor = Util.binarySearchFloor(this.cueTimesUs, j, true, false);
        if (binarySearchFloor != -1 && (cue = this.cues[binarySearchFloor]) != Cue.EMPTY) {
            return Collections.singletonList(cue);
        }
        return Collections.emptyList();
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
        if (i >= this.cueTimesUs.length) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        return this.cueTimesUs[i];
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getEventTimeCount() {
        return this.cueTimesUs.length;
    }

    @Override // io.bidmachine.media3.extractor.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil(this.cueTimesUs, j, false, false);
        if (binarySearchCeil >= this.cueTimesUs.length) {
            return -1;
        }
        return binarySearchCeil;
    }
}
