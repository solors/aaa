package com.meevii.abtest.util;

import android.content.Context;
import android.text.TextUtils;
import com.learnings.abcenter.util.AbCenterSharedUtil;
import com.learnings.abcenter.util.CheckUtil;
import com.meevii.abtest.model.AbTestData;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;

/* loaded from: classes6.dex */
public class AbUtil {
    public static String collectionToString(Collection<String> collection) {
        StringBuilder sb2 = new StringBuilder();
        for (String str : collection) {
            sb2.append(str);
        }
        return sb2.toString();
    }

    public static JSONArray getLocalDyeingTag(Context context) {
        try {
            String stringValue = AbCenterSharedUtil.getStringValue(context, Constant.SP_KEY_DYEING_TAG);
            if (TextUtils.isEmpty(stringValue)) {
                return null;
            }
            return new JSONArray(stringValue);
        } catch (Throwable unused) {
            return null;
        }
    }

    public static boolean isApkInRelease(Context context) {
        try {
            if ((context.getApplicationInfo().flags & 2) != 0) {
                return false;
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void saveDyeingTag(Context context, AbTestData abTestData) {
        if (abTestData != null) {
            try {
                if (!CheckUtil.isCollectionNullOrEmpty(abTestData.getDyeingTagSet())) {
                    JSONArray jSONArray = new JSONArray();
                    Iterator<String> it = abTestData.getDyeingTagSet().iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                    AbCenterSharedUtil.setStringValue(context, Constant.SP_KEY_DYEING_TAG, jSONArray.toString());
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static Object transformObject(Object obj) {
        if (obj == null) {
            return null;
        }
        if (obj instanceof Number) {
            double parseDouble = Double.parseDouble(obj.toString());
            if (parseDouble > 9.223372036854776E18d) {
                return Double.valueOf(parseDouble);
            }
            long j = (long) parseDouble;
            if (parseDouble == j) {
                try {
                    return Integer.valueOf((int) j);
                } catch (Throwable unused) {
                    return Long.valueOf(j);
                }
            }
            return Double.valueOf(parseDouble);
        }
        return obj;
    }
}
