package com.ironsource;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C20624p6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: com.ironsource.p6 */
/* loaded from: classes6.dex */
public final class C20624p6 extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final InterfaceC19789du f52382a;

    @Metadata
    /* renamed from: com.ironsource.p6$a */
    /* loaded from: classes6.dex */
    public static final class C20625a implements InterfaceC19789du {
        C20625a() {
            C20624p6.this = r1;
        }

        /* renamed from: b */
        public static /* synthetic */ void m55864b(View view, C20624p6 c20624p6) {
            m55865a(view, c20624p6);
        }

        @Override // com.ironsource.InterfaceC19789du
        /* renamed from: a */
        public void mo55866a(@NotNull View view, @NotNull FrameLayout.LayoutParams layoutParams) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(layoutParams, "layoutParams");
            final View childAt = C20624p6.this.getChildAt(0);
            C20624p6.this.addView(view, layoutParams);
            final C20624p6 c20624p6 = C20624p6.this;
            c20624p6.postDelayed(new Runnable() { // from class: com.ironsource.az
                @Override // java.lang.Runnable
                public final void run() {
                    C20624p6.C20625a.m55864b(childAt, c20624p6);
                }
            }, 1000L);
        }

        /* renamed from: a */
        public static final void m55865a(View view, C20624p6 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            if (view != null) {
                this$0.removeView(view);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20624p6(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f52382a = new C20625a();
    }

    @NotNull
    public final InterfaceC19789du getViewBinder() {
        return this.f52382a;
    }
}
