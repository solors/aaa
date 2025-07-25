package com.facebook.ads.redexgen.p370X;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;

/* renamed from: com.facebook.ads.redexgen.X.MQ */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC12200MQ extends LinearLayout {
    public static int A00 = (int) (AbstractC12137LP.A02 * 56.0f);

    public abstract void A05();

    public abstract void A06();

    public abstract void A07();

    public abstract void A08(float f, int i);

    public abstract void A09(C109491O c109491o, boolean z);

    public abstract boolean A0A();

    public abstract View getDetailsContainer();

    public abstract int getToolbarActionMode();

    public abstract int getToolbarHeight();

    public abstract InterfaceC12199MP getToolbarListener();

    public abstract void setAdReportingVisible(boolean z);

    public abstract void setCTAClickListener(View.OnClickListener onClickListener);

    public abstract void setCTAClickListener(View$OnClickListenerC12713Ui view$OnClickListenerC12713Ui);

    public abstract void setFullscreen(boolean z);

    public abstract void setPageDetails(C109601Z c109601z, String str, int i, C109661f c109661f);

    public abstract void setPageDetailsVisible(boolean z);

    public abstract void setProgress(float f);

    public abstract void setProgressClickListener(View.OnClickListener onClickListener);

    public abstract void setProgressImage(EnumC12185MB enumC12185MB);

    public abstract void setProgressImmediate(float f);

    public abstract void setProgressSpinnerInvisible(boolean z);

    public abstract void setToolbarActionMessage(String str);

    public abstract void setToolbarActionMode(int i);

    public abstract void setToolbarListener(InterfaceC12199MP interfaceC12199MP);

    public AbstractC12200MQ(Context context) {
        super(context);
    }
}
