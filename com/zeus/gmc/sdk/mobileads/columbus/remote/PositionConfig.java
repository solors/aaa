package com.zeus.gmc.sdk.mobileads.columbus.remote;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import java.util.List;

/* loaded from: classes8.dex */
public class PositionConfig extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String c2oc2i = "PositionConfig";
    @SerializedName("adPosition")
    @Expose
    private List<Integer> coi222o222;
    @SerializedName("tagId")
    @Expose
    private String coo2iico;

    public List<Integer> cicic() {
        return this.coi222o222;
    }

    public String coo2iico() {
        return this.coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return c2oc2i;
    }
}
