package com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c;

import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.IAdInfoEntity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.zeus.gmc.sdk.mobileads.columbus.internal.ciio2c.coo2iico */
/* loaded from: classes8.dex */
public class C32647coo2iico {
    public static final int c222o2o2c2o = 12;
    public static final int c22o22co22i = 11;
    public static final int c2ccocci = 17;
    public static final String c2oc2i = "AdEvent";
    public static final int c2oc2o = 1;
    public static final int c2oicci2 = 10;
    public static final int cc2iiooocc2 = 20;
    public static final List<String> cc2o22co2c;
    public static final int cco22 = 2;
    public static final int ccoc2oic = 8;
    public static final int ccoio = 19;
    public static final int cicc2iiccc = 7;
    public static final int cici2o2oo = 13;
    public static final int cicic = 6;
    public static final int cii2c2 = 3;
    public static final int ciii2coi2 = 4;
    public static final int ciiio2o = 18;
    public static final int ciiioc2ioc = 16;
    public static final int ciio2c = 14;
    public static final int cioc2 = 15;
    public static final int cioccoiococ = 0;
    public static final int coiic = 5;
    public static final int coiio2 = 9;
    public IAdInfoEntity coi222o222;
    public int coo2iico;

    static {
        ArrayList arrayList = new ArrayList();
        cc2o22co2c = arrayList;
        arrayList.add(new C32647coo2iico(0).coo2iico());
        arrayList.add(new C32647coo2iico(1).coo2iico());
        arrayList.add(new C32647coo2iico(2).coo2iico());
        arrayList.add(new C32647coo2iico(3).coo2iico());
        arrayList.add(new C32647coo2iico(4).coo2iico());
        arrayList.add(new C32647coo2iico(5).coo2iico());
        arrayList.add(new C32647coo2iico(6).coo2iico());
    }

    public C32647coo2iico(int i) {
        this.coo2iico = i;
    }

    public static String coo2iico(int i) {
        switch (i) {
            case 0:
                return "VIEW";
            case 1:
                return "CLICK";
            case 2:
                return "START";
            case 3:
                return "FIRSTQUARTILE";
            case 4:
                return "MIDPOINT";
            case 5:
                return "THIRDQUARTILE";
            case 6:
                return "VIDEO_FINISH";
            case 7:
                return "CLOSE";
            case 8:
                return "REQUEST";
            case 9:
                return "FILL";
            case 10:
                return "SHOW";
            case 11:
                return "SHOW_FAIL";
            case 12:
                return "GET_MSA_LOCAL_AD";
            case 13:
                return "RESOURCE_LOAD";
            case 14:
                return "LOADING";
            case 15:
                return "LOCAL_AD_EXPIRED";
            case 16:
                return "QUERY";
            case 17:
                return "QUERY_RESULT";
            case 18:
                return "ENTER_ENDCARD";
            case 19:
                return "H5_SHOW";
            case 20:
                return "GET_ADSENSE";
            default:
                return "UNKNOWN";
        }
    }

    public String toString() {
        return coo2iico();
    }

    public String coo2iico() {
        return coo2iico(this.coo2iico);
    }

    public C32647coo2iico(int i, IAdInfoEntity iAdInfoEntity) {
        this.coo2iico = i;
        this.coi222o222 = iAdInfoEntity;
    }
}
