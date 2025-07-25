package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import kotlin.jvm.functions.Functions;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p804nd.InterfaceC38501j;
import p804nd.LazyJVM;

/* loaded from: classes8.dex */
public final class fb2 {
    @NotNull

    /* renamed from: a */
    private static final InterfaceC38501j f79040a;

    /* renamed from: b */
    public static final /* synthetic */ int f79041b = 0;

    /* renamed from: com.yandex.mobile.ads.impl.fb2$a */
    /* loaded from: classes8.dex */
    static final class C30304a extends Lambda implements Functions<Handler> {

        /* renamed from: b */
        public static final C30304a f79042b = new C30304a();

        C30304a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Functions
        public final Handler invoke() {
            return new Handler(Looper.getMainLooper());
        }
    }

    static {
        InterfaceC38501j m14554a;
        m14554a = LazyJVM.m14554a(C30304a.f79042b);
        f79040a = m14554a;
    }

    /* renamed from: a */
    public static final void m34180a(@Nullable final ViewGroup viewGroup, final boolean z) {
        ((Handler) f79040a.getValue()).post(new Runnable() { // from class: com.yandex.mobile.ads.impl.mo2
            @Override // java.lang.Runnable
            public final void run() {
                fb2.m34178c(viewGroup, z);
            }
        });
    }

    /* renamed from: b */
    public static final void m34179b(ViewGroup viewGroup, boolean z) {
        int childCount;
        if (viewGroup != null && viewGroup.getChildCount() > 0 && (childCount = viewGroup.getChildCount() - (!z ? 1 : 0)) > 0) {
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt instanceof AbstractC31754wj) {
                    arrayList.add(childAt);
                }
            }
            viewGroup.removeViews(0, childCount);
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                ((AbstractC31754wj) arrayList.get(i2)).mo27885d();
            }
            arrayList.clear();
        }
    }

    /* renamed from: c */
    public static /* synthetic */ void m34178c(ViewGroup viewGroup, boolean z) {
        m34179b(viewGroup, z);
    }
}
