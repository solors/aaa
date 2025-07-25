package com.yandex.div.core;

import android.view.View;
import java.util.Map;
import sb.Div;

/* renamed from: com.yandex.div.core.e0 */
/* loaded from: classes8.dex */
public interface DivVisibilityChangeListener {

    /* renamed from: a */
    public static final DivVisibilityChangeListener f75254a = new DivVisibilityChangeListener() { // from class: com.yandex.div.core.d0
        @Override // com.yandex.div.core.DivVisibilityChangeListener
        /* renamed from: c */
        public final void mo37282c(Map map) {
            DivVisibilityChangeListener.m37284a(map);
        }
    };

    /* renamed from: a */
    static /* synthetic */ void m37284a(Map map) {
        m37283b(map);
    }

    /* renamed from: c */
    void mo37282c(Map<View, Div> map);

    /* renamed from: b */
    static /* synthetic */ void m37283b(Map map) {
    }
}
