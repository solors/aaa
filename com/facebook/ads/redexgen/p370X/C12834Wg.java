package com.facebook.ads.redexgen.p370X;

import java.util.Arrays;
import org.json.JSONException;

/* renamed from: com.facebook.ads.redexgen.X.Wg */
/* loaded from: assets/audience_network.dex */
public class C12834Wg implements InterfaceC12563SH {
    public static byte[] A02;
    public static String[] A03 = {"11yowYa9SjobATSyd4jbcYQKUh4edG44", "bHv0W2DtzV8d9jrYb9gmoc8MmzdN0fpB", "oW", "tKoi6cKGljbVocPn31APtwXZRyGd7igq", "ywmFCSl3Vn78B2eGXobUvwrScWlSo3bc", "aFROHHWcme9RokkBpAaOqFeveGyJeM2s", "QLtd5uCJprXFRqzwd31bhpzpUHhxzcVz", "aKhknuldK0UVZxwEW2ZbTGmFeUx0ymlu"};
    public final /* synthetic */ C13028Zr A00;
    public final /* synthetic */ InterfaceC12561SF A01;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 80);
            if (A03[0].charAt(21) == 'R') {
                throw new RuntimeException();
            }
            A03[0] = "rnyHoYqJfuEUpW7gm8XbWdjDtWL8fGmk";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{101, 102, 98, 119, 118, 113, 102, 92, 96, 108, 109, 101, 106, 100};
    }

    static {
        A01();
    }

    public C12834Wg(InterfaceC12561SF interfaceC12561SF, C13028Zr c13028Zr) {
        this.A01 = interfaceC12561SF;
        this.A00 = c13028Zr;
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC12563SH
    public final void A4R() {
        try {
            C11979Im.A0T(this.A00).A2u(this.A01.A75().optJSONObject(A00(0, 14, 83)));
        } catch (JSONException e) {
            this.A00.A07().A3y(e);
        }
    }
}
