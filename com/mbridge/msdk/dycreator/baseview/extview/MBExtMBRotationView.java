package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.MBRotationView;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.SameCommonReporter;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MBExtMBRotationView extends MBRotationView implements InterBase {

    /* renamed from: b */
    private Map<String, String> f55788b;

    /* renamed from: c */
    private Map<String, Boolean> f55789c;

    /* renamed from: d */
    private String f55790d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtMBRotationView$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218561 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55791a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55791a = iArr;
            try {
                iArr[SystemParamValue.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55791a[SystemParamValue.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55791a[SystemParamValue.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55791a[SystemParamValue.visibility.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55791a[SystemParamValue.layout_width.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55791a[SystemParamValue.layout_height.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55791a[SystemParamValue.layout_gravity.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55791a[SystemParamValue.layout_marginLeft.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55791a[SystemParamValue.layout_margin.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public MBExtMBRotationView(Context context) {
        super(context);
        this.f55790d = "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f55788b;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55788b.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55788b;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55788b.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55788b;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55788b.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55788b;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55788b.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55788b;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55788b.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f55789c;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55789c.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55790d);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f55789c;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55789c.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55790d);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                int i2 = C218561.f55791a[systemParamValue.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 == 4) {
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
                            setContentDescription(attributeSet.getAttributeValue(i));
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
                        } else if (attributeValue2.startsWith("@color/")) {
                            setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
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

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f55789c = CommUtil.m52949a(str);
        if (campaignEx != null) {
            this.f55790d = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        HashMap m53048b = MBResource.m53054a().m53048b();
        layoutParams.width = -2;
        layoutParams.height = -2;
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = (SystemParamValue) m53048b.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                switch (C218561.f55791a[systemParamValue.ordinal()]) {
                    case 5:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue.startsWith("m")) {
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
                    case 6:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith("m")) {
                            if (attributeValue2.startsWith(POBNativeConstants.NATIVE_IMAGE_WIDTH)) {
                                layoutParams.width = -2;
                                continue;
                            } else {
                                layoutParams.height = MBResource.m53054a().m53047b(attributeValue2);
                                break;
                            }
                        } else {
                            layoutParams.width = -1;
                            break;
                        }
                        break;
                    case 7:
                        layoutParams.gravity = MBResource.m53054a().m53045c(attributeSet.getAttributeValue(i));
                        continue;
                    case 8:
                        layoutParams.leftMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        continue;
                    case 9:
                        int m53047b = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        layoutParams.setMargins(m53047b, m53047b, m53047b, m53047b);
                        continue;
                }
            }
        }
        return layoutParams;
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55790d = "";
        try {
            this.f55788b = CommUtil.m52950a(context, attributeSet);
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            CommUtil.m52948a(this.f55788b, this);
        } catch (Exception e) {
            SameLogTool.m51824b("MBExtMBRotationView", e.getMessage());
        }
    }

    public MBExtMBRotationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55790d = "";
    }
}
