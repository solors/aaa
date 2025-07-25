package androidx.media3.exoplayer.text;

import androidx.media3.common.text.Cue;
import androidx.media3.extractor.text.CuesWithTiming;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Iterables;
import java.util.ArrayList;

/* loaded from: classes2.dex */
final class ReplacingCuesResolver implements CuesResolver {
    private final ArrayList<CuesWithTiming> cuesWithTimingList = new ArrayList<>();

    private int getIndexOfCuesStartingAfter(long j) {
        for (int i = 0; i < this.cuesWithTimingList.size(); i++) {
            if (j < this.cuesWithTimingList.get(i).startTimeUs) {
                return i;
            }
        }
        return this.cuesWithTimingList.size();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002f  */
    @Override // androidx.media3.exoplayer.text.CuesResolver
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean addCues(androidx.media3.extractor.text.CuesWithTiming r10, long r11) {
        /*
            r9 = this;
            long r0 = r10.startTimeUs
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r1 = 1
            r4 = 0
            if (r0 == 0) goto Lf
            r0 = r1
            goto L10
        Lf:
            r0 = r4
        L10:
            androidx.media3.common.util.Assertions.checkArgument(r0)
            long r5 = r10.startTimeUs
            int r0 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r0 > 0) goto L25
            long r5 = r10.endTimeUs
            int r0 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r0 == 0) goto L23
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 >= 0) goto L25
        L23:
            r0 = r1
            goto L26
        L25:
            r0 = r4
        L26:
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r2 = r9.cuesWithTimingList
            int r2 = r2.size()
            int r2 = r2 - r1
        L2d:
            if (r2 < 0) goto L58
            long r5 = r10.startTimeUs
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r3 = r9.cuesWithTimingList
            java.lang.Object r3 = r3.get(r2)
            androidx.media3.extractor.text.CuesWithTiming r3 = (androidx.media3.extractor.text.CuesWithTiming) r3
            long r7 = r3.startTimeUs
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto L46
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r11 = r9.cuesWithTimingList
            int r2 = r2 + r1
            r11.add(r2, r10)
            return r0
        L46:
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r3 = r9.cuesWithTimingList
            java.lang.Object r3 = r3.get(r2)
            androidx.media3.extractor.text.CuesWithTiming r3 = (androidx.media3.extractor.text.CuesWithTiming) r3
            long r5 = r3.startTimeUs
            int r3 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r3 > 0) goto L55
            r0 = r4
        L55:
            int r2 = r2 + (-1)
            goto L2d
        L58:
            java.util.ArrayList<androidx.media3.extractor.text.CuesWithTiming> r11 = r9.cuesWithTimingList
            r11.add(r4, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.text.ReplacingCuesResolver.addCues(androidx.media3.extractor.text.CuesWithTiming, long):boolean");
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void clear() {
        this.cuesWithTimingList.clear();
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public void discardCuesBeforeTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter > 0) {
            this.cuesWithTimingList.subList(0, indexOfCuesStartingAfter).clear();
        }
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public ImmutableList<Cue> getCuesAtTimeUs(long j) {
        int indexOfCuesStartingAfter = getIndexOfCuesStartingAfter(j);
        if (indexOfCuesStartingAfter == 0) {
            return ImmutableList.m69424of();
        }
        CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(indexOfCuesStartingAfter - 1);
        long j2 = cuesWithTiming.endTimeUs;
        if (j2 != -9223372036854775807L && j >= j2) {
            return ImmutableList.m69424of();
        }
        return cuesWithTiming.cues;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getNextCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty()) {
            return Long.MIN_VALUE;
        }
        if (j < this.cuesWithTimingList.get(0).startTimeUs) {
            return this.cuesWithTimingList.get(0).startTimeUs;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i);
            if (j < cuesWithTiming.startTimeUs) {
                long j2 = this.cuesWithTimingList.get(i - 1).endTimeUs;
                if (j2 == -9223372036854775807L || j2 <= j || j2 >= cuesWithTiming.startTimeUs) {
                    return cuesWithTiming.startTimeUs;
                }
                return j2;
            }
        }
        long j3 = ((CuesWithTiming) Iterables.getLast(this.cuesWithTimingList)).endTimeUs;
        if (j3 == -9223372036854775807L || j >= j3) {
            return Long.MIN_VALUE;
        }
        return j3;
    }

    @Override // androidx.media3.exoplayer.text.CuesResolver
    public long getPreviousCueChangeTimeUs(long j) {
        if (this.cuesWithTimingList.isEmpty() || j < this.cuesWithTimingList.get(0).startTimeUs) {
            return -9223372036854775807L;
        }
        for (int i = 1; i < this.cuesWithTimingList.size(); i++) {
            long j2 = this.cuesWithTimingList.get(i).startTimeUs;
            int i2 = (j > j2 ? 1 : (j == j2 ? 0 : -1));
            if (i2 == 0) {
                return j2;
            }
            if (i2 < 0) {
                CuesWithTiming cuesWithTiming = this.cuesWithTimingList.get(i - 1);
                long j3 = cuesWithTiming.endTimeUs;
                if (j3 == -9223372036854775807L || j3 > j) {
                    return cuesWithTiming.startTimeUs;
                }
                return j3;
            }
        }
        CuesWithTiming cuesWithTiming2 = (CuesWithTiming) Iterables.getLast(this.cuesWithTimingList);
        long j4 = cuesWithTiming2.endTimeUs;
        if (j4 == -9223372036854775807L || j < j4) {
            return cuesWithTiming2.startTimeUs;
        }
        return j4;
    }
}
