package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import java.util.List;
import java.util.Map;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.AdRequest */
/* loaded from: classes8.dex */
public class AdRequest extends GsonEntityBase {
    private static final int DEFAULT_AD_COUNT = 1;
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "AdRequest";
    @Expose
    public int adCount = 1;
    @Expose
    public String bucketid;
    @Expose
    public List<String> categoryList;
    @Expose
    public Map<String, String> customMap;
    @Expose
    public String dcid;
    @Expose
    public String exceptPackages;
    @Expose
    public int height;
    @Expose
    public String mediaExpIds;
    @Expose
    public String mraidver;
    @Expose
    public String query;
    @Expose
    public Map<String, String> subTagIdMediaExpIds;
    @Expose
    public Map<String, Integer> subTagIds;
    @Expose
    public String tagId;
    @Expose
    public int width;

    public static AdRequest coo2iico(String str) {
        return (AdRequest) C32459ciii2coi2.coo2iico(AdRequest.class, str, TAG);
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }
}
