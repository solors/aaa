package com.google.android.exoplayer2.source.ads;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.IntRange;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Util;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class AdPlaybackState implements Bundleable {
    public static final int AD_STATE_AVAILABLE = 1;
    public static final int AD_STATE_ERROR = 4;
    public static final int AD_STATE_PLAYED = 3;
    public static final int AD_STATE_SKIPPED = 2;
    public static final int AD_STATE_UNAVAILABLE = 0;
    public final int adGroupCount;
    public final long adResumePositionUs;
    @Nullable
    public final Object adsId;

    /* renamed from: b */
    private final AdGroup[] f34498b;
    public final long contentDurationUs;
    public final int removedAdGroupCount;
    public static final AdPlaybackState NONE = new AdPlaybackState(null, new AdGroup[0], 0, -9223372036854775807L, 0);

    /* renamed from: c */
    private static final AdGroup f34493c = new AdGroup(0).withAdCount(0);

    /* renamed from: d */
    private static final String f34494d = Util.intToStringMaxRadix(1);

    /* renamed from: f */
    private static final String f34495f = Util.intToStringMaxRadix(2);

    /* renamed from: g */
    private static final String f34496g = Util.intToStringMaxRadix(3);

    /* renamed from: h */
    private static final String f34497h = Util.intToStringMaxRadix(4);
    public static final Bundleable.Creator<AdPlaybackState> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.ads.a
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return AdPlaybackState.m73677a(bundle);
        }
    };

    /* loaded from: classes4.dex */
    public static final class AdGroup implements Bundleable {
        public final long contentResumeOffsetUs;
        public final int count;
        public final long[] durationsUs;
        public final boolean isServerSideInserted;
        public final int originalCount;
        public final int[] states;
        public final long timeUs;
        public final Uri[] uris;

        /* renamed from: b */
        private static final String f34499b = Util.intToStringMaxRadix(0);

        /* renamed from: c */
        private static final String f34500c = Util.intToStringMaxRadix(1);

        /* renamed from: d */
        private static final String f34501d = Util.intToStringMaxRadix(2);

        /* renamed from: f */
        private static final String f34502f = Util.intToStringMaxRadix(3);

        /* renamed from: g */
        private static final String f34503g = Util.intToStringMaxRadix(4);

        /* renamed from: h */
        private static final String f34504h = Util.intToStringMaxRadix(5);

        /* renamed from: i */
        private static final String f34505i = Util.intToStringMaxRadix(6);

        /* renamed from: j */
        private static final String f34506j = Util.intToStringMaxRadix(7);
        public static final Bundleable.Creator<AdGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.ads.b
            @Override // com.google.android.exoplayer2.Bundleable.Creator
            public final Bundleable fromBundle(Bundle bundle) {
                return AdPlaybackState.AdGroup.m73673a(bundle);
            }
        };

        /* renamed from: a */
        public static /* synthetic */ AdGroup m73673a(Bundle bundle) {
            return m73670d(bundle);
        }

        @CheckResult
        /* renamed from: b */
        private static long[] m73672b(long[] jArr, int i) {
            int length = jArr.length;
            int max = Math.max(i, length);
            long[] copyOf = Arrays.copyOf(jArr, max);
            Arrays.fill(copyOf, length, max, -9223372036854775807L);
            return copyOf;
        }

        @CheckResult
        /* renamed from: c */
        private static int[] m73671c(int[] iArr, int i) {
            int length = iArr.length;
            int max = Math.max(i, length);
            int[] copyOf = Arrays.copyOf(iArr, max);
            Arrays.fill(copyOf, length, max, 0);
            return copyOf;
        }

        /* renamed from: d */
        public static AdGroup m73670d(Bundle bundle) {
            Uri[] uriArr;
            long[] jArr;
            long j = bundle.getLong(f34499b);
            int i = bundle.getInt(f34500c);
            int i2 = bundle.getInt(f34506j);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f34501d);
            int[] intArray = bundle.getIntArray(f34502f);
            long[] longArray = bundle.getLongArray(f34503g);
            long j2 = bundle.getLong(f34504h);
            boolean z = bundle.getBoolean(f34505i);
            if (intArray == null) {
                intArray = new int[0];
            }
            int[] iArr = intArray;
            if (parcelableArrayList == null) {
                uriArr = new Uri[0];
            } else {
                uriArr = (Uri[]) parcelableArrayList.toArray(new Uri[0]);
            }
            if (longArray == null) {
                jArr = new long[0];
            } else {
                jArr = longArray;
            }
            return new AdGroup(j, i, i2, iArr, uriArr, jArr, j2, z);
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || AdGroup.class != obj.getClass()) {
                return false;
            }
            AdGroup adGroup = (AdGroup) obj;
            if (this.timeUs == adGroup.timeUs && this.count == adGroup.count && this.originalCount == adGroup.originalCount && Arrays.equals(this.uris, adGroup.uris) && Arrays.equals(this.states, adGroup.states) && Arrays.equals(this.durationsUs, adGroup.durationsUs) && this.contentResumeOffsetUs == adGroup.contentResumeOffsetUs && this.isServerSideInserted == adGroup.isServerSideInserted) {
                return true;
            }
            return false;
        }

        public int getFirstAdIndexToPlay() {
            return getNextAdIndexToPlay(-1);
        }

        public int getNextAdIndexToPlay(@IntRange(from = -1) int i) {
            int i2;
            int i3 = i + 1;
            while (true) {
                int[] iArr = this.states;
                if (i3 >= iArr.length || this.isServerSideInserted || (i2 = iArr[i3]) == 0 || i2 == 1) {
                    break;
                }
                i3++;
            }
            return i3;
        }

        public boolean hasUnplayedAds() {
            if (this.count == -1) {
                return true;
            }
            for (int i = 0; i < this.count; i++) {
                int i2 = this.states[i];
                if (i2 == 0 || i2 == 1) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            long j = this.timeUs;
            long j2 = this.contentResumeOffsetUs;
            return (((((((((((((this.count * 31) + this.originalCount) * 31) + ((int) (j ^ (j >>> 32)))) * 31) + Arrays.hashCode(this.uris)) * 31) + Arrays.hashCode(this.states)) * 31) + Arrays.hashCode(this.durationsUs)) * 31) + ((int) (j2 ^ (j2 >>> 32)))) * 31) + (this.isServerSideInserted ? 1 : 0);
        }

        public boolean shouldPlayAdGroup() {
            if (this.count != -1 && getFirstAdIndexToPlay() >= this.count) {
                return false;
            }
            return true;
        }

        @Override // com.google.android.exoplayer2.Bundleable
        public Bundle toBundle() {
            Bundle bundle = new Bundle();
            bundle.putLong(f34499b, this.timeUs);
            bundle.putInt(f34500c, this.count);
            bundle.putInt(f34506j, this.originalCount);
            bundle.putParcelableArrayList(f34501d, new ArrayList<>(Arrays.asList(this.uris)));
            bundle.putIntArray(f34502f, this.states);
            bundle.putLongArray(f34503g, this.durationsUs);
            bundle.putLong(f34504h, this.contentResumeOffsetUs);
            bundle.putBoolean(f34505i, this.isServerSideInserted);
            return bundle;
        }

        @CheckResult
        public AdGroup withAdCount(int i) {
            int[] m73671c = m73671c(this.states, i);
            long[] m73672b = m73672b(this.durationsUs, i);
            return new AdGroup(this.timeUs, i, this.originalCount, m73671c, (Uri[]) Arrays.copyOf(this.uris, i), m73672b, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAdDurationsUs(long[] jArr) {
            int length = jArr.length;
            Uri[] uriArr = this.uris;
            if (length < uriArr.length) {
                jArr = m73672b(jArr, uriArr.length);
            } else if (this.count != -1 && jArr.length > uriArr.length) {
                jArr = Arrays.copyOf(jArr, uriArr.length);
            }
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, jArr, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAdState(int i, @IntRange(from = 0) int i2) {
            boolean z;
            int i3 = this.count;
            boolean z2 = false;
            if (i3 != -1 && i2 >= i3) {
                z = false;
            } else {
                z = true;
            }
            Assertions.checkArgument(z);
            int[] m73671c = m73671c(this.states, i2 + 1);
            int i4 = m73671c[i2];
            if (i4 == 0 || i4 == 1 || i4 == i) {
                z2 = true;
            }
            Assertions.checkArgument(z2);
            long[] jArr = this.durationsUs;
            if (jArr.length != m73671c.length) {
                jArr = m73672b(jArr, m73671c.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = this.uris;
            if (uriArr.length != m73671c.length) {
                uriArr = (Uri[]) Arrays.copyOf(uriArr, m73671c.length);
            }
            m73671c[i2] = i;
            return new AdGroup(this.timeUs, this.count, this.originalCount, m73671c, uriArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAdUri(Uri uri, @IntRange(from = 0) int i) {
            int[] m73671c = m73671c(this.states, i + 1);
            long[] jArr = this.durationsUs;
            if (jArr.length != m73671c.length) {
                jArr = m73672b(jArr, m73671c.length);
            }
            long[] jArr2 = jArr;
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, m73671c.length);
            uriArr[i] = uri;
            m73671c[i] = 1;
            return new AdGroup(this.timeUs, this.count, this.originalCount, m73671c, uriArr, jArr2, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAllAdsReset() {
            int i;
            if (this.count == -1) {
                return this;
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i2 = 0; i2 < length; i2++) {
                int i3 = copyOf[i2];
                if (i3 == 3 || i3 == 2 || i3 == 4) {
                    if (this.uris[i2] == null) {
                        i = 0;
                    } else {
                        i = 1;
                    }
                    copyOf[i2] = i;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withAllAdsSkipped() {
            if (this.count == -1) {
                return new AdGroup(this.timeUs, 0, this.originalCount, new int[0], new Uri[0], new long[0], this.contentResumeOffsetUs, this.isServerSideInserted);
            }
            int[] iArr = this.states;
            int length = iArr.length;
            int[] copyOf = Arrays.copyOf(iArr, length);
            for (int i = 0; i < length; i++) {
                int i2 = copyOf[i];
                if (i2 == 1 || i2 == 0) {
                    copyOf[i] = 2;
                }
            }
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withContentResumeOffsetUs(long j) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, this.durationsUs, j, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withIsServerSideInserted(boolean z) {
            return new AdGroup(this.timeUs, this.count, this.originalCount, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, z);
        }

        public AdGroup withLastAdRemoved() {
            int[] iArr = this.states;
            int length = iArr.length - 1;
            int[] copyOf = Arrays.copyOf(iArr, length);
            Uri[] uriArr = (Uri[]) Arrays.copyOf(this.uris, length);
            long[] jArr = this.durationsUs;
            if (jArr.length > length) {
                jArr = Arrays.copyOf(jArr, length);
            }
            long[] jArr2 = jArr;
            return new AdGroup(this.timeUs, length, this.originalCount, copyOf, uriArr, jArr2, Util.sum(jArr2), this.isServerSideInserted);
        }

        public AdGroup withOriginalAdCount(int i) {
            return new AdGroup(this.timeUs, this.count, i, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        @CheckResult
        public AdGroup withTimeUs(long j) {
            return new AdGroup(j, this.count, this.originalCount, this.states, this.uris, this.durationsUs, this.contentResumeOffsetUs, this.isServerSideInserted);
        }

        public AdGroup(long j) {
            this(j, -1, -1, new int[0], new Uri[0], new long[0], 0L, false);
        }

        private AdGroup(long j, int i, int i2, int[] iArr, Uri[] uriArr, long[] jArr, long j2, boolean z) {
            Assertions.checkArgument(iArr.length == uriArr.length);
            this.timeUs = j;
            this.count = i;
            this.originalCount = i2;
            this.states = iArr;
            this.uris = uriArr;
            this.durationsUs = jArr;
            this.contentResumeOffsetUs = j2;
            this.isServerSideInserted = z;
        }
    }

    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    /* loaded from: classes4.dex */
    public @interface AdState {
    }

    public AdPlaybackState(Object obj, long... jArr) {
        this(obj, m73676b(jArr), 0L, -9223372036854775807L, 0);
    }

    /* renamed from: a */
    public static /* synthetic */ AdPlaybackState m73677a(Bundle bundle) {
        return m73675c(bundle);
    }

    /* renamed from: b */
    private static AdGroup[] m73676b(long[] jArr) {
        int length = jArr.length;
        AdGroup[] adGroupArr = new AdGroup[length];
        for (int i = 0; i < length; i++) {
            adGroupArr[i] = new AdGroup(jArr[i]);
        }
        return adGroupArr;
    }

    /* renamed from: c */
    public static AdPlaybackState m73675c(Bundle bundle) {
        AdGroup[] adGroupArr;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f34494d);
        if (parcelableArrayList == null) {
            adGroupArr = new AdGroup[0];
        } else {
            AdGroup[] adGroupArr2 = new AdGroup[parcelableArrayList.size()];
            for (int i = 0; i < parcelableArrayList.size(); i++) {
                adGroupArr2[i] = AdGroup.CREATOR.fromBundle((Bundle) parcelableArrayList.get(i));
            }
            adGroupArr = adGroupArr2;
        }
        String str = f34495f;
        AdPlaybackState adPlaybackState = NONE;
        return new AdPlaybackState(null, adGroupArr, bundle.getLong(str, adPlaybackState.adResumePositionUs), bundle.getLong(f34496g, adPlaybackState.contentDurationUs), bundle.getInt(f34497h, adPlaybackState.removedAdGroupCount));
    }

    /* renamed from: d */
    private boolean m73674d(long j, long j2, int i) {
        if (j == Long.MIN_VALUE) {
            return false;
        }
        long j3 = getAdGroup(i).timeUs;
        if (j3 == Long.MIN_VALUE) {
            if (j2 != -9223372036854775807L && j >= j2) {
                return false;
            }
            return true;
        } else if (j >= j3) {
            return false;
        } else {
            return true;
        }
    }

    public static AdPlaybackState fromAdPlaybackState(Object obj, AdPlaybackState adPlaybackState) {
        int i = adPlaybackState.adGroupCount - adPlaybackState.removedAdGroupCount;
        AdGroup[] adGroupArr = new AdGroup[i];
        for (int i2 = 0; i2 < i; i2++) {
            AdGroup adGroup = adPlaybackState.f34498b[i2];
            long j = adGroup.timeUs;
            int i3 = adGroup.count;
            int i4 = adGroup.originalCount;
            int[] iArr = adGroup.states;
            int[] copyOf = Arrays.copyOf(iArr, iArr.length);
            Uri[] uriArr = adGroup.uris;
            Uri[] uriArr2 = (Uri[]) Arrays.copyOf(uriArr, uriArr.length);
            long[] jArr = adGroup.durationsUs;
            adGroupArr[i2] = new AdGroup(j, i3, i4, copyOf, uriArr2, Arrays.copyOf(jArr, jArr.length), adGroup.contentResumeOffsetUs, adGroup.isServerSideInserted);
        }
        return new AdPlaybackState(obj, adGroupArr, adPlaybackState.adResumePositionUs, adPlaybackState.contentDurationUs, adPlaybackState.removedAdGroupCount);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || AdPlaybackState.class != obj.getClass()) {
            return false;
        }
        AdPlaybackState adPlaybackState = (AdPlaybackState) obj;
        if (Util.areEqual(this.adsId, adPlaybackState.adsId) && this.adGroupCount == adPlaybackState.adGroupCount && this.adResumePositionUs == adPlaybackState.adResumePositionUs && this.contentDurationUs == adPlaybackState.contentDurationUs && this.removedAdGroupCount == adPlaybackState.removedAdGroupCount && Arrays.equals(this.f34498b, adPlaybackState.f34498b)) {
            return true;
        }
        return false;
    }

    public AdGroup getAdGroup(@IntRange(from = 0) int i) {
        int i2 = this.removedAdGroupCount;
        if (i < i2) {
            return f34493c;
        }
        return this.f34498b[i - i2];
    }

    public int getAdGroupIndexAfterPositionUs(long j, long j2) {
        if (j == Long.MIN_VALUE) {
            return -1;
        }
        if (j2 != -9223372036854775807L && j >= j2) {
            return -1;
        }
        int i = this.removedAdGroupCount;
        while (i < this.adGroupCount && ((getAdGroup(i).timeUs != Long.MIN_VALUE && getAdGroup(i).timeUs <= j) || !getAdGroup(i).shouldPlayAdGroup())) {
            i++;
        }
        if (i >= this.adGroupCount) {
            return -1;
        }
        return i;
    }

    public int getAdGroupIndexForPositionUs(long j, long j2) {
        int i = this.adGroupCount - 1;
        while (i >= 0 && m73674d(j, j2, i)) {
            i--;
        }
        if (i < 0 || !getAdGroup(i).hasUnplayedAds()) {
            return -1;
        }
        return i;
    }

    public int hashCode() {
        int hashCode;
        int i = this.adGroupCount * 31;
        Object obj = this.adsId;
        if (obj == null) {
            hashCode = 0;
        } else {
            hashCode = obj.hashCode();
        }
        return ((((((((i + hashCode) * 31) + ((int) this.adResumePositionUs)) * 31) + ((int) this.contentDurationUs)) * 31) + this.removedAdGroupCount) * 31) + Arrays.hashCode(this.f34498b);
    }

    public boolean isAdInErrorState(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        AdGroup adGroup;
        int i3;
        if (i >= this.adGroupCount || (i3 = (adGroup = getAdGroup(i)).count) == -1 || i2 >= i3 || adGroup.states[i2] != 4) {
            return false;
        }
        return true;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (AdGroup adGroup : this.f34498b) {
            arrayList.add(adGroup.toBundle());
        }
        if (!arrayList.isEmpty()) {
            bundle.putParcelableArrayList(f34494d, arrayList);
        }
        long j = this.adResumePositionUs;
        AdPlaybackState adPlaybackState = NONE;
        if (j != adPlaybackState.adResumePositionUs) {
            bundle.putLong(f34495f, j);
        }
        long j2 = this.contentDurationUs;
        if (j2 != adPlaybackState.contentDurationUs) {
            bundle.putLong(f34496g, j2);
        }
        int i = this.removedAdGroupCount;
        if (i != adPlaybackState.removedAdGroupCount) {
            bundle.putInt(f34497h, i);
        }
        return bundle;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("AdPlaybackState(adsId=");
        sb2.append(this.adsId);
        sb2.append(", adResumePositionUs=");
        sb2.append(this.adResumePositionUs);
        sb2.append(", adGroups=[");
        for (int i = 0; i < this.f34498b.length; i++) {
            sb2.append("adGroup(timeUs=");
            sb2.append(this.f34498b[i].timeUs);
            sb2.append(", ads=[");
            for (int i2 = 0; i2 < this.f34498b[i].states.length; i2++) {
                sb2.append("ad(state=");
                int i3 = this.f34498b[i].states[i2];
                if (i3 != 0) {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            if (i3 != 3) {
                                if (i3 != 4) {
                                    sb2.append('?');
                                } else {
                                    sb2.append('!');
                                }
                            } else {
                                sb2.append('P');
                            }
                        } else {
                            sb2.append('S');
                        }
                    } else {
                        sb2.append('R');
                    }
                } else {
                    sb2.append('_');
                }
                sb2.append(", durationUs=");
                sb2.append(this.f34498b[i].durationsUs[i2]);
                sb2.append(')');
                if (i2 < this.f34498b[i].states.length - 1) {
                    sb2.append(", ");
                }
            }
            sb2.append("])");
            if (i < this.f34498b.length - 1) {
                sb2.append(", ");
            }
        }
        sb2.append("])");
        return sb2.toString();
    }

    @CheckResult
    public AdPlaybackState withAdCount(@IntRange(from = 0) int i, @IntRange(from = 1) int i2) {
        boolean z;
        if (i2 > 0) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        if (adGroupArr[i3].count == i2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = this.f34498b[i3].withAdCount(i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(long[][] jArr) {
        Assertions.checkState(this.removedAdGroupCount == 0);
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        for (int i = 0; i < this.adGroupCount; i++) {
            adGroupArr2[i] = adGroupArr2[i].withAdDurationsUs(jArr[i]);
        }
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdGroupTimeUs(@IntRange(from = 0) int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = this.f34498b[i2].withTimeUs(j);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdLoadError(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(4, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAdResumePositionUs(long j) {
        if (this.adResumePositionUs == j) {
            return this;
        }
        return new AdPlaybackState(this.adsId, this.f34498b, j, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withAvailableAd(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        return withAvailableAdUri(i, i2, Uri.EMPTY);
    }

    @CheckResult
    public AdPlaybackState withAvailableAdUri(@IntRange(from = 0) int i, @IntRange(from = 0) int i2, Uri uri) {
        boolean z;
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        if (Uri.EMPTY.equals(uri) && !adGroupArr2[i3].isServerSideInserted) {
            z = false;
        } else {
            z = true;
        }
        Assertions.checkState(z);
        adGroupArr2[i3] = adGroupArr2[i3].withAdUri(uri, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withContentDurationUs(long j) {
        if (this.contentDurationUs == j) {
            return this;
        }
        return new AdPlaybackState(this.adsId, this.f34498b, this.adResumePositionUs, j, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withContentResumeOffsetUs(@IntRange(from = 0) int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        if (adGroupArr[i2].contentResumeOffsetUs == j) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withContentResumeOffsetUs(j);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withIsServerSideInserted(@IntRange(from = 0) int i, boolean z) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        if (adGroupArr[i2].isServerSideInserted == z) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withIsServerSideInserted(z);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withLastAdRemoved(@IntRange(from = 0) int i) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withLastAdRemoved();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withNewAdGroup(@IntRange(from = 0) int i, long j) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup adGroup = new AdGroup(j);
        AdGroup[] adGroupArr = (AdGroup[]) Util.nullSafeArrayAppend(this.f34498b, adGroup);
        System.arraycopy(adGroupArr, i2, adGroupArr, i2 + 1, this.f34498b.length - i2);
        adGroupArr[i2] = adGroup;
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withOriginalAdCount(@IntRange(from = 0) int i, int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        if (adGroupArr[i3].originalCount == i2) {
            return this;
        }
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withOriginalAdCount(i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withPlayedAd(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(3, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withRemovedAdGroupCount(@IntRange(from = 0) int i) {
        boolean z;
        int i2 = this.removedAdGroupCount;
        if (i2 == i) {
            return this;
        }
        if (i > i2) {
            z = true;
        } else {
            z = false;
        }
        Assertions.checkArgument(z);
        int i3 = this.adGroupCount - i;
        AdGroup[] adGroupArr = new AdGroup[i3];
        System.arraycopy(this.f34498b, i - this.removedAdGroupCount, adGroupArr, 0, i3);
        return new AdPlaybackState(this.adsId, adGroupArr, this.adResumePositionUs, this.contentDurationUs, i);
    }

    @CheckResult
    public AdPlaybackState withResetAdGroup(@IntRange(from = 0) int i) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsReset();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withSkippedAd(@IntRange(from = 0) int i, @IntRange(from = 0) int i2) {
        int i3 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i3] = adGroupArr2[i3].withAdState(2, i2);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    @CheckResult
    public AdPlaybackState withSkippedAdGroup(@IntRange(from = 0) int i) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAllAdsSkipped();
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }

    private AdPlaybackState(@Nullable Object obj, AdGroup[] adGroupArr, long j, long j2, int i) {
        this.adsId = obj;
        this.adResumePositionUs = j;
        this.contentDurationUs = j2;
        this.adGroupCount = adGroupArr.length + i;
        this.f34498b = adGroupArr;
        this.removedAdGroupCount = i;
    }

    @CheckResult
    public AdPlaybackState withAdDurationsUs(@IntRange(from = 0) int i, long... jArr) {
        int i2 = i - this.removedAdGroupCount;
        AdGroup[] adGroupArr = this.f34498b;
        AdGroup[] adGroupArr2 = (AdGroup[]) Util.nullSafeArrayCopy(adGroupArr, adGroupArr.length);
        adGroupArr2[i2] = adGroupArr2[i2].withAdDurationsUs(jArr);
        return new AdPlaybackState(this.adsId, adGroupArr2, this.adResumePositionUs, this.contentDurationUs, this.removedAdGroupCount);
    }
}
