package com.google.zxing.aztec.encoder;

import com.google.zxing.common.BitArray;
import java.util.LinkedList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes5.dex */
public final class State {

    /* renamed from: e */
    static final State f44222e = new State(Token.f44227b, 0, 0, 0);

    /* renamed from: a */
    private final int f44223a;

    /* renamed from: b */
    private final Token f44224b;

    /* renamed from: c */
    private final int f44225c;

    /* renamed from: d */
    private final int f44226d;

    private State(Token token, int i, int i2, int i3) {
        this.f44224b = token;
        this.f44223a = i;
        this.f44225c = i2;
        this.f44226d = i3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public State m66090a(int i) {
        int i2;
        Token token = this.f44224b;
        int i3 = this.f44223a;
        int i4 = this.f44226d;
        if (i3 == 4 || i3 == 2) {
            int i5 = HighLevelEncoder.f44215c[i3][0];
            int i6 = 65535 & i5;
            int i7 = i5 >> 16;
            token = token.m66081a(i6, i7);
            i4 += i7;
            i3 = 0;
        }
        int i8 = this.f44225c;
        if (i8 != 0 && i8 != 31) {
            if (i8 == 62) {
                i2 = 9;
            } else {
                i2 = 8;
            }
        } else {
            i2 = 18;
        }
        State state = new State(token, i3, i8 + 1, i4 + i2);
        if (state.f44225c == 2078) {
            return state.m66089b(i + 1);
        }
        return state;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public State m66089b(int i) {
        int i2 = this.f44225c;
        if (i2 == 0) {
            return this;
        }
        return new State(this.f44224b.m66080b(i - i2, i2), this.f44223a, 0, this.f44226d);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public int m66088c() {
        return this.f44225c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public int m66087d() {
        return this.f44226d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public int m66086e() {
        return this.f44223a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f */
    public boolean m66085f(State state) {
        int i;
        int i2 = this.f44226d + (HighLevelEncoder.f44215c[this.f44223a][state.f44223a] >> 16);
        int i3 = state.f44225c;
        if (i3 > 0 && ((i = this.f44225c) == 0 || i > i3)) {
            i2 += 10;
        }
        if (i2 <= state.f44226d) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public State m66084g(int i, int i2) {
        int i3;
        int i4 = this.f44226d;
        Token token = this.f44224b;
        int i5 = this.f44223a;
        if (i != i5) {
            int i6 = HighLevelEncoder.f44215c[i5][i];
            int i7 = 65535 & i6;
            int i8 = i6 >> 16;
            token = token.m66081a(i7, i8);
            i4 += i8;
        }
        if (i == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new State(token.m66081a(i2, i3), i, 0, i4 + i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: h */
    public State m66083h(int i, int i2) {
        int i3;
        Token token = this.f44224b;
        int i4 = this.f44223a;
        if (i4 == 2) {
            i3 = 4;
        } else {
            i3 = 5;
        }
        return new State(token.m66081a(HighLevelEncoder.f44217e[i4][i], i3).m66081a(i2, 5), this.f44223a, 0, this.f44226d + i3 + 5);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: i */
    public BitArray m66082i(byte[] bArr) {
        LinkedList<Token> linkedList = new LinkedList();
        for (Token token = m66089b(bArr.length).f44224b; token != null; token = token.m66079c()) {
            linkedList.addFirst(token);
        }
        BitArray bitArray = new BitArray();
        for (Token token2 : linkedList) {
            token2.appendTo(bitArray, bArr);
        }
        return bitArray;
    }

    public String toString() {
        return String.format("%s bits=%d bytes=%d", HighLevelEncoder.f44214b[this.f44223a], Integer.valueOf(this.f44226d), Integer.valueOf(this.f44225c));
    }
}
