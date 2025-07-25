package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import com.p552ot.pubsub.p561i.p562a.C26559a;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.ResponseEntityBase */
/* loaded from: classes8.dex */
public abstract class ResponseEntityBase extends GsonEntityBase implements IResponseEntity {
    @SerializedName("message")
    @Expose
    private String errorMessage;
    @SerializedName(C26559a.f69635d)
    @Expose
    private int status = -1;

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public final boolean ciii2coi2() {
        if (this.status == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public final String coi222o222() {
        return this.errorMessage;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public final int coiic() {
        return this.status;
    }
}
