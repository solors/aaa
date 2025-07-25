package com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache;

import com.zeus.gmc.sdk.mobileads.columbus.common.Constants;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.cache.C32111coo2iico;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import java.util.List;
import org.json.JSONObject;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.cache.LocalAdMessager */
/* loaded from: classes8.dex */
public class LocalAdMessager extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    public static final int cicc2iiccc = 3;
    public static final int cicic = 2;
    private static final String ciii2coi2 = "LocalAdMessager";
    public static final int coiic = 1;
    @SerializedName("tagId")
    @Expose
    private String c2oc2i;
    @SerializedName("adInfos")
    @Expose
    private List<C32106coo2iico> c2oc2o;
    @SerializedName("resUrl")
    @Expose
    private String cco22;
    @SerializedName("tagIdType")
    @Expose
    private int cii2c2;
    @SerializedName("size")
    @Expose
    private Integer cioccoiococ;
    @SerializedName("packageFrom")
    @Expose
    private String coi222o222;
    @SerializedName("version")
    @Expose
    private Integer coo2iico = 1;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.ad.cache.LocalAdMessager$coo2iico */
    /* loaded from: classes8.dex */
    public static class C32106coo2iico implements Comparable<C32106coo2iico> {
        @SerializedName("adInfoJson")
        @Expose
        private String c2oc2i;
        @SerializedName("loadWhen")
        @Expose
        private int c2oc2o;
        @SerializedName("ex")
        @Expose
        private String cco22;
        @SerializedName("tagId")
        @Expose
        private String cii2c2;
        @SerializedName("sourceType")
        @Expose
        private int cioccoiococ;
        @SerializedName(C32111coo2iico.C32113cioccoiococ.ciii2coi2)
        @Expose
        private Double coi222o222;
        @SerializedName(Constants.ADID)
        @Expose
        private String coo2iico;

        public String c2oc2i() {
            return this.cco22;
        }

        public Double c2oc2o() {
            return this.coi222o222;
        }

        public int cco22() {
            return this.cioccoiococ;
        }

        public String cii2c2() {
            return this.cii2c2;
        }

        public void cioccoiococ(String str) {
            this.cii2c2 = str;
        }

        public String coi222o222() {
            return this.coo2iico;
        }

        public void coo2iico(int i) {
            this.c2oc2o = i;
        }

        public void c2oc2i(String str) {
            this.cco22 = str;
        }

        public int cioccoiococ() {
            return this.c2oc2o;
        }

        public void coi222o222(String str) {
            this.coo2iico = str;
        }

        public void coo2iico(Double d) {
            this.coi222o222 = d;
        }

        public void coi222o222(int i) {
            this.cioccoiococ = i;
        }

        public String coo2iico() {
            return this.c2oc2i;
        }

        public void coo2iico(String str) {
            this.c2oc2i = str;
        }

        @Override // java.lang.Comparable
        /* renamed from: coo2iico */
        public int compareTo(C32106coo2iico c32106coo2iico) {
            return c32106coo2iico.coi222o222.compareTo(this.coi222o222);
        }
    }

    public void c2oc2i(String str) {
        this.c2oc2i = str;
    }

    public List<C32106coo2iico> c2oc2o() {
        return this.c2oc2o;
    }

    public Integer c2oicci2() {
        return this.coo2iico;
    }

    public Integer ccoc2oic() {
        return this.cioccoiococ;
    }

    public String cicc2iiccc() {
        return this.cco22;
    }

    public String cicic() {
        return this.coi222o222;
    }

    public void coi222o222(int i) {
        this.cii2c2 = i;
    }

    public int coiio2() {
        return this.cii2c2;
    }

    public void coo2iico(String str) {
        this.coi222o222 = str;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return ciii2coi2;
    }

    public void coi222o222(Integer num) {
        this.coo2iico = num;
    }

    public String coo2iico() {
        return this.c2oc2i;
    }

    public void coi222o222(String str) {
        this.cco22 = str;
    }

    public void coo2iico(Integer num) {
        this.cioccoiococ = num;
    }

    public void coo2iico(List<C32106coo2iico> list) {
        this.c2oc2o = list;
    }

    public static LocalAdMessager coo2iico(JSONObject jSONObject) {
        return (LocalAdMessager) C32459ciii2coi2.coo2iico(LocalAdMessager.class, jSONObject.toString(), ciii2coi2);
    }
}
