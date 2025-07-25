package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.Record;
import com.smaato.sdk.core.util.Objects;

/* loaded from: classes7.dex */
public final class DnsResolver {
    @NonNull
    private final DnsClient dnsClient;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DnsResolver(@NonNull DnsClient dnsClient) {
        this.dnsClient = (DnsClient) Objects.requireNonNull(dnsClient);
    }

    @NonNull
    public final <D extends Data> ResolverResult<D> resolve(@NonNull String str, @NonNull Class<D> cls) throws DnsException {
        C27094j c27094j = new C27094j(DnsName.from(str), Record.Type.getType(cls));
        return new ResolverResult<>(c27094j, this.dnsClient.m39609b(c27094j));
    }
}
