package com.google.common.net;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;

@Immutable
@GwtCompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class HostAndPort implements Serializable {

    /* renamed from: b */
    private final String f41384b;

    /* renamed from: c */
    private final int f41385c;

    /* renamed from: d */
    private final boolean f41386d;

    private HostAndPort(String str, int i, boolean z) {
        this.f41384b = str;
        this.f41385c = i;
        this.f41386d = z;
    }

    /* renamed from: a */
    private static String[] m68115a(String str) {
        boolean z;
        boolean z2;
        boolean z3;
        if (str.charAt(0) == '[') {
            z = true;
        } else {
            z = false;
        }
        Preconditions.checkArgument(z, "Bracketed host-port string must start with a bracket: %s", str);
        int indexOf = str.indexOf(58);
        int lastIndexOf = str.lastIndexOf(93);
        if (indexOf > -1 && lastIndexOf > indexOf) {
            z2 = true;
        } else {
            z2 = false;
        }
        Preconditions.checkArgument(z2, "Invalid bracketed host/port: %s", str);
        String substring = str.substring(1, lastIndexOf);
        int i = lastIndexOf + 1;
        if (i == str.length()) {
            return new String[]{substring, ""};
        }
        if (str.charAt(i) == ':') {
            z3 = true;
        } else {
            z3 = false;
        }
        Preconditions.checkArgument(z3, "Only a colon may follow a close bracket: %s", str);
        int i2 = lastIndexOf + 2;
        for (int i3 = i2; i3 < str.length(); i3++) {
            Preconditions.checkArgument(Character.isDigit(str.charAt(i3)), "Port must be numeric: %s", str);
        }
        return new String[]{substring, str.substring(i2)};
    }

    /* renamed from: b */
    private static boolean m68114b(int i) {
        if (i >= 0 && i <= 65535) {
            return true;
        }
        return false;
    }

    public static HostAndPort fromHost(String str) {
        HostAndPort fromString = fromString(str);
        Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", str);
        return fromString;
    }

    public static HostAndPort fromParts(String str, int i) {
        Preconditions.checkArgument(m68114b(i), "Port out of range: %s", i);
        HostAndPort fromString = fromString(str);
        Preconditions.checkArgument(!fromString.hasPort(), "Host has a port: %s", str);
        return new HostAndPort(fromString.f41384b, i, fromString.f41386d);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0042  */
    @com.google.errorprone.annotations.CanIgnoreReturnValue
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.net.HostAndPort fromString(java.lang.String r8) {
        /*
            com.google.common.base.Preconditions.checkNotNull(r8)
            java.lang.String r0 = "["
            boolean r0 = r8.startsWith(r0)
            r1 = -1
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L19
            java.lang.String[] r0 = m68115a(r8)
            r4 = r0[r3]
            r0 = r0[r2]
        L16:
            r5 = r4
            r4 = r3
            goto L3c
        L19:
            r0 = 58
            int r4 = r8.indexOf(r0)
            if (r4 < 0) goto L32
            int r5 = r4 + 1
            int r0 = r8.indexOf(r0, r5)
            if (r0 != r1) goto L32
            java.lang.String r4 = r8.substring(r3, r4)
            java.lang.String r0 = r8.substring(r5)
            goto L16
        L32:
            if (r4 < 0) goto L36
            r0 = r2
            goto L37
        L36:
            r0 = r3
        L37:
            r4 = 0
            r5 = r8
            r7 = r4
            r4 = r0
            r0 = r7
        L3c:
            boolean r6 = com.google.common.base.Strings.isNullOrEmpty(r0)
            if (r6 != 0) goto L81
            java.lang.String r1 = "+"
            boolean r1 = r0.startsWith(r1)
            if (r1 != 0) goto L55
            com.google.common.base.CharMatcher r1 = com.google.common.base.CharMatcher.ascii()
            boolean r1 = r1.matchesAllOf(r0)
            if (r1 == 0) goto L55
            goto L56
        L55:
            r2 = r3
        L56:
            java.lang.String r1 = "Unparseable port number: %s"
            com.google.common.base.Preconditions.checkArgument(r2, r1, r8)
            int r1 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.NumberFormatException -> L69
            boolean r0 = m68114b(r1)
            java.lang.String r2 = "Port number out of range: %s"
            com.google.common.base.Preconditions.checkArgument(r0, r2, r8)
            goto L81
        L69:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            int r1 = r8.length()
            java.lang.String r2 = "Unparseable port number: "
            if (r1 == 0) goto L78
            java.lang.String r8 = r2.concat(r8)
            goto L7d
        L78:
            java.lang.String r8 = new java.lang.String
            r8.<init>(r2)
        L7d:
            r0.<init>(r8)
            throw r0
        L81:
            com.google.common.net.HostAndPort r8 = new com.google.common.net.HostAndPort
            r8.<init>(r5, r1, r4)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.net.HostAndPort.fromString(java.lang.String):com.google.common.net.HostAndPort");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HostAndPort)) {
            return false;
        }
        HostAndPort hostAndPort = (HostAndPort) obj;
        if (Objects.equal(this.f41384b, hostAndPort.f41384b) && this.f41385c == hostAndPort.f41385c) {
            return true;
        }
        return false;
    }

    public String getHost() {
        return this.f41384b;
    }

    public int getPort() {
        Preconditions.checkState(hasPort());
        return this.f41385c;
    }

    public int getPortOrDefault(int i) {
        if (hasPort()) {
            return this.f41385c;
        }
        return i;
    }

    public boolean hasPort() {
        if (this.f41385c >= 0) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Objects.hashCode(this.f41384b, Integer.valueOf(this.f41385c));
    }

    @CanIgnoreReturnValue
    public HostAndPort requireBracketsForIPv6() {
        Preconditions.checkArgument(!this.f41386d, "Possible bracketless IPv6 literal: %s", this.f41384b);
        return this;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(this.f41384b.length() + 8);
        if (this.f41384b.indexOf(58) >= 0) {
            sb2.append('[');
            sb2.append(this.f41384b);
            sb2.append(']');
        } else {
            sb2.append(this.f41384b);
        }
        if (hasPort()) {
            sb2.append(':');
            sb2.append(this.f41385c);
        }
        return sb2.toString();
    }

    public HostAndPort withDefaultPort(int i) {
        Preconditions.checkArgument(m68114b(i));
        if (hasPort()) {
            return this;
        }
        return new HostAndPort(this.f41384b, i, this.f41386d);
    }
}
