package com.apm.insight.p130l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.apm.insight.nativecrash.NativeImpl;
import com.apm.insight.p130l.DigestPrintWriter;
import com.ironsource.C21114v8;
import com.mbridge.msdk.foundation.tools.SameMD5;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.apm.insight.l.m */
/* loaded from: classes2.dex */
public final class Stack {

    /* renamed from: a */
    private static final StackTraceElement f3941a = new StackTraceElement("", "", "", 0);

    /* compiled from: Stack.java */
    /* renamed from: com.apm.insight.l.m$a */
    /* loaded from: classes2.dex */
    public static class C3827a {

        /* renamed from: a */
        public int f3942a;

        /* renamed from: b */
        public int f3943b;

        public C3827a(int i, int i2) {
            this.f3942a = i;
            this.f3943b = i2;
        }

        /* renamed from: a */
        public final JSONObject m101615a() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("start", this.f3942a);
                jSONObject.put("end", this.f3943b);
            } catch (Throwable unused) {
            }
            return jSONObject;
        }
    }

    /* renamed from: a */
    public static String m101624a(StackTraceElement[] stackTraceElementArr) {
        StringBuilder sb2 = new StringBuilder();
        for (StackTraceElement stackTraceElement : stackTraceElementArr) {
            m101635a(stackTraceElement, sb2);
        }
        return sb2.toString();
    }

    /* renamed from: b */
    public static StackTraceElement[] m101620b(@NonNull Throwable th) {
        ArrayList arrayList = new ArrayList();
        try {
            m101626a(th, arrayList);
        } catch (Throwable unused) {
        }
        return (StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]);
    }

    /* renamed from: c */
    private static boolean m101618c(String str) {
        Set<String> m101700a = Filters.m101700a();
        if (m101700a.contains(str)) {
            return true;
        }
        for (String str2 : m101700a) {
            if (!TextUtils.isEmpty(str) && str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m101616d(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            try {
                if ((th instanceof OutOfMemoryError) && (th.getMessage().contains("allocate") || th.getMessage().contains("thrown"))) {
                    return true;
                }
                if (i > 20) {
                    return false;
                }
                i++;
                th = th.getCause();
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static StringBuilder m101635a(StackTraceElement stackTraceElement, StringBuilder sb2) {
        String className = stackTraceElement.getClassName();
        sb2.append("  at ");
        sb2.append(className);
        sb2.append(".");
        sb2.append(stackTraceElement.getMethodName());
        sb2.append("(");
        sb2.append(stackTraceElement.getFileName());
        sb2.append(":");
        sb2.append(stackTraceElement.getLineNumber());
        sb2.append(")\n");
        return sb2;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00d7 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x002a A[SYNTHETIC] */
    @androidx.annotation.Nullable
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static org.json.JSONObject m101621b(java.lang.String r16) {
        /*
            r0 = r16
            java.lang.String r1 = ")"
            java.lang.String r2 = "("
            r3 = 0
            java.util.Map r4 = java.lang.Thread.getAllStackTraces()     // Catch: java.lang.Throwable -> Le3
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le3
            r5.<init>()     // Catch: java.lang.Throwable -> Le3
            if (r4 != 0) goto L13
            return r3
        L13:
            java.lang.String r6 = "thread_all_count"
            int r7 = r4.size()     // Catch: java.lang.Throwable -> Le3
            r5.put(r6, r7)     // Catch: java.lang.Throwable -> Le3
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Le3
            r6.<init>()     // Catch: java.lang.Throwable -> Le3
            java.util.Set r4 = r4.entrySet()     // Catch: java.lang.Throwable -> Le3
            java.util.Iterator r4 = r4.iterator()     // Catch: java.lang.Throwable -> Le3
        L2a:
            boolean r7 = r4.hasNext()     // Catch: java.lang.Throwable -> Le3
            if (r7 == 0) goto Ldc
            java.lang.Object r7 = r4.next()     // Catch: java.lang.Throwable -> Le3
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch: java.lang.Throwable -> Le3
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Throwable -> Le3
            r8.<init>()     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r9 = r7.getKey()     // Catch: java.lang.Throwable -> Le3
            java.lang.Thread r9 = (java.lang.Thread) r9     // Catch: java.lang.Throwable -> Le3
            java.lang.String r10 = r9.getName()     // Catch: java.lang.Throwable -> Le3
            boolean r11 = m101618c(r10)     // Catch: java.lang.Throwable -> Le3
            if (r11 != 0) goto L2a
            if (r0 == 0) goto L5f
            boolean r11 = r0.equals(r10)     // Catch: java.lang.Throwable -> Le3
            if (r11 != 0) goto L2a
            boolean r11 = r10.startsWith(r0)     // Catch: java.lang.Throwable -> Le3
            if (r11 != 0) goto L2a
            boolean r10 = r10.endsWith(r0)     // Catch: java.lang.Throwable -> Le3
            if (r10 != 0) goto L2a
        L5f:
            java.lang.String r10 = "thread_name"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r11.<init>()     // Catch: java.lang.Throwable -> Le3
            java.lang.String r12 = r9.getName()     // Catch: java.lang.Throwable -> Le3
            r11.append(r12)     // Catch: java.lang.Throwable -> Le3
            r11.append(r2)     // Catch: java.lang.Throwable -> Le3
            long r12 = r9.getId()     // Catch: java.lang.Throwable -> Le3
            r11.append(r12)     // Catch: java.lang.Throwable -> Le3
            r11.append(r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r9 = r11.toString()     // Catch: java.lang.Throwable -> Le3
            r8.put(r10, r9)     // Catch: java.lang.Throwable -> Le3
            java.lang.Object r7 = r7.getValue()     // Catch: java.lang.Throwable -> Le3
            java.lang.StackTraceElement[] r7 = (java.lang.StackTraceElement[]) r7     // Catch: java.lang.Throwable -> Le3
            if (r7 == 0) goto Ld4
            org.json.JSONArray r10 = new org.json.JSONArray     // Catch: java.lang.Throwable -> Le3
            r10.<init>()     // Catch: java.lang.Throwable -> Le3
            int r11 = r7.length     // Catch: java.lang.Throwable -> Le3
            r12 = 0
            r13 = r12
        L92:
            if (r13 >= r11) goto Lc5
            r14 = r7[r13]     // Catch: java.lang.Throwable -> Le3
            java.lang.String r15 = r14.getClassName()     // Catch: java.lang.Throwable -> Le3
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le3
            r9.<init>()     // Catch: java.lang.Throwable -> Le3
            r9.append(r15)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r15 = "."
            r9.append(r15)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r15 = r14.getMethodName()     // Catch: java.lang.Throwable -> Le3
            r9.append(r15)     // Catch: java.lang.Throwable -> Le3
            r9.append(r2)     // Catch: java.lang.Throwable -> Le3
            int r14 = r14.getLineNumber()     // Catch: java.lang.Throwable -> Le3
            r9.append(r14)     // Catch: java.lang.Throwable -> Le3
            r9.append(r1)     // Catch: java.lang.Throwable -> Le3
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> Le3
            r10.put(r9)     // Catch: java.lang.Throwable -> Le3
            int r13 = r13 + 1
            goto L92
        Lc5:
            java.lang.String r7 = "thread_stack"
            r8.put(r7, r10)     // Catch: java.lang.Throwable -> Le3
            int r7 = r10.length()     // Catch: java.lang.Throwable -> Le3
            if (r7 <= 0) goto Ld2
            goto Ld4
        Ld2:
            r9 = r12
            goto Ld5
        Ld4:
            r9 = 1
        Ld5:
            if (r9 == 0) goto L2a
            r6.put(r8)     // Catch: java.lang.Throwable -> Le3
            goto L2a
        Ldc:
            java.lang.String r0 = "thread_stacks"
            r5.put(r0, r6)     // Catch: java.lang.Throwable -> Le3
            return r5
        Le3:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p130l.Stack.m101621b(java.lang.String):org.json.JSONObject");
    }

    /* renamed from: c */
    public static boolean m101617c(Throwable th) {
        if (th == null) {
            return false;
        }
        int i = 0;
        while (th != null) {
            if (th instanceof OutOfMemoryError) {
                return true;
            }
            if (i > 20) {
                return false;
            }
            i++;
            try {
                th = th.getCause();
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    @NonNull
    /* renamed from: a */
    public static String m101632a(@NonNull Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            m101628a(th, printWriter);
            String stringWriter2 = stringWriter.toString();
            printWriter.close();
            return stringWriter2;
        } catch (Throwable unused) {
            printWriter.close();
            return "";
        }
    }

    @NonNull
    /* renamed from: a */
    public static String m101629a(@NonNull Throwable th, PrintStream printStream, DigestPrintWriter.C3821a c3821a) {
        MessageDigest messageDigest;
        try {
            messageDigest = MessageDigest.getInstance(SameMD5.TAG);
        } catch (Throwable unused) {
            messageDigest = null;
        }
        DigestPrintWriter digestPrintWriter = new DigestPrintWriter(printStream, messageDigest, c3821a);
        try {
            m101628a(th, digestPrintWriter);
        } catch (Throwable unused2) {
        }
        digestPrintWriter.close();
        if (messageDigest != null) {
            byte[] digest = messageDigest.digest();
            if (digest == null || digest.length <= 0) {
                return "";
            }
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[digest.length << 1];
            int i = 0;
            for (byte b : digest) {
                int i2 = i + 1;
                cArr2[i] = cArr[(b >>> 4) & 15];
                i = i2 + 1;
                cArr2[i2] = cArr[b & 15];
            }
            return new String(cArr2);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m101634a(java.lang.String r8) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r8)
            r1 = 0
            if (r0 == 0) goto L8
            return r1
        L8:
            java.io.File r0 = new java.io.File
            r0.<init>(r8)
            boolean r8 = r0.exists()
            if (r8 != 0) goto L14
            return r1
        L14:
            java.util.LinkedList r8 = new java.util.LinkedList
            r8.<init>()
            java.util.LinkedList r2 = new java.util.LinkedList
            r2.<init>()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r4 = 10
            r5 = 0
            java.io.BufferedReader r6 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L5b
            java.io.FileReader r7 = new java.io.FileReader     // Catch: java.lang.Throwable -> L5b
            r7.<init>(r0)     // Catch: java.lang.Throwable -> L5b
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L5b
            r0 = r5
        L31:
            java.lang.String r1 = r6.readLine()     // Catch: java.lang.Throwable -> L5a
            if (r1 == 0) goto L56
            r7 = 256(0x100, float:3.59E-43)
            if (r0 > r7) goto L45
            r8.add(r1)     // Catch: java.lang.Throwable -> L5a
            r3.append(r1)     // Catch: java.lang.Throwable -> L5a
            r3.append(r4)     // Catch: java.lang.Throwable -> L5a
            goto L53
        L45:
            r2.add(r1)     // Catch: java.lang.Throwable -> L5a
            int r1 = r2.size()     // Catch: java.lang.Throwable -> L5a
            if (r1 <= r7) goto L53
            r2.poll()     // Catch: java.lang.Throwable -> L5a
            int r5 = r5 + 1
        L53:
            int r0 = r0 + 1
            goto L31
        L56:
            com.apm.insight.AppDataCenter.m102180a(r6)
            goto L5e
        L5a:
            r1 = r6
        L5b:
            com.apm.insight.AppDataCenter.m102180a(r1)
        L5e:
            boolean r8 = r2.isEmpty()
            if (r8 != 0) goto L8a
            if (r5 == 0) goto L73
            java.lang.String r8 = "\t... skip "
            r3.append(r8)
            r3.append(r5)
            java.lang.String r8 = " lines\n"
            r3.append(r8)
        L73:
            java.util.Iterator r8 = r2.iterator()
        L77:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r0 = r8.next()
            java.lang.String r0 = (java.lang.String) r0
            r3.append(r0)
            r3.append(r4)
            goto L77
        L8a:
            java.lang.String r8 = r3.toString()
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.p130l.Stack.m101634a(java.lang.String):java.lang.String");
    }

    /* renamed from: b */
    private static void m101619b(Throwable th, int i) {
        th.getClass();
        String localizedMessage = th.getLocalizedMessage();
        try {
            NativeImpl.m101598a(i, th.getClass().getName());
            if (localizedMessage != null) {
                NativeImpl.m101598a(i, ": ");
                NativeImpl.m101598a(i, localizedMessage);
            }
            NativeImpl.m101598a(i, "\n");
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    private static void m101626a(Throwable th, List<StackTraceElement> list) {
        if (th == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        list.add(f3941a);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (z && i2 > 256) {
                list.add(f3941a);
                break;
            }
            list.add(stackTraceElement);
            i2++;
            i++;
        }
        if (z) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                list.add(stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            m101625a(th2, list, "\t", newSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m101625a(cause, list, "", newSetFromMap, 128);
        }
    }

    /* renamed from: a */
    private static void m101625a(Throwable th, List<StackTraceElement> list, String str, Set<Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            int i2 = 0;
            boolean z = stackTrace.length > i;
            list.add(f3941a);
            int length = stackTrace.length;
            int i3 = 0;
            int i4 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i3];
                if (z && i4 > i) {
                    list.add(f3941a);
                    break;
                }
                list.add(stackTraceElement);
                i4++;
                i3++;
            }
            if (z) {
                for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                    list.add(stackTrace[length2]);
                }
            }
            Throwable[] suppressed = th.getSuppressed();
            int length3 = suppressed.length;
            while (true) {
                int i5 = 10;
                if (i2 >= length3) {
                    break;
                }
                Throwable th2 = suppressed[i2];
                String str2 = str + "\t";
                int i6 = i / 2;
                if (i6 > 10) {
                    i5 = i6;
                }
                m101625a(th2, list, str2, set, i5);
                i2++;
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
        }
        list.add(f3941a);
    }

    /* renamed from: a */
    private static void m101628a(Throwable th, PrintWriter printWriter) {
        if (th == null) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap());
        newSetFromMap.add(th);
        printWriter.println(th);
        StackTraceElement[] stackTrace = th.getStackTrace();
        boolean z = stackTrace.length > 384;
        int length = stackTrace.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            StackTraceElement stackTraceElement = stackTrace[i];
            if (z && i2 > 256) {
                StringBuilder sb2 = new StringBuilder("\t... skip ");
                sb2.append((stackTrace.length - i2) - 128);
                sb2.append(" lines");
                printWriter.println(sb2.toString());
                break;
            }
            printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
            i2++;
            i++;
        }
        if (z) {
            for (int length2 = stackTrace.length - 128; length2 < stackTrace.length; length2++) {
                printWriter.println("\tat " + stackTrace[length2]);
            }
        }
        for (Throwable th2 : th.getSuppressed()) {
            m101627a(th2, printWriter, "Suppressed: ", "\t", newSetFromMap, 128);
        }
        Throwable cause = th.getCause();
        if (cause != null) {
            m101627a(cause, printWriter, "Caused by: ", "", newSetFromMap, 128);
        }
    }

    /* renamed from: a */
    private static void m101630a(Throwable th, int i, String str, String str2) {
        while (true) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            try {
                NativeImpl.m101598a(i, str2);
                NativeImpl.m101598a(i, str);
            } catch (Throwable unused) {
            }
            m101619b(th, i);
            for (StackTraceElement stackTraceElement : stackTrace) {
                m101636a(stackTraceElement, i);
            }
            for (Throwable th2 : th.getSuppressed()) {
                m101630a(th2, i, "Suppressed: ", str2 + "\t");
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            str = "Caused by: ";
        }
    }

    /* renamed from: a */
    private static void m101627a(Throwable th, PrintWriter printWriter, String str, String str2, Set<Throwable> set, int i) {
        while (!set.contains(th)) {
            set.add(th);
            StackTraceElement[] stackTrace = th.getStackTrace();
            boolean z = stackTrace.length > i;
            printWriter.println(str2 + str + th);
            int length = stackTrace.length;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                StackTraceElement stackTraceElement = stackTrace[i2];
                if (z && i3 > i) {
                    printWriter.println("\t... skip " + ((stackTrace.length - i3) - (i / 2)) + " lines");
                    break;
                }
                printWriter.println("\tat ".concat(String.valueOf(stackTraceElement)));
                i3++;
                i2++;
            }
            if (z) {
                for (int length2 = stackTrace.length - (i / 2); length2 < stackTrace.length; length2++) {
                    printWriter.println("\tat " + stackTrace[length2]);
                }
            }
            for (Throwable th2 : th.getSuppressed()) {
                int i4 = i / 2;
                m101627a(th2, printWriter, "Suppressed: ", str2 + "\t", set, i4 > 10 ? i4 : 10);
            }
            th = th.getCause();
            if (th == null) {
                return;
            }
            i /= 2;
            if (i <= 10) {
                i = 10;
            }
            str = "Caused by: ";
        }
        printWriter.println("\t[CIRCULAR REFERENCE:" + th + C21114v8.C21123i.f54139e);
    }

    /* renamed from: a */
    private static boolean m101633a(String str, String[] strArr) {
        if (strArr != null && !TextUtils.isEmpty(str)) {
            for (String str2 : strArr) {
                if (str.contains(str2)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static JSONArray m101623a(StackTraceElement[] stackTraceElementArr, String[] strArr) {
        C3827a c3827a = new C3827a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < stackTraceElementArr.length; i++) {
            if (c3827a.f3942a == -1) {
                if (m101633a(stackTraceElementArr[i].getClassName(), strArr)) {
                    c3827a.f3942a = i;
                    c3827a.f3943b = i;
                }
            } else if (!m101633a(stackTraceElementArr[i].getClassName(), strArr)) {
                c3827a.f3943b = i;
                jSONArray.put(c3827a.m101615a());
                c3827a = new C3827a(-1, -1);
            }
        }
        if (c3827a.f3942a != -1) {
            c3827a.f3943b = stackTraceElementArr.length;
            jSONArray.put(c3827a.m101615a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONArray m101622a(String[] strArr, String[] strArr2) {
        C3827a c3827a = new C3827a(-1, -1);
        JSONArray jSONArray = new JSONArray();
        for (int i = 0; i < strArr.length; i++) {
            if (c3827a.f3942a == -1) {
                if (m101633a(strArr[i], strArr2)) {
                    c3827a.f3942a = i;
                    c3827a.f3943b = i;
                }
            } else if (!m101633a(strArr[i], strArr2)) {
                c3827a.f3943b = i;
                jSONArray.put(c3827a.m101615a());
                c3827a = new C3827a(-1, -1);
            }
        }
        if (c3827a.f3942a != -1) {
            c3827a.f3943b = strArr.length;
            jSONArray.put(c3827a.m101615a());
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static void m101631a(@NonNull Throwable th, int i) {
        if (th != null && i > 0) {
            try {
                m101619b(th, i);
                for (StackTraceElement stackTraceElement : th.getStackTrace()) {
                    m101636a(stackTraceElement, i);
                }
                for (Throwable th2 : th.getSuppressed()) {
                    m101630a(th2, i, "Suppressed: ", "\t");
                }
                Throwable cause = th.getCause();
                if (cause == null) {
                    return;
                }
                m101630a(cause, i, "Caused by: ", "");
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    private static void m101636a(StackTraceElement stackTraceElement, int i) {
        try {
            NativeImpl.m101598a(i, "\tat ");
            NativeImpl.m101598a(i, stackTraceElement.getClassName());
            NativeImpl.m101598a(i, ".");
            NativeImpl.m101598a(i, stackTraceElement.getMethodName());
            if (stackTraceElement.isNativeMethod()) {
                NativeImpl.m101598a(i, "(Native Method)");
            } else if (stackTraceElement.getFileName() != null) {
                if (stackTraceElement.getLineNumber() >= 0) {
                    NativeImpl.m101598a(i, "(");
                    NativeImpl.m101598a(i, stackTraceElement.getFileName());
                    NativeImpl.m101598a(i, ":");
                    NativeImpl.m101598a(i, String.valueOf(stackTraceElement.getLineNumber()));
                    NativeImpl.m101598a(i, ")");
                } else {
                    NativeImpl.m101598a(i, "(");
                    NativeImpl.m101598a(i, stackTraceElement.getFileName());
                    NativeImpl.m101598a(i, ")");
                }
            } else if (stackTraceElement.getLineNumber() >= 0) {
                NativeImpl.m101598a(i, "(Unknown Source:");
                NativeImpl.m101598a(i, String.valueOf(stackTraceElement.getLineNumber()));
                NativeImpl.m101598a(i, ")");
            } else {
                NativeImpl.m101598a(i, "(Unknown Source)");
            }
            NativeImpl.m101598a(i, "\n");
        } catch (Throwable unused) {
        }
    }
}
