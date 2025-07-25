package com.mbridge.msdk.dycreator.baseview.extview;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.baseview.cusview.SoundImageView;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import com.mbridge.msdk.dycreator.p417a.SystemParamValue;
import com.mbridge.msdk.dycreator.p422e.BufferViewUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.util.HashMap;

/* loaded from: classes6.dex */
public class MBExtSoundImageView extends SoundImageView {

    /* renamed from: a */
    private int f55810a;

    /* renamed from: b */
    private int f55811b;

    /* renamed from: c */
    private int f55812c;

    /* renamed from: d */
    private int f55813d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.mbridge.msdk.dycreator.baseview.extview.MBExtSoundImageView$1 */
    /* loaded from: classes6.dex */
    public static /* synthetic */ class C218611 {

        /* renamed from: a */
        static final /* synthetic */ int[] f55814a;

        static {
            int[] iArr = new int[SystemParamValue.values().length];
            f55814a = iArr;
            try {
                iArr[SystemParamValue.id.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f55814a[SystemParamValue.src.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f55814a[SystemParamValue.background.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f55814a[SystemParamValue.contentDescription.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f55814a[SystemParamValue.tag.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f55814a[SystemParamValue.visibility.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f55814a[SystemParamValue.scaleType.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f55814a[SystemParamValue.padding.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f55814a[SystemParamValue.paddingTop.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f55814a[SystemParamValue.paddingBottom.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f55814a[SystemParamValue.paddingLeft.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f55814a[SystemParamValue.paddingRight.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f55814a[SystemParamValue.layout_width.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f55814a[SystemParamValue.layout_height.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f55814a[SystemParamValue.gravity.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f55814a[SystemParamValue.layout_gravity.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
        }
    }

    public MBExtSoundImageView(Context context) {
        super(context);
    }

    public ViewGroup.LayoutParams generateLayoutParams(Context context, AttributeSet attributeSet) {
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                int i2 = C218611.f55814a[systemParamValue.ordinal()];
                if (i2 != 6) {
                    if (i2 != 13) {
                        if (i2 == 14) {
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
                } else {
                    String attributeValue3 = attributeSet.getAttributeValue(i);
                    if (!TextUtils.isEmpty(attributeValue3)) {
                        if (attributeValue3.equals("invisible")) {
                            setVisibility(4);
                        } else if (attributeValue3.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                        }
                    }
                }
            }
        }
        return layoutParams;
    }

    public void setAttributeSet(AttributeSet attributeSet) {
        String[] strArr;
        HashMap<String, SystemParamValue> m53046c = MBResource.m53054a().m53046c();
        int attributeCount = attributeSet.getAttributeCount();
        for (int i = 0; i < attributeCount; i++) {
            SystemParamValue systemParamValue = m53046c.get(attributeSet.getAttributeName(i));
            if (systemParamValue != null) {
                switch (C218611.f55814a[systemParamValue.ordinal()]) {
                    case 1:
                        String attributeValue = attributeSet.getAttributeValue(i);
                        if (!attributeValue.startsWith("@+id/")) {
                            break;
                        } else {
                            setId(attributeValue.substring(5).hashCode());
                            continue;
                        }
                    case 2:
                        MBResource.m53054a().m53050a(attributeSet.getAttributeValue(i), this);
                        continue;
                    case 3:
                        String attributeValue2 = attributeSet.getAttributeValue(i);
                        if (attributeValue2.startsWith("#")) {
                            try {
                                strArr = attributeValue2.split("-");
                            } catch (Exception unused) {
                                strArr = null;
                            }
                            if (strArr != null && strArr.length <= 2) {
                                setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
                                continue;
                            } else {
                                if (strArr != null && strArr.length == 3) {
                                    try {
                                        GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
                                        gradientDrawable.setGradientType(0);
                                        setBackground(gradientDrawable);
                                        break;
                                    } catch (Exception unused2) {
                                    }
                                }
                                setBackgroundColor(MBResource.m53054a().m53051a(attributeSet.getAttributeValue(i)));
                                break;
                            }
                        } else {
                            if (attributeValue2.startsWith("@drawable/")) {
                                attributeValue2 = attributeValue2.substring(10);
                            }
                            setBackgroundResource(getResources().getIdentifier(attributeValue2, "drawable", getContext().getPackageName()));
                            break;
                        }
                        break;
                    case 4:
                        String attributeValue3 = attributeSet.getAttributeValue(i);
                        if (!TextUtils.isEmpty(attributeValue3)) {
                            CharSequence charSequence = (String) BufferViewUtil.f55960a.get(attributeValue3.substring(8));
                            if (TextUtils.isEmpty(charSequence)) {
                                break;
                            } else {
                                setContentDescription(charSequence);
                                break;
                            }
                        } else {
                            continue;
                        }
                    case 5:
                        String attributeValue4 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue4)) {
                            break;
                        } else {
                            String str = BufferViewUtil.f55960a.get(attributeValue4.substring(8));
                            if (TextUtils.isEmpty(str)) {
                                break;
                            } else {
                                setTag(str);
                                continue;
                            }
                        }
                    case 6:
                        String attributeValue5 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue5)) {
                            continue;
                        } else if (attributeValue5.equals("invisible")) {
                            setVisibility(4);
                            break;
                        } else if (attributeValue5.equalsIgnoreCase("gone")) {
                            setVisibility(8);
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        String attributeValue6 = attributeSet.getAttributeValue(i);
                        if (TextUtils.isEmpty(attributeValue6)) {
                            continue;
                        } else if (attributeValue6.equals("fitXY")) {
                            setScaleType(ImageView.ScaleType.FIT_XY);
                            break;
                        } else if (attributeValue6.equals("centerInside")) {
                            setScaleType(ImageView.ScaleType.CENTER_INSIDE);
                            break;
                        } else if (attributeValue6.equals("centerCrop")) {
                            setScaleType(ImageView.ScaleType.CENTER_CROP);
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        int m53047b = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55813d = m53047b;
                        this.f55812c = m53047b;
                        this.f55811b = m53047b;
                        this.f55810a = m53047b;
                        setPadding(m53047b, m53047b, m53047b, m53047b);
                        continue;
                    case 9:
                        int m53047b2 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55811b = m53047b2;
                        setPadding(this.f55810a, m53047b2, this.f55812c, this.f55813d);
                        continue;
                    case 10:
                        int m53047b3 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55813d = m53047b3;
                        setPadding(this.f55810a, this.f55811b, this.f55812c, m53047b3);
                        continue;
                    case 11:
                        int m53047b4 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55810a = m53047b4;
                        setPadding(m53047b4, this.f55811b, this.f55812c, this.f55813d);
                        continue;
                    case 12:
                        int m53047b5 = MBResource.m53054a().m53047b(attributeSet.getAttributeValue(i));
                        this.f55812c = m53047b5;
                        setPadding(this.f55810a, this.f55811b, m53047b5, this.f55813d);
                        continue;
                }
            }
        }
    }

    public MBExtSoundImageView(Context context, AttributeSet attributeSet) {
        super(context);
        try {
            setAttributeSet(attributeSet);
            setLayoutParams(generateLayoutParams(context, attributeSet));
        } catch (Exception e) {
            SameLogTool.m51824b("MBExtSoundImageView", e.getMessage());
        }
    }

    public MBExtSoundImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
