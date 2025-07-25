package com.google.zxing.oned;

import com.amazon.device.ads.DtbConstants;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.zxing.client.result.ExpandedProductParsedResult;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.p552ot.pubsub.p559g.C26549l;
import com.unity3d.ads.gatewayclient.CommonGatewayClient;
import com.unity3d.mediation.LevelPlayAdError;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class EANManufacturerOrgSupport {

    /* renamed from: a */
    private final List<int[]> f44495a = new ArrayList();

    /* renamed from: b */
    private final List<String> f44496b = new ArrayList();

    /* renamed from: a */
    private void m65866a(int[] iArr, String str) {
        this.f44495a.add(iArr);
        this.f44496b.add(str);
    }

    /* renamed from: b */
    private synchronized void m65865b() {
        if (!this.f44495a.isEmpty()) {
            return;
        }
        m65866a(new int[]{0, 19}, "US/CA");
        m65866a(new int[]{30, 39}, "US");
        m65866a(new int[]{60, 139}, "US/CA");
        m65866a(new int[]{300, 379}, "FR");
        m65866a(new int[]{380}, "BG");
        m65866a(new int[]{383}, "SI");
        m65866a(new int[]{385}, "HR");
        m65866a(new int[]{387}, "BA");
        m65866a(new int[]{400, 440}, "DE");
        m65866a(new int[]{450, 459}, "JP");
        m65866a(new int[]{460, 469}, C26549l.f69548b);
        m65866a(new int[]{471}, "TW");
        m65866a(new int[]{474}, "EE");
        m65866a(new int[]{475}, "LV");
        m65866a(new int[]{476}, "AZ");
        m65866a(new int[]{477}, "LT");
        m65866a(new int[]{478}, "UZ");
        m65866a(new int[]{479}, "LK");
        m65866a(new int[]{DtbConstants.DEFAULT_PLAYER_HEIGHT}, "PH");
        m65866a(new int[]{481}, "BY");
        m65866a(new int[]{482}, "UA");
        m65866a(new int[]{484}, "MD");
        m65866a(new int[]{485}, "AM");
        m65866a(new int[]{486}, "GE");
        m65866a(new int[]{487}, "KZ");
        m65866a(new int[]{489}, "HK");
        m65866a(new int[]{490, 499}, "JP");
        m65866a(new int[]{500, 509}, "GB");
        m65866a(new int[]{IronSourceError.ERROR_NO_INTERNET_CONNECTION}, "GR");
        m65866a(new int[]{528}, ExpandedProductParsedResult.POUND);
        m65866a(new int[]{529}, "CY");
        m65866a(new int[]{531}, "MK");
        m65866a(new int[]{535}, "MT");
        m65866a(new int[]{539}, "IE");
        m65866a(new int[]{540, 549}, "BE/LU");
        m65866a(new int[]{560}, "PT");
        m65866a(new int[]{569}, IronSourceConstants.INTERSTITIAL_EVENT_TYPE);
        m65866a(new int[]{570, 579}, "DK");
        m65866a(new int[]{590}, "PL");
        m65866a(new int[]{594}, "RO");
        m65866a(new int[]{CommonGatewayClient.CODE_599}, "HU");
        m65866a(new int[]{600, 601}, "ZA");
        m65866a(new int[]{603}, "GH");
        m65866a(new int[]{608}, "BH");
        m65866a(new int[]{609}, "MU");
        m65866a(new int[]{611}, RequestConfiguration.MAX_AD_CONTENT_RATING_MA);
        m65866a(new int[]{613}, "DZ");
        m65866a(new int[]{616}, "KE");
        m65866a(new int[]{618}, "CI");
        m65866a(new int[]{619}, "TN");
        m65866a(new int[]{621}, "SY");
        m65866a(new int[]{IronSourceError.ERROR_BN_RELOAD_SKIP_BANNER_LAYOUT_IS_NULL}, "EG");
        m65866a(new int[]{LevelPlayAdError.ERROR_CODE_NO_AD_UNIT_ID_SPECIFIED}, "LY");
        m65866a(new int[]{LevelPlayAdError.ERROR_CODE_LOAD_BEFORE_INIT_SUCCESS_CALLBACK}, "JO");
        m65866a(new int[]{LevelPlayAdError.ERROR_CODE_INVALID_AD_UNIT_ID}, "IR");
        m65866a(new int[]{LevelPlayAdError.ERROR_CODE_IS_LOAD_FAILED_ALREADY_CALLED}, "KW");
        m65866a(new int[]{LevelPlayAdError.ERROR_CODE_SHOW_BEFORE_LOAD_SUCCESS_CALLBACK}, "SA");
        m65866a(new int[]{LevelPlayAdError.ERROR_CODE_LOAD_WHILE_SHOW}, "AE");
        m65866a(new int[]{640, 649}, "FI");
        m65866a(new int[]{690, 695}, C26549l.f69547a);
        m65866a(new int[]{IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, 709}, "NO");
        m65866a(new int[]{729}, "IL");
        m65866a(new int[]{730, 739}, "SE");
        m65866a(new int[]{740}, "GT");
        m65866a(new int[]{741}, "SV");
        m65866a(new int[]{742}, "HN");
        m65866a(new int[]{743}, "NI");
        m65866a(new int[]{744}, "CR");
        m65866a(new int[]{745}, "PA");
        m65866a(new int[]{746}, "DO");
        m65866a(new int[]{UnityAdsConstants.AdOperations.GET_TOKEN_TIMEOUT_MS}, "MX");
        m65866a(new int[]{754, 755}, "CA");
        m65866a(new int[]{759}, "VE");
        m65866a(new int[]{760, 769}, "CH");
        m65866a(new int[]{770}, "CO");
        m65866a(new int[]{773}, "UY");
        m65866a(new int[]{775}, "PE");
        m65866a(new int[]{777}, "BO");
        m65866a(new int[]{779}, "AR");
        m65866a(new int[]{780}, "CL");
        m65866a(new int[]{784}, "PY");
        m65866a(new int[]{785}, "PE");
        m65866a(new int[]{786}, "EC");
        m65866a(new int[]{789, 790}, "BR");
        m65866a(new int[]{800, 839}, "IT");
        m65866a(new int[]{840, 849}, "ES");
        m65866a(new int[]{850}, "CU");
        m65866a(new int[]{858}, "SK");
        m65866a(new int[]{859}, "CZ");
        m65866a(new int[]{860}, "YU");
        m65866a(new int[]{865}, "MN");
        m65866a(new int[]{867}, "KP");
        m65866a(new int[]{868, 869}, "TR");
        m65866a(new int[]{870, 879}, "NL");
        m65866a(new int[]{880}, "KR");
        m65866a(new int[]{885}, "TH");
        m65866a(new int[]{888}, "SG");
        m65866a(new int[]{890}, "IN");
        m65866a(new int[]{893}, "VN");
        m65866a(new int[]{896}, "PK");
        m65866a(new int[]{899}, "ID");
        m65866a(new int[]{900, 919}, "AT");
        m65866a(new int[]{930, 939}, "AU");
        m65866a(new int[]{940, 949}, "AZ");
        m65866a(new int[]{955}, "MY");
        m65866a(new int[]{958}, "MO");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public String m65864c(String str) {
        int[] iArr;
        int i;
        m65865b();
        int parseInt = Integer.parseInt(str.substring(0, 3));
        int size = this.f44495a.size();
        for (int i2 = 0; i2 < size && parseInt >= (i = (iArr = this.f44495a.get(i2))[0]); i2++) {
            if (iArr.length != 1) {
                i = iArr[1];
            }
            if (parseInt <= i) {
                return this.f44496b.get(i2);
            }
        }
        return null;
    }
}
