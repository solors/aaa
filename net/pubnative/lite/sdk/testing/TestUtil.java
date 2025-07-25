package net.pubnative.lite.sdk.testing;

import com.learnings.abcenter.util.AbCenterConstant;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.pubnative.lite.sdk.models.APIAsset;
import net.pubnative.lite.sdk.models.APIMeta;
import net.pubnative.lite.sdk.models.AdData;
import net.pubnative.lite.sdk.models.AdRequest;
import net.pubnative.lite.sdk.models.AdResponse;
import net.pubnative.lite.sdk.models.C38595Ad;
import net.pubnative.lite.sdk.models.PNAdRequest;
import net.pubnative.lite.sdk.models.Protocol;
import net.pubnative.lite.sdk.p805db.SessionImpression;

/* loaded from: classes10.dex */
public class TestUtil {
    private static List<AdData> createMockAssets() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = APIAsset.HTML_BANNER;
        HashMap hashMap = new HashMap(3);
        adData.data = hashMap;
        hashMap.put(POBNativeConstants.NATIVE_IMAGE_WIDTH, 320);
        adData.data.put("h", 50);
        adData.data.put("html", "<a href=\"https://ads.com/click/112770_1386565997\"><img src=\"https://cdn.pubnative.net/widget/v3/assets/320x50.jpg\" width=\"320\" height=\"50\" border=\"0\" alt=\"Advertisement\" /></a>");
        arrayList.add(adData);
        return arrayList;
    }

    private static List<AdData> createMockBeacons() {
        ArrayList arrayList = new ArrayList(3);
        arrayList.addAll(createMockImpressionBeacons());
        arrayList.addAll(createMockClickBeacons());
        return arrayList;
    }

    public static List<AdData> createMockClickBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = "click";
        HashMap hashMap = new HashMap(1);
        adData.data = hashMap;
        hashMap.put("url", "https://got.pubnative.net/click/rtb?aid=1036637");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockCompanionAdEventsBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = C38595Ad.Beacon.COMPANION_AD_EVENT;
        HashMap hashMap = new HashMap(1);
        adData.data = hashMap;
        hashMap.put("url", "https://got.pubnative.net/companionadevent/rtb?eventtype=[EVENTTYPE]&error=[ERRORCODE]");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockCustomEndcardBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = C38595Ad.Beacon.CUSTOM_ENDCARD_EVENT;
        HashMap hashMap = new HashMap(1);
        adData.data = hashMap;
        hashMap.put("url", "https://got.pubnative.net/customendcardevent/rtb?eventtype=[EVENTTYPE]&error=[ERRORCODE]");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockImpressionBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = "impression";
        HashMap hashMap = new HashMap(1);
        adData.data = hashMap;
        hashMap.put("url", "https://mock-dsp.pubnative.net/tracker/nurl?app_id=1036637&p=0.01");
        arrayList.add(adData);
        return arrayList;
    }

    public static List<AdData> createMockLoadEventBeacons() {
        ArrayList arrayList = new ArrayList(1);
        AdData adData = new AdData();
        adData.type = "load_event";
        HashMap hashMap = new HashMap(1);
        adData.data = hashMap;
        hashMap.put("url", "https://got.pubnative.net/loadevent/rtb?eventtype=[EVENT_TYPE]&error=[ERRORCODE]");
        arrayList.add(adData);
        return arrayList;
    }

    private static List<AdData> createMockMeta() {
        ArrayList arrayList = new ArrayList(3);
        AdData adData = new AdData();
        adData.type = APIMeta.POINTS;
        HashMap hashMap = new HashMap(1);
        adData.data = hashMap;
        hashMap.put(AbCenterConstant.VALUE_TYPE_NUMBER, 9);
        AdData adData2 = new AdData();
        adData2.type = APIMeta.REVENUE_MODEL;
        HashMap hashMap2 = new HashMap(1);
        adData2.data = hashMap2;
        hashMap2.put("text", "cpm");
        AdData adData3 = new AdData();
        adData3.type = APIMeta.CONTENT_INFO;
        HashMap hashMap3 = new HashMap(3);
        adData3.data = hashMap3;
        hashMap3.put("link", C38595Ad.CONTENT_INFO_LINK_URL);
        adData3.data.put("icon", C38595Ad.CONTENT_INFO_ICON_URL);
        adData3.data.put("text", C38595Ad.CONTENT_INFO_TEXT);
        arrayList.add(adData);
        arrayList.add(adData2);
        arrayList.add(adData3);
        return arrayList;
    }

    public static C38595Ad createTestAd(int i) {
        C38595Ad c38595Ad = new C38595Ad();
        c38595Ad.assetgroupid = i;
        c38595Ad.assets = createMockAssets();
        c38595Ad.meta = createMockMeta();
        c38595Ad.beacons = createMockBeacons();
        return c38595Ad;
    }

    public static AdRequest createTestAdRequest() {
        PNAdRequest pNAdRequest = new PNAdRequest();
        pNAdRequest.appToken = "dde3c298b47648459f8ada4a982fa92d";
        pNAdRequest.f101934os = "android";
        pNAdRequest.osver = "8.1.0";
        pNAdRequest.dnt = "0";
        pNAdRequest.f101933mf = "points,revenuemodel,contentinfo";
        pNAdRequest.f101931al = "s";
        pNAdRequest.gid = "d98374d3-3b69-4a4b-a2c1-9dcb4c588849";
        pNAdRequest.zoneId = "2";
        pNAdRequest.bundleid = "net.pubnative.lite.demo";
        pNAdRequest.testMode = "0";
        pNAdRequest.locale = "en";
        pNAdRequest.gidmd5 = "e74483c4b5e6dc78e088d9fb0243ae66";
        pNAdRequest.gidsha1 = "96e380195959b8e7e05d6c6029154dc99e7fe954";
        return pNAdRequest;
    }

    public static AdResponse createTestAdResponse() {
        AdResponse adResponse = new AdResponse();
        ArrayList arrayList = new ArrayList(1);
        adResponse.ads = arrayList;
        arrayList.add(createTestBannerAd());
        adResponse.status = "ok";
        return adResponse;
    }

    public static C38595Ad createTestBannerAd() {
        return createTestAd(10);
    }

    public static C38595Ad createTestInterstitialAd() {
        return createTestAd(21);
    }

    public static C38595Ad createTestLeaderboardAd() {
        return createTestAd(24);
    }

    public static C38595Ad createTestMRectAd() {
        return createTestAd(8);
    }

    public static SessionImpression createTestSessionImpression() {
        SessionImpression sessionImpression = new SessionImpression();
        sessionImpression.setZoneId(Protocol.VAST_1_0_WRAPPER);
        sessionImpression.setSessionDuration(Long.valueOf(System.currentTimeMillis() - 100000));
        sessionImpression.setAgeOfApp(21323243L);
        return sessionImpression;
    }

    public static C38595Ad createTestVideoInterstitialAd() {
        return createTestAd(15);
    }

    public static C38595Ad createTestVideoMRectAd() {
        return createTestAd(4);
    }
}
