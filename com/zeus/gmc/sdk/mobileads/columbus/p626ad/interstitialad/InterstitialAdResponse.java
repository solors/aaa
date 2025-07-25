package com.zeus.gmc.sdk.mobileads.columbus.p626ad.interstitialad;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.InterstitialAdInfo;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.interstitialad.InterstitialAdResponse */
/* loaded from: classes8.dex */
public class InterstitialAdResponse implements IResponseEntity {
    private static final String cco22 = "InterstitialAdResponse";
    private static final String cii2c2 = "status";
    private static final String ciii2coi2 = "adInfos";
    private static final String coiic = "message";
    private List<InterstitialAdInfo> c2oc2i;
    public int c2oc2o;
    private String cioccoiococ;
    private int coi222o222;
    private JSONObject coo2iico;

    private InterstitialAdResponse(String str) {
        this.coi222o222 = -1;
        this.c2oc2o = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.coo2iico = jSONObject;
            int optInt = jSONObject.optInt("status", -1);
            this.coi222o222 = optInt;
            if (optInt == 0) {
                JSONArray jSONArray = jSONObject.getJSONArray(ciii2coi2);
                this.c2oc2i = new ArrayList(jSONArray.length());
                for (int i = 0; i < jSONArray.length(); i++) {
                    InterstitialAdInfo coo2iico = InterstitialAdInfo.coo2iico(jSONArray.getJSONObject(i));
                    if (coo2iico != null && coo2iico(coo2iico)) {
                        this.c2oc2i.add(coo2iico);
                        this.c2oc2o = 0;
                    } else {
                        MLog.m25889e(cco22, "invalid or empty ad!");
                        if (this.c2oc2o != 0) {
                            this.c2oc2o = InterstitialAdError.ADINFO_IS_INVALID.getErrorCode();
                        }
                    }
                }
                return;
            }
            this.coo2iico = null;
            this.c2oc2i = Collections.EMPTY_LIST;
            String optString = jSONObject.optString("message", null);
            this.cioccoiococ = optString;
            if (!TextUtils.isEmpty(optString)) {
                MLog.m25889e(cco22, "Fetch ad failure: " + this.cioccoiococ);
            } else {
                MLog.m25889e(cco22, "Fetch ad failure: no error message");
            }
            this.c2oc2o = this.coi222o222;
        } catch (Exception e) {
            MLog.m25888e(cco22, "InterstitialAdResponse exception:", e);
            this.c2oc2o = InterstitialAdError.INTERNAL_ERROR.getErrorCode();
        }
    }

    public static final InterstitialAdResponse coo2iico(String str) {
        return new InterstitialAdResponse(str);
    }

    public List<InterstitialAdInfo> cicic() {
        return this.c2oc2i;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public boolean ciii2coi2() {
        if (this.coi222o222 == 0) {
            return true;
        }
        return false;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public String coi222o222() {
        return this.cioccoiococ;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IResponseEntity
    public int coiic() {
        return this.coi222o222;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IEntity
    public String serialize() {
        return this.coo2iico.toString();
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IGsonEntity
    public JSONObject toJson() {
        return this.coo2iico;
    }

    public String toString() {
        return serialize();
    }

    private boolean coo2iico(InterstitialAdInfo interstitialAdInfo) {
        return !TextUtils.isEmpty(interstitialAdInfo.ciio2c());
    }
}
