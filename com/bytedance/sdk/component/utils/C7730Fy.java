package com.bytedance.sdk.component.utils;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import java.lang.reflect.Method;

/* renamed from: com.bytedance.sdk.component.utils.Fy */
/* loaded from: classes3.dex */
public final class C7730Fy {

    /* renamed from: IL */
    private static String f16903IL;

    /* renamed from: bX */
    private static Resources f16904bX;
    @SuppressLint({"StaticFieldLeak"})

    /* renamed from: bg */
    private static Context f16905bg;
    private static String eqN;
    private static boolean ldr;

    /* renamed from: zx */
    private static boolean f16906zx;

    /* renamed from: IL */
    public static int m87924IL(Context context, String str) {
        return m87916bg(context, str, "string");
    }

    /* renamed from: Kg */
    public static int m87922Kg(Context context, String str) {
        return m87916bg(context, str, "color");
    }

    /* renamed from: WR */
    public static int m87921WR(Context context, String str) {
        return m87916bg(context, str, "anim");
    }

    /* renamed from: bX */
    public static Drawable m87919bX(Context context, String str) {
        try {
            return m87925IL(context).getDrawable(eqN(context, str));
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static void m87918bg(Context context) {
        f16905bg = context;
    }

    private static String eqN(Context context) {
        if (eqN == null) {
            eqN = context.getPackageName();
        }
        return eqN;
    }

    /* renamed from: iR */
    public static int m87913iR(Context context, String str) {
        return m87925IL(context).getColor(m87922Kg(context, str));
    }

    public static int ldr(Context context, String str) {
        return m87916bg(context, str, "style");
    }

    /* renamed from: zx */
    public static int m87912zx(Context context, String str) {
        return m87916bg(context, str, "id");
    }

    /* renamed from: IL */
    public static Resources m87925IL(Context context) {
        Resources resources = f16904bX;
        if (resources == null) {
            resources = null;
        }
        Context context2 = f16905bg;
        if (context2 != null) {
            resources = context2.getResources();
        }
        return resources == null ? context.getResources() : resources;
    }

    /* renamed from: bg */
    public static void m87914bg(String str) {
        eqN = str;
    }

    /* renamed from: bX */
    public static synchronized void m87920bX(Context context) {
        synchronized (C7730Fy.class) {
            try {
                if (TextUtils.isEmpty(f16903IL)) {
                    return;
                }
                Resources resources = context.getResources();
                f16904bX = new Resources(m87923IL(resources.getAssets(), f16903IL + "/apk/base-1.apk"), resources.getDisplayMetrics(), resources.getConfiguration());
                eqN = context.getPackageName();
                f16906zx = true;
            } catch (Throwable th) {
                Log.e("ResourceHelp", "makePluginResources failed", th);
            }
        }
    }

    /* renamed from: bg */
    private static int m87916bg(Context context, String str, String str2) {
        int identifier = m87925IL(context).getIdentifier(str, str2, eqN(context));
        if (identifier == 0) {
            if (!f16906zx) {
                m87920bX(context);
                return m87925IL(context).getIdentifier(str, str2, eqN(context));
            }
            return context.getResources().getIdentifier(str, str2, eqN(context));
        }
        return identifier;
    }

    public static int eqN(Context context, String str) {
        try {
            return m87916bg(context, str, "drawable");
        } catch (Exception unused) {
            return 0;
        }
    }

    /* renamed from: IL */
    private static AssetManager m87923IL(AssetManager assetManager, String str) {
        AssetManager assetManager2;
        try {
            if (assetManager.getClass().getName().equals("android.content.res.BaiduAssetManager")) {
                assetManager2 = (AssetManager) Class.forName("android.content.res.BaiduAssetManager").getConstructor(new Class[0]).newInstance(new Object[0]);
            } else {
                assetManager2 = (AssetManager) AssetManager.class.newInstance();
            }
            m87915bg(assetManager2, str);
            assetManager = assetManager2;
        } catch (Exception unused) {
            m87915bg(assetManager, str);
        }
        try {
            C7737Ja.m87899bg(assetManager, "ensureStringBlocks", new Object[0]);
        } catch (Exception unused2) {
        }
        return assetManager;
    }

    /* renamed from: bg */
    public static String m87917bg(Context context, String str) {
        return m87925IL(context).getString(m87924IL(context, str));
    }

    /* renamed from: bg */
    public static boolean m87915bg(AssetManager assetManager, String str) {
        Method m87900bg = C7737Ja.m87900bg((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        if (m87900bg == null) {
            m87900bg = C7737Ja.m87900bg((Class<?>) AssetManager.class, "addAssetPath", (Class<?>[]) new Class[]{String.class});
        }
        if (m87900bg != null) {
            int i = 3;
            while (true) {
                int i2 = i - 1;
                if (i < 0) {
                    break;
                } else if (((Integer) m87900bg.invoke(assetManager, str)).intValue() != 0) {
                    return true;
                } else {
                    i = i2;
                }
            }
        }
        return false;
    }
}
