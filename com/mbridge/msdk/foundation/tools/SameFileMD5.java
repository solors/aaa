package com.mbridge.msdk.foundation.tools;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.mbridge.msdk.foundation.tools.ac */
/* loaded from: classes6.dex */
public class SameFileMD5 {

    /* renamed from: b */
    protected static MessageDigest f56888b;

    /* renamed from: a */
    protected static char[] f56887a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: c */
    private static String f56889c = "SameFileMD5";

    static {
        f56888b = null;
        try {
            f56888b = MessageDigest.getInstance(SameMD5.TAG);
        } catch (NoSuchAlgorithmException e) {
            System.err.println(SameFileMD5.class.getName() + "初始化失败，MessageDigest不支持MD5Util.");
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public static String m51849a(File file) throws IOException {
        MessageDigest messageDigest;
        RandomAccessFile randomAccessFile;
        if (file == null || !file.exists()) {
            return "";
        }
        RandomAccessFile randomAccessFile2 = null;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            randomAccessFile = new RandomAccessFile(file, "r");
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[10485760];
            while (true) {
                int read = randomAccessFile.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            String m51848a = m51848a(digest, 0, digest.length);
            try {
                randomAccessFile.close();
            } catch (IOException e) {
                SameLogTool.m51824b(f56889c, e.getMessage());
            }
            return m51848a;
        } catch (Throwable th2) {
            th = th2;
            randomAccessFile2 = randomAccessFile;
            try {
                SameLogTool.m51824b(f56889c, th.getMessage());
                return "";
            } finally {
                if (randomAccessFile2 != null) {
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e2) {
                        SameLogTool.m51824b(f56889c, e2.getMessage());
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static String m51848a(byte[] bArr, int i, int i2) {
        StringBuffer stringBuffer = new StringBuffer(i2 * 2);
        int i3 = i2 + i;
        while (i < i3) {
            byte b = bArr[i];
            char[] cArr = f56887a;
            char c = cArr[(b & 240) >> 4];
            char c2 = cArr[b & 15];
            stringBuffer.append(c);
            stringBuffer.append(c2);
            i++;
        }
        return stringBuffer.toString();
    }
}
