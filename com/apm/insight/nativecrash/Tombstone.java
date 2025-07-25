package com.apm.insight.nativecrash;

import com.apm.insight.p130l.LogPath;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

/* renamed from: com.apm.insight.nativecrash.c */
/* loaded from: classes2.dex */
public final class Tombstone {

    /* renamed from: i */
    private static final Pattern f3974i = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");

    /* renamed from: j */
    private static final Pattern f3975j = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");

    /* renamed from: k */
    private static final Pattern f3976k = Pattern.compile("^Abort message: (.*)$");

    /* renamed from: l */
    private static final Pattern f3977l = Pattern.compile("^Crash message: (.*)$");

    /* renamed from: m */
    private static final Pattern f3978m = Pattern.compile("^    \\/(\\w*)\\/.*\\/(.*\\.so)\\s\\(BuildId: ([a-f0-9]*)\\)$");

    /* renamed from: a */
    private String f3979a;

    /* renamed from: b */
    private String f3980b;

    /* renamed from: c */
    private String f3981c;

    /* renamed from: d */
    private String f3982d;

    /* renamed from: e */
    private String f3983e;

    /* renamed from: f */
    private String f3984f;

    /* renamed from: g */
    private String f3985g;

    /* renamed from: h */
    private Map<String, String> f3986h = new HashMap();

    public Tombstone(File file) {
        m101522c(LogPath.m101672b(file));
    }

    /* renamed from: a */
    public final String m101527a() {
        return this.f3985g;
    }

    /* renamed from: b */
    public final Map<String, String> m101525b() {
        return this.f3986h;
    }

    /* renamed from: c */
    public final String m101523c() {
        StringBuilder sb2 = new StringBuilder();
        String str = this.f3983e;
        if (str != null) {
            sb2.append(str);
        }
        String str2 = this.f3984f;
        if (str2 != null) {
            sb2.append(str2);
        }
        String str3 = this.f3985g;
        if (str3 != null) {
            sb2.append(str3);
        }
        return sb2.toString();
    }

    /* renamed from: a */
    public final void m101526a(File file) {
        File m101672b = LogPath.m101672b(file);
        if (m101672b.exists()) {
            m101672b.renameTo(new File(m101672b.getAbsoluteFile() + ".old"));
        }
        NativeImpl.m101595a(file);
        m101522c(LogPath.m101672b(file));
    }

    /* renamed from: b */
    public final void m101524b(File file) {
        m101522c(LogPath.m101672b(file));
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0187, code lost:
        r12 = r3.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x018b, code lost:
        if (r12 == null) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0193, code lost:
        if (r12.contains("BuildId:") == false) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0195, code lost:
        r12 = com.apm.insight.nativecrash.Tombstone.f3978m.matcher(r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x019f, code lost:
        if (r12.find() == false) goto L100;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x01a1, code lost:
        r0 = r12.group(1);
        r1 = r12.group(2);
        r12 = r12.group(3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x01b3, code lost:
        if (r0.equals("data") == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x01b5, code lost:
        r11.f3986h.put(r1, r12);
     */
    /* renamed from: c */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m101522c(java.io.File r12) {
        /*
            Method dump skipped, instructions count: 472
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.apm.insight.nativecrash.Tombstone.m101522c(java.io.File):void");
    }
}
