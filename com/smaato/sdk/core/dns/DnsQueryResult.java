package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.DnsMessage;
import com.smaato.sdk.core.util.Objects;
import java.net.InetAddress;

/* loaded from: classes7.dex */
final class DnsQueryResult {
    @NonNull

    /* renamed from: a */
    public final InetAddress f71498a;
    @NonNull

    /* renamed from: b */
    public final QueryMethod f71499b;
    @NonNull

    /* renamed from: c */
    public final DnsMessage f71500c;
    @NonNull

    /* renamed from: d */
    public final DnsMessage f71501d;

    /* renamed from: e */
    public final int f71502e;

    /* loaded from: classes7.dex */
    public enum QueryMethod {
        UDP,
        TCP
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public DnsQueryResult(@NonNull InetAddress inetAddress, @NonNull QueryMethod queryMethod, @NonNull DnsMessage dnsMessage, @NonNull DnsMessage dnsMessage2, int i) {
        this.f71499b = (QueryMethod) Objects.requireNonNull(queryMethod);
        this.f71500c = (DnsMessage) Objects.requireNonNull(dnsMessage);
        this.f71501d = (DnsMessage) Objects.requireNonNull(dnsMessage2);
        this.f71498a = (InetAddress) Objects.requireNonNull(inetAddress);
        this.f71502e = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean m39612a() {
        if (this.f71501d.f71482b == DnsMessage.ResponseCode.NO_ERROR) {
            return true;
        }
        return false;
    }

    public String toString() {
        return this.f71501d.toString();
    }
}
