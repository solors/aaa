package com.mobilefuse.videoplayer.model;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: VastDataModel.kt */
@Metadata
/* loaded from: classes7.dex */
public final class VastModel {
    @Nullable
    private final VastDataModel selectedAd;
    @NotNull
    private final List<VastTag> vastTagChain;

    public VastModel(@NotNull List<VastTag> vastTagChain) {
        Intrinsics.checkNotNullParameter(vastTagChain, "vastTagChain");
        this.vastTagChain = vastTagChain;
        this.selectedAd = VastDataModelExtensions.getFirstAd(VastDataModelExtensions.getMainVastTag(this));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VastModel copy$default(VastModel vastModel, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = vastModel.vastTagChain;
        }
        return vastModel.copy(list);
    }

    @NotNull
    public final List<VastTag> component1() {
        return this.vastTagChain;
    }

    @NotNull
    public final VastModel copy(@NotNull List<VastTag> vastTagChain) {
        Intrinsics.checkNotNullParameter(vastTagChain, "vastTagChain");
        return new VastModel(vastTagChain);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (!(obj instanceof VastModel) || !Intrinsics.m17075f(this.vastTagChain, ((VastModel) obj).vastTagChain)) {
                return false;
            }
            return true;
        }
        return true;
    }

    @Nullable
    public final VastDataModel getSelectedAd() {
        return this.selectedAd;
    }

    @NotNull
    public final List<VastTag> getVastTagChain() {
        return this.vastTagChain;
    }

    public int hashCode() {
        List<VastTag> list = this.vastTagChain;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    @NotNull
    public String toString() {
        return "VastModel(vastTagChain=" + this.vastTagChain + ")";
    }
}
