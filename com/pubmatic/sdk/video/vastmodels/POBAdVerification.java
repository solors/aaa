package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.smaato.sdk.video.vast.model.Verification;
import java.util.List;

/* loaded from: classes7.dex */
public class POBAdVerification implements POBXMLNodeListener, POBVerificationScriptResource {
    @Nullable

    /* renamed from: a */
    private List<String> f71016a;
    @Nullable

    /* renamed from: b */
    private List<String> f71017b;
    @Nullable

    /* renamed from: c */
    private List<POBTracking> f71018c;
    @Nullable

    /* renamed from: d */
    private String f71019d;
    @Nullable

    /* renamed from: e */
    private String f71020e;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71019d = pOBNodeBuilder.getAttributeValue(Verification.VENDOR);
        this.f71016a = pOBNodeBuilder.getStringList("JavaScriptResource");
        this.f71018c = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.f71017b = pOBNodeBuilder.getStringList("ExecutableResource");
        this.f71020e = pOBNodeBuilder.getNodeValue(Verification.VERIFICATION_PARAMETERS);
    }

    @Nullable
    public List<String> getExecutableResource() {
        return this.f71017b;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public List<String> getJavaScriptResource() {
        return this.f71016a;
    }

    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f71018c;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVendorKey() {
        return this.f71019d;
    }

    @Override // com.pubmatic.sdk.common.viewability.POBVerificationScriptResource
    @Nullable
    public String getVerificationParameter() {
        return this.f71020e;
    }
}
