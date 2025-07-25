package com.google.zxing.oned.rss.expanded;

import com.google.zxing.oned.rss.DataCharacter;
import com.google.zxing.oned.rss.FinderPattern;

/* loaded from: classes5.dex */
final class ExpandedPair {

    /* renamed from: a */
    private final boolean f44550a;

    /* renamed from: b */
    private final DataCharacter f44551b;

    /* renamed from: c */
    private final DataCharacter f44552c;

    /* renamed from: d */
    private final FinderPattern f44553d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExpandedPair(DataCharacter dataCharacter, DataCharacter dataCharacter2, FinderPattern finderPattern, boolean z) {
        this.f44551b = dataCharacter;
        this.f44552c = dataCharacter2;
        this.f44553d = finderPattern;
        this.f44550a = z;
    }

    /* renamed from: a */
    private static boolean m65805a(Object obj, Object obj2) {
        if (obj == null) {
            if (obj2 == null) {
                return true;
            }
            return false;
        }
        return obj.equals(obj2);
    }

    /* renamed from: e */
    private static int m65801e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public FinderPattern m65804b() {
        return this.f44553d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public DataCharacter m65803c() {
        return this.f44551b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public DataCharacter m65802d() {
        return this.f44552c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedPair)) {
            return false;
        }
        ExpandedPair expandedPair = (ExpandedPair) obj;
        if (!m65805a(this.f44551b, expandedPair.f44551b) || !m65805a(this.f44552c, expandedPair.f44552c) || !m65805a(this.f44553d, expandedPair.f44553d)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return (m65801e(this.f44551b) ^ m65801e(this.f44552c)) ^ m65801e(this.f44553d);
    }

    public boolean mustBeLast() {
        if (this.f44552c == null) {
            return true;
        }
        return false;
    }

    public String toString() {
        Object valueOf;
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f44551b);
        sb2.append(" , ");
        sb2.append(this.f44552c);
        sb2.append(" : ");
        FinderPattern finderPattern = this.f44553d;
        if (finderPattern == null) {
            valueOf = "null";
        } else {
            valueOf = Integer.valueOf(finderPattern.getValue());
        }
        sb2.append(valueOf);
        sb2.append(" ]");
        return sb2.toString();
    }
}
