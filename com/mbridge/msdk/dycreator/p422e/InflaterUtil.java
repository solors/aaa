package com.mbridge.msdk.dycreator.p422e;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.mbridge.msdk.dycreator.p417a.MBResource;
import java.io.File;

/* renamed from: com.mbridge.msdk.dycreator.e.f */
/* loaded from: classes6.dex */
public class InflaterUtil {

    /* renamed from: a */
    private static volatile InflaterUtil f55961a;

    /* renamed from: b */
    private MBResource f55962b;

    private InflaterUtil(Context context) {
        this.f55962b = null;
        MBResource m53054a = MBResource.m53054a();
        this.f55962b = m53054a;
        m53054a.m53052a(context, "");
    }

    /* renamed from: a */
    public static InflaterUtil m52941a(Context context) {
        if (f55961a == null) {
            synchronized (InflaterUtil.class) {
                if (f55961a == null) {
                    f55961a = new InflaterUtil(context.getApplicationContext());
                }
            }
        }
        return f55961a;
    }

    /* renamed from: a */
    public final View m52939a(String str) {
        if (new File(str).exists()) {
            return this.f55962b.m53041f(str);
        }
        return null;
    }

    /* renamed from: a */
    public final View m52940a(ViewGroup viewGroup, String str) {
        if (viewGroup != null && !TextUtils.isEmpty(str)) {
            if (viewGroup.getId() == str.hashCode()) {
                return viewGroup;
            }
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getId() == str.hashCode()) {
                    return childAt;
                }
                if (childAt instanceof ViewGroup) {
                    m52940a((ViewGroup) childAt, str);
                }
            }
        }
        return null;
    }
}
