package com.google.common.escape;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class ArrayBasedEscaperMap {

    /* renamed from: b */
    private static final char[][] f40888b = (char[][]) Array.newInstance(Character.TYPE, 0, 0);

    /* renamed from: a */
    private final char[][] f40889a;

    private ArrayBasedEscaperMap(char[][] cArr) {
        this.f40889a = cArr;
    }

    @VisibleForTesting
    /* renamed from: a */
    static char[][] m68561a(Map<Character, String> map) {
        Preconditions.checkNotNull(map);
        if (map.isEmpty()) {
            return f40888b;
        }
        char[][] cArr = new char[((Character) Collections.max(map.keySet())).charValue() + 1];
        for (Character ch : map.keySet()) {
            cArr[ch.charValue()] = map.get(ch).toCharArray();
        }
        return cArr;
    }

    public static ArrayBasedEscaperMap create(Map<Character, String> map) {
        return new ArrayBasedEscaperMap(m68561a(map));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public char[][] m68560b() {
        return this.f40889a;
    }
}
