package com.amazon.aps.ads.model;

import com.amazon.aps.shared.util.ApsResult;

/* loaded from: classes2.dex */
public class ApsInitializationStatus {
    ApsResult result;

    public ApsInitializationStatus(ApsResult apsResult) {
        this.result = apsResult;
    }

    public ApsResult getResult() {
        return this.result;
    }
}
