package com.facebook.ads.redexgen.p370X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.ImageView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Un */
/* loaded from: assets/audience_network.dex */
public final class AsyncTaskC12718Un extends AsyncTask<String, Void, Bitmap[]> implements InterfaceC113207e {
    public static byte[] A0A;
    public static String[] A0B = {"", "", "tk2ciTRcvMIsX7PNNAsbqXfz4cjsZNd3", "5z01THRYCfHu8Ay0wH5meUoLhFHMZyns", "VYXg8wObxMc7BeMRrzz5UEer", "1KBjMNFbEleLBxdQS2J3kw1LUfJ9GnIf", "PvEnCL5gthOso5MBRjJGXOGrZMhqPY73", "dw8jODS3DySi5ymezTFU6bMU1A3tjNXQ"};
    public int A00;
    public int A01;
    public InterfaceC12305O7 A02;
    public boolean A03;
    public final int A04;
    public final int A05;
    public final WeakReference<C12303O5> A06;
    public final WeakReference<C13029Zs> A07;
    public final WeakReference<ImageView> A08;
    public final WeakReference<ViewGroup> A09;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A0A, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 84);
        }
        return new String(copyOfRange);
    }

    public static void A01() {
        A0A = new byte[]{45, 47, 36, 47, 56, 35, 41};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private final Bitmap[] A03(String... strArr) {
        if (AbstractC12078KQ.A02(this)) {
            return null;
        }
        if (A0B[2].charAt(8) != 'z') {
            A0B[2] = "Jzd8uX0XYQJZtrGuhrAJ2cBOXObB1Sdn";
            try {
                String str = strArr[0];
                Bitmap bitmap = null;
                C13029Zs c13029Zs = this.A07.get();
                String[] strArr2 = A0B;
                if (strArr2[6].charAt(7) != strArr2[5].charAt(7)) {
                    A0B[2] = "bv0UYUwFwYp94NQ105UqaFrunwxSHAuK";
                    if (c13029Zs == null) {
                        return new Bitmap[]{null, null};
                    }
                    Bitmap A0N = new C112726f(c13029Zs).A0N(str, this.A00, this.A01);
                    if (A0N != null && !this.A03) {
                        bitmap = AbstractC12184MA.A01(c13029Zs, A0N, this.A04, this.A05);
                    }
                    return new Bitmap[]{A0N, bitmap};
                }
                throw new RuntimeException();
            } catch (Throwable th) {
                AbstractC12078KQ.A00(th, this);
                String[] strArr3 = A0B;
                if (strArr3[7].charAt(9) != strArr3[3].charAt(9)) {
                    A0B[2] = "caPrFgLZt2WaPlUZLvOtKYt7S4BN2jGU";
                    return null;
                }
                return null;
            }
        }
        throw new RuntimeException();
    }

    static {
        A01();
    }

    public AsyncTaskC12718Un(ViewGroup viewGroup, int i, int i2, C13029Zs c13029Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c13029Zs);
        this.A06 = null;
        this.A08 = null;
        this.A09 = new WeakReference<>(viewGroup);
        this.A04 = i;
        this.A05 = i2;
    }

    public AsyncTaskC12718Un(ViewGroup viewGroup, C13029Zs c13029Zs) {
        this(viewGroup, 12, 16, c13029Zs);
    }

    public AsyncTaskC12718Un(ImageView imageView, C13029Zs c13029Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c13029Zs);
        this.A06 = null;
        this.A08 = new WeakReference<>(imageView);
        this.A09 = null;
        this.A04 = 0;
        this.A05 = 1;
    }

    public AsyncTaskC12718Un(C12303O5 c12303o5, C13029Zs c13029Zs) {
        this.A03 = false;
        this.A00 = -1;
        this.A01 = -1;
        this.A07 = new WeakReference<>(c13029Zs);
        this.A06 = new WeakReference<>(c12303o5);
        this.A08 = null;
        this.A09 = null;
        this.A04 = 12;
        this.A05 = 16;
    }

    private final void A02(Bitmap[] result) {
        C12303O5 c12303o5;
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            if (this.A08 != null) {
                ImageView imageView = this.A08.get();
                if (result[1] != null && !this.A03 && this.A04 != 0 && imageView != null) {
                    imageView.setImageBitmap(result[1]);
                    return;
                } else if (imageView != null) {
                    imageView.setImageBitmap(result[0]);
                }
            }
            if (this.A06 != null && (c12303o5 = this.A06.get()) != null) {
                c12303o5.setImage(result[0], result[1]);
            }
            if (this.A09 != null && this.A09.get() != null && result[1] != null) {
                AbstractC12177M3.A0S(this.A09.get(), new BitmapDrawable(this.A07.get().getResources(), result[1]));
            }
            if (this.A02 != null) {
                this.A02.AC8(result[0] != null);
            }
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }

    public final AsyncTaskC12718Un A04() {
        this.A00 = -1;
        this.A01 = -1;
        return this;
    }

    public final AsyncTaskC12718Un A05(int i, int i2) {
        this.A00 = i;
        this.A01 = i2;
        return this;
    }

    public final AsyncTaskC12718Un A06(InterfaceC12305O7 interfaceC12305O7) {
        this.A02 = interfaceC12305O7;
        return this;
    }

    public final void A07(String str) {
        if (TextUtils.isEmpty(str)) {
            if (this.A02 != null) {
                this.A02.AC8(false);
                return;
            }
            return;
        }
        executeOnExecutor(ExecutorC12182M8.A06, str);
    }

    @Override // com.facebook.ads.redexgen.p370X.InterfaceC113207e
    public final C13029Zs A6G() {
        return this.A07.get();
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ Bitmap[] doInBackground(String[] strArr) {
        if (AbstractC12078KQ.A02(this)) {
            return null;
        }
        try {
            return A03(strArr);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
            return null;
        }
    }

    @Override // android.os.AsyncTask
    public final /* bridge */ /* synthetic */ void onPostExecute(Bitmap[] bitmapArr) {
        if (AbstractC12078KQ.A02(this)) {
            return;
        }
        try {
            A02(bitmapArr);
        } catch (Throwable th) {
            AbstractC12078KQ.A00(th, this);
        }
    }
}
