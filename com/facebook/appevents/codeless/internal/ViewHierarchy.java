package com.facebook.appevents.codeless.internal;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.annotation.RestrictTo;
import androidx.compose.p015ui.platform.AndroidComposeViewAccessibilityDelegateCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.Utility;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import java.io.ByteArrayOutputStream;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ViewHierarchy.kt */
@Metadata
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes2.dex */
public final class ViewHierarchy {
    @NotNull
    private static final String CLASS_RCTROOTVIEW = "com.facebook.react.ReactRootView";
    @NotNull
    private static final String CLASS_RCTVIEWGROUP = "com.facebook.react.views.view.ReactViewGroup";
    @NotNull
    private static final String CLASS_TOUCHTARGETHELPER = "com.facebook.react.uimanager.TouchTargetHelper";
    private static final int ICON_MAX_EDGE_LENGTH = 44;
    @NotNull
    private static final String METHOD_FIND_TOUCHTARGET_VIEW = "findTouchTargetView";
    @Nullable
    private static Method methodFindTouchTargetView;
    @NotNull
    public static final ViewHierarchy INSTANCE = new ViewHierarchy();
    private static final String TAG = ViewHierarchy.class.getCanonicalName();
    @NotNull
    private static WeakReference<View> RCTRootViewReference = new WeakReference<>(null);

    private ViewHierarchy() {
    }

    @Nullable
    public static final View findRCTRootView(@Nullable View view) {
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return null;
        }
        while (view != null) {
            try {
                if (INSTANCE.isRCTRootView(view)) {
                    return view;
                }
                ViewParent parent = view.getParent();
                if (!(parent instanceof View)) {
                    break;
                }
                view = (View) parent;
            } catch (Throwable th) {
                CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            }
        }
        return null;
    }

    @NotNull
    public static final List<View> getChildrenOfView(@Nullable View view) {
        int childCount;
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return null;
        }
        try {
            ArrayList arrayList = new ArrayList();
            if ((view instanceof ViewGroup) && (childCount = ((ViewGroup) view).getChildCount()) > 0) {
                int i = 0;
                while (true) {
                    int i2 = i + 1;
                    arrayList.add(((ViewGroup) view).getChildAt(i));
                    if (i2 >= childCount) {
                        break;
                    }
                    i = i2;
                }
            }
            return arrayList;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return null;
        }
    }

    public static final int getClassTypeBitmask(@NotNull View view) {
        int i;
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return 0;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (view instanceof ImageView) {
                i = 2;
            } else {
                i = 0;
            }
            if (view.isClickable()) {
                i |= 32;
            }
            if (isAdapterViewItem(view)) {
                i |= 512;
            }
            if (view instanceof TextView) {
                int i2 = i | 1024 | 1;
                if (view instanceof Button) {
                    i2 |= 4;
                    if (view instanceof Switch) {
                        i2 |= 8192;
                    } else if (view instanceof CheckBox) {
                        i2 |= 32768;
                    }
                }
                if (view instanceof EditText) {
                    return i2 | 2048;
                }
                return i2;
            }
            if (!(view instanceof Spinner) && !(view instanceof DatePicker)) {
                if (view instanceof RatingBar) {
                    return i | 65536;
                }
                if (view instanceof RadioGroup) {
                    return i | 16384;
                }
                if ((view instanceof ViewGroup) && INSTANCE.isRCTButton(view, RCTRootViewReference.get())) {
                    return i | 64;
                }
                return i;
            }
            return i | 4096;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return 0;
        }
    }

    @NotNull
    public static final JSONObject getDictionaryOfView(@NotNull View view) {
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return null;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (Intrinsics.m17075f(view.getClass().getName(), CLASS_RCTROOTVIEW)) {
                RCTRootViewReference = new WeakReference<>(view);
            }
            JSONObject jSONObject = new JSONObject();
            try {
                updateBasicInfoOfView(view, jSONObject);
                JSONArray jSONArray = new JSONArray();
                List<View> childrenOfView = getChildrenOfView(view);
                int size = childrenOfView.size() - 1;
                if (size >= 0) {
                    int i = 0;
                    while (true) {
                        int i2 = i + 1;
                        jSONArray.put(getDictionaryOfView(childrenOfView.get(i)));
                        if (i2 > size) {
                            break;
                        }
                        i = i2;
                    }
                }
                jSONObject.put(ViewHierarchyConstants.CHILDREN_VIEW_KEY, jSONArray);
            } catch (JSONException e) {
                Log.e(TAG, "Failed to create JSONObject for view.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return null;
        }
    }

    private final JSONObject getDimensionOfView(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(ViewHierarchyConstants.DIMENSION_TOP_KEY, view.getTop());
                jSONObject.put("left", view.getLeft());
                jSONObject.put("width", view.getWidth());
                jSONObject.put("height", view.getHeight());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_SCROLL_X_KEY, view.getScrollX());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_SCROLL_Y_KEY, view.getScrollY());
                jSONObject.put(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, view.getVisibility());
            } catch (JSONException e) {
                Log.e(TAG, "Failed to create JSONObject for dimension.", e);
            }
            return jSONObject;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final Class<?> getExistingClass(String str) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    @Nullable
    public static final View.OnClickListener getExistingOnClickListener(@Nullable View view) {
        Field declaredField;
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return null;
        }
        try {
            Field declaredField2 = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
            if (declaredField2 != null) {
                declaredField2.setAccessible(true);
            }
            Object obj = declaredField2.get(view);
            if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener")) == null) {
                return null;
            }
            declaredField.setAccessible(true);
            Object obj2 = declaredField.get(obj);
            if (obj2 != null) {
                return (View.OnClickListener) obj2;
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnClickListener");
        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException unused) {
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return null;
        }
    }

    @Nullable
    public static final View.OnTouchListener getExistingOnTouchListener(@Nullable View view) {
        Field declaredField;
        try {
            if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
                return null;
            }
            try {
                try {
                    Field declaredField2 = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
                    if (declaredField2 != null) {
                        declaredField2.setAccessible(true);
                    }
                    Object obj = declaredField2.get(view);
                    if (obj == null || (declaredField = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnTouchListener")) == null) {
                        return null;
                    }
                    declaredField.setAccessible(true);
                    Object obj2 = declaredField.get(obj);
                    if (obj2 != null) {
                        return (View.OnTouchListener) obj2;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View.OnTouchListener");
                } catch (ClassNotFoundException e) {
                    Utility utility = Utility.INSTANCE;
                    Utility.logd(TAG, e);
                    return null;
                } catch (NoSuchFieldException e2) {
                    Utility utility2 = Utility.INSTANCE;
                    Utility.logd(TAG, e2);
                    return null;
                }
            } catch (IllegalAccessException e3) {
                Utility utility3 = Utility.INSTANCE;
                Utility.logd(TAG, e3);
                return null;
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return null;
        }
    }

    @NotNull
    public static final String getHintOfView(@Nullable View view) {
        CharSequence charSequence;
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return null;
        }
        try {
            if (view instanceof EditText) {
                charSequence = ((EditText) view).getHint();
            } else if (view instanceof TextView) {
                charSequence = ((TextView) view).getHint();
            } else {
                charSequence = null;
            }
            if (charSequence == null) {
                return "";
            }
            String obj = charSequence.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return null;
        }
    }

    @Nullable
    public static final ViewGroup getParentOfView(@Nullable View view) {
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class) || view == null) {
            return null;
        }
        try {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                return null;
            }
            return (ViewGroup) parent;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return null;
        }
    }

    @NotNull
    public static final String getTextOfView(@Nullable View view) {
        CharSequence valueOf;
        Object selectedItem;
        String str;
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return null;
        }
        try {
            if (view instanceof TextView) {
                valueOf = ((TextView) view).getText();
                if (view instanceof Switch) {
                    if (((Switch) view).isChecked()) {
                        str = "1";
                    } else {
                        str = "0";
                    }
                    valueOf = str;
                }
            } else if (view instanceof Spinner) {
                if (((Spinner) view).getCount() > 0 && (selectedItem = ((Spinner) view).getSelectedItem()) != null) {
                    valueOf = selectedItem.toString();
                }
                valueOf = null;
            } else {
                int i = 0;
                if (view instanceof DatePicker) {
                    int year = ((DatePicker) view).getYear();
                    int month = ((DatePicker) view).getMonth();
                    int dayOfMonth = ((DatePicker) view).getDayOfMonth();
                    C37612s0 c37612s0 = C37612s0.f99333a;
                    valueOf = String.format("%04d-%02d-%02d", Arrays.copyOf(new Object[]{Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(dayOfMonth)}, 3));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof TimePicker) {
                    Integer currentHour = ((TimePicker) view).getCurrentHour();
                    Intrinsics.checkNotNullExpressionValue(currentHour, "view.currentHour");
                    int intValue = currentHour.intValue();
                    Integer currentMinute = ((TimePicker) view).getCurrentMinute();
                    Intrinsics.checkNotNullExpressionValue(currentMinute, "view.currentMinute");
                    int intValue2 = currentMinute.intValue();
                    C37612s0 c37612s02 = C37612s0.f99333a;
                    valueOf = String.format("%02d:%02d", Arrays.copyOf(new Object[]{Integer.valueOf(intValue), Integer.valueOf(intValue2)}, 2));
                    Intrinsics.checkNotNullExpressionValue(valueOf, "java.lang.String.format(format, *args)");
                } else if (view instanceof RadioGroup) {
                    int checkedRadioButtonId = ((RadioGroup) view).getCheckedRadioButtonId();
                    int childCount = ((RadioGroup) view).getChildCount();
                    if (childCount > 0) {
                        while (true) {
                            int i2 = i + 1;
                            View childAt = ((RadioGroup) view).getChildAt(i);
                            if (childAt.getId() == checkedRadioButtonId && (childAt instanceof RadioButton)) {
                                valueOf = ((RadioButton) childAt).getText();
                                break;
                            } else if (i2 >= childCount) {
                                break;
                            } else {
                                i = i2;
                            }
                        }
                    }
                    valueOf = null;
                } else {
                    if (view instanceof RatingBar) {
                        valueOf = String.valueOf(((RatingBar) view).getRating());
                    }
                    valueOf = null;
                }
            }
            if (valueOf == null) {
                return "";
            }
            String obj = valueOf.toString();
            if (obj == null) {
                return "";
            }
            return obj;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return null;
        }
    }

    private final View getTouchReactView(float[] fArr, View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            initTouchTargetHelperMethods();
            Method method = methodFindTouchTargetView;
            if (method != null && view != null) {
                try {
                    if (method != null) {
                        Object invoke = method.invoke(null, fArr, view);
                        if (invoke != null) {
                            View view2 = (View) invoke;
                            if (view2.getId() > 0) {
                                ViewParent parent = view2.getParent();
                                if (parent != null) {
                                    return (View) parent;
                                }
                                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.".toString());
                    }
                } catch (IllegalAccessException e) {
                    Utility utility = Utility.INSTANCE;
                    Utility.logd(TAG, e);
                } catch (InvocationTargetException e2) {
                    Utility utility2 = Utility.INSTANCE;
                    Utility.logd(TAG, e2);
                }
            }
            return null;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final float[] getViewLocationOnScreen(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return null;
        }
        try {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            return new float[]{iArr[0], iArr[1]};
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return null;
        }
    }

    private final void initTouchTargetHelperMethods() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (methodFindTouchTargetView != null) {
                return;
            }
            try {
                Method declaredMethod = Class.forName(CLASS_TOUCHTARGETHELPER).getDeclaredMethod(METHOD_FIND_TOUCHTARGET_VIEW, float[].class, ViewGroup.class);
                methodFindTouchTargetView = declaredMethod;
                if (declaredMethod != null) {
                    declaredMethod.setAccessible(true);
                    return;
                }
                throw new IllegalStateException("Required value was null.".toString());
            } catch (ClassNotFoundException e) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, e);
            } catch (NoSuchMethodException e2) {
                Utility utility2 = Utility.INSTANCE;
                Utility.logd(TAG, e2);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private static final boolean isAdapterViewItem(View view) {
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return false;
        }
        try {
            ViewParent parent = view.getParent();
            if (parent instanceof AdapterView) {
                return true;
            }
            ViewHierarchy viewHierarchy = INSTANCE;
            Class<?> existingClass = viewHierarchy.getExistingClass("android.support.v4.view.NestedScrollingChild");
            if (existingClass != null && existingClass.isInstance(parent)) {
                return true;
            }
            Class<?> existingClass2 = viewHierarchy.getExistingClass("androidx.core.view.NestedScrollingChild");
            if (existingClass2 == null) {
                return false;
            }
            if (!existingClass2.isInstance(parent)) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
            return false;
        }
    }

    private final boolean isRCTRootView(View view) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            return Intrinsics.m17075f(view.getClass().getName(), CLASS_RCTROOTVIEW);
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }

    public static final void setOnClickListener(@NotNull View view, @Nullable View.OnClickListener onClickListener) {
        Field field;
        Field field2;
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Object obj = null;
            try {
                try {
                    field = Class.forName(AndroidComposeViewAccessibilityDelegateCompat.ClassName).getDeclaredField("mListenerInfo");
                    try {
                        field2 = Class.forName("android.view.View$ListenerInfo").getDeclaredField("mOnClickListener");
                    } catch (ClassNotFoundException | NoSuchFieldException unused) {
                        field2 = null;
                        if (field == null) {
                        }
                        view.setOnClickListener(onClickListener);
                    }
                } catch (ClassNotFoundException | NoSuchFieldException unused2) {
                    field = null;
                }
                if (field == null && field2 != null) {
                    field.setAccessible(true);
                    field2.setAccessible(true);
                    try {
                        field.setAccessible(true);
                        obj = field.get(view);
                    } catch (IllegalAccessException unused3) {
                    }
                    if (obj == null) {
                        view.setOnClickListener(onClickListener);
                        return;
                    } else {
                        field2.set(obj, onClickListener);
                        return;
                    }
                }
                view.setOnClickListener(onClickListener);
            } catch (Exception unused4) {
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
        }
    }

    public static final void updateAppearanceOfView(@NotNull View view, @NotNull JSONObject json, float f) {
        Bitmap bitmap;
        Typeface typeface;
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                JSONObject jSONObject = new JSONObject();
                if ((view instanceof TextView) && (typeface = ((TextView) view).getTypeface()) != null) {
                    jSONObject.put(ViewHierarchyConstants.TEXT_SIZE, ((TextView) view).getTextSize());
                    jSONObject.put(ViewHierarchyConstants.TEXT_IS_BOLD, typeface.isBold());
                    jSONObject.put(ViewHierarchyConstants.TEXT_IS_ITALIC, typeface.isItalic());
                    json.put(ViewHierarchyConstants.TEXT_STYLE, jSONObject);
                }
                if (view instanceof ImageView) {
                    Drawable drawable = ((ImageView) view).getDrawable();
                    if (drawable instanceof BitmapDrawable) {
                        float f2 = 44;
                        if (view.getHeight() / f <= f2 && view.getWidth() / f <= f2 && (bitmap = ((BitmapDrawable) drawable).getBitmap()) != null) {
                            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
                            json.put(ViewHierarchyConstants.ICON_BITMAP, Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0));
                        }
                    }
                }
            } catch (JSONException e) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, e);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
        }
    }

    public static final void updateBasicInfoOfView(@NotNull View view, @NotNull JSONObject json) {
        if (CrashShieldHandler.isObjectCrashing(ViewHierarchy.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(json, "json");
            try {
                String textOfView = getTextOfView(view);
                String hintOfView = getHintOfView(view);
                Object tag = view.getTag();
                CharSequence contentDescription = view.getContentDescription();
                json.put(ViewHierarchyConstants.CLASS_NAME_KEY, view.getClass().getCanonicalName());
                json.put(ViewHierarchyConstants.CLASS_TYPE_BITMASK_KEY, getClassTypeBitmask(view));
                json.put("id", view.getId());
                if (!SensitiveUserDataUtils.isSensitiveUserData(view)) {
                    json.put("text", Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(textOfView), ""));
                } else {
                    json.put("text", "");
                    json.put(ViewHierarchyConstants.IS_USER_INPUT_KEY, true);
                }
                json.put(ViewHierarchyConstants.HINT_KEY, Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(hintOfView), ""));
                if (tag != null) {
                    json.put("tag", Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(tag.toString()), ""));
                }
                if (contentDescription != null) {
                    json.put("description", Utility.coerceValueIfNullOrEmpty(Utility.sha256hash(contentDescription.toString()), ""));
                }
                json.put(ViewHierarchyConstants.DIMENSION_KEY, INSTANCE.getDimensionOfView(view));
            } catch (JSONException e) {
                Utility utility = Utility.INSTANCE;
                Utility.logd(TAG, e);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ViewHierarchy.class);
        }
    }

    public final boolean isRCTButton(@NotNull View view, @Nullable View view2) {
        View touchReactView;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return false;
        }
        try {
            Intrinsics.checkNotNullParameter(view, "view");
            if (!Intrinsics.m17075f(view.getClass().getName(), CLASS_RCTVIEWGROUP) || (touchReactView = getTouchReactView(getViewLocationOnScreen(view), view2)) == null) {
                return false;
            }
            if (touchReactView.getId() != view.getId()) {
                return false;
            }
            return true;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
            return false;
        }
    }
}
