package com.mbridge.msdk.dycreator.p422e;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.mbridge.msdk.dycreator.binding.MBDataBinding;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.mbridge.msdk.dycreator.e.c */
/* loaded from: classes6.dex */
public final class CommUtil {
    /* renamed from: a */
    public static double m52952a(double d, double d2, int i) {
        if (i < 0) {
            return 1.0d;
        }
        try {
            return new BigDecimal(Double.toString(d)).divide(new BigDecimal(Double.toString(d2)), i, 4).doubleValue();
        } catch (Exception e) {
            SameLogTool.m51824b("CommUtil", e.getMessage());
            return 1.0d;
        }
    }

    /* renamed from: a */
    public static int m52951a(Context context, float f) {
        if (context == null) {
            return 0;
        }
        try {
            Resources resources = context.getResources();
            if (resources == null) {
                return 0;
            }
            return (int) ((f * resources.getDisplayMetrics().density) + 0.5f);
        } catch (Exception e) {
            SameLogTool.m51824b("CommUtil", e.getMessage());
            return 0;
        }
    }

    /* renamed from: a */
    public static Map<String, String> m52950a(Context context, AttributeSet attributeSet) {
        HashMap hashMap = new HashMap();
        if (context != null && attributeSet != null) {
            int attributeCount = attributeSet.getAttributeCount();
            for (int i = 0; i < attributeCount; i++) {
                String attributeName = attributeSet.getAttributeName(i);
                if (!TextUtils.isEmpty(attributeName)) {
                    if (attributeName.equals("mbridge_data")) {
                        try {
                            hashMap.put("mbridgeData", BufferViewUtil.f55960a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_click")) {
                        try {
                            hashMap.put("mbridgeAction", BufferViewUtil.f55960a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_strategy")) {
                        try {
                            hashMap.put("mbridgeStrategy", BufferViewUtil.f55960a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e3) {
                            e3.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_effect")) {
                        try {
                            hashMap.put("mbridgeEffect", BufferViewUtil.f55960a.get(attributeSet.getAttributeValue(i).substring(8)));
                        } catch (Exception e4) {
                            e4.printStackTrace();
                        }
                    }
                    if (attributeName.equals("mbridge_report")) {
                        try {
                            hashMap.put("mbridgeReport", attributeSet.getAttributeValue(i));
                        } catch (Exception e5) {
                            e5.printStackTrace();
                        }
                    }
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static void m52948a(Map<String, String> map, View view) {
        if (map == null || view == null) {
            return;
        }
        if (map.containsKey("mbridgeData")) {
            MBDataBinding.m52988a().m52978c(view);
        }
        if (map.containsKey("mbridgeAction")) {
            MBDataBinding.m52988a().m52976d(view);
        }
        if (map.containsKey("mbridgeEffect")) {
            MBDataBinding.m52988a().m52980b(view);
        }
        if (map.containsKey("mbridgeReport")) {
            MBDataBinding.m52988a().m52987a(view);
        }
    }

    /* renamed from: a */
    public static Map<String, Boolean> m52949a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            String[] split = str.split("\\|");
            if (split != null && split.length > 0) {
                for (String str2 : split) {
                    if (str2.equals("mbridgeAttached")) {
                        hashMap.put("mbridgeAttached", Boolean.TRUE);
                    }
                    if (str2.equals("mbridgeDetached")) {
                        hashMap.put("mbridgeDetached", Boolean.TRUE);
                    }
                }
            } else {
                if (str.equals("mbridgeAttached")) {
                    hashMap.put("mbridgeAttached", Boolean.TRUE);
                }
                if (str.equals("mbridgeDetached")) {
                    hashMap.put("mbridgeDetached", Boolean.TRUE);
                }
            }
        }
        return hashMap;
    }
}
