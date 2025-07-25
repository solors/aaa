package com.zeus.gmc.sdk.mobileads.columbus.common;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.LayoutRes;
import com.zeus.gmc.sdk.mobileads.columbus.C32065R;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.Expose;
import com.zeus.gmc.sdk.mobileads.columbus.gson.annotations.SerializedName;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32459ciii2coi2;
import com.zeus.gmc.sdk.mobileads.columbus.internal.c2cciooo.C32463ciiioc2ioc;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase;
import com.zeus.gmc.sdk.mobileads.columbus.p626ad.videoads.player.view.TextImageView;
import com.zeus.gmc.sdk.mobileads.columbus.util.MLog;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import net.pubnative.lite.sdk.models.Protocol;

/* loaded from: classes8.dex */
public class GetappsAppInfo extends GsonEntityBase {
    private static final double GSON_CONTENT_VERSION = 1.0d;
    private static final String coiio2 = "GetappsAppInfo";
    @SerializedName("introduction")
    @Expose
    private String c2oc2i;
    @SerializedName("publishername")
    @Expose
    private String c2oc2o;
    @SerializedName("apkupdatetime")
    @Expose
    private String cco22;
    @SerializedName("intltags")
    @Expose
    private List<String> ccoc2oic;
    private Map<String, String> cicc2iiccc;
    @SerializedName("screenshots")
    @Expose
    private List<String> cicic;
    @SerializedName("downloadcount")
    @Expose
    private String cii2c2;
    @SerializedName("topkey")
    @Expose
    private String ciii2coi2;
    @SerializedName("ratingscore")
    @Expose
    private String cioccoiococ;
    @SerializedName("brief")
    @Expose
    private String coi222o222;
    @SerializedName("mivideos")
    @Expose
    private C32326coo2iico coiic;
    @SerializedName("categoryname")
    @Expose
    private String coo2iico;

    /* renamed from: com.zeus.gmc.sdk.mobileads.columbus.common.GetappsAppInfo$coo2iico */
    /* loaded from: classes8.dex */
    public static class C32326coo2iico {
        @SerializedName("360p")
        @Expose
        private String coi222o222;
        @SerializedName("720p")
        @Expose
        private String coo2iico;

        public String coi222o222() {
            return this.coo2iico;
        }

        public String coo2iico() {
            return this.coi222o222;
        }
    }

    private boolean coi222o222(String str) {
        if (!"6".equals(str) && !"7".equals(str)) {
            return false;
        }
        return true;
    }

    private int coo2iico(boolean z, @LayoutRes int i, @LayoutRes int i2) {
        return z ? i : i2;
    }

    public static final GetappsAppInfo deserialize(String str) {
        return (GetappsAppInfo) C32459ciii2coi2.coo2iico(GetappsAppInfo.class, str, coiio2);
    }

    public String getApkupdatetime() {
        return this.cco22;
    }

    public List<TextImageView> getAppInfos(String str, Context context, boolean z) {
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        List<TextImageView> arrayList = new ArrayList<>();
        String[] split = str.split("\\|");
        boolean z3 = false;
        for (int i = 0; i < split.length; i++) {
            String coo2iico = coo2iico(split[i]);
            if (!TextUtils.isEmpty(coo2iico)) {
                StringBuilder sb2 = new StringBuilder();
                String str2 = split[i];
                if (i < split.length - 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                coo2iico(z3, context, arrayList, sb2, coo2iico, str2, z2);
                if (Protocol.VAST_1_0_WRAPPER.equals(str2)) {
                    TextImageView textImageView = (TextImageView) LayoutInflater.from(context).inflate(C32065R.C32069layout.columbus_text_image_star_layout, (ViewGroup) null);
                    textImageView.setText(sb2);
                    arrayList.add(textImageView);
                    z3 = true;
                } else {
                    if ("6".equals(str2)) {
                        TextImageView textImageView2 = (TextImageView) LayoutInflater.from(context).inflate(coo2iico(z, C32065R.C32069layout.columbus_text_image_time_layout, C32065R.C32069layout.columbus_text_image_time_light_layout), (ViewGroup) null);
                        textImageView2.setText(sb2);
                        arrayList.add(textImageView2);
                    } else if ("7".equals(str2)) {
                        TextImageView textImageView3 = (TextImageView) LayoutInflater.from(context).inflate(coo2iico(z, C32065R.C32069layout.columbus_text_image_download_layout, C32065R.C32069layout.columbus_text_image_download_light_layout), (ViewGroup) null);
                        textImageView3.setText(sb2);
                        arrayList.add(textImageView3);
                    } else {
                        TextImageView textImageView4 = (TextImageView) LayoutInflater.from(context).inflate(C32065R.C32069layout.columbus_text_image_layout, (ViewGroup) null);
                        textImageView4.setText(sb2);
                        arrayList.add(textImageView4);
                    }
                    z3 = false;
                }
            }
        }
        return arrayList;
    }

    public String getBrief() {
        return this.coi222o222;
    }

    public String getCategoryname() {
        return this.coo2iico;
    }

    public String getDownloadcount() {
        return this.cii2c2;
    }

    public List<String> getIntltags() {
        return this.ccoc2oic;
    }

    public String getIntroduction() {
        return this.c2oc2i;
    }

    public C32326coo2iico getMivideos() {
        return this.coiic;
    }

    public String getPublishername() {
        return this.c2oc2o;
    }

    public String getRatingscore() {
        return this.cioccoiococ;
    }

    public List<String> getScreenshots() {
        return this.cicic;
    }

    public Map<String, String> getScreenshotsMap() {
        return this.cicc2iiccc;
    }

    @Override // com.zeus.gmc.sdk.mobileads.columbus.p626ad.enity.GsonEntityBase
    protected String getTag() {
        return coiio2;
    }

    public String getTopkey() {
        return this.ciii2coi2;
    }

    public void setScreenshotsMap(Map<String, String> map) {
        this.cicc2iiccc = map;
    }

    private void coo2iico(boolean z, Context context, List<TextImageView> list, StringBuilder sb2, String str, String str2, boolean z2) {
        if (z && coi222o222(str2)) {
            TextImageView textImageView = (TextImageView) LayoutInflater.from(context).inflate(C32065R.C32069layout.columbus_text_image_layout, (ViewGroup) null);
            textImageView.setText(" | ");
            list.add(textImageView);
        } else if (z) {
            sb2.append(" | ");
        }
        if (z2 && !Protocol.VAST_1_0_WRAPPER.equals(str2)) {
            sb2.append(str);
            sb2.append(" | ");
            return;
        }
        sb2.append(str);
    }

    private String coo2iico(String str) {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder();
        } catch (Exception e) {
            MLog.m25888e(coiio2, "getInfo error", e);
        }
        if ("1".equals(str)) {
            return getCategoryname();
        }
        if ("2".equals(str)) {
            return getBrief();
        }
        if ("3".equals(str)) {
            return getIntroduction();
        }
        if (Protocol.VAST_1_0_WRAPPER.equals(str)) {
            sb2.append(getRatingscore());
            return sb2.toString();
        } else if ("5".equals(str)) {
            return getPublishername();
        } else {
            if ("6".equals(str)) {
                sb2.append(C32463ciiioc2ioc.coo2iico(Long.parseLong(getApkupdatetime()), C32463ciiioc2ioc.ciii2coi2));
                return sb2.toString();
            } else if ("7".equals(str)) {
                long parseLong = Long.parseLong(getDownloadcount());
                if (parseLong < 1000) {
                    sb2.append(parseLong);
                } else if (parseLong < 1000000) {
                    sb2.append(parseLong / 1000);
                    sb2.append("K+");
                } else {
                    sb2.append(parseLong / 1000000);
                    sb2.append("M+");
                }
                if (TextUtils.isEmpty(sb2)) {
                    return null;
                }
                return sb2.toString();
            } else {
                if ("8".equals(str)) {
                    sb2.append("NO.");
                    sb2.append(getTopkey());
                    return sb2.toString();
                }
                return null;
            }
        }
    }
}
