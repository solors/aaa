package sg.bigo.ads.common.p930r;

import android.util.Log;
import androidx.annotation.Nullable;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import sg.bigo.ads.common.p932t.C43782a;
import sg.bigo.ads.common.utils.C43828k;

/* renamed from: sg.bigo.ads.common.r.a */
/* loaded from: classes10.dex */
public final class C43778a {
    /* renamed from: a */
    public static Object m5022a(Object obj, String str) {
        Field field;
        try {
            try {
                field = obj.getClass().getDeclaredField(str);
            } catch (IllegalAccessException | NoSuchFieldException e) {
                C43782a.m5009a(0, "ReflectionHelper", Log.getStackTraceString(e));
                return null;
            }
        } catch (Exception unused) {
            field = obj.getClass().getField(str);
        }
        field.setAccessible(true);
        return field.get(obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x006d A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object m5021a(java.lang.Object r10, java.lang.String r11, java.lang.Class r12) {
        /*
            r0 = 0
            if (r10 != 0) goto L4
            return r0
        L4:
            java.lang.Class r1 = r10.getClass()
            java.lang.reflect.Method[] r1 = r1.getMethods()
            int r2 = r1.length
            r3 = 0
            r4 = r3
        Lf:
            if (r4 >= r2) goto L70
            r5 = r1[r4]
            java.lang.String r6 = r5.getName()
            boolean r6 = android.text.TextUtils.equals(r11, r6)
            if (r6 == 0) goto L6d
            java.lang.Class[] r6 = r5.getParameterTypes()
            boolean r7 = sg.bigo.ads.common.utils.C43828k.m4872a(r0)
            if (r7 == 0) goto L6c
            boolean r7 = sg.bigo.ads.common.utils.C43828k.m4872a(r6)
            if (r7 == 0) goto L2f
            r7 = r3
            goto L30
        L2f:
            int r7 = r6.length
        L30:
            r8 = 1
            if (r7 == 0) goto L35
        L33:
            r6 = r3
            goto L45
        L35:
            r7 = r3
        L36:
            if (r7 >= 0) goto L44
            r9 = r6[r7]
            boolean r9 = java.util.Objects.isNull(r9)
            if (r9 != 0) goto L41
            goto L33
        L41:
            int r7 = r7 + 1
            goto L36
        L44:
            r6 = r8
        L45:
            if (r6 == 0) goto L6d
            java.lang.Class r6 = r5.getReturnType()
            boolean r7 = m5024a(r12)
            if (r7 == 0) goto L57
            boolean r7 = m5024a(r6)
            if (r7 != 0) goto L59
        L57:
            if (r6 != r12) goto L6d
        L59:
            r5.setAccessible(r8)     // Catch: java.lang.Exception -> L61
            java.lang.Object r0 = r5.invoke(r10, r0)     // Catch: java.lang.Exception -> L61
            goto L70
        L61:
            r10 = move-exception
            java.lang.String r11 = "ReflectionHelper"
            java.lang.String r10 = android.util.Log.getStackTraceString(r10)
            sg.bigo.ads.common.p932t.C43782a.m5009a(r3, r11, r10)
            goto L70
        L6c:
            throw r0
        L6d:
            int r4 = r4 + 1
            goto Lf
        L70:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.p930r.C43778a.m5021a(java.lang.Object, java.lang.String, java.lang.Class):java.lang.Object");
    }

    @Nullable
    /* renamed from: a */
    public static <T> T m5020a(String str, Class<T> cls) {
        try {
            Constructor declaredConstructor = Class.forName(str).asSubclass(cls).getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            return (T) declaredConstructor.newInstance(new Object[0]);
        } catch (Exception unused) {
            C43782a.m5010a(0, 5, "ReflectionHelper", "Cannot find class: ".concat(String.valueOf(str)));
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m5024a(Class cls) {
        return cls == null || Void.class == cls;
    }

    /* renamed from: a */
    public static boolean m5023a(Class<?> cls, String... strArr) {
        Class<?> cls2;
        if (C43828k.m4872a(strArr)) {
            return false;
        }
        for (int i = 0; i < 2; i++) {
            try {
                cls2 = Class.forName(strArr[i]);
            } catch (Exception unused) {
                cls2 = null;
            }
            if (cls2 != null && cls2.isAssignableFrom(cls)) {
                return true;
            }
        }
        return false;
    }
}
