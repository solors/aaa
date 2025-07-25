package p989u0;

import java.util.HashMap;
import java.util.Map;

/* renamed from: u0.c */
/* loaded from: classes3.dex */
public enum EnumC44418c {
    FAILED_INIT_ENCRYPTION("failed to init encryption"),
    FAILED_EXTRACT_ENCRYPTED_DATA("failed to extract encrypted data"),
    FAILED_STORE_ENCRYPTED_DATA("failed to store encrypted data"),
    IGNITE_SERVICE_UNAVAILABLE("Ignite service unavailable"),
    IGNITE_SERVICE_INVALID_SESSION("Invalid session token"),
    ONE_DT_EMPTY_ENTITY("received empty one dt from the service"),
    ONE_DT_AUTHENTICATOR_DESTROYED("authenticator already destroyed");
    

    /* renamed from: k */
    private static final Map<String, EnumC44418c> f116574k = new HashMap();

    /* renamed from: b */
    private final String f116576b;

    static {
        EnumC44418c[] values;
        for (EnumC44418c enumC44418c : values()) {
            f116574k.put(enumC44418c.f116576b, enumC44418c);
        }
    }

    EnumC44418c(String str) {
        this.f116576b = str;
    }

    /* renamed from: b */
    public final String m3081b() {
        return this.f116576b;
    }
}
