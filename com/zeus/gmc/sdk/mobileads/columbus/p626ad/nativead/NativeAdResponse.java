package com.zeus.gmc.sdk.mobileads.columbus.p626ad.nativead;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.C32644c2oc2i;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.NativeAdInfo;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.SkuInfo;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.nativead.NativeAdResponse */
/* loaded from: classes8.dex */
public class NativeAdResponse implements IResponseEntity {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String cco22 = "NativeAdResponse";
    private static final String cii2c2 = "adInfos";
    private static final String ciii2coi2 = "status";
    private static final String coiic = "message";
    private JSONObject c2oc2i;
    public int c2oc2o;
    private List<NativeAdInfo> cioccoiococ;
    private String coi222o222;
    private int coo2iico;

    private NativeAdResponse(String str) {
        this.coo2iico = -1;
        this.c2oc2o = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.c2oc2i = jSONObject;
            int optInt = jSONObject.optInt("status", -1);
            this.coo2iico = optInt;
            if (optInt == 0) {
                JSONArray jSONArray = jSONObject.getJSONArray(cii2c2);
                this.cioccoiococ = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    NativeAdInfo coo2iico = NativeAdInfo.coo2iico(jSONArray.getJSONObject(i));
                    if (coo2iico != null && coo2iico(coo2iico)) {
                        this.cioccoiococ.add(coo2iico);
                        this.c2oc2o = 0;
                    } else {
                        MLog.m25889e(cco22, "invalid or empty ad !");
                        if (this.c2oc2o != 0) {
                            this.c2oc2o = C32644c2oc2i.cco22.coo2iico();
                        }
                    }
                }
                return;
            }
            this.c2oc2i = null;
            this.cioccoiococ = Collections.EMPTY_LIST;
            String optString = jSONObject.optString("message", null);
            this.coi222o222 = optString;
            if (!TextUtils.isEmpty(optString)) {
                MLog.m25889e(cco22, "Fetch ad failure: " + this.coi222o222);
            } else {
                MLog.m25889e(cco22, "Fetch ad failure, no error message.");
            }
            this.c2oc2o = this.coo2iico;
        } catch (Exception e) {
            MLog.m25888e(cco22, "NativeAdResponse e : ", e);
            this.c2oc2o = NativeAdError.INTERNAL_ERROR.getErrorCode();
        }
    }

    public static final NativeAdResponse coo2iico(String str) {
        return new NativeAdResponse(str);
    }

    protected String cicc2iiccc() {
        return cco22;
    }

    public List<NativeAdInfo> cicic() {
        return this.cioccoiococ;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public boolean ciii2coi2() {
        if (this.coo2iico == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public String coi222o222() {
        return this.coi222o222;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public int coiic() {
        return this.coo2iico;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IEntity
    public String serialize() {
        return this.c2oc2i.toString();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IGsonEntity
    public JSONObject toJson() {
        return this.c2oc2i;
    }

    public String toString() {
        return serialize();
    }

    private boolean coo2iico(NativeAdInfo nativeAdInfo) {
        boolean z = (TextUtils.isEmpty(nativeAdInfo.cc2o22co2c()) || TextUtils.isEmpty(nativeAdInfo.ciiio2o()) || TextUtils.isEmpty(nativeAdInfo.c22o22co22i()) || TextUtils.isEmpty(nativeAdInfo.cici2o2oo()) || TextUtils.isEmpty(nativeAdInfo.ciio2c()) || TextUtils.isEmpty(nativeAdInfo.cioc2())) ? false : true;
        SkuInfo co2c2o2 = nativeAdInfo.co2c2o2();
        if (co2c2o2 != null) {
            try {
                if (!TextUtils.isEmpty(nativeAdInfo.cc2o22co2c()) && !TextUtils.isEmpty(nativeAdInfo.ciiio2o()) && !TextUtils.isEmpty(nativeAdInfo.c22o22co22i()) && !TextUtils.isEmpty(nativeAdInfo.ciio2c()) && !TextUtils.isEmpty(nativeAdInfo.c2cic2()) && !TextUtils.isEmpty(co2c2o2.coiio2()) && !TextUtils.isEmpty(co2c2o2.cicic())) {
                    if (Float.parseFloat(co2c2o2.ccoc2oic()) > 0.0f) {
                        return true;
                    }
                }
                return false;
            } catch (Exception e) {
                MLog.m25888e(cco22, "checkInfoInvalid e : ", e);
            }
        }
        return z;
    }
}
