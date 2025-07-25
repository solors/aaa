package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.Data;
import com.smaato.sdk.core.dns.DnsMessage;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import java.util.Set;

/* loaded from: classes7.dex */
public final class ResolverResult<D extends Data> {
    @NonNull
    private final Set<D> data;
    @NonNull
    private final C27094j request;
    @NonNull
    private final DnsMessage.ResponseCode responseCode;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ResolverResult(@NonNull C27094j c27094j, @NonNull DnsQueryResult dnsQueryResult) {
        Objects.requireNonNull(dnsQueryResult);
        DnsMessage dnsMessage = dnsQueryResult.f71501d;
        this.request = (C27094j) Objects.requireNonNull(c27094j);
        this.responseCode = dnsMessage.f71482b;
        this.data = Sets.toImmutableSet(dnsMessage.m39615o(c27094j));
    }

    @NonNull
    public Set<D> getAnswers() {
        return this.data;
    }

    public final String toString() {
        return ResolverResult.class.getName() + "\nQuestion: " + this.request + "\nResponse Code: " + this.responseCode + '\n';
    }
}
