package p671fb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p671fb.Expression;

@Metadata
/* renamed from: fb.e */
/* loaded from: classes8.dex */
public final class Expressions {
    /* renamed from: a */
    public static final <T> boolean m24832a(@Nullable Expression<T> expression, @Nullable Expression<T> expression2) {
        if (expression == null && expression2 == null) {
            return true;
        }
        if (expression != null && m24830c(expression) && expression2 != null && m24830c(expression2) && Intrinsics.m17075f(expression.mo24845d(), expression2.mo24845d())) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final <T> boolean m24831b(@Nullable InterfaceC33099c<T> interfaceC33099c, @Nullable InterfaceC33099c<T> interfaceC33099c2) {
        if (interfaceC33099c == null && interfaceC33099c2 == null) {
            return true;
        }
        if (interfaceC33099c != null && (interfaceC33099c instanceof ExpressionList) && interfaceC33099c2 != null && (interfaceC33099c2 instanceof ExpressionList) && Intrinsics.m17075f(((ExpressionList) interfaceC33099c).m24852c(), ((ExpressionList) interfaceC33099c2).m24852c())) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static final <T> boolean m24830c(@NotNull Expression<T> expression) {
        Intrinsics.checkNotNullParameter(expression, "<this>");
        return expression instanceof Expression.C33095b;
    }

    /* renamed from: d */
    public static final <T> boolean m24829d(@NotNull InterfaceC33099c<T> interfaceC33099c) {
        Intrinsics.checkNotNullParameter(interfaceC33099c, "<this>");
        return interfaceC33099c instanceof ExpressionList;
    }

    /* renamed from: e */
    public static final <T> boolean m24828e(@Nullable Expression<T> expression) {
        if (expression != null && !m24830c(expression)) {
            return false;
        }
        return true;
    }
}
