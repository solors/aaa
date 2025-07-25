package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import java.net.Inet4Address;
import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.UnknownHostException;

/* renamed from: com.smaato.sdk.core.dns.i */
/* loaded from: classes7.dex */
final class InetAddressUtil {
    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: a */
    public static Inet4Address m39600a(@NonNull CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet4Address) {
                return (Inet4Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @NonNull
    /* renamed from: b */
    public static Inet6Address m39599b(@NonNull CharSequence charSequence) {
        try {
            InetAddress byName = InetAddress.getByName(charSequence.toString());
            if (byName instanceof Inet6Address) {
                return (Inet6Address) byName;
            }
            throw new IllegalArgumentException();
        } catch (UnknownHostException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
