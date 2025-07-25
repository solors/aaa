package com.amazon.p081c.p082a.p083a;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* renamed from: com.amazon.c.a.a.d */
/* loaded from: classes2.dex */
public class KiwiVersionEncrypter {

    /* renamed from: a */
    private static final String f2945a = "Kiwi__Version__Obfuscator";

    private KiwiVersionEncrypter() {
    }

    /* renamed from: a */
    public static String m102649a(String str) {
        m102644b(str, "text");
        return Base64.m102673a(m102647a(str.getBytes()));
    }

    /* renamed from: b */
    public static String m102645b(String str) throws IOException {
        m102644b(str, "text");
        return new String(m102647a(Base64.m102654c(str.getBytes())), "UTF-8");
    }

    /* renamed from: c */
    public static String m102643c(String str) throws IOException {
        BufferedReader bufferedReader;
        m102644b(str, "file");
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(str));
        } catch (Throwable th) {
            th = th;
        }
        try {
            String readLine = bufferedReader.readLine();
            try {
                bufferedReader.close();
            } catch (IOException unused) {
            }
            return new String(m102647a(Base64.m102654c(readLine.getBytes())), "UTF-8");
        } catch (Throwable th2) {
            th = th2;
            bufferedReader2 = bufferedReader;
            if (bufferedReader2 != null) {
                try {
                    bufferedReader2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: a */
    public static void m102648a(String str, String str2) throws IOException {
        BufferedWriter bufferedWriter;
        m102644b(str, "text");
        m102644b(str2, "file");
        String m102673a = Base64.m102673a(m102647a(str.getBytes()));
        BufferedWriter bufferedWriter2 = null;
        try {
            bufferedWriter = new BufferedWriter(new FileWriter(str2));
        } catch (Throwable th) {
            th = th;
        }
        try {
            bufferedWriter.write(m102673a);
            bufferedWriter.flush();
            try {
                bufferedWriter.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th2) {
            th = th2;
            bufferedWriter2 = bufferedWriter;
            if (bufferedWriter2 != null) {
                try {
                    bufferedWriter2.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    /* renamed from: b */
    private static void m102644b(String str, String str2) {
        if (str == null || str.isEmpty()) {
            throw new IllegalArgumentException("input '" + str2 + "' cannot be null or empty");
        }
    }

    /* renamed from: a */
    private static byte[] m102647a(byte[] bArr) {
        byte[] bArr2 = new byte[bArr.length];
        byte[] bytes = f2945a.getBytes();
        int i = 0;
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr2[i2] = (byte) (bArr[i2] ^ bytes[i]);
            i++;
            if (i >= bytes.length) {
                i = 0;
            }
        }
        return bArr2;
    }

    /* renamed from: a */
    public static void m102646a(String[] strArr) throws Exception {
        if (strArr != null && strArr.length != 0) {
            if (strArr.length > 1) {
                m102648a(strArr[0], strArr[1]);
                return;
            } else {
                System.out.println(m102649a(strArr[0]));
                return;
            }
        }
        System.out.println("Usage: com.amazon.mas.kiwi.util.KiwiVersionEncrypter <textToBeEncrypted> [<encryptToFileName>]");
    }
}
