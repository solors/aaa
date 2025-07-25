package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBridgeSegmentsProgressBar;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.SameCommonReporter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MBExtMBridgeSegmentsProgressBar extends MBridgeSegmentsProgressBar implements InterBase {

    /* renamed from: a */
    private Map<String, String> f55802a;

    /* renamed from: b */
    private Map<String, Boolean> f55803b;

    /* renamed from: c */
    private String f55804c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBridgeSegmentsProgressBar$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218591 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55805a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55805a = iArr;
            try {
                iArr[SystemParamValue.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55805a[SystemParamValue.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55805a[SystemParamValue.orientation.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55805a[SystemParamValue.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55805a[SystemParamValue.padding.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55805a[SystemParamValue.layout_width.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55805a[SystemParamValue.layout_height.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55805a[SystemParamValue.layout_centerHorizontal.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55805a[SystemParamValue.layout_centerVertical.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55805a[SystemParamValue.layout_weight.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55805a[SystemParamValue.gravity.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55805a[SystemParamValue.layout_margin.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55805a[SystemParamValue.layout_marginLeft.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55805a[SystemParamValue.layout_marginRight.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55805a[SystemParamValue.layout_marginTop.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55805a[SystemParamValue.layout_marginBottom.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f55805a[SystemParamValue.layout_gravity.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    public MBExtMBridgeSegmentsProgressBar(Context context) {
        super(context);
        this.f55804c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f55802a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55802a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55802a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55802a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55802a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55802a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55802a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55802a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55802a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55802a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f55803b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55803b.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55804c);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f55803b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55803b.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55804c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                int i2 = C218591.f55805a[systemParamValue.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 == 5) {
                                    int m53047b = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                                    setPadding(m53047b, m53047b, m53047b, m53047b);
                                }
                            } else {
                                String attributeValue = attributeSet.getAttributeValue(i);
                                if (!TextUtils.isEmpty(attributeValue)) {
                                    if (attributeValue.equals("invisible")) {
                                        setVisibility(4);
                                    } else if (attributeValue.equalsIgnoreCase("gone")) {
                                        setVisibility(8);
                                    }
                                }
                            }
                        } else if ("horizontal".equalsIgnoreCase(attributeSet.getAttributeValue(i))) {
                            setOrientation(0);
                        } else {
                            setOrientation(1);
                        }
                    } else {
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(getContext().getFilesDir().toString() + RemoteSettings.FORWARD_SLASH_STRING + attributeValue2 + ".png")));
                        }
                    }
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (attributeValue3.startsWith("@+id/")) {
                        setId(attributeValue3.substring(5).hashCode());
                    }
                }
            }
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
                switch (C218591.f55805a[systemParamValue.ordinal()]) {
                    case 6:
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
                    case 7:
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
                    case 8:
                        generateDefaultLayoutParams.gravity = 1;
                        continue;
                    case 9:
                        generateDefaultLayoutParams.gravity = 16;
                        continue;
                    case 10:
                        generateDefaultLayoutParams.weight = attributeSet.getAttributeFloatValue(i, 0.0f);
                        continue;
                    case 11:
                        setGravity(MBResource.m53054a().m53045c(attributeSet.getAttributeValue(i)));
                        continue;
                    case 12:
                        int m53047b = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        generateDefaultLayoutParams.bottomMargin = m53047b;
                        generateDefaultLayoutParams.leftMargin = m53047b;
                        generateDefaultLayoutParams.rightMargin = m53047b;
                        generateDefaultLayoutParams.topMargin = m53047b;
                        continue;
                    case 13:
                        generateDefaultLayoutParams.leftMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 14:
                        generateDefaultLayoutParams.rightMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 15:
                        generateDefaultLayoutParams.topMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 16:
                        generateDefaultLayoutParams.bottomMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 17:
                        generateDefaultLayoutParams.gravity = MBResource.m53054a().m53045c(attributeSet.getAttributeValue(i));
                        continue;
                }
            }
        }
        return generateDefaultLayoutParams;
    }

    public MBExtMBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55804c = "";
        try {
            this.f55802a = CommUtil.m52950a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            CommUtil.m52948a(this.f55802a, this);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public MBExtMBridgeSegmentsProgressBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55804c = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
    }
}
