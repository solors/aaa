package com.smaato.sdk.core.dns;

import androidx.annotation.NonNull;
import com.smaato.sdk.core.util.Joiner;
import com.smaato.sdk.core.util.Objects;
import java.io.IOException;
import java.util.List;

/* loaded from: classes7.dex */
public abstract class DnsException extends IOException {

    /* loaded from: classes7.dex */
    public static class ErrorResponseException extends DnsException {
        @NonNull
        private final DnsMessage request;
        @NonNull
        private final DnsQueryResult result;

        /* JADX INFO: Access modifiers changed from: package-private */
        public ErrorResponseException(@NonNull DnsMessage dnsMessage, @NonNull DnsQueryResult dnsQueryResult) {
            super("Received " + dnsQueryResult.f71501d.f71482b + " error response\n" + dnsQueryResult);
            this.request = (DnsMessage) Objects.requireNonNull(dnsMessage);
            this.result = (DnsQueryResult) Objects.requireNonNull(dnsQueryResult);
        }

        @NonNull
        public DnsMessage getRequest() {
            return this.request;
        }

        @NonNull
        public DnsQueryResult getResult() {
            return this.result;
        }
    }

    /* loaded from: classes7.dex */
    public static class IdMismatch extends DnsException {
        @NonNull
        private final DnsMessage request;
        @NonNull
        private final DnsMessage response;

        /* JADX INFO: Access modifiers changed from: package-private */
        public IdMismatch(@NonNull DnsMessage dnsMessage, @NonNull DnsMessage dnsMessage2) {
            super("The response's ID doesn't matches the request ID. Request: " + dnsMessage.f71481a + ". Response: " + dnsMessage2.f71481a);
            this.request = (DnsMessage) Objects.requireNonNull(dnsMessage);
            this.response = (DnsMessage) Objects.requireNonNull(dnsMessage2);
        }

        @NonNull
        public DnsMessage getRequest() {
            return this.request;
        }

        @NonNull
        public DnsMessage getResponse() {
            return this.response;
        }
    }

    /* loaded from: classes7.dex */
    public static class NoQueryPossibleException extends DnsException {
        @NonNull
        private final DnsMessage request;

        /* JADX INFO: Access modifiers changed from: package-private */
        public NoQueryPossibleException(@NonNull DnsMessage dnsMessage) {
            super("No DNS server could be queried");
            this.request = (DnsMessage) Objects.requireNonNull(dnsMessage);
        }

        public DnsMessage getRequest() {
            return this.request;
        }
    }

    /* renamed from: com.smaato.sdk.core.dns.DnsException$a */
    /* loaded from: classes7.dex */
    static class C27085a extends DnsException {
        /* JADX INFO: Access modifiers changed from: package-private */
        public C27085a(@NonNull List<? extends IOException> list) {
            super(Joiner.join(", ", list));
        }
    }

    DnsException(@NonNull String str) {
        super(str);
    }
}
