package com.bytedance.sdk.openadsdk.utils;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.BitmapFactory;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import com.bytedance.sdk.component.utils.C7741PX;
import com.bytedance.sdk.openadsdk.core.model.AbstractC8967tuV;

/* renamed from: com.bytedance.sdk.openadsdk.utils.bX */
/* loaded from: classes3.dex */
public class C9544bX {

    /* renamed from: com.bytedance.sdk.openadsdk.utils.bX$bg */
    /* loaded from: classes3.dex */
    private static class View$OnLayoutChangeListenerC9545bg implements View.OnLayoutChangeListener {

        /* renamed from: IL */
        private int f21300IL;

        /* renamed from: bX */
        private int f21301bX;

        /* renamed from: bg */
        private final Drawable f21302bg;

        public View$OnLayoutChangeListenerC9545bg(Drawable drawable) {
            this.f21302bg = drawable;
        }

        @Override // android.view.View.OnLayoutChangeListener
        public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
            int i9 = i3 - i;
            int i10 = i4 - i2;
            if (i9 == this.f21300IL && i10 == this.f21301bX) {
                return;
            }
            this.f21300IL = i9;
            this.f21301bX = i10;
            this.f21302bg.setBounds(0, 0, i9, i10);
        }
    }

    /* renamed from: bg */
    public static void m82430bg(ViewGroup viewGroup, AbstractC8967tuV abstractC8967tuV) {
        if (viewGroup == null || abstractC8967tuV == null || TextUtils.isEmpty(abstractC8967tuV.mo84108Ky())) {
            return;
        }
        try {
            int i = C9514Ta.f21184Ky;
            if (viewGroup.getTag(i) != null) {
                return;
            }
            viewGroup.setTag(i, Integer.valueOf(i));
            Drawable m82431bg = m82431bg(viewGroup.getResources(), abstractC8967tuV);
            if (m82431bg == null) {
                return;
            }
            viewGroup.setForeground(m82431bg);
        } catch (Throwable th) {
            C7741PX.m87873bg("add overlay fail", th.getMessage());
        }
    }

    /* renamed from: bg */
    public static void m82432bg(Activity activity, AbstractC8967tuV abstractC8967tuV) {
        if (activity == null || abstractC8967tuV == null || TextUtils.isEmpty(abstractC8967tuV.mo84108Ky())) {
            return;
        }
        try {
            View decorView = activity.getWindow().getDecorView();
            int i = C9514Ta.f21184Ky;
            if (decorView.getTag(i) != null) {
                return;
            }
            activity.getWindow().getDecorView().setTag(i, Integer.valueOf(i));
            Drawable m82431bg = m82431bg(activity.getResources(), abstractC8967tuV);
            if (m82431bg == null) {
                return;
            }
            activity.getWindow().getDecorView().setForeground(m82431bg);
        } catch (Throwable th) {
            C7741PX.m87873bg("add overlay fail", th.getMessage());
        }
    }

    @Nullable
    /* renamed from: bg */
    private static Drawable m82431bg(Resources resources, AbstractC8967tuV abstractC8967tuV) {
        try {
            String mo84108Ky = abstractC8967tuV.mo84108Ky();
            if (TextUtils.isEmpty(mo84108Ky)) {
                return null;
            }
            byte[] decode = Base64.decode(mo84108Ky, 0);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, BitmapFactory.decodeByteArray(decode, 0, decode.length));
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            bitmapDrawable.setTargetDensity(resources.getDisplayMetrics());
            return bitmapDrawable;
        } catch (Throwable unused) {
            return null;
        }
    }
}
