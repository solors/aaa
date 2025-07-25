package com.zeus.gmc.sdk.mobileads.columbus.analytic;

import android.text.TextUtils;
import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.common.GlobalHolder;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32453ccoc2oic;
import com.zeus.gmc.sdk.mobileads.columbus.internal.cicc2iiccc.C32573coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.util.AndroidUtils;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public class AnalyticsInfo {
    private static final String coi222o222 = "AnalyticsInfo";
    public String adEvent;
    public long adid;
    public String clickArea;
    public String click_time;
    public String close_time;
    public String configKey;
    public String creativeType;
    public String endCardStyleId;
    public String error_info;

    /* renamed from: ex */
    public String f89358ex;
    public int getWhen;
    public String installPackage;
    public String interactiveTime;
    public String loadTime;
    public long load_time;
    public String mTagId;
    public long materialSize;
    public String mediaExpIds;
    public List<String> monitors;
    public int parallelism;
    public String query;
    public String realTagId;
    public String reason;
    public int selections;
    public String tagId;
    public long times;
    public String track_duration;
    public String url;
    public String videoStyleId;
    public int isPre = -1;
    public long request_time = -1;
    public int error_code = -1;
    public long fill_time = -1;
    public int fill_state = -1;
    public long fill_cost = -1;
    public int source = -1;
    public int load_when = -1;
    public int req_ads = -1;
    public int rsp_ads = -1;
    public int loc_ads = -1;
    public int msa_version = -1;
    public int msa_ads = -1;
    public int sdk_ads = -1;
    public int isCta = -1;
    public int endCardShowWay = -1;
    private Map<String, String> coo2iico = new ConcurrentHashMap();

    private void coo2iico(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        this.coo2iico.put(str, str2);
    }

    public String getExtraValue() {
        try {
            coo2iico("source", this.source);
            coo2iico(Constants.LOAD_WHEN, this.load_when);
            coo2iico(Constants.REQ_ADS, this.req_ads);
            coo2iico(Constants.RSP_ADS, this.rsp_ads);
            coo2iico(Constants.LOC_ADS, this.loc_ads);
            coo2iico(Constants.MSA_VERSION, this.msa_version);
            coo2iico(Constants.MSA_ADS, this.msa_ads);
            coo2iico(Constants.SDK_ADS, this.sdk_ads);
            coo2iico("loadTime", this.load_time);
            coo2iico(Constants.ADID, this.adid);
            coo2iico(Constants.MATERIAL_SIZE, this.materialSize);
            coo2iico(Constants.ERROR_CODE, this.error_code);
            coo2iico("mediaappversion", String.valueOf(AndroidUtils.getAppVersion(GlobalHolder.getApplicationContext())));
            coo2iico("cosdkversion", C32573coo2iico.cco22.replace(".", ""));
            coo2iico("errorinfo", this.error_info);
            coo2iico(Constants.REAL_TAGID, this.realTagId);
            coo2iico(Constants.SELECTIONS, String.valueOf(this.selections));
            coo2iico("url", this.url);
            coo2iico(Constants.CLICK_AREA_IS_CTA, this.isCta);
            coo2iico("creativeType", this.creativeType);
            coo2iico("query", this.query);
            coo2iico("tagid", this.tagId);
            coo2iico("netWork", C32453ccoc2oic.coi222o222(GlobalHolder.getApplicationContext()));
            coo2iico(Constants.GET_WHEN, this.getWhen);
            coo2iico(Constants.VIDEO_STYLE_ID, this.videoStyleId);
            coo2iico(Constants.ENDCARD_STYLE_ID, this.endCardStyleId);
            coo2iico("loadTime", this.loadTime);
            coo2iico(Constants.ENDCARD_INTERACTIVE_TIME, this.interactiveTime);
            coo2iico(Constants.ENDCARD_SHOW_WAY, this.endCardShowWay);
            coo2iico(Constants.MEDIA_EXP_IDS, this.mediaExpIds);
            JSONObject jSONObject = new JSONObject();
            if (this.coo2iico.isEmpty()) {
                return null;
            }
            for (Map.Entry<String, String> entry : this.coo2iico.entrySet()) {
                jSONObject.put(entry.getKey(), entry.getValue());
            }
            return jSONObject.toString();
        } catch (JSONException e) {
            MLog.m25888e(coi222o222, "error", e);
            return null;
        }
    }

    private void coo2iico(String str, int i) {
        if (TextUtils.isEmpty(str) || i == -1) {
            return;
        }
        coo2iico(str, String.valueOf(i));
    }

    private void coo2iico(String str, long j) {
        if (TextUtils.isEmpty(str) || j == -1) {
            return;
        }
        coo2iico(str, String.valueOf(j));
    }
}
