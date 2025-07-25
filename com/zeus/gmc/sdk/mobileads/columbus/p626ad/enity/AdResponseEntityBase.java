package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32467cioccoiococ;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity;
import java.util.Collection;
import java.util.List;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.AdResponseEntityBase */
/* loaded from: classes8.dex */
public abstract class AdResponseEntityBase<T extends IAdInfoEntity> extends ResponseEntityBase implements IAdResponseEntity {
    @SerializedName(alternate = {"adInfoList"}, value = "adInfos")
    @Expose
    private List<T> adInfos;

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdResponseEntity
    public final List<T> c2oc2o() {
        return C32467cioccoiococ.coo2iico((List) this.adInfos);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdResponseEntity
    public final boolean cco22() {
        return C32467cioccoiococ.c2oc2i(this.adInfos);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdResponseEntity
    public final int cioccoiococ() {
        return C32467cioccoiococ.coo2iico((Collection) this.adInfos);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdResponseEntity
    /* renamed from: coi222o222 */
    public final T coo2iico(int i) {
        return (T) C32467cioccoiococ.coo2iico(this.adInfos, i);
    }
}
