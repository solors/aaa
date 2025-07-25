package com.google.android.exoplayer2.source;

import android.os.Bundle;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class TrackGroupArray implements Bundleable {

    /* renamed from: b */
    private final ImmutableList<TrackGroup> f34487b;

    /* renamed from: c */
    private int f34488c;
    public final int length;
    public static final TrackGroupArray EMPTY = new TrackGroupArray(new TrackGroup[0]);

    /* renamed from: d */
    private static final String f34486d = Util.intToStringMaxRadix(0);
    public static final Bundleable.Creator<TrackGroupArray> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.source.y
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            TrackGroupArray m73690b;
            m73690b = TrackGroupArray.m73690b(bundle);
            return m73690b;
        }
    };

    public TrackGroupArray(TrackGroup... trackGroupArr) {
        this.f34487b = ImmutableList.copyOf(trackGroupArr);
        this.length = trackGroupArr.length;
        m73689c();
    }

    /* renamed from: b */
    public static /* synthetic */ TrackGroupArray m73690b(Bundle bundle) {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f34486d);
        if (parcelableArrayList == null) {
            return new TrackGroupArray(new TrackGroup[0]);
        }
        return new TrackGroupArray((TrackGroup[]) BundleableUtil.fromBundleList(TrackGroup.CREATOR, parcelableArrayList).toArray(new TrackGroup[0]));
    }

    /* renamed from: c */
    private void m73689c() {
        int i = 0;
        while (i < this.f34487b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f34487b.size(); i3++) {
                if (this.f34487b.get(i).equals(this.f34487b.get(i3))) {
                    Log.m72605e("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TrackGroupArray.class != obj.getClass()) {
            return false;
        }
        TrackGroupArray trackGroupArray = (TrackGroupArray) obj;
        if (this.length == trackGroupArray.length && this.f34487b.equals(trackGroupArray.f34487b)) {
            return true;
        }
        return false;
    }

    public TrackGroup get(int i) {
        return this.f34487b.get(i);
    }

    public int hashCode() {
        if (this.f34488c == 0) {
            this.f34488c = this.f34487b.hashCode();
        }
        return this.f34488c;
    }

    public int indexOf(TrackGroup trackGroup) {
        int indexOf = this.f34487b.indexOf(trackGroup);
        if (indexOf < 0) {
            return -1;
        }
        return indexOf;
    }

    public boolean isEmpty() {
        if (this.length == 0) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f34486d, BundleableUtil.toBundleArrayList(this.f34487b));
        return bundle;
    }
}
