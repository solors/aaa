package com.google.android.exoplayer2.text.webvtt;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
final class Mp4WebvttSubtitle implements Subtitle {

    /* renamed from: b */
    private final List<Cue> f34985b;

    public Mp4WebvttSubtitle(List<Cue> list) {
        this.f34985b = Collections.unmodifiableList(list);
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public List<Cue> getCues(long j) {
        if (j >= 0) {
            return this.f34985b;
        }
        return Collections.emptyList();
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
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public int getNextEventTimeIndex(long j) {
        if (j < 0) {
            return 0;
        }
        return -1;
    }
}
