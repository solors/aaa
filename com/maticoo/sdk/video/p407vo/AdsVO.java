package com.maticoo.sdk.video.p407vo;

import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import com.maticoo.sdk.video.util.Utils;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Keep
/* renamed from: com.maticoo.sdk.video.vo.AdsVO */
/* loaded from: classes6.dex */
public class AdsVO implements Serializable {
    public String adid;
    public APPWALL_TYPE appwallType;
    public String bakClickTrackUrl;
    public String bakImpTrackUrl;
    public List<String> bak_clk_tk_url;
    public String bak_html;
    public String bak_img_url;
    public List<String> bak_imp_tk_url;
    public CREATIVE_TYPE bak_type;
    public String clickUrl;
    public String clkTBK;
    public List<String> dlFailTrackUrl;
    public List<String> dlSuccTrackUrl;
    public long expireTime;
    public String final_url;
    public String impTBK;
    public String impid;
    public boolean isre;
    public LANDING_TYPE landingType;
    public int playNum;
    public boolean preClick;
    public String preClickTrackUrl;
    public String preImpTrackUrl;
    public List<String> pre_clk_tk_url;
    public String pre_html;
    public String pre_img_url;
    public List<String> pre_imp_tk_url;
    public CREATIVE_TYPE pre_type;
    public List<QuickClickHelper> quickClickHelpers = new ArrayList();
    public String url_schema;
    public String vastXmlData;

    @Keep
    /* renamed from: com.maticoo.sdk.video.vo.AdsVO$APPWALL_TYPE */
    /* loaded from: classes6.dex */
    public enum APPWALL_TYPE implements Serializable {
        FEATURE,
        GAME,
        TOOL,
        TOP,
        UNKNOWN;

        public static APPWALL_TYPE getAppwallType(String str) {
            if (TextUtils.isEmpty(str)) {
                return UNKNOWN;
            }
            try {
                return valueOf(str.trim().toUpperCase());
            } catch (IllegalArgumentException unused) {
                return UNKNOWN;
            }
        }
    }

    /* renamed from: com.maticoo.sdk.video.vo.AdsVO$CREATIVE_TYPE */
    /* loaded from: classes6.dex */
    public enum CREATIVE_TYPE implements Serializable {
        IMAGE,
        HTML,
        VIDEO,
        UNKNOWN;

        public static CREATIVE_TYPE getCreativeType(String str) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0 && parseInt < values().length) {
                    return values()[parseInt];
                }
                return UNKNOWN;
            } catch (NumberFormatException unused) {
                Log.i("", "Unknown creative type");
                return UNKNOWN;
            }
        }
    }

    @Keep
    /* renamed from: com.maticoo.sdk.video.vo.AdsVO$LANDING_TYPE */
    /* loaded from: classes6.dex */
    public enum LANDING_TYPE implements Serializable {
        GOOGLE_PLAY,
        OUT_BROWSER_OPEN,
        INNER_WEBVIEW_OPEN,
        SUB,
        DEEP_LINK,
        UNKNOWN;

        public static LANDING_TYPE getLandingType(String str) {
            try {
                int parseInt = Integer.parseInt(str);
                if (parseInt >= 0 && parseInt < values().length) {
                    return values()[parseInt];
                }
                return UNKNOWN;
            } catch (NumberFormatException unused) {
                Log.i("", "Unknown landing type");
                return UNKNOWN;
            }
        }
    }

    /* renamed from: com.maticoo.sdk.video.vo.AdsVO$QuickClickHelper */
    /* loaded from: classes6.dex */
    public static class QuickClickHelper implements Serializable {
        public int type;
        public String url;
    }

    public boolean isDataValid() {
        if (Utils.isNotEmpty(this.adid) && Utils.isNotEmpty(this.impid) && this.landingType != null) {
            return true;
        }
        return false;
    }

    public String toString() {
        return "adid:" + this.adid + " impid:" + this.impid;
    }
}
