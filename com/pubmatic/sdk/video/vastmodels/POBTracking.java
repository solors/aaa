package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;

/* loaded from: classes7.dex */
public class POBTracking implements POBXMLNodeListener {
    @Nullable

    /* renamed from: a */
    private String f71076a;
    @Nullable

    /* renamed from: b */
    private String f71077b;
    @Nullable

    /* renamed from: c */
    private String f71078c;

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71076a = pOBNodeBuilder.getAttributeValue("event");
        this.f71077b = pOBNodeBuilder.getNodeValue();
        this.f71078c = pOBNodeBuilder.getAttributeValue("offset");
    }

    @Nullable
    public String getEvent() {
        return this.f71076a;
    }

    @Nullable
    public String getOffset() {
        return this.f71078c;
    }

    @Nullable
    public String getUrl() {
        return this.f71077b;
    }
}
