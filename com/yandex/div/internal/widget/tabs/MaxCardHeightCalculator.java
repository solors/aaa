package com.yandex.div.internal.widget.tabs;

import android.util.SparseArray;
import android.view.ViewGroup;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import com.yandex.div.internal.widget.tabs.HeightCalculatorFactory;
import sa.C39638b;

@MainThread
/* renamed from: com.yandex.div.internal.widget.tabs.n */
/* loaded from: classes8.dex */
public class MaxCardHeightCalculator extends BaseCardHeightCalculator {
    public MaxCardHeightCalculator(@NonNull ViewGroup viewGroup, @NonNull HeightCalculatorFactory.InterfaceC29876b interfaceC29876b, @NonNull HeightCalculatorFactory.InterfaceC29875a interfaceC29875a) {
        super(viewGroup, interfaceC29876b, interfaceC29875a);
    }

    /* renamed from: j */
    private boolean m36068j() {
        boolean z;
        if (this.f76397d.size() > 0) {
            z = true;
        } else {
            z = false;
        }
        C39638b.m12002j(z);
        SparseArray<TabMeasurement> sparseArray = this.f76397d;
        TabMeasurement valueAt = sparseArray.valueAt(sparseArray.size() - 1);
        if (valueAt.m36067a() == valueAt.m36066b()) {
            return false;
        }
        return true;
    }

    @Override // com.yandex.div.internal.widget.tabs.ViewPagerFixedSizeLayout.InterfaceC29854a
    /* renamed from: c */
    public boolean mo36070c(int i, float f) {
        if (m36112g()) {
            return true;
        }
        if ((i == 0 || (i == 1 && f <= 0.0f)) && m36068j()) {
            return true;
        }
        return false;
    }

    @Override // com.yandex.div.internal.widget.tabs.BaseCardHeightCalculator
    /* renamed from: f */
    protected int mo36069f(@NonNull TabMeasurement tabMeasurement, int i, float f) {
        if (i > 0) {
            return tabMeasurement.m36066b();
        }
        if (f < 0.01f) {
            return tabMeasurement.m36067a();
        }
        int m36067a = tabMeasurement.m36067a();
        return Math.round(m36067a + ((tabMeasurement.m36066b() - m36067a) * f));
    }
}
