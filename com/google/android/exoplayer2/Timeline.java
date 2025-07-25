package com.google.android.exoplayer2;

import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.util.Pair;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.MediaItem;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.InlineMe;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public abstract class Timeline implements Bundleable {
    public static final Timeline EMPTY = new Timeline() { // from class: com.google.android.exoplayer2.Timeline.1
        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            return -1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i, Period period, boolean z) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return 0;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i, Window window, long j) {
            throw new IndexOutOfBoundsException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return 0;
        }
    };

    /* renamed from: b */
    private static final String f31996b = Util.intToStringMaxRadix(0);

    /* renamed from: c */
    private static final String f31997c = Util.intToStringMaxRadix(1);

    /* renamed from: d */
    private static final String f31998d = Util.intToStringMaxRadix(2);
    public static final Bundleable.Creator<Timeline> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.b5
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return Timeline.m75316a(bundle);
        }
    };

    /* loaded from: classes4.dex */
    public static final class Period implements Bundleable {

        /* renamed from: b */
        private AdPlaybackState f32004b = AdPlaybackState.NONE;
        public long durationUs;
        @Nullable

        /* renamed from: id */
        public Object f32005id;
        public boolean isPlaceholder;
        public long positionInWindowUs;
        @Nullable
        public Object uid;
        public int windowIndex;

        /* renamed from: c */
        private static final String f31999c = Util.intToStringMaxRadix(0);

        /* renamed from: d */
        private static final String f32000d = Util.intToStringMaxRadix(1);

        /* renamed from: f */
        private static final String f32001f = Util.intToStringMaxRadix(2);

        /* renamed from: g */
        private static final String f32002g = Util.intToStringMaxRadix(3);

        /* renamed from: h */
        private static final String f32003h = Util.intToStringMaxRadix(4);
        public static final Bundleable.Creator<Period> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.c5
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Timeline.Period.m75312a(bundle);
            }
        };

        /* renamed from: a */
        public static /* synthetic */ Period m75312a(Bundle bundle) {
            return m75310c(bundle);
        }

        /* renamed from: c */
        public static Period m75310c(Bundle bundle) {
            AdPlaybackState adPlaybackState;
            int i = bundle.getInt(f31999c, 0);
            long j = bundle.getLong(f32000d, -9223372036854775807L);
            long j2 = bundle.getLong(f32001f, 0L);
            boolean z = bundle.getBoolean(f32002g, false);
            Bundle bundle2 = bundle.getBundle(f32003h);
            if (bundle2 != null) {
                adPlaybackState = AdPlaybackState.CREATOR.fromBundle(bundle2);
            } else {
                adPlaybackState = AdPlaybackState.NONE;
            }
            AdPlaybackState adPlaybackState2 = adPlaybackState;
            Period period = new Period();
            period.set(null, null, i, j, j2, adPlaybackState2, z);
            return period;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Period.class.equals(obj.getClass())) {
                return false;
            }
            Period period = (Period) obj;
            if (Util.areEqual(this.f32005id, period.f32005id) && Util.areEqual(this.uid, period.uid) && this.windowIndex == period.windowIndex && this.durationUs == period.durationUs && this.positionInWindowUs == period.positionInWindowUs && this.isPlaceholder == period.isPlaceholder && Util.areEqual(this.f32004b, period.f32004b)) {
                return true;
            }
            return false;
        }

        public int getAdCountInAdGroup(int i) {
            return this.f32004b.getAdGroup(i).count;
        }

        public long getAdDurationUs(int i, int i2) {
            AdPlaybackState.AdGroup adGroup = this.f32004b.getAdGroup(i);
            if (adGroup.count != -1) {
                return adGroup.durationsUs[i2];
            }
            return -9223372036854775807L;
        }

        public int getAdGroupCount() {
            return this.f32004b.adGroupCount;
        }

        public int getAdGroupIndexAfterPositionUs(long j) {
            return this.f32004b.getAdGroupIndexAfterPositionUs(j, this.durationUs);
        }

        public int getAdGroupIndexForPositionUs(long j) {
            return this.f32004b.getAdGroupIndexForPositionUs(j, this.durationUs);
        }

        public long getAdGroupTimeUs(int i) {
            return this.f32004b.getAdGroup(i).timeUs;
        }

        public long getAdResumePositionUs() {
            return this.f32004b.adResumePositionUs;
        }

        public int getAdState(int i, int i2) {
            AdPlaybackState.AdGroup adGroup = this.f32004b.getAdGroup(i);
            if (adGroup.count != -1) {
                return adGroup.states[i2];
            }
            return 0;
        }

        @Nullable
        public Object getAdsId() {
            return this.f32004b.adsId;
        }

        public long getContentResumeOffsetUs(int i) {
            return this.f32004b.getAdGroup(i).contentResumeOffsetUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public int getFirstAdIndexToPlay(int i) {
            return this.f32004b.getAdGroup(i).getFirstAdIndexToPlay();
        }

        public int getNextAdIndexToPlay(int i, int i2) {
            return this.f32004b.getAdGroup(i).getNextAdIndexToPlay(i2);
        }

        public long getPositionInWindowMs() {
            return Util.usToMs(this.positionInWindowUs);
        }

        public long getPositionInWindowUs() {
            return this.positionInWindowUs;
        }

        public int getRemovedAdGroupCount() {
            return this.f32004b.removedAdGroupCount;
        }

        public boolean hasPlayedAdGroup(int i) {
            return !this.f32004b.getAdGroup(i).hasUnplayedAds();
        }

        public int hashCode() {
            int hashCode;
            Object obj = this.f32005id;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (217 + hashCode) * 31;
            Object obj2 = this.uid;
            if (obj2 != null) {
                i = obj2.hashCode();
            }
            long j = this.durationUs;
            long j2 = this.positionInWindowUs;
            return ((((((((((i2 + i) * 31) + this.windowIndex) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + this.f32004b.hashCode();
        }

        public boolean isServerSideInsertedAdGroup(int i) {
            return this.f32004b.getAdGroup(i).isServerSideInserted;
        }

        @CanIgnoreReturnValue
        public Period set(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2) {
            return set(obj, obj2, i, j, j2, AdPlaybackState.NONE, false);
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            int i = this.windowIndex;
            if (i != 0) {
                bundle.putInt(f31999c, i);
            }
            long j = this.durationUs;
            if (j != -9223372036854775807L) {
                bundle.putLong(f32000d, j);
            }
            long j2 = this.positionInWindowUs;
            if (j2 != 0) {
                bundle.putLong(f32001f, j2);
            }
            boolean z = this.isPlaceholder;
            if (z) {
                bundle.putBoolean(f32002g, z);
            }
            if (!this.f32004b.equals(AdPlaybackState.NONE)) {
                bundle.putBundle(f32003h, this.f32004b.toBundle());
            }
            return bundle;
        }

        @CanIgnoreReturnValue
        public Period set(@Nullable Object obj, @Nullable Object obj2, int i, long j, long j2, AdPlaybackState adPlaybackState, boolean z) {
            this.f32005id = obj;
            this.uid = obj2;
            this.windowIndex = i;
            this.durationUs = j;
            this.positionInWindowUs = j2;
            this.f32004b = adPlaybackState;
            this.isPlaceholder = z;
            return this;
        }
    }

    /* loaded from: classes4.dex */
    public static final class RemotableTimeline extends Timeline {

        /* renamed from: f */
        private final ImmutableList<Window> f32006f;

        /* renamed from: g */
        private final ImmutableList<Period> f32007g;

        /* renamed from: h */
        private final int[] f32008h;

        /* renamed from: i */
        private final int[] f32009i;

        public RemotableTimeline(ImmutableList<Window> immutableList, ImmutableList<Period> immutableList2, int[] iArr) {
            boolean z;
            if (immutableList.size() == iArr.length) {
                z = true;
            } else {
                z = false;
            }
            Assertions.checkArgument(z);
            this.f32006f = immutableList;
            this.f32007g = immutableList2;
            this.f32008h = iArr;
            this.f32009i = new int[iArr.length];
            for (int i = 0; i < iArr.length; i++) {
                this.f32009i[iArr[i]] = i;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getFirstWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (!z) {
                return 0;
            }
            return this.f32008h[0];
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getIndexOfPeriod(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getLastWindowIndex(boolean z) {
            if (isEmpty()) {
                return -1;
            }
            if (z) {
                return this.f32008h[getWindowCount() - 1];
            }
            return getWindowCount() - 1;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getNextWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == getLastWindowIndex(z)) {
                if (i2 == 2) {
                    return getFirstWindowIndex(z);
                }
                return -1;
            } else if (z) {
                return this.f32008h[this.f32009i[i] + 1];
            } else {
                return i + 1;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Period getPeriod(int i, Period period, boolean z) {
            Period period2 = this.f32007g.get(i);
            period.set(period2.f32005id, period2.uid, period2.windowIndex, period2.durationUs, period2.positionInWindowUs, period2.f32004b, period2.isPlaceholder);
            return period;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPeriodCount() {
            return this.f32007g.size();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getPreviousWindowIndex(int i, int i2, boolean z) {
            if (i2 == 1) {
                return i;
            }
            if (i == getFirstWindowIndex(z)) {
                if (i2 == 2) {
                    return getLastWindowIndex(z);
                }
                return -1;
            } else if (z) {
                return this.f32008h[this.f32009i[i] - 1];
            } else {
                return i - 1;
            }
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Object getUidOfPeriod(int i) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.android.exoplayer2.Timeline
        public Window getWindow(int i, Window window, long j) {
            Window window2 = this.f32006f.get(i);
            window.set(window2.uid, window2.mediaItem, window2.manifest, window2.presentationStartTimeMs, window2.windowStartTimeMs, window2.elapsedRealtimeEpochOffsetMs, window2.isSeekable, window2.isDynamic, window2.liveConfiguration, window2.defaultPositionUs, window2.durationUs, window2.firstPeriodIndex, window2.lastPeriodIndex, window2.positionInFirstPeriodUs);
            window.isPlaceholder = window2.isPlaceholder;
            return window;
        }

        @Override // com.google.android.exoplayer2.Timeline
        public int getWindowCount() {
            return this.f32006f.size();
        }
    }

    /* loaded from: classes4.dex */
    public static final class Window implements Bundleable {
        public long defaultPositionUs;
        public long durationUs;
        public long elapsedRealtimeEpochOffsetMs;
        public int firstPeriodIndex;
        public boolean isDynamic;
        @Deprecated
        public boolean isLive;
        public boolean isPlaceholder;
        public boolean isSeekable;
        public int lastPeriodIndex;
        @Nullable
        public MediaItem.LiveConfiguration liveConfiguration;
        @Nullable
        public Object manifest;
        public long positionInFirstPeriodUs;
        public long presentationStartTimeMs;
        @Nullable
        @Deprecated
        public Object tag;
        public long windowStartTimeMs;
        public static final Object SINGLE_WINDOW_UID = new Object();

        /* renamed from: b */
        private static final Object f32010b = new Object();

        /* renamed from: c */
        private static final MediaItem f32011c = new MediaItem.Builder().setMediaId("com.google.android.exoplayer2.Timeline").setUri(Uri.EMPTY).build();

        /* renamed from: d */
        private static final String f32012d = Util.intToStringMaxRadix(1);

        /* renamed from: f */
        private static final String f32013f = Util.intToStringMaxRadix(2);

        /* renamed from: g */
        private static final String f32014g = Util.intToStringMaxRadix(3);

        /* renamed from: h */
        private static final String f32015h = Util.intToStringMaxRadix(4);

        /* renamed from: i */
        private static final String f32016i = Util.intToStringMaxRadix(5);

        /* renamed from: j */
        private static final String f32017j = Util.intToStringMaxRadix(6);

        /* renamed from: k */
        private static final String f32018k = Util.intToStringMaxRadix(7);

        /* renamed from: l */
        private static final String f32019l = Util.intToStringMaxRadix(8);

        /* renamed from: m */
        private static final String f32020m = Util.intToStringMaxRadix(9);

        /* renamed from: n */
        private static final String f32021n = Util.intToStringMaxRadix(10);

        /* renamed from: o */
        private static final String f32022o = Util.intToStringMaxRadix(11);

        /* renamed from: p */
        private static final String f32023p = Util.intToStringMaxRadix(12);

        /* renamed from: q */
        private static final String f32024q = Util.intToStringMaxRadix(13);
        public static final Bundleable.Creator<Window> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.d5
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return Timeline.Window.m75309a(bundle);
            }
        };
        public Object uid = SINGLE_WINDOW_UID;
        public MediaItem mediaItem = f32011c;

        /* renamed from: a */
        public static /* synthetic */ Window m75309a(Bundle bundle) {
            return m75308b(bundle);
        }

        /* renamed from: b */
        public static Window m75308b(Bundle bundle) {
            MediaItem mediaItem;
            MediaItem.LiveConfiguration liveConfiguration;
            Bundle bundle2 = bundle.getBundle(f32012d);
            if (bundle2 != null) {
                mediaItem = MediaItem.CREATOR.fromBundle(bundle2);
            } else {
                mediaItem = MediaItem.EMPTY;
            }
            MediaItem mediaItem2 = mediaItem;
            long j = bundle.getLong(f32013f, -9223372036854775807L);
            long j2 = bundle.getLong(f32014g, -9223372036854775807L);
            long j3 = bundle.getLong(f32015h, -9223372036854775807L);
            boolean z = bundle.getBoolean(f32016i, false);
            boolean z2 = bundle.getBoolean(f32017j, false);
            Bundle bundle3 = bundle.getBundle(f32018k);
            if (bundle3 != null) {
                liveConfiguration = MediaItem.LiveConfiguration.CREATOR.fromBundle(bundle3);
            } else {
                liveConfiguration = null;
            }
            MediaItem.LiveConfiguration liveConfiguration2 = liveConfiguration;
            boolean z3 = bundle.getBoolean(f32019l, false);
            long j4 = bundle.getLong(f32020m, 0L);
            long j5 = bundle.getLong(f32021n, -9223372036854775807L);
            int i = bundle.getInt(f32022o, 0);
            int i2 = bundle.getInt(f32023p, 0);
            long j6 = bundle.getLong(f32024q, 0L);
            Window window = new Window();
            window.set(f32010b, mediaItem2, null, j, j2, j3, z, z2, liveConfiguration2, j4, j5, i, i2, j6);
            window.isPlaceholder = z3;
            return window;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || !Window.class.equals(obj.getClass())) {
                return false;
            }
            Window window = (Window) obj;
            if (Util.areEqual(this.uid, window.uid) && Util.areEqual(this.mediaItem, window.mediaItem) && Util.areEqual(this.manifest, window.manifest) && Util.areEqual(this.liveConfiguration, window.liveConfiguration) && this.presentationStartTimeMs == window.presentationStartTimeMs && this.windowStartTimeMs == window.windowStartTimeMs && this.elapsedRealtimeEpochOffsetMs == window.elapsedRealtimeEpochOffsetMs && this.isSeekable == window.isSeekable && this.isDynamic == window.isDynamic && this.isPlaceholder == window.isPlaceholder && this.defaultPositionUs == window.defaultPositionUs && this.durationUs == window.durationUs && this.firstPeriodIndex == window.firstPeriodIndex && this.lastPeriodIndex == window.lastPeriodIndex && this.positionInFirstPeriodUs == window.positionInFirstPeriodUs) {
                return true;
            }
            return false;
        }

        public long getCurrentUnixTimeMs() {
            return Util.getNowUnixTimeMs(this.elapsedRealtimeEpochOffsetMs);
        }

        public long getDefaultPositionMs() {
            return Util.usToMs(this.defaultPositionUs);
        }

        public long getDefaultPositionUs() {
            return this.defaultPositionUs;
        }

        public long getDurationMs() {
            return Util.usToMs(this.durationUs);
        }

        public long getDurationUs() {
            return this.durationUs;
        }

        public long getPositionInFirstPeriodMs() {
            return Util.usToMs(this.positionInFirstPeriodUs);
        }

        public long getPositionInFirstPeriodUs() {
            return this.positionInFirstPeriodUs;
        }

        public int hashCode() {
            int hashCode;
            int hashCode2 = (((217 + this.uid.hashCode()) * 31) + this.mediaItem.hashCode()) * 31;
            Object obj = this.manifest;
            int i = 0;
            if (obj == null) {
                hashCode = 0;
            } else {
                hashCode = obj.hashCode();
            }
            int i2 = (hashCode2 + hashCode) * 31;
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                i = liveConfiguration.hashCode();
            }
            long j = this.presentationStartTimeMs;
            long j2 = this.windowStartTimeMs;
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            long j4 = this.defaultPositionUs;
            long j5 = this.durationUs;
            long j6 = this.positionInFirstPeriodUs;
            return ((((((((((((((((((((((i2 + i) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + ((int) (j3 ^ (j3 >>> 32)))) * 31) + (this.isSeekable ? 1 : 0)) * 31) + (this.isDynamic ? 1 : 0)) * 31) + (this.isPlaceholder ? 1 : 0)) * 31) + ((int) (j4 ^ (j4 >>> 32)))) * 31) + ((int) (j5 ^ (j5 >>> 32)))) * 31) + this.firstPeriodIndex) * 31) + this.lastPeriodIndex) * 31) + ((int) (j6 ^ (j6 >>> 32)));
        }

        public boolean isLive() {
            boolean z;
            boolean z2;
            boolean z3 = this.isLive;
            if (this.liveConfiguration != null) {
                z = true;
            } else {
                z = false;
            }
            if (z3 == z) {
                z2 = true;
            } else {
                z2 = false;
            }
            Assertions.checkState(z2);
            if (this.liveConfiguration != null) {
                return true;
            }
            return false;
        }

        @CanIgnoreReturnValue
        public Window set(Object obj, @Nullable MediaItem mediaItem, @Nullable Object obj2, long j, long j2, long j3, boolean z, boolean z2, @Nullable MediaItem.LiveConfiguration liveConfiguration, long j4, long j5, int i, int i2, long j6) {
            MediaItem mediaItem2;
            Object obj3;
            boolean z3;
            MediaItem.LocalConfiguration localConfiguration;
            this.uid = obj;
            if (mediaItem != null) {
                mediaItem2 = mediaItem;
            } else {
                mediaItem2 = f32011c;
            }
            this.mediaItem = mediaItem2;
            if (mediaItem != null && (localConfiguration = mediaItem.localConfiguration) != null) {
                obj3 = localConfiguration.tag;
            } else {
                obj3 = null;
            }
            this.tag = obj3;
            this.manifest = obj2;
            this.presentationStartTimeMs = j;
            this.windowStartTimeMs = j2;
            this.elapsedRealtimeEpochOffsetMs = j3;
            this.isSeekable = z;
            this.isDynamic = z2;
            if (liveConfiguration != null) {
                z3 = true;
            } else {
                z3 = false;
            }
            this.isLive = z3;
            this.liveConfiguration = liveConfiguration;
            this.defaultPositionUs = j4;
            this.durationUs = j5;
            this.firstPeriodIndex = i;
            this.lastPeriodIndex = i2;
            this.positionInFirstPeriodUs = j6;
            this.isPlaceholder = false;
            return this;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            if (!MediaItem.EMPTY.equals(this.mediaItem)) {
                bundle.putBundle(f32012d, this.mediaItem.toBundle());
            }
            long j = this.presentationStartTimeMs;
            if (j != -9223372036854775807L) {
                bundle.putLong(f32013f, j);
            }
            long j2 = this.windowStartTimeMs;
            if (j2 != -9223372036854775807L) {
                bundle.putLong(f32014g, j2);
            }
            long j3 = this.elapsedRealtimeEpochOffsetMs;
            if (j3 != -9223372036854775807L) {
                bundle.putLong(f32015h, j3);
            }
            boolean z = this.isSeekable;
            if (z) {
                bundle.putBoolean(f32016i, z);
            }
            boolean z2 = this.isDynamic;
            if (z2) {
                bundle.putBoolean(f32017j, z2);
            }
            MediaItem.LiveConfiguration liveConfiguration = this.liveConfiguration;
            if (liveConfiguration != null) {
                bundle.putBundle(f32018k, liveConfiguration.toBundle());
            }
            boolean z3 = this.isPlaceholder;
            if (z3) {
                bundle.putBoolean(f32019l, z3);
            }
            long j4 = this.defaultPositionUs;
            if (j4 != 0) {
                bundle.putLong(f32020m, j4);
            }
            long j5 = this.durationUs;
            if (j5 != -9223372036854775807L) {
                bundle.putLong(f32021n, j5);
            }
            int i = this.firstPeriodIndex;
            if (i != 0) {
                bundle.putInt(f32022o, i);
            }
            int i2 = this.lastPeriodIndex;
            if (i2 != 0) {
                bundle.putInt(f32023p, i2);
            }
            long j6 = this.positionInFirstPeriodUs;
            if (j6 != 0) {
                bundle.putLong(f32024q, j6);
            }
            return bundle;
        }
    }

    /* renamed from: a */
    public static /* synthetic */ Timeline m75316a(Bundle bundle) {
        return m75315b(bundle);
    }

    /* renamed from: b */
    public static Timeline m75315b(Bundle bundle) {
        ImmutableList m75314c = m75314c(Window.CREATOR, BundleUtil.getBinder(bundle, f31996b));
        ImmutableList m75314c2 = m75314c(Period.CREATOR, BundleUtil.getBinder(bundle, f31997c));
        int[] intArray = bundle.getIntArray(f31998d);
        if (intArray == null) {
            intArray = m75313d(m75314c.size());
        }
        return new RemotableTimeline(m75314c, m75314c2, intArray);
    }

    /* renamed from: c */
    private static <T extends Bundleable> ImmutableList<T> m75314c(Bundleable.Creator<T> creator, @Nullable IBinder iBinder) {
        if (iBinder == null) {
            return ImmutableList.m69424of();
        }
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ImmutableList<Bundle> list = BundleListRetriever.getList(iBinder);
        for (int i = 0; i < list.size(); i++) {
            builder.add((ImmutableList.Builder) creator.fromBundle(list.get(i)));
        }
        return builder.build();
    }

    /* renamed from: d */
    private static int[] m75313d(int i) {
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = i2;
        }
        return iArr;
    }

    public boolean equals(@Nullable Object obj) {
        int lastWindowIndex;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Timeline)) {
            return false;
        }
        Timeline timeline = (Timeline) obj;
        if (timeline.getWindowCount() != getWindowCount() || timeline.getPeriodCount() != getPeriodCount()) {
            return false;
        }
        Window window = new Window();
        Period period = new Period();
        Window window2 = new Window();
        Period period2 = new Period();
        for (int i = 0; i < getWindowCount(); i++) {
            if (!getWindow(i, window).equals(timeline.getWindow(i, window2))) {
                return false;
            }
        }
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            if (!getPeriod(i2, period, true).equals(timeline.getPeriod(i2, period2, true))) {
                return false;
            }
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        if (firstWindowIndex != timeline.getFirstWindowIndex(true) || (lastWindowIndex = getLastWindowIndex(true)) != timeline.getLastWindowIndex(true)) {
            return false;
        }
        while (firstWindowIndex != lastWindowIndex) {
            int nextWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
            if (nextWindowIndex != timeline.getNextWindowIndex(firstWindowIndex, 0, true)) {
                return false;
            }
            firstWindowIndex = nextWindowIndex;
        }
        return true;
    }

    public int getFirstWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return 0;
    }

    public abstract int getIndexOfPeriod(Object obj);

    public int getLastWindowIndex(boolean z) {
        if (isEmpty()) {
            return -1;
        }
        return getWindowCount() - 1;
    }

    public final int getNextPeriodIndex(int i, Period period, Window window, int i2, boolean z) {
        int i3 = getPeriod(i, period).windowIndex;
        if (getWindow(i3, window).lastPeriodIndex == i) {
            int nextWindowIndex = getNextWindowIndex(i3, i2, z);
            if (nextWindowIndex == -1) {
                return -1;
            }
            return getWindow(nextWindowIndex, window).firstPeriodIndex;
        }
        return i + 1;
    }

    public int getNextWindowIndex(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == getLastWindowIndex(z)) {
                        return getFirstWindowIndex(z);
                    }
                    return i + 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == getLastWindowIndex(z)) {
            return -1;
        } else {
            return i + 1;
        }
    }

    public final Period getPeriod(int i, Period period) {
        return getPeriod(i, period, false);
    }

    public abstract Period getPeriod(int i, Period period, boolean z);

    public Period getPeriodByUid(Object obj, Period period) {
        return getPeriod(getIndexOfPeriod(obj), period, true);
    }

    public abstract int getPeriodCount();

    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j) {
        return getPeriodPositionUs(window, period, i, j);
    }

    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i, long j) {
        return (Pair) Assertions.checkNotNull(getPeriodPositionUs(window, period, i, j, 0L));
    }

    public int getPreviousWindowIndex(int i, int i2, boolean z) {
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    if (i == getFirstWindowIndex(z)) {
                        return getLastWindowIndex(z);
                    }
                    return i - 1;
                }
                throw new IllegalStateException();
            }
            return i;
        } else if (i == getFirstWindowIndex(z)) {
            return -1;
        } else {
            return i - 1;
        }
    }

    public abstract Object getUidOfPeriod(int i);

    public final Window getWindow(int i, Window window) {
        return getWindow(i, window, 0L);
    }

    public abstract Window getWindow(int i, Window window, long j);

    public abstract int getWindowCount();

    public int hashCode() {
        Window window = new Window();
        Period period = new Period();
        int windowCount = 217 + getWindowCount();
        for (int i = 0; i < getWindowCount(); i++) {
            windowCount = (windowCount * 31) + getWindow(i, window).hashCode();
        }
        int periodCount = (windowCount * 31) + getPeriodCount();
        for (int i2 = 0; i2 < getPeriodCount(); i2++) {
            periodCount = (periodCount * 31) + getPeriod(i2, period, true).hashCode();
        }
        int firstWindowIndex = getFirstWindowIndex(true);
        while (firstWindowIndex != -1) {
            periodCount = (periodCount * 31) + firstWindowIndex;
            firstWindowIndex = getNextWindowIndex(firstWindowIndex, 0, true);
        }
        return periodCount;
    }

    public final boolean isEmpty() {
        if (getWindowCount() == 0) {
            return true;
        }
        return false;
    }

    public final boolean isLastPeriod(int i, Period period, Window window, int i2, boolean z) {
        if (getNextPeriodIndex(i, period, window, i2, z) == -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public final Bundle toBundle() {
        ArrayList arrayList = new ArrayList();
        int windowCount = getWindowCount();
        Window window = new Window();
        for (int i = 0; i < windowCount; i++) {
            arrayList.add(getWindow(i, window, 0L).toBundle());
        }
        ArrayList arrayList2 = new ArrayList();
        int periodCount = getPeriodCount();
        Period period = new Period();
        for (int i2 = 0; i2 < periodCount; i2++) {
            arrayList2.add(getPeriod(i2, period, false).toBundle());
        }
        int[] iArr = new int[windowCount];
        if (windowCount > 0) {
            iArr[0] = getFirstWindowIndex(true);
        }
        for (int i3 = 1; i3 < windowCount; i3++) {
            iArr[i3] = getNextWindowIndex(iArr[i3 - 1], 0, true);
        }
        Bundle bundle = new Bundle();
        BundleUtil.putBinder(bundle, f31996b, new BundleListRetriever(arrayList));
        BundleUtil.putBinder(bundle, f31997c, new BundleListRetriever(arrayList2));
        bundle.putIntArray(f31998d, iArr);
        return bundle;
    }

    public final Bundle toBundleWithOneWindowOnly(int i) {
        Window window = getWindow(i, new Window(), 0L);
        ArrayList arrayList = new ArrayList();
        Period period = new Period();
        int i2 = window.firstPeriodIndex;
        while (true) {
            int i3 = window.lastPeriodIndex;
            if (i2 <= i3) {
                getPeriod(i2, period, false);
                period.windowIndex = 0;
                arrayList.add(period.toBundle());
                i2++;
            } else {
                window.lastPeriodIndex = i3 - window.firstPeriodIndex;
                window.firstPeriodIndex = 0;
                Bundle bundle = window.toBundle();
                Bundle bundle2 = new Bundle();
                BundleUtil.putBinder(bundle2, f31996b, new BundleListRetriever(ImmutableList.m69423of(bundle)));
                BundleUtil.putBinder(bundle2, f31997c, new BundleListRetriever(arrayList));
                bundle2.putIntArray(f31998d, new int[]{0});
                return bundle2;
            }
        }
    }

    @Nullable
    @InlineMe(replacement = "this.getPeriodPositionUs(window, period, windowIndex, windowPositionUs, defaultPositionProjectionUs)")
    @Deprecated
    public final Pair<Object, Long> getPeriodPosition(Window window, Period period, int i, long j, long j2) {
        return getPeriodPositionUs(window, period, i, j, j2);
    }

    @Nullable
    public final Pair<Object, Long> getPeriodPositionUs(Window window, Period period, int i, long j, long j2) {
        Assertions.checkIndex(i, 0, getWindowCount());
        getWindow(i, window, j2);
        if (j == -9223372036854775807L) {
            j = window.getDefaultPositionUs();
            if (j == -9223372036854775807L) {
                return null;
            }
        }
        int i2 = window.firstPeriodIndex;
        getPeriod(i2, period);
        while (i2 < window.lastPeriodIndex && period.positionInWindowUs != j) {
            int i3 = i2 + 1;
            if (getPeriod(i3, period).positionInWindowUs > j) {
                break;
            }
            i2 = i3;
        }
        getPeriod(i2, period, true);
        long j3 = j - period.positionInWindowUs;
        long j4 = period.durationUs;
        if (j4 != -9223372036854775807L) {
            j3 = Math.min(j3, j4 - 1);
        }
        return Pair.create(Assertions.checkNotNull(period.uid), Long.valueOf(Math.max(0L, j3)));
    }
}
