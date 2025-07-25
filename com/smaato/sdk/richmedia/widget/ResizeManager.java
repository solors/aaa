package com.smaato.sdk.richmedia.widget;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.smaato.sdk.core.log.LogDomain;
import com.smaato.sdk.core.log.Logger;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.Threads;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.richmedia.mraid.Views;
import com.smaato.sdk.richmedia.util.ViewUtils;
import com.smaato.sdk.richmedia.widget.ClosableView;
import com.smaato.sdk.richmedia.widget.ResizeManager;

/* loaded from: classes7.dex */
public final class ResizeManager {
    @NonNull

    /* renamed from: a */
    private final Logger f72344a;
    @NonNull

    /* renamed from: b */
    private final Rect f72345b;
    @NonNull

    /* renamed from: c */
    private final View f72346c;
    @NonNull

    /* renamed from: d */
    private final ClosableView f72347d;
    @Nullable

    /* renamed from: e */
    private Listener f72348e;

    /* loaded from: classes7.dex */
    public interface Listener {
        void onCloseClicked(@NonNull ImageButton imageButton);

        void onResizeFailed(@NonNull String str);

        void onResized(@NonNull ImageButton imageButton);
    }

    public ResizeManager(@NonNull Logger logger, @NonNull View view, @NonNull Rect rect) {
        this.f72344a = (Logger) Objects.requireNonNull(logger);
        this.f72346c = (View) Objects.requireNonNull(view);
        this.f72345b = (Rect) Objects.requireNonNull(rect);
        ClosableView closableView = new ClosableView(view.getContext());
        this.f72347d = closableView;
        closableView.setOnCloseClickListener(new ClosableView.OnCloseClickListener() { // from class: com.smaato.sdk.richmedia.widget.j
            @Override // com.smaato.sdk.richmedia.widget.ClosableView.OnCloseClickListener
            public final void onCloseClick() {
                ResizeManager.m39004a(ResizeManager.this);
            }
        });
    }

    /* renamed from: a */
    public static /* synthetic */ void m39004a(ResizeManager resizeManager) {
        resizeManager.m38995j();
    }

    /* renamed from: b */
    public static /* synthetic */ void m39003b(ResizeManager resizeManager, Listener listener) {
        resizeManager.m38993l(listener);
    }

    /* renamed from: c */
    public static /* synthetic */ void m39002c(ResizeManager resizeManager) {
        resizeManager.m38992m();
    }

    /* renamed from: d */
    public static /* synthetic */ void m39001d(String str, Listener listener) {
        listener.onResizeFailed(str);
    }

    /* renamed from: e */
    public static /* synthetic */ void m39000e(ResizeManager resizeManager) {
        resizeManager.m38997h();
    }

    /* renamed from: f */
    public static /* synthetic */ void m38999f(ResizeManager resizeManager, Listener listener) {
        resizeManager.m38996i(listener);
    }

    /* renamed from: h */
    public /* synthetic */ void m38997h() {
        ViewUtils.removeFromParent(this.f72347d);
    }

    /* renamed from: i */
    public /* synthetic */ void m38996i(Listener listener) {
        listener.onCloseClicked(this.f72347d.getCloseButton());
    }

    /* renamed from: j */
    public /* synthetic */ void m38995j() {
        Objects.onNotNull(this.f72348e, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.m
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ResizeManager.m38999f(ResizeManager.this, (ResizeManager.Listener) obj);
            }
        });
    }

    /* renamed from: l */
    public /* synthetic */ void m38993l(Listener listener) {
        listener.onResized(this.f72347d.getCloseButton());
    }

    /* renamed from: m */
    public /* synthetic */ void m38992m() {
        Objects.onNotNull(this.f72348e, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.n
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ResizeManager.m39003b(ResizeManager.this, (ResizeManager.Listener) obj);
            }
        });
    }

    /* renamed from: n */
    private void m38991n(@NonNull final String str) {
        this.f72344a.error(LogDomain.RICH_MEDIA, str, new Object[0]);
        Objects.onNotNull(this.f72348e, new Consumer() { // from class: com.smaato.sdk.richmedia.widget.o
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                ResizeManager.m39001d(str, (ResizeManager.Listener) obj);
            }
        });
    }

    /* renamed from: g */
    public void m38998g() {
        Threads.runOnNextUiFrame(new Runnable() { // from class: com.smaato.sdk.richmedia.widget.l
            @Override // java.lang.Runnable
            public final void run() {
                ResizeManager.m39000e(ResizeManager.this);
            }
        });
    }

    /* renamed from: o */
    public void m38990o(@NonNull Rect rect) {
        View rootView = ViewUtils.getRootView(this.f72346c);
        if (!(rootView instanceof ViewGroup)) {
            m38991n("Cannot find a root view for a resizable-view");
            return;
        }
        ViewGroup viewGroup = (ViewGroup) rootView;
        if (!this.f72347d.isCloseRegionVisible(this.f72345b, rect)) {
            m38991n("The close region cannot appear within the maximum allowed size");
            return;
        }
        if (!this.f72347d.hasContent()) {
            ViewUtils.removeFromParent(this.f72346c);
            this.f72347d.addContent(this.f72346c);
            viewGroup.addView(this.f72347d);
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f72347d.getLayoutParams();
        marginLayoutParams.width = rect.width();
        marginLayoutParams.height = rect.height();
        marginLayoutParams.topMargin = rect.top;
        marginLayoutParams.leftMargin = rect.left;
        this.f72347d.setLayoutParams(marginLayoutParams);
        Views.addOnPreDrawListener(this.f72347d, new Runnable() { // from class: com.smaato.sdk.richmedia.widget.k
            @Override // java.lang.Runnable
            public final void run() {
                ResizeManager.m39002c(ResizeManager.this);
            }
        });
    }

    /* renamed from: p */
    public void m38989p(@Nullable Listener listener) {
        this.f72348e = listener;
    }
}
