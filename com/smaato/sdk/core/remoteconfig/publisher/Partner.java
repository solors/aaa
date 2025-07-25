package com.smaato.sdk.core.remoteconfig.publisher;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.TextUtils;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public final class Partner {
    public static final String SMAATO_PARTNER_NAME = "SMAATO";
    private final double bidAdjustment;
    @NonNull
    private final String name;

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    public static Set<Partner> getPartners(@Nullable JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        HashSet hashSet = new HashSet(length);
        for (int i = 0; i < length; i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                hashSet.add(new C27271b(optJSONObject).m39373a());
            }
        }
        return hashSet;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || Partner.class != obj.getClass()) {
            return false;
        }
        Partner partner = (Partner) obj;
        if (Double.compare(partner.bidAdjustment, this.bidAdjustment) != 0) {
            return false;
        }
        return this.name.equals(partner.name);
    }

    public double getBidAdjustment() {
        return this.bidAdjustment;
    }

    @NonNull
    public String getName() {
        return this.name;
    }

    public int hashCode() {
        return Objects.hash(this.name, Double.valueOf(this.bidAdjustment));
    }

    public boolean isSmaato() {
        return SMAATO_PARTNER_NAME.equalsIgnoreCase(this.name);
    }

    private Partner(@NonNull String str, double d) {
        this.name = (String) Objects.requireNonNull(str);
        this.bidAdjustment = d;
    }

    /* renamed from: com.smaato.sdk.core.remoteconfig.publisher.Partner$b */
    /* loaded from: classes7.dex */
    static class C27271b {
        @Nullable

        /* renamed from: a */
        private String f71887a;
        @Nullable

        /* renamed from: b */
        private Double f71888b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C27271b() {
            this.f71887a = Partner.SMAATO_PARTNER_NAME;
            this.f71888b = Double.valueOf(100.0d);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @NonNull
        /* renamed from: a */
        public Partner m39373a() {
            if (TextUtils.isEmpty(this.f71887a)) {
                this.f71887a = Partner.SMAATO_PARTNER_NAME;
            }
            Double d = this.f71888b;
            if (d == null) {
                this.f71888b = Double.valueOf(100.0d);
            } else if (d.doubleValue() > 200.0d) {
                this.f71888b = Double.valueOf(200.0d);
            } else if (this.f71888b.doubleValue() < 0.0d) {
                this.f71888b = Double.valueOf(100.0d);
            }
            return new Partner(this.f71887a, this.f71888b.doubleValue());
        }

        C27271b(@NonNull JSONObject jSONObject) {
            this.f71887a = jSONObject.optString("name", null);
            if (jSONObject.optDouble("bidAdjustment", -1.0d) != -1.0d) {
                this.f71888b = Double.valueOf(jSONObject.optDouble("bidAdjustment"));
            }
        }
    }
}
