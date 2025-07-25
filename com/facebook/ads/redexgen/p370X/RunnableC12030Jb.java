package com.facebook.ads.redexgen.p370X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.Jb */
/* loaded from: assets/audience_network.dex */
public class RunnableC12030Jb implements Runnable {
    public static byte[] A03;
    public final /* synthetic */ C113257j A00;
    public final /* synthetic */ C12033Je A01;
    public final /* synthetic */ String A02;

    static {
        A01();
    }

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 28);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A03 = new byte[]{-66, -58, -72, -6, -5, 5, 6, 1, 4, 11, 3, -10, 1, 0, 3, 5, -6, -1, -8, -38, -51, -39, -35, -51, -37, -36, -57, -47, -52};
    }

    public RunnableC12030Jb(C12033Je c12033Je, String str, C113257j c113257j) {
        this.A01 = c12033Je;
        this.A02 = str;
        this.A00 = c113257j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List list;
        List list2;
        ArrayList arrayList;
        List list3;
        int i;
        int i2;
        int i3;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            C113578F nvl = new C113578F(A00(0, 3, 84));
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put(A00(3, 7, 118), jSONArray);
            jSONObject.put(A00(19, 10, 76), this.A02);
            list = this.A01.A0D;
            synchronized (list) {
                list2 = this.A01.A0D;
                arrayList = new ArrayList(list2);
                list3 = this.A01.A0D;
                list3.clear();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                C12032Jd c12032Jd = (C12032Jd) it.next();
                StringBuilder append = new StringBuilder().append(A00(0, 0, 23));
                i = c12032Jd.A00;
                StringBuilder append2 = append.append(i).append(';');
                i2 = c12032Jd.A02;
                StringBuilder append3 = append2.append(i2).append(';');
                i3 = c12032Jd.A01;
                jSONArray.put(append3.append(i3).toString());
            }
            nvl.A07(jSONObject);
            nvl.A05(1);
            this.A00.A07().AA1(A00(10, 9, 117), AbstractC113568E.A2R, nvl);
        } catch (JSONException unused) {
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
