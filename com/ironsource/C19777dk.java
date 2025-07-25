package com.ironsource;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C37563v;
import kotlin.collections._Collections;
import kotlin.jvm.internal.C37612s0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.C37690r;
import kotlin.text.Regex;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: com.ironsource.dk */
/* loaded from: classes6.dex */
public final class C19777dk {
    @Nullable

    /* renamed from: a */
    private final String f49808a;

    /* renamed from: b */
    private final int f49809b;

    public C19777dk(@Nullable String str, int i) {
        this.f49808a = str;
        this.f49809b = i;
    }

    /* renamed from: b */
    private final String m58873b() {
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "stackTrace");
        String m58874a = m58874a(stackTrace, 6);
        String m58872b = m58872b(stackTrace, 6);
        C37612s0 c37612s0 = C37612s0.f99333a;
        String format = String.format("%s %s", Arrays.copyOf(new Object[]{m58874a, m58872b}, 2));
        Intrinsics.checkNotNullExpressionValue(format, "format(format, *args)");
        return format;
    }

    /* renamed from: a */
    public final int m58875a() {
        return this.f49809b;
    }

    @NotNull
    /* renamed from: c */
    public final String m58871c() {
        boolean z;
        String str = this.f49808a;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return m58873b();
        }
        return m58873b() + " - " + this.f49808a;
    }

    /* renamed from: a */
    private final String m58874a(StackTraceElement[] stackTraceElementArr, int i) {
        List m17166m;
        boolean m16592R;
        List m17166m2;
        boolean z;
        boolean z2;
        if (stackTraceElementArr.length > i) {
            String className = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
            List<String> m16763h = new Regex("\\.").m16763h(className, 0);
            if (!m16763h.isEmpty()) {
                ListIterator<String> listIterator = m16763h.listIterator(m16763h.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z2 = true;
                        continue;
                    } else {
                        z2 = false;
                        continue;
                    }
                    if (!z2) {
                        m17166m = _Collections.m17559T0(m16763h, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m17166m = C37563v.m17166m();
            String[] strArr = (String[]) m17166m.toArray(new String[0]);
            String str = strArr[strArr.length - 1];
            m16592R = C37690r.m16592R(str, "$", false, 2, null);
            if (m16592R) {
                List<String> m16763h2 = new Regex("\\$").m16763h(str, 0);
                if (!m16763h2.isEmpty()) {
                    ListIterator<String> listIterator2 = m16763h2.listIterator(m16763h2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() == 0) {
                            z = true;
                            continue;
                        } else {
                            z = false;
                            continue;
                        }
                        if (!z) {
                            m17166m2 = _Collections.m17559T0(m16763h2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m17166m2 = C37563v.m17166m();
                return ((String[]) m17166m2.toArray(new String[0]))[0];
            }
            return str;
        }
        return "";
    }

    /* renamed from: b */
    private final String m58872b(StackTraceElement[] stackTraceElementArr, int i) {
        List m17166m;
        boolean m16592R;
        boolean m16592R2;
        int i2;
        List m17166m2;
        String[] strArr;
        boolean z;
        List m17166m3;
        boolean z2;
        boolean z3;
        if (stackTraceElementArr.length > i) {
            String className = stackTraceElementArr[i].getClassName();
            Intrinsics.checkNotNullExpressionValue(className, "stackTrace[depth]\n              .className");
            List<String> m16763h = new Regex("\\.").m16763h(className, 0);
            if (!m16763h.isEmpty()) {
                ListIterator<String> listIterator = m16763h.listIterator(m16763h.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() == 0) {
                        z3 = true;
                        continue;
                    } else {
                        z3 = false;
                        continue;
                    }
                    if (!z3) {
                        m17166m = _Collections.m17559T0(m16763h, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            m17166m = C37563v.m17166m();
            String[] strArr2 = (String[]) m17166m.toArray(new String[0]);
            String str = strArr2[strArr2.length - 1];
            m16592R = C37690r.m16592R(str, "$", false, 2, null);
            if (m16592R) {
                List<String> m16763h2 = new Regex("\\$").m16763h(str, 0);
                if (!m16763h2.isEmpty()) {
                    ListIterator<String> listIterator2 = m16763h2.listIterator(m16763h2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() == 0) {
                            z2 = true;
                            continue;
                        } else {
                            z2 = false;
                            continue;
                        }
                        if (!z2) {
                            m17166m3 = _Collections.m17559T0(m16763h2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                m17166m3 = C37563v.m17166m();
                return ((String[]) m17166m3.toArray(new String[0]))[1] + '.' + stackTraceElementArr[i].getMethodName();
            }
            String methodName = stackTraceElementArr[i].getMethodName();
            Intrinsics.checkNotNullExpressionValue(methodName, "stackTrace[depth].methodName");
            m16592R2 = C37690r.m16592R(methodName, "$", false, 2, null);
            if (!m16592R2 || stackTraceElementArr.length <= (i2 = i + 1)) {
                String methodName2 = stackTraceElementArr[i].getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName2, "stackTrace[depth].methodName");
                return methodName2;
            }
            String className2 = stackTraceElementArr[i2].getClassName();
            Intrinsics.checkNotNullExpressionValue(className2, "stackTrace[depth + 1]\n                .className");
            List<String> m16763h3 = new Regex("\\$").m16763h(className2, 0);
            if (!m16763h3.isEmpty()) {
                ListIterator<String> listIterator3 = m16763h3.listIterator(m16763h3.size());
                while (listIterator3.hasPrevious()) {
                    if (listIterator3.previous().length() == 0) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (!z) {
                        m17166m2 = _Collections.m17559T0(m16763h3, listIterator3.nextIndex() + 1);
                        break;
                    }
                }
            }
            m17166m2 = C37563v.m17166m();
            if (((String[]) m17166m2.toArray(new String[0])).length <= 1) {
                String methodName3 = stackTraceElementArr[i2].getMethodName();
                Intrinsics.checkNotNullExpressionValue(methodName3, "{\n              stackTra….methodName\n            }");
                return methodName3;
            }
            return strArr[1] + '.' + stackTraceElementArr[i2].getMethodName();
        }
        return "";
    }
}
