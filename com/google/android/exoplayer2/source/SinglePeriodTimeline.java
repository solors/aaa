package com.google.android.exoplayer2.source;

import android.net.Uri;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Assertions;

/* loaded from: classes4.dex */
public final class SinglePeriodTimeline extends Timeline {

    /* renamed from: s */
    private static final Object f34430s = new Object();

    /* renamed from: t */
    private static final MediaItem f34431t = new MediaItem.Builder().setMediaId("SinglePeriodTimeline").setUri(Uri.EMPTY).build();

    /* renamed from: f */
    private final long f34432f;

    /* renamed from: g */
    private final long f34433g;

    /* renamed from: h */
    private final long f34434h;

    /* renamed from: i */
    private final long f34435i;

    /* renamed from: j */
    private final long f34436j;

    /* renamed from: k */
    private final long f34437k;

    /* renamed from: l */
    private final long f34438l;

    /* renamed from: m */
    private final boolean f34439m;

    /* renamed from: n */
    private final boolean f34440n;

    /* renamed from: o */
    private final boolean f34441o;
    @Nullable

    /* renamed from: p */
    private final Object f34442p;
    @Nullable

    /* renamed from: q */
    private final MediaItem f34443q;
    @Nullable

    /* renamed from: r */
    private final MediaItem.LiveConfiguration f34444r;

    @Deprecated
    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, @Nullable Object obj, @Nullable Object obj2) {
        this(j, j, 0L, 0L, z, z2, z3, obj, obj2);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getIndexOfPeriod(Object obj) {
        if (f34430s.equals(obj)) {
            return 0;
        }
        return -1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Timeline.Period getPeriod(int i, Timeline.Period period, boolean z) {
        Object obj;
        Assertions.checkIndex(i, 0, 1);
        if (z) {
            obj = f34430s;
        } else {
            obj = null;
        }
        return period.set(null, obj, 0, this.f34435i, -this.f34437k);
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getPeriodCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.Timeline
    public Object getUidOfPeriod(int i) {
        Assertions.checkIndex(i, 0, 1);
        return f34430s;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
        if (r1 > r3) goto L9;
     */
    @Override // com.google.android.exoplayer2.Timeline
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.Timeline.Window getWindow(int r25, com.google.android.exoplayer2.Timeline.Window r26, long r27) {
        /*
            r24 = this;
            r0 = r24
            r1 = 0
            r2 = 1
            r3 = r25
            com.google.android.exoplayer2.util.Assertions.checkIndex(r3, r1, r2)
            long r1 = r0.f34438l
            boolean r14 = r0.f34440n
            if (r14 == 0) goto L2e
            boolean r3 = r0.f34441o
            if (r3 != 0) goto L2e
            r3 = 0
            int r3 = (r27 > r3 ? 1 : (r27 == r3 ? 0 : -1))
            if (r3 == 0) goto L2e
            long r3 = r0.f34436j
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L27
        L24:
            r16 = r5
            goto L30
        L27:
            long r1 = r1 + r27
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L2e
            goto L24
        L2e:
            r16 = r1
        L30:
            java.lang.Object r4 = com.google.android.exoplayer2.Timeline.Window.SINGLE_WINDOW_UID
            com.google.android.exoplayer2.MediaItem r5 = r0.f34443q
            java.lang.Object r6 = r0.f34442p
            long r7 = r0.f34432f
            long r9 = r0.f34433g
            long r11 = r0.f34434h
            boolean r13 = r0.f34439m
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r15 = r0.f34444r
            long r1 = r0.f34436j
            r18 = r1
            r20 = 0
            r21 = 0
            long r1 = r0.f34437k
            r22 = r1
            r3 = r26
            com.google.android.exoplayer2.Timeline$Window r1 = r3.set(r4, r5, r6, r7, r9, r11, r13, r14, r15, r16, r18, r20, r21, r22)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.SinglePeriodTimeline.getWindow(int, com.google.android.exoplayer2.Timeline$Window, long):com.google.android.exoplayer2.Timeline$Window");
    }

    @Override // com.google.android.exoplayer2.Timeline
    public int getWindowCount() {
        return 1;
    }

    public SinglePeriodTimeline(long j, boolean z, boolean z2, boolean z3, @Nullable Object obj, MediaItem mediaItem) {
        this(j, j, 0L, 0L, z, z2, z3, obj, mediaItem);
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @Nullable Object obj, @Nullable Object obj2) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, z3, obj, obj2);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3, @Nullable Object obj, MediaItem mediaItem) {
        this(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, j, j2, j3, j4, z, z2, false, obj, mediaItem, z3 ? mediaItem.liveConfiguration : null);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public SinglePeriodTimeline(long r22, long r24, long r26, long r28, long r30, long r32, long r34, boolean r36, boolean r37, boolean r38, @androidx.annotation.Nullable java.lang.Object r39, @androidx.annotation.Nullable java.lang.Object r40) {
        /*
            r21 = this;
            r17 = 0
            com.google.android.exoplayer2.MediaItem r0 = com.google.android.exoplayer2.source.SinglePeriodTimeline.f34431t
            com.google.android.exoplayer2.MediaItem$Builder r1 = r0.buildUpon()
            r2 = r40
            com.google.android.exoplayer2.MediaItem$Builder r1 = r1.setTag(r2)
            com.google.android.exoplayer2.MediaItem r19 = r1.build()
            if (r38 == 0) goto L17
            com.google.android.exoplayer2.MediaItem$LiveConfiguration r0 = r0.liveConfiguration
            goto L18
        L17:
            r0 = 0
        L18:
            r20 = r0
            r0 = r21
            r1 = r22
            r3 = r24
            r5 = r26
            r7 = r28
            r9 = r30
            r11 = r32
            r13 = r34
            r15 = r36
            r16 = r37
            r18 = r39
            r0.<init>(r1, r3, r5, r7, r9, r11, r13, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.SinglePeriodTimeline.<init>(long, long, long, long, long, long, long, boolean, boolean, boolean, java.lang.Object, java.lang.Object):void");
    }

    @Deprecated
    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this(j, j2, j3, j4, j5, j6, j7, z, z2, false, obj, mediaItem, liveConfiguration);
    }

    public SinglePeriodTimeline(long j, long j2, long j3, long j4, long j5, long j6, long j7, boolean z, boolean z2, boolean z3, @Nullable Object obj, MediaItem mediaItem, @Nullable MediaItem.LiveConfiguration liveConfiguration) {
        this.f34432f = j;
        this.f34433g = j2;
        this.f34434h = j3;
        this.f34435i = j4;
        this.f34436j = j5;
        this.f34437k = j6;
        this.f34438l = j7;
        this.f34439m = z;
        this.f34440n = z2;
        this.f34441o = z3;
        this.f34442p = obj;
        this.f34443q = (MediaItem) Assertions.checkNotNull(mediaItem);
        this.f34444r = liveConfiguration;
    }
}
