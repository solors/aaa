package com.p552ot.pubsub.p555c;

import android.annotation.TargetApi;
import android.content.Context;
import android.security.KeyPairGeneratorSpec;
import android.util.Base64;
import com.google.common.primitives.SignedBytes;
import com.maticoo.sdk.utils.constant.KeyConstants;
import com.p552ot.pubsub.util.C26586j;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPairGenerator;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.cert.Certificate;
import java.security.spec.AlgorithmParameterSpec;
import java.util.GregorianCalendar;
import javax.crypto.Cipher;
import javax.security.auth.x500.X500Principal;

/* renamed from: com.ot.pubsub.c.b */
/* loaded from: classes7.dex */
public class C26522b {

    /* renamed from: a */
    public static final String f69398a = m41356b();

    /* renamed from: b */
    private static final String f69399b = "AndroidKeyStore";

    /* renamed from: c */
    private static final String f69400c = "AndroidKeyStore";

    /* renamed from: d */
    private static final String f69401d = "RSA/ECB/PKCS1Padding";

    /* renamed from: e */
    private static final String f69402e = "RSA_KEY";

    /* renamed from: a */
    public static synchronized String m41358a(Context context, String str) throws Exception {
        synchronized (C26522b.class) {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            m41357a(context, keyStore);
            Certificate certificate = keyStore.getCertificate(f69402e);
            if (certificate != null) {
                cipher.init(1, certificate.getPublicKey());
                return Base64.encodeToString(cipher.doFinal(str.getBytes("UTF-8")), 0);
            }
            return null;
        }
    }

    /* renamed from: b */
    public static synchronized String m41355b(Context context, String str) throws Exception {
        String str2;
        synchronized (C26522b.class) {
            Cipher cipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            m41357a(context, keyStore);
            cipher.init(2, (PrivateKey) keyStore.getKey(f69402e, null));
            str2 = new String(cipher.doFinal(Base64.decode(str, 0)), "UTF-8");
        }
        return str2;
    }

    /* renamed from: b */
    private static String m41356b() {
        try {
            return new String(new byte[]{104, 42, 89, 51, 49, 93, 99, 33, SignedBytes.MAX_POWER_OF_TWO, 53, 78, 115, 95, 106, 80, 115, 118, 101, 106, 33, SignedBytes.MAX_POWER_OF_TWO, 51, 91, 40, 42, 119, 40, 33, 108}, "UTF-8");
        } catch (Exception e) {
            C26586j.m41074b("AndroidKeyStore", e.getMessage());
            return "";
        }
    }

    /* renamed from: a */
    private static void m41357a(Context context, KeyStore keyStore) {
        try {
            if (keyStore.containsAlias(f69402e)) {
                return;
            }
            m41360a();
        } catch (Throwable th) {
            C26586j.m41073b("AndroidKeyStore", "createKey e", th);
        }
    }

    @TargetApi(18)
    /* renamed from: a */
    private static void m41359a(Context context) throws KeyStoreException, NoSuchProviderException, NoSuchAlgorithmException, InvalidAlgorithmParameterException {
        GregorianCalendar gregorianCalendar = new GregorianCalendar();
        GregorianCalendar gregorianCalendar2 = new GregorianCalendar();
        gregorianCalendar2.add(1, 1);
        KeyPairGeneratorSpec build = new KeyPairGeneratorSpec.Builder(context).setAlias(f69402e).setSubject(new X500Principal("CN=RSA_KEY")).setSerialNumber(BigInteger.valueOf(1337L)).setStartDate(gregorianCalendar.getTime()).setEndDate(gregorianCalendar2.getTime()).build();
        KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("RSA", "AndroidKeyStore");
        keyPairGenerator.initialize(build);
        keyPairGenerator.generateKeyPair();
    }

    /* renamed from: a */
    private static void m41360a() throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, InvalidAlgorithmParameterException, NoSuchProviderException, NoSuchAlgorithmException, LinkageError {
        Class<?> cls = Class.forName("android.security.keystore.KeyGenParameterSpec$Builder");
        Constructor<?> constructor = cls.getConstructor(String.class, Integer.TYPE);
        Class<?> cls2 = Class.forName("android.security.keystore.KeyProperties");
        Object newInstance = constructor.newInstance(f69402e, Integer.valueOf(cls2.getDeclaredField("PURPOSE_ENCRYPT").getInt(null) | cls2.getDeclaredField("PURPOSE_DECRYPT").getInt(null)));
        cls.getMethod("setDigests", String[].class).invoke(newInstance, new String[]{(String) cls2.getDeclaredField("DIGEST_SHA256").get(null), (String) cls2.getDeclaredField("DIGEST_SHA512").get(null)});
        cls.getMethod("setEncryptionPaddings", String[].class).invoke(newInstance, new String[]{(String) cls2.getDeclaredField("ENCRYPTION_PADDING_RSA_PKCS1").get(null)});
        Object invoke = cls.getMethod(KeyConstants.RequestBody.KEY_BUILD, new Class[0]).invoke(newInstance, new Object[0]);
        Class<?> cls3 = Class.forName("java.security.KeyPairGenerator");
        KeyPairGenerator keyPairGenerator = (KeyPairGenerator) cls3.getMethod("getInstance", String.class, String.class).invoke(null, "RSA", "AndroidKeyStore");
        cls3.getMethod("initialize", AlgorithmParameterSpec.class).invoke(keyPairGenerator, invoke);
        keyPairGenerator.generateKeyPair();
    }
}
