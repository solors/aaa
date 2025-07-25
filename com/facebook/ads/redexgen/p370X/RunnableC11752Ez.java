package com.facebook.ads.redexgen.p370X;

/* renamed from: com.facebook.ads.redexgen.X.Ez */
/* loaded from: assets/audience_network.dex */
public class RunnableC11752Ez implements Runnable {
    public static String[] A04 = {"bNyLmb3N6qLOWMc0Y8eIUffpfGiHJ2zf", "EPgwLCljEC0D58KKCue", "fXIKNQs44rLrrkkFXjwsiUBU1KOOt89G", "UtbQBdNMig0VNAvWJF1nsrgE1cnUqwsi", "deqA2BXOlRLEW59yupdWjEkrFGO8uyd1", "qzrOrBeQvrbCa8NjLqM84SeNuzzKVDoR", "GKSMXFhsFIDYOTrN39XHpnz63BL68TvB", "GMEzTd15wNKeZYnzMwi0wLKdwJe5wVCU"};
    public final /* synthetic */ C11759F6 A00;
    public final /* synthetic */ C11760F7 A01;
    public final /* synthetic */ C11761F8 A02;
    public final /* synthetic */ InterfaceC11762F9 A03;

    public RunnableC11752Ez(C11759F6 c11759f6, InterfaceC11762F9 interfaceC11762F9, C11760F7 c11760f7, C11761F8 c11761f8) {
        this.A00 = c11759f6;
        this.A03 = interfaceC11762F9;
        this.A01 = c11760f7;
        this.A02 = c11761f8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            this.A03.ACR(this.A00.A00, this.A00.A01, this.A01, this.A02);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            if (A04[2].charAt(26) != 'O') {
                throw new RuntimeException();
            }
            A04[1] = "pd8797IwMiKx2FYhtxt";
        }
    }
}
