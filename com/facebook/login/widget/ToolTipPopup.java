package com.facebook.login.widget;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.facebook.internal.instrument.crashshield.CrashShieldHandler;
import com.facebook.login.C13492R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ToolTipPopup.kt */
@Metadata
/* loaded from: classes4.dex */
public final class ToolTipPopup {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_POPUP_DISPLAY_TIME = 6000;
    @NotNull
    private final WeakReference<View> anchorViewRef;
    @NotNull
    private final Context context;
    private long nuxDisplayTime;
    @Nullable
    private PopupContentView popupContent;
    @Nullable
    private PopupWindow popupWindow;
    @NotNull
    private final ViewTreeObserver.OnScrollChangedListener scrollListener;
    @NotNull
    private Style style;
    @NotNull
    private final String text;

    /* compiled from: ToolTipPopup.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* compiled from: ToolTipPopup.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public final class PopupContentView extends FrameLayout {
        @NotNull

        /* renamed from: b */
        private final ImageView f24841b;
        @NotNull

        /* renamed from: c */
        private final ImageView f24842c;
        @NotNull

        /* renamed from: d */
        private final View f24843d;
        @NotNull

        /* renamed from: f */
        private final ImageView f24844f;

        /* renamed from: g */
        final /* synthetic */ ToolTipPopup f24845g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PopupContentView(@NotNull ToolTipPopup this$0, Context context) {
            super(context);
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(context, "context");
            this.f24845g = this$0;
            LayoutInflater.from(context).inflate(C13492R.C13497layout.com_facebook_tooltip_bubble, this);
            View findViewById = findViewById(C13492R.C13495id.com_facebook_tooltip_bubble_view_top_pointer);
            if (findViewById != null) {
                this.f24841b = (ImageView) findViewById;
                View findViewById2 = findViewById(C13492R.C13495id.com_facebook_tooltip_bubble_view_bottom_pointer);
                if (findViewById2 != null) {
                    this.f24842c = (ImageView) findViewById2;
                    View findViewById3 = findViewById(C13492R.C13495id.com_facebook_body_frame);
                    Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById(R.id.com_facebook_body_frame)");
                    this.f24843d = findViewById3;
                    View findViewById4 = findViewById(C13492R.C13495id.com_facebook_button_xout);
                    if (findViewById4 != null) {
                        this.f24844f = (ImageView) findViewById4;
                        return;
                    }
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
        }

        @NotNull
        public final View getBodyFrame() {
            return this.f24843d;
        }

        @NotNull
        public final ImageView getBottomArrow() {
            return this.f24842c;
        }

        @NotNull
        public final ImageView getTopArrow() {
            return this.f24841b;
        }

        @NotNull
        public final ImageView getXOut() {
            return this.f24844f;
        }

        public final void showBottomArrow() {
            this.f24841b.setVisibility(4);
            this.f24842c.setVisibility(0);
        }

        public final void showTopArrow() {
            this.f24841b.setVisibility(0);
            this.f24842c.setVisibility(4);
        }
    }

    /* compiled from: ToolTipPopup.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public enum Style {
        BLUE,
        BLACK;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static Style[] valuesCustom() {
            Style[] valuesCustom = values();
            return (Style[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
        }
    }

    public ToolTipPopup(@NotNull String text, @NotNull View anchor) {
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(anchor, "anchor");
        this.text = text;
        this.anchorViewRef = new WeakReference<>(anchor);
        Context context = anchor.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "anchor.context");
        this.context = context;
        this.style = Style.BLUE;
        this.nuxDisplayTime = DEFAULT_POPUP_DISPLAY_TIME;
        this.scrollListener = new ViewTreeObserver.OnScrollChangedListener() { // from class: com.facebook.login.widget.h
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                ToolTipPopup.m78631a(ToolTipPopup.this);
            }
        };
    }

    /* renamed from: a */
    public static /* synthetic */ void m78631a(ToolTipPopup toolTipPopup) {
        m110186scrollListener$lambda1(toolTipPopup);
    }

    /* renamed from: b */
    public static /* synthetic */ void m78630b(ToolTipPopup toolTipPopup) {
        m110187show$lambda2(toolTipPopup);
    }

    /* renamed from: c */
    public static /* synthetic */ void m78629c(ToolTipPopup toolTipPopup, View view) {
        m110188show$lambda3(toolTipPopup, view);
    }

    private final void registerObserver() {
        ViewTreeObserver viewTreeObserver;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            unregisterObserver();
            View view = this.anchorViewRef.get();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.addOnScrollChangedListener(this.scrollListener);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    /* renamed from: scrollListener$lambda-1 */
    public static final void m110186scrollListener$lambda1(ToolTipPopup this$0) {
        PopupWindow popupWindow;
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (this$0.anchorViewRef.get() != null && (popupWindow = this$0.popupWindow) != null && popupWindow.isShowing()) {
                if (popupWindow.isAboveAnchor()) {
                    PopupContentView popupContentView = this$0.popupContent;
                    if (popupContentView != null) {
                        popupContentView.showBottomArrow();
                        return;
                    }
                    return;
                }
                PopupContentView popupContentView2 = this$0.popupContent;
                if (popupContentView2 != null) {
                    popupContentView2.showTopArrow();
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
        }
    }

    /* renamed from: show$lambda-2 */
    public static final void m110187show$lambda2(ToolTipPopup this$0) {
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dismiss();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
        }
    }

    /* renamed from: show$lambda-3 */
    public static final void m110188show$lambda3(ToolTipPopup this$0, View view) {
        if (CrashShieldHandler.isObjectCrashing(ToolTipPopup.class)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this$0.dismiss();
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, ToolTipPopup.class);
        }
    }

    private final void unregisterObserver() {
        ViewTreeObserver viewTreeObserver;
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            View view = this.anchorViewRef.get();
            if (view != null && (viewTreeObserver = view.getViewTreeObserver()) != null) {
                viewTreeObserver.removeOnScrollChangedListener(this.scrollListener);
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    private final void updateArrows() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            PopupWindow popupWindow = this.popupWindow;
            if (popupWindow != null && popupWindow.isShowing()) {
                if (popupWindow.isAboveAnchor()) {
                    PopupContentView popupContentView = this.popupContent;
                    if (popupContentView != null) {
                        popupContentView.showBottomArrow();
                        return;
                    }
                    return;
                }
                PopupContentView popupContentView2 = this.popupContent;
                if (popupContentView2 != null) {
                    popupContentView2.showTopArrow();
                }
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void dismiss() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            unregisterObserver();
            PopupWindow popupWindow = this.popupWindow;
            if (popupWindow != null) {
                popupWindow.dismiss();
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setNuxDisplayTime(long j) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            this.nuxDisplayTime = j;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void setStyle(@NotNull Style style) {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            Intrinsics.checkNotNullParameter(style, "style");
            this.style = style;
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }

    public final void show() {
        if (CrashShieldHandler.isObjectCrashing(this)) {
            return;
        }
        try {
            if (this.anchorViewRef.get() != null) {
                PopupContentView popupContentView = new PopupContentView(this, this.context);
                this.popupContent = popupContentView;
                View findViewById = popupContentView.findViewById(C13492R.C13495id.com_facebook_tooltip_bubble_view_text_body);
                if (findViewById != null) {
                    ((TextView) findViewById).setText(this.text);
                    if (this.style == Style.BLUE) {
                        popupContentView.getBodyFrame().setBackgroundResource(C13492R.C13494drawable.com_facebook_tooltip_blue_background);
                        popupContentView.getBottomArrow().setImageResource(C13492R.C13494drawable.com_facebook_tooltip_blue_bottomnub);
                        popupContentView.getTopArrow().setImageResource(C13492R.C13494drawable.com_facebook_tooltip_blue_topnub);
                        popupContentView.getXOut().setImageResource(C13492R.C13494drawable.com_facebook_tooltip_blue_xout);
                    } else {
                        popupContentView.getBodyFrame().setBackgroundResource(C13492R.C13494drawable.com_facebook_tooltip_black_background);
                        popupContentView.getBottomArrow().setImageResource(C13492R.C13494drawable.com_facebook_tooltip_black_bottomnub);
                        popupContentView.getTopArrow().setImageResource(C13492R.C13494drawable.com_facebook_tooltip_black_topnub);
                        popupContentView.getXOut().setImageResource(C13492R.C13494drawable.com_facebook_tooltip_black_xout);
                    }
                    View decorView = ((Activity) this.context).getWindow().getDecorView();
                    Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
                    int width = decorView.getWidth();
                    int height = decorView.getHeight();
                    registerObserver();
                    popupContentView.measure(View.MeasureSpec.makeMeasureSpec(width, Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(height, Integer.MIN_VALUE));
                    PopupWindow popupWindow = new PopupWindow(popupContentView, popupContentView.getMeasuredWidth(), popupContentView.getMeasuredHeight());
                    this.popupWindow = popupWindow;
                    popupWindow.showAsDropDown(this.anchorViewRef.get());
                    updateArrows();
                    if (this.nuxDisplayTime > 0) {
                        popupContentView.postDelayed(new Runnable() { // from class: com.facebook.login.widget.i
                            @Override // java.lang.Runnable
                            public final void run() {
                                ToolTipPopup.m78630b(ToolTipPopup.this);
                            }
                        }, this.nuxDisplayTime);
                    }
                    popupWindow.setTouchable(true);
                    popupContentView.setOnClickListener(new View.OnClickListener() { // from class: com.facebook.login.widget.j
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            ToolTipPopup.m78629c(ToolTipPopup.this, view);
                        }
                    });
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
            }
        } catch (Throwable th) {
            CrashShieldHandler.handleThrowable(th, this);
        }
    }
}
