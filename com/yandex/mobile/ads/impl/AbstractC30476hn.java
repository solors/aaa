package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.hn */
/* loaded from: classes8.dex */
public abstract class AbstractC30476hn implements vf1<Character> {

    /* renamed from: com.yandex.mobile.ads.impl.hn$a */
    /* loaded from: classes8.dex */
    static abstract class AbstractC30477a extends AbstractC30476hn {
        AbstractC30477a() {
        }

        @Override // com.yandex.mobile.ads.impl.vf1
        @Deprecated
        public final boolean apply(Character ch) {
            return mo33515a(ch.charValue());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.hn$b */
    /* loaded from: classes8.dex */
    public static final class C30478b extends AbstractC30477a {

        /* renamed from: b */
        private final char f80122b;

        /* JADX INFO: Access modifiers changed from: package-private */
        public C30478b(char c) {
            this.f80122b = c;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30476hn
        /* renamed from: a */
        public final boolean mo33515a(char c) {
            if (c == this.f80122b) {
                return true;
            }
            return false;
        }

        public final String toString() {
            StringBuilder sb2 = new StringBuilder("CharMatcher.is('");
            char c = this.f80122b;
            char[] cArr = {'\\', 'u', 0, 0, 0, 0};
            for (int i = 0; i < 4; i++) {
                cArr[5 - i] = "0123456789ABCDEF".charAt(c & 15);
                c = (char) (c >> 4);
            }
            sb2.append(String.copyValueOf(cArr));
            sb2.append("')");
            return sb2.toString();
        }
    }

    /* renamed from: com.yandex.mobile.ads.impl.hn$c */
    /* loaded from: classes8.dex */
    static abstract class AbstractC30479c extends AbstractC30477a {

        /* renamed from: b */
        private final String f80123b = (String) uf1.m28793a("CharMatcher.none()");

        AbstractC30479c() {
        }

        public final String toString() {
            return this.f80123b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: com.yandex.mobile.ads.impl.hn$d */
    /* loaded from: classes8.dex */
    public static final class C30480d extends AbstractC30479c {

        /* renamed from: c */
        static final C30480d f80124c = new C30480d();

        private C30480d() {
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30476hn
        /* renamed from: a */
        public final boolean mo33515a(char c) {
            return false;
        }

        @Override // com.yandex.mobile.ads.impl.AbstractC30476hn
        /* renamed from: a */
        public final int mo33514a(CharSequence charSequence, int i) {
            uf1.m28791b(i, charSequence.length());
            return -1;
        }
    }

    protected AbstractC30476hn() {
    }

    /* renamed from: a */
    public int mo33514a(CharSequence charSequence, int i) {
        int length = charSequence.length();
        uf1.m28791b(i, length);
        while (i < length) {
            if (mo33515a(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: a */
    public abstract boolean mo33515a(char c);
}
