package com.appsflyer;

import android.content.Context;
import android.security.keystore.KeyGenParameterSpec;
import java.io.IOException;
import java.math.BigInteger;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import java.util.Calendar;
import java.util.Enumeration;
import javax.security.auth.x500.X500Principal;

/* loaded from: classes2.dex */
public class AFKeystoreWrapper {
    public KeyStore AFInAppEventParameterName;
    private Context AFKeystoreWrapper;
    public final Object values = new Object();
    public String valueOf = "";
    public int AFInAppEventType = 0;

    public AFKeystoreWrapper(Context context) {
        this.AFKeystoreWrapper = context;
        AFLogger.afInfoLog("Initialising KeyStore..");
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            this.AFInAppEventParameterName = keyStore;
            keyStore.load(null);
        } catch (IOException | KeyStoreException | NoSuchAlgorithmException | CertificateException e) {
            AFLogger.afErrorLog("Couldn't load keystore instance of type: AndroidKeyStore", e);
        }
    }

    private static boolean AFKeystoreWrapper(String str) {
        return str.startsWith("com.appsflyer");
    }

    public final boolean AFInAppEventParameterName() {
        boolean z;
        synchronized (this.values) {
            KeyStore keyStore = this.AFInAppEventParameterName;
            z = false;
            if (keyStore != null) {
                Enumeration<String> aliases = keyStore.aliases();
                while (true) {
                    if (!aliases.hasMoreElements()) {
                        break;
                    }
                    String nextElement = aliases.nextElement();
                    if (nextElement != null && AFKeystoreWrapper(nextElement)) {
                        String[] split = nextElement.split(",");
                        if (split.length == 3) {
                            AFLogger.afInfoLog("Found a matching AF key with alias:\n".concat(nextElement));
                            z = true;
                            String[] split2 = split[1].trim().split("=");
                            String[] split3 = split[2].trim().split("=");
                            if (split2.length == 2 && split3.length == 2) {
                                this.valueOf = split2[1].trim();
                                this.AFInAppEventType = Integer.parseInt(split3[1].trim());
                            }
                        }
                    }
                }
            }
        }
        return z;
    }

    public final String AFInAppEventType() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("com.appsflyer,");
        synchronized (this.values) {
            sb2.append("KSAppsFlyerId=");
            sb2.append(this.valueOf);
            sb2.append(",");
            sb2.append("KSAppsFlyerRICounter=");
            sb2.append(this.AFInAppEventType);
        }
        return sb2.toString();
    }

    public final void valueOf(String str) {
        AFLogger.afInfoLog("Creating a new key with alias: ".concat(String.valueOf(str)));
        try {
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            calendar2.add(1, 5);
            synchronized (this.values) {
                if (!this.AFInAppEventParameterName.containsAlias(str)) {
                    KeyGenParameterSpec build = new KeyGenParameterSpec.Builder(str, 3).setCertificateSubject(new X500Principal("CN=AndroidSDK, O=AppsFlyer")).setCertificateSerialNumber(BigInteger.ONE).setCertificateNotBefore(calendar.getTime()).setCertificateNotAfter(calendar2.getTime()).build();
                    KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
                    keyPairGenerator.initialize(build);
                    keyPairGenerator.generateKeyPair();
                } else {
                    AFLogger.afInfoLog("Alias already exists: ".concat(String.valueOf(str)));
                }
            }
        } catch (Throwable th) {
            StringBuilder sb2 = new StringBuilder("Exception ");
            sb2.append(th.getMessage());
            sb2.append(" occurred");
            AFLogger.afErrorLog(sb2.toString(), th);
        }
    }

    public final int values() {
        int i;
        synchronized (this.values) {
            i = this.AFInAppEventType;
        }
        return i;
    }

    public final String valueOf() {
        String str;
        synchronized (this.values) {
            str = this.valueOf;
        }
        return str;
    }
}
