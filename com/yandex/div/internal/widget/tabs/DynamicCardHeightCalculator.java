package com.yandex.div.internal.widget.tabs;

import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;

@MainThread
/* renamed from: com.yandex.div.internal.widget.tabs.l */
/* loaded from: classes8.dex */
public class DynamicCardHeightCalculator extends BaseCardHeightCalculator {
    public DynamicCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.InterfaceC29876b interfaceC29876b, @NonNull HeightCalculatorFactory.InterfaceC29875a interfaceC29875a) {
        super(viewGroup, interfaceC29876b, interfaceC29875a);
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator, com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.InterfaceC29854a
    /* renamed from: a */
    public int mo36072a(int i, int i2) {
        mo36115b();
        return super.mo36072a(i, i2);
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.InterfaceC29854a
    /* renamed from: c */
    public boolean mo36070c(int i, float f) {
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    /* renamed from: f */
    protected int mo36069f(@NonNull TabMeasurement tabMeasurement, int i, float f) {
        if (f < 0.01f) {
            return tabMeasurement.m36065c(i);
        }
        int m36065c = tabMeasurement.m36065c(i);
        return Math.round(m36065c + ((tabMeasurement.m36065c(i + 1) - m36065c) * f));
    }
}
