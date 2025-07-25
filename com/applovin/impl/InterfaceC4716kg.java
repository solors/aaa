package com.applovin.impl;

import androidx.annotation.Nullable;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import java.util.List;

/* renamed from: com.applovin.impl.kg */
/* loaded from: classes2.dex */
public interface InterfaceC4716kg {
    AbstractC4775lg getAdEventTracker();

    @Nullable
    String getOpenMeasurementContentUrl();

    String getOpenMeasurementCustomReferenceData();

    List<VerificationScriptResource> getOpenMeasurementVerificationScriptResources();

    boolean isOpenMeasurementEnabled();
}
