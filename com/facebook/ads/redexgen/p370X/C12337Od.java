package com.facebook.ads.redexgen.p370X;

import android.view.View;
import android.webkit.JavascriptInterface;
import com.google.common.primitives.SignedBytes;
import java.util.Arrays;
import javax.annotation.Nullable;

/* renamed from: com.facebook.ads.redexgen.X.Od */
/* loaded from: assets/audience_network.dex */
public final class C12337Od {
    public static byte[] A03;
    public static String[] A04 = {"YhJyuYe5vArJMmHzMuaOmLSCLmdqTU9j", "tLzAZeBWVy5iXgZDrdogWSn3", "hJ3d0o6ZZetAls9RrrDnUnn76Lt6Ph0J", "xiAWoJKpfkjoLWhrM4jOgBmrkR74JwPz", "VoY4iRsyTVm9uFdDYrz8WEjEYD2Z3Vra", "M1ZhteGLEXQSShFsqI7vtOn7V", "Vb7qcjlVsUqRs6UGFJep9", "iIqC1fqKcVklIXQ956w4m"};
    public final View.OnClickListener A00;
    public final View A01;
    @Nullable
    public final InterfaceC12336Oc A02;

    public static String A02(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        for (int i4 = 0; i4 < copyOfRange.length; i4++) {
            copyOfRange[i4] = (byte) ((copyOfRange[i4] ^ i3) ^ 28);
        }
        return new String(copyOfRange);
    }

    public static void A03() {
        A03 = new byte[]{69, 115, 102, 113, 122, 83, 124, 118, 91, 124, 97, 102, 115, 126, 126, 101, 110, 121, 110, 124, 108, 125, 102, Byte.MAX_VALUE, 123, 53, 121, 110, 125, 47, 108, 99, 102, 108, 100, 70, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 106, 107, 47, 50, 47, 105, 110, 99, 124, 106, 52, 105, 122, 97, 108, 123, 102, 96, 97, 47, 102, 97, 123, 76, 99, 100, 39, 110, 97, 108, 103, 96, 125, 124, 38, 47, 116, 105, 96, 125, 39, 121, 110, 125, 47, 102, 47, 50, 47, 63, 52, 47, 102, 47, 51, 47, 110, 97, 108, 103, 96, 125, 124, 33, 99, 106, 97, 104, 123, 103, 52, 47, 102, 36, 36, 38, 47, 116, 121, 110, 125, 47, 110, 97, 108, 103, 96, 125, 47, 50, 47, 110, 97, 108, 103, 96, 125, 124, 84, 102, 82, 52, 110, 97, 108, 103, 96, 125, 33, 125, 106, 98, 96, 121, 106, 78, 123, 123, 125, 102, 109, 122, 123, 106, 39, 40, 101, 124, 110, 108, 123, 102, 96, 97, 40, 38, 52, 47, 47, 47, 47, 47, 47, 110, 97, 108, 103, 96, 125, 33, 96, 97, 108, 99, 102, 108, 100, 47, 50, 47, 105, 122, 97, 108, 123, 102, 96, 97, 39, 38, 47, 116, 88, 110, 123, 108, 103, 78, 97, 107, 70, 97, 124, 123, 110, 99, 99, 33, 96, 97, 76, 99, 102, 108, 100, 39, 38, 52, 114, 52, 108, 99, 102, 108, 100, 70, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 106, 107, 47, 50, 47, 123, 125, 122, 106, 52, 47, 114, 47, 114, 47, 121, 110, 125, 47, 102, 97, 123, 76, 123, 110, 70, 107, 124, 47, 50, 47, 84, 40, 70, 105, 74, 108, 122, 106, 40, 35, 47, 40, 89, 105, 95, Byte.MAX_VALUE, 100, 107, 34, 67, 104, 109, 124, 92, 106, 47, 89, 105, 95, Byte.MAX_VALUE, 100, 107, 34, 67, 104, 109, 124, 92, 106, 34, SignedBytes.MAX_POWER_OF_TWO, 88, 87, 74, 87, 106, 34, 100, 55, 94, Byte.MAX_VALUE, 69, 40, 82, 52, 105, 96, 125, 39, 121, 110, 125, 47, 102, 47, 50, 47, 63, 52, 47, 102, 47, 51, 47, 102, 97, 123, 76, 123, 110, 70, 107, 124, 33, 99, 106, 97, 104, 123, 103, 52, 47, 102, 36, 36, 38, 47, 116, 47, 102, 97, 123, 76, 99, 100, 39, 107, 96, 108, 122, 98, 106, 97, 123, 33, 104, 106, 123, 74, 99, 106, 98, 106, 97, 123, 124, 77, 118, 76, 99, 110, 124, 124, 65, 110, 98, 106, 39, 102, 97, 123, 76, 123, 110, 70, 107, 124, 84, 102, 82, 38, 38, 52, 114, 47, 102, 105, 47, 39, 46, 108, 99, 102, 108, 100, 70, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 106, 107, 47, 41, 41, 47, 123, 118, Byte.MAX_VALUE, 106, 96, 105, 47, 88, 110, 123, 108, 103, 78, 97, 107, 70, 97, 124, 123, 110, 99, 99, 33, 96, 97, 76, 99, 102, 108, 100, 70, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 73, 110, 102, 99, 106, 107, 47, 46, 50, 50, 47, 45, 122, 97, 107, 106, 105, 102, 97, 106, 107, 45, 38, 47, 116, 88, 110, 123, 108, 103, 78, 97, 107, 70, 97, 124, 123, 110, 99, 99, 33, 96, 97, 76, 99, 102, 108, 100, 70, 97, 123, 106, 125, 108, 106, Byte.MAX_VALUE, 123, 73, 110, 102, 99, 106, 107, 39, 38, 52, 114};
    }

    static {
        A03();
    }

    public C12337Od(View.OnClickListener onClickListener, View view, @Nullable InterfaceC12336Oc interfaceC12336Oc) {
        this.A00 = onClickListener;
        this.A01 = view;
        this.A02 = interfaceC12336Oc;
    }

    public static String A00() {
        String[] strArr = A04;
        if (strArr[0].charAt(19) != strArr[2].charAt(19)) {
            A04[4] = "xS32wGzeebxJmdkB8qXqbLj70rQzUTrd";
            return A02(15, 560, 19);
        }
        throw new RuntimeException();
    }

    public static String A01() {
        return A02(0, 15, 14);
    }

    @JavascriptInterface
    public void onClick() {
        this.A00.onClick(this.A01);
    }

    @JavascriptInterface
    public void onClickInterceptFailed() {
        if (this.A02 != null) {
            this.A02.ABW();
        }
    }
}
