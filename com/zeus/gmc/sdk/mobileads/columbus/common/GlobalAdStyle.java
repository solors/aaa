package com.zeus.gmc.sdk.mobileads.columbus.common;

import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
public class GlobalAdStyle extends GsonEntityBase {
    public static final String APPINFO_11 = "1.1";
    public static final String APPINFO_12 = "1.2";
    public static final String APPINFO_21 = "2.1";
    public static final String APPINFO_22 = "2.2";
    public static final String APPINFO_31 = "3.1";
    public static final String APPINFO_32 = "3.2";
    public static final String APPINFO_41 = "4.1";
    public static final String APPINFO_42 = "4.2";
    public static final String APPINFO_51 = "5.1";
    public static final String APPINFO_52 = "5.2";
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String TAG = "GlobalAdStyle";
    @SerializedName("clickableArea")
    @Expose
    private List<Integer> clickableArea;
    @SerializedName("ctaColor")
    @Expose
    private String[] ctaColor;
    @SerializedName("messageAndLoc")
    @Expose
    private String[] messageAndLoc;
    private Map<String, String> messageAndLocMap;
    @SerializedName("style")
    @Expose
    private int style = 1;
    @SerializedName("closeOrSkipPosition")
    @Expose
    private int closeOrSkipPosition = 0;
    @SerializedName("endCard")
    @Expose
    private int endCard = 1;
    @SerializedName("ctaEnterTime")
    @Expose
    private int ctaEnterTime = 3;
    @SerializedName("interSkipTime")
    @Expose
    private int interSkipTime = 10;
    @SerializedName("rvSkippable")
    @Expose
    private int rvSkippable = 1;
    @SerializedName("closeSkipEnterTime")
    @Expose
    private int closeSkipEnterTime = 0;
    @SerializedName("ctaAnimationType")
    @Expose
    private int ctaAnimationType = 1;
    @SerializedName("barOrCta")
    @Expose
    private int barOrCta = 1;
    @SerializedName("barAppearStyle")
    @Expose
    private int barAppearStyle = 1;
    @SerializedName("endcardStyle")
    @Expose
    private int endcardStyle = 0;
    @SerializedName("imageSource")
    @Expose
    private int imageSource = 0;

    public static GlobalAdStyle cioc2() {
        return coo2iico("{\"style\":1,\"clickableArea\":[1,2,3,6],\"closeOrSkipPosition\":0,\"endCard\":1,      \"ctaEnterTime\":3,\"interSkipTime\":3,\"rvSkippable\":1,\"closeSkipEnterTime\":3,\"ctaAnimationType\":1,\"barOrCta\":1,\"barAppearStyle\":1,\"endcardStyle\":0}");
    }

    public static final GlobalAdStyle coo2iico(String str) {
        return (GlobalAdStyle) C32459ciii2coi2.coo2iico(GlobalAdStyle.class, str, TAG);
    }

    public int c222o2o2c2o() {
        return this.ctaAnimationType;
    }

    public int c22o22co22i() {
        return this.closeSkipEnterTime;
    }

    public int c2ccocci() {
        return this.endcardStyle;
    }

    public int c2oicci2() {
        return this.closeOrSkipPosition;
    }

    public Map<String, String> cc2iiooocc2() {
        String[] strArr = this.messageAndLoc;
        if (strArr != null && strArr.length > 0 && this.messageAndLocMap == null) {
            this.messageAndLocMap = new ConcurrentHashMap();
            for (String str : this.messageAndLoc) {
                String[] split = str.split("#");
                if (split.length >= 2) {
                    this.messageAndLocMap.put(split[0], split[1]);
                }
            }
        }
        return this.messageAndLocMap;
    }

    public int cc2o22co2c() {
        return this.rvSkippable;
    }

    public int ccoc2oic() {
        return this.barOrCta;
    }

    public int ccoio() {
        return this.interSkipTime;
    }

    public int cicc2iiccc() {
        return this.barAppearStyle;
    }

    public String[] cici2o2oo() {
        return this.ctaColor;
    }

    public void cicic() {
        int i = this.style;
        if (i < 0 || i > 1) {
            this.style = 1;
        }
        int i2 = this.endCard;
        if (i2 < 0 || i2 > 1) {
            this.endCard = 1;
        }
        List<Integer> list = this.clickableArea;
        if (list == null) {
            ArrayList arrayList = new ArrayList();
            this.clickableArea = arrayList;
            arrayList.add(1);
            this.clickableArea.add(2);
            this.clickableArea.add(3);
            this.clickableArea.add(6);
        } else if (!list.contains(0) && !this.clickableArea.contains(1) && !this.clickableArea.contains(2) && !this.clickableArea.contains(3) && !this.clickableArea.contains(4) && !this.clickableArea.contains(5) && !this.clickableArea.contains(6)) {
            this.clickableArea.add(1);
            this.clickableArea.add(2);
            this.clickableArea.add(3);
            this.clickableArea.add(6);
        } else if (!this.clickableArea.contains(3)) {
            this.clickableArea.add(3);
        }
        if (this.ctaEnterTime < 0) {
            this.ctaEnterTime = 3;
        }
        int i3 = this.closeOrSkipPosition;
        if (i3 < 0 || i3 > 1) {
            this.closeOrSkipPosition = 0;
        }
        if (this.interSkipTime < 0) {
            this.interSkipTime = 10;
        }
        int i4 = this.rvSkippable;
        if (i4 < 0 || i4 > 1) {
            this.rvSkippable = 1;
        }
        if (this.closeSkipEnterTime < 0) {
            this.closeSkipEnterTime = 0;
        }
        int i5 = this.ctaAnimationType;
        if (i5 < 0 || i5 > 3) {
            this.ctaAnimationType = 1;
        }
        int i6 = this.barOrCta;
        if (i6 < 0 || i6 > 1) {
            this.barOrCta = 1;
        }
        int i7 = this.barAppearStyle;
        if (i7 < 0 || i7 > 2) {
            this.barAppearStyle = 1;
        }
        int i8 = this.endcardStyle;
        if (i8 < 0 || i8 > 1) {
            this.endcardStyle = 0;
        }
        int i9 = this.imageSource;
        if (i9 < 0 || i9 > 3) {
            this.endcardStyle = 0;
        }
    }

    public int ciiio2o() {
        return this.imageSource;
    }

    public int ciiioc2ioc() {
        return this.endCard;
    }

    public int ciio2c() {
        return this.ctaEnterTime;
    }

    public List<Integer> coiio2() {
        return this.clickableArea;
    }

    public int coocii() {
        return this.style;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return TAG;
    }
}
