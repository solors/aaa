package com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity;

import android.text.TextUtils;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32456cici2o2oo;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cccoo22o2.C32527coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.C32111coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.enity.AdInfoEntityBase */
/* loaded from: classes8.dex */
public abstract class AdInfoEntityBase extends GsonEntityBase implements IAdInfoEntity {
    private static final String TAG = "AdInfoEntityBase";
    @SerializedName("ex")
    @Expose
    private String adPassBack;
    @SerializedName("browserType")
    @Expose
    private int browserType;
    @SerializedName("creativeType")
    @Expose
    private String creativeType;
    @SerializedName(SDKConstants.PARAM_TOURNAMENTS_DEEPLINK)
    @Expose
    private String deepLink;
    @SerializedName("tagId")
    @Expose
    String mTagId;
    @SerializedName(C32111coo2iico.C32113cioccoiococ.ciii2coi2)
    @Expose

    /* renamed from: mo */
    private String f89352mo;
    @SerializedName("parallelism")
    @Expose
    private int parallelism;
    @Expose

    /* renamed from: id */
    private long f89351id = 0;
    @SerializedName("areaShowed")
    @Expose
    private int areaShowed = 50;

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity
    public final String c2oc2i() {
        return C32456cici2o2oo.coo2iico(this.adPassBack);
    }

    public int c2oicci2() {
        return this.parallelism;
    }

    public String ccoc2oic() {
        return this.deepLink;
    }

    public int cicc2iiccc() {
        return this.browserType;
    }

    public int cicic() {
        return this.areaShowed;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity
    public String cii2c2() {
        return this.creativeType;
    }

    public double coiio2() {
        try {
            if (TextUtils.isEmpty(this.f89352mo)) {
                return 0.0d;
            }
            return Double.parseDouble(C32527coo2iico.coo2iico(this.f89352mo));
        } catch (Exception e) {
            MLog.m25891d(TAG, "error:", e);
            return 0.0d;
        }
    }

    public void coo2iico(String str) {
        this.creativeType = str;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity
    public final long getId() {
        return this.f89351id;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity
    public String coo2iico() {
        return this.mTagId;
    }
}
