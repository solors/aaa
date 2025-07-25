package com.inmobi.media;

import androidx.annotation.VisibleForTesting;
import com.inmobi.adquality.models.AdQualityControl;
import com.inmobi.ads.AdMetaInfo;
import io.bidmachine.unified.UnifiedMediationParams;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* renamed from: com.inmobi.media.h */
/* loaded from: classes6.dex */
public class C19292h {
    @NotNull
    public static final String CLICK_BEACON = "click";
    @NotNull
    public static final C19264f Companion = new C19264f();
    private static final boolean DEFAULT_ALLOW_AUTO_REDIRECTION = false;
    @NotNull
    public static final String IMPRESSION_BEACON = "impression";
    private static final long INVALID_AD_EXPIRY = -1;
    @NotNull
    public static final String LOAD_AD_TOKEN_URL = "load_ad_token_url";
    @NotNull
    public static final String LOAD_AD_TOKEN_URL_FAILURE = "load_ad_token_url_failure";
    private static final String TAG = "h";
    @NotNull
    public static final String WIN_BEACON = "win_beacon";
    @Nullable
    private final String adAuctionMeta;
    @Nullable
    private JSONObject adContent;
    @NotNull
    private final InterfaceC38501j adMetaInfo$delegate;
    @Nullable
    private AdQualityControl adQualityControl;
    @Nullable
    private String adType;
    private final boolean allowAutoRedirection;
    @Nullable
    private JSONArray assetUrls;
    @Nullable
    private final JSONObject contextData;
    @InterfaceC19241d4
    @Nullable
    private C19181Z features;
    @NotNull
    private final String impressionId;
    private boolean isPreloadWebView;
    @Nullable
    private JSONArray landingPageParams;
    private long mExpiryDurationInMillis;
    private long mInsertionTimestampInMillis;
    @NotNull
    private String markupType;
    @Nullable
    private final JSONObject metaInfo;
    @NotNull
    private String pubContent;
    @Nullable

    /* renamed from: sf */
    private String f48275sf;
    @Nullable
    private final JSONArray trackers;
    @NotNull
    private final JSONObject transaction;
    @NotNull
    private String webVast;

    public C19292h() {
        InterfaceC38501j m14554a;
        this.webVast = "";
        this.impressionId = "";
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        m14554a = LazyJVM.m14554a(new C19278g(this));
        this.adMetaInfo$delegate = m14554a;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
    }

    @Nullable
    /* renamed from: A */
    public final String m60325A() {
        return this.f48275sf;
    }

    @Nullable
    /* renamed from: C */
    public final Boolean m60323C() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Boolean.valueOf(jSONObject.optBoolean("enabled"));
        }
        return null;
    }

    @Nullable
    /* renamed from: D */
    public final JSONArray m60322D() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            return jSONObject.optJSONArray("trackingEvents");
        }
        return null;
    }

    @NotNull
    /* renamed from: E */
    public final JSONObject m60321E() {
        return this.transaction;
    }

    @NotNull
    /* renamed from: F */
    public final String m60320F() {
        return this.webVast;
    }

    /* renamed from: G */
    public final boolean m60319G() {
        return this.isPreloadWebView;
    }

    /* renamed from: a */
    public final void m60314a(@Nullable JSONArray jSONArray) {
        this.assetUrls = jSONArray;
    }

    @Nullable
    /* renamed from: b */
    public final String m60310b() {
        return this.adAuctionMeta;
    }

    @Nullable
    /* renamed from: c */
    public final JSONObject m60308c() {
        return this.adContent;
    }

    /* renamed from: d */
    public final void m60305d(@Nullable String str) {
        this.f48275sf = str;
    }

    /* renamed from: e */
    public final void m60303e(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.webVast = str;
    }

    @Nullable
    /* renamed from: f */
    public final String m60302f() {
        return this.adType;
    }

    @Nullable
    /* renamed from: h */
    public final String m60299h() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("advertisedContent", null);
    }

    /* renamed from: i */
    public final boolean m60298i() {
        return this.allowAutoRedirection;
    }

    @Nullable
    /* renamed from: j */
    public final Long m60297j() {
        try {
            JSONObject jSONObject = this.adContent;
            if (jSONObject == null || !jSONObject.has("asPlcId")) {
                return null;
            }
            return Long.valueOf(jSONObject.getLong("asPlcId"));
        } catch (JSONException e) {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19321j0.m60218a(e, "event"));
        }
        return null;
    }

    @Nullable
    /* renamed from: k */
    public final JSONArray m60296k() {
        return this.assetUrls;
    }

    @Nullable
    /* renamed from: l */
    public final String m60295l() {
        JSONObject jSONObject = this.adContent;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("baseEventUrl", null);
    }

    @Nullable
    /* renamed from: m */
    public final Long m60294m() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject != null) {
            return Long.valueOf(jSONObject.optLong("bidderId"));
        }
        return null;
    }

    /* renamed from: n */
    public final int m60293n() {
        JSONObject jSONObject = this.contextData;
        if (jSONObject == null) {
            return -1;
        }
        return jSONObject.optInt("casAdTypeId", -1);
    }

    @NotNull
    /* renamed from: o */
    public final String m60292o() {
        String str;
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            str = jSONObject.optString(UnifiedMediationParams.KEY_CREATIVE_ID);
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @Nullable
    /* renamed from: p */
    public final String m60291p() {
        JSONObject jSONObject = this.metaInfo;
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.optString("creativeType", null);
    }

    @Nullable
    /* renamed from: q */
    public final C19181Z m60290q() {
        return this.features;
    }

    @NotNull
    /* renamed from: s */
    public final String m60288s() {
        return this.impressionId;
    }

    @NotNull
    /* renamed from: t */
    public final String m60287t() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = this.metaInfo;
        if (jSONObject2 == null) {
            return "DEFAULT";
        }
        JSONArray optJSONArray = jSONObject2.optJSONArray("landingPageParams");
        this.landingPageParams = optJSONArray;
        if (optJSONArray == null) {
            return "DEFAULT";
        }
        Object opt = optJSONArray.opt(0);
        if (opt instanceof JSONObject) {
            jSONObject = (JSONObject) opt;
        } else {
            jSONObject = null;
        }
        if (jSONObject == null) {
            return "DEFAULT";
        }
        String optString = jSONObject.optString("openMode", "DEFAULT");
        Intrinsics.checkNotNullExpressionValue(optString, "optString(...)");
        return optString;
    }

    @NotNull
    /* renamed from: u */
    public final String m60286u() {
        return this.markupType;
    }

    @NotNull
    /* renamed from: w */
    public final String m60284w() {
        String str;
        JSONObject jSONObject = this.adContent;
        if (jSONObject != null) {
            str = jSONObject.optString("telemetryMetadataBlob");
        } else {
            str = null;
        }
        if (str == null) {
            return "";
        }
        return str;
    }

    @NotNull
    /* renamed from: x */
    public final String m60283x() {
        return this.pubContent;
    }

    @NotNull
    /* renamed from: y */
    public final Set<C19554z9> m60282y() {
        HashSet hashSet = new HashSet();
        try {
            JSONArray jSONArray = this.assetUrls;
            if (jSONArray != null) {
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject jSONObject = new JSONObject(jSONArray.getString(i));
                    byte b = (byte) jSONObject.getInt("type");
                    String optString = jSONObject.optString("url");
                    Intrinsics.m17074g(optString);
                    if (optString.length() > 0) {
                        hashSet.add(new C19554z9(b, optString));
                    }
                }
            }
        } catch (JSONException e) {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19321j0.m60218a(e, "event"));
        }
        return hashSet;
    }

    @Nullable
    /* renamed from: z */
    public final Map<String, String> m60281z() {
        JSONObject pubContent;
        try {
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                pubContent = jSONObject.getJSONObject("pubContent");
            } else {
                pubContent = null;
            }
            if (pubContent != null) {
                Companion.getClass();
                Intrinsics.checkNotNullParameter(pubContent, "pubContent");
                if (!pubContent.has("rewards")) {
                    return null;
                }
                HashMap hashMap = new HashMap();
                JSONObject optJSONObject = pubContent.optJSONObject("rewards");
                if (optJSONObject != null) {
                    Iterator<String> keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = optJSONObject.getString(next);
                        Intrinsics.m17074g(next);
                        Intrinsics.m17074g(string);
                        hashMap.put(next, string);
                    }
                }
                return hashMap;
            }
        } catch (JSONException e) {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19321j0.m60218a(e, "event"));
        }
        return null;
    }

    /* renamed from: a */
    public final void m60311a(boolean z) {
        this.isPreloadWebView = z;
    }

    /* renamed from: b */
    public final void m60309b(@Nullable String str) {
        try {
            this.transaction.put(C19223c0.CTX_HASH_KEY, str);
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (JSONException e) {
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19321j0.m60218a(e, "event"));
        }
    }

    @Nullable
    /* renamed from: c */
    public final List<String> m60307c(@NotNull String type) {
        JSONArray optJSONArray;
        Intrinsics.checkNotNullParameter(type, "type");
        if (this.trackers == null) {
            return null;
        }
        LinkedList linkedList = new LinkedList();
        int length = this.trackers.length();
        for (int i = 0; i < length; i++) {
            try {
                JSONObject jSONObject = this.trackers.getJSONObject(i);
                if (Intrinsics.m17075f(type, jSONObject.optString("type")) && (optJSONArray = jSONObject.optJSONArray("url")) != null) {
                    int length2 = optJSONArray.length();
                    for (int i2 = 0; i2 < length2; i2++) {
                        linkedList.add(optJSONArray.getString(i2));
                    }
                }
            } catch (JSONException unused) {
                return null;
            }
        }
        if (linkedList.isEmpty()) {
            return null;
        }
        return linkedList;
    }

    @NotNull
    /* renamed from: d */
    public final AdMetaInfo m60306d() {
        return (AdMetaInfo) this.adMetaInfo$delegate.getValue();
    }

    @Nullable
    /* renamed from: e */
    public final AdQualityControl m60304e() {
        return this.adQualityControl;
    }

    /* renamed from: f */
    public final void m60301f(@NotNull String pubContent) throws JSONException {
        Intrinsics.checkNotNullParameter(pubContent, "pubContent");
        if (Intrinsics.m17075f("inmobiJson", this.markupType)) {
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("pubContent", new JSONObject(pubContent));
            }
        } else {
            JSONObject jSONObject2 = this.adContent;
            if (jSONObject2 != null) {
                jSONObject2.put("pubContent", pubContent);
            }
        }
        this.pubContent = pubContent;
    }

    /* renamed from: a */
    public final void m60316a(@Nullable C19181Z c19181z) {
        this.features = c19181z;
    }

    /* renamed from: a */
    public final void m60318a() throws IllegalStateException {
        if (!Intrinsics.m17075f(this.markupType, "unknown")) {
            if (this.impressionId.length() != 0) {
                return;
            }
            String TAG2 = TAG;
            Intrinsics.checkNotNullExpressionValue(TAG2, "TAG");
            AbstractC19187Z5.m60514a((byte) 1, TAG2, "Impression Id is Null");
            throw new IllegalArgumentException("Invalid Ad");
        }
        String TAG3 = TAG;
        Intrinsics.checkNotNullExpressionValue(TAG3, "TAG");
        AbstractC19187Z5.m60514a((byte) 1, TAG3, "UnKnown MarkUp Type");
        throw new IllegalArgumentException("Invalid Ad");
    }

    public C19292h(@NotNull C19292h ad2, @Nullable JSONArray jSONArray) {
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.webVast = "";
        this.impressionId = "";
        this.transaction = new JSONObject();
        this.pubContent = "";
        this.markupType = "unknown";
        m14554a = LazyJVM.m14554a(new C19278g(this));
        this.adMetaInfo$delegate = m14554a;
        C19354l5.m60062b(ad2, this);
        this.assetUrls = jSONArray;
    }

    /* renamed from: a */
    public final void m60312a(@Nullable JSONObject jSONObject, @Nullable String str, long j) {
        this.adContent = jSONObject;
        this.adType = str;
        this.mInsertionTimestampInMillis = System.currentTimeMillis();
        this.mExpiryDurationInMillis = j;
        String str2 = this.f48275sf;
        if (str2 != null) {
            if (!AbstractC19225c2.m60400a(str2)) {
                str2 = null;
            }
            if (str2 != null) {
                this.features = new C19181Z(str2);
            }
        }
    }

    /* renamed from: a */
    public final boolean m60317a(long j) {
        long currentTimeMillis;
        long j2 = this.mExpiryDurationInMillis;
        int i = (j2 > (-1L) ? 1 : (j2 == (-1L) ? 0 : -1));
        if ((i == 0 ? -1L : this.mInsertionTimestampInMillis + j2) == -1) {
            currentTimeMillis = (TimeUnit.SECONDS.toMillis(j) + this.mInsertionTimestampInMillis) - System.currentTimeMillis();
        } else {
            currentTimeMillis = (i != 0 ? this.mInsertionTimestampInMillis + j2 : -1L) - System.currentTimeMillis();
        }
        return currentTimeMillis < 0;
    }

    @VisibleForTesting
    /* renamed from: B */
    public static /* synthetic */ void m60324B() {
    }

    /* renamed from: g */
    public static /* synthetic */ void m60300g() {
    }

    @VisibleForTesting
    /* renamed from: r */
    public static /* synthetic */ void m60289r() {
    }

    /* renamed from: v */
    public static /* synthetic */ void m60285v() {
    }

    /* renamed from: a */
    public final void m60315a(@NotNull String buyerPrice) {
        Intrinsics.checkNotNullParameter(buyerPrice, "buyerPrice");
        try {
            this.transaction.put(C19223c0.BUYER_PRICE, Double.parseDouble(buyerPrice));
            JSONObject jSONObject = this.adContent;
            if (jSONObject != null) {
                jSONObject.put("transaction", this.transaction);
            }
        } catch (Exception e) {
            C19070Q4 c19070q4 = C19070Q4.f47635a;
            C19070Q4.f47637c.m59556a(AbstractC19521x4.m59587a(e, "event"));
        }
    }

    /* renamed from: a */
    public final void m60313a(@Nullable JSONObject jSONObject) throws JSONException {
        String m16628I;
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                String str = this.pubContent;
                Intrinsics.m17074g(next);
                String string = jSONObject.getString(next);
                Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                m16628I = StringsJVM.m16628I(str, next, string, false, 4, null);
                this.pubContent = m16628I;
            }
        }
        m60301f(this.pubContent);
    }
}
