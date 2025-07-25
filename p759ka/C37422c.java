package p759ka;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections._Collections;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import ma.InterfaceC38214e;
import na.C38480a;
import na.C38484c;
import na.DateTime;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONObject;
import p759ka.EvaluableType;
import p804nd.ExceptionsH;

/* compiled from: EvaluableException.kt */
@Metadata
/* renamed from: ka.c */
/* loaded from: classes8.dex */
public final class C37422c {

    /* compiled from: EvaluableException.kt */
    @Metadata
    /* renamed from: ka.c$a */
    /* loaded from: classes8.dex */
    public static final class C37423a extends Lambda implements Function1<Object, CharSequence> {

        /* renamed from: g */
        public static final C37423a f98767g = new C37423a();

        C37423a() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: EvaluableException.kt */
    @Metadata
    /* renamed from: ka.c$b */
    /* loaded from: classes8.dex */
    public static final class C37424b extends Lambda implements Function1<Object, CharSequence> {

        /* renamed from: g */
        public static final C37424b f98768g = new C37424b();

        C37424b() {
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

    @NotNull
    /* renamed from: a */
    public static final String m18106a(@NotNull String name, @NotNull List<? extends Object> args) {
        String m17521z0;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        List<? extends Object> list = args;
        m17521z0 = _Collections.m17521z0(list, null, name + '(', ")", 0, null, C37423a.f98767g, 25, null);
        return m17521z0;
    }

    @NotNull
    /* renamed from: b */
    public static final String m18105b(@NotNull String name, @NotNull List<? extends Object> args) {
        Object m17531p0;
        String m17521z0;
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        if (args.size() > 1) {
            List<? extends Object> subList = args.subList(1, args.size());
            StringBuilder sb2 = new StringBuilder();
            m17531p0 = _Collections.m17531p0(args);
            sb2.append(m17531p0);
            sb2.append('.');
            sb2.append(name);
            sb2.append('(');
            m17521z0 = _Collections.m17521z0(subList, ",", sb2.toString(), ")", 0, null, null, 56, null);
            return m17521z0;
        }
        return name + "()";
    }

    @NotNull
    /* renamed from: c */
    public static final Void m18104c(@NotNull String expression, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(expression, "expression");
        Intrinsics.checkNotNullParameter(reason, "reason");
        throw new EvaluableException("Failed to evaluate [" + expression + "]. " + reason, exc);
    }

    @NotNull
    /* renamed from: d */
    public static final Void m18103d(@NotNull InterfaceC38214e.InterfaceC38223c.InterfaceC38224a operator, @NotNull Object left, @NotNull Object right) {
        EvaluableType evaluableType;
        String sb2;
        EvaluableType evaluableType2;
        EvaluableType evaluableType3;
        Intrinsics.checkNotNullParameter(operator, "operator");
        Intrinsics.checkNotNullParameter(left, "left");
        Intrinsics.checkNotNullParameter(right, "right");
        String str = m18098i(left) + ' ' + operator + ' ' + m18098i(right);
        if (!Intrinsics.m17075f(left.getClass(), right.getClass())) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("different types: ");
            EvaluableType.C37425a c37425a = EvaluableType.f98769c;
            if (left instanceof Long) {
                evaluableType2 = EvaluableType.INTEGER;
            } else if (left instanceof Double) {
                evaluableType2 = EvaluableType.NUMBER;
            } else if (left instanceof Boolean) {
                evaluableType2 = EvaluableType.BOOLEAN;
            } else if (left instanceof String) {
                evaluableType2 = EvaluableType.STRING;
            } else if (left instanceof DateTime) {
                evaluableType2 = EvaluableType.DATETIME;
            } else if (left instanceof C38480a) {
                evaluableType2 = EvaluableType.COLOR;
            } else if (left instanceof C38484c) {
                evaluableType2 = EvaluableType.URL;
            } else if (left instanceof JSONObject) {
                evaluableType2 = EvaluableType.DICT;
            } else if (left instanceof JSONArray) {
                evaluableType2 = EvaluableType.ARRAY;
            } else {
                throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
            }
            sb3.append(evaluableType2.m18093c());
            sb3.append(" and ");
            if (!(right instanceof Long)) {
                if (!(right instanceof Double)) {
                    if (!(right instanceof Boolean)) {
                        if (!(right instanceof String)) {
                            if (!(right instanceof DateTime)) {
                                if (!(right instanceof C38480a)) {
                                    if (!(right instanceof C38484c)) {
                                        if (!(right instanceof JSONObject)) {
                                            if (right instanceof JSONArray) {
                                                evaluableType3 = EvaluableType.ARRAY;
                                            } else {
                                                throw new EvaluableException("Unable to find type for " + right.getClass().getName(), null, 2, null);
                                            }
                                        } else {
                                            evaluableType3 = EvaluableType.DICT;
                                        }
                                    } else {
                                        evaluableType3 = EvaluableType.URL;
                                    }
                                } else {
                                    evaluableType3 = EvaluableType.COLOR;
                                }
                            } else {
                                evaluableType3 = EvaluableType.DATETIME;
                            }
                        } else {
                            evaluableType3 = EvaluableType.STRING;
                        }
                    } else {
                        evaluableType3 = EvaluableType.BOOLEAN;
                    }
                } else {
                    evaluableType3 = EvaluableType.NUMBER;
                }
            } else {
                evaluableType3 = EvaluableType.INTEGER;
            }
            sb3.append(evaluableType3.m18093c());
            sb2 = sb3.toString();
        } else {
            StringBuilder sb4 = new StringBuilder();
            EvaluableType.C37425a c37425a2 = EvaluableType.f98769c;
            if (!(left instanceof Long)) {
                if (!(left instanceof Double)) {
                    if (!(left instanceof Boolean)) {
                        if (!(left instanceof String)) {
                            if (!(left instanceof DateTime)) {
                                if (!(left instanceof C38480a)) {
                                    if (!(left instanceof C38484c)) {
                                        if (!(left instanceof JSONObject)) {
                                            if (left instanceof JSONArray) {
                                                evaluableType = EvaluableType.ARRAY;
                                            } else {
                                                throw new EvaluableException("Unable to find type for " + left.getClass().getName(), null, 2, null);
                                            }
                                        } else {
                                            evaluableType = EvaluableType.DICT;
                                        }
                                    } else {
                                        evaluableType = EvaluableType.URL;
                                    }
                                } else {
                                    evaluableType = EvaluableType.COLOR;
                                }
                            } else {
                                evaluableType = EvaluableType.DATETIME;
                            }
                        } else {
                            evaluableType = EvaluableType.STRING;
                        }
                    } else {
                        evaluableType = EvaluableType.BOOLEAN;
                    }
                } else {
                    evaluableType = EvaluableType.NUMBER;
                }
            } else {
                evaluableType = EvaluableType.INTEGER;
            }
            sb4.append(evaluableType.m18093c());
            sb4.append(" type");
            sb2 = sb4.toString();
        }
        m18102e(str, "Operator '" + operator + "' cannot be applied to " + sb2 + '.', null, 4, null);
        throw new ExceptionsH();
    }

    /* renamed from: e */
    public static /* synthetic */ Void m18102e(String str, String str2, Exception exc, int i, Object obj) {
        if ((i & 4) != 0) {
            exc = null;
        }
        return m18104c(str, str2, exc);
    }

    @NotNull
    /* renamed from: f */
    public static final Void m18101f(@NotNull String name, @NotNull List<? extends Object> args, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(reason, "reason");
        m18104c(m18106a(name, args), reason, exc);
        throw new ExceptionsH();
    }

    /* renamed from: g */
    public static /* synthetic */ Void m18100g(String str, List list, String str2, Exception exc, int i, Object obj) {
        if ((i & 8) != 0) {
            exc = null;
        }
        return m18101f(str, list, str2, exc);
    }

    @NotNull
    /* renamed from: h */
    public static final Void m18099h(@NotNull String name, @NotNull List<? extends Object> args, @NotNull String reason, @Nullable Exception exc) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(args, "args");
        Intrinsics.checkNotNullParameter(reason, "reason");
        m18104c(m18105b(name, args), reason, exc);
        throw new ExceptionsH();
    }

    @NotNull
    /* renamed from: i */
    public static final String m18098i(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        if (obj instanceof JSONArray) {
            return "<array>";
        }
        if (obj instanceof JSONObject) {
            return "<dict>";
        }
        if (obj instanceof String) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append('\'');
            sb2.append(obj);
            sb2.append('\'');
            return sb2.toString();
        }
        return obj.toString();
    }

    @NotNull
    /* renamed from: j */
    public static final String m18097j(@NotNull List<? extends Object> list) {
        String m17521z0;
        Intrinsics.checkNotNullParameter(list, "<this>");
        m17521z0 = _Collections.m17521z0(list, ", ", null, null, 0, null, C37424b.f98768g, 30, null);
        return m17521z0;
    }
}
