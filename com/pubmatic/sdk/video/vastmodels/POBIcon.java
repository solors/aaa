package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBResource;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.smaato.sdk.video.vast.model.Icon;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBIcon implements POBXMLNodeListener, POBAdDescriptor {
    @Nullable

    /* renamed from: a */
    private String f71032a;

    /* renamed from: b */
    private int f71033b;

    /* renamed from: c */
    private int f71034c;
    @Nullable

    /* renamed from: d */
    private String f71035d;
    @Nullable

    /* renamed from: e */
    private String f71036e;

    /* renamed from: f */
    private int f71037f;

    /* renamed from: g */
    private int f71038g;
    @Nullable

    /* renamed from: h */
    private String f71039h;
    @Nullable

    /* renamed from: i */
    private POBResource f71040i;
    @Nullable
    protected String mClickThroughURL;
    @Nullable
    protected List<String> mClickTrackers;
    @Nullable
    protected List<String> mViewTrackers;

    @Nullable
    /* renamed from: a */
    private String m39950a() {
        String str;
        POBResource pOBResource = this.f71040i;
        if (pOBResource != null) {
            if (pOBResource.getResourceType() == POBResource.EnumC26881a.HTML) {
                return this.f71040i.getResource();
            }
            if (this.f71040i.getResourceType() == POBResource.EnumC26881a.STATIC) {
                String format = String.format("<img src = \"%s\" style = \"display: block; width:100%%; height: 100%%;\"/>", this.f71040i.getResource());
                if (POBUtils.isNullOrEmpty(this.mClickThroughURL)) {
                    str = "https://obplaceholder.click.com/";
                } else {
                    str = this.mClickThroughURL;
                }
                return String.format("<a href = \"%s\">%s</a>", str, format);
            }
            return String.format("<iframe src =\"%s\" width = \"100%%\" height = \"100%%\" frameBorder=\"0\" style = \"display: inline;max-height:100%%; max-width: 100%%;\" />", this.f71040i.getResource());
        }
        return null;
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71032a = pOBNodeBuilder.getAttributeValue(Icon.PROGRAM);
        this.f71033b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f71034c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f71035d = pOBNodeBuilder.getAttributeValue(Icon.X_POSITION);
        this.f71036e = pOBNodeBuilder.getAttributeValue(Icon.Y_POSITION);
        String attributeValue = pOBNodeBuilder.getAttributeValue("duration");
        if (attributeValue != null) {
            this.f71037f = (int) POBUtils.getSeconds(attributeValue);
        }
        String attributeValue2 = pOBNodeBuilder.getAttributeValue("offset");
        if (attributeValue2 != null) {
            this.f71038g = (int) POBUtils.getSeconds(attributeValue2);
        }
        this.f71039h = pOBNodeBuilder.getAttributeValue("apiFramework");
        this.mClickThroughURL = pOBNodeBuilder.getNodeValue("IconClicks/IconClickThrough");
        this.mClickTrackers = pOBNodeBuilder.getStringList("IconClicks/IconClickTracking");
        this.mViewTrackers = pOBNodeBuilder.getStringList("IconViewTracking");
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject("StaticResource", POBResource.class);
        this.f71040i = pOBResource;
        if (pOBResource == null) {
            POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject("HTMLResource", POBResource.class);
            this.f71040i = pOBResource2;
            if (pOBResource2 == null) {
                this.f71040i = (POBResource) pOBNodeBuilder.getNodeObject("IFrameResource", POBResource.class);
            }
        }
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public POBAdDescriptor buildWithRefreshAndExpiryTimeout(int i, int i2) {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean enableDsaInfoIcon() {
        return false;
    }

    @Nullable
    public String getApiFramework() {
        return this.f71039h;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getBundle() {
        return null;
    }

    @Nullable
    public String getClickThroughURL() {
        return this.mClickThroughURL;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.mClickTrackers;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.f71034c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.f71033b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return null;
    }

    public int getDuration() {
        return this.f71037f;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getId() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @NonNull
    public POBImpressionCountingMethod getImpressionCountingMethod() {
        return POBImpressionCountingMethod.ON_LOAD;
    }

    public int getOffset() {
        return this.f71038g;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return null;
    }

    @Nullable
    public String getProgram() {
        return this.f71032a;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public JSONObject getRawBid() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getRefreshInterval() {
        return 0;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getRenderableContent() {
        return m39950a();
    }

    @Nullable
    public POBResource getResource() {
        return this.f71040i;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getStatus() {
        return 0;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public Map<String, String> getTargetingInfo() {
        return null;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return null;
    }

    @Nullable
    public List<String> getViewTrackers() {
        return this.mViewTrackers;
    }

    @Nullable
    public String getXPosition() {
        return this.f71035d;
    }

    @Nullable
    public String getYPosition() {
        return this.f71036e;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return false;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return false;
    }
}
