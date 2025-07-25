package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.collection.CollectionUtils;
import io.appmetrica.analytics.impl.AbstractC34679kn;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.Map;

/* loaded from: classes9.dex */
public class AdRevenue {
    @Nullable
    public final String adNetwork;
    @Nullable
    public final String adPlacementId;
    @Nullable
    public final String adPlacementName;
    @NonNull
    public final BigDecimal adRevenue;
    @Nullable
    public final AdType adType;
    @Nullable
    public final String adUnitId;
    @Nullable
    public final String adUnitName;
    @NonNull
    public final Currency currency;
    @Nullable
    public final Map<String, String> payload;
    @Nullable
    public final String precision;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: a */
        private final BigDecimal f92160a;

        /* renamed from: b */
        private final Currency f92161b;

        /* renamed from: c */
        private AdType f92162c;

        /* renamed from: d */
        private String f92163d;

        /* renamed from: e */
        private String f92164e;

        /* renamed from: f */
        private String f92165f;

        /* renamed from: g */
        private String f92166g;

        /* renamed from: h */
        private String f92167h;

        /* renamed from: i */
        private String f92168i;

        /* renamed from: j */
        private Map f92169j;

        /* synthetic */ Builder(BigDecimal bigDecimal, Currency currency, int i) {
            this(bigDecimal, currency);
        }

        public AdRevenue build() {
            return new AdRevenue(this.f92160a, this.f92161b, this.f92162c, this.f92163d, this.f92164e, this.f92165f, this.f92166g, this.f92167h, this.f92168i, this.f92169j, 0);
        }

        public Builder withAdNetwork(@Nullable String str) {
            this.f92163d = str;
            return this;
        }

        public Builder withAdPlacementId(@Nullable String str) {
            this.f92166g = str;
            return this;
        }

        public Builder withAdPlacementName(@Nullable String str) {
            this.f92167h = str;
            return this;
        }

        public Builder withAdType(@Nullable AdType adType) {
            this.f92162c = adType;
            return this;
        }

        public Builder withAdUnitId(@Nullable String str) {
            this.f92164e = str;
            return this;
        }

        public Builder withAdUnitName(@Nullable String str) {
            this.f92165f = str;
            return this;
        }

        public Builder withPayload(@Nullable Map<String, String> map) {
            Map copyOf;
            if (map == null) {
                copyOf = null;
            } else {
                copyOf = CollectionUtils.copyOf(map);
            }
            this.f92169j = copyOf;
            return this;
        }

        public Builder withPrecision(@Nullable String str) {
            this.f92168i = str;
            return this;
        }

        private Builder(BigDecimal bigDecimal, Currency currency) {
            this.f92160a = bigDecimal;
            this.f92161b = currency;
        }
    }

    /* synthetic */ AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map, int i) {
        this(bigDecimal, currency, adType, str, str2, str3, str4, str5, str6, map);
    }

    public static Builder newBuilder(@NonNull BigDecimal bigDecimal, @NonNull Currency currency) {
        return new Builder(bigDecimal, currency, 0);
    }

    private AdRevenue(BigDecimal bigDecimal, Currency currency, AdType adType, String str, String str2, String str3, String str4, String str5, String str6, Map map) {
        this.adRevenue = bigDecimal;
        this.currency = currency;
        this.adType = adType;
        this.adNetwork = str;
        this.adUnitId = str2;
        this.adUnitName = str3;
        this.adPlacementId = str4;
        this.adPlacementName = str5;
        this.precision = str6;
        this.payload = map == null ? null : CollectionUtils.unmodifiableMapCopy(map);
    }

    public static Builder newBuilder(long j, @NonNull Currency currency) {
        return new Builder(AbstractC34679kn.m21475a(j), currency, 0);
    }

    public static Builder newBuilder(double d, @NonNull Currency currency) {
        return new Builder(new BigDecimal(AbstractC34679kn.m21476a(d)), currency, 0);
    }
}
