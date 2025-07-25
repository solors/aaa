package com.applovin.impl.mediation;

import androidx.annotation.NonNull;
import com.applovin.mediation.MaxReward;

/* loaded from: classes2.dex */
public class MaxRewardImpl implements MaxReward {

    /* renamed from: a */
    private final String f7978a;

    /* renamed from: b */
    private final int f7979b;

    private MaxRewardImpl(int i, String str) {
        if (i >= 0) {
            this.f7978a = str;
            this.f7979b = i;
            return;
        }
        throw new IllegalArgumentException("Reward amount must be greater than or equal to 0");
    }

    public static MaxReward create(int i, String str) {
        return new MaxRewardImpl(i, str);
    }

    public static MaxReward createDefault() {
        return create(0, "");
    }

    @Override // com.applovin.mediation.MaxReward
    public final int getAmount() {
        return this.f7979b;
    }

    @Override // com.applovin.mediation.MaxReward
    public final String getLabel() {
        return this.f7978a;
    }

    @NonNull
    public String toString() {
        return "MaxReward{amount=" + this.f7979b + ", label=" + this.f7978a + "}";
    }
}
