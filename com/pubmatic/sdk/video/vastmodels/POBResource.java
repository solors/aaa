package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;

/* loaded from: classes7.dex */
public class POBResource implements POBXMLNodeListener {
    @Nullable

    /* renamed from: a */
    private EnumC26881a f71069a;
    @Nullable

    /* renamed from: b */
    private String f71070b;
    @Nullable

    /* renamed from: c */
    private String f71071c;

    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBResource$a */
    /* loaded from: classes7.dex */
    enum EnumC26881a {
        STATIC,
        HTML,
        IFRAME
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71070b = pOBNodeBuilder.getAttributeValue("creativeType");
        if (pOBNodeBuilder.getNodeName() != null) {
            String nodeName = pOBNodeBuilder.getNodeName();
            nodeName.hashCode();
            char c = 65535;
            switch (nodeName.hashCode()) {
                case -375340334:
                    if (nodeName.equals("IFrameResource")) {
                        c = 0;
                        break;
                    }
                    break;
                case 676623548:
                    if (nodeName.equals("StaticResource")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1928285401:
                    if (nodeName.equals("HTMLResource")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    this.f71069a = EnumC26881a.IFRAME;
                    break;
                case 1:
                    this.f71069a = EnumC26881a.STATIC;
                    break;
                case 2:
                    this.f71069a = EnumC26881a.HTML;
                    break;
            }
        }
        this.f71071c = pOBNodeBuilder.getNodeValue();
    }

    @Nullable
    public String getCreativeType() {
        return this.f71070b;
    }

    @Nullable
    public String getResource() {
        return this.f71071c;
    }

    @Nullable
    public EnumC26881a getResourceType() {
        return this.f71069a;
    }
}
