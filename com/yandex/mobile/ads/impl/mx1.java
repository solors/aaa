package com.yandex.mobile.ads.impl;

import com.monetization.ads.core.utils.CallbackStackTraceMarker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.C37572z0;
import kotlin.collections._Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.StringsJVM;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes8.dex */
public final class mx1 {
    @Nullable
    /* renamed from: a */
    public static StackTraceElement m31751a(@NotNull StackTraceElement[] stackTraceElementArr) {
        Set m17123f;
        Object m17324b0;
        boolean m16624M;
        boolean m16624M2;
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        m17123f = C37572z0.m17123f();
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
            m16624M = StringsJVM.m16624M(className, "com.yandex.mobile.ads", false, 2, null);
            if (!m16624M) {
                m16624M2 = StringsJVM.m16624M(className, "com.monetization.ads", false, 2, null);
                if (!m16624M2) {
                    continue;
                    i++;
                }
            }
            if (!m31752a(stackTraceElement, m17123f)) {
                break;
            }
            i++;
        }
        m17324b0 = _Arrays.m17324b0(stackTraceElementArr, i);
        return (StackTraceElement) m17324b0;
    }

    /* renamed from: a */
    private static boolean m31752a(StackTraceElement stackTraceElement, Set set) {
        boolean m16592R;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (((t30) obj).m29311a() == u30.f86095b) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String stackTraceElement2 = stackTraceElement.toString();
            Intrinsics.checkNotNullExpressionValue(stackTraceElement2, "toString(...)");
            m16592R = C37690r.m16592R(stackTraceElement2, ((t30) it.next()).m29310b(), false, 2, null);
            if (m16592R) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m31750a(@NotNull StackTraceElement[] stackTraceElementArr, @NotNull Set exclusions) {
        Object m17324b0;
        Object m17324b02;
        String className;
        Object m17324b03;
        String className2;
        boolean m16624M;
        Object m17324b04;
        String className3;
        boolean m16624M2;
        boolean m16624M3;
        boolean m16624M4;
        boolean m16592R;
        Intrinsics.checkNotNullParameter(stackTraceElementArr, "<this>");
        Intrinsics.checkNotNullParameter(exclusions, "exclusions");
        ArrayList arrayList = new ArrayList();
        for (Object obj : exclusions) {
            if (((t30) obj).m29311a() == u30.f86096c) {
                arrayList.add(obj);
            }
        }
        boolean z = false;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                String arrays = Arrays.toString(stackTraceElementArr);
                Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
                m16592R = C37690r.m16592R(arrays, ((t30) it.next()).m29310b(), false, 2, null);
                if (m16592R) {
                    return false;
                }
            }
        }
        int length = stackTraceElementArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            }
            StackTraceElement stackTraceElement = stackTraceElementArr[i];
            String className4 = stackTraceElement.getClassName();
            Intrinsics.checkNotNullExpressionValue(className4, "getClassName(...)");
            m16624M3 = StringsJVM.m16624M(className4, "com.yandex.mobile.ads", false, 2, null);
            if (!m16624M3) {
                m16624M4 = StringsJVM.m16624M(className4, "com.monetization.ads", false, 2, null);
                if (!m16624M4) {
                    continue;
                    i++;
                }
            }
            if (!m31752a(stackTraceElement, exclusions)) {
                break;
            }
            i++;
        }
        if (i == -1) {
            return false;
        }
        do {
            i++;
            m17324b0 = _Arrays.m17324b0(stackTraceElementArr, i);
            StackTraceElement stackTraceElement2 = (StackTraceElement) m17324b0;
            if (stackTraceElement2 != null && !m31752a(stackTraceElement2, exclusions)) {
                m17324b03 = _Arrays.m17324b0(stackTraceElementArr, i);
                StackTraceElement stackTraceElement3 = (StackTraceElement) m17324b03;
                if (stackTraceElement3 != null && (className2 = stackTraceElement3.getClassName()) != null) {
                    m16624M = StringsJVM.m16624M(className2, "com.yandex.mobile.ads", false, 2, null);
                    if (!m16624M) {
                        m16624M2 = StringsJVM.m16624M(className2, "com.monetization.ads", false, 2, null);
                        if (!m16624M2) {
                            break;
                        }
                    }
                    m17324b04 = _Arrays.m17324b0(stackTraceElementArr, i);
                    StackTraceElement stackTraceElement4 = (StackTraceElement) m17324b04;
                    if (stackTraceElement4 == null || (className3 = stackTraceElement4.getClassName()) == null) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                break;
            }
        } while (!Intrinsics.m17075f(className3, CallbackStackTraceMarker.class.getName()));
        m17324b02 = _Arrays.m17324b0(stackTraceElementArr, i);
        StackTraceElement stackTraceElement5 = (StackTraceElement) m17324b02;
        if (stackTraceElement5 != null && (className = stackTraceElement5.getClassName()) != null && Intrinsics.m17075f(className, CallbackStackTraceMarker.class.getName())) {
            z = true;
        }
        return !z;
    }
}
