package net.pubnative.lite.sdk.models.response;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class Bid extends JsonModel {
    @BindField
    private String adid;
    @BindField
    private String adm;
    @BindField
    private List<String> adomain;
    @BindField
    private Integer api;
    @BindField
    private List<Integer> attr;
    @BindField
    private String bundle;
    @BindField
    private String burl;
    @BindField
    private List<String> cat;
    @BindField
    private String cid;
    @BindField
    private String crid;
    @BindField
    private String dealid;
    @BindField
    private Integer exp;
    @BindField
    private BidExtension ext;
    @BindField

    /* renamed from: h */
    private Integer f101984h;
    @BindField
    private Integer hratio;
    @BindField

    /* renamed from: id */
    private String f101985id;
    @BindField
    private String impid;
    @BindField
    private String iurl;
    @BindField
    private String language;
    @BindField
    private String lurl;
    @BindField
    private String nurl;
    @BindField
    private Float price;
    @BindField
    private Integer protocol;
    @BindField
    private Integer qagmediarating;
    @BindField
    private String tactic;
    @BindField

    /* renamed from: w */
    private Integer f101986w;
    @BindField
    private Integer wratio;

    public Bid() {
    }

    public String getAdId() {
        return this.adid;
    }

    public String getAdMarkup() {
        return this.adm;
    }

    public List<String> getAdvertiserDomains() {
        return this.adomain;
    }

    public Integer getApi() {
        return this.api;
    }

    public List<Integer> getAttributes() {
        return this.attr;
    }

    public String getBillingUrl() {
        return this.burl;
    }

    public String getBundle() {
        return this.bundle;
    }

    public String getCampaignId() {
        return this.cid;
    }

    public List<String> getCategories() {
        return this.cat;
    }

    public String getCreativeId() {
        return this.crid;
    }

    public String getDealId() {
        return this.dealid;
    }

    public Integer getExpiration() {
        return this.exp;
    }

    public BidExtension getExt() {
        return this.ext;
    }

    public Integer getHeight() {
        return this.f101984h;
    }

    public Integer getHeightRatio() {
        return this.hratio;
    }

    public String getId() {
        return this.f101985id;
    }

    public String getImpressionid() {
        return this.impid;
    }

    public String getIurl() {
        return this.iurl;
    }

    public String getLanguage() {
        return this.language;
    }

    public String getLossNoticeUrl() {
        return this.lurl;
    }

    public String getNoticeUrl() {
        return this.nurl;
    }

    public Float getPrice() {
        return this.price;
    }

    public Integer getProtocol() {
        return this.protocol;
    }

    public Integer getQagMediaRating() {
        return this.qagmediarating;
    }

    public String getTactic() {
        return this.tactic;
    }

    public Integer getWidth() {
        return this.f101986w;
    }

    public Integer getWidthRatio() {
        return this.wratio;
    }

    public Bid(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
