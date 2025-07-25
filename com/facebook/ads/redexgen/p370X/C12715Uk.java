package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Uk */
/* loaded from: assets/audience_network.dex */
public final class C12715Uk implements InterfaceC12128LG {
    public static byte[] A0B;
    public int A00;
    public int A01;
    public int A02;
    public AbstractC12200MQ A03;
    public String A04;
    public String A05;
    public View$OnClickListenerC12713Ui A06;
    public boolean A0A = false;
    public boolean A09 = false;
    public boolean A08 = false;
    public Integer A07 = null;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0B, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 113);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0B = new byte[]{78, 102, 112, 118, 102, 72, 117, 97, 96, 123, 119, 120, 125, 119, Byte.MAX_VALUE};
    }

    public C12715Uk(int i, int i2, int i3, String str, String str2, AbstractC12200MQ abstractC12200MQ, View$OnClickListenerC12713Ui view$OnClickListenerC12713Ui) {
        this.A01 = i;
        this.A00 = i2;
        this.A02 = i3;
        this.A05 = str;
        this.A04 = str2;
        this.A03 = abstractC12200MQ;
        this.A06 = view$OnClickListenerC12713Ui;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void A02() {
        if (this.A08) {
            A04();
        }
    }

    public final synchronized void A04() {
        if (this.A09) {
            return;
        }
        this.A09 = true;
        if (this.A01 == 1 && this.A03 != null) {
            this.A03.setProgressImage(null);
            this.A03.setProgressClickListener(null);
            this.A03.setToolbarActionMessage(A00(0, 0, 66));
            this.A03.A06();
            if (this.A07 != null) {
                this.A03.setToolbarActionMode(this.A07.intValue());
            }
            if (this.A06.getColorInfo() != null) {
                this.A03.A09(this.A06.getColorInfo(), false);
            }
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12128LG
    public final synchronized void ABb() {
        if (!this.A09) {
            this.A06.A09(A00(6, 9, 101));
        }
        A04();
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12128LG
    public final synchronized void ADF(float f) {
        if (!this.A09 && this.A03 != null) {
            if (this.A01 == 1) {
                if (!this.A0A) {
                    this.A07 = Integer.valueOf(this.A03.getToolbarActionMode());
                    this.A03.setProgressClickListener(new View$OnClickListenerC12313OF(this));
                    this.A03.A07();
                    this.A03.setToolbarListener(new C12716Ul(this));
                    this.A0A = true;
                    if (this.A07 == null || this.A07.intValue() == 4) {
                        this.A03.setToolbarActionMode(5);
                    } else {
                        this.A03.setToolbarActionMode(6);
                    }
                }
                if (f <= this.A02) {
                    if (!this.A08) {
                        this.A08 = true;
                        if (this.A07 == null || this.A07.intValue() == 4) {
                            this.A03.setToolbarActionMode(7);
                        } else {
                            this.A03.setProgressImage(EnumC12185MB.CROSS);
                            this.A03.setToolbarActionMode(6);
                        }
                    }
                    this.A03.setToolbarActionMessage(this.A04.replace(A00(0, 6, 100), String.valueOf((int) Math.ceil(f))));
                } else {
                    this.A03.setToolbarActionMessage(this.A05);
                }
            }
        }
    }
}
