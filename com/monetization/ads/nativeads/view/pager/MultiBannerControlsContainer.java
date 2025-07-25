package com.monetization.ads.nativeads.view.pager;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.yandex.mobile.ads.C29880R;
import com.yandex.mobile.ads.impl.as1;
import com.yandex.mobile.ads.impl.e30;
import com.yandex.mobile.ads.impl.yp1;
import com.yandex.mobile.ads.impl.z10;
import kotlin.Metadata;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

@Metadata
/* loaded from: classes7.dex */
public final class MultiBannerControlsContainer extends FrameLayout {
    @NotNull

    /* renamed from: a */
    private final z10 f66555a;
    @NotNull

    /* renamed from: b */
    private final InterfaceC38501j f66556b;
    @NotNull

    /* renamed from: c */
    private final e30 f66557c;

    /* renamed from: d */
    private boolean f66558d;

    /* renamed from: com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer$a */
    /* loaded from: classes7.dex */
    static final class C25612a extends Lambda implements Functions<Boolean> {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C25612a() {
            super(0);
            MultiBannerControlsContainer.this = r1;
        }

        @Override // kotlin.jvm.functions.Functions
        public final Boolean invoke() {
            boolean z;
            int i = as1.f76895l;
            as1 m35776a = as1.C29962a.m35776a();
            Context context = MultiBannerControlsContainer.this.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            yp1 m35796a = m35776a.m35796a(context);
            if (m35796a != null && !m35796a.m26751j0()) {
                z = true;
            } else {
                z = false;
            }
            return Boolean.valueOf(z);
        }
    }

    /* renamed from: com.monetization.ads.nativeads.view.pager.MultiBannerControlsContainer$b */
    /* loaded from: classes7.dex */
    public static final class C25613b extends ViewPager2.OnPageChangeCallback {

        /* renamed from: a */
        final /* synthetic */ ViewPager2 f66560a;

        /* renamed from: b */
        final /* synthetic */ MultiBannerControlsContainer f66561b;

        C25613b(ViewPager2 viewPager2, MultiBannerControlsContainer multiBannerControlsContainer) {
            this.f66560a = viewPager2;
            this.f66561b = multiBannerControlsContainer;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public final void onPageSelected(int i) {
            int i2;
            RecyclerView.Adapter adapter = this.f66560a.getAdapter();
            if (adapter != null) {
                i2 = adapter.getItemCount();
            } else {
                i2 = 0;
            }
            this.f66561b.m44270a(i, i2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context) {
        super(context);
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66555a = new z10();
        m14554a = LazyJVM.m14554a(new C25612a());
        this.f66556b = m14554a;
        this.f66557c = new e30();
        this.f66558d = true;
    }

    public final void setOnClickLeftButtonListener(@NotNull View.OnClickListener listener) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(listener, "listener");
        View findViewById = findViewById(C29880R.C29884id.left_scroll_control_button);
        if (findViewById instanceof ImageView) {
            imageView = (ImageView) findViewById;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    public final void setOnClickRightButtonListener(@NotNull View.OnClickListener listener) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(listener, "listener");
        View findViewById = findViewById(C29880R.C29884id.right_scroll_control_button);
        if (findViewById instanceof ImageView) {
            imageView = (ImageView) findViewById;
        } else {
            imageView = null;
        }
        if (imageView != null) {
            imageView.setOnClickListener(listener);
        }
    }

    /* renamed from: a */
    public final void m44269a(@NotNull ViewPager2 viewPager) {
        Intrinsics.checkNotNullParameter(viewPager, "viewPager");
        viewPager.registerOnPageChangeCallback(new C25613b(viewPager, this));
        viewPager.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: com.monetization.ads.nativeads.view.pager.a
            {
                MultiBannerControlsContainer.this = this;
            }

            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                MultiBannerControlsContainer.m44267a(MultiBannerControlsContainer.this, view, i, i2, i3, i4, i5, i6, i7, i8);
            }
        });
    }

    /* renamed from: a */
    public static final void m44267a(MultiBannerControlsContainer this$0, View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (view instanceof ViewPager2) {
            boolean z = this$0.f66558d;
            boolean m34691a = this$0.f66557c.m34691a(view, i, i2, i3, i4);
            this$0.f66558d = m34691a;
            if (m34691a != z) {
                ViewPager2 viewPager2 = (ViewPager2) view;
                int currentItem = viewPager2.getCurrentItem();
                RecyclerView.Adapter adapter = viewPager2.getAdapter();
                this$0.m44270a(currentItem, adapter != null ? adapter.getItemCount() : 0);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66555a = new z10();
        m14554a = LazyJVM.m14554a(new C25612a());
        this.f66556b = m14554a;
        this.f66557c = new e30();
        this.f66558d = true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66555a = new z10();
        m14554a = LazyJVM.m14554a(new C25612a());
        this.f66556b = m14554a;
        this.f66557c = new e30();
        this.f66558d = true;
    }

    /* renamed from: a */
    public final void m44270a(int i, int i2) {
        int i3 = C29880R.C29884id.left_scroll_control_button;
        View findViewById = findViewById(i3);
        ImageView imageView = findViewById instanceof ImageView ? (ImageView) findViewById : null;
        int i4 = C29880R.C29884id.right_scroll_control_button;
        View findViewById2 = findViewById(i4);
        ImageView imageView2 = findViewById2 instanceof ImageView ? (ImageView) findViewById2 : null;
        int i5 = C29880R.C29884id.dot_indicator;
        View findViewById3 = findViewById(i5);
        ImageView imageView3 = findViewById3 instanceof ImageView ? (ImageView) findViewById3 : null;
        if (!this.f66558d) {
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
            if (imageView3 == null) {
                return;
            }
            imageView3.setVisibility(8);
            return;
        }
        View findViewById4 = findViewById(i5);
        ImageView imageView4 = findViewById4 instanceof ImageView ? (ImageView) findViewById4 : null;
        if (imageView4 != null) {
            imageView4.setVisibility(0);
            z10 z10Var = this.f66555a;
            Context context = getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            imageView4.setImageDrawable(z10Var.m26480a(context, i, i2));
        }
        View findViewById5 = findViewById(i3);
        ImageView imageView5 = findViewById5 instanceof ImageView ? (ImageView) findViewById5 : null;
        View findViewById6 = findViewById(i4);
        ImageView imageView6 = findViewById6 instanceof ImageView ? (ImageView) findViewById6 : null;
        if (!((Boolean) this.f66556b.getValue()).booleanValue() || imageView5 == null || imageView6 == null) {
            if (imageView5 != null) {
                imageView5.setVisibility(8);
            }
            if (imageView6 == null) {
                return;
            }
            imageView6.setVisibility(8);
        } else if (i == 0) {
            imageView5.setVisibility(8);
            imageView6.setVisibility(0);
        } else if (i == i2 - 1) {
            imageView5.setVisibility(0);
            imageView6.setVisibility(8);
        } else {
            imageView5.setVisibility(0);
            imageView6.setVisibility(0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiBannerControlsContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        InterfaceC38501j m14554a;
        Intrinsics.checkNotNullParameter(context, "context");
        this.f66555a = new z10();
        m14554a = LazyJVM.m14554a(new C25612a());
        this.f66556b = m14554a;
        this.f66557c = new e30();
        this.f66558d = true;
    }
}
