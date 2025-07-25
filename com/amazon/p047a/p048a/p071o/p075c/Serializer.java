package com.amazon.p047a.p048a.p071o.p075c;

import com.amazon.p047a.p048a.p071o.FileUtils;
import com.amazon.p047a.p048a.p071o.KiwiLogger;
import com.amazon.p081c.p082a.p083a.Base64;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.io.Serializable;

/* renamed from: com.amazon.a.a.o.c.a */
/* loaded from: classes2.dex */
public class Serializer {

    /* renamed from: a */
    private static final KiwiLogger f2775a = new KiwiLogger("Serializer");

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0042: MOVE  (r0 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:22:0x0042 */
    /* renamed from: a */
    public static String m102822a(Serializable serializable) {
        ObjectOutputStream objectOutputStream;
        OutputStream outputStream;
        OutputStream outputStream2 = null;
        if (serializable == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
            } catch (IOException e) {
                e = e;
                objectOutputStream = null;
            } catch (Throwable th) {
                th = th;
                FileUtils.m102878a(outputStream2);
                throw th;
            }
            try {
                objectOutputStream.writeObject(serializable);
                String m102673a = Base64.m102673a(byteArrayOutputStream.toByteArray());
                FileUtils.m102878a(objectOutputStream);
                return m102673a;
            } catch (IOException e2) {
                e = e2;
                if (KiwiLogger.f2771b) {
                    f2775a.m102825b("Could not serialize object: " + serializable, e);
                }
                FileUtils.m102878a(objectOutputStream);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            outputStream2 = outputStream;
            FileUtils.m102878a(outputStream2);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0 */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.io.InputStream] */
    /* renamed from: a */
    public static <T> T m102821a(String str) {
        ObjectInputStream objectInputStream;
        T t;
        ?? r0 = (T) false;
        if (str != null && str.length() != 0) {
            try {
                try {
                    try {
                        objectInputStream = new ObjectInputStream(new ByteArrayInputStream(Base64.m102654c(str.getBytes())));
                    } catch (Exception e) {
                        e = e;
                        objectInputStream = null;
                    } catch (Throwable th) {
                        th = th;
                        FileUtils.m102879a((InputStream) r0);
                        throw th;
                    }
                    try {
                        t = (T) objectInputStream.readObject();
                    } catch (Exception e2) {
                        e = e2;
                        t = r0;
                        if (KiwiLogger.f2771b) {
                            f2775a.m102825b("Could not read object from string: " + str, e);
                            t = r0;
                        }
                        FileUtils.m102879a(objectInputStream);
                        return t;
                    }
                    FileUtils.m102879a(objectInputStream);
                    return t;
                } catch (IOException e3) {
                    if (KiwiLogger.f2771b) {
                        f2775a.m102825b("Could not decode string", e3);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                r0 = (T) objectInputStream;
            }
        }
        return null;
    }
}
