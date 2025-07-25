package com.facebook.ads.redexgen.p370X;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* renamed from: com.facebook.ads.redexgen.X.N1 */
/* loaded from: assets/audience_network.dex */
public final class C12237N1 extends LinearLayout {
    public static final int A08 = (int) (AbstractC12137LP.A02 * 15.0f);
    public static final int A09 = (int) (AbstractC12137LP.A02 * 10.0f);
    public static final int A0A = (int) (AbstractC12137LP.A02 * 44.0f);
    public int A00;
    public boolean A01;
    public boolean A02;
    public final ImageView A03;
    public final LinearLayout A04;
    public final TextView A05;
    public final C13029Zs A06;
    public final C12317OJ A07;

    public C12237N1(C13029Zs c13029Zs, int i, boolean z) {
        super(c13029Zs);
        this.A01 = false;
        this.A06 = c13029Zs;
        this.A02 = z;
        this.A03 = new ImageView(c13029Zs);
        this.A03.setPadding(A09, A09, A09, A09);
        this.A07 = new C12317OJ(c13029Zs, this.A02);
        this.A07.setProgress(0.0f);
        this.A07.setPadding(A09, A09, A09, A09);
        this.A05 = new TextView(c13029Zs);
        setOrientation(0);
        this.A04 = new LinearLayout(c13029Zs);
        this.A00 = i;
        A00();
    }

    private void A00() {
        setToolbarActionMode(this.A00);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(A0A, A0A);
        AbstractC12177M3.A0Y(this.A05, true, 16);
        this.A05.setTextColor(-1);
        this.A05.setVisibility(8);
        this.A04.addView(this.A03, layoutParams2);
        this.A04.addView(this.A07, layoutParams2);
        addView(this.A04, layoutParams);
        LinearLayout.LayoutParams actionTextLayoutParams = new LinearLayout.LayoutParams(-2, -2);
        actionTextLayoutParams.gravity = 17;
        addView(this.A05, actionTextLayoutParams);
    }

    private void A01() {
        int i;
        C12317OJ c12317oj = this.A07;
        int i2 = 8;
        if (this.A00 == 2 || this.A00 == 6) {
            i = this.A01 ? 4 : 0;
        } else {
            i = 8;
        }
        c12317oj.setVisibility(i);
        ImageView imageView = this.A03;
        if (this.A00 == 5) {
            i2 = 4;
        } else if (this.A00 != 2 && this.A00 != 6) {
            i2 = 0;
        }
        imageView.setVisibility(i2);
    }

    public final void A02() {
        setVisibility(4);
    }

    public final void A03(float f, int i) {
        this.A07.A02(f, i);
    }

    public final void A04(C109491O c109491o, boolean z, boolean z2) {
        int A04 = c109491o.A04(z);
        C12317OJ c12317oj = this.A07;
        int accentColor = AbstractC110382p.A01(A04, 77);
        c12317oj.A03(accentColor, A04, 110);
        this.A03.setColorFilter(A04);
        if (z2) {
            TextView textView = this.A05;
            int accentColor2 = AbstractC110382p.A01(-1, 110);
            textView.setTextColor(accentColor2);
            return;
        }
        this.A05.setTextColor(A04);
    }

    public final boolean A05() {
        return !this.A05.getText().toString().isEmpty();
    }

    public final boolean A06() {
        return (this.A00 == 2 || this.A00 == 4) ? false : true;
    }

    public int getToolbarActionMode() {
        return this.A00;
    }

    public void setActionClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }

    public void setInitialUnskippableSeconds(int i) {
        if (i > 0) {
            setToolbarActionMode(2);
        }
    }

    public void setProgress(float f) {
        this.A07.setProgressWithAnimation(f);
    }

    public void setProgressClickListener(View.OnClickListener onClickListener) {
        this.A07.setOnClickListener(onClickListener);
    }

    public void setProgressImage(EnumC12185MB enumC12185MB) {
        this.A07.setImage(enumC12185MB);
    }

    public void setProgressImmediate(float f) {
        this.A07.clearAnimation();
        this.A07.setProgress(f);
    }

    public void setProgressSpinnerInvisible(boolean z) {
        this.A01 = z;
        A01();
    }

    public void setToolbarActionMode(int i) {
        EnumC12185MB enumC12185MB;
        this.A06.A0E().ADn(i);
        this.A00 = i;
        A01();
        setVisibility(0);
        if (Build.VERSION.SDK_INT >= 16) {
            this.A03.setImageAlpha(255);
        }
        this.A03.setPadding(A09, A09, A09, A09);
        switch (i) {
            case 0:
                enumC12185MB = EnumC12185MB.CROSS;
                break;
            case 1:
                if (!this.A02) {
                    enumC12185MB = EnumC12185MB.SKIP_ARROW;
                    break;
                } else {
                    enumC12185MB = EnumC12185MB.REDESIGN_SKIP_ICON;
                    break;
                }
            case 2:
            default:
                enumC12185MB = EnumC12185MB.CROSS;
                break;
            case 3:
                enumC12185MB = EnumC12185MB.MINIMIZE_ARROW;
                break;
            case 4:
                enumC12185MB = EnumC12185MB.CROSS;
                this.A03.setVisibility(8);
                setVisibility(8);
                break;
            case 5:
                enumC12185MB = EnumC12185MB.CROSS;
                break;
            case 6:
                enumC12185MB = EnumC12185MB.CROSS;
                break;
            case 7:
                enumC12185MB = EnumC12185MB.CROSS;
                if (Build.VERSION.SDK_INT >= 16) {
                    this.A03.setImageAlpha(110);
                }
                this.A03.setPadding(A08, A08, A08, A08);
                break;
        }
        this.A03.setImageBitmap(AbstractC12186MC.A01(enumC12185MB));
        if (i == 1) {
            AbstractC12177M3.A0G(1005, this.A03);
            setVisibility(0);
            return;
        }
        AbstractC12177M3.A0G(1002, this.A03);
    }

    public void setToolbarMessage(String str) {
        this.A05.setText(str);
        this.A05.setVisibility(TextUtils.isEmpty(str) ? 8 : 0);
    }

    public void setToolbarMessageEnabled(boolean z) {
        this.A05.setVisibility(z ? 0 : 4);
    }
}
