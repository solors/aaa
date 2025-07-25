package com.mbridge.msdk.dycreator.p422e;

import android.text.TextUtils;
import android.view.View;
import com.mbridge.msdk.dycreator.baseview.inter.InterBase;
import com.mbridge.msdk.dycreator.p423f.p424a.BaseViewData;
import java.lang.reflect.Method;

/* renamed from: com.mbridge.msdk.dycreator.e.d */
/* loaded from: classes6.dex */
public final class DYLogicUtil {
    /* renamed from: a */
    public static boolean m52947a(View view, BaseViewData baseViewData) {
        String[] split;
        if (view != null) {
            try {
                if (!(view instanceof InterBase) || baseViewData == null) {
                    return true;
                }
                String actionDes = ((InterBase) view).getActionDes();
                if (TextUtils.isEmpty(actionDes) || (split = actionDes.split("\\|")) == null || split.length < 2 || TextUtils.isEmpty(split[0]) || !split[0].startsWith("click") || TextUtils.isEmpty(split[1]) || !split[1].equals("alecfc") || baseViewData.getEffectData() == null) {
                    return true;
                }
                return baseViewData.getEffectData().isClickScreen();
            } catch (Exception e) {
                e.printStackTrace();
                return true;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static void m52945a(String str, View view, boolean z) {
        if (view == null || !(view instanceof InterBase) || TextUtils.isEmpty(str)) {
            return;
        }
        try {
            String[] split = str.split("\\|");
            if (split == null || split.length < 2 || TextUtils.isEmpty(split[0]) || !split[0].startsWith("visible") || TextUtils.isEmpty(split[1]) || !split[1].equals("parent") || !z) {
                return;
            }
            view.setVisibility(8);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static Object m52946a(Object obj, String str) {
        Method method;
        try {
            try {
                method = obj.getClass().getMethod(str, new Class[0]);
                if (method != null) {
                    try {
                        return method.invoke(obj, new Object[0]);
                    } catch (NoSuchMethodException unused) {
                        if (obj instanceof BaseViewData) {
                            method = ((BaseViewData) obj).getBindData().getClass().getMethod(str, new Class[0]);
                        }
                        if (method != null) {
                            return method.invoke(((BaseViewData) obj).getBindData(), new Object[0]);
                        }
                        return null;
                    }
                }
            } catch (NoSuchMethodException unused2) {
                method = null;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /* renamed from: a */
    public static String m52944a(boolean z, int i, String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        if (TextUtils.isEmpty(str2) || !str2.contains("zh")) {
            return str + " " + i + "s";
        } else if (z) {
            return str + i + "s";
        } else {
            return i + "s " + str;
        }
    }
}
