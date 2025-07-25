package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.appsflyer.AFLogger;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes2.dex */
public final class AFb1qSDK {
    String AFInAppEventParameterName;
    public String AFInAppEventType;
    public String AFKeystoreWrapper;
    private byte[] valueOf;
    @Nullable
    public AFf1ySDK values;

    public AFb1qSDK(String str, byte[] bArr, String str2, AFf1ySDK aFf1ySDK) {
        this.AFKeystoreWrapper = str;
        this.valueOf = bArr;
        this.AFInAppEventParameterName = str2;
        this.values = aFf1ySDK;
    }

    public final byte[] AFInAppEventParameterName() {
        return this.valueOf;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && AFb1qSDK.class == obj.getClass()) {
            AFb1qSDK aFb1qSDK = (AFb1qSDK) obj;
            String str = this.AFInAppEventParameterName;
            if (str == null ? aFb1qSDK.AFInAppEventParameterName != null : !str.equals(aFb1qSDK.AFInAppEventParameterName)) {
                return false;
            }
            if (!Arrays.equals(this.valueOf, aFb1qSDK.valueOf)) {
                return false;
            }
            String str2 = this.AFKeystoreWrapper;
            if (str2 == null ? aFb1qSDK.AFKeystoreWrapper != null : !str2.equals(aFb1qSDK.AFKeystoreWrapper)) {
                return false;
            }
            String str3 = this.AFInAppEventType;
            if (str3 == null ? aFb1qSDK.AFInAppEventType != null : !str3.equals(aFb1qSDK.AFInAppEventType)) {
                return false;
            }
            if (this.values == aFb1qSDK.values) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.AFInAppEventParameterName;
        int i4 = 0;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        int hashCode = ((i * 31) + Arrays.hashCode(this.valueOf)) * 31;
        String str2 = this.AFKeystoreWrapper;
        if (str2 != null) {
            i2 = str2.hashCode();
        } else {
            i2 = 0;
        }
        int i5 = (hashCode + i2) * 31;
        String str3 = this.AFInAppEventType;
        if (str3 != null) {
            i3 = str3.hashCode();
        } else {
            i3 = 0;
        }
        int i6 = (i5 + i3) * 31;
        AFf1ySDK aFf1ySDK = this.values;
        if (aFf1ySDK != null) {
            i4 = aFf1ySDK.hashCode();
        }
        return i6 + i4;
    }

    public AFb1qSDK(char[] cArr) {
        Scanner scanner = new Scanner(new String(cArr));
        int i = 0;
        int i2 = 0;
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            if (nextLine.startsWith("url=")) {
                this.AFKeystoreWrapper = nextLine.substring(4).trim();
            } else if (nextLine.startsWith("version=")) {
                this.AFInAppEventParameterName = nextLine.substring(8).trim();
                Matcher matcher = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$").matcher(this.AFInAppEventParameterName);
                if (matcher.matches()) {
                    i = Integer.parseInt(matcher.group(1));
                    i2 = Integer.parseInt(matcher.group(2));
                }
            } else if (nextLine.startsWith("data=")) {
                String trim = nextLine.substring(5).trim();
                this.valueOf = (i > 4 || i2 >= 11) ? Base64.decode(trim, 2) : trim.getBytes(Charset.defaultCharset());
            } else if (nextLine.startsWith("type=")) {
                String trim2 = nextLine.substring(5).trim();
                try {
                    this.values = AFf1ySDK.valueOf(trim2);
                } catch (Exception e) {
                    AFLogger.afErrorLog("CACHE: Unknown task type: ".concat(String.valueOf(trim2)), e);
                }
            }
        }
        scanner.close();
    }
}
