package com.p551my.target.nativeads.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C25869ka;
import com.p551my.target.C26038q9;
import com.p551my.target.common.views.StarsRatingView;
import com.p551my.target.nativeads.banners.NativeAppwallBanner;

/* renamed from: com.my.target.nativeads.views.AppwallAdTeaserView */
/* loaded from: classes7.dex */
public class AppwallAdTeaserView extends RelativeLayout {
    @Nullable
    private NativeAppwallBanner banner;
    @NonNull
    private final C26038q9 bannerIcon;
    @NonNull
    private final ShapeDrawable coinsBgShape;
    @NonNull
    private final TextView coinsCountView;
    @NonNull
    private final C26038q9 coinsIconView;
    @NonNull
    private final LinearLayout coinsLayout;
    @NonNull
    private final TextView descrView;
    @NonNull
    private final C26038q9 notificationView;
    @NonNull
    private final C26038q9 openImageView;
    @NonNull
    private final StarsRatingView starsRatingView;
    @NonNull
    private final C26038q9 statusIconView;
    private final int textColor;
    @NonNull
    private final TextView titleView;
    @NonNull
    private final C25869ka uiUtils;
    private boolean viewed;
    @NonNull
    private final TextView votesCountView;

    public AppwallAdTeaserView(Context context) {
        super(context);
        this.textColor = Color.rgb(36, 36, 36);
        this.viewed = false;
        this.bannerIcon = new C26038q9(context);
        this.coinsLayout = new LinearLayout(context);
        this.coinsCountView = new TextView(context);
        this.coinsIconView = new C26038q9(context);
        this.openImageView = new C26038q9(context);
        this.statusIconView = new C26038q9(context);
        this.titleView = new TextView(context);
        this.descrView = new TextView(context);
        this.starsRatingView = new StarsRatingView(context);
        this.votesCountView = new TextView(context);
        this.notificationView = new C26038q9(context);
        C25869ka m43585e = C25869ka.m43585e(context);
        this.uiUtils = m43585e;
        float m43598b = m43585e.m43598b(6);
        this.coinsBgShape = new ShapeDrawable(new RoundRectShape(new float[]{m43598b, m43598b, m43598b, m43598b, m43598b, m43598b, m43598b, m43598b}, null, null));
        initView();
    }

    private void initView() {
        int m43598b = this.uiUtils.m43598b(18);
        int m43598b2 = this.uiUtils.m43598b(14);
        int m43598b3 = this.uiUtils.m43598b(53);
        int m43593c = C25869ka.m43593c();
        int m43593c2 = C25869ka.m43593c();
        int m43593c3 = C25869ka.m43593c();
        setBackgroundColor(-1);
        ViewGroup.LayoutParams layoutParams = new RelativeLayout.LayoutParams(m43598b3 + m43598b2 + m43598b2, m43598b3 + m43598b + m43598b);
        this.bannerIcon.setPadding(m43598b2, m43598b, m43598b2, m43598b);
        addView(this.bannerIcon, layoutParams);
        int m43598b4 = this.uiUtils.m43598b(20);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(m43598b4, m43598b4);
        layoutParams2.leftMargin = this.uiUtils.m43598b(57);
        layoutParams2.topMargin = this.uiUtils.m43598b(10);
        this.notificationView.setLayoutParams(layoutParams2);
        addView(this.notificationView);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(m43598b3, m43598b3);
        layoutParams3.addRule(11);
        layoutParams3.rightMargin = m43598b2;
        layoutParams3.topMargin = m43598b;
        this.coinsLayout.setBackgroundDrawable(this.coinsBgShape);
        this.coinsLayout.setOrientation(1);
        addView(this.coinsLayout, layoutParams3);
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        TextView textView = this.coinsCountView;
        Typeface typeface = Typeface.SANS_SERIF;
        textView.setTypeface(typeface);
        this.coinsCountView.setPadding(0, this.uiUtils.m43598b(10), 0, this.uiUtils.m43598b(2));
        this.coinsCountView.setTextSize(2, 13.0f);
        this.coinsCountView.setGravity(49);
        this.coinsLayout.addView(this.coinsCountView, layoutParams4);
        LinearLayout.LayoutParams layoutParams5 = new LinearLayout.LayoutParams(this.uiUtils.m43598b(20), this.uiUtils.m43598b(20));
        layoutParams5.gravity = 1;
        this.coinsLayout.addView(this.coinsIconView, layoutParams5);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(this.uiUtils.m43598b(19), -2);
        layoutParams6.addRule(15);
        layoutParams6.addRule(11);
        layoutParams6.rightMargin = this.uiUtils.m43598b(30);
        addView(this.openImageView, layoutParams6);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(m43598b3, m43598b3);
        layoutParams7.addRule(10);
        layoutParams7.addRule(11);
        addView(this.statusIconView, layoutParams7);
        this.titleView.setTypeface(typeface);
        this.titleView.setTextSize(2, 18.0f);
        this.titleView.setTextColor(this.textColor);
        this.titleView.setPadding(0, 0, this.uiUtils.m43598b(67), 0);
        this.titleView.setId(m43593c3);
        RelativeLayout.LayoutParams layoutParams8 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams8.leftMargin = this.uiUtils.m43598b(91);
        layoutParams8.rightMargin = this.uiUtils.m43598b(15);
        layoutParams8.topMargin = this.uiUtils.m43598b(13);
        this.titleView.setLayoutParams(layoutParams8);
        addView(this.titleView);
        this.descrView.setTypeface(typeface);
        this.descrView.setTextSize(2, 13.0f);
        this.descrView.setTextColor(this.textColor);
        RelativeLayout.LayoutParams layoutParams9 = new RelativeLayout.LayoutParams(-1, -2);
        layoutParams9.leftMargin = this.uiUtils.m43598b(91);
        layoutParams9.addRule(3, m43593c3);
        this.descrView.setId(m43593c);
        this.descrView.setLayoutParams(layoutParams9);
        addView(this.descrView);
        RelativeLayout.LayoutParams layoutParams10 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams10.addRule(3, m43593c);
        layoutParams10.leftMargin = this.uiUtils.m43598b(91);
        layoutParams10.topMargin = this.uiUtils.m43598b(5);
        this.starsRatingView.setPadding(0, 0, 0, this.uiUtils.m43598b(20));
        this.starsRatingView.setStarsPadding(this.uiUtils.m43598b(2));
        this.starsRatingView.setStarSize(this.uiUtils.m43598b(12));
        this.starsRatingView.setId(m43593c2);
        addView(this.starsRatingView, layoutParams10);
        RelativeLayout.LayoutParams layoutParams11 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams11.addRule(1, m43593c2);
        layoutParams11.addRule(3, m43593c);
        layoutParams11.leftMargin = this.uiUtils.m43598b(9);
        this.votesCountView.setTypeface(typeface);
        this.votesCountView.setPadding(0, this.uiUtils.m43598b(2), 0, 0);
        this.votesCountView.setTextSize(2, 13.0f);
        this.votesCountView.setTextColor(this.textColor);
        this.votesCountView.setGravity(16);
        addView(this.votesCountView, layoutParams11);
    }

    @Nullable
    public NativeAppwallBanner getBanner() {
        return this.banner;
    }

    @NonNull
    public ImageView getBannerIconImageView() {
        return this.bannerIcon;
    }

    @NonNull
    public TextView getCoinsCountTextView() {
        return this.coinsCountView;
    }

    @NonNull
    public ImageView getCoinsIconImageView() {
        return this.coinsIconView;
    }

    @NonNull
    public TextView getDescriptionTextView() {
        return this.descrView;
    }

    @NonNull
    public ImageView getNotificationImageView() {
        return this.notificationView;
    }

    @NonNull
    public ImageView getOpenImageView() {
        return this.openImageView;
    }

    @NonNull
    public StarsRatingView getStarsRatingView() {
        return this.starsRatingView;
    }

    @NonNull
    public ImageView getStatusIconImageView() {
        return this.statusIconView;
    }

    @NonNull
    public TextView getTitleTextView() {
        return this.titleView;
    }

    @NonNull
    public TextView getVotesCountTextView() {
        return this.votesCountView;
    }

    public boolean isViewed() {
        return this.viewed;
    }

    public void removeNotification() {
        removeView(this.notificationView);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setNativeAppwallBanner(com.p551my.target.nativeads.banners.NativeAppwallBanner r9) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p551my.target.nativeads.views.AppwallAdTeaserView.setNativeAppwallBanner(com.my.target.nativeads.banners.NativeAppwallBanner):void");
    }

    public void setViewed(boolean z) {
        this.viewed = z;
    }
}
