package com.facebook.ads.redexgen.p370X;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Wb */
/* loaded from: assets/audience_network.dex */
public final class C12829Wb implements InterfaceC110052I {
    public static C12829Wb A01;
    public static byte[] A02;
    public static String[] A03 = {"JA9mFndCctStcDzVBolZEhplBWXHl3GV", "NcYgt8CJQWeZTs6r7gmN4DT79HnpXepC", "3XxDtH0VTaUV7XfCs333UHSSC4s6Co3p", "GzYduKaWaeKhPeumV22hkK4VttJt2TZR", "1SSiXu0qt70LSSG", "DSz0vhavMIehNnnYUsD24XzaqUk6jyxA", "cWkBnlzylFFk2PvMzvfAX6O9wvYh3tUg", "DdhgMLh6mU1KSfIF9B7woVtLM"};
    public static final String A04;
    public final LinkedHashMap<String, C11992Iz> A00 = new LinkedHashMap<>();

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 124);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A02 = new byte[]{74, 93, 70, 76, 68, 77, 87, 77, 80, 92, 90, 73, 91, 87, 67, 77, 81, 6, 39, 49, 54, 48, 45, 59, 39, 38, 98, 3, 38, 98, 112, 119, 113, 124, 98, 103, 124, 106, 103, 124, 104, 102, 122};
    }

    static {
        A02();
        A04 = C12829Wb.class.getSimpleName();
    }

    public static C12829Wb A00() {
        if (A01 == null) {
            A01 = new C12829Wb();
        }
        return A01;
    }

    public final InterfaceC1098922 A03(String str) {
        C11992Iz adRecord = this.A00.get(str);
        if (adRecord != null) {
            return adRecord.A00;
        }
        String[] strArr = A03;
        if (strArr[1].charAt(31) != strArr[2].charAt(31)) {
            String[] strArr2 = A03;
            strArr2[3] = "XrwELTKduoHwTv5Xe9Ueh6lc6nYoGsk4";
            strArr2[0] = "dmw4t0heQzRKMH67OrdKuJovyCEl55Ve";
            return null;
        }
        throw new RuntimeException();
    }

    public final C11992Iz A04(String str) {
        return this.A00.get(str);
    }

    public final C11992Iz A05(String str, Messenger messenger, String str2) {
        C11992Iz c11992Iz = new C11992Iz(str, messenger, str2);
        this.A00.put(str, c11992Iz);
        return c11992Iz;
    }

    public final void A06() {
        Iterator<Map.Entry<String, C11992Iz>> it = this.A00.entrySet().iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[5].charAt(17) == strArr[6].charAt(17)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "uaiMeFYOk8P5CT6awQd5iZTKLUhraaN2";
            strArr2[6] = "RG3ipiEhElKk8ivC3FwrEM9mKg3mEr0b";
            if (hasNext) {
                InterfaceC1098922 interfaceC1098922 = it.next().getValue().A00;
                if (interfaceC1098922 != null) {
                    interfaceC1098922.destroy();
                }
                it.remove();
            } else {
                return;
            }
        }
    }

    public final void A07(int i, String str, Bundle bundle, Messenger messenger) {
        try {
            Message obtain = Message.obtain((Handler) null, i);
            if (str != null) {
                obtain.getData().putString(A01(30, 13, 95), str);
            }
            if (bundle != null) {
                obtain.getData().putBundle(A01(0, 17, 116), bundle);
            }
            messenger.send(obtain);
        } catch (RemoteException unused) {
            if (str != null) {
                A08(str);
            }
        }
    }

    public final void A08(String str) {
        C11992Iz c11992Iz = this.A00.get(str);
        if (c11992Iz != null && c11992Iz.A00 != null) {
            String str2 = A01(17, 13, 62) + str;
            c11992Iz.A00.destroy();
            this.A00.remove(str);
        }
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC110052I
    public final void ACk(int i, String str, Bundle bundle) {
        C11992Iz adRecord = A04(str);
        if (adRecord != null) {
            A07(i, str, bundle, adRecord.A01);
        }
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, C11992Iz> entry : this.A00.entrySet()) {
            C11992Iz value = entry.getValue();
            try {
                value.A01.send(Message.obtain((Handler) null, 3));
            } catch (RemoteException unused) {
                hashSet.add(value.A02);
            }
        }
        Iterator it = hashSet.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            String[] strArr = A03;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A03;
            strArr2[5] = "oay5V0mz6qjd0xRXPgrRbPRiLoP0UxTC";
            strArr2[6] = "83Bq2rwwej5lQl4xIjWhMW1frgDiuUFT";
            if (hasNext) {
                A08((String) it.next());
            } else {
                return;
            }
        }
    }
}
