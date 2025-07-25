package sg.bigo.ads.controller.p944a;

import androidx.annotation.NonNull;
import androidx.media3.exoplayer.upstream.CmcdConfiguration;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import com.facebook.appevents.UserDataStore;
import com.ironsource.C19577ad;
import com.mbridge.msdk.foundation.download.core.DownloadCommon;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.unity3d.services.ads.gmascar.utils.ScarConstants;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.C32111coo2iico;
import io.appmetrica.analytics.impl.AbstractC34805pe;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.utils.svgparser.utils.SVGParserImpl;
import sg.bigo.ads.common.utils.C43836q;

/* renamed from: sg.bigo.ads.controller.a.i */
/* loaded from: classes10.dex */
public final class C43957i {

    /* renamed from: a */
    private static final Map<String, String> f115122a;

    static {
        HashMap hashMap = new HashMap();
        f115122a = hashMap;
        hashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADFORMAT, "asia");
        hashMap.put(CampaignEx.JSON_KEY_AD_AL, "asia");
        hashMap.put("az", "asia");
        hashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_ADAPTEREVENT, "asia");
        hashMap.put("bh", "asia");
        hashMap.put("bd", "asia");
        hashMap.put("bt", "asia");
        hashMap.put(ScarConstants.BN_SIGNAL_KEY, "asia");
        hashMap.put("cn", "asia");
        hashMap.put("cy", "asia");
        hashMap.put("hk", "asia");
        hashMap.put("in", "asia");
        hashMap.put("id", "asia");
        hashMap.put("ir", "asia");
        hashMap.put("iq", "asia");
        hashMap.put("il", "asia");
        hashMap.put("jp", "asia");
        hashMap.put("jo", "asia");
        hashMap.put("kz", "asia");
        hashMap.put("kp", "asia");
        hashMap.put("kr", "asia");
        hashMap.put("kh", "asia");
        hashMap.put("kw", "asia");
        hashMap.put("la", "asia");
        hashMap.put("lb", "asia");
        hashMap.put("lu", "asia");
        hashMap.put(C32111coo2iico.C32113cioccoiococ.ciii2coi2, "asia");
        hashMap.put("my", "asia");
        hashMap.put("mv", "asia");
        hashMap.put("mn", "asia");
        hashMap.put("np", "asia");
        hashMap.put("om", "asia");
        hashMap.put("pk", "asia");
        hashMap.put(UserDataStore.PHONE, "asia");
        hashMap.put("qa", "asia");
        hashMap.put("sa", "asia");
        hashMap.put(C19577ad.f49075R0, "asia");
        hashMap.put("sy", "asia");
        hashMap.put("tw", "asia");
        hashMap.put("tj", "asia");
        hashMap.put("th", "asia");
        hashMap.put("tm", "asia");
        hashMap.put("va", "asia");
        hashMap.put("vn", "asia");
        hashMap.put("ye", "asia");
        hashMap.put("au", "asia");
        hashMap.put("ck", "asia");
        hashMap.put("fj", "asia");
        hashMap.put("gu", "asia");
        hashMap.put("nz", "asia");
        hashMap.put("pg", "asia");
        hashMap.put("to", "asia");
        hashMap.put("at", "europe");
        hashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_BIDEVENT, "europe");
        hashMap.put("bg", "europe");
        hashMap.put("ch", "europe");
        hashMap.put("cz", "europe");
        hashMap.put("dk", "europe");
        hashMap.put(DownloadCommon.DOWNLOAD_REPORT_DOWNLOAD_ERROR, "europe");
        hashMap.put("es", "europe");
        hashMap.put("ee", "europe");
        hashMap.put("fi", "europe");
        hashMap.put("fr", "europe");
        hashMap.put("gr", "europe");
        hashMap.put("gb", "europe");
        hashMap.put("hr", "europe");
        hashMap.put("hu", "europe");
        hashMap.put("is", "europe");
        hashMap.put(ApsMetricsDataMap.APSMETRICS_FIELD_IMPRESSIONEVENT, "europe");
        hashMap.put("it", "europe");
        hashMap.put("lv", "europe");
        hashMap.put("lt", "europe");
        hashMap.put(C19577ad.f49057I0, "europe");
        hashMap.put("md", "europe");
        hashMap.put("mc", "europe");
        hashMap.put("nl", "europe");
        hashMap.put(SVGParserImpl.XML_STYLESHEET_ATTR_ALTERNATE_NO, "europe");
        hashMap.put("pl", "europe");
        hashMap.put("pt", "europe");
        hashMap.put("ro", "europe");
        hashMap.put("ru", "europe");
        hashMap.put("sm", "europe");
        hashMap.put("sk", "europe");
        hashMap.put("se", "europe");
        hashMap.put("ua", "europe");
        hashMap.put("uk", "europe");
        hashMap.put("yu", "europe");
        hashMap.put(CmcdConfiguration.KEY_BUFFER_STARVATION, "america");
        hashMap.put("bm", "america");
        hashMap.put(DownloadCommon.DOWNLOAD_REPORT_CANCEL, "america");
        hashMap.put("cr", "america");
        hashMap.put("cu", "america");
        hashMap.put("gd", "america");
        hashMap.put("gt", "america");
        hashMap.put(DownloadCommon.DOWNLOAD_REPORT_HOST, "america");
        hashMap.put("hn", "america");
        hashMap.put("jm", "america");
        hashMap.put("mx", "america");
        hashMap.put("ni", "america");
        hashMap.put("pa", "america");
        hashMap.put("us", "america");
        hashMap.put("ve", "america");
        hashMap.put("ar", "america");
        hashMap.put("bo", "america");
        hashMap.put("br", "america");
        hashMap.put("cl", "america");
        hashMap.put("co", "america");
        hashMap.put("ec", "america");
        hashMap.put("gy", "america");
        hashMap.put("py", "america");
        hashMap.put(AbstractC34805pe.f95178c, "america");
        hashMap.put("uy", "america");
    }

    @NonNull
    /* renamed from: a */
    public static String m4512a(String str) {
        String str2;
        if (C43836q.m4837a((CharSequence) str) || (str2 = f115122a.get(str.toLowerCase())) == null) {
            return "";
        }
        return str2;
    }
}
