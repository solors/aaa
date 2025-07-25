package com.applovin.mediation.nativeAds;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.applovin.impl.C4584ie;
import com.applovin.impl.mediation.ads.AbstractC4859a;
import com.applovin.impl.mediation.ads.C4861b;
import com.applovin.impl.sdk.C5416j;
import com.applovin.impl.sdk.C5434n;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.openwrap.ALPubMaticOpenWrapConstants;
import com.applovin.sdk.C6200R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

@SuppressLint({"ViewConstructor"})
/* loaded from: classes2.dex */
public class MaxNativeAdView extends FrameLayout {
    public static final String MEDIUM_TEMPLATE_1 = "medium_template_1";

    /* renamed from: a */
    private final View f12758a;

    /* renamed from: b */
    private final TextView f12759b;

    /* renamed from: c */
    private final TextView f12760c;

    /* renamed from: d */
    private final TextView f12761d;

    /* renamed from: f */
    private final Button f12762f;

    /* renamed from: g */
    private final ImageView f12763g;

    /* renamed from: h */
    private final FrameLayout f12764h;

    /* renamed from: i */
    private final ViewGroup f12765i;

    /* renamed from: j */
    private final FrameLayout f12766j;

    /* renamed from: k */
    private final ViewGroup f12767k;

    /* renamed from: l */
    private final ViewGroup f12768l;

    /* renamed from: m */
    private final FrameLayout f12769m;

    /* renamed from: n */
    private C4861b f12770n;

    /* renamed from: com.applovin.mediation.nativeAds.MaxNativeAdView$a */
    /* loaded from: classes2.dex */
    public class ViewTreeObserver$OnPreDrawListenerC6169a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ WeakReference f12771a;

        /* renamed from: b */
        final /* synthetic */ ViewGroup f12772b;

        ViewTreeObserver$OnPreDrawListenerC6169a(WeakReference weakReference, ViewGroup viewGroup) {
            MaxNativeAdView.this = r1;
            this.f12771a = weakReference;
            this.f12772b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f12771a.get();
            if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnPreDrawListener(this);
            } else {
                C5416j.f9935u0.m95186I();
                if (C5434n.m94914a()) {
                    C5416j.f9935u0.m95186I().m94895k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            }
            this.f12771a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f12772b.getLayoutParams();
            layoutParams.height = ((View) this.f12772b.getParent()).getWidth();
            this.f12772b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    @Nullable
    public C4861b getAdViewTracker() {
        return this.f12770n;
    }

    public TextView getAdvertiserTextView() {
        return this.f12760c;
    }

    public TextView getBodyTextView() {
        return this.f12761d;
    }

    public Button getCallToActionButton() {
        return this.f12762f;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f12759b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f12760c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f12761d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f12762f;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f12763g;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f12764h;
    }

    public ImageView getIconImageView() {
        return this.f12763g;
    }

    public View getMainView() {
        return this.f12758a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f12769m;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.f12768l;
        if (viewGroup == null) {
            return this.f12769m;
        }
        return viewGroup;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f12766j;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f12765i;
        if (viewGroup == null) {
            return this.f12766j;
        }
        return viewGroup;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f12767k;
    }

    public TextView getTitleTextView() {
        return this.f12759b;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        C4861b c4861b = this.f12770n;
        if (c4861b != null) {
            c4861b.m97330c();
        }
        if (!isHardwareAccelerated()) {
            C5434n.m94896j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
        }
    }

    public void recycle() {
        setOnClickListener(null);
        C4861b c4861b = this.f12770n;
        if (c4861b != null) {
            c4861b.m97333a();
            this.f12770n = null;
        }
        View view = this.f12758a;
        if (view != null && view.getParent() != this) {
            ViewGroup viewGroup = (ViewGroup) this.f12758a.getParent();
            if (viewGroup != null) {
                viewGroup.removeAllViews();
                removeView(viewGroup);
            }
            addView(this.f12758a);
        }
    }

    public void render(C4584ie c4584ie, AbstractC4859a.InterfaceC4860a interfaceC4860a, C5416j c5416j) {
        recycle();
        if (!c4584ie.m98435s0().get() || !c4584ie.m98437q0().get()) {
            this.f12770n = new C4861b(c4584ie, this, interfaceC4860a, c5416j);
        }
        final MaxNativeAd nativeAd = c4584ie.getNativeAd();
        if (c4584ie.m98434t0() && nativeAd.isContainerClickable()) {
            c5416j.m95186I();
            if (C5434n.m94914a()) {
                c5416j.m95186I().m94911a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new View.OnClickListener() { // from class: com.applovin.mediation.nativeAds.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    nativeAd.performClick();
                }
            });
        }
        if (StringUtils.isValidString(c4584ie.m98436r0())) {
            c5416j.m95186I();
            if (C5434n.m94914a()) {
                c5416j.m95186I().m94911a("MaxNativeAdView", "Rendering template ad view");
            }
            m92256a(nativeAd);
            return;
        }
        c5416j.m95186I();
        if (C5434n.m94914a()) {
            c5416j.m95186I().m94911a("MaxNativeAdView", "Rendering custom ad view");
        }
        renderCustomNativeAdView(nativeAd);
    }

    public void renderCustomNativeAdView(MaxNativeAd maxNativeAd) {
        TextView textView = this.f12759b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f12761d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f12760c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f12762f;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f12763g;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f12763g.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f12763g, icon.getUri());
                } else {
                    this.f12763g.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.f12768l;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12768l.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f12765i;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12765i.addView(optionsView);
                this.f12765i.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f12767k;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12767k.addView(appLovinStarRatingView);
            }
        }
    }

    public MaxNativeAdView(String str, Context context) {
        this((MaxNativeAd) null, str, context);
    }

    /* renamed from: a */
    private int m92254a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            if (ALPubMaticOpenWrapConstants.MAX_NATIVE_AD_SMALL_TEMPLATE.equalsIgnoreCase(str)) {
                return C6200R.C6206layout.max_native_ad_small_template_1;
            }
            if (MEDIUM_TEMPLATE_1.equalsIgnoreCase(str)) {
                return C6200R.C6206layout.max_native_ad_medium_template_1;
            }
            throw new IllegalArgumentException("Attempting to render MAX native ad with invalid format: " + str);
        } else if (maxAdFormat == MaxAdFormat.BANNER) {
            if ("vertical_banner_template".equals(str)) {
                return C6200R.C6206layout.max_native_ad_vertical_banner_view;
            }
            if (!"media_banner_template".equals(str) && !"no_body_banner_template".equals(str)) {
                if ("vertical_media_banner_template".equals(str)) {
                    return C6200R.C6206layout.max_native_ad_vertical_media_banner_view;
                }
                return C6200R.C6206layout.max_native_ad_banner_view;
            }
            return C6200R.C6206layout.max_native_ad_media_banner_view;
        } else if (maxAdFormat == MaxAdFormat.LEADER) {
            if ("vertical_leader_template".equals(str)) {
                return C6200R.C6206layout.max_native_ad_vertical_leader_view;
            }
            return C6200R.C6206layout.max_native_ad_leader_view;
        } else if (maxAdFormat == MaxAdFormat.MREC) {
            return C6200R.C6206layout.max_native_ad_mrec_view;
        } else {
            throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
        }
    }

    /* renamed from: b */
    private void m92253b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(C6200R.C6205id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new ViewTreeObserver$OnPreDrawListenerC6169a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }

    @Deprecated
    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, @Nullable String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public MaxNativeAdView(@androidx.annotation.Nullable com.applovin.mediation.nativeAds.MaxNativeAd r3, @androidx.annotation.Nullable java.lang.String r4, android.content.Context r5) {
        /*
            r2 = this;
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r0 = new com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder
            r1 = -1
            r0.<init>(r1)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r0.setTemplateType(r4)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_title_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setTitleTextViewId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_advertiser_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setAdvertiserTextViewId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_body_text_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setBodyTextViewId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_cta_button
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setCallToActionButtonId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_icon_image_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconImageViewId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_icon_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setIconContentViewId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_options_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setOptionsContentFrameLayoutId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_star_rating_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setStarRatingContentViewGroupId(r0)
            int r0 = com.applovin.sdk.C6200R.C6205id.applovin_native_media_content_view
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentViewGroupId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder$Builder r4 = r4.setMediaContentFrameLayoutId(r0)
            com.applovin.mediation.nativeAds.MaxNativeAdViewBinder r4 = r4.build()
            r2.<init>(r3, r4, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.mediation.nativeAds.MaxNativeAdView.<init>(com.applovin.mediation.nativeAds.MaxNativeAd, java.lang.String, android.content.Context):void");
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(@Nullable MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        super(context);
        int i;
        boolean z = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f12758a = view;
        } else {
            if (z) {
                i = m92254a(maxNativeAdViewBinder.templateType, format);
            } else {
                i = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f12758a = LayoutInflater.from(context).inflate(i, (ViewGroup) this, false);
        }
        addView(this.f12758a);
        this.f12759b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f12760c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f12761d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f12762f = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f12763g = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f12764h = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f12765i = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f12766j = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f12767k = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.f12768l = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f12769m = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            m92256a(maxNativeAd);
        }
    }

    /* renamed from: a */
    private void m92256a(MaxNativeAd maxNativeAd) {
        if (this.f12759b == null) {
            C5434n.m94896j("MaxNativeAdView", "Rendering template ad view without title text view");
        } else if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f12759b.setText(maxNativeAd.getTitle());
        } else {
            this.f12759b.setVisibility(8);
        }
        if (this.f12760c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f12760c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f12760c.setVisibility(8);
            }
        }
        if (this.f12761d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f12761d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f12761d.setVisibility(4);
            } else {
                this.f12761d.setVisibility(8);
            }
        }
        if (this.f12762f != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f12762f.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() != MaxAdFormat.NATIVE && maxNativeAd.getFormat() != MaxAdFormat.MREC) {
                this.f12762f.setVisibility(4);
            } else {
                this.f12762f.setVisibility(8);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f12764h;
        if (frameLayout != null) {
            if (icon == null || this.f12763g == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f12764h.removeAllViews();
                    this.f12764h.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f12763g.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() != null && StringUtils.isValidString(icon.getUri().toString())) {
                ImageViewUtils.setAndDownscaleImageUri(this.f12763g, icon.getUri());
            } else {
                this.f12764h.setVisibility(8);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f12766j;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f12766j.addView(optionsView);
            this.f12766j.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f12769m != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12769m.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f12769m.setVisibility(8);
            }
        }
        if (this.f12767k != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f12767k.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f12767k.addView(appLovinStarRatingView);
            } else {
                this.f12767k.setVisibility(8);
            }
        }
        m92253b();
        postDelayed(new Runnable() { // from class: com.applovin.mediation.nativeAds.b
            {
                MaxNativeAdView.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                MaxNativeAdView.this.m92257a();
            }
        }, 2000L);
    }

    /* renamed from: a */
    public /* synthetic */ void m92257a() {
        setSelected(true);
    }
}
