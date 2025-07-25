package com.pubmatic.sdk.webrendering.mraid;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.pubmatic.sdk.common.utility.POBUtils;
import com.pubmatic.sdk.common.view.POBWebView;
import com.pubmatic.sdk.webrendering.POBUIUtil;
import com.pubmatic.sdk.webrendering.R$drawable;
import com.pubmatic.sdk.webrendering.R$id;
import com.pubmatic.sdk.webrendering.p566ui.POBAdViewContainer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.pubmatic.sdk.webrendering.mraid.v */
/* loaded from: classes7.dex */
public class View$OnTouchListenerC26942v extends RelativeLayout implements View.OnTouchListener {
    @Nullable

    /* renamed from: a */
    private ViewGroup f71237a;
    @NonNull

    /* renamed from: b */
    private Context f71238b;
    @Nullable

    /* renamed from: c */
    private POBAdViewContainer f71239c;
    @Nullable

    /* renamed from: d */
    private POBWebView f71240d;
    @Nullable

    /* renamed from: e */
    private InterfaceC26943a f71241e;
    @Nullable

    /* renamed from: f */
    private ImageView f71242f;
    @Nullable

    /* renamed from: g */
    private RelativeLayout f71243g;

    /* renamed from: h */
    private int f71244h;

    /* renamed from: i */
    private boolean f71245i;

    /* renamed from: j */
    private final ViewTreeObserver.OnGlobalLayoutListener f71246j;

    /* renamed from: k */
    private final POBWebView.WebViewBackPress f71247k;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.pubmatic.sdk.webrendering.mraid.v$a */
    /* loaded from: classes7.dex */
    public interface InterfaceC26943a {
        /* renamed from: a */
        void mo39854a(POBAdViewContainer pOBAdViewContainer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public View$OnTouchListenerC26942v(@NonNull Context context) {
        super(context);
        this.f71245i = true;
        this.f71246j = new ViewTreeObserver$OnGlobalLayoutListenerC26939s(this);
        this.f71247k = new C26940t(this);
        this.f71238b = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m39855d() {
        ViewGroup viewGroup = this.f71237a;
        if (viewGroup != null) {
            viewGroup.bringChildToFront(this);
            this.f71237a.requestFocus();
        }
        getViewTreeObserver().addOnGlobalLayoutListener(this.f71246j);
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return !(view instanceof POBWebView);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39862a(@NonNull ViewGroup viewGroup, @NonNull POBAdViewContainer pOBAdViewContainer, int i, int i2, int i3, int i4, @Nullable InterfaceC26943a interfaceC26943a) {
        this.f71239c = pOBAdViewContainer;
        this.f71240d = pOBAdViewContainer.getAdView();
        this.f71238b = pOBAdViewContainer.getContext();
        this.f71237a = viewGroup;
        this.f71241e = interfaceC26943a;
        m39863a(pOBAdViewContainer, i, i2, i3, i4);
        this.f71244h = POBUtils.getDeviceOrientation(this.f71238b);
    }

    /* renamed from: b */
    public void m39859b() {
        POBAdViewContainer pOBAdViewContainer;
        RelativeLayout relativeLayout = this.f71243g;
        if (relativeLayout != null && this.f71239c != null && this.f71240d != null) {
            relativeLayout.getViewTreeObserver().removeOnGlobalLayoutListener(this.f71246j);
            this.f71243g.removeView(this.f71242f);
            this.f71243g.removeView(this.f71239c);
            this.f71240d.setWebViewBackPress(null);
        }
        setOnTouchListener(null);
        removeAllViews();
        InterfaceC26943a interfaceC26943a = this.f71241e;
        if (interfaceC26943a == null || (pOBAdViewContainer = this.f71239c) == null) {
            return;
        }
        interfaceC26943a.mo39854a(pOBAdViewContainer);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Nullable
    /* renamed from: c */
    public ImageView m39857c() {
        return this.f71242f;
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* renamed from: a */
    private void m39863a(@NonNull ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        this.f71242f = POBUIUtil.createSkipButton(getContext(), R$id.pob_close_btn, R$drawable.pob_ic_close_black_24dp);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(11);
        this.f71242f.setOnClickListener(new View$OnClickListenerC26941u(this));
        this.f71243g = new RelativeLayout(this.f71238b);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(i, i2);
        layoutParams2.setMargins(i3, i4, Integer.MIN_VALUE, Integer.MIN_VALUE);
        this.f71243g.addView(viewGroup, new RelativeLayout.LayoutParams(-1, -1));
        this.f71243g.addView(this.f71242f, layoutParams);
        addView(this.f71243g, layoutParams2);
        m39860a(true);
        setOnTouchListener(this);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-1, -1);
        ViewGroup viewGroup2 = this.f71237a;
        if (viewGroup2 != null) {
            viewGroup2.addView(this, 0, layoutParams3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39860a(boolean z) {
        POBWebView pOBWebView = this.f71240d;
        if (pOBWebView != null) {
            if (z) {
                pOBWebView.setWebViewBackPress(this.f71247k);
            } else {
                pOBWebView.setWebViewBackPress(null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39864a(int i, int i2, int i3, int i4) {
        if (this.f71243g != null) {
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(i, i2);
            layoutParams.setMargins(i3, i4, Integer.MIN_VALUE, Integer.MIN_VALUE);
            updateViewLayout(this.f71243g, layoutParams);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m39865a() {
        this.f71245i = false;
    }
}
