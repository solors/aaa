package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.AttributeUtil;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.SameCommonReporter;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;

/* loaded from: classes6.dex */
public class MBRelativeLayout extends RelativeLayout implements InterBase {

    /* renamed from: a */
    private float f55626a;

    /* renamed from: b */
    private float f55627b;

    /* renamed from: c */
    private Map<String, String> f55628c;

    /* renamed from: d */
    private Map<String, Boolean> f55629d;

    /* renamed from: e */
    private String f55630e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBRelativeLayout$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218331 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55631a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55631a = iArr;
            try {
                iArr[SystemParamValue.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55631a[SystemParamValue.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55631a[SystemParamValue.layout_centerHorizontal.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55631a[SystemParamValue.layout_alignParentBottom.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55631a[SystemParamValue.layout_alignParentTop.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55631a[SystemParamValue.layout_centerVertical.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55631a[SystemParamValue.layout_below.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55631a[SystemParamValue.layout_above.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55631a[SystemParamValue.layout_toLeftOf.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55631a[SystemParamValue.layout_toRightOf.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55631a[SystemParamValue.layout_toEndOf.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55631a[SystemParamValue.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55631a[SystemParamValue.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55631a[SystemParamValue.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55631a[SystemParamValue.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55631a[SystemParamValue.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f55631a[SystemParamValue.layout_alignParentRight.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f55631a[SystemParamValue.layout_alignParentLeft.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f55631a[SystemParamValue.layout_alignTop.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f55631a[SystemParamValue.layout_alignLeft.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f55631a[SystemParamValue.layout_alignRight.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f55631a[SystemParamValue.layout_alignBottom.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f55631a[SystemParamValue.layout_centerInParent.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f55631a[SystemParamValue.layout_alignParentEnd.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
        }
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55630e = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f55628c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55628c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55628c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55628c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55628c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55628c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55628c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55628c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55628c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55628c.get("mbridgeStrategy");
        }
        return "";
    }

    public float getxInScreen() {
        return this.f55626a;
    }

    public float getyInScreen() {
        return this.f55627b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f55629d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55629d.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55630e);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f55629d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55629d.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55630e);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.f55626a = motionEvent.getRawX();
        this.f55627b = motionEvent.getRawY();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.RelativeLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        for (int i5 = 0; i5 < getChildCount(); i5++) {
            try {
                View childAt = getChildAt(i5);
                RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) childAt.getLayoutParams();
                if (childAt instanceof MBLinearLayout) {
                    MBLinearLayout mBLinearLayout = (MBLinearLayout) childAt;
                    for (int i6 = 0; i6 < mBLinearLayout.getChildCount(); i6++) {
                        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) mBLinearLayout.getChildAt(i6).getLayoutParams();
                    }
                }
            } catch (Exception e) {
                SameLogTool.m51824b("MBRelativeLayouts", e.getMessage());
            }
        }
        super.onLayout(z, i, i2, i3, i4);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f55629d = CommUtil.m52949a(str);
        if (campaignEx != null) {
            this.f55630e = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.RelativeLayout, android.view.ViewGroup
    public RelativeLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(0, 0);
        HashMap m53048b = MBResource.m53054a().m53048b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = (SystemParamValue) m53048b.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                switch (C218331.f55631a[systemParamValue.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith(Reporting.EventType.FILL) && !attributeValue.startsWith("match")) {
                            if (attributeValue.startsWith(POBNativeConstants.NATIVE_IMAGE_WIDTH)) {
                                layoutParams.width = -2;
                                break;
                            } else {
                                layoutParams.width = MBResource.m53054a().m53047b(attributeValue);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            continue;
                        }
                        break;
                    case 2:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(Reporting.EventType.FILL) && !attributeValue2.startsWith("match")) {
                            if (attributeValue2.startsWith("wrap")) {
                                layoutParams.height = -2;
                                continue;
                            } else {
                                layoutParams.height = MBResource.m53054a().m53047b(attributeValue2);
                                break;
                            }
                        } else {
                            layoutParams.height = -1;
                            break;
                        }
                        break;
                    case 3:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(14, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 4:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(12, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 5:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(10, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 6:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(15, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 7:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (attributeValue3.startsWith("@+id")) {
                            layoutParams.addRule(3, attributeValue3.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 8:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (attributeValue4.startsWith("@+id")) {
                            layoutParams.addRule(2, attributeValue4.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 9:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (attributeValue5.startsWith("@+id")) {
                            layoutParams.addRule(0, attributeValue5.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 10:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (attributeValue6.startsWith("@+id")) {
                            layoutParams.addRule(1, attributeValue6.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 11:
                        String attributeValue7 = attributeSet.getAttributeValue(i);
                        if (attributeValue7.startsWith("@+id")) {
                            layoutParams.addRule(17, attributeValue7.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 12:
                        int m53047b = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        layoutParams.setMargins(m53047b, m53047b, m53047b, m53047b);
                        continue;
                    case 13:
                        layoutParams.leftMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 14:
                        layoutParams.rightMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 15:
                        layoutParams.topMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 16:
                        layoutParams.bottomMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 17:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(11, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 18:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(9, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 19:
                        String attributeValue8 = attributeSet.getAttributeValue(i);
                        if (attributeValue8.startsWith("@+id")) {
                            layoutParams.addRule(6, attributeValue8.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 20:
                        String attributeValue9 = attributeSet.getAttributeValue(i);
                        if (attributeValue9.startsWith("@+id")) {
                            layoutParams.addRule(5, attributeValue9.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 21:
                        String attributeValue10 = attributeSet.getAttributeValue(i);
                        if (attributeValue10.startsWith("@+id")) {
                            layoutParams.addRule(7, attributeValue10.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 22:
                        String attributeValue11 = attributeSet.getAttributeValue(i);
                        if (attributeValue11.startsWith("@+id")) {
                            layoutParams.addRule(8, attributeValue11.substring(5).hashCode());
                            break;
                        } else {
                            continue;
                        }
                    case 23:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(13, -1);
                            break;
                        } else {
                            continue;
                        }
                    case 24:
                        if (attributeSet.getAttributeBooleanValue(i, false)) {
                            layoutParams.addRule(21, -1);
                            break;
                        } else {
                            continue;
                        }
                }
            }
        }
        return layoutParams;
    }

    public MBRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55630e = "";
        try {
            this.f55628c = CommUtil.m52950a(context, attributeSet);
            AttributeUtil.m52953a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            CommUtil.m52948a(this.f55628c, this);
        } catch (Exception e) {
            SameLogTool.m51824b("MBRelativeLayouts", e.getMessage());
        }
    }

    public MBRelativeLayout(Context context) {
        super(context);
        this.f55630e = "";
    }
}
