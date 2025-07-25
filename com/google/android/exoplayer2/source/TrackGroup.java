package com.google.android.exoplayer2.source;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.MimeTypes;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public final class TrackGroup implements Bundleable {

    /* renamed from: b */
    private final Format[] f34483b;

    /* renamed from: c */
    private int f34484c;

    /* renamed from: id */
    public final String f34485id;
    public final int length;
    public final int type;

    /* renamed from: d */
    private static final String f34481d = Util.intToStringMaxRadix(0);

    /* renamed from: f */
    private static final String f34482f = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<TrackGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.x
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return TrackGroup.m73697a(bundle);
        }
    };

    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }

    /* renamed from: a */
    public static /* synthetic */ TrackGroup m73697a(Bundle bundle) {
        return m73696b(bundle);
    }

    /* renamed from: b */
    public static /* synthetic */ TrackGroup m73696b(Bundle bundle) {
        ImmutableList fromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f34481d);
        if (parcelableArrayList == null) {
            fromBundleList = ImmutableList.m69424of();
        } else {
            fromBundleList = BundleableUtil.fromBundleList(Format.CREATOR, parcelableArrayList);
        }
        return new TrackGroup(bundle.getString(f34482f, ""), (Format[]) fromBundleList.toArray(new Format[0]));
    }

    /* renamed from: c */
    private static void m73695c(String str, @Nullable String str2, @Nullable String str3, int i) {
        Log.m72605e("TrackGroup", "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    /* renamed from: d */
    private static String m73694d(@Nullable String str) {
        if (str == null || str.equals("und")) {
            return "";
        }
        return str;
    }

    /* renamed from: e */
    private static int m73693e(int i) {
        return i | 16384;
    }

    /* renamed from: f */
    private void m73692f() {
        String m73694d = m73694d(this.f34483b[0].language);
        int m73693e = m73693e(this.f34483b[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.f34483b;
            if (i < formatArr.length) {
                if (!m73694d.equals(m73694d(formatArr[i].language))) {
                    Format[] formatArr2 = this.f34483b;
                    m73695c("languages", formatArr2[0].language, formatArr2[i].language, i);
                    return;
                } else if (m73693e != m73693e(this.f34483b[i].roleFlags)) {
                    m73695c("role flags", Integer.toBinaryString(this.f34483b[0].roleFlags), Integer.toBinaryString(this.f34483b[i].roleFlags), i);
                    return;
                } else {
                    i++;
                }
            } else {
                return;
            }
        }
    }

    @CheckResult
    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.f34483b);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.f34485id.equals(trackGroup.f34485id) && Arrays.equals(this.f34483b, trackGroup.f34483b)) {
            return true;
        }
        return false;
    }

    public Format getFormat(int i) {
        return this.f34483b[i];
    }

    public int hashCode() {
        if (this.f34484c == 0) {
            this.f34484c = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f34485id.hashCode()) * 31) + Arrays.hashCode(this.f34483b);
        }
        return this.f34484c;
    }

    public int indexOf(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.f34483b;
            if (i < formatArr.length) {
                if (format == formatArr[i]) {
                    return i;
                }
                i++;
            } else {
                return -1;
            }
        }
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.f34483b.length);
        for (Format format : this.f34483b) {
            arrayList.add(format.toBundle(true));
        }
        bundle.putParcelableArrayList(f34481d, arrayList);
        bundle.putString(f34482f, this.f34485id);
        return bundle;
    }

    public TrackGroup(String str, Format... formatArr) {
        Assertions.checkArgument(formatArr.length > 0);
        this.f34485id = str;
        this.f34483b = formatArr;
        this.length = formatArr.length;
        int trackType = MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        m73692f();
    }
}
