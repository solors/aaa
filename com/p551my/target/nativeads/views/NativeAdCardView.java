package com.p551my.target.nativeads.views;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.StateSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.view.ViewCompat;
import com.p551my.target.C25869ka;
import com.p551my.target.nativeads.constants.NativeAdColor;
import com.p551my.target.nativeads.views.PromoCardView;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* renamed from: com.my.target.nativeads.views.NativeAdCardView */
/* loaded from: classes7.dex */
public class NativeAdCardView extends LinearLayout implements PromoCardView {
    private static final int CTA_ID = C25869ka.m43593c();
    @Nullable
    View.OnClickListener cardClickListener;
    @NonNull
    private final RelativeLayout containerLayout;
    @NonNull
    private final Button ctaButton;
    @NonNull
    private final TextView descriptionView;
    @NonNull
    private final View.OnClickListener elementClickListener;
    @NonNull
    private final MediaAdView mediaAdView;
    @NonNull
    private final LinearLayout textContainerLayout;
    @NonNull
    private final TextView titleView;
    @NonNull
    private final C25869ka uiUtils;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.my.target.nativeads.views.NativeAdCardView$LayoutWidth */
    /* loaded from: classes7.dex */
    public @interface LayoutWidth {
        public static final int DP_30 = 30;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.my.target.nativeads.views.NativeAdCardView$Margin */
    /* loaded from: classes7.dex */
    public @interface Margin {
        public static final int DP_12 = 12;
    }

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.my.target.nativeads.views.NativeAdCardView$Padding */
    /* loaded from: classes7.dex */
    public @interface Padding {
        public static final int DP_0 = 0;
        public static final int DP_1 = 1;
        public static final int DP_10 = 10;
        public static final int DP_8 = 8;
    }

    public NativeAdCardView(@NonNull Context context) {
        this(context, null);
    }

    private void initView() {
        setOrientation(1);
        setPadding(0, this.uiUtils.m43598b(8), 0, this.uiUtils.m43598b(8));
        setClickable(true);
        C25869ka.m43605a(this, 0, (int) NativeAdColor.BACKGROUND_TOUCH);
        C25869ka.m43602a(this.containerLayout, 0, NativeAdColor.BACKGROUND_TOUCH, -3355444, this.uiUtils.m43598b(1), 0);
        Button button = this.ctaButton;
        int i = CTA_ID;
        button.setId(i);
        this.ctaButton.setMaxEms(10);
        this.ctaButton.setLines(1);
        Button button2 = this.ctaButton;
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        button2.setEllipsize(truncateAt);
        this.ctaButton.setPadding(this.uiUtils.m43598b(10), 0, this.uiUtils.m43598b(10), 0);
        this.ctaButton.setTextSize(2, 12.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, this.uiUtils.m43598b(30));
        layoutParams.addRule(11, -1);
        layoutParams.addRule(15, -1);
        layoutParams.setMargins(this.uiUtils.m43598b(12), this.uiUtils.m43598b(12), this.uiUtils.m43598b(12), this.uiUtils.m43598b(12));
        this.ctaButton.setLayoutParams(layoutParams);
        this.ctaButton.setTransformationMethod(null);
        this.ctaButton.setStateListAnimator(null);
        this.ctaButton.setTextColor(NativeAdColor.STANDARD_BLUE);
        GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
        GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{0, 0});
        gradientDrawable.setStroke(this.uiUtils.m43598b(1), NativeAdColor.STANDARD_BLUE);
        gradientDrawable.setCornerRadius(this.uiUtils.m43598b(1));
        GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{NativeAdColor.BACKGROUND_TOUCH, NativeAdColor.BACKGROUND_TOUCH});
        gradientDrawable2.setStroke(this.uiUtils.m43598b(1), NativeAdColor.STANDARD_BLUE);
        gradientDrawable2.setCornerRadius(this.uiUtils.m43598b(1));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
        stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
        this.ctaButton.setBackgroundDrawable(stateListDrawable);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams2.addRule(0, i);
        this.textContainerLayout.setLayoutParams(layoutParams2);
        this.textContainerLayout.setGravity(16);
        this.textContainerLayout.setOrientation(1);
        this.titleView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.titleView.setTextSize(2, 14.0f);
        this.titleView.setTypeface(null, 1);
        this.titleView.setLines(2);
        this.titleView.setEllipsize(truncateAt);
        this.titleView.setPadding(this.uiUtils.m43598b(12), this.uiUtils.m43598b(6), this.uiUtils.m43598b(1), this.uiUtils.m43598b(1));
        this.descriptionView.setTextColor(ViewCompat.MEASURED_STATE_MASK);
        this.descriptionView.setTextSize(2, 12.0f);
        this.descriptionView.setLines(1);
        this.descriptionView.setEllipsize(truncateAt);
        this.descriptionView.setPadding(this.uiUtils.m43598b(12), this.uiUtils.m43598b(1), this.uiUtils.m43598b(1), this.uiUtils.m43598b(12));
        addView(this.mediaAdView);
        addView(this.containerLayout);
        this.containerLayout.addView(this.ctaButton);
        this.containerLayout.addView(this.textContainerLayout);
        this.textContainerLayout.addView(this.titleView);
        this.textContainerLayout.addView(this.descriptionView);
    }

    @Override // com.p551my.target.nativeads.views.PromoCardView
    @NonNull
    public MediaAdView getMediaAdView() {
        return this.mediaAdView;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (x > this.mediaAdView.getLeft() && x < this.mediaAdView.getRight() && y > this.mediaAdView.getTop() && y < this.mediaAdView.getBottom()) {
            return true;
        }
        return false;
    }

    @Override // com.p551my.target.nativeads.views.PromoCardView
    public void setCard(@NonNull PromoCardView.Card card) {
        this.titleView.setText(card.getTitle());
        this.descriptionView.setText(card.getDescription());
        this.ctaButton.setText(card.getCtaButtonText());
        this.ctaButton.setContentDescription(card.getCtaButtonText());
    }

    @Override // com.p551my.target.nativeads.views.PromoCardView
    public void setCtaOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.ctaButton.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        this.cardClickListener = onClickListener;
        super.setOnClickListener(onClickListener);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            getChildAt(i).setOnClickListener(this.elementClickListener);
        }
    }

    public NativeAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeAdCardView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.elementClickListener = new View.OnClickListener() { // from class: com.my.target.nativeads.views.NativeAdCardView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                NativeAdCardView nativeAdCardView = NativeAdCardView.this;
                View.OnClickListener onClickListener = nativeAdCardView.cardClickListener;
                if (onClickListener != null) {
                    onClickListener.onClick(nativeAdCardView);
                }
            }
        };
        MediaAdView mediaAdView = new MediaAdView(context);
        this.mediaAdView = mediaAdView;
        TextView textView = new TextView(context);
        this.titleView = textView;
        TextView textView2 = new TextView(context);
        this.descriptionView = textView2;
        this.containerLayout = new RelativeLayout(context);
        Button button = new Button(context);
        this.ctaButton = button;
        this.uiUtils = C25869ka.m43585e(context);
        this.textContainerLayout = new LinearLayout(context);
        C25869ka.m43594b(this, "card_view");
        C25869ka.m43594b(mediaAdView, "card_media_view");
        C25869ka.m43594b(textView, "card_title_text");
        C25869ka.m43594b(textView2, "card_description_text");
        C25869ka.m43594b(button, "card_cta_text");
        initView();
    }

    @Override // com.p551my.target.nativeads.views.PromoCardView
    @NonNull
    public View getView() {
        return this;
    }
}
