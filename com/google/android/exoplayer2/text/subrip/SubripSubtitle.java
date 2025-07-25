package com.google.android.exoplayer2.text.subrip;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class SubripSubtitle implements Subtitle {

    /* renamed from: b */
    private final Cue[] f34923b;

    /* renamed from: c */
    private final long[] f34924c;

    public SubripSubtitle(Cue[] cueArr, long[] jArr) {
        this.f34923b = cueArr;
        this.f34924c = jArr;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j) {
        Cue cue;
        int binarySearchFloor = Util.binarySearchFloor(this.f34924c, j, true, false);
        if (binarySearchFloor != -1 && (cue = this.f34923b[binarySearchFloor]) != Cue.EMPTY) {
            return Collections.singletonList(cue);
        }
        return Collections.emptyList();
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
        if (i >= this.f34924c.length) {
            z2 = false;
        }
        Assertions.checkArgument(z2);
        return this.f34924c[i];
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return this.f34924c.length;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        int binarySearchCeil = Util.binarySearchCeil(this.f34924c, j, false, false);
        if (binarySearchCeil >= this.f34924c.length) {
            return -1;
        }
        return binarySearchCeil;
    }
}
