package com.mbridge.msdk.foundation.tools;

import com.google.android.exoplayer2.C15633C;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* renamed from: com.mbridge.msdk.foundation.tools.al */
/* loaded from: classes6.dex */
public final class SerializeTools {
    /* renamed from: a */
    public static String m51701a(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            objectOutputStream.writeObject(obj);
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            objectOutputStream.flush();
            objectOutputStream.close();
            return new String(byteArray, C15633C.ISO88591_NAME);
        } catch (IOException e) {
            SameLogTool.m51823b("SerializeTools", "IOException", e);
            return "";
        }
    }

    /* renamed from: a */
    public static Object m51700a(String str) {
        try {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(str.getBytes(C15633C.ISO88591_NAME));
            ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
            Object readObject = objectInputStream.readObject();
            objectInputStream.close();
            byteArrayInputStream.close();
            return readObject;
        } catch (Exception e) {
            SameLogTool.m51823b("SerializeTools", "Exception", e);
            return null;
        }
    }
}
