package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public class Joiner {

    /* renamed from: a */
    private final String f39401a;

    /* loaded from: classes4.dex */
    public static final class MapJoiner {

        /* renamed from: a */
        private final Joiner f39408a;

        /* renamed from: b */
        private final String f39409b;

        @CanIgnoreReturnValue
        public <A extends Appendable> A appendTo(A a, Map<?, ?> map) throws IOException {
            return (A) appendTo((MapJoiner) a, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        public String join(Map<?, ?> map) {
            return join(map.entrySet());
        }

        public MapJoiner useForNull(String str) {
            return new MapJoiner(this.f39408a.useForNull(str), this.f39409b);
        }

        private MapJoiner(Joiner joiner, String str) {
            this.f39408a = joiner;
            this.f39409b = (String) Preconditions.checkNotNull(str);
        }

        @CanIgnoreReturnValue
        public StringBuilder appendTo(StringBuilder sb2, Map<?, ?> map) {
            return appendTo(sb2, (Iterable<? extends Map.Entry<?, ?>>) map.entrySet());
        }

        @Beta
        public String join(Iterable<? extends Map.Entry<?, ?>> iterable) {
            return join(iterable.iterator());
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a, Iterable<? extends Map.Entry<?, ?>> iterable) throws IOException {
            return (A) appendTo((MapJoiner) a, iterable.iterator());
        }

        @Beta
        public String join(Iterator<? extends Map.Entry<?, ?>> it) {
            return appendTo(new StringBuilder(), it).toString();
        }

        @CanIgnoreReturnValue
        @Beta
        public <A extends Appendable> A appendTo(A a, Iterator<? extends Map.Entry<?, ?>> it) throws IOException {
            Preconditions.checkNotNull(a);
            if (it.hasNext()) {
                Map.Entry<?, ?> next = it.next();
                a.append(this.f39408a.mo70066c(next.getKey()));
                a.append(this.f39409b);
                a.append(this.f39408a.mo70066c(next.getValue()));
                while (it.hasNext()) {
                    a.append(this.f39408a.f39401a);
                    Map.Entry<?, ?> next2 = it.next();
                    a.append(this.f39408a.mo70066c(next2.getKey()));
                    a.append(this.f39409b);
                    a.append(this.f39408a.mo70066c(next2.getValue()));
                }
            }
            return a;
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Map.Entry<?, ?>> iterable) {
            return appendTo(sb2, iterable.iterator());
        }

        @CanIgnoreReturnValue
        @Beta
        public StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Map.Entry<?, ?>> it) {
            try {
                appendTo((MapJoiner) sb2, it);
                return sb2;
            } catch (IOException e) {
                throw new AssertionError(e);
            }
        }
    }

    /* renamed from: b */
    private static Iterable<Object> m70069b(final Object obj, final Object obj2, final Object[] objArr) {
        Preconditions.checkNotNull(objArr);
        return new AbstractList<Object>() { // from class: com.google.common.base.Joiner.3
            @Override // java.util.AbstractList, java.util.List
            public Object get(int i) {
                if (i != 0) {
                    if (i != 1) {
                        return objArr[i - 2];
                    }
                    return obj2;
                }
                return obj;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return objArr.length + 2;
            }
        };
    }

    /* renamed from: on */
    public static Joiner m70067on(String str) {
        return new Joiner(str);
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a, Iterable<? extends Object> iterable) throws IOException {
        return (A) appendTo((Joiner) a, iterable.iterator());
    }

    /* renamed from: c */
    CharSequence mo70066c(Object obj) {
        java.util.Objects.requireNonNull(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    public final String join(Iterable<? extends Object> iterable) {
        return join(iterable.iterator());
    }

    public Joiner skipNulls() {
        return new Joiner(this) { // from class: com.google.common.base.Joiner.2
            @Override // com.google.common.base.Joiner
            public <A extends Appendable> A appendTo(A a, Iterator<? extends Object> it) throws IOException {
                Preconditions.checkNotNull(a, "appendable");
                Preconditions.checkNotNull(it, "parts");
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    Object next = it.next();
                    if (next != null) {
                        a.append(Joiner.this.mo70066c(next));
                        break;
                    }
                }
                while (it.hasNext()) {
                    Object next2 = it.next();
                    if (next2 != null) {
                        a.append(Joiner.this.f39401a);
                        a.append(Joiner.this.mo70066c(next2));
                    }
                }
                return a;
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str) {
                throw new UnsupportedOperationException("already specified skipNulls");
            }

            @Override // com.google.common.base.Joiner
            public MapJoiner withKeyValueSeparator(String str) {
                throw new UnsupportedOperationException("can't use .skipNulls() with maps");
            }
        };
    }

    public Joiner useForNull(final String str) {
        Preconditions.checkNotNull(str);
        return new Joiner(this) { // from class: com.google.common.base.Joiner.1
            @Override // com.google.common.base.Joiner
            /* renamed from: c */
            CharSequence mo70066c(Object obj) {
                if (obj == null) {
                    return str;
                }
                return Joiner.this.mo70066c(obj);
            }

            @Override // com.google.common.base.Joiner
            public Joiner skipNulls() {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            @Override // com.google.common.base.Joiner
            public Joiner useForNull(String str2) {
                throw new UnsupportedOperationException("already specified useForNull");
            }
        };
    }

    public MapJoiner withKeyValueSeparator(char c) {
        return withKeyValueSeparator(String.valueOf(c));
    }

    private Joiner(String str) {
        this.f39401a = (String) Preconditions.checkNotNull(str);
    }

    /* renamed from: on */
    public static Joiner m70068on(char c) {
        return new Joiner(String.valueOf(c));
    }

    @CanIgnoreReturnValue
    public <A extends Appendable> A appendTo(A a, Iterator<? extends Object> it) throws IOException {
        Preconditions.checkNotNull(a);
        if (it.hasNext()) {
            a.append(mo70066c(it.next()));
            while (it.hasNext()) {
                a.append(this.f39401a);
                a.append(mo70066c(it.next()));
            }
        }
        return a;
    }

    public final String join(Iterator<? extends Object> it) {
        return appendTo(new StringBuilder(), it).toString();
    }

    public MapJoiner withKeyValueSeparator(String str) {
        return new MapJoiner(str);
    }

    public final String join(Object[] objArr) {
        return join(Arrays.asList(objArr));
    }

    private Joiner(Joiner joiner) {
        this.f39401a = joiner.f39401a;
    }

    public final String join(Object obj, Object obj2, Object... objArr) {
        return join(m70069b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a, Object[] objArr) throws IOException {
        return (A) appendTo((Joiner) a, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final <A extends Appendable> A appendTo(A a, Object obj, Object obj2, Object... objArr) throws IOException {
        return (A) appendTo((Joiner) a, m70069b(obj, obj2, objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterable<? extends Object> iterable) {
        return appendTo(sb2, iterable.iterator());
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Iterator<? extends Object> it) {
        try {
            appendTo((Joiner) sb2, it);
            return sb2;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Object[] objArr) {
        return appendTo(sb2, (Iterable<? extends Object>) Arrays.asList(objArr));
    }

    @CanIgnoreReturnValue
    public final StringBuilder appendTo(StringBuilder sb2, Object obj, Object obj2, Object... objArr) {
        return appendTo(sb2, m70069b(obj, obj2, objArr));
    }
}
