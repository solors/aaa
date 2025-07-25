package com.facebook.ads.redexgen.p370X;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: com.facebook.ads.redexgen.X.DD */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC11661DD implements InterfaceC12880XQ {
    public static String[] A06 = {"z2muy9QJdv6UNqkrRX5Tg36TVvjaRGqW", "YxwD1MugG7ZhXNTXvxibfreR7ej", "rT3nprJIB6deoGRocSgDtQnW", "BfDIjN", "UzZd8wX", "7tX", "IQas6CvLP2cXmM1lvwO9WgYKNIICj7B2", "QvQ"};
    public long A00;
    public long A01;
    public C111604q A02;
    public final ArrayDeque<C111604q> A03 = new ArrayDeque<>();
    public final ArrayDeque<AbstractC11670DM> A04;
    public final PriorityQueue<C111604q> A05;

    public abstract C12877XN A0N();

    public abstract void A0P(C11672DO c11672do);

    public abstract boolean A0R();

    public AbstractC11661DD() {
        for (int i = 0; i < 10; i++) {
            this.A03.add(new C111604q());
        }
        this.A04 = new ArrayDeque<>();
        for (int i2 = 0; i2 < 2; i2++) {
            this.A04.add(new C111574n(this));
        }
        this.A05 = new PriorityQueue<>();
    }

    private void A0K(C111604q c111604q) {
        c111604q.A07();
        this.A03.add(c111604q);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11542BG
    /* renamed from: A0L */
    public C11672DO A5Q() throws C11807Fu {
        AbstractC11914Hf.A04(this.A02 == null);
        if (this.A03.isEmpty()) {
            return null;
        }
        this.A02 = this.A03.pollFirst();
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11542BG
    /* renamed from: A0M */
    public AbstractC11670DM A5R() throws C11807Fu {
        if (this.A04.isEmpty()) {
            return null;
        }
        while (!this.A05.isEmpty() && ((C12971Yw) this.A05.peek()).A00 <= this.A00) {
            C111604q poll = this.A05.poll();
            if (poll.A04()) {
                AbstractC11670DM outputBuffer = this.A04.pollFirst();
                outputBuffer.A00(4);
                A0K(poll);
                return outputBuffer;
            }
            A0P(poll);
            if (A0R()) {
                C12877XN A0N = A0N();
                if (!poll.A03()) {
                    AbstractC11670DM pollFirst = this.A04.pollFirst();
                    pollFirst.A09(((C12971Yw) poll).A00, A0N, Long.MAX_VALUE);
                    A0K(poll);
                    return pollFirst;
                }
            }
            A0K(poll);
        }
        return null;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11542BG
    /* renamed from: A0O */
    public void AEj(C11672DO c11672do) throws C11807Fu {
        AbstractC11914Hf.A03(c11672do == this.A02);
        if (c11672do.A03()) {
            A0K(this.A02);
        } else {
            C111604q c111604q = this.A02;
            long j = this.A01;
            this.A01 = 1 + j;
            c111604q.A00 = j;
            if (A06[6].charAt(25) == 'n') {
                throw new RuntimeException();
            }
            A06[0] = "AtrTuyLMED6qzWt7DVqAVoSQD1pO5Y9g";
            this.A05.add(this.A02);
        }
        this.A02 = null;
    }

    public final void A0Q(AbstractC11670DM abstractC11670DM) {
        abstractC11670DM.A07();
        this.A04.add(abstractC11670DM);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11542BG
    public void AEy() {
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12880XQ
    public void AGb(long j) {
        this.A00 = j;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC11542BG
    public void flush() {
        this.A01 = 0L;
        this.A00 = 0L;
        while (!this.A05.isEmpty()) {
            A0K(this.A05.poll());
        }
        if (this.A02 != null) {
            A0K(this.A02);
            this.A02 = null;
        }
    }
}
