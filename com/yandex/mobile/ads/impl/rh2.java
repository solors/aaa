package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.video.playback.model.AdPodInfo;
import com.yandex.mobile.ads.video.playback.model.MediaFile;
import com.yandex.mobile.ads.video.playback.model.SkipInfo;
import com.yandex.mobile.ads.video.playback.model.VideoAd;
import com.yandex.mobile.ads.video.playback.model.VideoAdInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.C37566w;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class rh2 implements VideoAd {
    @NotNull

    /* renamed from: a */
    private final kl0 f84764a;
    @NotNull

    /* renamed from: b */
    private final n62 f84765b;

    public rh2(@NotNull kl0 videoAd, @NotNull n62 videoAdInfoConverter) {
        Intrinsics.checkNotNullParameter(videoAd, "videoAd");
        Intrinsics.checkNotNullParameter(videoAdInfoConverter, "videoAdInfoConverter");
        this.f84764a = videoAd;
        this.f84765b = videoAdInfoConverter;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh2)) {
            return false;
        }
        rh2 rh2Var = (rh2) obj;
        if (Intrinsics.m17075f(this.f84764a, rh2Var.f84764a) && Intrinsics.m17075f(this.f84765b, rh2Var.f84765b)) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final VideoAdInfo getAdInfo() {
        n62 n62Var = this.f84765b;
        ij0 instreamAdInfo = this.f84764a.m32505a();
        n62Var.getClass();
        Intrinsics.checkNotNullParameter(instreamAdInfo, "instreamAdInfo");
        return new VideoAdInfo(instreamAdInfo.m33255a(), instreamAdInfo.m33252d(), instreamAdInfo.m33253c(), instreamAdInfo.m33251e(), instreamAdInfo.m33254b());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final AdPodInfo getAdPodInfo() {
        return new mf2(this.f84764a.m32504b());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    public final long getDuration() {
        return this.f84764a.m32503c();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @Nullable
    public final String getInfo() {
        return this.f84764a.m32505a().m33251e();
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final MediaFile getMediaFile() {
        return new rg2(this.f84764a.m32500f());
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @NotNull
    public final List<MediaFile> getMediaFiles() {
        int m17154x;
        List<cl0> m32501e = this.f84764a.m32501e();
        m17154x = C37566w.m17154x(m32501e, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        for (cl0 cl0Var : m32501e) {
            arrayList.add(new rg2(cl0Var));
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.video.playback.model.VideoAd
    @Nullable
    public final SkipInfo getSkipInfo() {
        x72 m32499g = this.f84764a.m32499g();
        if (m32499g != null) {
            return new ih2(m32499g);
        }
        return null;
    }

    public final int hashCode() {
        return this.f84765b.hashCode() + (this.f84764a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        kl0 kl0Var = this.f84764a;
        n62 n62Var = this.f84765b;
        return "YandexVideoAd(videoAd=" + kl0Var + ", videoAdInfoConverter=" + n62Var + ")";
    }
}
