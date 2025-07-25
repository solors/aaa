package com.mobilefuse.sdk.nativeads;

import com.mobilefuse.sdk.component.ParsedAdMarkup;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: NativeAdMarkup.kt */
@Metadata
/* loaded from: classes7.dex */
public final class NativeAdMarkup implements ParsedAdMarkup {
    @NotNull
    private final String adm;
    @Nullable
    private final String assetUrl;
    @NotNull
    private final List<NativeAsset> assets;
    @NotNull
    private final List<NativeEventTracker> eventTrackers;
    @NotNull
    private final List<String> impTrackers;
    @NotNull
    private final String link;
    @NotNull
    private final String privacy;

    /* JADX WARN: Multi-variable type inference failed */
    public NativeAdMarkup(@NotNull String adm, @Nullable String str, @NotNull List<? extends NativeAsset> assets, @NotNull List<String> impTrackers, @NotNull String link, @NotNull String privacy, @NotNull List<NativeEventTracker> eventTrackers) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(impTrackers, "impTrackers");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(privacy, "privacy");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        this.adm = adm;
        this.assetUrl = str;
        this.assets = assets;
        this.impTrackers = impTrackers;
        this.link = link;
        this.privacy = privacy;
        this.eventTrackers = eventTrackers;
    }

    public static /* synthetic */ NativeAdMarkup copy$default(NativeAdMarkup nativeAdMarkup, String str, String str2, List list, List list2, String str3, String str4, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nativeAdMarkup.getAdm();
        }
        if ((i & 2) != 0) {
            str2 = nativeAdMarkup.assetUrl;
        }
        String str5 = str2;
        List<NativeAsset> list4 = list;
        if ((i & 4) != 0) {
            list4 = nativeAdMarkup.assets;
        }
        List list5 = list4;
        List<String> list6 = list2;
        if ((i & 8) != 0) {
            list6 = nativeAdMarkup.impTrackers;
        }
        List list7 = list6;
        if ((i & 16) != 0) {
            str3 = nativeAdMarkup.link;
        }
        String str6 = str3;
        if ((i & 32) != 0) {
            str4 = nativeAdMarkup.privacy;
        }
        String str7 = str4;
        List<NativeEventTracker> list8 = list3;
        if ((i & 64) != 0) {
            list8 = nativeAdMarkup.eventTrackers;
        }
        return nativeAdMarkup.copy(str, str5, list5, list7, str6, str7, list8);
    }

    @NotNull
    public final String component1() {
        return getAdm();
    }

    @Nullable
    public final String component2() {
        return this.assetUrl;
    }

    @NotNull
    public final List<NativeAsset> component3() {
        return this.assets;
    }

    @NotNull
    public final List<String> component4() {
        return this.impTrackers;
    }

    @NotNull
    public final String component5() {
        return this.link;
    }

    @NotNull
    public final String component6() {
        return this.privacy;
    }

    @NotNull
    public final List<NativeEventTracker> component7() {
        return this.eventTrackers;
    }

    @NotNull
    public final NativeAdMarkup copy(@NotNull String adm, @Nullable String str, @NotNull List<? extends NativeAsset> assets, @NotNull List<String> impTrackers, @NotNull String link, @NotNull String privacy, @NotNull List<NativeEventTracker> eventTrackers) {
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(assets, "assets");
        Intrinsics.checkNotNullParameter(impTrackers, "impTrackers");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(privacy, "privacy");
        Intrinsics.checkNotNullParameter(eventTrackers, "eventTrackers");
        return new NativeAdMarkup(adm, str, assets, impTrackers, link, privacy, eventTrackers);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof NativeAdMarkup) {
                NativeAdMarkup nativeAdMarkup = (NativeAdMarkup) obj;
                if (!Intrinsics.m17075f(getAdm(), nativeAdMarkup.getAdm()) || !Intrinsics.m17075f(this.assetUrl, nativeAdMarkup.assetUrl) || !Intrinsics.m17075f(this.assets, nativeAdMarkup.assets) || !Intrinsics.m17075f(this.impTrackers, nativeAdMarkup.impTrackers) || !Intrinsics.m17075f(this.link, nativeAdMarkup.link) || !Intrinsics.m17075f(this.privacy, nativeAdMarkup.privacy) || !Intrinsics.m17075f(this.eventTrackers, nativeAdMarkup.eventTrackers)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.mobilefuse.sdk.component.ParsedAdMarkup
    @NotNull
    public String getAdm() {
        return this.adm;
    }

    public final /* synthetic */ <T extends NativeAsset> T getAsset(int i) {
        Iterator<NativeAsset> it = getAssets().iterator();
        while (it.hasNext()) {
            T t = (T) it.next();
            if (t.getId() == i) {
                Intrinsics.m17067n(3, "T");
                return t;
            }
        }
        return null;
    }

    @Nullable
    public final String getAssetUrl() {
        return this.assetUrl;
    }

    @NotNull
    public final List<NativeAsset> getAssets() {
        return this.assets;
    }

    @NotNull
    public final List<NativeEventTracker> getEventTrackers() {
        return this.eventTrackers;
    }

    @NotNull
    public final List<String> getImpTrackers() {
        return this.impTrackers;
    }

    @NotNull
    public final String getLink() {
        return this.link;
    }

    @NotNull
    public final String getPrivacy() {
        return this.privacy;
    }

    public int hashCode() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        String adm = getAdm();
        int i7 = 0;
        if (adm != null) {
            i = adm.hashCode();
        } else {
            i = 0;
        }
        int i8 = i * 31;
        String str = this.assetUrl;
        if (str != null) {
            i2 = str.hashCode();
        } else {
            i2 = 0;
        }
        int i9 = (i8 + i2) * 31;
        List<NativeAsset> list = this.assets;
        if (list != null) {
            i3 = list.hashCode();
        } else {
            i3 = 0;
        }
        int i10 = (i9 + i3) * 31;
        List<String> list2 = this.impTrackers;
        if (list2 != null) {
            i4 = list2.hashCode();
        } else {
            i4 = 0;
        }
        int i11 = (i10 + i4) * 31;
        String str2 = this.link;
        if (str2 != null) {
            i5 = str2.hashCode();
        } else {
            i5 = 0;
        }
        int i12 = (i11 + i5) * 31;
        String str3 = this.privacy;
        if (str3 != null) {
            i6 = str3.hashCode();
        } else {
            i6 = 0;
        }
        int i13 = (i12 + i6) * 31;
        List<NativeEventTracker> list3 = this.eventTrackers;
        if (list3 != null) {
            i7 = list3.hashCode();
        }
        return i13 + i7;
    }

    @NotNull
    public String toString() {
        return "NativeAdMarkup(adm=" + getAdm() + ", assetUrl=" + this.assetUrl + ", assets=" + this.assets + ", impTrackers=" + this.impTrackers + ", link=" + this.link + ", privacy=" + this.privacy + ", eventTrackers=" + this.eventTrackers + ")";
    }
}
