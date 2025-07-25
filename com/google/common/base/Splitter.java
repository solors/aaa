package com.google.common.base;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class Splitter {

    /* renamed from: a */
    private final CharMatcher f39439a;

    /* renamed from: b */
    private final boolean f39440b;

    /* renamed from: c */
    private final Strategy f39441c;

    /* renamed from: d */
    private final int f39442d;

    @Beta
    /* loaded from: classes4.dex */
    public static final class MapSplitter {

        /* renamed from: a */
        private final Splitter f39453a;

        /* renamed from: b */
        private final Splitter f39454b;

        public Map<String, String> split(CharSequence charSequence) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str : this.f39453a.split(charSequence)) {
                Iterator m70014f = this.f39454b.m70014f(str);
                Preconditions.checkArgument(m70014f.hasNext(), "Chunk [%s] is not a valid entry", str);
                String str2 = (String) m70014f.next();
                Preconditions.checkArgument(!linkedHashMap.containsKey(str2), "Duplicate key [%s] found.", str2);
                Preconditions.checkArgument(m70014f.hasNext(), "Chunk [%s] is not a valid entry", str);
                linkedHashMap.put(str2, (String) m70014f.next());
                Preconditions.checkArgument(!m70014f.hasNext(), "Chunk [%s] is not a valid entry", str);
            }
            return Collections.unmodifiableMap(linkedHashMap);
        }

        private MapSplitter(Splitter splitter, Splitter splitter2) {
            this.f39453a = splitter;
            this.f39454b = (Splitter) Preconditions.checkNotNull(splitter2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes4.dex */
    public static abstract class SplittingIterator extends AbstractIterator<String> {

        /* renamed from: d */
        final CharSequence f39455d;

        /* renamed from: f */
        final CharMatcher f39456f;

        /* renamed from: g */
        final boolean f39457g;

        /* renamed from: h */
        int f39458h = 0;

        /* renamed from: i */
        int f39459i;

        protected SplittingIterator(Splitter splitter, CharSequence charSequence) {
            this.f39456f = splitter.f39439a;
            this.f39457g = splitter.f39440b;
            this.f39459i = splitter.f39442d;
            this.f39455d = charSequence;
        }

        @Override // com.google.common.base.AbstractIterator
        /* renamed from: d */
        public String mo70009a() {
            int separatorStart;
            int i = this.f39458h;
            while (true) {
                int i2 = this.f39458h;
                if (i2 != -1) {
                    separatorStart = separatorStart(i2);
                    if (separatorStart == -1) {
                        separatorStart = this.f39455d.length();
                        this.f39458h = -1;
                    } else {
                        this.f39458h = separatorEnd(separatorStart);
                    }
                    int i3 = this.f39458h;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.f39458h = i4;
                        if (i4 > this.f39455d.length()) {
                            this.f39458h = -1;
                        }
                    } else {
                        while (i < separatorStart && this.f39456f.matches(this.f39455d.charAt(i))) {
                            i++;
                        }
                        while (separatorStart > i && this.f39456f.matches(this.f39455d.charAt(separatorStart - 1))) {
                            separatorStart--;
                        }
                        if (!this.f39457g || i != separatorStart) {
                            break;
                        }
                        i = this.f39458h;
                    }
                } else {
                    return m70111b();
                }
            }
            int i5 = this.f39459i;
            if (i5 == 1) {
                separatorStart = this.f39455d.length();
                this.f39458h = -1;
                while (separatorStart > i && this.f39456f.matches(this.f39455d.charAt(separatorStart - 1))) {
                    separatorStart--;
                }
            } else {
                this.f39459i = i5 - 1;
            }
            return this.f39455d.subSequence(i, separatorStart).toString();
        }

        abstract int separatorEnd(int i);

        abstract int separatorStart(int i);
    }

    /* loaded from: classes4.dex */
    public interface Strategy {
        Iterator<String> iterator(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(Strategy strategy) {
        this(strategy, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    /* renamed from: e */
    private static Splitter m70015e(final CommonPattern commonPattern) {
        Preconditions.checkArgument(!commonPattern.matcher("").matches(), "The pattern may not match the empty string: %s", commonPattern);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.3
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                final CommonMatcher matcher = commonPattern.matcher(charSequence);
                return new SplittingIterator(this, splitter, charSequence) { // from class: com.google.common.base.Splitter.3.1
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i) {
                        return matcher.end();
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i) {
                        if (matcher.find(i)) {
                            return matcher.start();
                        }
                        return -1;
                    }
                };
            }
        });
    }

    /* renamed from: f */
    public Iterator<String> m70014f(CharSequence charSequence) {
        return this.f39441c.iterator(this, charSequence);
    }

    public static Splitter fixedLength(final int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The length may not be less than 1");
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.4
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.4.1
                    {
                        C166674.this = this;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorStart(int i2) {
                        int i3 = i2 + i;
                        if (i3 >= this.f39455d.length()) {
                            return -1;
                        }
                        return i3;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i2) {
                        return i2;
                    }
                };
            }
        });
    }

    /* renamed from: on */
    public static Splitter m70013on(char c) {
        return m70012on(CharMatcher.m70091is(c));
    }

    @GwtIncompatible
    public static Splitter onPattern(String str) {
        return m70015e(Platform.m70052a(str));
    }

    public Splitter limit(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "must be greater than zero: %s", i);
        return new Splitter(this.f39441c, this.f39440b, this.f39439a, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.f39441c, true, this.f39439a, this.f39442d);
    }

    public Iterable<String> split(final CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        return new Iterable<String>() { // from class: com.google.common.base.Splitter.5
            {
                Splitter.this = this;
            }

            @Override // java.lang.Iterable
            public Iterator<String> iterator() {
                return Splitter.this.m70014f(charSequence);
            }

            public String toString() {
                Joiner m70067on = Joiner.m70067on(", ");
                StringBuilder sb2 = new StringBuilder();
                sb2.append('[');
                StringBuilder appendTo = m70067on.appendTo(sb2, (Iterable<? extends Object>) this);
                appendTo.append(']');
                return appendTo.toString();
            }
        };
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> m70014f = m70014f(charSequence);
        ArrayList arrayList = new ArrayList();
        while (m70014f.hasNext()) {
            arrayList.add(m70014f.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    @Beta
    public MapSplitter withKeyValueSeparator(String str) {
        return withKeyValueSeparator(m70011on(str));
    }

    private Splitter(Strategy strategy, boolean z, CharMatcher charMatcher, int i) {
        this.f39441c = strategy;
        this.f39440b = z;
        this.f39439a = charMatcher;
        this.f39442d = i;
    }

    /* renamed from: on */
    public static Splitter m70012on(final CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.1
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.1.1
                    {
                        C166611.this = this;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorEnd(int i) {
                        return i + 1;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    int separatorStart(int i) {
                        return charMatcher.indexIn(this.f39455d, i);
                    }
                };
            }
        });
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.f39441c, this.f39440b, charMatcher, this.f39442d);
    }

    @Beta
    public MapSplitter withKeyValueSeparator(char c) {
        return withKeyValueSeparator(m70013on(c));
    }

    @Beta
    public MapSplitter withKeyValueSeparator(Splitter splitter) {
        return new MapSplitter(splitter);
    }

    /* renamed from: on */
    public static Splitter m70011on(final String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m70013on(str.charAt(0));
        }
        return new Splitter(new Strategy() { // from class: com.google.common.base.Splitter.2
            @Override // com.google.common.base.Splitter.Strategy
            public SplittingIterator iterator(Splitter splitter, CharSequence charSequence) {
                return new SplittingIterator(splitter, charSequence) { // from class: com.google.common.base.Splitter.2.1
                    {
                        C166632.this = this;
                    }

                    @Override // com.google.common.base.Splitter.SplittingIterator
                    public int separatorEnd(int i) {
                        return i + str.length();
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:24:0x0026, code lost:
                        r6 = r6 + 1;
                     */
                    @Override // com.google.common.base.Splitter.SplittingIterator
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public int separatorStart(int r6) {
                        /*
                            r5 = this;
                            com.google.common.base.Splitter$2 r0 = com.google.common.base.Splitter.C166632.this
                            java.lang.String r0 = r1
                            int r0 = r0.length()
                            java.lang.CharSequence r1 = r5.f39455d
                            int r1 = r1.length()
                            int r1 = r1 - r0
                        Lf:
                            if (r6 > r1) goto L2d
                            r2 = 0
                        L12:
                            if (r2 >= r0) goto L2c
                            java.lang.CharSequence r3 = r5.f39455d
                            int r4 = r2 + r6
                            char r3 = r3.charAt(r4)
                            com.google.common.base.Splitter$2 r4 = com.google.common.base.Splitter.C166632.this
                            java.lang.String r4 = r1
                            char r4 = r4.charAt(r2)
                            if (r3 == r4) goto L29
                            int r6 = r6 + 1
                            goto Lf
                        L29:
                            int r2 = r2 + 1
                            goto L12
                        L2c:
                            return r6
                        L2d:
                            r6 = -1
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.common.base.Splitter.C166632.C166641.separatorStart(int):int");
                    }
                };
            }
        });
    }

    @GwtIncompatible
    /* renamed from: on */
    public static Splitter m70010on(Pattern pattern) {
        return m70015e(new JdkPattern(pattern));
    }
}
