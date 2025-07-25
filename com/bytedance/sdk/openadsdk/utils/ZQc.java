package com.bytedance.sdk.openadsdk.utils;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Outline;
import android.graphics.Picture;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.ViewParent;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.webkit.WebView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.amazon.p047a.p048a.p071o.KiwiConstants;
import com.bytedance.sdk.component.p233Kg.AbstractRunnableC7227Kg;
import com.bytedance.sdk.component.p238WR.C7268eqN;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.component.utils.C7754eqN;
import com.bytedance.sdk.openadsdk.core.C8838VzQ;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;
import com.bytedance.sdk.openadsdk.core.model.C8965rri;
import com.bytedance.sdk.openadsdk.core.p321Ta.p323bX.C8719bg;
import com.bytedance.sdk.openadsdk.core.widget.C9084xxp;
import com.bytedance.sdk.openadsdk.eqN.C9165bX;
import com.bytedance.sdk.openadsdk.yDt.p364bX.InterfaceC9627bg;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class ZQc {

    /* renamed from: IL */
    private static int f21263IL = -1;

    /* renamed from: Kg */
    private static Boolean f21264Kg = null;

    /* renamed from: WR */
    private static final Object f21265WR = new Object();

    /* renamed from: bX */
    private static float f21266bX = -1.0f;

    /* renamed from: bg */
    private static float f21267bg = -1.0f;
    private static int eqN = -1;

    /* renamed from: iR */
    private static float f21268iR = -1.0f;
    private static WindowManager ldr = null;

    /* renamed from: zx */
    private static int f21269zx = -1;

    /* renamed from: Kg */
    public static Pair<Integer, Integer> m82545Kg(Context context) {
        if (context == null) {
            context = C8838VzQ.m84740bg();
        }
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        return new Pair<>(Integer.valueOf(point.x), Integer.valueOf(point.y));
    }

    /* renamed from: Lq */
    public static boolean m82544Lq(Context context) {
        return context.getPackageManager().hasSystemFeature("com.oppo.feature.screen.heteromorphism");
    }

    /* renamed from: PX */
    public static boolean m82543PX(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("android.util.FtFeature");
            return ((Boolean) loadClass.getMethod("isFeatureSupport", Integer.TYPE).invoke(loadClass, 32)).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    /* renamed from: Ta */
    public static boolean m82542Ta(Context context) {
        String str = Build.MODEL;
        if (!str.equals("IN2010") && !str.equals("IN2020") && !str.equals("KB2000") && !str.startsWith("ONEPLUS")) {
            return false;
        }
        return true;
    }

    /* renamed from: VB */
    public static boolean m82541VB(Context context) {
        try {
            Class<?> loadClass = context.getClassLoader().loadClass("com.huawei.android.util.HwNotchSizeUtil");
            return ((Boolean) loadClass.getMethod("hasNotchInScreen", new Class[0]).invoke(loadClass, new Object[0])).booleanValue();
        } catch (ClassNotFoundException | NoSuchMethodException | Exception unused) {
            return false;
        }
    }

    /* renamed from: WR */
    public static int m82540WR(Context context) {
        return ((Integer) m82545Kg(context).second).intValue();
    }

    /* renamed from: bX */
    public static int m82537bX(Context context, float f) {
        return Float.valueOf(m82529bg(context, f, true)).intValue();
    }

    /* renamed from: bg */
    private static boolean m82533bg(int i) {
        return i == 0 || i == 8 || i == 4;
    }

    /* renamed from: eo */
    public static int m82510eo(Context context) {
        return ((Integer) m82545Kg(context).first).intValue();
    }

    public static int eqN(Context context, float f) {
        m82528bg(context, true);
        float m82507zx = m82507zx(context);
        if (m82507zx <= 0.0f) {
            m82507zx = 1.0f;
        }
        return (int) ((f / m82507zx) + 0.5f);
    }

    /* renamed from: iR */
    public static int m82509iR(Context context) {
        m82531bg(context);
        return f21263IL;
    }

    public static float ldr(Context context) {
        m82531bg(context);
        return f21266bX;
    }

    public static boolean yDt(Context context) {
        String str;
        try {
            Resources resources = context.getResources();
            int identifier = resources.getIdentifier("config_mainBuiltInDisplayCutout", "string", "android");
            if (identifier > 0) {
                str = resources.getString(identifier);
            } else {
                str = null;
            }
            if (str != null) {
                if (!TextUtils.isEmpty(str)) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    /* renamed from: zx */
    public static float m82507zx(Context context) {
        m82528bg(context, true);
        return f21267bg;
    }

    /* renamed from: IL */
    private static boolean m82554IL() {
        return f21267bg < 0.0f || f21263IL < 0 || f21266bX < 0.0f || eqN < 0 || f21269zx < 0;
    }

    /* renamed from: bX */
    public static int m82538bX(Context context) {
        m82531bg(context);
        return eqN;
    }

    /* renamed from: bg */
    public static void m82531bg(Context context) {
        m82528bg(context, false);
    }

    /* renamed from: IL */
    public static int m82551IL(Context context, float f) {
        m82531bg(context);
        float ldr2 = ldr(context);
        if (ldr2 <= 0.0f) {
            ldr2 = 1.0f;
        }
        return (int) ((f / ldr2) + 0.5f);
    }

    /* renamed from: bg */
    public static void m82528bg(Context context, boolean z) {
        Context m84740bg = context == null ? C8838VzQ.m84740bg() : context;
        if (m84740bg == null) {
            return;
        }
        ldr = (WindowManager) m84740bg.getSystemService("window");
        if (m82554IL() || z) {
            DisplayMetrics displayMetrics = m84740bg.getResources().getDisplayMetrics();
            f21267bg = displayMetrics.density;
            f21263IL = displayMetrics.densityDpi;
            f21266bX = displayMetrics.scaledDensity;
            eqN = displayMetrics.widthPixels;
            f21269zx = displayMetrics.heightPixels;
        }
        if (context == null || context.getResources() == null || context.getResources().getConfiguration() == null) {
            return;
        }
        if (context.getResources().getConfiguration().orientation == 1) {
            int i = eqN;
            int i2 = f21269zx;
            if (i > i2) {
                eqN = i2;
                f21269zx = i;
                return;
            }
            return;
        }
        int i3 = eqN;
        int i4 = f21269zx;
        if (i3 < i4) {
            eqN = i4;
            f21269zx = i3;
        }
    }

    public static int eqN(Context context) {
        m82531bg(context);
        return f21269zx;
    }

    /* renamed from: iR */
    public static void m82508iR(View view) {
        if (view == null) {
            return;
        }
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(view);
        }
    }

    public static void ldr(View view) {
        if (view == null) {
            return;
        }
        m82524bg(view, 0);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.2
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationStart(Animator animator) {
                super.onAnimationEnd(animator);
            }
        });
        ofFloat.setDuration(300L);
        ofFloat.start();
    }

    /* renamed from: zx */
    public static void m82506zx(View view) {
        if (view == null) {
            return;
        }
        final WeakReference weakReference = new WeakReference(view);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f);
        ofFloat.addListener(new AnimatorListenerAdapter() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.1
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public void onAnimationEnd(Animator animator) {
                super.onAnimationEnd(animator);
                View view2 = (View) weakReference.get();
                if (view2 != null) {
                    ZQc.m82524bg(view2, 8);
                    view2.setAlpha(1.0f);
                }
            }
        });
        ofFloat.setDuration(800L);
        ofFloat.start();
    }

    @Nullable
    /* renamed from: bX */
    public static int[] m82536bX(View view) {
        if (view != null) {
            return new int[]{view.getWidth(), view.getHeight()};
        }
        return null;
    }

    /* renamed from: IL */
    public static int[] m82552IL(Context context) {
        if (context == null) {
            return null;
        }
        if (ldr == null) {
            ldr = (WindowManager) C8838VzQ.m84740bg().getSystemService("window");
        }
        int[] iArr = new int[2];
        WindowManager windowManager = ldr;
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            DisplayMetrics displayMetrics = new DisplayMetrics();
            defaultDisplay.getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            try {
                Point point = new Point();
                Display.class.getMethod("getRealSize", Point.class).invoke(defaultDisplay, point);
                i = point.x;
                i2 = point.y;
            } catch (Exception unused) {
            }
            iArr[0] = i;
            iArr[1] = i2;
        }
        if (iArr[0] <= 0 || iArr[1] <= 0) {
            DisplayMetrics displayMetrics2 = context.getResources().getDisplayMetrics();
            iArr[0] = displayMetrics2.widthPixels;
            iArr[1] = displayMetrics2.heightPixels;
        }
        return iArr;
    }

    public static boolean eqN(View view) {
        return view != null && view.getVisibility() == 0;
    }

    /* renamed from: bX */
    public static boolean m82539bX(Activity activity) {
        if (f21264Kg == null) {
            synchronized (f21265WR) {
                if (f21264Kg == null) {
                    boolean z = true;
                    if (!eqN(activity) && m82511bg("ro.miui.notch", activity) != 1 && !m82541VB(activity) && !m82544Lq(activity) && !m82543PX(activity) && !m82542Ta(activity) && !yDt(activity)) {
                        z = false;
                    }
                    f21264Kg = Boolean.valueOf(z);
                }
            }
        }
        return f21264Kg.booleanValue();
    }

    public static boolean eqN(Activity activity) {
        if (Build.VERSION.SDK_INT >= 28) {
            try {
                WindowInsets rootWindowInsets = activity.getWindow().getDecorView().getRootWindowInsets();
                return (rootWindowInsets != null ? rootWindowInsets.getDisplayCutout() : null) != null;
            } catch (Exception e) {
                C7741PX.m87873bg("UIUtils", e.getMessage());
                return false;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: bX */
    public static void m82535bX(final AbstractC8967tuV abstractC8967tuV, String str, String str2, final Bitmap bitmap, final String str3, final long j) {
        if (bitmap != null) {
            try {
                if (bitmap.getWidth() > 0 && bitmap.getHeight() > 0 && !bitmap.isRecycled()) {
                    C9165bX.m83430bg(System.currentTimeMillis(), abstractC8967tuV, str, str2, new InterfaceC9627bg() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.4
                        @Override // com.bytedance.sdk.openadsdk.yDt.p364bX.InterfaceC9627bg
                        /* renamed from: bg */
                        public JSONObject mo82275bg() {
                            int i;
                            int i2;
                            try {
                                int m82527bg = ZQc.m82527bg(bitmap);
                                JSONObject jSONObject = new JSONObject();
                                jSONObject.put("url", str3);
                                long j2 = j;
                                if (j2 != -1) {
                                    jSONObject.put("page_id", j2);
                                }
                                jSONObject.put("render_type", "h5");
                                int i3 = 0;
                                jSONObject.put("render_type_2", 0);
                                if (m82527bg == 100) {
                                    i = 1;
                                } else {
                                    i = 0;
                                }
                                jSONObject.put("is_blank", i);
                                if (C8965rri.m84166IL(abstractC8967tuV)) {
                                    i2 = 1;
                                } else {
                                    i2 = 0;
                                }
                                jSONObject.put("is_playable", i2);
                                if (C8719bg.m85155bg().m85149bg(abstractC8967tuV)) {
                                    i3 = 1;
                                }
                                jSONObject.put("usecache", i3);
                                JSONObject jSONObject2 = new JSONObject();
                                try {
                                    jSONObject2.put("ad_extra_data", jSONObject.toString());
                                    return jSONObject2;
                                } catch (JSONException unused) {
                                    return jSONObject2;
                                }
                            } catch (JSONException unused2) {
                                return null;
                            }
                        }
                    });
                }
            } catch (Throwable th) {
                C7741PX.m87873bg("UIUtils", "(Developers can ignore this detection exception)checkWebViewIsTransparent->throwable ex>>>".concat(String.valueOf(th)));
            }
        }
    }

    /* renamed from: IL */
    public static int[] m82549IL(View view) {
        if (view != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return iArr;
        }
        return null;
    }

    /* renamed from: bg */
    public static float m82530bg(Context context, float f) {
        m82531bg(context);
        return f * ldr(context);
    }

    /* renamed from: IL */
    public static void m82553IL(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(1792);
            activity.getWindow().clearFlags(1792);
        } catch (Exception unused) {
        }
    }

    /* renamed from: bg */
    public static float m82529bg(Context context, float f, boolean z) {
        m82531bg(context);
        return (f * m82507zx(context)) + (z ? 0.5f : 0.0f);
    }

    /* renamed from: IL */
    private static Bitmap m82547IL(C7268eqN c7268eqN) {
        if (c7268eqN == null) {
            return null;
        }
        try {
            Bitmap createBitmap = Bitmap.createBitmap(c7268eqN.getWidth(), c7268eqN.getHeight(), Bitmap.Config.RGB_565);
            c7268eqN.draw(new Canvas(createBitmap));
            return createBitmap;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Nullable
    /* renamed from: bg */
    public static int[] m82526bg(View view) {
        if (view == null || view.getVisibility() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return iArr;
    }

    /* renamed from: bg */
    public static void m82524bg(View view, int i) {
        if (view == null || view.getVisibility() == i || !m82533bg(i)) {
            return;
        }
        view.setVisibility(i);
    }

    /* renamed from: bg */
    public static void m82515bg(TextView textView, CharSequence charSequence) {
        if (textView == null || TextUtils.isEmpty(charSequence)) {
            return;
        }
        textView.setText(charSequence);
    }

    /* renamed from: IL */
    private static ArrayList<Integer> m82550IL(Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        try {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            int i = width * height;
            int[] iArr = new int[i];
            bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i2 = 0; i2 < i; i2++) {
                int i3 = iArr[i2];
                arrayList.add(Integer.valueOf(Color.rgb((16711680 & i3) >> 16, (65280 & i3) >> 8, i3 & 255)));
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: bg */
    public static void m82523bg(View view, int i, int i2, int i3, int i4) {
        ViewGroup.LayoutParams layoutParams;
        if (view == null || (layoutParams = view.getLayoutParams()) == null || !(layoutParams instanceof ViewGroup.MarginLayoutParams)) {
            return;
        }
        m82520bg(view, (ViewGroup.MarginLayoutParams) layoutParams, i, i2, i3, i4);
    }

    /* renamed from: bg */
    private static void m82520bg(View view, ViewGroup.MarginLayoutParams marginLayoutParams, int i, int i2, int i3, int i4) {
        if (view == null || marginLayoutParams == null) {
            return;
        }
        if (marginLayoutParams.leftMargin == i && marginLayoutParams.topMargin == i2 && marginLayoutParams.rightMargin == i3 && marginLayoutParams.bottomMargin == i4) {
            return;
        }
        if (i != -3) {
            marginLayoutParams.leftMargin = i;
        }
        if (i2 != -3) {
            marginLayoutParams.topMargin = i2;
        }
        if (i3 != -3) {
            marginLayoutParams.rightMargin = i3;
        }
        if (i4 != -3) {
            marginLayoutParams.bottomMargin = i4;
        }
        view.setLayoutParams(marginLayoutParams);
    }

    /* renamed from: IL */
    public static void m82548IL(View view, final float f) {
        if (view != null && f > 0.0f) {
            view.setOutlineProvider(new ViewOutlineProvider() { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.5
                @Override // android.view.ViewOutlineProvider
                public void getOutline(View view2, Outline outline) {
                    if (outline == null) {
                        return;
                    }
                    outline.setRoundRect(0, 0, view2.getWidth(), view2.getHeight(), f);
                }
            });
            view.setClipToOutline(true);
        }
    }

    /* renamed from: bg */
    private static Bitmap m82519bg(WebView webView) {
        Bitmap bitmap = null;
        try {
            Picture capturePicture = webView.capturePicture();
            bitmap = Bitmap.createBitmap(capturePicture.getWidth(), capturePicture.getHeight(), Bitmap.Config.ARGB_8888);
            capturePicture.draw(new Canvas(bitmap));
            return bitmap;
        } catch (Throwable th) {
            C7741PX.m87873bg("UIUtils", th.getMessage());
            return bitmap;
        }
    }

    /* renamed from: bg */
    public static float m82534bg() {
        float f = f21268iR;
        if (f > 0.0f) {
            return f;
        }
        Resources resources = C8838VzQ.m84740bg().getResources();
        int identifier = resources.getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            float dimensionPixelSize = resources.getDimensionPixelSize(identifier);
            f21268iR = dimensionPixelSize;
            return dimensionPixelSize;
        }
        return 0.0f;
    }

    /* renamed from: bg */
    public static void m82532bg(Activity activity) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        try {
            activity.getWindow().getDecorView().setSystemUiVisibility(3846);
            activity.getWindow().addFlags(1792);
        } catch (Exception e) {
            C7741PX.m87873bg("UIUtils", e.getMessage());
        }
    }

    /* renamed from: bg */
    public static int m82511bg(String str, Activity activity) {
        if (JAA.m82638zx()) {
            try {
                Class<?> loadClass = activity.getClassLoader().loadClass(KiwiConstants.f2713ar);
                return ((Integer) loadClass.getMethod("getInt", String.class, Integer.TYPE).invoke(loadClass, new String(str), 0)).intValue();
            } catch (ClassNotFoundException e) {
                C7741PX.m87873bg("UIUtils", e.getMessage());
                return 0;
            } catch (IllegalAccessException e2) {
                C7741PX.m87873bg("UIUtils", e2.getMessage());
                return 0;
            } catch (IllegalArgumentException e3) {
                C7741PX.m87873bg("UIUtils", e3.getMessage());
                return 0;
            } catch (NoSuchMethodException e4) {
                C7741PX.m87873bg("UIUtils", e4.getMessage());
                return 0;
            } catch (InvocationTargetException e5) {
                C7741PX.m87873bg("UIUtils", e5.getMessage());
                return 0;
            }
        }
        return 0;
    }

    /* renamed from: bg */
    public static void m82522bg(View view, View.OnClickListener onClickListener, String str) {
        if (view == null) {
            C7741PX.m87873bg("OnclickListener ", str + " is null , can not set OnClickListener !!!");
            return;
        }
        view.setOnClickListener(onClickListener);
    }

    /* renamed from: bg */
    public static void m82521bg(View view, View.OnTouchListener onTouchListener, String str) {
        if (view == null) {
            C7741PX.m87873bg("OnTouchListener ", str + " is null , can not set OnTouchListener !!!");
            return;
        }
        view.setOnTouchListener(onTouchListener);
    }

    /* renamed from: bg */
    public static void m82525bg(View view, float f) {
        if (view == null) {
            return;
        }
        view.setAlpha(f);
    }

    /* renamed from: bg */
    public static void m82517bg(TextView textView, C9084xxp c9084xxp, AbstractC8967tuV abstractC8967tuV) {
        m82516bg(textView, c9084xxp, abstractC8967tuV, 14);
    }

    /* renamed from: bg */
    public static void m82516bg(TextView textView, C9084xxp c9084xxp, AbstractC8967tuV abstractC8967tuV, int i) {
        m82518bg(textView, c9084xxp, (abstractC8967tuV == null || abstractC8967tuV.RiO() == null) ? -1.0d : abstractC8967tuV.RiO().eqN(), i);
    }

    /* renamed from: bg */
    public static void m82518bg(TextView textView, C9084xxp c9084xxp, double d, int i) {
        if (d == -1.0d) {
            if (textView != null) {
                textView.setVisibility(8);
            }
            c9084xxp.setVisibility(8);
            return;
        }
        if (textView != null) {
            textView.setText(String.format(Locale.getDefault(), "%.1f", Double.valueOf(d)));
        }
        m82512bg(c9084xxp, d, i);
    }

    /* renamed from: bg */
    public static void m82512bg(C9084xxp c9084xxp, double d, int i) {
        if (d < 0.0d) {
            c9084xxp.setVisibility(8);
            return;
        }
        c9084xxp.setVisibility(0);
        c9084xxp.m83600bg(d, i);
    }

    /* renamed from: bg */
    public static Bitmap m82514bg(C7268eqN c7268eqN) {
        WebView webView = c7268eqN.getWebView();
        int layerType = webView.getLayerType();
        webView.setLayerType(1, null);
        Bitmap m82547IL = m82547IL(c7268eqN);
        if (m82547IL == null) {
            m82547IL = m82519bg(webView);
        }
        webView.setLayerType(layerType, null);
        if (m82547IL == null) {
            return null;
        }
        return C7754eqN.m87834bg(m82547IL, m82547IL.getWidth() / 6, m82547IL.getHeight() / 6);
    }

    /* renamed from: bg */
    public static void m82513bg(final AbstractC8967tuV abstractC8967tuV, final String str, final String str2, final Bitmap bitmap, final String str3, final long j) {
        C9519VJ.m82590IL(new AbstractRunnableC7227Kg("startCheckPlayableStatusPercentage") { // from class: com.bytedance.sdk.openadsdk.utils.ZQc.3
            @Override // java.lang.Runnable
            public void run() {
                ZQc.m82535bX(abstractC8967tuV, str, str2, bitmap, str3, j);
            }
        }, 10);
    }

    /* renamed from: bg */
    public static int m82527bg(Bitmap bitmap) {
        try {
            ArrayList<Integer> m82550IL = m82550IL(bitmap);
            if (m82550IL == null) {
                return -1;
            }
            HashMap hashMap = new HashMap();
            Iterator<Integer> it = m82550IL.iterator();
            while (it.hasNext()) {
                Integer next = it.next();
                if (hashMap.containsKey(next)) {
                    Integer valueOf = Integer.valueOf(((Integer) hashMap.get(next)).intValue() + 1);
                    hashMap.remove(next);
                    hashMap.put(next, valueOf);
                } else {
                    hashMap.put(next, 1);
                }
            }
            int i = 0;
            int i2 = 0;
            for (Map.Entry entry : hashMap.entrySet()) {
                int intValue = ((Integer) entry.getValue()).intValue();
                if (i2 < intValue) {
                    i = ((Integer) entry.getKey()).intValue();
                    i2 = intValue;
                }
            }
            if (i == 0) {
                return -1;
            }
            return (int) ((i2 / ((bitmap.getWidth() * bitmap.getHeight()) * 1.0f)) * 100.0f);
        } catch (Throwable unused) {
            return -1;
        }
    }
}
