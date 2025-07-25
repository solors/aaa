package com.p551my.target.nativeads.views;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.StateSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p551my.target.C25869ka;
import com.p551my.target.nativeads.NativeAppwallAd;
import com.p551my.target.nativeads.banners.NativeAppwallBanner;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.my.target.nativeads.views.AppwallAdView */
/* loaded from: classes7.dex */
public class AppwallAdView extends FrameLayout implements ViewTreeObserver.OnGlobalLayoutListener, AdapterView.OnItemClickListener, AbsListView.OnScrollListener {
    private static final int BACKGROUND_COLOR = -1118482;
    @Nullable
    private AppwallAdViewListener appwallAdViewListener;
    @NonNull
    private final ListView listView;
    @NonNull
    private final C25869ka uiUtils;
    @NonNull
    private final HashMap<NativeAppwallBanner, Boolean> viewMap;

    /* renamed from: com.my.target.nativeads.views.AppwallAdView$AppwallAdViewListener */
    /* loaded from: classes7.dex */
    public interface AppwallAdViewListener {
        void onBannerClick(@NonNull NativeAppwallBanner nativeAppwallBanner);

        void onBannersShow(@NonNull List<NativeAppwallBanner> list);
    }

    /* renamed from: com.my.target.nativeads.views.AppwallAdView$AppwallAdapter */
    /* loaded from: classes7.dex */
    public static class AppwallAdapter extends ArrayAdapter<NativeAppwallBanner> {
        public AppwallAdapter(@NonNull Context context, @NonNull List<NativeAppwallBanner> list) {
            super(context, 0, list);
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        @NonNull
        public View getView(int i, View view, @NonNull ViewGroup viewGroup) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) getItem(i);
            if (view == null) {
                view = new AppwallCardPlaceholder(new AppwallAdTeaserView(getContext()), getContext());
            }
            if (nativeAppwallBanner != null) {
                ((AppwallCardPlaceholder) view).getView().setNativeAppwallBanner(nativeAppwallBanner);
            }
            return view;
        }
    }

    @SuppressLint({"ViewConstructor"})
    /* renamed from: com.my.target.nativeads.views.AppwallAdView$AppwallCardPlaceholder */
    /* loaded from: classes7.dex */
    public static class AppwallCardPlaceholder extends FrameLayout {
        @NonNull
        private final LinearLayout rootLayout;
        @NonNull
        private final AppwallAdTeaserView view;

        public AppwallCardPlaceholder(@NonNull AppwallAdTeaserView appwallAdTeaserView, Context context) {
            super(context);
            C25869ka m43585e = C25869ka.m43585e(context);
            this.view = appwallAdTeaserView;
            int m43598b = m43585e.m43598b(9);
            int m43598b2 = m43585e.m43598b(4);
            int m43598b3 = m43585e.m43598b(2);
            LinearLayout linearLayout = new LinearLayout(context);
            this.rootLayout = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setBackgroundColor(-1118482);
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
            layoutParams.setMargins(m43598b, m43598b2, m43598b, m43598b2);
            appwallAdTeaserView.setLayoutParams(layoutParams);
            linearLayout.addView(appwallAdTeaserView);
            appwallAdTeaserView.setElevation(m43598b3);
            GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
            GradientDrawable gradientDrawable = new GradientDrawable(orientation, new int[]{-1, -1});
            GradientDrawable gradientDrawable2 = new GradientDrawable(orientation, new int[]{-1118482, -1118482});
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842919}, gradientDrawable2);
            stateListDrawable.addState(StateSet.WILD_CARD, gradientDrawable);
            appwallAdTeaserView.setBackground(stateListDrawable);
            addView(linearLayout, -2, -2);
        }

        @NonNull
        public AppwallAdTeaserView getView() {
            return this.view;
        }
    }

    public AppwallAdView(@NonNull Context context) {
        super(context);
        this.viewMap = new HashMap<>();
        setVerticalFadingEdgeEnabled(false);
        setBackgroundColor(-1);
        this.uiUtils = C25869ka.m43585e(context);
        this.listView = new ListView(context);
        initLayout();
    }

    private void countVisibleBanners() {
        AppwallAdViewListener appwallAdViewListener;
        if (this.listView.getAdapter() == null) {
            return;
        }
        int lastVisiblePosition = this.listView.getLastVisiblePosition();
        ArrayList arrayList = new ArrayList();
        for (int firstVisiblePosition = this.listView.getFirstVisiblePosition(); firstVisiblePosition <= lastVisiblePosition; firstVisiblePosition++) {
            NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.listView.getAdapter().getItem(firstVisiblePosition);
            if (this.viewMap.get(nativeAppwallBanner) == null) {
                arrayList.add(nativeAppwallBanner);
                this.viewMap.put(nativeAppwallBanner, Boolean.TRUE);
            }
        }
        if (arrayList.size() > 0 && (appwallAdViewListener = this.appwallAdViewListener) != null) {
            appwallAdViewListener.onBannersShow(arrayList);
        }
    }

    private void initLayout() {
        int m43598b = this.uiUtils.m43598b(4);
        int m43598b2 = this.uiUtils.m43598b(4);
        this.listView.setDividerHeight(0);
        this.listView.setVerticalFadingEdgeEnabled(false);
        this.listView.setOnItemClickListener(this);
        this.listView.setOnScrollListener(this);
        this.listView.setPadding(0, m43598b, 0, m43598b2);
        this.listView.setClipToPadding(false);
        addView(this.listView, -1, -1);
        this.listView.setBackgroundColor(-1118482);
    }

    public void notifyDataSetChanged() {
        ((AppwallAdapter) this.listView.getAdapter()).notifyDataSetChanged();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        countVisibleBanners();
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
        countVisibleBanners();
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        NativeAppwallBanner nativeAppwallBanner = (NativeAppwallBanner) this.listView.getAdapter().getItem(i);
        AppwallAdViewListener appwallAdViewListener = this.appwallAdViewListener;
        if (appwallAdViewListener != null) {
            appwallAdViewListener.onBannerClick(nativeAppwallBanner);
        }
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScroll(AbsListView absListView, int i, int i2, int i3) {
        countVisibleBanners();
    }

    public void setAppwallAdViewListener(@Nullable AppwallAdViewListener appwallAdViewListener) {
        this.appwallAdViewListener = appwallAdViewListener;
    }

    public void setupView(@NonNull NativeAppwallAd nativeAppwallAd) {
        this.listView.setAdapter((ListAdapter) new AppwallAdapter(getContext(), nativeAppwallAd.getBanners()));
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public void onScrollStateChanged(AbsListView absListView, int i) {
    }
}
