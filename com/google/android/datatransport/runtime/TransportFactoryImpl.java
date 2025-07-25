package com.google.android.datatransport.runtime;

import com.google.android.datatransport.Encoding;
import com.google.android.datatransport.Transformer;
import com.google.android.datatransport.Transport;
import com.google.android.datatransport.TransportFactory;
import java.util.Set;

/* loaded from: classes4.dex */
final class TransportFactoryImpl implements TransportFactory {

    /* renamed from: a */
    private final Set<Encoding> f31056a;

    /* renamed from: b */
    private final TransportContext f31057b;

    /* renamed from: c */
    private final TransportInternal f31058c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public TransportFactoryImpl(Set<Encoding> set, TransportContext transportContext, TransportInternal transportInternal) {
        this.f31056a = set;
        this.f31057b = transportContext;
        this.f31058c = transportInternal;
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> Transport<T> getTransport(String str, Class<T> cls, Transformer<T, byte[]> transformer) {
        return getTransport(str, cls, Encoding.m76344of("proto"), transformer);
    }

    @Override // com.google.android.datatransport.TransportFactory
    public <T> Transport<T> getTransport(String str, Class<T> cls, Encoding encoding, Transformer<T, byte[]> transformer) {
        if (this.f31056a.contains(encoding)) {
            return new TransportImpl(this.f31057b, str, encoding, transformer, this.f31058c);
        }
        throw new IllegalArgumentException(String.format("%s is not supported byt this factory. Supported encodings are: %s.", encoding, this.f31056a));
    }
}
