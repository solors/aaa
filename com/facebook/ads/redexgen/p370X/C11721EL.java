package com.facebook.ads.redexgen.p370X;

import android.os.ConditionVariable;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.facebook.ads.internal.exoplayer2.thirdparty.offline.DownloadAction;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: com.facebook.ads.redexgen.X.EL */
/* loaded from: assets/audience_network.dex */
public final class C11721EL {
    public static byte[] A0F;
    public static String[] A0G = {"otHTb9LvI8ybF6vrVoO1rTrPCp306O74", "Rx1vO7hG8Az7i2Yj5pT4De7fyKew8lrJ", "xjFXtX9mXqBQEfJw2y9yGwIvt6nkyUB", "C8lHiEVGsA1InycY308zMITezDqlCJlt", "8V8H42NkZamtdcgQEkzyKv1AlHm2P2", "xa3iAkfTrkxPXtVHKDgHiLu9rp62G8cA", "MIua6DThmQIF1vqzpVDjqirjX1nsx6C7", "GEPWk2OCqdzdo4xY0bozaqI"};
    public int A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final Handler A06;
    public final Handler A07;
    public final HandlerThread A08;
    public final C11709E1 A09;
    public final C11723EQ A0A;
    public final ArrayList<RunnableC11719EI> A0B;
    public final ArrayList<RunnableC11719EI> A0C;
    public final CopyOnWriteArraySet<InterfaceC11716EE> A0D;
    public final DownloadAction.Deserializer[] A0E;

    public static String A05(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0F, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            byte b = (byte) ((copyOfRange[i4] ^ i3) ^ 99);
            String[] strArr = A0G;
            if (strArr[4].length() == strArr[7].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0G;
            strArr2[4] = "YsGjonOW8fRp2ADpBQb8BIeWFn3N4H";
            strArr2[7] = "cgMIGSsvrovKZppoEzUMmRP";
            copyOfRange[i4] = b;
        }
        return new String(copyOfRange);
    }

    public static void A0C() {
        A0F = new byte[]{70, 5, 10, 7, 21, 14, 3, 21, 70, 17, 15, 18, 14, 70, 108, 118, 124, 73, 29, 81, 88, 92, 78, 73, 29, 82, 83, 88, 29, 121, 88, 78, 88, 79, 84, 92, 81, 84, 71, 88, 79, 29, 84, 78, 29, 79, 88, 76, 72, 84, 79, 88, 89, 19, 86, 125, 101, 124, 126, 125, 115, 118, 95, 115, 124, 115, 117, 119, 96, 50, 116, 123, 126, 119, 50, 123, 61, 125, 5, 48, 34, 58, 113, 56, 34, 113, 48, 53, 53, 52, 53, 34, 23, 5, 29, 86, 5, 2, 23, 2, 19, 86, 31, 5, 86, 21, 30, 23, 24, 17, 19, 18};
    }

    static {
        A0C();
    }

    public C11721EL(C11723EQ c11723eq, int i, int i2, File file, DownloadAction.Deserializer... deserializerArr) {
        AbstractC11914Hf.A05(deserializerArr.length > 0, A05(16, 38, 94));
        this.A0A = c11723eq;
        this.A04 = i;
        this.A05 = i2;
        this.A09 = new C11709E1(file);
        this.A0E = deserializerArr;
        this.A01 = true;
        this.A0C = new ArrayList<>();
        this.A0B = new ArrayList<>();
        Looper myLooper = Looper.myLooper();
        this.A07 = new Handler(myLooper == null ? Looper.getMainLooper() : myLooper);
        this.A08 = new HandlerThread(A05(54, 24, 113));
        this.A08.start();
        this.A06 = new Handler(this.A08.getLooper());
        this.A0D = new CopyOnWriteArraySet<>();
        A08();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public RunnableC11719EI A02(DownloadAction downloadAction) {
        int i = this.A00;
        this.A00 = i + 1;
        RunnableC11719EI runnableC11719EI = new RunnableC11719EI(i, this, downloadAction, this.A05, null);
        this.A0C.add(runnableC11719EI);
        A0K(A05(78, 13, 50), runnableC11719EI);
        return runnableC11719EI;
    }

    private void A08() {
        this.A06.post(new RunnableC11714EC(this));
    }

    private void A09() {
        if (!A0S()) {
            return;
        }
        Iterator<InterfaceC11716EE> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().AC7(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x005c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00dc A[EDGE_INSN: B:62:0x00dc->B:41:0x00dc ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void A0A() {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.p370X.C11721EL.A0A():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0B() {
        if (this.A03) {
            return;
        }
        DownloadAction[] downloadActionArr = new DownloadAction[this.A0C.size()];
        for (int i = 0; i < this.A0C.size(); i++) {
            downloadActionArr[i] = RunnableC11719EI.A06(this.A0C.get(i));
        }
        this.A06.post(new RunnableC11715ED(this, downloadActionArr));
    }

    private final void A0D() {
        if (this.A03) {
            return;
        }
        this.A03 = true;
        if (A0G[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[0] = "kr6gKh0rssOkehhghCFLcVwB9pZxiZaT";
        strArr[5] = "rfZkRg3bvMesL7GazOt2jRzrapFwd57m";
        for (int i = 0; i < this.A0C.size(); i++) {
            RunnableC11719EI.A0D(this.A0C.get(i));
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        this.A06.post(new RunnableC11712EA(this, conditionVariable));
        conditionVariable.block();
        this.A08.quit();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0E(RunnableC11719EI runnableC11719EI) {
        A0K(A05(91, 21, 21), runnableC11719EI);
        C11720EK A0M = runnableC11719EI.A0M();
        Iterator<InterfaceC11716EE> it = this.A0D.iterator();
        while (it.hasNext()) {
            it.next().ADl(this, A0M);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void A0F(RunnableC11719EI runnableC11719EI) {
        if (this.A03) {
            return;
        }
        boolean A0N = runnableC11719EI.A0N();
        if (A0G[2].length() == 27) {
            throw new RuntimeException();
        }
        String[] strArr = A0G;
        strArr[3] = "37NPLrajbAjLzkLuMj2xLkQATtgOEqIn";
        strArr[1] = "qsbydxnKXALymqP4MnHEOj9tIKxnSORB";
        boolean stopped = !A0N;
        if (stopped) {
            this.A0B.remove(runnableC11719EI);
        }
        A0E(runnableC11719EI);
        if (runnableC11719EI.A0O()) {
            this.A0C.remove(runnableC11719EI);
            A0B();
        }
        if (stopped) {
            A0A();
            A09();
        }
    }

    public static void A0K(String str, RunnableC11719EI runnableC11719EI) {
        String str2 = str + A05(14, 2, 53) + runnableC11719EI;
    }

    public final int A0P(DownloadAction downloadAction) {
        AbstractC11914Hf.A04(!this.A03);
        RunnableC11719EI A02 = A02(downloadAction);
        if (this.A02) {
            A0B();
            A0A();
            if (RunnableC11719EI.A03(A02) == 0) {
                A0E(A02);
            }
        }
        return RunnableC11719EI.A04(A02);
    }

    public final void A0Q() {
        AbstractC11914Hf.A04(!this.A03);
        if (this.A01) {
            this.A01 = false;
            A0A();
        }
    }

    public final void A0R(InterfaceC11716EE interfaceC11716EE) {
        this.A0D.add(interfaceC11716EE);
    }

    public final boolean A0S() {
        AbstractC11914Hf.A04(!this.A03);
        if (!this.A02) {
            return false;
        }
        int i = 0;
        while (true) {
            ArrayList<RunnableC11719EI> arrayList = this.A0C;
            if (A0G[2].length() == 27) {
                throw new RuntimeException();
            }
            A0G[2] = "lfjS8VPE";
            int i2 = arrayList.size();
            if (i >= i2) {
                return true;
            }
            if (this.A0C.get(i).A0N()) {
                return false;
            }
            i++;
        }
    }

    public final C11720EK[] A0T() {
        AbstractC11914Hf.A04(!this.A03);
        C11720EK[] c11720ekArr = new C11720EK[this.A0C.size()];
        for (int i = 0; i < c11720ekArr.length; i++) {
            c11720ekArr[i] = this.A0C.get(i).A0M();
        }
        return c11720ekArr;
    }
}
