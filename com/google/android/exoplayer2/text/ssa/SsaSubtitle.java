package com.google.android.exoplayer2.text.ssa;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class SsaSubtitle implements Subtitle {

    /* renamed from: b */
    private final List<List<Cue>> f34917b;

    /* renamed from: c */
    private final List<Long> f34918c;

    public SsaSubtitle(List<List<Cue>> list, List<Long> list2) {
        this.f34917b = list;
        this.f34918c = list2;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j) {
        int binarySearchFloor = Util.binarySearchFloor((List<? extends Comparable<? super Long>>) this.f34918c, Long.valueOf(j), true, false);
        if (binarySearchFloor == -1) {
            return Collections.emptyList();
        }
        return this.f34917b.get(binarySearchFloor);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public long getEventTime(int i) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        if (i >= this.f34918c.size()) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        return this.f34918c.get(i).longValue();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f34918c.size();
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil((List<? extends Comparable<? super Long>>) this.f34918c, Long.valueOf(j), false, false);
        if (binarySearchCeil >= this.f34918c.size()) {
            return -1;
        }
        return binarySearchCeil;
    }
}
