package com.smaato.sdk.core.remoteconfig.publisher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.remoteconfig.publisher.Partner;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import com.smaato.sdk.core.util.collections.CollectionUtils;
import com.smaato.sdk.core.util.collections.Sets;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class UnifiedBidding {
    private final long bidTimeoutMillis;
    @NonNull
    private final Set<Partner> partners;
    private final double priceGranularity;
    @NonNull
    private final String typeOfBidsToSend;

    /* renamed from: com.smaato.sdk.core.remoteconfig.publisher.UnifiedBidding$b */
    /* loaded from: classes7.dex */
    static final class C27275b {

        /* renamed from: e */
        private static final Set<Partner> f71890e = Collections.singleton(new Partner.C27271b().m39373a());
        @Nullable

        /* renamed from: a */
        private Double f71891a;
        @Nullable

        /* renamed from: b */
        private Long f71892b;
        @Nullable

        /* renamed from: c */
        private String f71893c;
        @Nullable

        /* renamed from: d */
        private Set<Partner> f71894d;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27275b() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public UnifiedBidding m39371a() {
            Double d = this.f71891a;
            if (d == null || d.doubleValue() < 0.01d || this.f71891a.doubleValue() > 10.0d) {
                this.f71891a = Double.valueOf(0.1d);
            }
            Long l = this.f71892b;
            if (l == null || l.longValue() < 500 || this.f71892b.longValue() > 5000) {
                this.f71892b = 1000L;
            }
            if (TextUtils.isEmpty(this.f71893c)) {
                this.f71893c = "WINNER";
            }
            if (this.f71894d == null) {
                this.f71894d = f71890e;
            }
            return new UnifiedBidding(this.f71891a.doubleValue(), this.f71893c, this.f71892b.longValue(), this.f71894d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27275b(@NonNull JSONObject jSONObject) {
            if (jSONObject.optDouble("priceGranularity", -1.0d) != -1.0d) {
                this.f71891a = Double.valueOf(jSONObject.optDouble("priceGranularity"));
            }
            if (jSONObject.optLong("timeout", -1L) != -1) {
                this.f71892b = Long.valueOf(jSONObject.optLong("timeout"));
            }
            this.f71893c = jSONObject.optString("bidsSent", null);
            this.f71894d = Partner.getPartners(jSONObject.optJSONArray("partners"));
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UnifiedBidding unifiedBidding = (UnifiedBidding) obj;
        if (Double.compare(unifiedBidding.priceGranularity, this.priceGranularity) != 0 || this.bidTimeoutMillis != unifiedBidding.bidTimeoutMillis || !this.typeOfBidsToSend.equals(unifiedBidding.typeOfBidsToSend)) {
            return false;
        }
        return CollectionUtils.equalsByElements(this.partners, unifiedBidding.partners);
    }

    public long getBidTimeoutMillis() {
        return this.bidTimeoutMillis;
    }

    @NonNull
    public Set<Partner> getPartners() {
        return this.partners;
    }

    public double getPriceGranularity() {
        return this.priceGranularity;
    }

    @NonNull
    public String getTypeOfBidsToSend() {
        return this.typeOfBidsToSend;
    }

    public int hashCode() {
        return Objects.hash(Double.valueOf(this.priceGranularity), Long.valueOf(this.bidTimeoutMillis), this.typeOfBidsToSend, this.partners);
    }

    private UnifiedBidding(double d, @NonNull String str, long j, @NonNull Set<Partner> set) {
        this.typeOfBidsToSend = (String) Objects.requireNonNull(str);
        this.partners = Sets.toImmutableSet((Collection) Objects.requireNonNull(set));
        this.priceGranularity = d;
        this.bidTimeoutMillis = j;
    }
}
