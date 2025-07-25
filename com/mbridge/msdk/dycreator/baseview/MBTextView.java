package com.mbridge.msdk.dycreator.baseview;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.baseview.inter.InterEffect;
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
public class MBTextView extends TextView implements InterBase, InterEffect {

    /* renamed from: a */
    private boolean f55675a;
    public AttributeSet attrs;

    /* renamed from: b */
    private Animator f55676b;

    /* renamed from: c */
    private Map<String, String> f55677c;

    /* renamed from: d */
    private Map<String, Boolean> f55678d;

    /* renamed from: e */
    private String f55679e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.MBTextView$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218411 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55680a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55680a = iArr;
            try {
                iArr[SystemParamValue.layout_width.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55680a[SystemParamValue.layout_height.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public MBTextView(Context context) {
        super(context);
        this.f55675a = false;
        this.f55679e = "";
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        HashMap m53048b = MBResource.m53054a().m53048b();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = (SystemParamValue) m53048b.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                int i2 = C218411.f55680a[systemParamValue.ordinal()];
                if (i2 != 1) {
                    if (i2 == 2) {
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue.startsWith("m")) {
                            if (attributeValue.startsWith("wrap")) {
                                layoutParams.height = -2;
                            } else {
                                layoutParams.height = MBResource.m53054a().m53047b(attributeValue);
                            }
                        } else {
                            layoutParams.height = -1;
                        }
                    }
                } else {
                    String attributeValue2 = attributeSet.getAttributeValue(i);
                    if (!attributeValue2.startsWith(InneractiveMediationDefs.GENDER_FEMALE) && !attributeValue2.startsWith("m")) {
                        if (attributeValue2.startsWith("wrap")) {
                            layoutParams.width = -2;
                        } else {
                            layoutParams.width = MBResource.m53054a().m53047b(attributeValue2);
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
        Map<String, String> map = this.f55677c;
        if (map != null && map.containsKey("mbridgeAction")) {
            return this.f55677c.get("mbridgeAction");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getBindDataDes() {
        Map<String, String> map = this.f55677c;
        if (map != null && map.containsKey("mbridgeData")) {
            return this.f55677c.get("mbridgeData");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getEffectDes() {
        Map<String, String> map = this.f55677c;
        if (map != null && map.containsKey("mbridgeEffect")) {
            return this.f55677c.get("mbridgeEffect");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getReportDes() {
        Map<String, String> map = this.f55677c;
        if (map != null && map.containsKey("mbridgeReport")) {
            return this.f55677c.get("mbridgeReport");
        }
        return "";
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public String getStrategyDes() {
        Map<String, String> map = this.f55677c;
        if (map != null && map.containsKey("mbridgeStrategy")) {
            return this.f55677c.get("mbridgeStrategy");
        }
        return "";
    }

    @Override // android.view.View
    public boolean isFocused() {
        if (this.f55675a) {
            return true;
        }
        return super.isFocused();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Animator animator = this.f55676b;
        if (animator != null) {
            try {
                animator.start();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f55678d;
        if (map != null && map.containsKey("mbridgeAttached") && this.f55678d.get("mbridgeAttached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeAttached").m51944a().m51947a(this.f55679e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Animator animator = this.f55676b;
        if (animator != null) {
            try {
                animator.cancel();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        Map<String, Boolean> map = this.f55678d;
        if (map != null && map.containsKey("mbridgeDetached") && this.f55678d.get("mbridgeDetached").booleanValue()) {
            new SameCommonReporter.C22019a("mbridgeDetached").m51944a().m51947a(this.f55679e);
        }
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterEffect
    public void setAnimator(Animator animator) {
        this.f55676b = animator;
    }

    @Override // com.mbridge.msdk.dycreator.baseview.inter.InterBase
    public void setDynamicReport(String str, CampaignEx campaignEx) {
        this.f55678d = CommUtil.m52949a(str);
        if (campaignEx != null) {
            this.f55679e = campaignEx.getCampaignUnitId();
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet) {
        super(context);
        this.f55675a = false;
        this.f55679e = "";
        this.attrs = attributeSet;
        try {
            this.f55677c = CommUtil.m52950a(context, attributeSet);
            AttributeUtil.m52953a(this, attributeSet);
            setLayoutParams(generateLayoutParams(attributeSet));
            CommUtil.m52948a(this.f55677c, this);
        } catch (Exception e) {
            SameLogTool.m51824b("TextView", e.getMessage());
        }
    }

    public MBTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f55675a = false;
        this.f55679e = "";
    }
}
