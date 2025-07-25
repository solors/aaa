package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import com.yandex.div.internal.widget.tabs.TabMeasurement;
import com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout;
import sa.Log;

@MainThread
/* renamed from: com.yandex.div.internal.widget.tabs.b */
/* loaded from: classes8.dex */
public abstract class BaseCardHeightCalculator implements ViewPagerFixedSizeLayout.InterfaceC29854a {
    @NonNull

    /* renamed from: a */
    private final ViewGroup f76394a;
    @NonNull

    /* renamed from: b */
    private final HeightCalculatorFactory.InterfaceC29876b f76395b;
    @NonNull

    /* renamed from: c */
    private final HeightCalculatorFactory.InterfaceC29875a f76396c;
    @Nullable

    /* renamed from: e */
    private Bundle f76398e;
    @NonNull

    /* renamed from: d */
    protected final SparseArray<TabMeasurement> f76397d = new SparseArray<>();

    /* renamed from: f */
    private int f76399f = 0;

    /* renamed from: g */
    private float f76400g = 0.0f;

    public BaseCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.InterfaceC29876b interfaceC29876b, @NonNull HeightCalculatorFactory.InterfaceC29875a interfaceC29875a) {
        this.f76394a = viewGroup;
        this.f76395b = interfaceC29876b;
        this.f76396c = interfaceC29875a;
    }

    /* renamed from: e */
    public static /* synthetic */ int m36113e(BaseCardHeightCalculator baseCardHeightCalculator, int i, int i2, int i3) {
        return baseCardHeightCalculator.m36111h(i, i2, i3);
    }

    /* renamed from: h */
    public /* synthetic */ int m36111h(int i, int i2, int i3) {
        return this.f76395b.mo36071a(this.f76394a, i, i2, i3);
    }

    /* renamed from: i */
    private static int m36110i(int i, int i2, float f) {
        Log.m11982a("[Y:BaseCardHeightCalculator]", "New optimal height for tab " + i2 + " with position offset " + f + " is " + i);
        return i;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.InterfaceC29854a
    /* renamed from: a */
    public int mo36072a(int i, final int i2) {
        TabMeasurement tabMeasurement = this.f76397d.get(i);
        if (tabMeasurement == null) {
            int apply = this.f76396c.apply();
            if (apply == 0) {
                return 0;
            }
            final int size = View.MeasureSpec.getSize(i);
            TabMeasurement tabMeasurement2 = new TabMeasurement(apply, new TabMeasurement.InterfaceC29877a() { // from class: com.yandex.div.internal.widget.tabs.a
                @Override // com.yandex.div.internal.widget.tabs.TabMeasurement.InterfaceC29877a
                /* renamed from: a */
                public final int mo36062a(int i3) {
                    return BaseCardHeightCalculator.m36113e(BaseCardHeightCalculator.this, size, i2, i3);
                }
            });
            Bundle bundle = this.f76398e;
            if (bundle != null) {
                tabMeasurement2.m36063e(bundle, i);
                tabMeasurement2.m36064d(this.f76398e, i);
                if (this.f76398e.isEmpty()) {
                    this.f76398e = null;
                }
            }
            this.f76397d.put(i, tabMeasurement2);
            tabMeasurement = tabMeasurement2;
        }
        return m36110i(mo36069f(tabMeasurement, this.f76399f, this.f76400g), this.f76399f, this.f76400g);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.InterfaceC29854a
    /* renamed from: b */
    public void mo36115b() {
        Log.m11982a("[Y:BaseCardHeightCalculator]", "reseting layout...");
        this.f76398e = null;
        this.f76397d.clear();
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.InterfaceC29854a
    /* renamed from: d */
    public void mo36114d(int i, float f) {
        Log.m11982a("[Y:BaseCardHeightCalculator]", "request layout for tab " + i + " with position offset " + f);
        this.f76399f = i;
        this.f76400g = f;
    }

    /* renamed from: f */
    protected abstract int mo36069f(@NonNull TabMeasurement tabMeasurement, int i, float f);

    /* renamed from: g */
    public boolean m36112g() {
        if (this.f76397d.size() == 0) {
            return true;
        }
        return false;
    }
}
