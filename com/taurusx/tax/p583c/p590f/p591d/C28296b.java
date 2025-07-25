package com.taurusx.tax.p583c.p590f.p591d;

import com.google.common.primitives.SignedBytes;
import com.taurusx.tax.C28162a;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import p692h2.StringFogImpl;

/* renamed from: com.taurusx.tax.c.f.d.b */
/* loaded from: classes7.dex */
public class C28296b {
    /* renamed from: a */
    public static synchronized ArrayList<String> m38277a(String[] strArr) {
        ArrayList<String> arrayList;
        synchronized (C28296b.class) {
            arrayList = new ArrayList<>();
            try {
                Process exec = Runtime.getRuntime().exec(strArr);
                new BufferedWriter(new OutputStreamWriter(exec.getOutputStream()));
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(exec.getInputStream()));
                while (true) {
                    try {
                        String readLine = bufferedReader.readLine();
                        if (readLine == null) {
                            break;
                        }
                        arrayList.add(readLine);
                    } catch (Exception unused) {
                    }
                }
            } catch (Exception unused2) {
                return null;
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ca A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00cb  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean m38276b() {
        /*
            Method dump skipped, instructions count: 977
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.p583c.p590f.p591d.C28296b.m38276b():boolean");
    }

    /* renamed from: a */
    public static synchronized boolean m38278a() {
        Process process;
        DataOutputStream dataOutputStream;
        synchronized (C28296b.class) {
            DataOutputStream dataOutputStream2 = null;
            try {
                try {
                    StringFogImpl stringFogImpl = C28162a.f73047a;
                    process = Runtime.getRuntime().exec(stringFogImpl.m23824a(new byte[]{67, -122}, new byte[]{48, -13}));
                    try {
                        dataOutputStream = new DataOutputStream(process.getOutputStream());
                    } catch (Exception unused) {
                    } catch (Throwable th) {
                        th = th;
                    }
                    try {
                        dataOutputStream.writeBytes(stringFogImpl.m23824a(new byte[]{76, 107, SignedBytes.MAX_POWER_OF_TWO, 103, 35}, new byte[]{41, 19}));
                        dataOutputStream.flush();
                        if (process.waitFor() == 0) {
                            try {
                                dataOutputStream.close();
                                process.destroy();
                            } catch (Exception unused2) {
                            }
                            return true;
                        }
                        try {
                            dataOutputStream.close();
                            process.destroy();
                        } catch (Exception unused3) {
                        }
                        return false;
                    } catch (Exception unused4) {
                        dataOutputStream2 = dataOutputStream;
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (Exception unused5) {
                                return false;
                            }
                        }
                        if (process != null) {
                            process.destroy();
                        }
                        return false;
                    } catch (Throwable th2) {
                        th = th2;
                        dataOutputStream2 = dataOutputStream;
                        if (dataOutputStream2 != null) {
                            try {
                                dataOutputStream2.close();
                            } catch (Exception unused6) {
                                throw th;
                            }
                        }
                        if (process != null) {
                            process.destroy();
                        }
                        throw th;
                    }
                } catch (Exception unused7) {
                    process = null;
                } catch (Throwable th3) {
                    th = th3;
                    process = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
