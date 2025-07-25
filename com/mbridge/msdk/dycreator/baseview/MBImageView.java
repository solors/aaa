package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.AttributeUtil;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.SameCommonReporter;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MBImageView extends ImageView implements InterBase {

    /* renamed from: a */
    private Map<String, Boolean> f55602a;

    /* renamed from: b */
    private String f55603b;

    /* renamed from: c */
    private Map<String, String> f55604c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBImageView$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218281 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55605a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55605a = iArr;
            try {
                iArr[SystemParamValue.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55605a[SystemParamValue.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55605a[SystemParamValue.visibility.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public MBImageView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55603b = "";
        if (context != null && attributeSet != null) {
            try {
                this.f55604c = CommUtil.m52950a(context, attributeSet);
            } catch (Exception e) {
                SameLogTool.m51824b("MBImageView", e.getMessage());
                return;
            }
        }
        AttributeUtil.m52953a(this, attributeSet);
        setLayoutParams(generateLayoutParams(context, attributeSet));
        CommUtil.m52948a(this.f55604c, this);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                int i2 = C218281.f55605a[systemParamValue.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            String attributeValue = attributeSet.getAttributeValue(i);
                            if (!TextUtils.isEmpty(attributeValue)) {
                                if (attributeValue.equals("invisible")) {
                                    setVisibility(4);
                                } else if (attributeValue.equalsIgnoreCase("gone")) {
                                    setVisibility(8);
                                }
                            }
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.height = -2;
                            } else {
                                layoutParams.height = MBResource.m53054a().m53047b(attributeValue2);
                            }
                        } else {
                            layoutParams.height = -1;
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!attributeValue3.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue3.startsWith("m")) {
                        if (attributeValue3.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = MBResource.m53054a().m53047b(attributeValue3);
                        }
                    } else {
                        layoutParams.width = -1;
                    }
                }
            }
        }
        return layoutParams;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f55604c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55604c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55604c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55604c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55604c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55604c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55604c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55604c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55604c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55604c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f55602a;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55602a.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55603b);
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f55602a;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55602a.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55603b);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f55602a = CommUtil.m52949a(str);
        if (campaignEx != null) {
            this.f55603b = campaignEx.getCampaignUnitId();
        }
    }
}
