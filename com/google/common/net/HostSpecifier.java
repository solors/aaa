package com.google.common.net;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.net.InetAddress;
import java.text.ParseException;

@GwtIncompatible
@ElementTypesAreNonnullByDefault
/* loaded from: classes4.dex */
public final class HostSpecifier {

    /* renamed from: a */
    private final String f41387a;

    private HostSpecifier(String str) {
        this.f41387a = str;
    }

    @CanIgnoreReturnValue
    public static HostSpecifier from(String str) throws ParseException {
        String str2;
        try {
            return fromValid(str);
        } catch (IllegalArgumentException e) {
            String valueOf = String.valueOf(str);
            if (valueOf.length() != 0) {
                str2 = "Invalid host specifier: ".concat(valueOf);
            } else {
                str2 = new String("Invalid host specifier: ");
            }
            ParseException parseException = new ParseException(str2, 0);
            parseException.initCause(e);
            throw parseException;
        }
    }

    public static HostSpecifier fromValid(String str) {
        InetAddress inetAddress;
        String str2;
        HostAndPort fromString = HostAndPort.fromString(str);
        Preconditions.checkArgument(!fromString.hasPort());
        String host = fromString.getHost();
        try {
            inetAddress = InetAddresses.forString(host);
        } catch (IllegalArgumentException unused) {
            inetAddress = null;
        }
        if (inetAddress != null) {
            return new HostSpecifier(InetAddresses.toUriString(inetAddress));
        }
        InternetDomainName from = InternetDomainName.from(host);
        if (from.hasPublicSuffix()) {
            return new HostSpecifier(from.toString());
        }
        String valueOf = String.valueOf(host);
        if (valueOf.length() != 0) {
            str2 = "Domain name does not have a recognized public suffix: ".concat(valueOf);
        } else {
            str2 = new String("Domain name does not have a recognized public suffix: ");
        }
        throw new IllegalArgumentException(str2);
    }

    public static boolean isValid(String str) {
        try {
            fromValid(str);
            return true;
        } catch (IllegalArgumentException unused) {
            return false;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof HostSpecifier) {
            return this.f41387a.equals(((HostSpecifier) obj).f41387a);
        }
        return false;
    }

    public int hashCode() {
        return this.f41387a.hashCode();
    }

    public String toString() {
        return this.f41387a;
    }
}
