package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.5E */
/* loaded from: assets/audience_network.dex */
public final class C111845E {
    public static byte[] A02;
    public static String[] A03 = {"TTkBeT", "dgqPpyxawDBTokVKz6usds7DGGljbLlG", "Om", "1", "lOfLhIubd0jJyTpTkNltmpZf14oHCLV9", "yX0qRkYxaN2cv8t3SuJSwpxSeia", "n9D4XHOOTGgVdLWa6Wuko3wZCERnKgc", "NKR9b6EIrIhl49GaATLNKeLdYiLud"};
    public final C13106bA<AbstractC1117656, C111825C> A00 = new C13106bA<>();
    public final C110412s<AbstractC1117656> A01 = new C110412s<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 13);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        byte[] bArr = {78, 118, 112, 119, 35, 115, 113, 108, 117, 106, 103, 102, 35, 101, 111, 98, 100, 35, 83, 81, 70, 35, 108, 113, 35, 83, 76, 80, 87};
        if (A03[1].charAt(27) != 'j') {
            throw new RuntimeException();
        }
        A03[0] = "DMTuNl";
        A02 = bArr;
    }

    static {
        A02();
    }

    private C111534j A00(AbstractC1117656 abstractC1117656, int i) {
        C111825C A0B;
        C111534j info;
        int A08 = this.A00.A08(abstractC1117656);
        if (A08 >= 0 && (A0B = this.A00.A0B(A08)) != null) {
            int i2 = A0B.A00;
            if (A03[2].length() != 2) {
                throw new RuntimeException();
            }
            A03[2] = "6x";
            if ((i2 & i) != 0) {
                int index = i ^ (-1);
                A0B.A00 &= index;
                if (i == 4) {
                    info = A0B.A02;
                } else if (i == 8) {
                    info = A0B.A01;
                } else {
                    throw new IllegalArgumentException(A01(0, 29, 14));
                }
                int index2 = A0B.A00;
                if ((index2 & 12) == 0) {
                    this.A00.A0A(A08);
                    C111825C.A02(A0B);
                }
                return info;
            }
        }
        return null;
    }

    public final C111534j A03(AbstractC1117656 abstractC1117656) {
        return A00(abstractC1117656, 8);
    }

    public final C111534j A04(AbstractC1117656 abstractC1117656) {
        return A00(abstractC1117656, 4);
    }

    public final AbstractC1117656 A05(long j) {
        return this.A01.A08(j);
    }

    public final void A06() {
        this.A00.clear();
        this.A01.A09();
    }

    public final void A07() {
        C111825C.A01();
    }

    public final void A08(long j, AbstractC1117656 abstractC1117656) {
        this.A01.A0B(j, abstractC1117656);
    }

    public final void A09(AbstractC1117656 abstractC1117656) {
        C111825C c111825c = this.A00.get(abstractC1117656);
        if (c111825c == null) {
            c111825c = C111825C.A00();
            this.A00.put(abstractC1117656, c111825c);
        }
        c111825c.A00 |= 1;
    }

    public final void A0A(AbstractC1117656 abstractC1117656) {
        C111825C c111825c = this.A00.get(abstractC1117656);
        if (c111825c == null) {
            return;
        }
        c111825c.A00 &= -2;
    }

    public final void A0B(AbstractC1117656 abstractC1117656) {
        int A06 = this.A01.A06() - 1;
        while (true) {
            if (A06 < 0) {
                break;
            } else if (abstractC1117656 == this.A01.A07(A06)) {
                this.A01.A0A(A06);
                break;
            } else {
                A06--;
            }
        }
        C111825C info = this.A00.remove(abstractC1117656);
        if (info != null) {
            C111825C.A02(info);
        }
    }

    public final void A0C(AbstractC1117656 abstractC1117656) {
        A0A(abstractC1117656);
    }

    public final void A0D(AbstractC1117656 abstractC1117656, C111534j c111534j) {
        C111825C c111825c = this.A00.get(abstractC1117656);
        if (c111825c == null) {
            c111825c = C111825C.A00();
            this.A00.put(abstractC1117656, c111825c);
        }
        c111825c.A00 |= 2;
        c111825c.A02 = c111534j;
    }

    public final void A0E(AbstractC1117656 abstractC1117656, C111534j c111534j) {
        C111825C c111825c = this.A00.get(abstractC1117656);
        if (c111825c == null) {
            c111825c = C111825C.A00();
            this.A00.put(abstractC1117656, c111825c);
        }
        c111825c.A01 = c111534j;
        c111825c.A00 |= 8;
    }

    public final void A0F(AbstractC1117656 abstractC1117656, C111534j c111534j) {
        C111825C c111825c = this.A00.get(abstractC1117656);
        if (c111825c == null) {
            c111825c = C111825C.A00();
            this.A00.put(abstractC1117656, c111825c);
        }
        c111825c.A02 = c111534j;
        c111825c.A00 |= 4;
    }

    public final void A0G(InterfaceC111835D interfaceC111835D) {
        for (int size = this.A00.size() - 1; size >= 0; size--) {
            AbstractC1117656 A09 = this.A00.A09(size);
            C111825C A0A = this.A00.A0A(size);
            if ((A0A.A00 & 3) == 3) {
                interfaceC111835D.AHG(A09);
            } else {
                int index = A0A.A00;
                if ((index & 1) != 0) {
                    if (A0A.A02 == null) {
                        interfaceC111835D.AHG(A09);
                    } else {
                        interfaceC111835D.AEe(A09, A0A.A02, A0A.A01);
                    }
                } else if ((A0A.A00 & 14) == 14) {
                    interfaceC111835D.AEc(A09, A0A.A02, A0A.A01);
                } else if ((A0A.A00 & 12) == 12) {
                    interfaceC111835D.AEg(A09, A0A.A02, A0A.A01);
                } else {
                    int index2 = A0A.A00;
                    if ((index2 & 4) != 0) {
                        interfaceC111835D.AEe(A09, A0A.A02, null);
                    } else {
                        int index3 = A0A.A00;
                        if ((index3 & 8) != 0) {
                            C111534j c111534j = A0A.A02;
                            if (A03[4].charAt(6) == 'y') {
                                throw new RuntimeException();
                            }
                            A03[7] = "pRTOxDzzIVV0VuKMKqyuKOShfW9n8";
                            interfaceC111835D.AEc(A09, c111534j, A0A.A01);
                        } else {
                            continue;
                        }
                    }
                }
            }
            C111825C.A02(A0A);
        }
    }

    public final boolean A0H(AbstractC1117656 abstractC1117656) {
        C111825C record = this.A00.get(abstractC1117656);
        return (record == null || (record.A00 & 1) == 0) ? false : true;
    }

    public final boolean A0I(AbstractC1117656 abstractC1117656) {
        C111825C record = this.A00.get(abstractC1117656);
        return (record == null || (record.A00 & 4) == 0) ? false : true;
    }
}
