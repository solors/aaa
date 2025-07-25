package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.AttributeUtil;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.SameCommonReporter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MBLinearLayout extends LinearLayout implements InterBase {

    /* renamed from: a */
    private float f55610a;

    /* renamed from: b */
    private float f55611b;

    /* renamed from: c */
    private Map<String, String> f55612c;

    /* renamed from: d */
    private Map<String, Boolean> f55613d;

    /* renamed from: e */
    private String f55614e;

    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBLinearLayout$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218301 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55615a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55615a = iArr;
            try {
                iArr[SystemParamValue.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55615a[SystemParamValue.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55615a[SystemParamValue.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55615a[SystemParamValue.layout_centerVertical.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55615a[SystemParamValue.layout_weight.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55615a[SystemParamValue.gravity.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55615a[SystemParamValue.layout_margin.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55615a[SystemParamValue.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55615a[SystemParamValue.layout_marginRight.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55615a[SystemParamValue.layout_marginTop.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55615a[SystemParamValue.layout_marginBottom.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55615a[SystemParamValue.layout_gravity.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    public MBLinearLayout(Context context) {
        super(context);
        this.f55614e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f55612c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55612c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55612c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55612c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55612c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55612c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55612c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55612c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55612c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55612c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.f55610a;
    }

    public float getyInScreen() {
        return this.f55611b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f55613d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55613d.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55614e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f55613d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55613d.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55614e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f55610a = motionEvent.getRawX();
        this.f55611b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f55613d = CommUtil.m52949a(str);
        if (campaignEx != null) {
            this.f55614e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup
    public LinearLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        LinearLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap m53048b = MBResource.m53054a().m53048b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = (SystemParamValue) m53048b.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                switch (C218301.f55615a[systemParamValue.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                generateDefaultLayoutParams.width = -2;
                                break;
                            } else {
                                generateDefaultLayoutParams.width = MBResource.m53054a().m53047b(attributeValue);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.width = -1;
                            continue;
                        }
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith("wrap")) {
                                generateDefaultLayoutParams.height = -2;
                                continue;
                            } else {
                                generateDefaultLayoutParams.height = MBResource.m53054a().m53047b(attributeValue2);
                                break;
                            }
                        } else {
                            generateDefaultLayoutParams.height = -1;
                            break;
                        }
                        break;
                    case 3:
                        generateDefaultLayoutParams.gravity = 1;
                        continue;
                    case 4:
                        generateDefaultLayoutParams.gravity = 16;
                        continue;
                    case 5:
                        generateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i, 0.0f);
                        continue;
                    case 6:
                        setGravity(MBResource.m53054a().m53045c(attributeSet.getAttributeValue(i)));
                        continue;
                    case 7:
                        int m53047b = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        generateDefaultLayoutParams.bottomMargin = m53047b;
                        generateDefaultLayoutParams.leftMargin = m53047b;
                        generateDefaultLayoutParams.rightMargin = m53047b;
                        generateDefaultLayoutParams.topMargin = m53047b;
                        continue;
                    case 8:
                        generateDefaultLayoutParams.leftMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 9:
                        generateDefaultLayoutParams.rightMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 10:
                        generateDefaultLayoutParams.topMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 11:
                        generateDefaultLayoutParams.bottomMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 12:
                        generateDefaultLayoutParams.gravity = MBResource.m53054a().m53045c(attributeSet.getAttributeValue(i));
                        continue;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public MBLinearLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55614e = "";
        this.f55612c = CommUtil.m52950a(context, attributeSet);
        AttributeUtil.m52953a(this, attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        CommUtil.m52948a(this.f55612c, this);
    }

    public MBLinearLayout(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55614e = "";
    }
}
