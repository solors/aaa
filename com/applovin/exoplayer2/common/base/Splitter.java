package com.applovin.exoplayer2.common.base;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class Splitter {
    private final int limit;
    private final boolean omitEmptyStrings;
    private final InterfaceC3934e strategy;
    private final CharMatcher trimmer;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.applovin.exoplayer2.common.base.Splitter$a */
    /* loaded from: classes2.dex */
    public class C3927a implements InterfaceC3934e {

        /* renamed from: a */
        final /* synthetic */ CharMatcher f4220a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$a$a */
        /* loaded from: classes2.dex */
        public class C3928a extends AbstractC3933d {
            C3928a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.AbstractC3933d
            /* renamed from: a */
            int mo101271a(int i) {
                return i + 1;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.AbstractC3933d
            /* renamed from: b */
            int mo101270b(int i) {
                return C3927a.this.f4220a.indexIn(this.f4226c, i);
            }
        }

        C3927a(CharMatcher charMatcher) {
            this.f4220a = charMatcher;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.InterfaceC3934e
        /* renamed from: b */
        public AbstractC3933d mo101268a(Splitter splitter, CharSequence charSequence) {
            return new C3928a(splitter, charSequence);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Splitter$b */
    /* loaded from: classes2.dex */
    class C3929b implements InterfaceC3934e {

        /* renamed from: a */
        final /* synthetic */ String f4222a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$b$a */
        /* loaded from: classes2.dex */
        public class C3930a extends AbstractC3933d {
            C3930a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.AbstractC3933d
            /* renamed from: a */
            public int mo101271a(int i) {
                return i + C3929b.this.f4222a.length();
            }

            /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
                r6 = r6 + 1;
             */
            @Override // com.applovin.exoplayer2.common.base.Splitter.AbstractC3933d
            /* renamed from: b */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public int mo101270b(int r6) {
                /*
                    r5 = this;
                    com.applovin.exoplayer2.common.base.Splitter$b r0 = com.applovin.exoplayer2.common.base.Splitter.C3929b.this
                    java.lang.String r0 = r0.f4222a
                    int r0 = r0.length()
                    java.lang.CharSequence r1 = r5.f4226c
                    int r1 = r1.length()
                    int r1 = r1 - r0
                Lf:
                    if (r6 > r1) goto L2d
                    r2 = 0
                L12:
                    if (r2 >= r0) goto L2c
                    java.lang.CharSequence r3 = r5.f4226c
                    int r4 = r2 + r6
                    char r3 = r3.charAt(r4)
                    com.applovin.exoplayer2.common.base.Splitter$b r4 = com.applovin.exoplayer2.common.base.Splitter.C3929b.this
                    java.lang.String r4 = r4.f4222a
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
                throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.common.base.Splitter.C3929b.C3930a.mo101270b(int):int");
            }
        }

        C3929b(String str) {
            this.f4222a = str;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.InterfaceC3934e
        /* renamed from: b */
        public AbstractC3933d mo101268a(Splitter splitter, CharSequence charSequence) {
            return new C3930a(splitter, charSequence);
        }
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Splitter$d */
    /* loaded from: classes2.dex */
    private static abstract class AbstractC3933d extends AbstractC3937b {

        /* renamed from: c */
        final CharSequence f4226c;

        /* renamed from: d */
        final CharMatcher f4227d;

        /* renamed from: f */
        final boolean f4228f;

        /* renamed from: g */
        int f4229g = 0;

        /* renamed from: h */
        int f4230h;

        protected AbstractC3933d(Splitter splitter, CharSequence charSequence) {
            this.f4227d = splitter.trimmer;
            this.f4228f = splitter.omitEmptyStrings;
            this.f4230h = splitter.limit;
            this.f4226c = charSequence;
        }

        /* renamed from: a */
        abstract int mo101271a(int i);

        /* renamed from: b */
        abstract int mo101270b(int i);

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.applovin.exoplayer2.common.base.AbstractC3937b
        /* renamed from: d */
        public String mo101266a() {
            int mo101270b;
            int i = this.f4229g;
            while (true) {
                int i2 = this.f4229g;
                if (i2 != -1) {
                    mo101270b = mo101270b(i2);
                    if (mo101270b == -1) {
                        mo101270b = this.f4226c.length();
                        this.f4229g = -1;
                    } else {
                        this.f4229g = mo101271a(mo101270b);
                    }
                    int i3 = this.f4229g;
                    if (i3 == i) {
                        int i4 = i3 + 1;
                        this.f4229g = i4;
                        if (i4 > this.f4226c.length()) {
                            this.f4229g = -1;
                        }
                    } else {
                        while (i < mo101270b && this.f4227d.matches(this.f4226c.charAt(i))) {
                            i++;
                        }
                        while (mo101270b > i && this.f4227d.matches(this.f4226c.charAt(mo101270b - 1))) {
                            mo101270b--;
                        }
                        if (!this.f4228f || i != mo101270b) {
                            break;
                        }
                        i = this.f4229g;
                    }
                } else {
                    return (String) m101265b();
                }
            }
            int i5 = this.f4230h;
            if (i5 == 1) {
                mo101270b = this.f4226c.length();
                this.f4229g = -1;
                while (mo101270b > i && this.f4227d.matches(this.f4226c.charAt(mo101270b - 1))) {
                    mo101270b--;
                }
            } else {
                this.f4230h = i5 - 1;
            }
            return this.f4226c.subSequence(i, mo101270b).toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.applovin.exoplayer2.common.base.Splitter$e */
    /* loaded from: classes2.dex */
    public interface InterfaceC3934e {
        /* renamed from: a */
        Iterator mo101268a(Splitter splitter, CharSequence charSequence);
    }

    private Splitter(InterfaceC3934e interfaceC3934e) {
        this(interfaceC3934e, false, CharMatcher.none(), Integer.MAX_VALUE);
    }

    public static Splitter fixedLength(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "The length may not be less than 1");
        return new Splitter(new C3931c(i));
    }

    /* renamed from: on */
    public static Splitter m101277on(char c) {
        return m101276on(CharMatcher.m101288is(c));
    }

    private Iterator<String> splittingIterator(CharSequence charSequence) {
        return this.strategy.mo101268a(this, charSequence);
    }

    public Splitter limit(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "must be greater than zero: %s", i);
        return new Splitter(this.strategy, this.omitEmptyStrings, this.trimmer, i);
    }

    public Splitter omitEmptyStrings() {
        return new Splitter(this.strategy, true, this.trimmer, this.limit);
    }

    public List<String> splitToList(CharSequence charSequence) {
        Preconditions.checkNotNull(charSequence);
        Iterator<String> splittingIterator = splittingIterator(charSequence);
        ArrayList arrayList = new ArrayList();
        while (splittingIterator.hasNext()) {
            arrayList.add(splittingIterator.next());
        }
        return Collections.unmodifiableList(arrayList);
    }

    public Splitter trimResults() {
        return trimResults(CharMatcher.whitespace());
    }

    private Splitter(InterfaceC3934e interfaceC3934e, boolean z, CharMatcher charMatcher, int i) {
        this.strategy = interfaceC3934e;
        this.omitEmptyStrings = z;
        this.trimmer = charMatcher;
        this.limit = i;
    }

    /* renamed from: on */
    public static Splitter m101276on(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(new C3927a(charMatcher));
    }

    public Splitter trimResults(CharMatcher charMatcher) {
        Preconditions.checkNotNull(charMatcher);
        return new Splitter(this.strategy, this.omitEmptyStrings, charMatcher, this.limit);
    }

    /* renamed from: on */
    public static Splitter m101275on(String str) {
        Preconditions.checkArgument(str.length() != 0, "The separator may not be the empty string.");
        if (str.length() == 1) {
            return m101277on(str.charAt(0));
        }
        return new Splitter(new C3929b(str));
    }

    /* renamed from: com.applovin.exoplayer2.common.base.Splitter$c */
    /* loaded from: classes2.dex */
    class C3931c implements InterfaceC3934e {

        /* renamed from: a */
        final /* synthetic */ int f4224a;

        C3931c(int i) {
            this.f4224a = i;
        }

        @Override // com.applovin.exoplayer2.common.base.Splitter.InterfaceC3934e
        /* renamed from: b */
        public AbstractC3933d mo101268a(Splitter splitter, CharSequence charSequence) {
            return new C3932a(splitter, charSequence);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.applovin.exoplayer2.common.base.Splitter$c$a */
        /* loaded from: classes2.dex */
        public class C3932a extends AbstractC3933d {
            C3932a(Splitter splitter, CharSequence charSequence) {
                super(splitter, charSequence);
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.AbstractC3933d
            /* renamed from: b */
            public int mo101270b(int i) {
                int i2 = i + C3931c.this.f4224a;
                if (i2 >= this.f4226c.length()) {
                    return -1;
                }
                return i2;
            }

            @Override // com.applovin.exoplayer2.common.base.Splitter.AbstractC3933d
            /* renamed from: a */
            public int mo101271a(int i) {
                return i;
            }
        }
    }
}
