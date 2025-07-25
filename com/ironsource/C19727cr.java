package com.ironsource;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C20331m8;
import com.ironsource.InterfaceC20686qe;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.model.InterstitialPlacement;
import com.ironsource.mediationsdk.model.NetworkSettings;
import com.ironsource.mediationsdk.model.Placement;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ironsource.cr */
/* loaded from: classes6.dex */
public class C19727cr {

    /* renamed from: A */
    protected static final boolean f49493A = false;

    /* renamed from: A0 */
    protected static final String f49494A0 = "parallelInit";

    /* renamed from: A1 */
    protected static final String f49495A1 = "adSourceName";

    /* renamed from: B */
    protected static final int f49496B = 60;

    /* renamed from: B0 */
    protected static final String f49497B0 = "waitUntilAllProvidersFinishInit";

    /* renamed from: B1 */
    protected static final String f49498B1 = "providerNetworkKey";

    /* renamed from: C */
    protected static final int f49499C = 10000;

    /* renamed from: C0 */
    protected static final String f49500C0 = "sharedManagersThread";

    /* renamed from: C1 */
    protected static final String f49501C1 = "spId";

    /* renamed from: D */
    protected static final int f49502D = 10000;

    /* renamed from: D0 */
    protected static final String f49503D0 = "parallelLoad";

    /* renamed from: D1 */
    protected static final String f49504D1 = "mpis";

    /* renamed from: E */
    protected static final int f49505E = -1;

    /* renamed from: E0 */
    protected static final String f49506E0 = "bidderExclusive";

    /* renamed from: E1 */
    protected static final String f49507E1 = "auction";

    /* renamed from: F */
    protected static final int f49508F = 5000;

    /* renamed from: F0 */
    protected static final String f49509F0 = "adapterTimeOutInSeconds";

    /* renamed from: F1 */
    protected static final String f49510F1 = "auctionData";

    /* renamed from: G */
    protected static final int f49511G = 3;

    /* renamed from: G0 */
    protected static final String f49512G0 = "atim";

    /* renamed from: G1 */
    protected static final String f49513G1 = "auctioneerURL";

    /* renamed from: H */
    protected static final int f49514H = 3;

    /* renamed from: H0 */
    protected static final String f49515H0 = "bannerInterval";

    /* renamed from: H1 */
    protected static final String f49516H1 = "extAuctioneerURL";

    /* renamed from: I */
    protected static final int f49517I = 3;

    /* renamed from: I0 */
    protected static final String f49518I0 = "isOneFlow";

    /* renamed from: I1 */
    protected static final String f49519I1 = "objectPerWaterfall";

    /* renamed from: J */
    protected static final int f49520J = 0;

    /* renamed from: J0 */
    protected static final String f49521J0 = "expiredDurationInMinutes";

    /* renamed from: J1 */
    protected static final String f49522J1 = "minTimeBeforeFirstAuction";

    /* renamed from: K */
    protected static final int f49523K = 2;

    /* renamed from: K0 */
    protected static final String f49524K0 = "server";

    /* renamed from: K1 */
    protected static final String f49525K1 = "timeToWaitBeforeAuction";

    /* renamed from: L */
    protected static final int f49526L = 15;

    /* renamed from: L0 */
    protected static final String f49527L0 = "publisher";

    /* renamed from: L1 */
    protected static final String f49528L1 = "timeToWaitBeforeLoad";

    /* renamed from: M */
    protected static final long f49529M = 10000;

    /* renamed from: M0 */
    protected static final String f49530M0 = "console";

    /* renamed from: M1 */
    protected static final String f49531M1 = "auctionRetryInterval";

    /* renamed from: N */
    protected static final boolean f49532N = false;

    /* renamed from: N0 */
    protected static final String f49533N0 = "sendUltraEvents";

    /* renamed from: N1 */
    protected static final String f49534N1 = "isLoadWhileShow";

    /* renamed from: O */
    protected static final long f49535O = 3000;

    /* renamed from: O0 */
    protected static final String f49536O0 = "sendEventsToggle";

    /* renamed from: O1 */
    protected static final String f49537O1 = "auctionTrials";

    /* renamed from: P */
    protected static final boolean f49538P = false;

    /* renamed from: P0 */
    protected static final String f49539P0 = "eventsCompression";

    /* renamed from: P1 */
    protected static final String f49540P1 = "auctionTimeout";

    /* renamed from: Q */
    protected static final boolean f49541Q = false;

    /* renamed from: Q0 */
    protected static final String f49542Q0 = "eventsCompressionLevel";

    /* renamed from: Q1 */
    protected static final String f49543Q1 = "auctionSavedHistory";

    /* renamed from: R */
    protected static final int f49544R = 30000;

    /* renamed from: R0 */
    protected static final String f49545R0 = "serverEventsURL";

    /* renamed from: R1 */
    protected static final String f49546R1 = "disableLoadWhileShowSupportFor";

    /* renamed from: S */
    protected static final int f49547S = -1;

    /* renamed from: S0 */
    protected static final String f49548S0 = "serverEventsType";

    /* renamed from: S1 */
    protected static final String f49549S1 = "timeToDeleteOldWaterfallAfterAuction";

    /* renamed from: T */
    protected static final int f49550T = 5000;

    /* renamed from: T0 */
    protected static final String f49551T0 = "backupThreshold";

    /* renamed from: T1 */
    protected static final String f49552T1 = "compressAuctionRequest";

    /* renamed from: U */
    protected static final int f49553U = 1;

    /* renamed from: U0 */
    protected static final String f49554U0 = "maxNumberOfEvents";

    /* renamed from: U1 */
    protected static final String f49555U1 = "compressAuctionResponse";

    /* renamed from: V */
    protected static final boolean f49556V = false;

    /* renamed from: V0 */
    protected static final String f49557V0 = "maxEventsPerBatch";

    /* renamed from: V1 */
    protected static final String f49558V1 = "encryptionVersion";

    /* renamed from: W */
    protected static final int f49559W = 15000;

    /* renamed from: W0 */
    protected static final String f49560W0 = "optOut";

    /* renamed from: W1 */
    protected static final String f49561W1 = "shouldSendBannerBURLFromImpression";

    /* renamed from: X */
    protected static final int f49562X = 15000;

    /* renamed from: X0 */
    protected static final String f49563X0 = "optIn";

    /* renamed from: X1 */
    protected static final String f49564X1 = "impressionTimeout";

    /* renamed from: Y */
    protected static final String f49565Y = "providerOrder";

    /* renamed from: Y0 */
    protected static final String f49566Y0 = "triggerEvents";

    /* renamed from: Y1 */
    protected static final String f49567Y1 = "optInKeys";

    /* renamed from: Z */
    protected static final String f49568Z = "providerSettings";

    /* renamed from: Z0 */
    protected static final String f49569Z0 = "nonConnectivityEvents";

    /* renamed from: Z1 */
    protected static final String f49570Z1 = "tokenGenericParams";

    /* renamed from: a0 */
    protected static final String f49571a0 = "configurations";

    /* renamed from: a1 */
    protected static final String f49572a1 = "shouldSendPublisherLogsOnUIThread";

    /* renamed from: a2 */
    protected static final String f49573a2 = "compressToken";

    /* renamed from: b0 */
    protected static final String f49574b0 = "genericParams";

    /* renamed from: b1 */
    protected static final String f49575b1 = "pixel";

    /* renamed from: b2 */
    protected static final String f49576b2 = "compressExternalToken";

    /* renamed from: c0 */
    protected static final String f49577c0 = "adUnits";

    /* renamed from: c1 */
    protected static final String f49578c1 = "pixelEventsUrl";

    /* renamed from: c2 */
    protected static final String f49579c2 = "instanceType";

    /* renamed from: d0 */
    protected static final String f49580d0 = "providerLoadName";

    /* renamed from: d1 */
    protected static final String f49581d1 = "pixelEventsEnabled";

    /* renamed from: d2 */
    protected static final String f49582d2 = "maxAdsPerSession";

    /* renamed from: e0 */
    protected static final String f49583e0 = "application";

    /* renamed from: e1 */
    protected static final String f49584e1 = "placements";

    /* renamed from: e2 */
    protected static final String f49585e2 = "reward";

    /* renamed from: f0 */
    protected static final String f49586f0 = "rewardedVideo";

    /* renamed from: f1 */
    protected static final String f49587f1 = "placementId";

    /* renamed from: f2 */
    protected static final String f49588f2 = "name";

    /* renamed from: g0 */
    protected static final String f49589g0 = "interstitial";

    /* renamed from: g1 */
    protected static final String f49590g1 = "placementName";

    /* renamed from: g2 */
    protected static final String f49591g2 = "amount";

    /* renamed from: h0 */
    protected static final String f49592h0 = "banner";

    /* renamed from: h1 */
    protected static final String f49593h1 = "delivery";

    /* renamed from: h2 */
    protected static final String f49594h2 = "bannerRefreshRate";

    /* renamed from: i0 */
    protected static final String f49595i0 = "nativeAd";

    /* renamed from: i1 */
    protected static final String f49596i1 = "isDefault";

    /* renamed from: i2 */
    protected static final String f49597i2 = "protocolVersion";

    /* renamed from: j0 */
    protected static final String f49598j0 = "integration";

    /* renamed from: j1 */
    protected static final String f49599j1 = "capping";

    /* renamed from: j2 */
    protected static final String f49600j2 = "adFormats";

    /* renamed from: k0 */
    protected static final String f49601k0 = "loggers";

    /* renamed from: k1 */
    protected static final String f49602k1 = "pacing";

    /* renamed from: k2 */
    protected static final String f49603k2 = "adUnits";

    /* renamed from: l */
    public static final String f49604l = "appKey";

    /* renamed from: l0 */
    protected static final String f49605l0 = "segment";

    /* renamed from: l1 */
    protected static final String f49606l1 = "enabled";

    /* renamed from: l2 */
    protected static final String f49607l2 = "rewarded";

    /* renamed from: m */
    public static final String f49608m = "userId";

    /* renamed from: m0 */
    protected static final String f49609m0 = "events";

    /* renamed from: m1 */
    protected static final String f49610m1 = "maxImpressions";

    /* renamed from: n */
    public static final String f49611n = "response";

    /* renamed from: n0 */
    protected static final String f49612n0 = "crashReporter";

    /* renamed from: n1 */
    protected static final String f49613n1 = "numOfSeconds";

    /* renamed from: o */
    protected static final String f49614o = "error";

    /* renamed from: o0 */
    protected static final String f49615o0 = "token";

    /* renamed from: o1 */
    protected static final String f49616o1 = "unit";

    /* renamed from: p */
    protected static final int f49617p = 3;

    /* renamed from: p0 */
    protected static final String f49618p0 = "external";

    /* renamed from: p1 */
    protected static final String f49619p1 = "virtualItemName";

    /* renamed from: q */
    protected static final boolean f49620q = false;

    /* renamed from: q0 */
    protected static final String f49621q0 = "mediationTypes";

    /* renamed from: q1 */
    protected static final String f49622q1 = "virtualItemCount";

    /* renamed from: r */
    protected static final boolean f49623r = true;

    /* renamed from: r0 */
    protected static final String f49624r0 = "providerDefaultInstance";

    /* renamed from: r1 */
    protected static final String f49625r1 = "uuidEnabled";

    /* renamed from: s */
    protected static final boolean f49626s = true;

    /* renamed from: s0 */
    protected static final String f49627s0 = "testSuite";

    /* renamed from: s1 */
    protected static final String f49628s1 = "abt";

    /* renamed from: t */
    protected static final int f49629t = 2;

    /* renamed from: t0 */
    protected static final String f49630t0 = "controllerUrl";

    /* renamed from: t1 */
    protected static final String f49631t1 = "delayLoadFailure";

    /* renamed from: u */
    protected static final int f49632u = 2;

    /* renamed from: u0 */
    protected static final String f49633u0 = "AdQuality";

    /* renamed from: u1 */
    protected static final String f49634u1 = "keysToInclude";

    /* renamed from: v */
    protected static final int f49635v = 1;

    /* renamed from: v0 */
    protected static final String f49636v0 = "initSDK";

    /* renamed from: v1 */
    protected static final String f49637v1 = "reporterURL";

    /* renamed from: w */
    protected static final int f49638w = 1;

    /* renamed from: w0 */
    protected static final String f49639w0 = "settings";

    /* renamed from: w1 */
    protected static final String f49640w1 = "reporterKeyword";

    /* renamed from: x */
    protected static final boolean f49641x = true;

    /* renamed from: x0 */
    protected static final String f49642x0 = "collectBiddingDataTimeout";

    /* renamed from: x1 */
    protected static final String f49643x1 = "includeANR";

    /* renamed from: y */
    protected static final boolean f49644y = false;

    /* renamed from: y0 */
    protected static final String f49645y0 = "collectBiddingDataAsyncEnabled";

    /* renamed from: y1 */
    protected static final String f49646y1 = "timeout";

    /* renamed from: z */
    protected static final boolean f49647z = false;

    /* renamed from: z0 */
    protected static final String f49648z0 = "providers";

    /* renamed from: z1 */
    protected static final String f49649z1 = "setIgnoreDebugger";

    /* renamed from: a */
    private C20713qo f49650a;

    /* renamed from: b */
    private C20979so f49651b;

    /* renamed from: c */
    private C20331m8 f49652c;

    /* renamed from: d */
    private String f49653d;

    /* renamed from: e */
    private String f49654e;

    /* renamed from: f */
    private JSONObject f49655f;

    /* renamed from: g */
    private Context f49656g;

    /* renamed from: h */
    private EnumC19728a f49657h;

    /* renamed from: i */
    private InterfaceC20686qe.InterfaceC20687a f49658i;

    /* renamed from: j */
    private boolean f49659j;

    /* renamed from: k */
    private C21219xb f49660k;

    /* renamed from: com.ironsource.cr$a */
    /* loaded from: classes6.dex */
    public enum EnumC19728a {
        NOT_SET("0"),
        CACHE("1"),
        SERVER("2");
        

        /* renamed from: a */
        private final String f49665a;

        EnumC19728a(String str) {
            this.f49665a = str;
        }

        /* renamed from: a */
        public String m59023a() {
            return this.f49665a;
        }
    }

    public C19727cr(Context context, String str, String str2, String str3) {
        this.f49657h = EnumC19728a.NOT_SET;
        this.f49659j = false;
        this.f49656g = context;
        this.f49658i = C19821el.m58802I().mo57484m();
        try {
            this.f49655f = TextUtils.isEmpty(str3) ? new JSONObject() : new JSONObject(str3);
            this.f49659j = m59029n();
            m59024s();
            m59026q();
            m59025r();
            this.f49653d = TextUtils.isEmpty(str) ? "" : str;
            this.f49654e = TextUtils.isEmpty(str2) ? "" : str2;
            m59050b(this.f49655f);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            m59062a();
        }
    }

    /* renamed from: a */
    private int m59056a(JSONObject jSONObject, JSONObject jSONObject2, String str, int i) {
        int i2 = 0;
        if (jSONObject.has(str)) {
            i2 = jSONObject.optInt(str, 0);
        } else if (jSONObject2.has(str)) {
            i2 = jSONObject2.optInt(str, 0);
        }
        return i2 == 0 ? i : i2;
    }

    @NotNull
    /* renamed from: b */
    public static C20985st m59052b(@Nullable C19727cr c19727cr) {
        return (c19727cr == null || !c19727cr.m59027p()) ? C20985st.m54891a() : c19727cr.m59048c().m57213b().m54824j();
    }

    /* renamed from: c */
    private C19666c1 m59047c(JSONObject jSONObject) {
        C19666c1 c19666c1 = new C19666c1();
        JSONObject m59046c = m59046c(jSONObject, "AdQuality");
        if (m59046c != null) {
            c19666c1.m59255a(m59046c.optBoolean(f49636v0));
        }
        return c19666c1;
    }

    /* renamed from: d */
    private Context m59045d() {
        return this.f49656g;
    }

    /* renamed from: e */
    private InterstitialPlacement m59041e(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f49596i1, false);
            C19721co m59058a = m59058a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                InterstitialPlacement interstitialPlacement = new InterstitialPlacement(optInt, optString, optBoolean, m59058a);
                if (m59058a != null) {
                    this.f49658i.mo55651c(this.f49656g, interstitialPlacement, IronSource.AD_UNIT.INTERSTITIAL);
                    return interstitialPlacement;
                }
                return interstitialPlacement;
            }
        }
        return null;
    }

    /* renamed from: f */
    private C21083ul m59039f(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f49596i1, false);
            C19721co m59058a = m59058a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                C21083ul c21083ul = new C21083ul(optInt, optString, optBoolean, m59058a);
                if (m59058a != null) {
                    this.f49658i.mo55651c(this.f49656g, c21083ul, IronSource.AD_UNIT.NATIVE_AD);
                    return c21083ul;
                }
                return c21083ul;
            }
        }
        return null;
    }

    /* renamed from: g */
    private Placement m59037g(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f49596i1, false);
            String optString2 = jSONObject.optString(f49619p1, "");
            int optInt2 = jSONObject.optInt(f49622q1, -1);
            C19721co m59058a = m59058a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && optInt2 > 0) {
                Placement placement = new Placement(optInt, optString, optBoolean, optString2, optInt2, m59058a);
                if (m59058a != null) {
                    this.f49658i.mo55651c(this.f49656g, placement, IronSource.AD_UNIT.REWARDED_VIDEO);
                    return placement;
                }
                return placement;
            }
        }
        return null;
    }

    /* renamed from: l */
    private String m59031l() {
        if (this.f49659j) {
            return "rewarded";
        }
        return f49586f0;
    }

    /* renamed from: m */
    private boolean m59030m() {
        JSONObject m59046c;
        JSONArray optJSONArray;
        JSONObject m59046c2 = m59046c(this.f49655f, "providerOrder");
        JSONArray names = m59046c2.names();
        if (names == null) {
            return true;
        }
        JSONObject m59046c3 = m59046c(m59046c(this.f49655f, "configurations"), m59053b());
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i);
            JSONArray optJSONArray2 = m59046c2.optJSONArray(optString);
            if (optJSONArray2 != null && optJSONArray2.length() != 0 && (m59046c = m59046c(m59046c3, optString)) != null && ((optJSONArray = m59046c.optJSONArray("placements")) == null || optJSONArray.length() == 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    private boolean m59029n() {
        int i;
        try {
            i = this.f49655f.optInt(f49597i2, 0);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            i = 0;
        }
        if (i != 1) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:327:0x00da A[Catch: Exception -> 0x0b57, TRY_ENTER, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0323 A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:427:0x0500  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0518 A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x073c  */
    /* JADX WARN: Removed duplicated region for block: B:479:0x0759  */
    /* JADX WARN: Removed duplicated region for block: B:481:0x0781 A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:523:0x0939  */
    /* JADX WARN: Removed duplicated region for block: B:530:0x0950  */
    /* JADX WARN: Removed duplicated region for block: B:533:0x096d A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:543:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:546:0x09ab A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:547:0x09c0  */
    /* JADX WARN: Removed duplicated region for block: B:550:0x09c9 A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:553:0x0a0f A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0a69 A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x0a85  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a8e A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:569:0x0aa0 A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:575:0x0abd A[Catch: Exception -> 0x0b57, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:582:0x0b44 A[Catch: Exception -> 0x0b57, TRY_LEAVE, TryCatch #0 {Exception -> 0x0b57, blocks: (B:314:0x0004, B:316:0x006f, B:320:0x0089, B:322:0x0095, B:327:0x00da, B:329:0x0178, B:330:0x0185, B:332:0x018b, B:335:0x019f, B:337:0x01a7, B:338:0x01b0, B:340:0x01b6, B:343:0x01c6, B:345:0x01ce, B:346:0x01d5, B:348:0x01db, B:351:0x01e9, B:353:0x01f1, B:354:0x01f8, B:356:0x01fe, B:359:0x020c, B:361:0x0215, B:364:0x02c1, B:366:0x02c7, B:369:0x02e7, B:372:0x02f1, B:374:0x02f7, B:376:0x0301, B:377:0x0304, B:381:0x0323, B:383:0x03c8, B:384:0x03d5, B:386:0x03db, B:389:0x03ef, B:391:0x03f7, B:392:0x0400, B:394:0x0406, B:397:0x0416, B:399:0x041e, B:400:0x0425, B:402:0x042b, B:405:0x0439, B:407:0x0441, B:408:0x0448, B:410:0x044e, B:413:0x045c, B:415:0x0467, B:417:0x04de, B:420:0x04e8, B:422:0x04ee, B:424:0x04f8, B:425:0x04fb, B:429:0x0518, B:431:0x05e5, B:432:0x05f0, B:434:0x05f6, B:437:0x0608, B:439:0x0610, B:440:0x0619, B:442:0x061f, B:445:0x062f, B:447:0x0637, B:448:0x063e, B:450:0x0644, B:453:0x0652, B:455:0x065a, B:456:0x0661, B:458:0x0667, B:461:0x0675, B:463:0x0680, B:465:0x068a, B:469:0x072f, B:472:0x073d, B:474:0x0743, B:476:0x074f, B:477:0x0752, B:481:0x0781, B:483:0x0820, B:484:0x0827, B:486:0x082d, B:489:0x083b, B:491:0x0843, B:492:0x084a, B:494:0x0850, B:497:0x085e, B:499:0x0866, B:500:0x086d, B:502:0x0873, B:505:0x0881, B:507:0x0889, B:508:0x0890, B:510:0x0896, B:513:0x08a4, B:515:0x08b1, B:517:0x08b9, B:521:0x092a, B:524:0x093a, B:526:0x0940, B:528:0x094a, B:529:0x094d, B:531:0x0966, B:533:0x096d, B:536:0x097a, B:538:0x0980, B:539:0x098a, B:541:0x0992, B:542:0x0995, B:544:0x09a2, B:546:0x09ab, B:548:0x09c4, B:550:0x09c9, B:551:0x09e7, B:553:0x0a0f, B:556:0x0a55, B:558:0x0a5b, B:561:0x0a69, B:563:0x0a87, B:567:0x0a94, B:569:0x0aa0, B:571:0x0aad, B:572:0x0ab1, B:573:0x0ab6, B:575:0x0abd, B:576:0x0ac6, B:578:0x0b25, B:580:0x0b2d, B:582:0x0b44, B:566:0x0a8e, B:518:0x0919, B:519:0x0921, B:466:0x0714, B:467:0x0722, B:416:0x04d3, B:368:0x02d4), top: B:587:0x0004 }] */
    /* JADX WARN: Removed duplicated region for block: B:620:? A[RETURN, SYNTHETIC] */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m59026q() {
        /*
            Method dump skipped, instructions count: 2922
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19727cr.m59026q():void");
    }

    /* renamed from: r */
    private void m59025r() {
        try {
            JSONObject m59046c = m59046c(this.f49655f, "providerOrder");
            JSONArray m59049b = m59049b(m59046c, m59031l());
            JSONArray m59049b2 = m59049b(m59046c, "interstitial");
            JSONArray m59049b3 = m59049b(m59046c, "banner");
            JSONArray m59049b4 = m59049b(m59046c, "nativeAd");
            this.f49650a = new C20713qo();
            if (m59049b != null && m59048c() != null && m59048c().m57209f() != null) {
                for (int i = 0; i < m59049b.length(); i++) {
                    String optString = m59049b.optString(i);
                    this.f49650a.m55590d(optString);
                    NetworkSettings m54921b = C20979so.m54920c().m54921b(optString);
                    if (m54921b != null) {
                        m54921b.setRewardedVideoPriority(i);
                    }
                }
            }
            if (m59049b2 != null && m59048c() != null && m59048c().m57211d() != null) {
                for (int i2 = 0; i2 < m59049b2.length(); i2++) {
                    String optString2 = m59049b2.optString(i2);
                    this.f49650a.m55594b(optString2);
                    NetworkSettings m54921b2 = C20979so.m54920c().m54921b(optString2);
                    if (m54921b2 != null) {
                        m54921b2.setInterstitialPriority(i2);
                    }
                }
            }
            if (m59049b3 != null) {
                for (int i3 = 0; i3 < m59049b3.length(); i3++) {
                    String optString3 = m59049b3.optString(i3);
                    this.f49650a.m55596a(optString3);
                    NetworkSettings m54921b3 = C20979so.m54920c().m54921b(optString3);
                    if (m54921b3 != null) {
                        m54921b3.setBannerPriority(i3);
                    }
                }
            }
            if (m59049b4 != null) {
                for (int i4 = 0; i4 < m59049b4.length(); i4++) {
                    String optString4 = m59049b4.optString(i4);
                    this.f49650a.m55592c(optString4);
                    NetworkSettings m54921b4 = C20979so.m54920c().m54921b(optString4);
                    if (m54921b4 != null) {
                        m54921b4.setNativeAdPriority(i4);
                    }
                }
            }
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
    }

    /* renamed from: s */
    private void m59024s() {
        JSONObject jSONObject;
        Iterator<String> it;
        C19727cr c19727cr;
        NetworkSettings networkSettings;
        C19727cr c19727cr2 = this;
        try {
            c19727cr2.f49651b = C20979so.m54920c();
            JSONObject m59046c = c19727cr2.m59046c(c19727cr2.f49655f, "providerSettings");
            Iterator<String> keys = m59046c.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject = m59046c.optJSONObject(next);
                if (optJSONObject != null) {
                    boolean optBoolean = optJSONObject.optBoolean("mpis", false);
                    String optString = optJSONObject.optString("spId", "0");
                    String optString2 = optJSONObject.optString("adSourceName", null);
                    String optString3 = optJSONObject.optString("providerNetworkKey", null);
                    String optString4 = optJSONObject.optString("providerLoadName", next);
                    String optString5 = optJSONObject.optString("providerDefaultInstance", optString4);
                    JSONObject m59046c2 = c19727cr2.m59046c(optJSONObject, m59053b());
                    JSONObject m59046c3 = c19727cr2.m59046c(optJSONObject, "application");
                    JSONObject m59046c4 = c19727cr2.m59046c(m59046c2, m59031l());
                    JSONObject m59046c5 = c19727cr2.m59046c(m59046c2, "interstitial");
                    JSONObject m59046c6 = c19727cr2.m59046c(m59046c2, "banner");
                    JSONObject m59046c7 = c19727cr2.m59046c(m59046c2, "nativeAd");
                    JSONObject mergeJsons = IronSourceUtils.mergeJsons(m59046c4, m59046c3);
                    JSONObject mergeJsons2 = IronSourceUtils.mergeJsons(m59046c5, m59046c3);
                    JSONObject mergeJsons3 = IronSourceUtils.mergeJsons(m59046c6, m59046c3);
                    JSONObject mergeJsons4 = IronSourceUtils.mergeJsons(m59046c7, m59046c3);
                    if (c19727cr2.f49651b.m54924a(next)) {
                        NetworkSettings m54921b = c19727cr2.f49651b.m54921b(next);
                        JSONObject rewardedVideoSettings = m54921b.getRewardedVideoSettings();
                        JSONObject interstitialSettings = m54921b.getInterstitialSettings();
                        JSONObject bannerSettings = m54921b.getBannerSettings();
                        JSONObject nativeAdSettings = m54921b.getNativeAdSettings();
                        m54921b.setRewardedVideoSettings(IronSourceUtils.mergeJsons(rewardedVideoSettings, mergeJsons));
                        m54921b.setInterstitialSettings(IronSourceUtils.mergeJsons(interstitialSettings, mergeJsons2));
                        m54921b.setBannerSettings(IronSourceUtils.mergeJsons(bannerSettings, mergeJsons3));
                        m54921b.setNativeAdSettings(IronSourceUtils.mergeJsons(nativeAdSettings, mergeJsons4));
                        m54921b.setIsMultipleInstances(optBoolean);
                        m54921b.setSubProviderId(optString);
                        m54921b.setAdSourceNameForEvents(optString2);
                        m54921b.setProviderNetworkKey(optString3);
                    } else {
                        if (c19727cr2.m59051b(optString4)) {
                            jSONObject = m59046c;
                            NetworkSettings m54921b2 = c19727cr2.f49651b.m54921b("Mediation");
                            JSONObject rewardedVideoSettings2 = m54921b2.getRewardedVideoSettings();
                            JSONObject interstitialSettings2 = m54921b2.getInterstitialSettings();
                            JSONObject bannerSettings2 = m54921b2.getBannerSettings();
                            JSONObject nativeAdSettings2 = m54921b2.getNativeAdSettings();
                            it = keys;
                            JSONObject jSONObject2 = new JSONObject(rewardedVideoSettings2.toString());
                            JSONObject jSONObject3 = new JSONObject(interstitialSettings2.toString());
                            try {
                                networkSettings = new NetworkSettings(next, optString4, optString5, optString3, m59046c3, IronSourceUtils.mergeJsons(jSONObject2, mergeJsons), IronSourceUtils.mergeJsons(jSONObject3, mergeJsons2), IronSourceUtils.mergeJsons(new JSONObject(bannerSettings2.toString()), mergeJsons3), IronSourceUtils.mergeJsons(new JSONObject(nativeAdSettings2.toString()), mergeJsons4));
                                networkSettings.setIsMultipleInstances(optBoolean);
                                networkSettings.setSubProviderId(optString);
                                networkSettings.setAdSourceNameForEvents(optString2);
                                c19727cr = this;
                            } catch (Exception e) {
                                e = e;
                                C20086i9.m57997d().m58003a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        } else {
                            try {
                                jSONObject = m59046c;
                                it = keys;
                                c19727cr = c19727cr2;
                                networkSettings = new NetworkSettings(next, optString4, optString5, optString3, m59046c3, mergeJsons, mergeJsons2, mergeJsons3, mergeJsons4);
                                networkSettings.setIsMultipleInstances(optBoolean);
                                networkSettings.setSubProviderId(optString);
                                networkSettings.setAdSourceNameForEvents(optString2);
                            } catch (Exception e2) {
                                e = e2;
                                C20086i9.m57997d().m58003a(e);
                                IronLog.INTERNAL.error(e.toString());
                                return;
                            }
                        }
                        c19727cr.f49651b.m54925a(networkSettings);
                        c19727cr2 = c19727cr;
                        m59046c = jSONObject;
                        keys = it;
                    }
                }
            }
            c19727cr2.f49651b.m54922b();
        } catch (Exception e3) {
            e = e3;
        }
    }

    /* renamed from: h */
    public EnumC19728a m59036h() {
        return this.f49657h;
    }

    /* renamed from: i */
    public JSONObject m59034i() {
        return this.f49655f;
    }

    /* renamed from: j */
    public C20713qo m59033j() {
        return this.f49650a;
    }

    /* renamed from: k */
    public C20979so m59032k() {
        return this.f49651b;
    }

    /* renamed from: o */
    public boolean m59028o() {
        return !TextUtils.isEmpty(m59048c().m57208g().m58844b());
    }

    /* renamed from: p */
    public boolean m59027p() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        JSONObject jSONObject = this.f49655f;
        if (jSONObject != null) {
            z = true;
        } else {
            z = false;
        }
        if (z && !jSONObject.has("error")) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2 && this.f49650a != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3 && this.f49651b != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4 && this.f49652c != null) {
            z5 = true;
        } else {
            z5 = false;
        }
        if (z5 && m59030m()) {
            return true;
        }
        return false;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("appKey", this.f49653d);
            jSONObject.put("userId", this.f49654e);
            jSONObject.put("response", this.f49655f);
        } catch (JSONException e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
        }
        return jSONObject.toString();
    }

    public C19727cr(C19727cr c19727cr) {
        this.f49657h = EnumC19728a.NOT_SET;
        this.f49659j = false;
        try {
            this.f49656g = c19727cr.m59045d();
            this.f49655f = new JSONObject(c19727cr.f49655f.toString());
            this.f49653d = c19727cr.f49653d;
            this.f49654e = c19727cr.f49654e;
            this.f49659j = c19727cr.f49659j;
            this.f49650a = c19727cr.m59033j();
            this.f49651b = c19727cr.m59032k();
            this.f49652c = c19727cr.m59048c();
            this.f49657h = c19727cr.m59036h();
            this.f49658i = C19821el.m58802I().mo57484m();
            m59050b(this.f49655f);
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            m59062a();
        }
    }

    /* renamed from: a */
    private long m59055a(JSONObject jSONObject, JSONObject jSONObject2, String str, long j) {
        long optLong = jSONObject.has(str) ? jSONObject.optLong(str, 0L) : jSONObject2.has(str) ? jSONObject2.optLong(str, 0L) : 0L;
        return optLong == 0 ? j : optLong;
    }

    /* renamed from: b */
    private String m59053b() {
        return this.f49659j ? "adFormats" : C20736r2.f52700c;
    }

    /* renamed from: d */
    private C19619b7 m59044d(JSONObject jSONObject) {
        if (jSONObject != null) {
            int optInt = jSONObject.optInt("placementId", -1);
            String optString = jSONObject.optString("placementName", "");
            boolean optBoolean = jSONObject.optBoolean(f49596i1, false);
            C19721co m59058a = m59058a(jSONObject);
            if (optInt >= 0 && !TextUtils.isEmpty(optString)) {
                C19619b7 c19619b7 = new C19619b7(optInt, optString, optBoolean, m59058a);
                if (m59058a != null) {
                    this.f49658i.mo55651c(this.f49656g, c19619b7, IronSource.AD_UNIT.BANNER);
                    return c19619b7;
                }
                return c19619b7;
            }
        }
        return null;
    }

    /* renamed from: h */
    private C19788dt m59035h(JSONObject jSONObject) {
        C19788dt c19788dt = new C19788dt();
        JSONObject m59046c = m59046c(jSONObject, "testSuite");
        if (m59046c != null) {
            c19788dt.m58843b(m59046c.optString("controllerUrl"));
        }
        return c19788dt;
    }

    /* renamed from: c */
    public C20331m8 m59048c() {
        return this.f49652c;
    }

    /* renamed from: e */
    public C21219xb m59042e() {
        return this.f49660k;
    }

    /* renamed from: f */
    public C21135vg m59040f() {
        return new C21135vg(this.f49653d, this.f49654e);
    }

    /* renamed from: g */
    public List<IronSource.AD_UNIT> m59038g() {
        C20713qo c20713qo;
        C20713qo c20713qo2;
        C20713qo c20713qo3;
        C20713qo c20713qo4;
        if (this.f49655f == null || this.f49652c == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        if (this.f49652c.m57209f() != null && (c20713qo4 = this.f49650a) != null && !c20713qo4.m55591d().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.REWARDED_VIDEO);
        }
        if (this.f49652c.m57211d() != null && (c20713qo3 = this.f49650a) != null && !c20713qo3.m55595b().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.INTERSTITIAL);
        }
        if (this.f49652c.m57212c() != null && (c20713qo2 = this.f49650a) != null && !c20713qo2.m55597a().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.BANNER);
        }
        if (this.f49652c.m57210e() != null && (c20713qo = this.f49650a) != null && !c20713qo.m55593c().isEmpty()) {
            arrayList.add(IronSource.AD_UNIT.NATIVE_AD);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0042, code lost:
        if (r7.toString().equals(r6) != false) goto L11;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.C19721co m59058a(org.json.JSONObject r10) {
        /*
            r9 = this;
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            com.ironsource.co$b r1 = new com.ironsource.co$b
            r1.<init>()
            java.lang.String r2 = "delivery"
            r3 = 1
            boolean r2 = r10.optBoolean(r2, r3)
            r1.m59066a(r2)
            java.lang.String r2 = "capping"
            org.json.JSONObject r2 = r10.optJSONObject(r2)
            java.lang.String r4 = "enabled"
            r5 = 0
            if (r2 == 0) goto L59
            java.lang.String r6 = "unit"
            java.lang.String r6 = r2.optString(r6)
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L45
            com.ironsource.go r7 = com.ironsource.EnumC20005go.PER_DAY
            java.lang.String r8 = r7.toString()
            boolean r8 = r8.equals(r6)
            if (r8 == 0) goto L38
        L36:
            r0 = r7
            goto L45
        L38:
            com.ironsource.go r7 = com.ironsource.EnumC20005go.PER_HOUR
            java.lang.String r8 = r7.toString()
            boolean r6 = r8.equals(r6)
            if (r6 == 0) goto L45
            goto L36
        L45:
            java.lang.String r6 = "maxImpressions"
            int r6 = r2.optInt(r6, r5)
            boolean r2 = r2.optBoolean(r4, r5)
            if (r2 == 0) goto L55
            if (r6 <= 0) goto L55
            r2 = r3
            goto L56
        L55:
            r2 = r5
        L56:
            r1.m59064a(r2, r0, r6)
        L59:
            java.lang.String r0 = "pacing"
            org.json.JSONObject r10 = r10.optJSONObject(r0)
            if (r10 == 0) goto L74
            java.lang.String r0 = "numOfSeconds"
            int r0 = r10.optInt(r0, r5)
            boolean r10 = r10.optBoolean(r4, r5)
            if (r10 == 0) goto L70
            if (r0 <= 0) goto L70
            goto L71
        L70:
            r3 = r5
        L71:
            r1.m59065a(r3, r0)
        L74:
            com.ironsource.co r10 = r1.m59067a()
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.C19727cr.m59058a(org.json.JSONObject):com.ironsource.co");
    }

    /* renamed from: b */
    private JSONArray m59049b(JSONObject jSONObject, String str) {
        if (jSONObject == null) {
            return null;
        }
        if (this.f49659j) {
            JSONObject m59046c = m59046c(jSONObject, str);
            String m59059a = m59059a(str);
            if (m59046c == null || m59059a == null) {
                return null;
            }
            return m59046c.optJSONArray(m59059a);
        }
        return jSONObject.optJSONArray(str);
    }

    @Nullable
    /* renamed from: c */
    private JSONObject m59046c(JSONObject jSONObject, String str) {
        if (jSONObject != null) {
            return jSONObject.optJSONObject(str);
        }
        return null;
    }

    @NotNull
    /* renamed from: d */
    private JSONObject m59043d(JSONObject jSONObject, String str) {
        JSONObject m59046c = m59046c(jSONObject, str);
        return m59046c != null ? m59046c : new JSONObject();
    }

    /* renamed from: a */
    public static EnumC19728a m59060a(C19727cr c19727cr) {
        return c19727cr != null ? c19727cr.m59036h() : EnumC19728a.NOT_SET;
    }

    /* renamed from: b */
    private void m59050b(@NotNull JSONObject jSONObject) {
        this.f49660k = new C21219xb(jSONObject.optJSONObject(C20217kq.f50860d));
    }

    /* renamed from: a */
    private String m59059a(String str) {
        try {
            JSONObject m59046c = m59046c(m59046c(m59046c(m59046c(this.f49655f, "configurations"), "adFormats"), str), C20736r2.f52700c);
            if (m59046c != null) {
                Iterator<String> keys = m59046c.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    JSONObject m59046c2 = m59046c(m59046c, next);
                    if (m59046c2 != null && m59046c2.optBoolean(f49596i1)) {
                        return next;
                    }
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            C20086i9.m57997d().m58003a(e);
            IronLog.INTERNAL.error(e.toString());
            return null;
        }
    }

    /* renamed from: b */
    private boolean m59051b(String str) {
        return this.f49651b.m54924a("Mediation") && StringUtils.toLowerCase("IronSource").equals(StringUtils.toLowerCase(str));
    }

    /* renamed from: a */
    private void m59062a() {
        this.f49655f = new JSONObject();
        this.f49653d = "";
        this.f49654e = "";
        this.f49650a = new C20713qo();
        this.f49651b = C20979so.m54920c();
        this.f49652c = new C20331m8.C20332a().m57207a();
        this.f49658i = C19821el.m58802I().mo57484m();
        m59050b(this.f49655f);
    }

    /* renamed from: a */
    public void m59061a(EnumC19728a enumC19728a) {
        this.f49657h = enumC19728a;
    }

    /* renamed from: a */
    private boolean m59054a(JSONObject jSONObject, JSONObject jSONObject2, String str, boolean z) {
        return jSONObject.has(str) ? jSONObject.optBoolean(str, z) : jSONObject2.has(str) ? jSONObject2.optBoolean(str, z) : z;
    }

    /* renamed from: a */
    private int[] m59057a(JSONObject jSONObject, String str) {
        JSONArray optJSONArray = jSONObject.optJSONArray(str);
        if (optJSONArray != null) {
            int[] iArr = new int[optJSONArray.length()];
            for (int i = 0; i < optJSONArray.length(); i++) {
                iArr[i] = optJSONArray.optInt(i);
            }
            return iArr;
        }
        return null;
    }
}
