package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.facebook.ads.redexgen.X.Ui */
/* loaded from: assets/audience_network.dex */
public final class View$OnClickListenerC12713Ui extends AbstractC12319OL implements View.OnClickListener {
    public static byte[] A0D;
    public static String[] A0E = {"zJy5N3L509NIqOAGCBmq2SY7W4xK8HwT", "H2", ExifInterface.LONGITUDE_EAST, "vMyDxD7xbIgTd", "0bWjMiKAxESivC84rSJqWsF4vTTr4zpm", "NIsgbM1VoVKu1UXdUm6ipB03AExBFzGo", "hF", "2iAtRdiONhZPMieR3MSLVzPYox5YjbDW"};
    public static final int A0F;
    public int A00;
    public int A01;
    public Bitmap A02;
    public Paint A03;
    public Rect A04;
    public C13029Zs A05;
    public C12129LH A06;
    public C12715Uk A07;
    public String A08;
    public String A09;
    public boolean A0A;
    public final C12315OH A0B;
    public final Map<String, String> A0C;

    public static String A04(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0D, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 121);
        }
        return new String(copyOfRange);
    }

    public static void A07() {
        A0D = new byte[]{-30, -21, -24, -30, -22, -34, -14, -18, -12, -15, -30, -28, -23, -27, -80, -16, -24, -10, -10, -24, -15, -22, -24, -11, 40, 38, 24, 37, 22, 31, 28, 22, 30};
    }

    static {
        A07();
        A0F = (int) (AbstractC12137LP.A02 * 24.0f);
    }

    public View$OnClickListenerC12713Ui(C13029Zs c13029Zs, AbstractC13171cD abstractC13171cD, C109491O c109491o, InterfaceC12000J7 interfaceC12000J7, InterfaceC12201MR interfaceC12201MR, C12530Rk c12530Rk, C12169Lv c12169Lv, InterfaceC12147LZ interfaceC12147LZ) {
        this(c13029Zs, abstractC13171cD.A0Y(), c109491o, abstractC13171cD.A1P().A0G().A06(), interfaceC12000J7, interfaceC12201MR, c12530Rk, c12169Lv, abstractC13171cD.A1Q(), interfaceC12147LZ);
        this.A0B.A04(abstractC13171cD);
    }

    public View$OnClickListenerC12713Ui(C13029Zs c13029Zs, String str, C109491O c109491o, InterfaceC12000J7 interfaceC12000J7, InterfaceC12201MR interfaceC12201MR, C12530Rk c12530Rk, C12169Lv c12169Lv, C109541T c109541t) {
        this(c13029Zs, str, c109491o, false, interfaceC12000J7, interfaceC12201MR, c12530Rk, c12169Lv, c109541t);
    }

    public View$OnClickListenerC12713Ui(C13029Zs c13029Zs, String str, C109491O c109491o, boolean z, InterfaceC12000J7 interfaceC12000J7, InterfaceC12201MR interfaceC12201MR, C12530Rk c12530Rk, C12169Lv c12169Lv, C109541T c109541t) {
        super(c13029Zs, c109491o);
        this.A0C = new HashMap();
        this.A05 = c13029Zs;
        this.A0A = z;
        this.A0B = new C12315OH(c13029Zs, str, c12530Rk, c12169Lv, interfaceC12000J7, c109541t, interfaceC12201MR);
        setOnClickListener(this);
        AbstractC12177M3.A0G(1001, this);
    }

    public View$OnClickListenerC12713Ui(C13029Zs c13029Zs, String str, C109491O c109491o, boolean z, InterfaceC12000J7 interfaceC12000J7, InterfaceC12201MR interfaceC12201MR, C12530Rk c12530Rk, C12169Lv c12169Lv, C109541T c109541t, InterfaceC12147LZ interfaceC12147LZ) {
        super(c13029Zs, c109491o);
        this.A0C = new HashMap();
        this.A05 = c13029Zs;
        this.A0A = z;
        this.A0B = new C12315OH(c13029Zs, str, c12530Rk, c12169Lv, interfaceC12000J7, c109541t, interfaceC12201MR, interfaceC12147LZ);
        setOnClickListener(this);
        AbstractC12177M3.A0G(1001, this);
    }

    public static Bitmap A03(Drawable drawable) {
        if (drawable instanceof BitmapDrawable) {
            return ((BitmapDrawable) drawable).getBitmap();
        }
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    private void A05() {
        if (this.A0A && this.A09 != null) {
            this.A02 = A03(AbstractC12186MC.A03(this.A05, this.A09.contains(A04(12, 12, 10)) ? EnumC12185MB.MESSENGER : EnumC12185MB.WHATSAPP));
            this.A03 = new Paint();
            setPadding(A0F, 0, A0F, 0);
        }
    }

    private void A06() {
        if (this.A06 != null) {
            C12129LH c12129lh = this.A06;
            if (A0E[0].charAt(27) != 'K') {
                throw new RuntimeException();
            }
            String[] strArr = A0E;
            strArr[6] = "Jn";
            strArr[1] = "nM";
            c12129lh.A06();
        }
        if (this.A07 != null) {
            this.A07.A04();
        }
    }

    public static boolean A08(AbstractC13171cD abstractC13171cD) {
        return ((long) abstractC13171cD.A1M()) > 0 && abstractC13171cD.A1K() >= 0;
    }

    public final void A09(String str) {
        if (TextUtils.isEmpty(this.A08) || TextUtils.isEmpty(this.A09)) {
            return;
        }
        A06();
        this.A0C.put(A04(0, 12, 6), str);
        this.A0B.A08(this.A08, this.A09, this.A0C);
    }

    public final boolean A0A(AbstractC13171cD abstractC13171cD, AbstractC12200MQ abstractC12200MQ) {
        if (this.A06 != null || !A08(abstractC13171cD) || abstractC13171cD.A1T().A01() == null || abstractC13171cD.A1T().A00() == null) {
            return false;
        }
        this.A07 = new C12715Uk(abstractC13171cD.A1K(), abstractC13171cD.A1M(), abstractC13171cD.A1L(), abstractC13171cD.A1T().A01(), abstractC13171cD.A1T().A00(), abstractC12200MQ, this);
        this.A06 = new C12129LH(abstractC13171cD.A1M(), this.A07);
        this.A06.A07();
        return true;
    }

    public C12315OH getCtaActionHelper() {
        return this.A0B;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A09(A04(24, 9, 58));
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        A06();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onDraw(Canvas canvas) {
        if (this.A02 != null) {
            this.A04 = new Rect(0, 0, this.A02.getWidth(), this.A02.getHeight());
            this.A01 = this.A02.getWidth();
            this.A00 = 12;
            int shift = (this.A01 + this.A00) / 2;
            canvas.save();
            canvas.translate(shift, 0.0f);
        }
        super.onDraw(canvas);
        if (this.A02 != null) {
            float textWidth = this.A01;
            float width = ((getWidth() / 2.0f) - ((getPaint().measureText((String) getText()) + 10.0f) / 2.0f)) - textWidth;
            float textWidth2 = this.A00;
            int i = (int) (width - textWidth2);
            int top = (getHeight() / 2) - (this.A01 / 2);
            int left = this.A01;
            Rect destRect = new Rect(i, top, left + i, this.A01 + top);
            canvas.drawBitmap(this.A02, this.A04, destRect, this.A03);
            canvas.restore();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i != 0) {
            A06();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (!z) {
            A06();
        }
    }

    public void setCreativeAsCtaLoggingHelper(C12133LL c12133ll) {
        this.A0B.A05(c12133ll);
    }

    public void setCta(C109501P c109501p, String str, Map<String, String> extraData) {
        setCta(c109501p, str, extraData, null);
    }

    public void setCta(C109501P c109501p, String str, Map<String, String> extraData, InterfaceC12147LZ interfaceC12147LZ, InterfaceC12314OG interfaceC12314OG) {
        setCta(c109501p, str, extraData, interfaceC12314OG);
        this.A0B.A06(interfaceC12147LZ);
    }

    public void setCta(C109501P c109501p, String str, Map<String, String> extraData, InterfaceC12314OG interfaceC12314OG) {
        this.A08 = str;
        this.A09 = c109501p.A05();
        this.A0C.putAll(extraData);
        this.A0B.A07(interfaceC12314OG);
        String A04 = c109501p.A04();
        if (!TextUtils.isEmpty(A04)) {
            String buttonText = this.A09;
            if (!TextUtils.isEmpty(buttonText)) {
                setText(A04);
                A05();
                return;
            }
        }
        setVisibility(8);
    }

    public void setIsInAppBrowser(boolean z) {
        this.A0B.A09(z);
    }
}
