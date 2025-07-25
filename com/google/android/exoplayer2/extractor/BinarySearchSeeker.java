package com.google.android.exoplayer2.extractor;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.extractor.SeekMap;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.io.IOException;

/* loaded from: classes4.dex */
public abstract class BinarySearchSeeker {

    /* renamed from: a */
    protected final BinarySearchSeekMap f32858a;

    /* renamed from: b */
    protected final TimestampSeeker f32859b;
    @Nullable

    /* renamed from: c */
    protected SeekOperationParams f32860c;

    /* renamed from: d */
    private final int f32861d;

    /* loaded from: classes4.dex */
    public static class BinarySearchSeekMap implements SeekMap {

        /* renamed from: a */
        private final SeekTimestampConverter f32862a;

        /* renamed from: b */
        private final long f32863b;

        /* renamed from: c */
        private final long f32864c;

        /* renamed from: d */
        private final long f32865d;

        /* renamed from: e */
        private final long f32866e;

        /* renamed from: f */
        private final long f32867f;

        /* renamed from: g */
        private final long f32868g;

        public BinarySearchSeekMap(SeekTimestampConverter seekTimestampConverter, long j, long j2, long j3, long j4, long j5, long j6) {
            this.f32862a = seekTimestampConverter;
            this.f32863b = j;
            this.f32864c = j2;
            this.f32865d = j3;
            this.f32866e = j4;
            this.f32867f = j5;
            this.f32868g = j6;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public long getDurationUs() {
            return this.f32863b;
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public SeekMap.SeekPoints getSeekPoints(long j) {
            return new SeekMap.SeekPoints(new SeekPoint(j, SeekOperationParams.m74749h(this.f32862a.timeUsToTargetTime(j), this.f32864c, this.f32865d, this.f32866e, this.f32867f, this.f32868g)));
        }

        @Override // com.google.android.exoplayer2.extractor.SeekMap
        public boolean isSeekable() {
            return true;
        }

        public long timeUsToTargetTime(long j) {
            return this.f32862a.timeUsToTargetTime(j);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public static class SeekOperationParams {

        /* renamed from: a */
        private final long f32869a;

        /* renamed from: b */
        private final long f32870b;

        /* renamed from: c */
        private final long f32871c;

        /* renamed from: d */
        private long f32872d;

        /* renamed from: e */
        private long f32873e;

        /* renamed from: f */
        private long f32874f;

        /* renamed from: g */
        private long f32875g;

        /* renamed from: h */
        private long f32876h;

        protected SeekOperationParams(long j, long j2, long j3, long j4, long j5, long j6, long j7) {
            this.f32869a = j;
            this.f32870b = j2;
            this.f32872d = j3;
            this.f32873e = j4;
            this.f32874f = j5;
            this.f32875g = j6;
            this.f32871c = j7;
            this.f32876h = m74749h(j2, j3, j4, j5, j6, j7);
        }

        /* renamed from: h */
        protected static long m74749h(long j, long j2, long j3, long j4, long j5, long j6) {
            if (j4 + 1 < j5 && j2 + 1 < j3) {
                long j7 = ((float) (j - j2)) * (((float) (j5 - j4)) / ((float) (j3 - j2)));
                return Util.constrainValue(((j7 + j4) - j6) - (j7 / 20), j4, j5 - 1);
            }
            return j4;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: i */
        public long m74748i() {
            return this.f32875g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: j */
        public long m74747j() {
            return this.f32874f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: k */
        public long m74746k() {
            return this.f32876h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: l */
        public long m74745l() {
            return this.f32869a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: m */
        public long m74744m() {
            return this.f32870b;
        }

        /* renamed from: n */
        private void m74743n() {
            this.f32876h = m74749h(this.f32870b, this.f32872d, this.f32873e, this.f32874f, this.f32875g, this.f32871c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: o */
        public void m74742o(long j, long j2) {
            this.f32873e = j;
            this.f32875g = j2;
            m74743n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public void m74741p(long j, long j2) {
            this.f32872d = j;
            this.f32874f = j2;
            m74743n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public interface SeekTimestampConverter {
        long timeUsToTargetTime(long j);
    }

    /* loaded from: classes4.dex */
    public static final class TimestampSearchResult {
        public static final TimestampSearchResult NO_TIMESTAMP_IN_RANGE_RESULT = new TimestampSearchResult(-3, -9223372036854775807L, -1);
        public static final int TYPE_NO_TIMESTAMP = -3;
        public static final int TYPE_POSITION_OVERESTIMATED = -1;
        public static final int TYPE_POSITION_UNDERESTIMATED = -2;
        public static final int TYPE_TARGET_TIMESTAMP_FOUND = 0;

        /* renamed from: a */
        private final int f32877a;

        /* renamed from: b */
        private final long f32878b;

        /* renamed from: c */
        private final long f32879c;

        private TimestampSearchResult(int i, long j, long j2) {
            this.f32877a = i;
            this.f32878b = j;
            this.f32879c = j2;
        }

        public static TimestampSearchResult overestimatedResult(long j, long j2) {
            return new TimestampSearchResult(-1, j, j2);
        }

        public static TimestampSearchResult targetFoundResult(long j) {
            return new TimestampSearchResult(0, -9223372036854775807L, j);
        }

        public static TimestampSearchResult underestimatedResult(long j, long j2) {
            return new TimestampSearchResult(-2, j, j2);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public BinarySearchSeeker(SeekTimestampConverter seekTimestampConverter, TimestampSeeker timestampSeeker, long j, long j2, long j3, long j4, long j5, long j6, int i) {
        this.f32859b = timestampSeeker;
        this.f32861d = i;
        this.f32858a = new BinarySearchSeekMap(seekTimestampConverter, j, j2, j3, j4, j5, j6);
    }

    /* renamed from: a */
    protected SeekOperationParams m74766a(long j) {
        return new SeekOperationParams(j, this.f32858a.timeUsToTargetTime(j), this.f32858a.f32864c, this.f32858a.f32865d, this.f32858a.f32866e, this.f32858a.f32867f, this.f32858a.f32868g);
    }

    /* renamed from: b */
    protected final void m74765b(boolean z, long j) {
        this.f32860c = null;
        this.f32859b.onSeekFinished();
        m74764c(z, j);
    }

    /* renamed from: d */
    protected final int m74763d(ExtractorInput extractorInput, long j, PositionHolder positionHolder) {
        if (j == extractorInput.getPosition()) {
            return 0;
        }
        positionHolder.position = j;
        return 1;
    }

    /* renamed from: e */
    protected final boolean m74762e(ExtractorInput extractorInput, long j) throws IOException {
        long position = j - extractorInput.getPosition();
        if (position >= 0 && position <= 262144) {
            extractorInput.skipFully((int) position);
            return true;
        }
        return false;
    }

    public final SeekMap getSeekMap() {
        return this.f32858a;
    }

    public int handlePendingSeek(ExtractorInput extractorInput, PositionHolder positionHolder) throws IOException {
        while (true) {
            SeekOperationParams seekOperationParams = (SeekOperationParams) Assertions.checkStateNotNull(this.f32860c);
            long m74747j = seekOperationParams.m74747j();
            long m74748i = seekOperationParams.m74748i();
            long m74746k = seekOperationParams.m74746k();
            if (m74748i - m74747j <= this.f32861d) {
                m74765b(false, m74747j);
                return m74763d(extractorInput, m74747j, positionHolder);
            } else if (!m74762e(extractorInput, m74746k)) {
                return m74763d(extractorInput, m74746k, positionHolder);
            } else {
                extractorInput.resetPeekPosition();
                TimestampSearchResult searchForTimestamp = this.f32859b.searchForTimestamp(extractorInput, seekOperationParams.m74744m());
                int i = searchForTimestamp.f32877a;
                if (i != -3) {
                    if (i == -2) {
                        seekOperationParams.m74741p(searchForTimestamp.f32878b, searchForTimestamp.f32879c);
                    } else if (i == -1) {
                        seekOperationParams.m74742o(searchForTimestamp.f32878b, searchForTimestamp.f32879c);
                    } else if (i == 0) {
                        m74762e(extractorInput, searchForTimestamp.f32879c);
                        m74765b(true, searchForTimestamp.f32879c);
                        return m74763d(extractorInput, searchForTimestamp.f32879c, positionHolder);
                    } else {
                        throw new IllegalStateException("Invalid case");
                    }
                } else {
                    m74765b(false, m74746k);
                    return m74763d(extractorInput, m74746k, positionHolder);
                }
            }
        }
    }

    public final boolean isSeeking() {
        if (this.f32860c != null) {
            return true;
        }
        return false;
    }

    public final void setSeekTargetUs(long j) {
        SeekOperationParams seekOperationParams = this.f32860c;
        if (seekOperationParams != null && seekOperationParams.m74745l() == j) {
            return;
        }
        this.f32860c = m74766a(j);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes4.dex */
    public interface TimestampSeeker {
        TimestampSearchResult searchForTimestamp(ExtractorInput extractorInput, long j) throws IOException;

        default void onSeekFinished() {
        }
    }

    /* loaded from: classes4.dex */
    public static final class DefaultSeekTimestampConverter implements SeekTimestampConverter {
        @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
        public long timeUsToTargetTime(long j) {
            return j;
        }
    }

    /* renamed from: c */
    protected void m74764c(boolean z, long j) {
    }
}
