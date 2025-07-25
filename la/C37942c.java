package la;

import java.math.BigDecimal;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import na.C38480a;
import na.C38484c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p759ka.C37422c;
import p759ka.EvaluableType;
import p804nd.C38508r;
import p804nd.ExceptionsH;
import p804nd.Result;

/* compiled from: ArrayFunctions.kt */
@Metadata
/* renamed from: la.c */
/* loaded from: classes8.dex */
public final class C37942c {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: ArrayFunctions.kt */
    @Metadata
    /* renamed from: la.c$a */
    /* loaded from: classes8.dex */
    public static final class C37943a extends Lambda implements Function1<Object, CharSequence> {

        /* renamed from: g */
        public static final C37943a f100063g = new C37943a();

        C37943a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        @NotNull
        /* renamed from: b */
        public final CharSequence invoke(@NotNull Object it) {
            Intrinsics.checkNotNullParameter(it, "it");
            return C37422c.m18098i(it);
        }
    }

    /* renamed from: e */
    private static final void m15644e(String str, List<? extends Object> list) {
        Object obj = list.get(0);
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type org.json.JSONArray");
        int length = ((JSONArray) obj).length();
        Object obj2 = list.get(1);
        Intrinsics.m17073h(obj2, "null cannot be cast to non-null type kotlin.Long");
        long longValue = ((Long) obj2).longValue();
        if (longValue < length) {
            return;
        }
        m15639j(str, list, "Requested index (" + longValue + ") out of bounds array size (" + length + ").");
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final Object m15643f(String str, List<? extends Object> list) {
        m15644e(str, list);
        Object obj = list.get(0);
        Intrinsics.m17073h(obj, "null cannot be cast to non-null type org.json.JSONArray");
        Object obj2 = list.get(1);
        Intrinsics.m17073h(obj2, "null cannot be cast to non-null type kotlin.Long");
        Object obj3 = ((JSONArray) obj).get((int) ((Long) obj2).longValue());
        Intrinsics.checkNotNullExpressionValue(obj3, "array.get(index.toInt())");
        return obj3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static final Object m15642g(String str, List<? extends Object> list) {
        Object m14549b;
        try {
            Result.C38506a c38506a = Result.f101870c;
            m15644e(str, list);
            Object obj = list.get(0);
            Intrinsics.m17073h(obj, "null cannot be cast to non-null type org.json.JSONArray");
            Object obj2 = list.get(1);
            Intrinsics.m17073h(obj2, "null cannot be cast to non-null type kotlin.Long");
            m14549b = Result.m14549b(((JSONArray) obj).get((int) ((Long) obj2).longValue()));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14544g(m14549b)) {
            return null;
        }
        return m14549b;
    }

    @Nullable
    /* renamed from: h */
    public static final C38480a m15641h(@Nullable String str) {
        Object m14549b;
        C38480a c38480a = null;
        if (str == null) {
            return null;
        }
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(C38480a.m14651c(C38480a.f101823b.m14641b(str)));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (!Result.m14544g(m14549b)) {
            c38480a = m14549b;
        }
        return c38480a;
    }

    @Nullable
    /* renamed from: i */
    public static final String m15640i(@Nullable String str) {
        Object m14549b;
        if (str == null) {
            return null;
        }
        try {
            Result.C38506a c38506a = Result.f101870c;
            m14549b = Result.m14549b(C38484c.m14633a(C38484c.f101833b.m14626a(str)));
        } catch (Throwable th) {
            Result.C38506a c38506a2 = Result.f101870c;
            m14549b = Result.m14549b(C38508r.m14540a(th));
        }
        if (Result.m14544g(m14549b)) {
            m14549b = null;
        }
        C38484c c38484c = (C38484c) m14549b;
        if (c38484c == null) {
            return null;
        }
        return c38484c.m14627g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final Void m15639j(String str, List<? extends Object> list, String str2) {
        String m17521z0;
        List<? extends Object> subList = list.subList(1, list.size());
        m17521z0 = _Collections.m17521z0(subList, null, str + "(<array>, ", ")", 0, null, C37943a.f100063g, 25, null);
        C37422c.m18102e(m17521z0, str2, null, 4, null);
        throw new ExceptionsH();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k */
    public static final void m15638k(String str, List<? extends Object> list, EvaluableType evaluableType, Object obj) {
        boolean z;
        String str2;
        boolean z2 = true;
        if (obj instanceof Integer) {
            z = true;
        } else {
            z = obj instanceof Double;
        }
        if (!z) {
            z2 = obj instanceof BigDecimal;
        }
        if (!z2) {
            if (!(obj instanceof JSONObject)) {
                if (obj instanceof JSONArray) {
                    str2 = "Array";
                } else {
                    str2 = obj.getClass().getSimpleName();
                }
            } else {
                str2 = "Dict";
            }
        } else {
            str2 = "Number";
        }
        m15639j(str, list, "Incorrect value type: expected " + evaluableType.m18093c() + ", got " + str2 + '.');
        throw new ExceptionsH();
    }
}
