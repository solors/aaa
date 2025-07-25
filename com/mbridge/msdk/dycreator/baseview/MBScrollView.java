package com.mbridge.msdk.dycreator.baseview;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.FrameLayout;
import android.widget.ScrollView;
import com.google.firebase.sessions.settings.RemoteSettings;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.CommUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.same.report.SameCommonReporter;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class MBScrollView extends ScrollView implements InterBase {

    /* renamed from: a */
    private Map<String, String> f55633a;

    /* renamed from: b */
    private Map<String, Boolean> f55634b;

    /* renamed from: c */
    private String f55635c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBScrollView$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218341 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55636a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55636a = iArr;
            try {
                iArr[SystemParamValue.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55636a[SystemParamValue.background.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55636a[SystemParamValue.contentDescription.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55636a[SystemParamValue.fadingEdge.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55636a[SystemParamValue.visibility.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55636a[SystemParamValue.layout_marginBottom.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public MBScrollView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55635c = "";
        this.f55633a = CommUtil.m52950a(context, attributeSet);
        setAttributeSet(attributeSet);
        setLayoutParams(generateLayoutParams(attributeSet));
        CommUtil.m52948a(this.f55633a, this);
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getActionDes() {
        Map<String, String> map = this.f55633a;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55633a.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55633a;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55633a.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55633a;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55633a.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55633a;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55633a.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55633a;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55633a.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Map<String, Boolean> map = this.f55634b;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55634b.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55635c);
        }
    }

    @Override // android.widget.ScrollView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Map<String, Boolean> map = this.f55634b;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55634b.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55635c);
        }
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                int i2 = C218341.f55636a[systemParamValue.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 == 3) {
                            setContentDescription(attributeSet.getAttributeValue(i));
                        }
                    } else {
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (attributeValue.startsWith("#")) {
                            setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
                        } else {
                            if (attributeValue.startsWith("@drawable/")) {
                                attributeValue = attributeValue.substring(10);
                            }
                            String file = getContext().getFilesDir().toString();
                            setBackgroundDrawable(new BitmapDrawable(BitmapFactory.decodeFile(file + RemoteSettings.FORWARD_SLASH_STRING + attributeValue + ".png")));
                        }
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (attributeValue2.startsWith("@+id/")) {
                        setId(attributeValue2.substring(5).hashCode());
                    }
                }
            }
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f55634b = CommUtil.m52949a(str);
        if (campaignEx != null) {
            this.f55635c = campaignEx.getCampaignUnitId();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        FrameLayout.LayoutParams generateDefaultLayoutParams = generateDefaultLayoutParams();
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                Log.e("MBscrollviewparam", systemParamValue.toString());
            }
            if (systemParamValue != null) {
                int i2 = C218341.f55636a[systemParamValue.ordinal()];
                if (i2 == 4) {
                    setHorizontalFadingEdgeEnabled(attributeSet.getAttributeBooleanValue(i, false));
                } else if (i2 == 5) {
                    String attributeValue = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue)) {
                        if (attributeValue.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                } else if (i2 == 6) {
                    generateDefaultLayoutParams.bottomMargin = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                }
            }
        }
        return generateDefaultLayoutParams;
    }
}
