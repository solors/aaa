package io.appmetrica.analytics.billinginterface.internal.config;

import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
public class BillingConfig {
    public final int firstCollectingInappMaxAgeSeconds;
    public final int sendFrequencySeconds;

    public BillingConfig(int i, int i2) {
        this.sendFrequencySeconds = i;
        this.firstCollectingInappMaxAgeSeconds = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BillingConfig billingConfig = (BillingConfig) obj;
        if (this.sendFrequencySeconds == billingConfig.sendFrequencySeconds && this.firstCollectingInappMaxAgeSeconds == billingConfig.firstCollectingInappMaxAgeSeconds) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (this.sendFrequencySeconds * 31) + this.firstCollectingInappMaxAgeSeconds;
    }

    @NonNull
    public String toString() {
        return "BillingConfig{sendFrequencySeconds=" + this.sendFrequencySeconds + ", firstCollectingInappMaxAgeSeconds=" + this.firstCollectingInappMaxAgeSeconds + "}";
    }
}
