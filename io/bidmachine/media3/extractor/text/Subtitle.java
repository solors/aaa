package io.bidmachine.media3.extractor.text;

import io.bidmachine.media3.common.text.Cue;
import io.bidmachine.media3.common.util.UnstableApi;
import java.util.List;

@UnstableApi
/* loaded from: classes9.dex */
public interface Subtitle {
    List<Cue> getCues(long j);

    long getEventTime(int i);

    int getEventTimeCount();

    int getNextEventTimeIndex(long j);
}
