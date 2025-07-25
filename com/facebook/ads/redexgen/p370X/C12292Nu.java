package com.facebook.ads.redexgen.p370X;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Nu */
/* loaded from: assets/audience_network.dex */
public class C12292Nu extends WebChromeClient {
    public static byte[] A03;
    public static String[] A04 = {"UcT", "7pCxO", "d1eUuJRsSQrbyeV", "NvcYkIOLS6u3Z", "4rhEUJepg5yzUmxbs6HYJp18fCLzs", "c8rjrCABAqtuVN2R", "gqC4klM2hvrTEGu", "cDVUBFjHiz5XJka2"};
    public final WeakReference<C13029Zs> A00;
    public final WeakReference<InterfaceC12290Ns> A01;
    public final WeakReference<C12286No> A02;

    public static String A00(int i, int i2, int i3) {
        byte[] copyOfRange = Arrays.copyOfRange(A03, i, i + i2);
        int i4 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A04;
            if (strArr[4].length() == strArr[3].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A04;
            strArr2[0] = "xQ2";
            strArr2[1] = "BwhB4";
            if (i4 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i4] = (byte) ((copyOfRange[i4] - i3) - 36);
            i4++;
        }
    }

    public static void A01() {
        A03 = new byte[]{81, 86, 81, -66, -31, -28, -35, -104, -69, -32, -25, -25, -21, -35, -22, -117, -104, -114, -100, -103, -109, -114, 88, -109, -104, -98, -113, -104, -98, 88, -117, -115, -98, -109, -103, -104, 88, 113, 111, 126, -119, 109, 121, 120, 126, 111, 120, 126, -32, -19, -29, -15, -18, -24, -29, -83, -24, -19, -13, -28, -19, -13, -83, -30, -32, -13, -28, -26, -18, -15, -8, -83, -50, -49, -60, -51, -64, -63, -53, -60, -68, -86, -89, -92, -69, -82, -86, -68};
    }

    static {
        A01();
    }

    public C12292Nu(WeakReference<C13029Zs> weakReference, WeakReference<InterfaceC12290Ns> weakReference2, WeakReference<C12286No> weakReference3) {
        this.A00 = weakReference;
        this.A01 = weakReference2;
        this.A02 = weakReference3;
    }

    private boolean A02(ValueCallback valueCallback) {
        boolean z;
        ValueCallback valueCallback2;
        ValueCallback valueCallback3;
        C13029Zs c13029Zs = this.A00.get();
        if (c13029Zs != null && c13029Zs.A0D() != null) {
            z = C12729Uy.A09;
            if (z) {
                valueCallback2 = C12729Uy.A08;
                if (valueCallback2 != null) {
                    valueCallback3 = C12729Uy.A08;
                    valueCallback3.onReceiveValue(null);
                    String[] strArr = A04;
                    if (strArr[4].length() == strArr[3].length()) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[4] = "8y9TMu8YjdwMhcx8OyIx8Raox9jk1";
                    strArr2[3] = "8D57YjnpkPWjk";
                    ValueCallback unused = C12729Uy.A08 = null;
                }
                ValueCallback unused2 = C12729Uy.A08 = valueCallback;
                try {
                    Intent intent = new Intent(A00(15, 33, 6));
                    intent.addCategory(A00(48, 32, 91));
                    intent.setType(A00(0, 3, 3));
                    c13029Zs.A0D().startActivityForResult(Intent.createChooser(intent, A00(3, 12, 84)), 1001);
                    return true;
                } catch (Exception e) {
                    c13029Zs.A07().AA1(A00(80, 8, 33), AbstractC113568E.A2d, new C113578F(e));
                    ValueCallback unused3 = C12729Uy.A08 = null;
                    return false;
                }
            }
        }
        return false;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        C12286No c12286No = this.A02.get();
        if (!TextUtils.isEmpty(message) && consoleMessage.messageLevel() == ConsoleMessage.MessageLevel.LOG && c12286No != null) {
            c12286No.A04(message);
            return true;
        }
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onProgressChanged(WebView webView, int i) {
        super.onProgressChanged(webView, i);
        C12286No timingLogger = this.A02.get();
        if (timingLogger != null) {
            timingLogger.A03();
        }
        InterfaceC12290Ns interfaceC12290Ns = this.A01.get();
        if (interfaceC12290Ns != null) {
            interfaceC12290Ns.ADG(i);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onReceivedTitle(WebView webView, String str) {
        super.onReceivedTitle(webView, str);
        InterfaceC12290Ns listener = this.A01.get();
        if (listener != null) {
            listener.ADJ(str);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
        return A02(filePathCallback);
    }
}
