package com.p551my.target;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import com.p551my.target.common.models.ImageData;
import com.p551my.target.nativeads.views.MediaAdView;

/* renamed from: com.my.target.k4 */
/* loaded from: classes7.dex */
public class C25859k4 extends RelativeLayout {

    /* renamed from: i */
    public static final int f67093i = C25869ka.m43593c();

    /* renamed from: a */
    public final C25905m2 f67094a;

    /* renamed from: b */
    public final RelativeLayout.LayoutParams f67095b;

    /* renamed from: c */
    public final C26038q9 f67096c;

    /* renamed from: d */
    public final C25880l0 f67097d;

    /* renamed from: e */
    public final C25869ka f67098e;

    /* renamed from: f */
    public final C25809i f67099f;

    /* renamed from: g */
    public ImageData f67100g;

    /* renamed from: h */
    public ImageData f67101h;

    public C25859k4(Context context) {
        super(context);
        setBackgroundColor(0);
        C25869ka m43585e = C25869ka.m43585e(context);
        this.f67098e = m43585e;
        C26038q9 c26038q9 = new C26038q9(context);
        this.f67096c = c26038q9;
        int i = f67093i;
        c26038q9.setId(i);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(13);
        c26038q9.setLayoutParams(layoutParams);
        C25869ka.m43594b(c26038q9, "image_view");
        addView(c26038q9);
        C25905m2 c25905m2 = new C25905m2(context);
        this.f67094a = c25905m2;
        c25905m2.m43472a(AbstractC25764g0.m43887a((int) TypedValue.applyDimension(1, 28.0f, context.getResources().getDisplayMetrics())), false);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        this.f67095b = layoutParams2;
        layoutParams2.addRule(7, i);
        layoutParams2.addRule(6, i);
        c25905m2.setLayoutParams(layoutParams2);
        C25880l0 c25880l0 = new C25880l0(context);
        this.f67097d = c25880l0;
        C25809i c25809i = new C25809i(context);
        this.f67099f = c25809i;
        c25809i.setVisibility(8);
        int m43598b = m43585e.m43598b(10);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams3.leftMargin = m43598b;
        layoutParams3.gravity = 16;
        LinearLayout linearLayout = new LinearLayout(context);
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.setMargins(m43598b, m43598b, m43598b, m43598b);
        layoutParams4.addRule(5, i);
        layoutParams4.addRule(6, i);
        linearLayout.setOrientation(0);
        linearLayout.addView(c25880l0);
        linearLayout.addView(c25809i, layoutParams3);
        C25869ka.m43594b(c25905m2, "close_button");
        addView(c25905m2);
        C25869ka.m43594b(c25880l0, "age_bordering");
        addView(linearLayout, layoutParams4);
    }

    /* renamed from: a */
    public final void m43653a() {
        Point m43597b = C25869ka.m43597b(getContext());
        int i = m43597b.x;
        int i2 = m43597b.y;
        if (i <= 0 || i2 <= 0) {
            return;
        }
        ImageData imageData = ((float) i) / ((float) i2) > 1.0f ? this.f67101h : this.f67100g;
        if (imageData == null && (imageData = this.f67101h) == null) {
            imageData = this.f67100g;
        }
        if (imageData == null) {
            return;
        }
        this.f67096c.setImageData(imageData);
    }

    @NonNull
    public C25905m2 getCloseButton() {
        return this.f67094a;
    }

    @NonNull
    public ImageView getImageView() {
        return this.f67096c;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        m43653a();
    }

    public void setAgeRestrictions(@NonNull String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f67097d.m43568a(1, -7829368);
            this.f67097d.setPadding(this.f67098e.m43598b(2), 0, 0, 0);
            this.f67097d.setTextColor(MediaAdView.COLOR_PLACEHOLDER_GRAY);
            this.f67097d.m43567a(1, MediaAdView.COLOR_PLACEHOLDER_GRAY, this.f67098e.m43598b(3));
            this.f67097d.setBackgroundColor(1711276032);
            this.f67097d.setText(str);
            return;
        }
        this.f67097d.setVisibility(8);
    }

    /* renamed from: a */
    public void m43652a(C25669c c25669c, View.OnClickListener onClickListener) {
        this.f67099f.setVisibility(0);
        this.f67099f.setImageBitmap(c25669c.m44130c().getBitmap());
        this.f67099f.setOnClickListener(onClickListener);
    }

    /* renamed from: a */
    public void m43651a(ImageData imageData, ImageData imageData2, ImageData imageData3) {
        this.f67101h = imageData;
        this.f67100g = imageData2;
        Bitmap bitmap = imageData3 != null ? imageData3.getBitmap() : null;
        if (bitmap != null) {
            this.f67094a.m43472a(bitmap, true);
            this.f67095b.leftMargin = -this.f67094a.getMeasuredWidth();
            RelativeLayout.LayoutParams layoutParams = this.f67095b;
            layoutParams.bottomMargin = layoutParams.leftMargin;
        }
        m43653a();
    }
}
