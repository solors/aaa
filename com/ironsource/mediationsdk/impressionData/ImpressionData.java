package com.ironsource.mediationsdk.impressionData;

import com.ironsource.C20086i9;
import com.ironsource.mediationsdk.logger.IronLog;
import java.text.DecimalFormat;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public class ImpressionData {
    public static final String IMPRESSION_DATA_KEY_ABTEST = "ab";
    public static final String IMPRESSION_DATA_KEY_AD_FORMAT = "adFormat";
    public static final String IMPRESSION_DATA_KEY_AD_NETWORK = "adNetwork";
    public static final String IMPRESSION_DATA_KEY_AD_UNIT = "adUnit";
    public static final String IMPRESSION_DATA_KEY_AUCTION_ID = "auctionId";
    public static final String IMPRESSION_DATA_KEY_COUNTRY = "country";
    public static final String IMPRESSION_DATA_KEY_ENCRYPTED_CPM = "encryptedCPM";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_ID = "instanceId";
    public static final String IMPRESSION_DATA_KEY_INSTANCE_NAME = "instanceName";
    public static final String IMPRESSION_DATA_KEY_LIFETIME_REVENUE = "lifetimeRevenue";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_ID = "mediationAdUnitId";
    public static final String IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME = "mediationAdUnitName";
    public static final String IMPRESSION_DATA_KEY_PLACEMENT = "placement";
    public static final String IMPRESSION_DATA_KEY_PRECISION = "precision";
    public static final String IMPRESSION_DATA_KEY_REVENUE = "revenue";
    public static final String IMPRESSION_DATA_KEY_SEGMENT_NAME = "segmentName";

    /* renamed from: a */
    private JSONObject f51604a;

    /* renamed from: b */
    private String f51605b;

    /* renamed from: c */
    private String f51606c;

    /* renamed from: d */
    private String f51607d;

    /* renamed from: e */
    private String f51608e;

    /* renamed from: f */
    private String f51609f;

    /* renamed from: g */
    private String f51610g;

    /* renamed from: h */
    private String f51611h;

    /* renamed from: i */
    private String f51612i;

    /* renamed from: j */
    private String f51613j;

    /* renamed from: k */
    private String f51614k;

    /* renamed from: l */
    private String f51615l;

    /* renamed from: m */
    private String f51616m;

    /* renamed from: n */
    private Double f51617n;

    /* renamed from: o */
    private String f51618o;

    /* renamed from: p */
    private Double f51619p;

    /* renamed from: q */
    private String f51620q;

    /* renamed from: r */
    private DecimalFormat f51621r = new DecimalFormat("#.#####");

    public ImpressionData(@NotNull ImpressionData impressionData) {
        this.f51605b = null;
        this.f51606c = null;
        this.f51607d = null;
        this.f51608e = null;
        this.f51609f = null;
        this.f51610g = null;
        this.f51611h = null;
        this.f51612i = null;
        this.f51613j = null;
        this.f51614k = null;
        this.f51615l = null;
        this.f51616m = null;
        this.f51617n = null;
        this.f51618o = null;
        this.f51619p = null;
        this.f51620q = null;
        this.f51604a = impressionData.f51604a;
        this.f51605b = impressionData.f51605b;
        this.f51606c = impressionData.f51606c;
        this.f51607d = impressionData.f51607d;
        this.f51608e = impressionData.f51608e;
        this.f51609f = impressionData.f51609f;
        this.f51610g = impressionData.f51610g;
        this.f51611h = impressionData.f51611h;
        this.f51612i = impressionData.f51612i;
        this.f51613j = impressionData.f51613j;
        this.f51614k = impressionData.f51614k;
        this.f51615l = impressionData.f51615l;
        this.f51616m = impressionData.f51616m;
        this.f51618o = impressionData.f51618o;
        this.f51620q = impressionData.f51620q;
        this.f51619p = impressionData.f51619p;
        this.f51617n = impressionData.f51617n;
    }

    public String getAb() {
        return this.f51611h;
    }

    public String getAdFormat() {
        return this.f51609f;
    }

    public String getAdNetwork() {
        return this.f51614k;
    }

    @Deprecated
    public String getAdUnit() {
        return this.f51606c;
    }

    public JSONObject getAllData() {
        return this.f51604a;
    }

    public String getAuctionId() {
        return this.f51605b;
    }

    public String getCountry() {
        return this.f51610g;
    }

    public String getEncryptedCPM() {
        return this.f51620q;
    }

    public String getInstanceId() {
        return this.f51616m;
    }

    public String getInstanceName() {
        return this.f51615l;
    }

    @Deprecated
    public Double getLifetimeRevenue() {
        return this.f51619p;
    }

    public String getMediationAdUnitId() {
        return this.f51608e;
    }

    public String getMediationAdUnitName() {
        return this.f51607d;
    }

    public String getPlacement() {
        return this.f51613j;
    }

    public String getPrecision() {
        return this.f51618o;
    }

    public Double getRevenue() {
        return this.f51617n;
    }

    public String getSegmentName() {
        return this.f51612i;
    }

    public void replaceMacroForPlacementWithValue(String str, String str2) {
        String str3 = this.f51613j;
        if (str3 != null) {
            String replace = str3.replace(str, str2);
            this.f51613j = replace;
            JSONObject jSONObject = this.f51604a;
            if (jSONObject != null) {
                try {
                    jSONObject.put("placement", replace);
                } catch (JSONException e) {
                    C20086i9.m57997d().m58003a(e);
                    IronLog.INTERNAL.error(e.toString());
                }
            }
        }
    }

    public String toString() {
        String format;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("auctionId: '");
        sb2.append(this.f51605b);
        sb2.append('\'');
        sb2.append(", adUnit: '");
        sb2.append(this.f51606c);
        sb2.append('\'');
        sb2.append(", mediationAdUnitName: '");
        sb2.append(this.f51607d);
        sb2.append('\'');
        sb2.append(", mediationAdUnitId: '");
        sb2.append(this.f51608e);
        sb2.append('\'');
        sb2.append(", adFormat: '");
        sb2.append(this.f51609f);
        sb2.append('\'');
        sb2.append(", country: '");
        sb2.append(this.f51610g);
        sb2.append('\'');
        sb2.append(", ab: '");
        sb2.append(this.f51611h);
        sb2.append('\'');
        sb2.append(", segmentName: '");
        sb2.append(this.f51612i);
        sb2.append('\'');
        sb2.append(", placement: '");
        sb2.append(this.f51613j);
        sb2.append('\'');
        sb2.append(", adNetwork: '");
        sb2.append(this.f51614k);
        sb2.append('\'');
        sb2.append(", instanceName: '");
        sb2.append(this.f51615l);
        sb2.append('\'');
        sb2.append(", instanceId: '");
        sb2.append(this.f51616m);
        sb2.append('\'');
        sb2.append(", revenue: ");
        Double d = this.f51617n;
        String str = null;
        if (d == null) {
            format = null;
        } else {
            format = this.f51621r.format(d);
        }
        sb2.append(format);
        sb2.append(", precision: '");
        sb2.append(this.f51618o);
        sb2.append('\'');
        sb2.append(", lifetimeRevenue: ");
        Double d2 = this.f51619p;
        if (d2 != null) {
            str = this.f51621r.format(d2);
        }
        sb2.append(str);
        sb2.append(", encryptedCPM: '");
        sb2.append(this.f51620q);
        sb2.append('\'');
        return sb2.toString();
    }

    public ImpressionData(JSONObject jSONObject) {
        Double d = null;
        this.f51605b = null;
        this.f51606c = null;
        this.f51607d = null;
        this.f51608e = null;
        this.f51609f = null;
        this.f51610g = null;
        this.f51611h = null;
        this.f51612i = null;
        this.f51613j = null;
        this.f51614k = null;
        this.f51615l = null;
        this.f51616m = null;
        this.f51617n = null;
        this.f51618o = null;
        this.f51619p = null;
        this.f51620q = null;
        if (jSONObject != null) {
            try {
                this.f51604a = jSONObject;
                this.f51605b = jSONObject.optString("auctionId", null);
                this.f51606c = jSONObject.optString("adUnit", null);
                this.f51607d = jSONObject.optString(IMPRESSION_DATA_KEY_MEDIATION_AD_UNIT_NAME, null);
                this.f51608e = jSONObject.optString("mediationAdUnitId", null);
                this.f51609f = jSONObject.optString(IMPRESSION_DATA_KEY_AD_FORMAT, null);
                this.f51610g = jSONObject.optString("country", null);
                this.f51611h = jSONObject.optString(IMPRESSION_DATA_KEY_ABTEST, null);
                this.f51612i = jSONObject.optString(IMPRESSION_DATA_KEY_SEGMENT_NAME, null);
                this.f51613j = jSONObject.optString("placement", null);
                this.f51614k = jSONObject.optString(IMPRESSION_DATA_KEY_AD_NETWORK, null);
                this.f51615l = jSONObject.optString("instanceName", null);
                this.f51616m = jSONObject.optString("instanceId", null);
                this.f51618o = jSONObject.optString(IMPRESSION_DATA_KEY_PRECISION, null);
                this.f51620q = jSONObject.optString(IMPRESSION_DATA_KEY_ENCRYPTED_CPM, null);
                double optDouble = jSONObject.optDouble(IMPRESSION_DATA_KEY_LIFETIME_REVENUE);
                this.f51619p = Double.isNaN(optDouble) ? null : Double.valueOf(optDouble);
                double optDouble2 = jSONObject.optDouble("revenue");
                if (!Double.isNaN(optDouble2)) {
                    d = Double.valueOf(optDouble2);
                }
                this.f51617n = d;
            } catch (Exception e) {
                C20086i9.m57997d().m58003a(e);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.error("error parsing impression " + e.getMessage());
            }
        }
    }
}
