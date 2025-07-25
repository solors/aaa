package com.google.common.base;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C20517nb;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class MoreObjects {

    /* loaded from: classes4.dex */
    public static final class ToStringHelper {

        /* renamed from: a */
        private final String f39410a;

        /* renamed from: b */
        private final ValueHolder f39411b;

        /* renamed from: c */
        private ValueHolder f39412c;

        /* renamed from: d */
        private boolean f39413d;

        /* renamed from: e */
        private boolean f39414e;

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static final class UnconditionalValueHolder extends ValueHolder {
            private UnconditionalValueHolder() {
                super();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* loaded from: classes4.dex */
        public static class ValueHolder {

            /* renamed from: a */
            String f39415a;

            /* renamed from: b */
            Object f39416b;

            /* renamed from: c */
            ValueHolder f39417c;

            private ValueHolder() {
            }
        }

        /* renamed from: a */
        private ValueHolder m70065a() {
            ValueHolder valueHolder = new ValueHolder();
            this.f39412c.f39417c = valueHolder;
            this.f39412c = valueHolder;
            return valueHolder;
        }

        /* renamed from: b */
        private ToStringHelper m70064b(Object obj) {
            m70065a().f39416b = obj;
            return this;
        }

        /* renamed from: c */
        private ToStringHelper m70063c(String str, Object obj) {
            ValueHolder m70065a = m70065a();
            m70065a.f39416b = obj;
            m70065a.f39415a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        /* renamed from: d */
        private UnconditionalValueHolder m70062d() {
            UnconditionalValueHolder unconditionalValueHolder = new UnconditionalValueHolder();
            this.f39412c.f39417c = unconditionalValueHolder;
            this.f39412c = unconditionalValueHolder;
            return unconditionalValueHolder;
        }

        /* renamed from: e */
        private ToStringHelper m70061e(Object obj) {
            m70062d().f39416b = obj;
            return this;
        }

        /* renamed from: f */
        private ToStringHelper m70060f(String str, Object obj) {
            UnconditionalValueHolder m70062d = m70062d();
            m70062d.f39416b = obj;
            m70062d.f39415a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        /* renamed from: g */
        private static boolean m70059g(Object obj) {
            if (obj instanceof CharSequence) {
                if (((CharSequence) obj).length() == 0) {
                    return true;
                }
                return false;
            } else if (obj instanceof Collection) {
                return ((Collection) obj).isEmpty();
            } else {
                if (obj instanceof Map) {
                    return ((Map) obj).isEmpty();
                }
                if (obj instanceof Optional) {
                    return !((Optional) obj).isPresent();
                }
                if (obj.getClass().isArray() && Array.getLength(obj) == 0) {
                    return true;
                }
                return false;
            }
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, Object obj) {
            return m70063c(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(Object obj) {
            return m70064b(obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.f39413d = true;
            return this;
        }

        public String toString() {
            boolean z = this.f39413d;
            boolean z2 = this.f39414e;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.f39410a);
            sb2.append('{');
            String str = "";
            for (ValueHolder valueHolder = this.f39411b.f39417c; valueHolder != null; valueHolder = valueHolder.f39417c) {
                Object obj = valueHolder.f39416b;
                if (!(valueHolder instanceof UnconditionalValueHolder)) {
                    if (obj == null) {
                        if (z) {
                        }
                    } else if (z2 && m70059g(obj)) {
                    }
                }
                sb2.append(str);
                String str2 = valueHolder.f39415a;
                if (str2 != null) {
                    sb2.append(str2);
                    sb2.append(C20517nb.f52173T);
                }
                if (obj != null && obj.getClass().isArray()) {
                    String deepToString = Arrays.deepToString(new Object[]{obj});
                    sb2.append((CharSequence) deepToString, 1, deepToString.length() - 1);
                } else {
                    sb2.append(obj);
                }
                str = ", ";
            }
            sb2.append('}');
            return sb2.toString();
        }

        private ToStringHelper(String str) {
            ValueHolder valueHolder = new ValueHolder();
            this.f39411b = valueHolder;
            this.f39412c = valueHolder;
            this.f39413d = false;
            this.f39414e = false;
            this.f39410a = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
            return m70060f(str, String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
            return m70061e(String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
            return m70060f(str, String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
            return m70061e(String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
            return m70060f(str, String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
            return m70061e(String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f) {
            return m70060f(str, String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f) {
            return m70061e(String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i) {
            return m70060f(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i) {
            return m70061e(String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j) {
            return m70060f(str, String.valueOf(j));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j) {
            return m70061e(String.valueOf(j));
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(T t, T t2) {
        if (t != null) {
            return t;
        }
        if (t2 != null) {
            return t2;
        }
        throw new NullPointerException("Both parameters are null");
    }

    public static ToStringHelper toStringHelper(Object obj) {
        return new ToStringHelper(obj.getClass().getSimpleName());
    }

    public static ToStringHelper toStringHelper(Class<?> cls) {
        return new ToStringHelper(cls.getSimpleName());
    }

    public static ToStringHelper toStringHelper(String str) {
        return new ToStringHelper(str);
    }
}
