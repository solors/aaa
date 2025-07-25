package com.pubmatic.sdk.video.vastmodels;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.log.POBLog;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.viewability.POBVerificationScriptResource;
import com.pubmatic.sdk.video.vastmodels.POBVastCreative;
import com.pubmatic.sdk.video.xmlserialiser.POBNodeBuilder;
import com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener;
import com.smaato.sdk.video.vast.model.InLine;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Node;

/* loaded from: classes7.dex */
public class POBVastAd implements POBXMLNodeListener {
    @Nullable

    /* renamed from: a */
    private POBVastAdType f71081a = POBVastAdType.NO_ADS;
    @Nullable

    /* renamed from: b */
    private String f71082b;
    @Nullable

    /* renamed from: c */
    private String f71083c;
    @Nullable

    /* renamed from: d */
    private String f71084d;
    @Nullable

    /* renamed from: e */
    private String f71085e;
    @Nullable

    /* renamed from: f */
    private String f71086f;

    /* renamed from: g */
    private int f71087g;

    /* renamed from: h */
    private int f71088h;
    @Nullable

    /* renamed from: i */
    private List<String> f71089i;
    @Nullable

    /* renamed from: j */
    private String f71090j;
    @Nullable

    /* renamed from: k */
    private List<String> f71091k;
    @Nullable

    /* renamed from: l */
    private List<String> f71092l;
    @Nullable

    /* renamed from: m */
    private List<String> f71093m;
    @Nullable

    /* renamed from: n */
    private List<String> f71094n;
    @Nullable

    /* renamed from: o */
    private POBVastCreative f71095o;
    @Nullable

    /* renamed from: p */
    private List<POBCompanion> f71096p;
    @Nullable

    /* renamed from: q */
    private POBVastAd f71097q;
    @Nullable

    /* renamed from: r */
    private List<POBAdVerification> f71098r;

    /* loaded from: classes7.dex */
    public enum POBVastAdParameter {
        IMPRESSIONS,
        ERRORS,
        VIEWABLE_IMPRESSIONS,
        NOT_VIEWABLE_IMPRESSIONS,
        VIEW_UNDETERMINED_IMPRESSIONS,
        CLICKTRACKING,
        PROGRESS_TRACKING_EVENT,
        COMPANIONS,
        CLICK_THROUGH,
        ICON
    }

    /* loaded from: classes7.dex */
    public enum POBVastAdType {
        INLINE,
        WRAPPER,
        NO_ADS
    }

    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBVastAd$a */
    /* loaded from: classes7.dex */
    class C26882a implements InterfaceC26888g<String> {

        /* renamed from: a */
        final /* synthetic */ POBVastCreative.POBEventTypes f71101a;

        C26882a(POBVastCreative.POBEventTypes pOBEventTypes) {
            this.f71101a = pOBEventTypes;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.InterfaceC26888g
        @Nullable
        /* renamed from: a */
        public List<String> mo39942a(POBVastAd pOBVastAd) {
            if (pOBVastAd.getCreative() != null) {
                return pOBVastAd.getCreative().getTrackingEventUrls(this.f71101a);
            }
            return null;
        }
    }

    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBVastAd$b */
    /* loaded from: classes7.dex */
    class C26883b implements InterfaceC26888g<String> {

        /* renamed from: a */
        final /* synthetic */ POBVastAdParameter f71103a;

        C26883b(POBVastAdParameter pOBVastAdParameter) {
            this.f71103a = pOBVastAdParameter;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.InterfaceC26888g
        @Nullable
        /* renamed from: a */
        public List<String> mo39942a(POBVastAd pOBVastAd) {
            return pOBVastAd.m39948a(pOBVastAd, this.f71103a);
        }
    }

    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBVastAd$c */
    /* loaded from: classes7.dex */
    class C26884c implements InterfaceC26888g<POBCompanion> {
        C26884c() {
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.InterfaceC26888g
        @Nullable
        /* renamed from: a */
        public List<POBCompanion> mo39942a(POBVastAd pOBVastAd) {
            return pOBVastAd.getCompanions();
        }
    }

    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBVastAd$d */
    /* loaded from: classes7.dex */
    class C26885d implements InterfaceC26888g<POBXMLNodeListener> {

        /* renamed from: a */
        final /* synthetic */ POBVastAdParameter f71106a;

        C26885d(POBVastAdParameter pOBVastAdParameter) {
            this.f71106a = pOBVastAdParameter;
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.InterfaceC26888g
        @Nullable
        /* renamed from: a */
        public List<POBXMLNodeListener> mo39942a(POBVastAd pOBVastAd) {
            List m39945b = pOBVastAd.m39945b(pOBVastAd, this.f71106a);
            if (m39945b != null) {
                return new ArrayList(m39945b);
            }
            return null;
        }
    }

    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBVastAd$e */
    /* loaded from: classes7.dex */
    class C26886e implements InterfaceC26888g<POBVerificationScriptResource> {
        C26886e() {
        }

        @Override // com.pubmatic.sdk.video.vastmodels.POBVastAd.InterfaceC26888g
        @Nullable
        /* renamed from: a */
        public List<POBVerificationScriptResource> mo39942a(POBVastAd pOBVastAd) {
            if (pOBVastAd.getAdVerification() != null) {
                return new ArrayList(pOBVastAd.getAdVerification());
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBVastAd$f */
    /* loaded from: classes7.dex */
    public static /* synthetic */ class C26887f {

        /* renamed from: a */
        static final /* synthetic */ int[] f71109a;

        static {
            int[] iArr = new int[POBVastAdParameter.values().length];
            f71109a = iArr;
            try {
                iArr[POBVastAdParameter.CLICK_THROUGH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f71109a[POBVastAdParameter.ICON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f71109a[POBVastAdParameter.IMPRESSIONS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f71109a[POBVastAdParameter.ERRORS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f71109a[POBVastAdParameter.VIEWABLE_IMPRESSIONS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f71109a[POBVastAdParameter.NOT_VIEWABLE_IMPRESSIONS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f71109a[POBVastAdParameter.VIEW_UNDETERMINED_IMPRESSIONS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f71109a[POBVastAdParameter.CLICKTRACKING.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f71109a[POBVastAdParameter.PROGRESS_TRACKING_EVENT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f71109a[POBVastAdParameter.COMPANIONS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.pubmatic.sdk.video.vastmodels.POBVastAd$g */
    /* loaded from: classes7.dex */
    public interface InterfaceC26888g<T> {
        @Nullable
        /* renamed from: a */
        List<T> mo39942a(POBVastAd pOBVastAd);
    }

    @Nullable
    /* renamed from: c */
    private <T> T m39943c(@NonNull POBVastAd pOBVastAd, @NonNull POBVastAdParameter pOBVastAdParameter) {
        List<POBIcon> iconList;
        POBVastCreative creative = pOBVastAd.getCreative();
        int i = C26887f.f71109a[pOBVastAdParameter.ordinal()];
        if (i != 1) {
            if (i == 2 && creative != null && creative.getVastCreativeType() == POBVastCreative.CreativeType.LINEAR && (iconList = ((POBLinear) creative).getIconList()) != null && iconList.size() > 0) {
                return (T) iconList.get(0);
            }
        } else if (creative != null) {
            return (T) creative.getClickThroughURL();
        }
        return null;
    }

    @Override // com.pubmatic.sdk.video.xmlserialiser.POBXMLNodeListener
    public void build(@NonNull POBNodeBuilder pOBNodeBuilder) {
        String nodeValue;
        if (pOBNodeBuilder.getNodeName() != null) {
            if (pOBNodeBuilder.getNodeName().equals("InLine")) {
                this.f71081a = POBVastAdType.INLINE;
            } else if (pOBNodeBuilder.getNodeName().equals("Wrapper")) {
                this.f71081a = POBVastAdType.WRAPPER;
            }
        }
        try {
            Node node = pOBNodeBuilder.getNode("/VAST/Ad");
            if (node != null && (nodeValue = node.getAttributes().getNamedItem("sequence").getNodeValue()) != null) {
                this.f71088h = Integer.parseInt(nodeValue);
            }
        } catch (Exception unused) {
            POBLog.error("POBVastAd", "Unable to find Vast ad sequence due to invalid value", new Object[0]);
        }
        if (this.f71088h < 1) {
            this.f71088h = -1;
        }
        this.f71082b = pOBNodeBuilder.getNodeValue("AdSystem");
        this.f71083c = pOBNodeBuilder.getNodeValue(InLine.AD_TITLE);
        this.f71084d = pOBNodeBuilder.getNodeValue(InLine.AD_SERVING_ID);
        this.f71085e = pOBNodeBuilder.getNodeValue(InLine.DESCRIPTION);
        this.f71086f = pOBNodeBuilder.getNodeValue("Pricing");
        this.f71087g = POBUtils.getIntegerValue(pOBNodeBuilder.getNodeValue("Expires"));
        this.f71089i = pOBNodeBuilder.getStringList("Error");
        this.f71090j = pOBNodeBuilder.getNodeValue("VASTAdTagURI");
        this.f71091k = pOBNodeBuilder.getStringList("Impression");
        this.f71092l = pOBNodeBuilder.getStringList("ViewableImpression/Viewable");
        this.f71093m = pOBNodeBuilder.getStringList("ViewableImpression/NotViewable");
        this.f71094n = pOBNodeBuilder.getStringList("ViewableImpression/ViewUndetermined");
        POBVastCreative pOBVastCreative = (POBVastCreative) pOBNodeBuilder.getNodeObject("Creatives/Creative/Linear", POBLinear.class);
        this.f71095o = pOBVastCreative;
        if (pOBVastCreative == null) {
            this.f71095o = (POBVastCreative) pOBNodeBuilder.getNodeObject("Creatives/Creative/NonLinearAds/NonLinear", POBNonLinear.class);
        }
        this.f71096p = pOBNodeBuilder.getObjectList("Creatives/Creative/CompanionAds/Companion", POBCompanion.class);
        List<POBAdVerification> objectList = pOBNodeBuilder.getObjectList("AdVerifications/Verification", POBAdVerification.class);
        this.f71098r = objectList;
        if (objectList == null || objectList.isEmpty()) {
            this.f71098r = pOBNodeBuilder.getObjectList("Extensions/Extension/AdVerifications/Verification", POBAdVerification.class);
        }
    }

    public int getAdSequence() {
        return this.f71088h;
    }

    @Nullable
    public String getAdServingId() {
        return this.f71084d;
    }

    @Nullable
    public String getAdSystem() {
        return this.f71082b;
    }

    @Nullable
    public String getAdTitle() {
        return this.f71083c;
    }

    @Nullable
    public POBVastAdType getAdType() {
        return this.f71081a;
    }

    @Nullable
    public List<POBAdVerification> getAdVerification() {
        return this.f71098r;
    }

    @Nullable
    public String getClosestClickThroughURL() {
        return (String) m39949a(POBVastAdParameter.CLICK_THROUGH);
    }

    @Nullable
    public POBIcon getClosestIcon() {
        return (POBIcon) m39949a(POBVastAdParameter.ICON);
    }

    @Nullable
    public List<POBCompanion> getCombinedCompanions() {
        return m39947a(this, new C26884c());
    }

    @NonNull
    public List<String> getCombinedList(@NonNull POBVastAdParameter pOBVastAdParameter) {
        return m39947a(this, new C26883b(pOBVastAdParameter));
    }

    public List<POBXMLNodeListener> getCombinedObjectList(@NonNull POBVastAdParameter pOBVastAdParameter) {
        return m39947a(this, new C26885d(pOBVastAdParameter));
    }

    @NonNull
    public List<String> getCombinedTrackingEventList(@NonNull POBVastCreative.POBEventTypes pOBEventTypes) {
        return m39947a(this, new C26882a(pOBEventTypes));
    }

    public List<POBVerificationScriptResource> getCombinedVerificationList() {
        return m39947a(this, new C26886e());
    }

    @Nullable
    public List<POBCompanion> getCompanions() {
        return this.f71096p;
    }

    @Nullable
    public POBVastCreative getCreative() {
        return this.f71095o;
    }

    @Nullable
    public String getDescription() {
        return this.f71085e;
    }

    @Nullable
    public List<String> getErrorURLs() {
        return this.f71089i;
    }

    public int getExpires() {
        return this.f71087g;
    }

    @Nullable
    public List<String> getImpressions() {
        return this.f71091k;
    }

    @Nullable
    public List<String> getNotViewableImpressions() {
        return this.f71093m;
    }

    @Nullable
    public String getPricing() {
        return this.f71086f;
    }

    @Nullable
    public String getVASTAdTagURI() {
        return this.f71090j;
    }

    @Nullable
    public List<String> getViewUndeterminedImpressions() {
        return this.f71094n;
    }

    @Nullable
    public List<String> getViewableImpressions() {
        return this.f71092l;
    }

    @Nullable
    public POBVastAd getWrapper() {
        return this.f71097q;
    }

    public void setWrapper(@Nullable POBVastAd pOBVastAd) {
        this.f71097q = pOBVastAd;
    }

    @Nullable
    /* renamed from: a */
    private <T> T m39949a(@NonNull POBVastAdParameter pOBVastAdParameter) {
        for (POBVastAd pOBVastAd = this; pOBVastAd != null; pOBVastAd = pOBVastAd.getWrapper()) {
            T t = (T) m39943c(pOBVastAd, pOBVastAdParameter);
            if (t != null) {
                return t;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* renamed from: b */
    public List<? extends POBXMLNodeListener> m39945b(@NonNull POBVastAd pOBVastAd, @NonNull POBVastAdParameter pOBVastAdParameter) {
        int i = C26887f.f71109a[pOBVastAdParameter.ordinal()];
        if (i != 9) {
            if (i != 10) {
                return null;
            }
            return pOBVastAd.getCompanions();
        } else if (pOBVastAd.getCreative() != null) {
            return pOBVastAd.getCreative().getTrackingEvents(POBVastCreative.POBEventTypes.PROGRESS);
        } else {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Nullable
    /* renamed from: a */
    public List<String> m39948a(@NonNull POBVastAd pOBVastAd, @NonNull POBVastAdParameter pOBVastAdParameter) {
        switch (C26887f.f71109a[pOBVastAdParameter.ordinal()]) {
            case 3:
                return pOBVastAd.getImpressions();
            case 4:
                return pOBVastAd.getErrorURLs();
            case 5:
                return pOBVastAd.getViewableImpressions();
            case 6:
                return pOBVastAd.getNotViewableImpressions();
            case 7:
                return pOBVastAd.getViewUndeterminedImpressions();
            case 8:
                ArrayList arrayList = new ArrayList();
                POBVastCreative creative = pOBVastAd.getCreative();
                if (creative != null && creative.getClickTrackers() != null) {
                    arrayList.addAll(creative.getClickTrackers());
                }
                return arrayList;
            default:
                return null;
        }
    }

    @NonNull
    /* renamed from: a */
    private <T> List<T> m39947a(@NonNull POBVastAd pOBVastAd, @NonNull InterfaceC26888g<T> interfaceC26888g) {
        ArrayList arrayList = new ArrayList();
        while (pOBVastAd != null) {
            List<T> mo39942a = interfaceC26888g.mo39942a(pOBVastAd);
            if (mo39942a != null) {
                arrayList.addAll(mo39942a);
            }
            pOBVastAd = pOBVastAd.getWrapper();
        }
        return arrayList;
    }
}
