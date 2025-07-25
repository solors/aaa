package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.base.POBAdDescriptor;
import com.pubmatic.sdk.common.models.POBDSATransparencyInfo;
import com.pubmatic.sdk.common.models.POBImpressionCountingMethod;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.video.vastmodels.POBResource;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.smaato.sdk.video.vast.model.Companion;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class POBCompanion extends POBVastCreative implements POBAdDescriptor {

    /* renamed from: a */
    private int f71021a;

    /* renamed from: b */
    private int f71022b;

    /* renamed from: c */
    private int f71023c;

    /* renamed from: d */
    private int f71024d;
    @Nullable

    /* renamed from: e */
    private String f71025e;
    @Nullable

    /* renamed from: f */
    private List<POBTracking> f71026f;
    @Nullable

    /* renamed from: g */
    private String f71027g;
    @Nullable

    /* renamed from: h */
    private List<String> f71028h;
    @Nullable

    /* renamed from: i */
    private POBResource f71029i;
    @Nullable

    /* renamed from: j */
    private String f71030j;
    @Nullable

    /* renamed from: k */
    private String f71031k;

    @Nullable
    /* renamed from: a */
    private String m39951a() {
        String str;
        POBResource pOBResource = this.f71029i;
        if (pOBResource != null) {
            if (pOBResource.getResourceType() == POBResource.EnumC26881a.HTML) {
                return this.f71029i.getResource();
            }
            if (this.f71029i.getResourceType() == POBResource.EnumC26881a.STATIC) {
                String format = String.format("<img src = \"%s\" style = \"display: block; width:100%%; height: 100%%; object-fit:scale-down; background-color:black;\"/>", this.f71029i.getResource());
                if (POBUtils.isNullOrEmpty(this.f71027g)) {
                    str = "https://obplaceholder.click.com/";
                } else {
                    str = this.f71027g;
                }
                return String.format("<a href = \"%s\">%s</a>", str, format);
            }
            return String.format("<iframe src =\"%s\" width = \"100%%\" height = \"100%%\" frameBorder=\"0\" style = \"display: inline;max-height:100%%; max-width: 100%%;\" />", this.f71029i.getResource());
        }
        return null;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        this.f71021a = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("width"));
        this.f71022b = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue("height"));
        this.f71023c = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(Companion.ASSET_WIDTH));
        this.f71024d = POBUtils.getIntegerValue(pOBNodeBuilder.getAttributeValue(Companion.ASSET_HEIGHT));
        this.f71025e = pOBNodeBuilder.getAttributeValue("apiFramework");
        this.f71026f = pOBNodeBuilder.getObjectList("TrackingEvents/Tracking", POBTracking.class);
        this.f71027g = pOBNodeBuilder.getNodeValue(Companion.COMPANION_CLICK_THROUGH);
        this.f71028h = pOBNodeBuilder.getStringList(Companion.COMPANION_CLICK_TRACKING);
        this.f71031k = pOBNodeBuilder.getAttributeValue(Companion.RENDERING_MODE);
        POBResource pOBResource = (POBResource) pOBNodeBuilder.getNodeObject("HTMLResource", POBResource.class);
        this.f71029i = pOBResource;
        if (pOBResource == null) {
            POBResource pOBResource2 = (POBResource) pOBNodeBuilder.getNodeObject("StaticResource", POBResource.class);
            this.f71029i = pOBResource2;
            if (pOBResource2 == null) {
                this.f71029i = (POBResource) pOBNodeBuilder.getNodeObject("IFrameResource", POBResource.class);
            }
        }
        this.f71030j = pOBNodeBuilder.getNodeValue("../../UniversalAdId");
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
        return this.f71025e;
    }

    public int getAssetHeight() {
        return this.f71024d;
    }

    public int getAssetWidth() {
        return this.f71023c;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getBundle() {
        return null;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public String getClickThroughURL() {
        return this.f71027g;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative, com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<String> getClickTrackers() {
        return this.f71028h;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentHeight() {
        return this.f71022b;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public int getContentWidth() {
        return this.f71021a;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getCreativeType() {
        return POBVastCreative.CreativeType.COMPANION.name();
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getDisplayedOnBehalfOf() {
        return null;
    }

    public int getHeight() {
        return this.f71022b;
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

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public String getPaidBy() {
        return null;
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
        return m39951a();
    }

    @Nullable
    public String getRenderingMode() {
        return this.f71031k;
    }

    @Nullable
    public POBResource getResource() {
        return this.f71029i;
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

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    @Nullable
    public List<POBTracking> getTrackingEvents() {
        return this.f71026f;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    @Nullable
    public List<POBDSATransparencyInfo> getTransparencyData() {
        return null;
    }

    @Nullable
    public String getUniversalAdId() {
        return this.f71030j;
    }

    @Override // com.pubmatic.sdk.video.vastmodels.POBVastCreative
    public POBVastCreative.CreativeType getVastCreativeType() {
        return POBVastCreative.CreativeType.COMPANION;
    }

    public int getWidth() {
        return this.f71021a;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isCompanion() {
        return true;
    }

    @Override // com.pubmatic.sdk.common.base.POBAdDescriptor
    public boolean isVideo() {
        return false;
    }

    public void setRenderingMode(@Nullable String str) {
        this.f71031k = str;
    }

    @NonNull
    public String toString() {
        return "POBCompanion{width=" + this.f71021a + ", height=" + this.f71022b + ", renderingMode='" + this.f71031k + "'}";
    }
}
