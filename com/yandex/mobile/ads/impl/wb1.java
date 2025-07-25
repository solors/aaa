package com.yandex.mobile.ads.impl;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsJVM;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class wb1 {
    @NotNull
    /* renamed from: a */
    public static ArrayList m27994a(@NotNull View view) {
        ViewGroup view2;
        ViewGroup viewGroup;
        Intrinsics.checkNotNullParameter(view, "view");
        ArrayList arrayList = new ArrayList();
        int i = cc2.f77597b;
        Intrinsics.checkNotNullParameter(view, "view");
        ViewParent parent = view.getParent();
        if (parent instanceof ViewGroup) {
            view2 = (ViewGroup) parent;
        } else {
            view2 = null;
        }
        ViewGroup viewGroup2 = view;
        while (view2 != null) {
            int childCount = view2.getChildCount();
            for (int indexOfChild = view2.indexOfChild(viewGroup2) + 1; indexOfChild < childCount; indexOfChild++) {
                View childAt = view2.getChildAt(indexOfChild);
                Intrinsics.m17074g(childAt);
                arrayList.addAll(m27993b(childAt));
            }
            Intrinsics.checkNotNullParameter(view2, "view");
            ViewParent parent2 = view2.getParent();
            if (parent2 instanceof ViewGroup) {
                viewGroup = (ViewGroup) parent2;
            } else {
                viewGroup = null;
            }
            ViewGroup viewGroup3 = viewGroup;
            viewGroup2 = view2;
            view2 = viewGroup3;
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (view.getZ() <= ((View) next).getZ()) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* renamed from: b */
    private static List m27993b(View view) {
        List m17177c;
        List m17179a;
        List m17177c2;
        List m17179a2;
        m17177c = CollectionsJVM.m17177c();
        if (!cc2.m35250d(view)) {
            if (view instanceof ViewGroup) {
                if (cc2.m35249e(view)) {
                    m17177c.add(view);
                } else {
                    ViewGroup viewGroup = (ViewGroup) view;
                    m17177c2 = CollectionsJVM.m17177c();
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        Intrinsics.m17074g(childAt);
                        m17177c2.addAll(m27993b(childAt));
                    }
                    m17179a2 = CollectionsJVM.m17179a(m17177c2);
                    m17177c.addAll(m17179a2);
                }
            } else {
                m17177c.add(view);
            }
        }
        m17179a = CollectionsJVM.m17179a(m17177c);
        return m17179a;
    }
}
