package com.mbridge.msdk.dycreator.p417a;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.view.ViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.ironsource.C20517nb;
import com.mbridge.msdk.dycreator.baseview.GradientOrientationUtils;
import com.mbridge.msdk.dycreator.p422e.BufferViewUtil;
import com.mbridge.msdk.dycreator.p422e.C21890g;
import com.mbridge.msdk.dycreator.p422e.DensityUtil;
import com.mbridge.msdk.foundation.controller.MBSDKContext;
import com.mbridge.msdk.foundation.tools.ResourceUtil;
import com.mbridge.msdk.foundation.tools.SameLogTool;
import io.appmetrica.analytics.impl.C33933H2;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.lang.reflect.Field;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: com.mbridge.msdk.dycreator.a.b */
/* loaded from: classes6.dex */
public class MBResource {

    /* renamed from: g */
    private static volatile MBResource f55494g;

    /* renamed from: a */
    private SoftReference<HashMap<String, SystemParamValue>> f55495a;

    /* renamed from: b */
    private SoftReference<HashMap<String, String>> f55496b;

    /* renamed from: c */
    private SoftReference<HashMap<String, SystemParamValue>> f55497c;

    /* renamed from: d */
    private String f55498d;

    /* renamed from: e */
    private String f55499e;

    /* renamed from: f */
    private Context f55500f;

    private MBResource() {
    }

    /* renamed from: a */
    public static MBResource m53054a() {
        if (f55494g == null) {
            synchronized (MBResource.class) {
                if (f55494g == null) {
                    f55494g = new MBResource();
                }
            }
        }
        return f55494g;
    }

    /* renamed from: b */
    public final HashMap m53048b() {
        SoftReference<HashMap<String, SystemParamValue>> softReference = this.f55495a;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap(45);
            hashMap.put("layout_width", SystemParamValue.layout_width);
            hashMap.put("layout_height", SystemParamValue.layout_height);
            hashMap.put("orientation", SystemParamValue.orientation);
            hashMap.put("layout_centerHorizontal", SystemParamValue.layout_centerHorizontal);
            hashMap.put("layout_centerVertical", SystemParamValue.layout_centerVertical);
            SystemParamValue systemParamValue = SystemParamValue.layout_marginLeft;
            hashMap.put("layout_marginLeft", systemParamValue);
            SystemParamValue systemParamValue2 = SystemParamValue.layout_marginRight;
            hashMap.put("layout_marginRight", systemParamValue2);
            hashMap.put("layout_margin", SystemParamValue.layout_margin);
            hashMap.put("layout_gravity", SystemParamValue.layout_gravity);
            hashMap.put("layout_alignParentRight", SystemParamValue.layout_alignParentRight);
            hashMap.put("layout_weight", SystemParamValue.layout_weight);
            hashMap.put("contentDescription", SystemParamValue.contentDescription);
            hashMap.put("gravity", SystemParamValue.gravity);
            hashMap.put("id", SystemParamValue.id);
            hashMap.put("layout_below", SystemParamValue.layout_below);
            hashMap.put("layout_above", SystemParamValue.layout_above);
            hashMap.put("layout_toLeftOf", SystemParamValue.layout_toLeftOf);
            hashMap.put("layout_toRightOf", SystemParamValue.layout_toRightOf);
            hashMap.put("layout_toEndOf", SystemParamValue.layout_toEndOf);
            hashMap.put(C33933H2.f92945g, SystemParamValue.background);
            hashMap.put("layout_marginTop", SystemParamValue.layout_marginTop);
            hashMap.put("layout_marginBottom", SystemParamValue.layout_marginBottom);
            hashMap.put("layout_marginLeft", systemParamValue);
            hashMap.put("layout_marginRight", systemParamValue2);
            hashMap.put("layout_alignParentBottom", SystemParamValue.layout_alignParentBottom);
            hashMap.put("layout_alignParentTop", SystemParamValue.layout_alignParentTop);
            hashMap.put("layout_alignParentLeft", SystemParamValue.layout_alignParentLeft);
            hashMap.put("layout_alignWithParentIfMissing", SystemParamValue.layout_alignWithParentIfMissing);
            hashMap.put("layout_alignTop", SystemParamValue.layout_alignTop);
            hashMap.put("layout_alignBottom", SystemParamValue.layout_alignBottom);
            hashMap.put("layout_alignLeft", SystemParamValue.layout_alignLeft);
            hashMap.put("layout_alignRight", SystemParamValue.layout_alignRight);
            hashMap.put("layout_centerInParent", SystemParamValue.layout_centerInParent);
            hashMap.put("layout_alignParentEnd", SystemParamValue.layout_alignParentEnd);
            this.f55495a = new SoftReference<>(hashMap);
        }
        return this.f55495a.get();
    }

    /* renamed from: c */
    public final HashMap<String, SystemParamValue> m53046c() {
        SoftReference<HashMap<String, SystemParamValue>> softReference = this.f55497c;
        if (softReference == null || softReference.get() == null) {
            HashMap hashMap = new HashMap(55);
            hashMap.put("id", SystemParamValue.id);
            hashMap.put("text", SystemParamValue.text);
            hashMap.put("ellipsize", SystemParamValue.ellipsize);
            hashMap.put("singleLine", SystemParamValue.singleLine);
            hashMap.put("lines", SystemParamValue.lines);
            hashMap.put("maxLength", SystemParamValue.maxLength);
            hashMap.put("drawableLeft", SystemParamValue.drawableLeft);
            hashMap.put("drawablePadding", SystemParamValue.drawablePadding);
            hashMap.put("fadingEdge", SystemParamValue.fadingEdge);
            hashMap.put("scrollHorizontally", SystemParamValue.scrollHorizontally);
            hashMap.put("textColor", SystemParamValue.textColor);
            hashMap.put("textSize", SystemParamValue.textSize);
            hashMap.put(ViewHierarchyConstants.DIMENSION_VISIBILITY_KEY, SystemParamValue.visibility);
            SystemParamValue systemParamValue = SystemParamValue.background;
            hashMap.put(C33933H2.f92945g, systemParamValue);
            hashMap.put("textStyle", SystemParamValue.textStyle);
            hashMap.put("style", SystemParamValue.style);
            hashMap.put("layout_width", SystemParamValue.layout_width);
            hashMap.put("layout_height", SystemParamValue.layout_height);
            hashMap.put("layout_below", SystemParamValue.layout_below);
            hashMap.put("layout_centerInParent", SystemParamValue.layout_centerInParent);
            hashMap.put("contentDescription", SystemParamValue.contentDescription);
            hashMap.put("src", SystemParamValue.src);
            hashMap.put("gravity", SystemParamValue.gravity);
            hashMap.put("orientation", SystemParamValue.orientation);
            hashMap.put("numColumns", SystemParamValue.numColumns);
            hashMap.put("verticalSpacing", SystemParamValue.verticalSpacing);
            hashMap.put("horizontalSpacing", SystemParamValue.horizontalSpacing);
            hashMap.put(C33933H2.f92945g, systemParamValue);
            hashMap.put("layout_marginBottom", SystemParamValue.layout_marginBottom);
            hashMap.put("scaleType", SystemParamValue.scaleType);
            hashMap.put("tag", SystemParamValue.tag);
            hashMap.put("layout_gravity", SystemParamValue.layout_gravity);
            hashMap.put("parent_view", SystemParamValue.parent_view);
            hashMap.put("padding", SystemParamValue.padding);
            hashMap.put("paddingTop", SystemParamValue.paddingTop);
            hashMap.put("paddingBottom", SystemParamValue.paddingBottom);
            hashMap.put("paddingLeft", SystemParamValue.paddingLeft);
            hashMap.put("paddingRight", SystemParamValue.paddingRight);
            hashMap.put("divider", SystemParamValue.divider);
            hashMap.put("scrollbars", SystemParamValue.scrollbars);
            hashMap.put("listSelector", SystemParamValue.listSelector);
            this.f55497c = new SoftReference<>(hashMap);
        }
        return this.f55497c.get();
    }

    /* renamed from: d */
    public final int m53043d(String str) {
        if (this.f55500f != null) {
            String m52783g = MBSDKContext.m52746m().m52783g();
            if (TextUtils.isEmpty(m52783g)) {
                m52783g = this.f55500f.getPackageName();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(m52783g);
            sb2.append(".R$");
            String[] split = str.split("\\.");
            sb2.append(split[1]);
            try {
                Class<?> cls = Class.forName(sb2.toString());
                Object newInstance = cls.newInstance();
                Field declaredField = cls.getDeclaredField(split[2]);
                declaredField.setAccessible(true);
                return ((Integer) declaredField.get(newInstance)).intValue();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return 0;
    }

    /* renamed from: e */
    public final String m53042e(String str) {
        if (!TextUtils.isEmpty(str)) {
            if (!str.startsWith("@")) {
                return str;
            }
            SoftReference<HashMap<String, String>> softReference = this.f55496b;
            if (softReference == null || softReference.get() == null) {
                this.f55496b = new SoftReference<>(m53044d());
            }
            String substring = str.substring(8);
            if (this.f55496b.get() != null && this.f55496b.get().size() > 0) {
                String str2 = this.f55496b.get().get(substring);
                if (!TextUtils.isEmpty(str2)) {
                    return str2;
                }
                try {
                    return MBSDKContext.m52746m().m52792c().getString(ResourceUtil.m51605a(MBSDKContext.m52746m().m52792c(), substring, "string"));
                } catch (Exception e) {
                    SameLogTool.m51824b("MBResource", e.getMessage());
                    return null;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: f */
    public final View m53041f(String str) {
        if (this.f55500f != null) {
            try {
                MBLayoutInflate mBLayoutInflate = new MBLayoutInflate(this.f55500f);
                new String();
                C21890g.m52938a(str.toString());
                return mBLayoutInflate.m53062a(str, (ViewGroup) null);
            } catch (Exception e) {
                SameLogTool.m51824b("MBResource", e.getMessage());
            }
        }
        return null;
    }

    /* renamed from: a */
    public final void m53052a(Context context, String str) {
        try {
            if (C21890g.f55963a) {
                this.f55498d = context.getFilesDir().toString();
            } else {
                this.f55498d = str;
            }
            if (DensityUtil.m52943a(context).heightPixels > 320 && !C21890g.f55963a) {
                this.f55499e = "/drawable-hdpi/";
                this.f55500f = context;
                BufferViewUtil.f55960a = m53054a().m53044d();
            }
            this.f55499e = "/drawable-mdpi/";
            this.f55500f = context;
            BufferViewUtil.f55960a = m53054a().m53044d();
        } catch (Exception e) {
            SameLogTool.m51824b("MBResource", e.getMessage());
        }
    }

    /* renamed from: d */
    private HashMap<String, String> m53044d() {
        InputStream inputStream;
        try {
            inputStream = this.f55500f.getAssets().open("rv_binddatas.xml");
        } catch (IOException e) {
            e.printStackTrace();
            inputStream = null;
        }
        XmlPullParser newPullParser = Xml.newPullParser();
        try {
            newPullParser.setInput(inputStream, C20517nb.f52167N);
            HashMap<String, String> hashMap = new HashMap<>();
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.next()) {
                if (eventType == 2) {
                    if ("string".equals(newPullParser.getName())) {
                        hashMap.put(newPullParser.getAttributeValue(0), newPullParser.nextText());
                    }
                }
            }
            return hashMap;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: a */
    public final void m53053a(Context context) {
        try {
            if (DensityUtil.m52943a(context).heightPixels > 320 && !C21890g.f55963a) {
                this.f55499e = "/drawable-hdpi/";
                this.f55500f = context;
                BufferViewUtil.f55960a = m53054a().m53044d();
            }
            this.f55499e = "/drawable-mdpi/";
            this.f55500f = context;
            BufferViewUtil.f55960a = m53054a().m53044d();
        } catch (Exception e) {
            SameLogTool.m51824b("MBResource", e.getMessage());
        }
    }

    /* renamed from: a */
    public final int m53051a(String str) {
        if (TextUtils.isEmpty(str)) {
            return ViewCompat.MEASURED_STATE_MASK;
        }
        if (str.startsWith("#")) {
            int length = str.length();
            if (length == 7) {
                return (int) Long.decode(str.replace("#", "#FF")).longValue();
            }
            if (length == 9) {
                return (int) Long.decode(str).longValue();
            }
            C21890g.m52938a("返回白色背景");
            return -1;
        } else if (str.startsWith("@color/")) {
            return MBSDKContext.m52746m().m52792c().getColor(ResourceUtil.m51605a(MBSDKContext.m52746m().m52792c(), str.substring(7), "color"));
        } else {
            return ViewCompat.MEASURED_STATE_MASK;
        }
    }

    /* renamed from: a */
    public final GradientDrawable m53049a(String[] strArr) {
        try {
            GradientDrawable gradientDrawable = new GradientDrawable(GradientOrientationUtils.getOrientation(strArr[2]), new int[]{Color.parseColor(strArr[0]), Color.parseColor(strArr[1])});
            gradientDrawable.setGradientType(0);
            return gradientDrawable;
        } catch (Exception e) {
            SameLogTool.m51824b("MBResource", e.getMessage());
            return null;
        }
    }

    /* renamed from: b */
    public final int m53047b(String str) {
        try {
            return Integer.parseInt(str);
        } catch (Exception unused) {
            int indexOf = str.indexOf("d");
            int indexOf2 = str.indexOf("s");
            if (indexOf == -1) {
                indexOf = indexOf2;
            }
            int parseInt = Integer.parseInt(str.substring(0, indexOf));
            if (str.contains("d")) {
                return (int) TypedValue.applyDimension(1, parseInt, this.f55500f.getResources().getDisplayMetrics());
            }
            str.contains("s");
            return parseInt;
        }
    }

    /* renamed from: a */
    public final void m53050a(String str, ImageView imageView) {
        Context context;
        if (str == null || !str.startsWith("@drawable/") || (context = this.f55500f) == null) {
            return;
        }
        try {
            Resources resources = context.getResources();
            String m52783g = MBSDKContext.m52746m().m52783g();
            if (TextUtils.isEmpty(m52783g)) {
                m52783g = this.f55500f.getPackageName();
            }
            imageView.setImageResource(resources.getIdentifier(str, "drawable", m52783g));
        } catch (Exception e) {
            SameLogTool.m51824b("MBResource", e.getMessage());
        }
    }

    /* renamed from: c */
    public final int m53045c(String str) {
        String[] split = str.toUpperCase().split("\\|");
        int i = 48;
        try {
            Class<?> cls = Class.forName("android.view.Gravity");
            for (String str2 : split) {
                i = cls.getField(str2).getInt(null);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return i;
    }
}
