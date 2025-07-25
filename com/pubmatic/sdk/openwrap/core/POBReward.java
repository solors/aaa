package com.pubmatic.sdk.openwrap.core;

import androidx.annotation.NonNull;
import com.pubmatic.sdk.common.p565ui.POBCoreReward;
import java.util.Objects;

/* loaded from: classes7.dex */
public class POBReward implements POBCoreReward {
    public static final int DEFAULT_REWARD_AMOUNT_VALUE = 0;
    public static final String DEFAULT_REWARD_TYPE_LABEL = "";
    @NonNull

    /* renamed from: a */
    private final String f70661a;

    /* renamed from: b */
    private final int f70662b;

    public POBReward(@NonNull String str, int i) {
        this.f70661a = str;
        this.f70662b = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        POBReward pOBReward = (POBReward) obj;
        if (this.f70662b == pOBReward.f70662b && this.f70661a.equals(pOBReward.f70661a)) {
            return true;
        }
        return false;
    }

    @Override // com.pubmatic.sdk.common.p565ui.POBCoreReward
    public int getAmount() {
        return this.f70662b;
    }

    @Override // com.pubmatic.sdk.common.p565ui.POBCoreReward
    @NonNull
    public String getCurrencyType() {
        return this.f70661a;
    }

    public int hashCode() {
        return Objects.hash(this.f70661a, Integer.valueOf(this.f70662b));
    }

    @NonNull
    public String toString() {
        return "POBReward{currencyType='" + this.f70661a + "', amount='" + this.f70662b + "'}";
    }
}
