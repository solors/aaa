package com.yandex.mobile.ads.impl;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.yandex.mobile.ads.impl.xd */
/* loaded from: classes8.dex */
public final class C31810xd {

    /* renamed from: j */
    private static final RectF f87639j = new RectF();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: k */
    private static ConcurrentHashMap<String, Method> f87640k = new ConcurrentHashMap<>();
    @SuppressLint({"BanConcurrentHashMap"})

    /* renamed from: l */
    private static ConcurrentHashMap<String, Field> f87641l = new ConcurrentHashMap<>();

    /* renamed from: a */
    private int f87642a = 0;

    /* renamed from: b */
    private boolean f87643b = false;

    /* renamed from: c */
    private float f87644c = -1.0f;

    /* renamed from: d */
    private float f87645d = -1.0f;

    /* renamed from: e */
    private int[] f87646e = new int[0];

    /* renamed from: f */
    private TextPaint f87647f;
    @NonNull

    /* renamed from: g */
    private final TextView f87648g;

    /* renamed from: h */
    private final Context f87649h;

    /* renamed from: i */
    private final C31813c f87650i;

    @RequiresApi(23)
    /* renamed from: com.yandex.mobile.ads.impl.xd$a */
    /* loaded from: classes8.dex */
    private static class C31811a extends C31813c {
        C31811a() {
        }

        @Override // com.yandex.mobile.ads.impl.C31810xd.C31813c
        /* renamed from: a */
        void mo27562a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) C31810xd.m27566a((Object) textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    @RequiresApi(29)
    /* renamed from: com.yandex.mobile.ads.impl.xd$b */
    /* loaded from: classes8.dex */
    private static class C31812b extends C31811a {
        C31812b() {
        }

        @Override // com.yandex.mobile.ads.impl.C31810xd.C31811a, com.yandex.mobile.ads.impl.C31810xd.C31813c
        /* renamed from: a */
        final void mo27562a(StaticLayout.Builder builder, TextView textView) {
            TextDirectionHeuristic textDirectionHeuristic;
            textDirectionHeuristic = textView.getTextDirectionHeuristic();
            builder.setTextDirection(textDirectionHeuristic);
        }

        @Override // com.yandex.mobile.ads.impl.C31810xd.C31813c
        /* renamed from: a */
        final boolean mo27561a(TextView textView) {
            boolean isHorizontallyScrollable;
            isHorizontallyScrollable = textView.isHorizontallyScrollable();
            return isHorizontallyScrollable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.xd$c */
    /* loaded from: classes8.dex */
    public static class C31813c {
        C31813c() {
        }

        /* renamed from: a */
        void mo27562a(StaticLayout.Builder builder, TextView textView) {
        }

        /* renamed from: a */
        boolean mo27561a(TextView textView) {
            return ((Boolean) C31810xd.m27566a((Object) textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public C31810xd(@NonNull TextView textView) {
        this.f87648g = textView;
        this.f87649h = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f87650i = new C31812b();
        } else {
            this.f87650i = new C31811a();
        }
    }

    /* renamed from: a */
    private static Object m27567a(@NonNull TextView textView, @NonNull String str, @NonNull Object obj) {
        try {
            Field m27565a = m27565a(str);
            return m27565a == null ? obj : m27565a.get(textView);
        } catch (IllegalAccessException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return obj;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: b */
    public final boolean m27564b() {
        return ((this.f87648g instanceof EditText) ^ true) && this.f87642a != 0;
    }

    @Nullable
    /* renamed from: b */
    private static Method m27563b(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Method> concurrentHashMap = f87640k;
            Method method = concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, new Class[0])) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e);
            return null;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public final void m27571a() {
        if (m27564b()) {
            if (this.f87643b) {
                if (this.f87648g.getMeasuredHeight() <= 0 || this.f87648g.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f87650i.mo27561a(this.f87648g) ? 1048576 : (this.f87648g.getMeasuredWidth() - this.f87648g.getTotalPaddingLeft()) - this.f87648g.getTotalPaddingRight();
                int height = (this.f87648g.getHeight() - this.f87648g.getCompoundPaddingBottom()) - this.f87648g.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f87639j;
                synchronized (rectF) {
                    rectF.setEmpty();
                    rectF.right = measuredWidth;
                    rectF.bottom = height;
                    float m27568a = m27568a(rectF);
                    if (m27568a != this.f87648g.getTextSize()) {
                        m27569a(0, m27568a);
                    }
                }
            }
            this.f87643b = true;
        }
    }

    /* renamed from: a */
    private int m27568a(RectF rectF) {
        CharSequence transformation;
        int length = this.f87646e.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.f87646e[i4];
                CharSequence text = this.f87648g.getText();
                TransformationMethod transformationMethod = this.f87648g.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f87648g)) != null) {
                    text = transformation;
                }
                int maxLines = this.f87648g.getMaxLines();
                TextPaint textPaint = this.f87647f;
                if (textPaint == null) {
                    this.f87647f = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.f87647f.set(this.f87648g.getPaint());
                this.f87647f.setTextSize(i5);
                StaticLayout.Builder obtain = StaticLayout.Builder.obtain(text, 0, text.length(), this.f87647f, Math.round(rectF.right));
                obtain.setAlignment((Layout.Alignment) m27566a((Object) this.f87648g, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL)).setLineSpacing(this.f87648g.getLineSpacingExtra(), this.f87648g.getLineSpacingMultiplier()).setIncludePad(this.f87648g.getIncludeFontPadding()).setBreakStrategy(this.f87648g.getBreakStrategy()).setHyphenationFrequency(this.f87648g.getHyphenationFrequency()).setMaxLines(maxLines == -1 ? Integer.MAX_VALUE : maxLines);
                try {
                    this.f87650i.mo27562a(obtain, this.f87648g);
                } catch (ClassCastException unused) {
                    Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
                }
                StaticLayout build = obtain.build();
                if ((maxLines == -1 || (build.getLineCount() <= maxLines && build.getLineEnd(build.getLineCount() - 1) == text.length())) && build.getHeight() <= rectF.bottom) {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                } else {
                    i3 = i4 - 1;
                    i = i3;
                }
            }
            return this.f87646e[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    /* renamed from: a */
    static <T> T m27566a(@NonNull Object obj, @NonNull String str, @NonNull T t) {
        try {
            return (T) m27563b(str).invoke(obj, new Object[0]);
        } catch (Exception e) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e);
            return t;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public final void m27570a(int i) {
        if (!(this.f87648g instanceof EditText)) {
            if (i == 0) {
                this.f87642a = 0;
                this.f87645d = -1.0f;
                this.f87644c = -1.0f;
                this.f87646e = new int[0];
                this.f87643b = false;
            } else if (i == 1) {
                DisplayMetrics displayMetrics = this.f87649h.getResources().getDisplayMetrics();
                float applyDimension = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                float applyDimension2 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                if (applyDimension <= 0.0f) {
                    throw new IllegalArgumentException("Minimum auto-size text size (" + applyDimension + "px) is less or equal to (0px)");
                } else if (applyDimension2 > applyDimension) {
                    this.f87642a = 1;
                    this.f87645d = applyDimension;
                    this.f87644c = 1.0f;
                    if (!(this.f87648g instanceof EditText)) {
                        int floor = ((int) Math.floor((applyDimension2 - applyDimension) / 1.0f)) + 1;
                        int[] iArr = new int[floor];
                        for (int i2 = 0; i2 < floor; i2++) {
                            iArr[i2] = Math.round((i2 * this.f87644c) + this.f87645d);
                        }
                        if (floor != 0) {
                            Arrays.sort(iArr);
                            ArrayList arrayList = new ArrayList();
                            for (int i3 = 0; i3 < floor; i3++) {
                                int i4 = iArr[i3];
                                if (i4 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i4)) < 0) {
                                    arrayList.add(Integer.valueOf(i4));
                                }
                            }
                            if (floor != arrayList.size()) {
                                int size = arrayList.size();
                                iArr = new int[size];
                                for (int i5 = 0; i5 < size; i5++) {
                                    iArr[i5] = ((Integer) arrayList.get(i5)).intValue();
                                }
                            }
                        }
                        this.f87646e = iArr;
                        this.f87643b = true;
                    } else {
                        this.f87643b = false;
                    }
                    if (this.f87643b) {
                        m27571a();
                    }
                } else {
                    throw new IllegalArgumentException("Maximum auto-size text size (" + applyDimension2 + "px) is less or equal to minimum auto-size text size (" + applyDimension + "px)");
                }
            } else {
                throw new IllegalArgumentException(C31736wd.m27978a("Unknown auto-size text type: ", i));
            }
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    /* renamed from: a */
    public final void m27569a(int i, float f) {
        Resources resources;
        Context context = this.f87649h;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        if (applyDimension != this.f87648g.getPaint().getTextSize()) {
            this.f87648g.getPaint().setTextSize(applyDimension);
            boolean isInLayout = this.f87648g.isInLayout();
            if (this.f87648g.getLayout() != null) {
                this.f87643b = false;
                try {
                    Method m27563b = m27563b("nullLayouts");
                    if (m27563b != null) {
                        m27563b.invoke(this.f87648g, new Object[0]);
                    }
                } catch (Exception e) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e);
                }
                if (!isInLayout) {
                    this.f87648g.requestLayout();
                } else {
                    this.f87648g.forceLayout();
                }
                this.f87648g.invalidate();
            }
        }
    }

    @Nullable
    /* renamed from: a */
    private static Field m27565a(@NonNull String str) {
        try {
            ConcurrentHashMap<String, Field> concurrentHashMap = f87641l;
            Field field = concurrentHashMap.get(str);
            if (field == null && (field = TextView.class.getDeclaredField(str)) != null) {
                field.setAccessible(true);
                concurrentHashMap.put(str, field);
            }
            return field;
        } catch (NoSuchFieldException e) {
            Log.w("ACTVAutoSizeHelper", "Failed to access TextView#" + str + " member", e);
            return null;
        }
    }
}
