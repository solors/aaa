package com.facebook.ads.redexgen.p370X;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.google.common.primitives.UnsignedBytes;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Mf */
/* loaded from: assets/audience_network.dex */
public final class C12215Mf extends RelativeLayout {
    public static byte[] A03;
    public static String[] A04 = {"1ndtPHkCNG2MrcfU", "OkotuIrDHFdt3GuHIAQXgGngH1IosrSP", "w1znC0uCczOhgZoOcmgh63wQHQC04hJe", "LpK8hBAwmPAdG3KY0YfFHbQT3q40mu0e", "O8GEFlZj6nQCoGB8qsscGdpyRLKvgqm0", "WaIEcxX", "XMBXBBLBPjQfoEVhqbgB7WanyEloQPjm", "KaNBEQe5mownSAjOblO08Wd4OxcuEM8d"};
    public static final int A05;
    public static final int A06;
    public final ImageView A00;
    public final ImageView A01;
    public final C13029Zs A02;

    public static String A01(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[0].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[4] = "ULiiLRGxcEAphtP2D4AjLhxKdPtmqQZf";
            strArr2[3] = "IodoKdznfIBMKrNK9oRp1NZvy6AtC0Mf";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 15);
            i4++;
        }
    }

    public static void A02() {
        String[] strArr = A04;
        if (strArr[4].charAt(18) == strArr[3].charAt(18)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A04;
        strArr2[4] = "AIVPcyptJR7BDqEaYBWxJso7N9d0VHMs";
        strArr2[3] = "PIjuROse392MLv7GhU36YdX9Z5SxUZMR";
        A03 = new byte[]{UnsignedBytes.MAX_POWER_OF_TWO, -109, -98, -99, -96, -94, 78, 111, -110};
    }

    static {
        A02();
        A06 = (int) (AbstractC12137LP.A02 * 4.0f);
        A05 = (int) (AbstractC12137LP.A02 * 6.0f);
    }

    public C12215Mf(C13029Zs c13029Zs) {
        super(c13029Zs);
        this.A02 = c13029Zs;
        AbstractC12177M3.A0S(this, AbstractC12177M3.A06(855638016, A05));
        this.A01 = A00(EnumC12185MB.DEFAULT_INFO_ICON);
        this.A00 = A00(EnumC12185MB.AD_CHOICES_ICON);
        this.A00.setContentDescription(A01(0, 9, 31));
        LinearLayout linearLayout = new LinearLayout(c13029Zs);
        linearLayout.setOrientation(0);
        linearLayout.addView(this.A01);
        linearLayout.addView(this.A00);
        addView(linearLayout, new RelativeLayout.LayoutParams(-1, -1));
        setClickable(true);
        setFocusable(true);
    }

    private ImageView A00(EnumC12185MB enumC12185MB) {
        ImageView imageView = new ImageView(this.A02);
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setPadding(0, A06, 0, A06);
        imageView.setImageBitmap(AbstractC12186MC.A01(enumC12185MB));
        imageView.setColorFilter(-1);
        LinearLayout.LayoutParams iconLayoutParams = new LinearLayout.LayoutParams(0, -1);
        iconLayoutParams.weight = 1.0f;
        imageView.setLayoutParams(iconLayoutParams);
        return imageView;
    }
}
