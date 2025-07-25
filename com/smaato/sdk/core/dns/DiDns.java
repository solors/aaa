package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.p569di.ClassFactory;
import com.smaato.sdk.core.p569di.DiConstructor;
import com.smaato.sdk.core.p569di.DiRegistry;
import com.smaato.sdk.core.util.collections.Sets;
import com.smaato.sdk.core.util.p574fi.Consumer;
import com.smaato.sdk.core.util.p574fi.Supplier;
import java.net.InetAddress;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes7.dex */
public final class DiDns {
    private static final Set<InetAddress> DNS_SERVERS = Sets.m39341of(InetAddressUtil.m39600a("8.8.8.8"), InetAddressUtil.m39599b("[2001:4860:4860::8888]"));

    /* renamed from: com.smaato.sdk.core.dns.DiDns$a */
    /* loaded from: classes7.dex */
    public static class C27084a {

        /* renamed from: a */
        private static final AtomicInteger f71480a = new AtomicInteger(1);

        /* renamed from: a */
        static /* synthetic */ int m39631a() {
            return m39630b();
        }

        /* renamed from: b */
        private static int m39630b() {
            AtomicInteger atomicInteger;
            int i;
            int i2;
            do {
                atomicInteger = f71480a;
                i = atomicInteger.get();
                i2 = i + 1;
                if (i2 > 16777215) {
                    i2 = 1;
                }
            } while (!atomicInteger.compareAndSet(i, i2));
            return i;
        }
    }

    private DiDns() {
    }

    @NonNull
    public static DiRegistry createRegistry() {
        return DiRegistry.m39638of(new Consumer() { // from class: com.smaato.sdk.core.dns.a
            @Override // com.smaato.sdk.core.util.p574fi.Consumer
            public final void accept(Object obj) {
                DiDns.lambda$createRegistry$4((DiRegistry) obj);
            }
        });
    }

    public static /* synthetic */ DnsResolver lambda$createRegistry$0(DiConstructor diConstructor) {
        return new DnsResolver((DnsClient) diConstructor.get(DnsClient.class));
    }

    public static /* synthetic */ Integer lambda$createRegistry$1() {
        return Integer.valueOf(C27084a.m39631a());
    }

    public static /* synthetic */ DnsClient lambda$createRegistry$2(DiConstructor diConstructor) {
        return new DnsClient((DnsDataSource) diConstructor.get(DnsDataSource.class), new Supplier() { // from class: com.smaato.sdk.core.dns.b
            @Override // com.smaato.sdk.core.util.p574fi.Supplier
            public final Object get() {
                Integer lambda$createRegistry$1;
                lambda$createRegistry$1 = DiDns.lambda$createRegistry$1();
                return lambda$createRegistry$1;
            }
        }, DNS_SERVERS);
    }

    public static /* synthetic */ DnsDataSource lambda$createRegistry$3(DiConstructor diConstructor) {
        return new DnsDataSource();
    }

    public static /* synthetic */ void lambda$createRegistry$4(DiRegistry diRegistry) {
        diRegistry.registerFactory(DnsResolver.class, new ClassFactory() { // from class: com.smaato.sdk.core.dns.c
            @Override // com.smaato.sdk.core.p569di.ClassFactory
            public final Object get(DiConstructor diConstructor) {
                DnsResolver lambda$createRegistry$0;
                lambda$createRegistry$0 = DiDns.lambda$createRegistry$0(diConstructor);
                return lambda$createRegistry$0;
            }
        });
        diRegistry.registerFactory(DnsClient.class, new ClassFactory() { // from class: com.smaato.sdk.core.dns.d
            @Override // com.smaato.sdk.core.p569di.ClassFactory
            public final Object get(DiConstructor diConstructor) {
                DnsClient lambda$createRegistry$2;
                lambda$createRegistry$2 = DiDns.lambda$createRegistry$2(diConstructor);
                return lambda$createRegistry$2;
            }
        });
        diRegistry.registerFactory(DnsDataSource.class, new ClassFactory() { // from class: com.smaato.sdk.core.dns.e
            @Override // com.smaato.sdk.core.p569di.ClassFactory
            public final Object get(DiConstructor diConstructor) {
                DnsDataSource lambda$createRegistry$3;
                lambda$createRegistry$3 = DiDns.lambda$createRegistry$3(diConstructor);
                return lambda$createRegistry$3;
            }
        });
    }
}
