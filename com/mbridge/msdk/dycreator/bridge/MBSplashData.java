package com.mbridge.msdk.dycreator.bridge;

import com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData;
import com.mbridge.msdk.dycreator.wrapper.DyOption;
import com.mbridge.msdk.foundation.entity.CampaignEx;

/* loaded from: classes6.dex */
public class MBSplashData implements BaseViewData {

    /* renamed from: a */
    private DyOption f55897a;

    /* renamed from: b */
    private String f55898b;

    /* renamed from: c */
    private String f55899c;

    /* renamed from: d */
    private String f55900d;

    /* renamed from: e */
    private String f55901e;

    /* renamed from: f */
    private CampaignEx f55902f;

    /* renamed from: g */
    private int f55903g;

    /* renamed from: h */
    private int f55904h;

    /* renamed from: i */
    private float f55905i;

    /* renamed from: j */
    private float f55906j;

    /* renamed from: k */
    private int f55907k = 0;

    public MBSplashData(DyOption dyOption) {
        this.f55897a = dyOption;
        this.f55902f = dyOption.getCampaignEx();
    }

    public String getAdClickText() {
        return this.f55899c;
    }

    public String getAppInfo() {
        return this.f55898b;
    }

    @Override // com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData
    public CampaignEx getBindData() {
        return this.f55902f;
    }

    public int getClickType() {
        return this.f55907k;
    }

    public String getCountDownText() {
        return this.f55900d;
    }

    public DyOption getDyOption() {
        return this.f55897a;
    }

    @Override // com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData
    public DyOption getEffectData() {
        return this.f55897a;
    }

    public int getLogoImage() {
        return this.f55904h;
    }

    public String getLogoText() {
        return this.f55901e;
    }

    public int getNoticeImage() {
        return this.f55903g;
    }

    public float getxInScreen() {
        return this.f55905i;
    }

    public float getyInScreen() {
        return this.f55906j;
    }

    public void setAdClickText(String str) {
        this.f55899c = str;
    }

    public void setAppInfo(String str) {
        this.f55898b = str;
    }

    public void setClickType(int i) {
        this.f55907k = i;
    }

    public void setCountDownText(String str) {
        this.f55900d = str;
    }

    public void setLogoImage(int i) {
        this.f55904h = i;
    }

    public void setLogoText(String str) {
        this.f55901e = str;
    }

    public void setNoticeImage(int i) {
        this.f55903g = i;
    }

    public void setxInScreen(float f) {
        this.f55905i = f;
    }

    public void setyInScreen(float f) {
        this.f55906j = f;
    }
}
