package com.applovin.exoplayer2.common.base;

import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C20517nb;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* loaded from: classes2.dex */
public final class MoreObjects {

    /* loaded from: classes2.dex */
    public static final class ToStringHelper {
        private final String className;
        private final C3909a holderHead;
        private C3909a holderTail;
        private boolean omitNullValues;

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: com.applovin.exoplayer2.common.base.MoreObjects$ToStringHelper$a */
        /* loaded from: classes2.dex */
        public static final class C3909a {

            /* renamed from: a */
            String f4200a;

            /* renamed from: b */
            Object f4201b;

            /* renamed from: c */
            C3909a f4202c;

            private C3909a() {
            }
        }

        private C3909a addHolder() {
            C3909a c3909a = new C3909a();
            this.holderTail.f4202c = c3909a;
            this.holderTail = c3909a;
            return c3909a;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, @NullableDecl Object obj) {
            return addHolder(str, obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(@NullableDecl Object obj) {
            return addHolder(obj);
        }

        @CanIgnoreReturnValue
        public ToStringHelper omitNullValues() {
            this.omitNullValues = true;
            return this;
        }

        public String toString() {
            boolean z = this.omitNullValues;
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append(this.className);
            sb2.append('{');
            String str = "";
            for (C3909a c3909a = this.holderHead.f4202c; c3909a != null; c3909a = c3909a.f4202c) {
                Object obj = c3909a.f4201b;
                if (!z || obj != null) {
                    sb2.append(str);
                    String str2 = c3909a.f4200a;
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
            }
            sb2.append('}');
            return sb2.toString();
        }

        private ToStringHelper(String str) {
            C3909a c3909a = new C3909a();
            this.holderHead = c3909a;
            this.holderTail = c3909a;
            this.omitNullValues = false;
            this.className = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, boolean z) {
            return addHolder(str, String.valueOf(z));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(boolean z) {
            return addHolder(String.valueOf(z));
        }

        private ToStringHelper addHolder(@NullableDecl Object obj) {
            addHolder().f4201b = obj;
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, char c) {
            return addHolder(str, String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(char c) {
            return addHolder(String.valueOf(c));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, double d) {
            return addHolder(str, String.valueOf(d));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(double d) {
            return addHolder(String.valueOf(d));
        }

        private ToStringHelper addHolder(String str, @NullableDecl Object obj) {
            C3909a addHolder = addHolder();
            addHolder.f4201b = obj;
            addHolder.f4200a = (String) Preconditions.checkNotNull(str);
            return this;
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, float f) {
            return addHolder(str, String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(float f) {
            return addHolder(String.valueOf(f));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, int i) {
            return addHolder(str, String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(int i) {
            return addHolder(String.valueOf(i));
        }

        @CanIgnoreReturnValue
        public ToStringHelper add(String str, long j) {
            return addHolder(str, String.valueOf(j));
        }

        @CanIgnoreReturnValue
        public ToStringHelper addValue(long j) {
            return addHolder(String.valueOf(j));
        }
    }

    private MoreObjects() {
    }

    public static <T> T firstNonNull(@NullableDecl T t, @NullableDecl T t2) {
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
