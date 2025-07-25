package com.yandex.div.internal.widget.tabs;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* renamed from: com.yandex.div.internal.widget.tabs.o */
/* loaded from: classes8.dex */
class TabMeasurement {

    /* renamed from: a */
    private final int f76448a;

    /* renamed from: b */
    private int f76449b = -1;

    /* renamed from: c */
    private int f76450c = -1;

    /* renamed from: d */
    private int[] f76451d;
    @NonNull

    /* renamed from: e */
    private final InterfaceC29877a f76452e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: TabMeasurement.java */
    /* renamed from: com.yandex.div.internal.widget.tabs.o$a */
    /* loaded from: classes8.dex */
    public interface InterfaceC29877a {
        /* renamed from: a */
        int mo36062a(int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TabMeasurement(int i, @NonNull InterfaceC29877a interfaceC29877a) {
        this.f76448a = i;
        this.f76452e = interfaceC29877a;
        this.f76451d = new int[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public int m36067a() {
        if (this.f76449b < 0) {
            this.f76449b = this.f76452e.mo36062a(0);
        }
        return this.f76449b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m36066b() {
        if (this.f76450c < 0) {
            int m36067a = m36067a();
            for (int i = 1; i < this.f76448a; i++) {
                m36067a = Math.max(m36067a, this.f76452e.mo36062a(i));
            }
            this.f76450c = m36067a;
        }
        return this.f76450c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m36065c(int i) {
        int i2 = this.f76448a;
        if (i2 == 0) {
            return 0;
        }
        if (i < 0) {
            return m36065c(0);
        }
        if (i >= i2) {
            return m36065c(i2);
        }
        int[] iArr = this.f76451d;
        if (iArr[i] <= 0) {
            iArr[i] = this.f76452e.mo36062a(i);
        }
        return this.f76451d[i];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public void m36064d(@NonNull Bundle bundle, int i) {
        bundle.remove("FIRST_TAB_HEIGHT_PREFIX" + i);
        bundle.remove("MAX_TAB_HEIGHT_PREFIX" + i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public void m36063e(@NonNull Bundle bundle, int i) {
        this.f76449b = bundle.getInt("FIRST_TAB_HEIGHT_PREFIX" + i, -1);
        this.f76450c = bundle.getInt("MAX_TAB_HEIGHT_PREFIX" + i, -1);
    }
}
