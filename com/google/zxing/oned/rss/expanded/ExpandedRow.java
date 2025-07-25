package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes5.dex */
final class ExpandedRow {

    /* renamed from: a */
    private final List<ExpandedPair> f44554a;

    /* renamed from: b */
    private final int f44555b;

    /* renamed from: c */
    private final boolean f44556c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ExpandedRow(List<ExpandedPair> list, int i, boolean z) {
        this.f44554a = new ArrayList(list);
        this.f44555b = i;
        this.f44556c = z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public List<ExpandedPair> m65800a() {
        return this.f44554a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public int m65799b() {
        return this.f44555b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public boolean m65798c(List<ExpandedPair> list) {
        return this.f44554a.equals(list);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ExpandedRow)) {
            return false;
        }
        ExpandedRow expandedRow = (ExpandedRow) obj;
        if (!this.f44554a.equals(expandedRow.m65800a()) || this.f44556c != expandedRow.f44556c) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f44554a.hashCode() ^ Boolean.valueOf(this.f44556c).hashCode();
    }

    public String toString() {
        return "{ " + this.f44554a + " }";
    }
}
