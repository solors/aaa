package com.bytedance.sdk.component.adexpress.dynamic.eqN;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.vpaid.enums.EventConstants;

/* renamed from: com.bytedance.sdk.component.adexpress.dynamic.eqN.zx */
/* loaded from: classes3.dex */
public class C7466zx {

    /* renamed from: bg */
    public static final Map<String, Integer> f16232bg;

    /* renamed from: IL */
    private String f16233IL;

    /* renamed from: bX */
    private String f16234bX;
    private C7465ldr eqN;
    private String ldr;

    /* renamed from: zx */
    private C7465ldr f16235zx;

    static {
        HashMap hashMap = new HashMap();
        f16232bg = hashMap;
        hashMap.put("root", 8);
        hashMap.put("footer", 6);
        hashMap.put("empty", 6);
        hashMap.put("title", 0);
        hashMap.put("subtitle", 0);
        hashMap.put("source", 0);
        hashMap.put("score-count", 0);
        hashMap.put("text_star", 0);
        hashMap.put("text", 0);
        hashMap.put("tag-group", 17);
        hashMap.put("app-version", 0);
        hashMap.put("development-name", 0);
        hashMap.put("privacy-detail", 23);
        hashMap.put("image", 1);
        hashMap.put("image-wide", 1);
        hashMap.put("image-square", 1);
        hashMap.put("image-long", 1);
        hashMap.put("image-splash", 1);
        hashMap.put("image-cover", 1);
        hashMap.put("app-icon", 1);
        hashMap.put("icon-download", 1);
        hashMap.put("logoad", 4);
        hashMap.put("logounion", 5);
        hashMap.put("logo-union", 9);
        hashMap.put("dislike", 3);
        hashMap.put("close", 3);
        hashMap.put("close-fill", 3);
        hashMap.put("webview-close", 22);
        hashMap.put("feedback-dislike", 12);
        hashMap.put("button", 2);
        hashMap.put("downloadWithIcon", 2);
        hashMap.put("downloadButton", 2);
        hashMap.put("fillButton", 2);
        hashMap.put("laceButton", 2);
        hashMap.put("cardButton", 2);
        hashMap.put("colourMixtureButton", 2);
        hashMap.put("arrowButton", 1);
        hashMap.put("download-progress-button", 2);
        hashMap.put("vessel", 6);
        hashMap.put("image-group", 6);
        hashMap.put("custom-component-vessel", 6);
        hashMap.put("carousel", 24);
        hashMap.put("carousel-vessel", 26);
        hashMap.put("leisure-interact", 25);
        hashMap.put("video-hd", 7);
        hashMap.put("video", 7);
        hashMap.put("video-vd", 7);
        hashMap.put("video-sq", 7);
        hashMap.put("muted", 10);
        hashMap.put("star", 11);
        hashMap.put("skip-countdowns", 19);
        hashMap.put("skip-with-countdowns-skip-btn", 21);
        hashMap.put("skip-with-countdowns-video-countdown", 13);
        hashMap.put("skip-with-countdowns-skip-countdown", 20);
        hashMap.put("skip-with-time", 14);
        hashMap.put("skip-with-time-countdown", 13);
        hashMap.put("skip-with-time-skip-btn", 15);
        hashMap.put(EventConstants.SKIP, 27);
        hashMap.put("timedown", 13);
        hashMap.put("icon", 16);
        hashMap.put("scoreCountWithIcon", 6);
        hashMap.put("split-line", 18);
        hashMap.put("creative-playable-bait", 0);
        hashMap.put("score-count-type-2", 0);
        hashMap.put("lottie", 28);
    }

    /* renamed from: IL */
    public String m88764IL() {
        return this.f16233IL;
    }

    /* renamed from: bX */
    public String m88761bX() {
        return this.f16234bX;
    }

    /* renamed from: bg */
    public int m88759bg() {
        if (TextUtils.isEmpty(this.f16233IL)) {
            return 0;
        }
        if (this.f16233IL.equals("logo")) {
            String str = this.f16233IL + this.f16234bX;
            this.f16233IL = str;
            if (str.contains("logoad")) {
                return 4;
            }
            if (this.f16233IL.contains("logounion")) {
                return 5;
            }
        }
        Map<String, Integer> map = f16232bg;
        if (map.get(this.f16233IL) != null) {
            return map.get(this.f16233IL).intValue();
        }
        return -1;
    }

    public String eqN() {
        return this.ldr;
    }

    /* renamed from: iR */
    public C7465ldr m88756iR() {
        return this.f16235zx;
    }

    public int ldr() {
        return this.eqN.RFq();
    }

    public String toString() {
        return "DynamicLayoutBrick{type='" + this.f16233IL + "', data='" + this.f16234bX + "', value=" + this.eqN + ", themeValue=" + this.f16235zx + ", dataExtraInfo='" + this.ldr + "'}";
    }

    /* renamed from: zx */
    public C7465ldr m88755zx() {
        return this.eqN;
    }

    /* renamed from: IL */
    public void m88762IL(String str) {
        this.f16234bX = str;
    }

    /* renamed from: bX */
    public void m88760bX(String str) {
        this.ldr = str;
    }

    /* renamed from: IL */
    public void m88763IL(C7465ldr c7465ldr) {
        this.f16235zx = c7465ldr;
    }

    /* renamed from: bg */
    public void m88757bg(String str) {
        this.f16233IL = str;
    }

    /* renamed from: bg */
    public void m88758bg(C7465ldr c7465ldr) {
        this.eqN = c7465ldr;
    }
}
