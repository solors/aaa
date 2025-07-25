package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.offline.Download;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.chartboost.sdk.impl.e4 */
/* loaded from: classes3.dex */
public final class C9827e4 {

    /* renamed from: a */
    public final Download f21942a;

    public C9827e4(Download download) {
        Intrinsics.checkNotNullParameter(download, "download");
        this.f21942a = download;
    }

    /* renamed from: a */
    public final Download m81752a() {
        return this.f21942a;
    }

    /* renamed from: b */
    public final String m81751b() {
        String id2 = this.f21942a.request.f34018id;
        Intrinsics.checkNotNullExpressionValue(id2, "id");
        return id2;
    }

    /* renamed from: c */
    public final float m81750c() {
        return this.f21942a.getPercentDownloaded();
    }

    /* renamed from: d */
    public final int m81749d() {
        return this.f21942a.state;
    }

    /* renamed from: e */
    public final long m81748e() {
        return this.f21942a.updateTimeMs;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C9827e4) && Intrinsics.m17075f(this.f21942a, ((C9827e4) obj).f21942a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final String m81747f() {
        String uri = this.f21942a.request.uri.toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    public int hashCode() {
        return this.f21942a.hashCode();
    }

    public String toString() {
        Download download = this.f21942a;
        return "DownloadWrapper(download=" + download + ")";
    }
}
