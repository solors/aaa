package com.facebook.ads.redexgen.p370X;

import java.util.Deque;
import java.util.LinkedList;

/* renamed from: com.facebook.ads.redexgen.X.Li */
/* loaded from: assets/audience_network.dex */
public class C12156Li {
    public final int A01;
    public final int A02;
    public final Deque<String> A04 = new LinkedList();
    public final Deque<String> A03 = new LinkedList();
    public String A00 = null;

    public C12156Li(int i, int i2) {
        this.A02 = i;
        this.A01 = i2;
    }

    public final Iterable<String> A00() {
        return this.A03;
    }

    public final Iterable<String> A01() {
        return this.A04;
    }

    public final String A02() {
        return this.A00;
    }

    public final void A03() {
        if (this.A00 != null) {
            this.A04.addLast(this.A00);
            if (this.A04.size() > this.A02) {
                this.A04.removeFirst();
            }
        }
        if (this.A03.size() > 0) {
            this.A00 = this.A03.removeFirst();
        } else {
            this.A00 = null;
        }
    }

    public final void A04(String str) {
        this.A03.addLast(str);
        if (this.A03.size() <= this.A01) {
            return;
        }
        if (this.A00 != null) {
            this.A04.addLast(this.A00);
        }
        this.A00 = this.A03.removeFirst();
        if (this.A04.size() > this.A02) {
            this.A04.removeFirst();
        }
    }
}
