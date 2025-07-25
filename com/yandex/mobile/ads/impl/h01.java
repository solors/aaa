package com.yandex.mobile.ads.impl;

import be.MathJVM;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C37566w;
import kotlin.collections._Collections;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes8.dex */
public final class h01 {
    /* renamed from: a */
    public static double m33743a(@NotNull List imageValues) {
        int m17154x;
        int m17154x2;
        Object next;
        List m17561R0;
        int m103792c;
        bh0 bh0Var;
        Intrinsics.checkNotNullParameter(imageValues, "imageValues");
        m17154x = C37566w.m17154x(imageValues, 10);
        ArrayList arrayList = new ArrayList(m17154x);
        Iterator it = imageValues.iterator();
        while (true) {
            double d = 0.0d;
            if (!it.hasNext()) {
                break;
            }
            if (((bh0) it.next()).m35475a() != 0) {
                d = bh0Var.m35469g() / bh0Var.m35475a();
            }
            arrayList.add(Double.valueOf(d));
        }
        m17154x2 = C37566w.m17154x(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(m17154x2);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            m103792c = MathJVM.m103792c(((Number) it2.next()).doubleValue() * 1000);
            arrayList2.add(Integer.valueOf(m103792c));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it3 = arrayList2.iterator();
        while (true) {
            int i = 1;
            if (!it3.hasNext()) {
                break;
            }
            int intValue = ((Number) it3.next()).intValue();
            Integer valueOf = Integer.valueOf(intValue);
            Integer num = (Integer) linkedHashMap.get(Integer.valueOf(intValue));
            if (num != null) {
                i = 1 + num.intValue();
            }
            linkedHashMap.put(valueOf, Integer.valueOf(i));
        }
        Iterator it4 = linkedHashMap.entrySet().iterator();
        Integer num2 = null;
        if (!it4.hasNext()) {
            next = null;
        } else {
            next = it4.next();
            if (it4.hasNext()) {
                int intValue2 = ((Number) ((Map.Entry) next).getValue()).intValue();
                do {
                    Object next2 = it4.next();
                    int intValue3 = ((Number) ((Map.Entry) next2).getValue()).intValue();
                    if (intValue2 < intValue3) {
                        next = next2;
                        intValue2 = intValue3;
                    }
                } while (it4.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry != null) {
            num2 = (Integer) entry.getValue();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            int intValue4 = ((Number) entry2.getValue()).intValue();
            if (num2 != null && intValue4 == num2.intValue()) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        ArrayList arrayList3 = new ArrayList(linkedHashMap2.size());
        for (Map.Entry entry3 : linkedHashMap2.entrySet()) {
            arrayList3.add(Double.valueOf(((Number) entry3.getKey()).intValue() / 1000));
        }
        m17561R0 = _Collections.m17561R0(arrayList3);
        int size = m17561R0.size();
        int i2 = size / 2;
        if (arrayList3.isEmpty()) {
            return 0.0d;
        }
        int i3 = size % 2;
        if (i3 + ((((i3 ^ 2) & ((-i3) | i3)) >> 31) & 2) == 1) {
            return ((Number) m17561R0.get(i2)).doubleValue();
        }
        return (((Number) m17561R0.get(i2 - 1)).doubleValue() + ((Number) m17561R0.get(i2)).doubleValue()) / 2;
    }
}
