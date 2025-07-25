package com.pubmatic.sdk.nativead.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.pubmatic.sdk.nativead.POBNativeConstants;
import com.pubmatic.sdk.nativead.R$id;
import com.pubmatic.sdk.nativead.R$layout;

/* loaded from: classes7.dex */
public class POBNativeTemplateView extends RelativeLayout {
    @Nullable

    /* renamed from: a */
    private ImageView f70511a;
    @Nullable

    /* renamed from: b */
    private ImageView f70512b;
    @Nullable

    /* renamed from: c */
    private ImageView f70513c;
    @Nullable

    /* renamed from: d */
    private ImageView f70514d;
    @Nullable

    /* renamed from: e */
    private TextView f70515e;
    @Nullable

    /* renamed from: f */
    private TextView f70516f;
    @Nullable

    /* renamed from: g */
    private Button f70517g;
    @Nullable
    protected ImageView mainImage;

    /* JADX INFO: Access modifiers changed from: protected */
    public POBNativeTemplateView(@NonNull Context context, @LayoutRes int i) {
        super(context);
        this.f70511a = null;
        this.f70512b = null;
        this.f70513c = null;
        this.f70514d = null;
        this.f70515e = null;
        this.f70516f = null;
        this.f70517g = null;
        this.mainImage = null;
        View.inflate(context, i, this);
        this.f70511a = (ImageView) findViewById(R$id.pob_ad_icon);
        this.f70512b = (ImageView) findViewById(R$id.pob_privacy_icon);
        this.f70513c = (ImageView) findViewById(R$id.pob_icon_image);
        this.f70515e = (TextView) findViewById(R$id.pob_title);
        this.f70516f = (TextView) findViewById(R$id.pob_description);
        this.f70517g = (Button) findViewById(R$id.pob_cta_text);
        this.f70514d = (ImageView) findViewById(R$id.pob_dsa_info_btn);
        if (i == R$layout.pob_medium_template) {
            this.mainImage = (ImageView) findViewById(R$id.pob_main_image);
        }
    }

    private void setAdClickListeners(@NonNull View.OnClickListener onClickListener) {
        ImageView imageView = this.f70513c;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
        }
        TextView textView = this.f70515e;
        if (textView != null) {
            textView.setOnClickListener(onClickListener);
        }
        Button button = this.f70517g;
        if (button != null) {
            button.setOnClickListener(onClickListener);
        }
        TextView textView2 = this.f70516f;
        if (textView2 != null) {
            textView2.setOnClickListener(onClickListener);
        }
        ImageView imageView2 = this.mainImage;
        if (imageView2 != null) {
            imageView2.setOnClickListener(onClickListener);
        }
        ImageView imageView3 = this.f70512b;
        if (imageView3 != null) {
            imageView3.setOnClickListener(onClickListener);
        }
        ImageView imageView4 = this.f70514d;
        if (imageView4 != null) {
            imageView4.setOnClickListener(onClickListener);
        }
    }

    @Nullable
    public ImageView getAdIcon() {
        return this.f70511a;
    }

    @Nullable
    public Button getCta() {
        return this.f70517g;
    }

    @Nullable
    public ImageView getDSAIcon() {
        return this.f70514d;
    }

    @Nullable
    public TextView getDescription() {
        return this.f70516f;
    }

    @Nullable
    public ImageView getIconImage() {
        return this.f70513c;
    }

    @Nullable
    public ImageView getMainImage() {
        return null;
    }

    @Nullable
    public ImageView getPrivacyIcon() {
        return this.f70512b;
    }

    @Nullable
    public TextView getTitle() {
        return this.f70515e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        ImageView imageView = this.f70513c;
        if (imageView != null) {
            imageView.setTag(2);
        }
        TextView textView = this.f70515e;
        if (textView != null) {
            textView.setTag(1);
        }
        TextView textView2 = this.f70516f;
        if (textView2 != null) {
            textView2.setTag(3);
        }
        Button button = this.f70517g;
        if (button != null) {
            button.setTag(4);
        }
        ImageView imageView2 = this.f70512b;
        if (imageView2 != null) {
            imageView2.setTag(POBNativeConstants.POB_NATIVE_ID_PRIVACY);
        }
        ImageView imageView3 = this.mainImage;
        if (imageView3 != null) {
            imageView3.setTag(5);
        }
        ImageView imageView4 = this.f70514d;
        if (imageView4 != null) {
            imageView4.setTag(POBNativeConstants.POB_NATIVE_ID_DSA);
        }
    }

    public void setAdIcon(@Nullable ImageView imageView) {
        this.f70511a = imageView;
    }

    public void setCta(@Nullable Button button) {
        this.f70517g = button;
    }

    public void setDSAIcon(@Nullable ImageView imageView) {
        this.f70514d = imageView;
    }

    public void setDescription(@Nullable TextView textView) {
        this.f70516f = textView;
    }

    public void setIconImage(@Nullable ImageView imageView) {
        this.f70513c = imageView;
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        super.setOnClickListener(onClickListener);
        if (onClickListener != null) {
            setAdClickListeners(onClickListener);
        }
    }

    public void setPrivacyIcon(@Nullable ImageView imageView) {
        this.f70512b = imageView;
    }

    public void setTitle(@Nullable TextView textView) {
        this.f70515e = textView;
    }

    public POBNativeTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f70511a = null;
        this.f70512b = null;
        this.f70513c = null;
        this.f70514d = null;
        this.f70515e = null;
        this.f70516f = null;
        this.f70517g = null;
        this.mainImage = null;
    }

    public void setMainImage(@Nullable ImageView imageView) {
    }

    public POBNativeTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f70511a = null;
        this.f70512b = null;
        this.f70513c = null;
        this.f70514d = null;
        this.f70515e = null;
        this.f70516f = null;
        this.f70517g = null;
        this.mainImage = null;
    }

    @RequiresApi(api = 21)
    public POBNativeTemplateView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f70511a = null;
        this.f70512b = null;
        this.f70513c = null;
        this.f70514d = null;
        this.f70515e = null;
        this.f70516f = null;
        this.f70517g = null;
        this.mainImage = null;
    }
}
