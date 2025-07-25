package com.maticoo.sdk.utils;

import android.content.Context;
import java.lang.reflect.Field;

/* loaded from: classes6.dex */
public class IdentifierGetter {
    private static boolean isDynamicRes = false;

    public static int getAnimId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "anim", context.getPackageName());
    }

    public static int getAnimatorId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "animator", context.getPackageName());
    }

    public static int getAttrId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "attr", context.getPackageName());
    }

    public static int getBoolId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "bool", context.getPackageName());
    }

    public static int getColorId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "color", context.getPackageName());
    }

    public static int getDimenId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "dimen", context.getPackageName());
    }

    public static int getDrawableId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "drawable", context.getPackageName());
    }

    public static int getId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public static int getIntegerId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "integer", context.getPackageName());
    }

    public static int getInterpolatorId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "interpolator", context.getPackageName());
    }

    public static int getLayoutId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "layout", context.getPackageName());
    }

    public static int getMipmapId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "mipmap", context.getPackageName());
    }

    public static int getPluralsId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "plurals", context.getPackageName());
    }

    public static int[] getResourceDeclareStyleableIntArray(Context context, String str, int[] iArr) {
        Field[] fields;
        if (!isDynamicRes) {
            return iArr;
        }
        try {
            for (Field field : Class.forName(context.getPackageName() + ".R$styleable").getFields()) {
                if (field.getName().equals(str)) {
                    return (int[]) field.get(null);
                }
            }
        } catch (Throwable unused) {
        }
        return null;
    }

    public static int getStringId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "string", context.getPackageName());
    }

    public static int getStyleId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "style", context.getPackageName());
    }

    public static int getStyleableId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "styleable", context.getPackageName());
    }

    public static int getXmlId(Context context, String str, int i) {
        if (!isDynamicRes) {
            return i;
        }
        return context.getResources().getIdentifier(str, "xml", context.getPackageName());
    }

    public static void setIsDynamicRes(boolean z) {
        if (isDynamicRes != z) {
            isDynamicRes = z;
        }
    }
}
