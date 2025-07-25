package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.content.res.loader.ResourcesLoader;
import android.os.Build;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import com.google.android.material.C16310R;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes5.dex */
public class HarmonizedColors {

    /* renamed from: a */
    private static final String f37244a = "HarmonizedColors";

    private HarmonizedColors() {
    }

    @RequiresApi(api = 21)
    /* renamed from: a */
    private static void m71660a(@NonNull Map<Integer, Integer> map, @NonNull TypedArray typedArray, @Nullable TypedArray typedArray2, @ColorInt int i) {
        if (typedArray2 == null) {
            typedArray2 = typedArray;
        }
        for (int i2 = 0; i2 < typedArray.getIndexCount(); i2++) {
            int resourceId = typedArray2.getResourceId(i2, 0);
            if (resourceId != 0 && typedArray.hasValue(i2) && m71657d(typedArray.getType(i2))) {
                map.put(Integer.valueOf(resourceId), Integer.valueOf(MaterialColors.harmonize(typedArray.getColor(i2, 0), i)));
            }
        }
    }

    @NonNull
    public static void applyToContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (!isHarmonizedColorAvailable()) {
            return;
        }
        Map<Integer, Integer> m71658c = m71658c(context, harmonizedColorsOptions);
        int m71656a = harmonizedColorsOptions.m71656a(0);
        if (m71659b(context, m71658c) && m71656a != 0) {
            ThemeUtils.m71645a(context, m71656a);
        }
    }

    @RequiresApi(api = 30)
    /* renamed from: b */
    private static boolean m71659b(Context context, Map<Integer, Integer> map) {
        ResourcesLoader m71707a = ColorResourcesLoaderCreator.m71707a(context, map);
        if (m71707a != null) {
            context.getResources().addLoaders(m71707a);
            return true;
        }
        return false;
    }

    @RequiresApi(api = 21)
    /* renamed from: c */
    private static Map<Integer, Integer> m71658c(Context context, HarmonizedColorsOptions harmonizedColorsOptions) {
        int[] colorResourceIds;
        TypedArray typedArray;
        HashMap hashMap = new HashMap();
        int color = MaterialColors.getColor(context, harmonizedColorsOptions.getColorAttributeToHarmonizeWith(), f37244a);
        for (int i : harmonizedColorsOptions.getColorResourceIds()) {
            hashMap.put(Integer.valueOf(i), Integer.valueOf(MaterialColors.harmonize(ContextCompat.getColor(context, i), color)));
        }
        HarmonizedColorAttributes colorAttributes = harmonizedColorsOptions.getColorAttributes();
        if (colorAttributes != null) {
            int[] attributes = colorAttributes.getAttributes();
            if (attributes.length > 0) {
                int themeOverlay = colorAttributes.getThemeOverlay();
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributes);
                if (themeOverlay != 0) {
                    typedArray = new ContextThemeWrapper(context, themeOverlay).obtainStyledAttributes(attributes);
                } else {
                    typedArray = null;
                }
                m71660a(hashMap, obtainStyledAttributes, typedArray, color);
                obtainStyledAttributes.recycle();
                if (typedArray != null) {
                    typedArray.recycle();
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    private static boolean m71657d(int i) {
        if (28 <= i && i <= 31) {
            return true;
        }
        return false;
    }

    @ChecksSdkIntAtLeast(api = 30)
    public static boolean isHarmonizedColorAvailable() {
        if (Build.VERSION.SDK_INT >= 30) {
            return true;
        }
        return false;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull HarmonizedColorsOptions harmonizedColorsOptions) {
        if (!isHarmonizedColorAvailable()) {
            return context;
        }
        Map<Integer, Integer> m71658c = m71658c(context, harmonizedColorsOptions);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, harmonizedColorsOptions.m71656a(C16310R.C16317style.ThemeOverlay_Material3_HarmonizedColors_Empty));
        contextThemeWrapper.applyOverrideConfiguration(new Configuration());
        if (m71659b(contextThemeWrapper, m71658c)) {
            return contextThemeWrapper;
        }
        return context;
    }
}
