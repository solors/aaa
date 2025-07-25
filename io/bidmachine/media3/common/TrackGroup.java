package io.bidmachine.media3.common;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.CheckResult;
import androidx.annotation.Nullable;
import com.google.common.collect.ImmutableList;
import com.ironsource.mediationsdk.logger.IronSourceError;
import io.bidmachine.media3.common.Bundleable;
import io.bidmachine.media3.common.util.Assertions;
import io.bidmachine.media3.common.util.BundleableUtil;
import io.bidmachine.media3.common.util.Log;
import io.bidmachine.media3.common.util.UnstableApi;
import io.bidmachine.media3.common.util.Util;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class TrackGroup implements Bundleable {
    private static final String TAG = "TrackGroup";
    private final Format[] formats;
    private int hashCode;
    @UnstableApi

    /* renamed from: id */
    public final String f96660id;
    @UnstableApi
    public final int length;
    @UnstableApi
    public final int type;
    private static final String FIELD_FORMATS = Util.intToStringMaxRadix(0);
    private static final String FIELD_ID = Util.intToStringMaxRadix(1);
    @UnstableApi
    public static final Bundleable.Creator<TrackGroup> CREATOR = new Bundleable.Creator() { // from class: io.bidmachine.media3.common.t2
        @Override // io.bidmachine.media3.common.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return TrackGroup.m19961a(bundle);
        }
    };

    @UnstableApi
    public TrackGroup(Format... formatArr) {
        this("", formatArr);
    }

    /* renamed from: a */
    public static /* synthetic */ TrackGroup m19961a(Bundle bundle) {
        return lambda$static$0(bundle);
    }

    public static /* synthetic */ TrackGroup lambda$static$0(Bundle bundle) {
        ImmutableList fromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(FIELD_FORMATS);
        if (parcelableArrayList == null) {
            fromBundleList = ImmutableList.m69424of();
        } else {
            fromBundleList = BundleableUtil.fromBundleList(Format.CREATOR, parcelableArrayList);
        }
        return new TrackGroup(bundle.getString(FIELD_ID, ""), (Format[]) fromBundleList.toArray(new Format[0]));
    }

    private static void logErrorMessage(String str, @Nullable String str2, @Nullable String str3, int i) {
        Log.m19948e(TAG, "", new IllegalStateException("Different " + str + " combined in one TrackGroup: '" + str2 + "' (track 0) and '" + str3 + "' (track " + i + ")"));
    }

    private static String normalizeLanguage(@Nullable String str) {
        if (str == null || str.equals("und")) {
            return "";
        }
        return str;
    }

    private static int normalizeRoleFlags(int i) {
        return i | 16384;
    }

    private void verifyCorrectness() {
        String normalizeLanguage = normalizeLanguage(this.formats[0].language);
        int normalizeRoleFlags = normalizeRoleFlags(this.formats[0].roleFlags);
        int i = 1;
        while (true) {
            Format[] formatArr = this.formats;
            if (i < formatArr.length) {
                if (!normalizeLanguage.equals(normalizeLanguage(formatArr[i].language))) {
                    Format[] formatArr2 = this.formats;
                    logErrorMessage("languages", formatArr2[0].language, formatArr2[i].language, i);
                    return;
                } else if (normalizeRoleFlags != normalizeRoleFlags(this.formats[i].roleFlags)) {
                    logErrorMessage("role flags", Integer.toBinaryString(this.formats[0].roleFlags), Integer.toBinaryString(this.formats[i].roleFlags), i);
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
    @UnstableApi
    public TrackGroup copyWithId(String str) {
        return new TrackGroup(str, this.formats);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroup.class != obj.getClass()) {
            return false;
        }
        TrackGroup trackGroup = (TrackGroup) obj;
        if (this.f96660id.equals(trackGroup.f96660id) && Arrays.equals(this.formats, trackGroup.formats)) {
            return true;
        }
        return false;
    }

    @UnstableApi
    public Format getFormat(int i) {
        return this.formats[i];
    }

    public int hashCode() {
        if (this.hashCode == 0) {
            this.hashCode = ((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.f96660id.hashCode()) * 31) + Arrays.hashCode(this.formats);
        }
        return this.hashCode;
    }

    @UnstableApi
    public int indexOf(Format format) {
        int i = 0;
        while (true) {
            Format[] formatArr = this.formats;
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

    @Override // io.bidmachine.media3.common.Bundleable
    @UnstableApi
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>(this.formats.length);
        for (Format format : this.formats) {
            arrayList.add(format.toBundle(true));
        }
        bundle.putParcelableArrayList(FIELD_FORMATS, arrayList);
        bundle.putString(FIELD_ID, this.f96660id);
        return bundle;
    }

    @UnstableApi
    public TrackGroup(String str, Format... formatArr) {
        Assertions.checkArgument(formatArr.length > 0);
        this.f96660id = str;
        this.formats = formatArr;
        this.length = formatArr.length;
        int trackType = MimeTypes.getTrackType(formatArr[0].sampleMimeType);
        this.type = trackType == -1 ? MimeTypes.getTrackType(formatArr[0].containerMimeType) : trackType;
        verifyCorrectness();
    }
}
