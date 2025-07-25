package net.pubnative.lite.sdk.models.request;

import java.util.List;
import net.pubnative.lite.sdk.utils.json.BindField;
import net.pubnative.lite.sdk.utils.json.JsonModel;
import org.json.JSONObject;

/* loaded from: classes10.dex */
public class Banner extends JsonModel {
    @BindField
    private List<Integer> api;
    @BindField
    private List<Integer> battr;
    @BindField
    private List<Integer> btype;
    @BindField
    private List<Integer> expdir;
    @BindField
    private List<Format> format;
    @BindField

    /* renamed from: h */
    private Integer f101958h;
    @BindField
    private Integer hmax;
    @BindField
    private Integer hmin;
    @BindField

    /* renamed from: id */
    private String f101959id;
    @BindField
    private List<String> mimes;
    @BindField
    private Integer pos;
    @BindField
    private Integer topframe;
    @BindField
    private Integer vcm;
    @BindField

    /* renamed from: w */
    private Integer f101960w;
    @BindField
    private Integer wmax;
    @BindField
    private Integer wmin;

    public Banner() {
    }

    public List<Integer> getApi() {
        return this.api;
    }

    public List<Integer> getBattr() {
        return this.battr;
    }

    public List<Integer> getBtype() {
        return this.btype;
    }

    public List<Integer> getExpdir() {
        return this.expdir;
    }

    public List<Format> getFormat() {
        return this.format;
    }

    public Integer getH() {
        return this.f101958h;
    }

    public Integer getHmax() {
        return this.hmax;
    }

    public Integer getHmin() {
        return this.hmin;
    }

    public String getId() {
        return this.f101959id;
    }

    public List<String> getMimes() {
        return this.mimes;
    }

    public Integer getPos() {
        return this.pos;
    }

    public Integer getTopframe() {
        return this.topframe;
    }

    public Integer getVcm() {
        return this.vcm;
    }

    public Integer getW() {
        return this.f101960w;
    }

    public Integer getWmax() {
        return this.wmax;
    }

    public Integer getWmin() {
        return this.wmin;
    }

    public void setApi(List<Integer> list) {
        this.api = list;
    }

    public void setBattr(List<Integer> list) {
        this.battr = list;
    }

    public void setBtype(List<Integer> list) {
        this.btype = list;
    }

    public void setExpdir(List<Integer> list) {
        this.expdir = list;
    }

    public void setFormat(List<Format> list) {
        this.format = list;
    }

    public void setH(Integer num) {
        this.f101958h = num;
    }

    public void setHmax(Integer num) {
        this.hmax = num;
    }

    public void setHmin(Integer num) {
        this.hmin = num;
    }

    public void setId(String str) {
        this.f101959id = str;
    }

    public void setMimes(List<String> list) {
        this.mimes = list;
    }

    public void setPos(Integer num) {
        this.pos = num;
    }

    public void setTopframe(Integer num) {
        this.topframe = num;
    }

    public void setVcm(Integer num) {
        this.vcm = num;
    }

    public void setW(Integer num) {
        this.f101960w = num;
    }

    public void setWmax(Integer num) {
        this.wmax = num;
    }

    public void setWmin(Integer num) {
        this.wmin = num;
    }

    public Banner(JSONObject jSONObject) throws Exception {
        fromJson(jSONObject);
    }
}
