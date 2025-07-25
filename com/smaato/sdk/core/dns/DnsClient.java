package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.dns.DnsException;
import com.smaato.sdk.core.util.Objects;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p574fi.Supplier;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.smaato.sdk.core.dns.f */
/* loaded from: classes7.dex */
public final class DnsClient {
    @NonNull

    /* renamed from: a */
    private final DnsDataSource f71507a;
    @NonNull

    /* renamed from: b */
    private final Supplier<Integer> f71508b;
    @NonNull

    /* renamed from: c */
    private final Set<InetAddress> f71509c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DnsClient(@NonNull DnsDataSource dnsDataSource, @NonNull Supplier<Integer> supplier, @NonNull Set<InetAddress> set) {
        this.f71507a = (DnsDataSource) Objects.requireNonNull(dnsDataSource);
        this.f71508b = (Supplier) Objects.requireNonNull(supplier);
        this.f71509c = Sets.toImmutableSet(set);
    }

    @NonNull
    /* renamed from: a */
    private DnsMessage m39610a(C27094j c27094j) {
        return DnsMessage.m39617m().setQuestion(c27094j).setId(this.f71508b.get().intValue()).setRecursionDesired(true).build();
    }

    @NonNull
    /* renamed from: b */
    public DnsQueryResult m39609b(@NonNull C27094j c27094j) throws DnsException {
        DnsQueryResult m39608a;
        DnsMessage m39610a = m39610a(c27094j);
        ArrayList arrayList = new ArrayList(this.f71509c.size());
        for (InetAddress inetAddress : this.f71509c) {
            try {
                m39608a = this.f71507a.m39608a(m39610a, inetAddress, 53);
            } catch (DnsException e) {
                arrayList.add(e);
            }
            if (m39608a.m39612a()) {
                return m39608a;
            }
            arrayList.add(new DnsException.ErrorResponseException(m39610a, m39608a));
        }
        if (arrayList.isEmpty()) {
            throw new DnsException.NoQueryPossibleException(m39610a);
        }
        throw new DnsException.C27085a(arrayList);
    }
}
