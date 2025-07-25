package io.appmetrica.analytics;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.impl.C33853Dm;
import io.appmetrica.analytics.impl.C35013xd;
import java.util.Currency;

/* loaded from: classes9.dex */
public class Revenue {
    @NonNull
    public final Currency currency;
    @Nullable
    public final String payload;
    public final long priceMicros;
    @Nullable
    public final String productID;
    @Nullable
    public final Integer quantity;
    @Nullable
    public final Receipt receipt;

    /* loaded from: classes9.dex */
    public static class Builder {

        /* renamed from: g */
        private static final C33853Dm f92239g = new C33853Dm(new C35013xd("revenue currency"));

        /* renamed from: a */
        final long f92240a;

        /* renamed from: b */
        final Currency f92241b;

        /* renamed from: c */
        Integer f92242c;

        /* renamed from: d */
        String f92243d;

        /* renamed from: e */
        String f92244e;

        /* renamed from: f */
        Receipt f92245f;

        /* synthetic */ Builder(long j, Currency currency, int i) {
            this(j, currency);
        }

        @NonNull
        public Revenue build() {
            return new Revenue(this, 0);
        }

        @NonNull
        public Builder withPayload(@Nullable String str) {
            this.f92244e = str;
            return this;
        }

        @NonNull
        public Builder withProductID(@Nullable String str) {
            this.f92243d = str;
            return this;
        }

        @NonNull
        public Builder withQuantity(@Nullable Integer num) {
            this.f92242c = num;
            return this;
        }

        @NonNull
        public Builder withReceipt(@Nullable Receipt receipt) {
            this.f92245f = receipt;
            return this;
        }

        private Builder(long j, Currency currency) {
            f92239g.mo20778a(currency);
            this.f92240a = j;
            this.f92241b = currency;
        }
    }

    /* loaded from: classes9.dex */
    public static class Receipt {
        @Nullable
        public final String data;
        @Nullable
        public final String signature;

        /* loaded from: classes9.dex */
        public static class Builder {

            /* renamed from: a */
            private String f92246a;

            /* renamed from: b */
            private String f92247b;

            /* synthetic */ Builder(int i) {
                this();
            }

            @NonNull
            public Receipt build() {
                return new Receipt(this, 0);
            }

            @NonNull
            public Builder withData(@Nullable String str) {
                this.f92246a = str;
                return this;
            }

            @NonNull
            public Builder withSignature(@Nullable String str) {
                this.f92247b = str;
                return this;
            }

            private Builder() {
            }
        }

        /* synthetic */ Receipt(Builder builder, int i) {
            this(builder);
        }

        @NonNull
        public static Builder newBuilder() {
            return new Builder(0);
        }

        private Receipt(Builder builder) {
            this.data = builder.f92246a;
            this.signature = builder.f92247b;
        }
    }

    /* synthetic */ Revenue(Builder builder, int i) {
        this(builder);
    }

    @NonNull
    public static Builder newBuilder(long j, @NonNull Currency currency) {
        return new Builder(j, currency, 0);
    }

    private Revenue(Builder builder) {
        this.priceMicros = builder.f92240a;
        this.currency = builder.f92241b;
        this.quantity = builder.f92242c;
        this.productID = builder.f92243d;
        this.payload = builder.f92244e;
        this.receipt = builder.f92245f;
    }
}
