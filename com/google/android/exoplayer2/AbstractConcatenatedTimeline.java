package com.google.android.exoplayer2;

import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ShuffleOrder;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public abstract class AbstractConcatenatedTimeline extends Timeline {

    /* renamed from: f */
    private final int f31328f;

    /* renamed from: g */
    private final ShuffleOrder f31329g;

    /* renamed from: h */
    private final boolean f31330h;

    public AbstractConcatenatedTimeline(boolean z, ShuffleOrder shuffleOrder) {
        this.f31330h = z;
        this.f31329g = shuffleOrder;
        this.f31328f = shuffleOrder.getLength();
    }

    public static Object getChildPeriodUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).second;
    }

    public static Object getChildTimelineUidFromConcatenatedUid(Object obj) {
        return ((Pair) obj).first;
    }

    public static Object getConcatenatedUid(Object obj, Object obj2) {
        return Pair.create(obj, obj2);
    }

    /* renamed from: k */
    private int m76130k(int i, boolean z) {
        if (z) {
            return this.f31329g.getNextIndex(i);
        }
        if (i < this.f31328f - 1) {
            return i + 1;
        }
        return -1;
    }

    /* renamed from: l */
    private int m76129l(int i, boolean z) {
        if (z) {
            return this.f31329g.getPreviousIndex(i);
        }
        if (i > 0) {
            return i - 1;
        }
        return -1;
    }

    /* renamed from: e */
    protected abstract int mo73820e(Object obj);

    /* renamed from: f */
    protected abstract int mo73819f(int i);

    /* renamed from: g */
    protected abstract int mo73818g(int i);

    @Override // com.google.android.exoplayer2.Timeline
    public int getFirstWindowIndex(boolean z) {
        if (this.f31328f == 0) {
            return -1;
        }
        int i = 0;
        if (this.f31330h) {
            z = false;
        }
        if (z) {
            i = this.f31329g.getFirstIndex();
        }
        while (mo73814m(i).isEmpty()) {
            i = m76130k(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo73815j(i) + mo73814m(i).getFirstWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final int getIndexOfPeriod(Object obj) {
        int indexOfPeriod;
        if (!(obj instanceof Pair)) {
            return -1;
        }
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int mo73820e = mo73820e(childTimelineUidFromConcatenatedUid);
        if (mo73820e == -1 || (indexOfPeriod = mo73814m(mo73820e).getIndexOfPeriod(childPeriodUidFromConcatenatedUid)) == -1) {
            return -1;
        }
        return mo73816i(mo73820e) + indexOfPeriod;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getLastWindowIndex(boolean z) {
        int i;
        int i2 = this.f31328f;
        if (i2 == 0) {
            return -1;
        }
        if (this.f31330h) {
            z = false;
        }
        if (z) {
            i = this.f31329g.getLastIndex();
        } else {
            i = i2 - 1;
        }
        while (mo73814m(i).isEmpty()) {
            i = m76129l(i, z);
            if (i == -1) {
                return -1;
            }
        }
        return mo73815j(i) + mo73814m(i).getLastWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getNextWindowIndex(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f31330h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int mo73818g = mo73818g(i);
        int mo73815j = mo73815j(mo73818g);
        Timeline mo73814m = mo73814m(mo73818g);
        int i4 = i - mo73815j;
        if (i2 != 2) {
            i3 = i2;
        }
        int nextWindowIndex = mo73814m.getNextWindowIndex(i4, i3, z);
        if (nextWindowIndex != -1) {
            return mo73815j + nextWindowIndex;
        }
        int m76130k = m76130k(mo73818g, z);
        while (m76130k != -1 && mo73814m(m76130k).isEmpty()) {
            m76130k = m76130k(m76130k, z);
        }
        if (m76130k != -1) {
            return mo73815j(m76130k) + mo73814m(m76130k).getFirstWindowIndex(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return getFirstWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        int mo73819f = mo73819f(i);
        int mo73815j = mo73815j(mo73819f);
        mo73814m(mo73819f).getPeriod(i - mo73816i(mo73819f), period, z);
        period.windowIndex += mo73815j;
        if (z) {
            period.uid = getConcatenatedUid(mo73817h(mo73819f), Assertions.checkNotNull(period.uid));
        }
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Period getPeriodByUid(Object obj, Timeline.Period period) {
        Object childTimelineUidFromConcatenatedUid = getChildTimelineUidFromConcatenatedUid(obj);
        Object childPeriodUidFromConcatenatedUid = getChildPeriodUidFromConcatenatedUid(obj);
        int mo73820e = mo73820e(childTimelineUidFromConcatenatedUid);
        int mo73815j = mo73815j(mo73820e);
        mo73814m(mo73820e).getPeriodByUid(childPeriodUidFromConcatenatedUid, period);
        period.windowIndex += mo73815j;
        period.uid = obj;
        return period;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        int i3 = 0;
        if (this.f31330h) {
            if (i2 == 1) {
                i2 = 2;
            }
            z = false;
        }
        int mo73818g = mo73818g(i);
        int mo73815j = mo73815j(mo73818g);
        Timeline mo73814m = mo73814m(mo73818g);
        int i4 = i - mo73815j;
        if (i2 != 2) {
            i3 = i2;
        }
        int previousWindowIndex = mo73814m.getPreviousWindowIndex(i4, i3, z);
        if (previousWindowIndex != -1) {
            return mo73815j + previousWindowIndex;
        }
        int m76129l = m76129l(mo73818g, z);
        while (m76129l != -1 && mo73814m(m76129l).isEmpty()) {
            m76129l = m76129l(m76129l, z);
        }
        if (m76129l != -1) {
            return mo73815j(m76129l) + mo73814m(m76129l).getLastWindowIndex(z);
        }
        if (i2 != 2) {
            return -1;
        }
        return getLastWindowIndex(z);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Object getUidOfPeriod(int i) {
        int mo73819f = mo73819f(i);
        return getConcatenatedUid(mo73817h(mo73819f), mo73814m(mo73819f).getUidOfPeriod(i - mo73816i(mo73819f)));
    }

    @Override // com.google.android.exoplayer2.Timeline
    public final Timeline.Window getWindow(int i, Timeline.Window window, long j) {
        int mo73818g = mo73818g(i);
        int mo73815j = mo73815j(mo73818g);
        int mo73816i = mo73816i(mo73818g);
        mo73814m(mo73818g).getWindow(i - mo73815j, window, j);
        Object mo73817h = mo73817h(mo73818g);
        if (!Timeline.Window.SINGLE_WINDOW_UID.equals(window.uid)) {
            mo73817h = getConcatenatedUid(mo73817h, window.uid);
        }
        window.uid = mo73817h;
        window.firstPeriodIndex += mo73816i;
        window.lastPeriodIndex += mo73816i;
        return window;
    }

    /* renamed from: h */
    protected abstract Object mo73817h(int i);

    /* renamed from: i */
    protected abstract int mo73816i(int i);

    /* renamed from: j */
    protected abstract int mo73815j(int i);

    /* renamed from: m */
    protected abstract Timeline mo73814m(int i);
}
