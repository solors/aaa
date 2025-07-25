package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.ironsource.C19897f5;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBBid implements POBAdDescriptor {

    /* renamed from: C */
    private boolean f70577C;
    @Nullable

    /* renamed from: D */
    private String f70578D;
    @Nullable

    /* renamed from: E */
    private List<String> f70579E;
    @Nullable

    /* renamed from: b */
    private String f70581b;
    @Nullable

    /* renamed from: c */
    private String f70582c;

    /* renamed from: d */
    private double f70583d;

    /* renamed from: e */
    private int f70584e;

    /* renamed from: f */
    private int f70585f;
    @Nullable

    /* renamed from: g */
    private String f70586g;
    @Nullable

    /* renamed from: h */
    private String f70587h;
    @Nullable

    /* renamed from: i */
    private String f70588i;
    @Nullable

    /* renamed from: j */
    private String f70589j;
    @Nullable

    /* renamed from: k */
    private String f70590k;
    @Nullable

    /* renamed from: l */
    private String f70591l;

    /* renamed from: m */
    private int f70592m;

    /* renamed from: n */
    private int f70593n;
    @Nullable

    /* renamed from: o */
    private List<POBReward> f70594o;
    @Nullable

    /* renamed from: p */
    private Map<String, String> f70595p;
    @Nullable

    /* renamed from: q */
    private JSONObject f70596q;
    @Nullable

    /* renamed from: r */
    private String f70597r;
    @Nullable

    /* renamed from: s */
    private String f70598s;
    @Nullable

    /* renamed from: t */
    private String f70599t;
    @Nullable

    /* renamed from: u */
    private String f70600u;

    /* renamed from: v */
    private boolean f70601v;
    @Nullable

    /* renamed from: w */
    private List<POBDSATransparencyInfo> f70602w;

    /* renamed from: x */
    private boolean f70603x;

    /* renamed from: y */
    private long f70604y;

    /* renamed from: z */
    private boolean f70605z;

    /* renamed from: B */
    private POBImpressionCountingMethod f70576B = POBImpressionCountingMethod.ON_LOAD;

    /* renamed from: a */
    private final long f70580a = System.currentTimeMillis();
    @NonNull

    /* renamed from: A */
    private String f70575A = POBAdDescriptor.DYNAMIC_PRICE_BID;

    /* loaded from: classes7.dex */
    public static class Builder {
        @NonNull

        /* renamed from: a */
        private final POBBid f70606a;
        @Nullable

        /* renamed from: b */
        private String f70607b;
        @Nullable

        /* renamed from: c */
        private String f70608c;

        /* renamed from: d */
        private int f70609d;

        /* renamed from: e */
        private int f70610e;
        @NonNull

        /* renamed from: f */
        private String f70611f;

        /* renamed from: g */
        private int f70612g;

        public Builder(@NonNull POBBid pOBBid) {
            this.f70606a = pOBBid;
            this.f70607b = pOBBid.f70598s;
            this.f70608c = pOBBid.f70587h;
            this.f70609d = pOBBid.f70592m;
            this.f70610e = pOBBid.f70593n;
            this.f70611f = pOBBid.f70575A;
            this.f70612g = pOBBid.f70584e;
        }

        @NonNull
        public POBBid build() {
            POBBid pOBBid = this.f70606a;
            POBBid create = POBBid.create(pOBBid, pOBBid.f70595p);
            create.f70598s = this.f70607b;
            create.f70587h = this.f70608c;
            create.f70592m = this.f70609d;
            create.f70593n = this.f70610e;
            create.f70575A = this.f70611f;
            create.f70584e = this.f70612g;
            return create;
        }

        @NonNull
        public Builder setBidStatus(int i) {
            this.f70612g = i;
            return this;
        }

        @NonNull
        public Builder setBidType(@NonNull String str) {
            this.f70611f = str;
            return this;
        }

        @NonNull
        public Builder setCreativeType(@NonNull String str) {
            this.f70607b = str;
            return this;
        }

        @NonNull
        public Builder setHeight(int i) {
            this.f70610e = i;
            return this;
        }

        @NonNull
        public Builder setPartnerId(@NonNull String str) {
            this.f70608c = str;
            return this;
        }

        @NonNull
        public Builder setWidth(int i) {
            this.f70609d = i;
            return this;
        }
    }

    private POBBid() {
    }

    @NonNull
    public static POBBid build(@NonNull String str, @NonNull JSONObject jSONObject) {
        int i;
        boolean z;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4;
        JSONArray optJSONArray;
        int i2;
        List<POBReward> list;
        POBBid pOBBid = new POBBid();
        pOBBid.f70596q = jSONObject;
        pOBBid.f70581b = jSONObject.optString("impid");
        pOBBid.f70582c = jSONObject.optString("id");
        pOBBid.f70589j = jSONObject.optString("adm");
        pOBBid.f70588i = jSONObject.optString("crid");
        pOBBid.f70586g = str;
        double optDouble = jSONObject.optDouble("price", 0.0d);
        pOBBid.f70583d = optDouble;
        boolean z2 = true;
        if (optDouble > 0.0d) {
            i = 1;
        } else {
            i = 0;
        }
        pOBBid.f70584e = i;
        String optString = jSONObject.optString("dealid");
        if (!POBUtils.isNullOrEmpty(optString)) {
            pOBBid.f70590k = optString;
        }
        pOBBid.f70591l = jSONObject.optString(C19897f5.f50024z);
        pOBBid.f70592m = jSONObject.optInt(POBNativeConstants.NATIVE_IMAGE_WIDTH);
        pOBBid.f70593n = jSONObject.optInt("h");
        pOBBid.f70597r = jSONObject.optString(C19897f5.f50023y);
        pOBBid.f70578D = jSONObject.optString(KeyConstants.RequestBody.KEY_BUNDLE, null);
        JSONObject optJSONObject5 = jSONObject.optJSONObject("ext");
        if (optJSONObject5 != null) {
            if (optJSONObject5.optInt(Reporting.EventType.WINNER) == 1) {
                z = true;
            } else {
                z = false;
            }
            pOBBid.f70605z = z;
            String optString2 = optJSONObject5.optString("crtype");
            pOBBid.f70598s = optString2;
            pOBBid.f70603x = "video".equals(optString2);
            if (optJSONObject5.optInt("imp_ct_mthd", 0) == 1) {
                pOBBid.f70576B = POBImpressionCountingMethod.ONE_PX_VIEWABLE;
            } else {
                pOBBid.f70576B = POBImpressionCountingMethod.ON_LOAD;
            }
            int optInt = optJSONObject5.optInt("refreshInterval", 0);
            if (pOBBid.f70603x) {
                optJSONObject = optJSONObject5.optJSONObject("video");
            } else {
                optJSONObject = optJSONObject5.optJSONObject("banner");
            }
            if (optJSONObject != null && (optJSONObject3 = optJSONObject.optJSONObject("clientconfig")) != null) {
                optInt = optJSONObject3.optInt("refreshinterval", optInt);
                if (pOBBid.f70603x && (optJSONObject4 = optJSONObject3.optJSONObject(Reporting.EventType.REWARD)) != null && (optJSONArray = optJSONObject4.optJSONArray("rewards")) != null && optJSONArray.length() > 0) {
                    pOBBid.f70594o = new ArrayList(optJSONArray.length());
                    for (int i3 = 0; i3 < optJSONArray.length(); i3++) {
                        JSONObject optJSONObject6 = optJSONArray.optJSONObject(i3);
                        if (optJSONObject6 != null && optJSONObject6.has("type") && optJSONObject6.has("value")) {
                            String optString3 = optJSONObject6.optString("type", "");
                            try {
                                i2 = Integer.parseInt(optJSONObject6.optString("value"));
                            } catch (NumberFormatException unused) {
                                POBLog.warn("POBBid", "Received invalid reward values", new Object[0]);
                                i2 = 0;
                            }
                            if (i2 > 0 && (list = pOBBid.f70594o) != null) {
                                list.add(new POBReward(optString3, i2));
                            }
                        }
                    }
                }
            }
            pOBBid.f70585f = POBUtils.getValidRefreshInterval(optInt, 5);
            JSONObject optJSONObject7 = optJSONObject5.optJSONObject("prebid");
            if (optJSONObject7 != null && (optJSONObject2 = optJSONObject7.optJSONObject("targeting")) != null) {
                try {
                    pOBBid.f70595p = new HashMap(4);
                    Iterator<String> keys = optJSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string = optJSONObject2.getString(next);
                        Map<String, String> map = pOBBid.f70595p;
                        if (map != null) {
                            map.put(next, string);
                        }
                    }
                } catch (JSONException e) {
                    POBLog.error("POBBid", "Exception on parsing prebid object : " + e.getMessage(), new Object[0]);
                }
            }
            JSONObject optJSONObject8 = optJSONObject5.optJSONObject("dsa");
            if (optJSONObject8 != null) {
                pOBBid.f70599t = optJSONObject8.optString("behalf");
                pOBBid.f70600u = optJSONObject8.optString("paid");
                JSONArray optJSONArray2 = optJSONObject8.optJSONArray("transparency");
                if (optJSONArray2 != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i4 = 0; i4 < optJSONArray2.length(); i4++) {
                        POBDSATransparencyInfo build = POBDSATransparencyInfo.build(optJSONArray2.optJSONObject(i4));
                        if (build != null) {
                            arrayList.add(build);
                        }
                    }
                    pOBBid.f70602w = arrayList;
                }
                if (optJSONObject8.optInt("adrender", 0) != 0) {
                    z2 = false;
                }
                pOBBid.f70601v = z2;
            }
            JSONArray optJSONArray3 = optJSONObject5.optJSONArray(POBNativeConstants.NATIVE_CLICK_TRACKER);
            if (!POBUtils.isJsonArrayNullOrEmpty(optJSONArray3)) {
                pOBBid.f70579E = new ArrayList(optJSONArray3.length());
                for (int i5 = 0; i5 < optJSONArray3.length(); i5++) {
                    pOBBid.f70579E.add(optJSONArray3.optString(i5));
                }
            }
        }
        return pOBBid;
    }

    @NonNull
    public static POBBid create(@NonNull POBBid pOBBid, @Nullable Map<String, String> map) {
        POBBid pOBBid2 = new POBBid();
        m40341a(pOBBid2, pOBBid);
        Map<String, String> map2 = pOBBid.f70595p;
        if (map2 != null && !map2.isEmpty()) {
            pOBBid2.f70595p = pOBBid.f70595p;
        } else {
            pOBBid2.f70595p = map;
        }
        return pOBBid2;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public POBAdDescriptor buildWithRefreshAndExpiryTimeout(int i, int i2) {
        POBBid create = create(this, this.f70595p);
        create.f70585f = i;
        create.f70604y = i2;
        return create;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean enableDsaInfoIcon() {
        if (this.f70601v && (!POBUtils.isNullOrEmpty(this.f70599t) || !POBUtils.isNullOrEmpty(this.f70600u))) {
            return true;
        }
        return false;
    }

    public boolean equals(@Nullable Object obj) {
        String str;
        if (this == obj) {
            return true;
        }
        if ((obj instanceof POBBid) && (str = this.f70582c) != null) {
            return str.equals(((POBBid) obj).getId());
        }
        return false;
    }

    @Nullable
    public List<POBReward> getAllRewards() {
        return this.f70594o;
    }

    @NonNull
    public String getBidType() {
        return this.f70575A;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getBundle() {
        return this.f70578D;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.f70579E;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.f70593n;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.f70592m;
    }

    @Nullable
    public String getCreative() {
        return this.f70589j;
    }

    @Nullable
    public String getCreativeId() {
        return this.f70588i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return this.f70598s;
    }

    @Nullable
    public String getDealId() {
        return this.f70590k;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return this.f70599t;
    }

    @Nullable
    public POBReward getFirstReward() {
        List<POBReward> list = this.f70594o;
        if (list != null && !list.isEmpty()) {
            return this.f70594o.get(0);
        }
        return null;
    }

    public int getHeight() {
        return this.f70593n;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getId() {
        return this.f70582c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @NonNull
    public POBImpressionCountingMethod getImpressionCountingMethod() {
        return this.f70576B;
    }

    @Nullable
    public String getImpressionId() {
        return this.f70581b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return this.f70600u;
    }

    @Nullable
    public String getPartnerId() {
        return this.f70587h;
    }

    @Nullable
    public String getPartnerName() {
        return this.f70586g;
    }

    public double getPrice() {
        return this.f70583d;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getRawBid() {
        return this.f70596q;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getRefreshInterval() {
        return this.f70585f;
    }

    public int getRemainingExpirationTime() {
        return (int) (this.f70604y - (System.currentTimeMillis() - this.f70580a));
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getRenderableContent() {
        return this.f70589j;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getStatus() {
        return this.f70584e;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public Map<String, String> getTargetingInfo() {
        if (this.f70584e == 1) {
            return this.f70595p;
        }
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return this.f70602w;
    }

    public int getWidth() {
        return this.f70592m;
    }

    @Nullable
    public String getlURL() {
        return this.f70597r;
    }

    @Nullable
    public String getnURL() {
        return this.f70591l;
    }

    public boolean hasWon() {
        return this.f70577C;
    }

    public int hashCode() {
        return (this.f70596q + this.f70581b + this.f70584e).hashCode();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return false;
    }

    public boolean isExpired() {
        if (getRemainingExpirationTime() <= 0) {
            return true;
        }
        return false;
    }

    public boolean isServerSideAuctionWinner() {
        return this.f70605z;
    }

    public boolean isStaticBid() {
        return "static".equals(this.f70575A);
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return this.f70603x;
    }

    public void setHasWon(boolean z) {
        this.f70577C = z;
    }

    @NonNull
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Price=");
        sb2.append(this.f70583d);
        sb2.append("PartnerName=");
        sb2.append(this.f70586g);
        sb2.append("impressionId");
        sb2.append(this.f70581b);
        sb2.append("bidId");
        sb2.append(this.f70582c);
        sb2.append("creativeId=");
        sb2.append(this.f70588i);
        if (this.f70594o != null) {
            sb2.append("Reward List:");
            sb2.append(this.f70594o.toString());
        }
        if (this.f70595p != null) {
            sb2.append(" Prebid targeting Info:");
            sb2.append(this.f70595p.toString());
        }
        return sb2.toString();
    }

    /* renamed from: a */
    private static void m40341a(@NonNull POBBid pOBBid, @NonNull POBBid pOBBid2) {
        pOBBid.f70581b = pOBBid2.f70581b;
        pOBBid.f70582c = pOBBid2.f70582c;
        pOBBid.f70583d = pOBBid2.f70583d;
        pOBBid.f70584e = pOBBid2.f70584e;
        pOBBid.f70585f = pOBBid2.f70585f;
        pOBBid.f70604y = pOBBid2.f70604y;
        pOBBid.f70586g = pOBBid2.f70586g;
        pOBBid.f70588i = pOBBid2.f70588i;
        pOBBid.f70589j = pOBBid2.f70589j;
        pOBBid.f70590k = pOBBid2.f70590k;
        pOBBid.f70591l = pOBBid2.f70591l;
        pOBBid.f70592m = pOBBid2.f70592m;
        pOBBid.f70593n = pOBBid2.f70593n;
        pOBBid.f70594o = pOBBid2.f70594o;
        pOBBid.f70603x = pOBBid2.f70603x;
        pOBBid.f70598s = pOBBid2.f70598s;
        pOBBid.f70587h = pOBBid2.f70587h;
        pOBBid.f70605z = pOBBid2.f70605z;
        pOBBid.f70596q = pOBBid2.f70596q;
        pOBBid.f70597r = pOBBid2.f70597r;
        pOBBid.f70575A = pOBBid2.f70575A;
        pOBBid.f70578D = pOBBid2.f70578D;
        pOBBid.f70577C = pOBBid2.f70577C;
        pOBBid.f70595p = pOBBid2.f70595p;
        pOBBid.f70599t = pOBBid2.f70599t;
        pOBBid.f70600u = pOBBid2.f70600u;
        pOBBid.f70601v = pOBBid2.f70601v;
        pOBBid.f70602w = pOBBid2.f70602w;
        pOBBid.f70576B = pOBBid2.f70576B;
        pOBBid.f70579E = pOBBid2.f70579E;
    }
}
