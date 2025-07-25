package com.google.android.exoplayer2.text;

import android.os.Bundle;
import com.google.android.exoplayer2.Bundleable;
import com.google.android.exoplayer2.util.BundleableUtil;
import com.google.android.exoplayer2.util.Util;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes4.dex */
public final class CueGroup implements Bundleable {
    public final ImmutableList<Cue> cues;
    public final long presentationTimeUs;
    public static final CueGroup EMPTY_TIME_ZERO = new CueGroup(ImmutableList.m69424of(), 0);

    /* renamed from: b */
    private static final String f34749b = Util.intToStringMaxRadix(0);

    /* renamed from: c */
    private static final String f34750c = Util.intToStringMaxRadix(1);
    public static final Bundleable.Creator<CueGroup> CREATOR = new Bundleable.Creator() { // from class: com.google.android.exoplayer2.text.b
        @Override // com.google.android.exoplayer2.Bundleable.Creator
        public final Bundleable fromBundle(Bundle bundle) {
            return CueGroup.m73578a(bundle);
        }
    };

    public CueGroup(List<Cue> list, long j) {
        this.cues = ImmutableList.copyOf((Collection) list);
        this.presentationTimeUs = j;
    }

    /* renamed from: a */
    public static /* synthetic */ CueGroup m73578a(Bundle bundle) {
        return m73576c(bundle);
    }

    /* renamed from: b */
    private static ImmutableList<Cue> m73577b(List<Cue> list) {
        ImmutableList.Builder builder = ImmutableList.builder();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).bitmap == null) {
                builder.add((ImmutableList.Builder) list.get(i));
            }
        }
        return builder.build();
    }

    /* renamed from: c */
    public static final CueGroup m73576c(Bundle bundle) {
        ImmutableList fromBundleList;
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(f34749b);
        if (parcelableArrayList == null) {
            fromBundleList = ImmutableList.m69424of();
        } else {
            fromBundleList = BundleableUtil.fromBundleList(Cue.CREATOR, parcelableArrayList);
        }
        return new CueGroup(fromBundleList, bundle.getLong(f34750c));
    }

    @Override // com.google.android.exoplayer2.Bundleable
    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList(f34749b, BundleableUtil.toBundleArrayList(m73577b(this.cues)));
        bundle.putLong(f34750c, this.presentationTimeUs);
        return bundle;
    }
}
