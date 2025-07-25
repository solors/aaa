package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.MotionEvent;
import android.widget.RelativeLayout;
import com.facebook.ads.AudienceNetworkActivity;
import com.facebook.ads.internal.api.AudienceNetworkActivityApi;
import com.facebook.ads.internal.context.Repairable;
import com.facebook.ads.internal.dynamicloading.DynamicLoaderImpl;
import com.facebook.ads.internal.protocol.AdPlacementType;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.5Q */
/* loaded from: assets/audience_network.dex */
public final class C111965Q implements AudienceNetworkActivityApi, Repairable {
    public static byte[] A0L;
    public static String[] A0M = {"4LY4lS0Dtnhb2OiQyA5efrKIFR", "dGupKpVCMt4qg9mKwPVhImHWchSaWcIC", "ZyPDBV2Dgn506ClNEjHAvEDIkGgGqxcu", "6d7pmCocDfQ9ggh3dWvmWW2CO", "v0AhzTtfFBaqfNNgAD9Hm9U40nGOHxVb", "UIU6rcdX7ZqD4Xq5NwRFZisMuquIGFkO", "tB8Uz7UMZA3JApFIn70Qu6pSbr2GCqXd", "GRU7Zt0cjyIBsRz9MT2AF"};
    public int A00;
    public int A02;
    public long A03;
    public long A04;
    public Intent A05;
    public RelativeLayout A06;
    public EnumC12069KG A07;
    public InterfaceC12202MS A08;
    public AbstractC12250NE A09;
    public C12450QS A0A;
    public String A0B;
    public String A0C;
    public boolean A0D;
    public final AudienceNetworkActivity A0E;
    public final AudienceNetworkActivityApi A0F;
    public final C112065a A0G;
    public final C112155j A0H;
    public final C1123462 A0I;
    public final C13029Zs A0J;
    public final List<InterfaceC112025W> A0K = new ArrayList();
    public int A01 = -1;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0L, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 34);
        }
        return new String(copyOfRange);
    }

    public static void A02() {
        A0L = new byte[]{3, 56, 55, 52, 58, 51, 118, 34, 57, 118, 63, 56, 48, 51, 36, 118, 32, 63, 51, 33, 2, 47, 38, 51, 118, 48, 36, 57, 59, 118, 63, 56, 34, 51, 56, 34, 118, 57, 36, 118, 37, 55, 32, 51, 50, 31, 56, 37, 34, 55, 56, 53, 51, 5, 34, 55, 34, 51, 42, 37, 20, 42, 40, 63, 34, 61, 34, 63, 50, 122, 120, 117, 117, 124, 107, 77, 96, 105, 124, 121, 118, 115, Byte.MAX_VALUE, 116, 110, 78, 117, 113, Byte.MAX_VALUE, 116, 116, 120, 122, 57, 113, 118, 116, 114, 117, 120, 120, 124, 57, 118, 115, 100, 57, 126, 121, 99, 114, 101, 100, 99, 126, 99, 126, 118, 123, 57, 115, 126, 100, 103, 123, 118, 110, 114, 115, 110, 99, 108, 102, 113, 97, 99, 114, 103, 62, 37, 60, 60, 49, 40, 59, 44, 44, 55, 58, 59, 26, 43, 51, 46, 45, 39, 45, 46, 49, 44, 42, 44, 63, 55, 42, 7, 5, 18, 19, 18, 17, 30, 25, 18, 19, 56, 5, 30, 18, 25, 3, 22, 3, 30, 24, 25, 60, 18, 14, 79, 87, 85, 76, 125, 90, 72, 89, 78, 111, 89, 95, 83, 82, 88, 79, 122, 97, 81, 97, 124, 103, 107, 96, 122, 111, 122, 103, 97, 96, 112, 107, 108, 116, 112, 96, 76, 97, 14, 17, 29, 15, 44, 1, 8, 29};
    }

    static {
        A02();
    }

    public C111965Q(AudienceNetworkActivity audienceNetworkActivity, AudienceNetworkActivityApi audienceNetworkActivityApi) {
        this.A0E = audienceNetworkActivity;
        this.A0F = audienceNetworkActivityApi;
        this.A0J = C112075b.A02(audienceNetworkActivity);
        this.A0J.A0N(this);
        this.A0H = new C112155j(this.A0J, this.A0E);
        this.A0I = new C1123462(this.A0J, this.A0E);
        this.A0G = new C112065a(this, this.A0J, this.A0E);
    }

    private String A00() {
        if (this.A07 == null || this.A07.A03() == null) {
            return A01(138, 4, 114);
        }
        return this.A07.A03();
    }

    private void A03(Intent intent, Bundle bundle) {
        String A01 = A01(227, 8, 90);
        String A012 = A01(219, 8, 39);
        String A013 = A01(165, 24, 85);
        if (bundle != null) {
            Bundle A02 = C12104Kq.A02(bundle, DynamicLoaderImpl.class.getClassLoader());
            this.A01 = A02.getInt(A013, -1);
            this.A0B = A02.getString(A012);
            this.A07 = (EnumC12069KG) A02.getSerializable(A01);
            return;
        }
        this.A01 = intent.getIntExtra(A013, -1);
        this.A0B = intent.getStringExtra(A012);
        this.A07 = (EnumC12069KG) intent.getSerializableExtra(A01);
        this.A02 = intent.getIntExtra(A01(189, 16, 30), 0) * 1000;
    }

    public final RelativeLayout A04() {
        return this.A06;
    }

    public final AudienceNetworkActivity A05() {
        return this.A0E;
    }

    public final C13029Zs A06() {
        return this.A0J;
    }

    public final C12450QS A07() {
        return this.A0A;
    }

    public final String A08() {
        return this.A0B;
    }

    public final void A09() {
        this.A0G.A05(this.A07, this.A0B);
    }

    public final void A0A(InterfaceC112025W interfaceC112025W) {
        this.A0K.add(interfaceC112025W);
    }

    public final void A0B(InterfaceC112025W interfaceC112025W) {
        this.A0K.remove(interfaceC112025W);
    }

    public final void A0C(String str) {
        this.A0G.A09(str, this.A0B);
    }

    public final void A0D(String str, C109601Z c109601z) {
        if (this.A08 == null) {
            return;
        }
        AbstractC12250NE abstractC12250NE = this.A09;
        if (A0M[6].charAt(30) != 'X') {
            throw new RuntimeException();
        }
        A0M[0] = "nOOhjPgmgj4ymGbfbhDfGuv2YA";
        if (abstractC12250NE == null) {
            this.A09 = AbstractC12251NF.A02(this.A0J, this.A0J.A09(), str, c109601z, this.A08, new C13074ab(this));
            this.A09.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
        AbstractC12177M3.A0J(this.A09);
        AbstractC12177M3.A0T(this.A06);
        this.A06.addView(this.A09);
        this.A09.A0K();
    }

    public final void A0E(String str, C113988v c113988v) {
        this.A0G.A08(str, c113988v, this.A0B);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        AbstractC12110Ky.A00();
        if (0 != 0) {
            throw new NullPointerException(A01(142, 15, 124));
        }
        this.A0F.dump(str, fileDescriptor, printWriter, strArr);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void finish(int i) {
        this.A0J.A0E().A2y(String.valueOf(A05().hashCode()), i, A00());
        if (this.A0E.isFinishing()) {
            return;
        }
        this.A0G.A07(this.A07, this.A0B);
        this.A0G.A06(this.A07, this.A0B);
        this.A0F.finish(i);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onActivityResult(int i, int i2, Intent intent) {
        if (this.A08 != null && this.A08.onActivityResult(i, i2, intent)) {
            return;
        }
        C12729Uy.A09(i, i2, intent);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onBackPressed() {
        long currentTimeMillis = System.currentTimeMillis();
        long j = this.A03;
        long currentTime = currentTimeMillis - this.A04;
        this.A03 = j + currentTime;
        this.A04 = currentTimeMillis;
        if (this.A03 > this.A02) {
            boolean shouldIntercept = false;
            for (InterfaceC112025W interfaceC112025W : this.A0K) {
                if (interfaceC112025W.A9J()) {
                    shouldIntercept = true;
                }
            }
            if (!shouldIntercept) {
                this.A0F.onBackPressed();
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onConfigurationChanged(Configuration configuration) {
        if (this.A00 != configuration.orientation) {
            HashMap hashMap = new HashMap();
            int i = configuration.orientation;
            String A01 = A01(205, 14, 44);
            if (i == 1) {
                hashMap.put(A01, A01(157, 8, 124));
            } else {
                hashMap.put(A01, A01(129, 9, 32));
            }
            C12008JF.A02(EnumC12007JE.A0K, hashMap, this.A08 == null ? A01(0, 0, 15) : this.A08.getCurrentClientToken(), this.A0J.A09());
            this.A00 = configuration.orientation;
            this.A0H.A01();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onCreate(Bundle bundle) {
        AbstractC12179M5.A02();
        this.A0I.A04();
        this.A05 = C12104Kq.A01(this.A0E.getIntent(), DynamicLoaderImpl.class.getClassLoader());
        C13029Zs A03 = C12104Kq.A03(this.A05);
        if (A03 != null) {
            C13029Zs startAdContext = this.A0J;
            startAdContext.A0L(A03);
        }
        A03(this.A05, bundle);
        C13029Zs startAdContext2 = this.A0J;
        startAdContext2.A0E().A2z(String.valueOf(A05().hashCode()), A00());
        String callerType = this.A05.getStringExtra(A01(69, 10, 59));
        this.A0I.A08(this.A07, callerType == null || !(callerType.equals(AdPlacementType.INTERSTITIAL.name()) || callerType.equals(AdPlacementType.REWARDED_VIDEO.name())));
        this.A06 = new RelativeLayout(this.A0E);
        AbstractC12177M3.A0M(this.A06, 0);
        this.A0E.setContentView(this.A06, new RelativeLayout.LayoutParams(-1, -1));
        Intent intent = this.A05;
        C13029Zs startAdContext3 = this.A0J;
        InterfaceC12000J7 A09 = startAdContext3.A09();
        C13029Zs startAdContext4 = this.A0J;
        this.A08 = new C112015V(this, intent, A09, startAdContext4).A0M(this.A07, this.A06);
        if (this.A08 == null) {
            C13029Zs startAdContext5 = this.A0J;
            startAdContext5.A07().AA0(A01(58, 11, 105), AbstractC113568E.A0A, new C113578F(A01(0, 58, 116)));
            A09();
            finish(7);
            return;
        }
        this.A08.A9q(this.A05, bundle, this);
        this.A0G.A09(A01(90, 39, 53), this.A0B);
        this.A04 = System.currentTimeMillis();
        this.A0A = this.A0I.A03(this.A05, this.A06);
        this.A0I.A07(this.A05, this.A07, this.A06);
        this.A00 = this.A0E.getResources().getConfiguration().orientation;
        String callerType2 = A01(79, 11, 56);
        if (bundle != null) {
            this.A0C = bundle.getString(callerType2);
        } else {
            String stringExtra = this.A05.getStringExtra(callerType2);
            if (A0M[7].length() != 21) {
                A0M[5] = "dMohbzPZPFL3lBhphwrH1b8arfl2r2Ch";
                this.A0C = stringExtra;
            } else {
                A0M[0] = "3wH6tZS0sHFmmn7H8QunQNd9ha";
                this.A0C = stringExtra;
            }
        }
        this.A0I.A06();
        if (A0M[7].length() != 21) {
            throw new RuntimeException();
        }
        A0M[1] = "aldkJ30NOVt6q0NKQGcnTd28ZfXNLwwL";
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onDestroy() {
        this.A0J.A0E().A30(String.valueOf(A05().hashCode()), A00());
        this.A0G.A04(this.A07, this.A0B);
        if (this.A06 != null) {
            this.A06.removeAllViews();
        }
        if (this.A08 != null) {
            this.A08.onDestroy();
            this.A08 = null;
        }
        this.A0I.A05();
        AbstractC12250NE abstractC12250NE = this.A09;
        if (A0M[7].length() != 21) {
            throw new RuntimeException();
        }
        A0M[6] = "yBcEH8sYDqTUUkxjXqOG2DCn3q2DEyX3";
        if (abstractC12250NE != null) {
            this.A09.A0J();
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onPause() {
        this.A0J.A0E().A31(String.valueOf(A05().hashCode()), A00());
        this.A03 += System.currentTimeMillis() - this.A04;
        if (this.A08 != null) {
            this.A08.ACz(false);
            if (!this.A0E.isFinishing()) {
                C12008JF.A02(EnumC12007JE.A0E, null, this.A08.getCurrentClientToken(), this.A0J.A09());
                this.A0D = true;
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onResume() {
        this.A0J.A0E().A32(String.valueOf(A05().hashCode()), A00());
        this.A04 = System.currentTimeMillis();
        if (this.A08 != null) {
            InterfaceC12202MS interfaceC12202MS = this.A08;
            if (A0M[5].charAt(17) != 'w') {
                throw new RuntimeException();
            }
            A0M[6] = "WHwDulcP2dZca7YA0PmotSPySBaz7ZXD";
            interfaceC12202MS.ADN(false);
            if (this.A0D) {
                C12008JF.A02(EnumC12007JE.A0F, null, this.A08.getCurrentClientToken(), this.A0J.A09());
            }
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onSaveInstanceState(Bundle bundle) {
        Bundle bundle2 = new Bundle();
        if (this.A08 != null) {
            this.A08.AFx(bundle2);
        }
        bundle2.putInt(A01(165, 24, 85), this.A01);
        bundle2.putString(A01(219, 8, 39), this.A0B);
        bundle2.putString(A01(79, 11, 56), this.A0C);
        bundle2.putSerializable(A01(227, 8, 90), this.A07);
        C12104Kq.A09(bundle, bundle2);
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStart() {
        this.A0J.A0E().A33(String.valueOf(A05().hashCode()), A00());
        if (this.A01 != -1) {
            AbstractC12196MM.A02(this.A0E, this.A01, this.A0J);
        }
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final void onStop() {
        this.A0J.A0E().A34(String.valueOf(A05().hashCode()), A00());
    }

    @Override // com.facebook.ads.internal.api.AudienceNetworkActivityApi
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        return this.A0F.onTouchEvent(motionEvent);
    }

    @Override // com.facebook.ads.internal.context.Repairable
    public final void repair(Throwable th) {
        A09();
        finish(5);
    }
}
