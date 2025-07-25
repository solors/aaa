package com.applovin.mediation;

import com.applovin.impl.sdk.C5434n;
import java.util.List;

/* loaded from: classes2.dex */
public class MaxSegment {

    /* renamed from: a */
    private final int f12632a;

    /* renamed from: b */
    private final List f12633b;

    public MaxSegment(int i, List<Integer> list) {
        this.f12632a = i;
        this.f12633b = list;
        m92302a(i);
        for (Integer num : list) {
            m92302a(num.intValue());
        }
    }

    /* renamed from: a */
    private void m92302a(int i) {
        if (i >= 0) {
            return;
        }
        C5434n.m94898h("MaxSegment", "Please ensure that the segment value entered is a non-negative number in the range of [0, 2147483647]: " + i);
    }

    public int getKey() {
        return this.f12632a;
    }

    public List<Integer> getValues() {
        return this.f12633b;
    }

    public String toString() {
        return "MaxSegment{key=" + this.f12632a + ", values=" + this.f12633b + '}';
    }
}
