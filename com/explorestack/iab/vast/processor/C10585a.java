package com.explorestack.iab.vast.processor;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.explorestack.iab.utils.C10512g;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p734j1.C37248c;
import p767l1.C37904m;
import p767l1.C37905n;

/* renamed from: com.explorestack.iab.vast.processor.a */
/* loaded from: classes3.dex */
public class C10585a extends AbstractC10588b<C37905n> {

    /* renamed from: b */
    private int f24268b;

    /* renamed from: c */
    private boolean f24269c;

    /* renamed from: com.explorestack.iab.vast.processor.a$b */
    /* loaded from: classes3.dex */
    private class C10587b implements Comparator<Pair<C37904m, C37905n>> {
        private C10587b() {
        }

        @Override // java.util.Comparator
        /* renamed from: a */
        public int compare(Pair<C37904m, C37905n> pair, Pair<C37904m, C37905n> pair2) {
            int m15779T = ((C37905n) pair.second).m15779T() * ((C37905n) pair.second).m15781R();
            int m15779T2 = ((C37905n) pair2.second).m15779T() * ((C37905n) pair2.second).m15781R();
            int abs = Math.abs(m15779T - C10585a.this.f24268b);
            int abs2 = Math.abs(m15779T2 - C10585a.this.f24268b);
            C37248c.m18681a("DefaultMediaPicker", "AreaComparator: obj1 - %d, obj2 - %d", Integer.valueOf(abs), Integer.valueOf(abs2));
            if (abs < abs2) {
                return -1;
            }
            if (abs <= abs2) {
                return 0;
            }
            return 1;
        }
    }

    public C10585a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        m78994c(displayMetrics.widthPixels, displayMetrics.heightPixels);
        this.f24269c = C10512g.m79293x(context);
    }

    /* renamed from: c */
    private void m78994c(int i, int i2) {
        this.f24268b = i * i2;
    }

    /* renamed from: e */
    private Pair<C37904m, C37905n> m78992e(@NonNull List<Pair<C37904m, C37905n>> list) {
        C37248c.m18681a("DefaultMediaPicker", "getBestMatch", new Object[0]);
        Pair<C37904m, C37905n> pair = null;
        for (Pair<C37904m, C37905n> pair2 : list) {
            if (m78993d((C37905n) pair2.second)) {
                if (m78991f((C37905n) pair2.second)) {
                    return pair2;
                }
                if (pair == null) {
                    pair = pair2;
                }
            }
        }
        return pair;
    }

    @Override // com.explorestack.iab.vast.processor.AbstractC10588b
    /* renamed from: a */
    public Pair<C37904m, C37905n> mo78989a(@Nullable List<Pair<C37904m, C37905n>> list) {
        if (list == null) {
            return null;
        }
        Collections.sort(list, new C10587b());
        return m78992e(list);
    }

    /* renamed from: d */
    protected boolean m78993d(C37905n c37905n) {
        return c37905n.m15780S().matches("video/.*(?i)(mp4|3gpp|mp2t|webm|matroska)");
    }

    /* renamed from: f */
    protected boolean m78991f(C37905n c37905n) {
        boolean z;
        if (c37905n.m15779T() > c37905n.m15781R()) {
            z = true;
        } else {
            z = false;
        }
        if (z == this.f24269c) {
            return true;
        }
        return false;
    }
}
