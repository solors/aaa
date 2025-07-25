package com.google.android.exoplayer2.p380ui;

import androidx.annotation.Nullable;

/* renamed from: com.google.android.exoplayer2.ui.TimeBar */
/* loaded from: classes4.dex */
public interface TimeBar {

    /* renamed from: com.google.android.exoplayer2.ui.TimeBar$OnScrubListener */
    /* loaded from: classes4.dex */
    public interface OnScrubListener {
        void onScrubMove(TimeBar timeBar, long j);

        void onScrubStart(TimeBar timeBar, long j);

        void onScrubStop(TimeBar timeBar, long j, boolean z);
    }

    void addListener(OnScrubListener onScrubListener);

    long getPreferredUpdateDelay();

    void removeListener(OnScrubListener onScrubListener);

    void setAdGroupTimesMs(@Nullable long[] jArr, @Nullable boolean[] zArr, int i);

    void setBufferedPosition(long j);

    void setDuration(long j);

    void setEnabled(boolean z);

    void setKeyCountIncrement(int i);

    void setKeyTimeIncrement(long j);

    void setPosition(long j);
}
