package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.Button;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p422e.AttributeUtil;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.SameCommonReporter;
import java.util.Map;

/* loaded from: classes6.dex */
public class MBButton extends Button implements InterBase {

    /* renamed from: a */
    private Map<String, String> f55581a;

    /* renamed from: b */
    private Map<String, Boolean> f55582b;

    /* renamed from: c */
    private String f55583c;

    public MBButton(Context context) {
        super(context);
        this.f55583c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f55581a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55581a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55581a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55581a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55581a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55581a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55581a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55581a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55581a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55581a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f55582b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55582b.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55583c);
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f55582b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55582b.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55583c);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f55582b = CommUtil.m52949a(str);
        if (campaignEx != null) {
            this.f55583c = campaignEx.getCampaignUnitId();
        }
    }

    public MBButton(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55583c = "";
        this.f55581a = CommUtil.m52950a(context, attributeSet);
        AttributeUtil.m52953a(this, attributeSet);
        CommUtil.m52948a(this.f55581a, this);
    }

    public MBButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55583c = "";
    }
}
