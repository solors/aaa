package com.mobilefuse.videoplayer.model;

import ae.KMarkers;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModelExtensions.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastDataModelExtensionsKt$getAdsChainIterator$1 implements Iterator<VastDataModel>, KMarkers {
    final /* synthetic */ boolean $onlyParentAds;
    final /* synthetic */ VastModel $this_getAdsChainIterator;
    @Nullable
    private VastTag itAd;

    /* JADX INFO: Access modifiers changed from: package-private */
    public VastDataModelExtensionsKt$getAdsChainIterator$1(VastModel vastModel, boolean z) {
        VastTag mainVastTag;
        this.$this_getAdsChainIterator = vastModel;
        this.$onlyParentAds = z;
        if (z) {
            mainVastTag = VastDataModelExtensions.getParentTag(vastModel, VastDataModelExtensions.getMainVastTag(vastModel));
        } else {
            mainVastTag = VastDataModelExtensions.getMainVastTag(vastModel);
        }
        this.itAd = mainVastTag;
    }

    @Nullable
    public final VastTag getItAd() {
        return this.itAd;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        VastDataModel vastDataModel;
        VastTag vastTag = this.itAd;
        if (vastTag != null) {
            if (vastTag != null) {
                vastDataModel = VastDataModelExtensions.getFirstAd(vastTag);
            } else {
                vastDataModel = null;
            }
            if (vastDataModel != null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setItAd(@Nullable VastTag vastTag) {
        this.itAd = vastTag;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    @NotNull
    public VastDataModel next() {
        VastTag vastTag = this.itAd;
        Intrinsics.m17074g(vastTag);
        this.itAd = VastDataModelExtensions.getParentTag(this.$this_getAdsChainIterator, vastTag);
        VastDataModel firstAd = VastDataModelExtensions.getFirstAd(vastTag);
        Intrinsics.m17074g(firstAd);
        return firstAd;
    }
}
