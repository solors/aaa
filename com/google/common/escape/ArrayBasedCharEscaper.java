package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public abstract class ArrayBasedCharEscaper extends CharEscaper {

    /* renamed from: b */
    private final char[][] f40884b;

    /* renamed from: c */
    private final int f40885c;

    /* renamed from: d */
    private final char f40886d;

    /* renamed from: e */
    private final char f40887e;

    /* JADX INFO: Access modifiers changed from: protected */
    public ArrayBasedCharEscaper(Map<Character, String> map, char c, char c2) {
        this(ArrayBasedEscaperMap.create(map), c, c2);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.escape.CharEscaper
    /* renamed from: a */
    public final char[] mo68555a(char c) {
        char[] cArr;
        if (c < this.f40885c && (cArr = this.f40884b[c]) != null) {
            return cArr;
        }
        if (c >= this.f40886d && c <= this.f40887e) {
            return null;
        }
        return mo68553d(c);
    }

    /* renamed from: d */
    protected abstract char[] mo68553d(char c);

    @Override // com.google.common.escape.CharEscaper, com.google.common.escape.Escaper
    public final String escape(String str) {
        Preconditions.checkNotNull(str);
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if ((charAt < this.f40885c && this.f40884b[charAt] != null) || charAt > this.f40887e || charAt < this.f40886d) {
                return m68558b(str, i);
            }
        }
        return str;
    }

    protected ArrayBasedCharEscaper(ArrayBasedEscaperMap arrayBasedEscaperMap, char c, char c2) {
        Preconditions.checkNotNull(arrayBasedEscaperMap);
        char[][] m68560b = arrayBasedEscaperMap.m68560b();
        this.f40884b = m68560b;
        this.f40885c = m68560b.length;
        if (c2 < c) {
            c2 = 0;
            c = 65535;
        }
        this.f40886d = c;
        this.f40887e = c2;
    }
}
