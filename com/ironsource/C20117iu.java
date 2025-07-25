package com.ironsource;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.iu */
/* loaded from: classes6.dex */
public final class C20117iu {
    @NotNull

    /* renamed from: a */
    private final InterfaceC20160jn f50641a;
    @Nullable

    /* renamed from: b */
    private View f50642b;

    /* renamed from: c */
    private boolean f50643c;
    @NotNull

    /* renamed from: d */
    private final ViewTreeObserver.OnGlobalLayoutListener f50644d;
    @NotNull

    /* renamed from: e */
    private final ViewTreeObserver.OnWindowFocusChangeListener f50645e;
    @NotNull

    /* renamed from: f */
    private final Rect f50646f;

    public C20117iu(@NotNull InterfaceC20160jn onVisibilityChangeListener) {
        Intrinsics.checkNotNullParameter(onVisibilityChangeListener, "onVisibilityChangeListener");
        this.f50641a = onVisibilityChangeListener;
        this.f50644d = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: com.ironsource.rw
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                C20117iu.m57932b(C20117iu.this);
            }
        };
        this.f50645e = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: com.ironsource.sw
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                C20117iu.m57930c(C20117iu.this, z);
            }
        };
        this.f50646f = new Rect();
    }

    /* renamed from: a */
    private final void m57937a() {
        boolean m57931c = m57931c();
        if (this.f50643c != m57931c) {
            this.f50643c = m57931c;
            this.f50641a.mo57799a(m57931c);
        }
    }

    /* renamed from: b */
    public static /* synthetic */ void m57932b(C20117iu c20117iu) {
        m57935a(c20117iu);
    }

    /* renamed from: c */
    public static /* synthetic */ void m57930c(C20117iu c20117iu, boolean z) {
        m57934a(c20117iu, z);
    }

    /* renamed from: a */
    public final void m57936a(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.f50642b = view;
        view.getViewTreeObserver().addOnGlobalLayoutListener(this.f50644d);
        view.getViewTreeObserver().addOnWindowFocusChangeListener(this.f50645e);
    }

    /* renamed from: b */
    public final void m57933b() {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver viewTreeObserver2;
        View view = this.f50642b;
        if (view != null && (viewTreeObserver2 = view.getViewTreeObserver()) != null) {
            viewTreeObserver2.removeOnGlobalLayoutListener(this.f50644d);
        }
        View view2 = this.f50642b;
        if (view2 != null && (viewTreeObserver = view2.getViewTreeObserver()) != null) {
            viewTreeObserver.removeOnWindowFocusChangeListener(this.f50645e);
        }
        this.f50642b = null;
    }

    /* renamed from: c */
    public final boolean m57931c() {
        View view = this.f50642b;
        if (view != null && view.isShown()) {
            View view2 = this.f50642b;
            if (view2 != null && view2.hasWindowFocus()) {
                View view3 = this.f50642b;
                return view3 != null && view3.getGlobalVisibleRect(this.f50646f);
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public static final void m57935a(C20117iu this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m57937a();
    }

    /* renamed from: a */
    public static final void m57934a(C20117iu this$0, boolean z) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.m57937a();
    }
}
