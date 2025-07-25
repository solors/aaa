package com.pubmatic.sdk.common.models;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p552ot.pubsub.util.C26601v;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.base.POBBidsProvider;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBAdResponse<T extends POBAdDescriptor> implements POBBidsProvider {
    @NonNull

    /* renamed from: a */
    private List<T> f70104a;
    @Nullable

    /* renamed from: b */
    private Integer f70105b;
    @Nullable

    /* renamed from: c */
    private List<T> f70106c;
    @Nullable

    /* renamed from: d */
    private T f70107d;
    @Nullable

    /* renamed from: e */
    private T f70108e;

    /* renamed from: f */
    private int f70109f;
    @Nullable

    /* renamed from: g */
    private JSONObject f70110g;

    /* renamed from: h */
    private boolean f70111h;

    @NonNull
    public static <T extends POBAdDescriptor> POBAdResponse<T> defaultResponse() {
        POBAdResponse<T> pOBAdResponse = new POBAdResponse<>();
        ((POBAdResponse) pOBAdResponse).f70104a = new ArrayList();
        ((POBAdResponse) pOBAdResponse).f70109f = 30;
        return pOBAdResponse;
    }

    @Nullable
    public POBAdDescriptor getBid(@Nullable String str) {
        if (POBUtils.isNullOrEmpty(str)) {
            return null;
        }
        for (T t : this.f70104a) {
            if (str.equals(t.getId())) {
                return t;
            }
        }
        return null;
    }

    @NonNull
    public List<T> getBids() {
        return this.f70104a;
    }

    @Nullable
    public JSONObject getCustomData() {
        return this.f70110g;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidsProvider
    @Nullable
    public Integer getNbrCode() {
        return this.f70105b;
    }

    @Nullable
    public T getNextHighestDynamicBid() {
        return this.f70108e;
    }

    public int getRefreshInterval() {
        return this.f70109f;
    }

    @Nullable
    public List<T> getServerSidePartnerBids() {
        return this.f70106c;
    }

    @Override // com.pubmatic.sdk.common.base.POBBidsProvider
    @Nullable
    public Map<String, String> getTargetingInfo() {
        Map<String, String> targetingInfo;
        Map<String, String> targetingInfo2;
        HashMap hashMap = new HashMap();
        if (this.f70111h) {
            for (T t : getBids()) {
                if (t != null && (targetingInfo2 = t.getTargetingInfo()) != null) {
                    try {
                        hashMap.putAll(targetingInfo2);
                    } catch (ClassCastException | IllegalArgumentException | NullPointerException | UnsupportedOperationException unused) {
                        POBLog.error("POBAdResponse", "Failed to add targeting info", new Object[0]);
                    }
                }
            }
        } else {
            T t2 = this.f70107d;
            if (t2 != null && (targetingInfo = t2.getTargetingInfo()) != null) {
                hashMap.putAll(targetingInfo);
            }
        }
        if (hashMap.size() == 0) {
            return null;
        }
        return hashMap;
    }

    @Nullable
    public T getWinningBid() {
        return this.f70107d;
    }

    public boolean isSendAllBidsEnabled() {
        return this.f70111h;
    }

    /* loaded from: classes7.dex */
    public static class Builder<T extends POBAdDescriptor> {
        @NonNull

        /* renamed from: a */
        private List<T> f70112a;
        @Nullable

        /* renamed from: b */
        private Integer f70113b;
        @Nullable

        /* renamed from: c */
        private List<T> f70114c;
        @Nullable

        /* renamed from: d */
        private T f70115d;
        @Nullable

        /* renamed from: e */
        private T f70116e;

        /* renamed from: f */
        private int f70117f;
        @Nullable

        /* renamed from: g */
        private JSONObject f70118g;

        /* renamed from: h */
        private boolean f70119h;

        public Builder(@NonNull List<T> list) {
            this.f70112a = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        /* renamed from: a */
        private List<T> m40606a(List<T> list, @NonNull String str) {
            POBAdDescriptor buildWithRefreshAndExpiryTimeout;
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (t != null && (buildWithRefreshAndExpiryTimeout = t.buildWithRefreshAndExpiryTimeout(this.f70117f, m40607a((Builder<T>) t, str))) != null) {
                    arrayList.add(buildWithRefreshAndExpiryTimeout);
                }
            }
            list.clear();
            list.addAll(arrayList);
            return list;
        }

        @NonNull
        public POBAdResponse<T> build() {
            POBAdResponse<T> pOBAdResponse = new POBAdResponse<>();
            ((POBAdResponse) pOBAdResponse).f70104a = this.f70112a;
            ((POBAdResponse) pOBAdResponse).f70105b = this.f70113b;
            ((POBAdResponse) pOBAdResponse).f70106c = this.f70114c;
            ((POBAdResponse) pOBAdResponse).f70107d = this.f70115d;
            ((POBAdResponse) pOBAdResponse).f70109f = this.f70117f;
            ((POBAdResponse) pOBAdResponse).f70110g = this.f70118g;
            ((POBAdResponse) pOBAdResponse).f70111h = this.f70119h;
            ((POBAdResponse) pOBAdResponse).f70108e = this.f70116e;
            return pOBAdResponse;
        }

        public Builder<T> setNbrCode(@Nullable Integer num) {
            this.f70113b = num;
            return this;
        }

        @NonNull
        public Builder<T> setNextHighestDynamicBid(@Nullable T t) {
            this.f70116e = t;
            return this;
        }

        public Builder<T> setRefreshInterval(int i) {
            this.f70117f = i;
            return this;
        }

        public Builder<T> setSendAllBidsState(boolean z) {
            this.f70119h = z;
            return this;
        }

        public Builder<T> setServerSidePartnerBids(List<T> list) {
            this.f70114c = list;
            return this;
        }

        public Builder<T> setWinningBid(@Nullable T t) {
            this.f70115d = t;
            return this;
        }

        public Builder<T> updateWinningBid(@NonNull T t) {
            if (this.f70112a.remove(t)) {
                this.f70112a.add(t);
            }
            List<T> list = this.f70114c;
            if (list != null && list.remove(t)) {
                this.f70114c.add(t);
            }
            this.f70115d = t;
            return this;
        }

        public Builder<T> updateWithRefreshIntervalAndExpiryTimeout(@NonNull String str) {
            List<T> list = this.f70114c;
            if (list != null) {
                m40606a(list, str);
            }
            m40606a(this.f70112a, str);
            T t = this.f70115d;
            if (t != null) {
                this.f70115d = (T) t.buildWithRefreshAndExpiryTimeout(this.f70117f, m40607a((Builder<T>) t, str));
            }
            return this;
        }

        public Builder(@NonNull POBAdResponse<T> pOBAdResponse) {
            this.f70112a = ((POBAdResponse) pOBAdResponse).f70104a;
            this.f70113b = ((POBAdResponse) pOBAdResponse).f70105b;
            this.f70114c = ((POBAdResponse) pOBAdResponse).f70106c;
            this.f70115d = (T) ((POBAdResponse) pOBAdResponse).f70107d;
            this.f70117f = ((POBAdResponse) pOBAdResponse).f70109f;
            this.f70118g = ((POBAdResponse) pOBAdResponse).f70110g;
            this.f70119h = ((POBAdResponse) pOBAdResponse).f70111h;
            this.f70116e = (T) ((POBAdResponse) pOBAdResponse).f70108e;
        }

        /* renamed from: a */
        private int m40607a(@NonNull T t, @NonNull String str) {
            char c;
            int hashCode = str.hashCode();
            if (hashCode == -1183997287) {
                if (str.equals("inline")) {
                    c = 0;
                }
                c = 65535;
            } else if (hashCode != -1052618729) {
                if (hashCode == 604727084 && str.equals("interstitial")) {
                    c = 1;
                }
                c = 65535;
            } else {
                if (str.equals("native")) {
                    c = 2;
                }
                c = 65535;
            }
            if (c == 0 && !t.isVideo()) {
                return 300000;
            }
            return C26601v.f69837d;
        }

        public Builder(@NonNull JSONObject jSONObject) {
            this.f70112a = new ArrayList();
            this.f70118g = jSONObject;
        }
    }

    private POBAdResponse() {
        this.f70104a = new ArrayList();
    }
}
