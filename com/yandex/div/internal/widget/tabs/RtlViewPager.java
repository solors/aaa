package com.yandex.div.internal.widget.tabs;

import android.content.Context;
import android.util.AttributeSet;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p879s9.C39636q;

/* compiled from: RtlViewPager.kt */
@Metadata
/* loaded from: classes8.dex */
public class RtlViewPager extends ViewPager {
    @NotNull

    /* renamed from: b */
    private final HashMap<ViewPager.OnPageChangeListener, C29847a> f76348b;

    /* compiled from: RtlViewPager.kt */
    @Metadata
    /* renamed from: com.yandex.div.internal.widget.tabs.RtlViewPager$a */
    /* loaded from: classes8.dex */
    public final class C29847a implements ViewPager.OnPageChangeListener {
        @NotNull

        /* renamed from: b */
        private final ViewPager.OnPageChangeListener f76349b;

        /* renamed from: c */
        final /* synthetic */ RtlViewPager f76350c;

        public C29847a(@NotNull RtlViewPager rtlViewPager, ViewPager.OnPageChangeListener listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.f76350c = rtlViewPager;
            this.f76349b = listener;
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrollStateChanged(int i) {
            this.f76349b.onPageScrollStateChanged(i);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageScrolled(int i, float f, int i2) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (C39636q.m12013f(this.f76350c) && adapter != null) {
                int count = adapter.getCount();
                int width = ((int) (this.f76350c.getWidth() * (1 - adapter.getPageWidth(i)))) + i2;
                while (i < count && width > 0) {
                    i++;
                    width -= (int) (this.f76350c.getWidth() * adapter.getPageWidth(i));
                }
                i = (count - i) - 1;
                i2 = -width;
                f = i2 / (this.f76350c.getWidth() * adapter.getPageWidth(i));
            }
            this.f76349b.onPageScrolled(i, f, i2);
        }

        @Override // androidx.viewpager.widget.ViewPager.OnPageChangeListener
        public void onPageSelected(int i) {
            PagerAdapter adapter = RtlViewPager.super.getAdapter();
            if (C39636q.m12013f(this.f76350c) && adapter != null) {
                i = (adapter.getCount() - i) - 1;
            }
            this.f76349b.onPageSelected(i);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RtlViewPager(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        this.f76348b = new HashMap<>();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void addOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C29847a c29847a = new C29847a(this, listener);
        this.f76348b.put(listener, c29847a);
        super.addOnPageChangeListener(c29847a);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void clearOnPageChangeListeners() {
        super.clearOnPageChangeListeners();
        this.f76348b.clear();
    }

    @Override // androidx.viewpager.widget.ViewPager
    public int getCurrentItem() {
        int currentItem = super.getCurrentItem();
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && C39636q.m12013f(this)) {
            return (adapter.getCount() - currentItem) - 1;
        }
        return currentItem;
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void removeOnPageChangeListener(@NotNull ViewPager.OnPageChangeListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        C29847a remove = this.f76348b.remove(listener);
        if (remove != null) {
            super.removeOnPageChangeListener(remove);
        }
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i, boolean z) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && C39636q.m12013f(this)) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i, z);
    }

    @Override // androidx.viewpager.widget.ViewPager
    public void setCurrentItem(int i) {
        PagerAdapter adapter = super.getAdapter();
        if (adapter != null && C39636q.m12013f(this)) {
            i = (adapter.getCount() - i) - 1;
        }
        super.setCurrentItem(i);
    }
}
