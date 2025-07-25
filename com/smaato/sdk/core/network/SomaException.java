package com.smaato.sdk.core.network;

import androidx.annotation.NonNull;
import com.ironsource.C21114v8;
import java.io.IOException;

/* loaded from: classes7.dex */
public class SomaException extends IOException {
    private final Type type;

    /* loaded from: classes7.dex */
    public enum Type {
        NO_CONTENT("Server returns empty response."),
        BAD_REQUEST("Client sent invalid request."),
        AGE_RESTRICTED_USER("Age restricted user."),
        BAD_RESPONSE("Internal server error."),
        TIMEOUT_ERROR("Connectivity issue or timeout."),
        CREATIVE_EXPIRED("Creative already expired");
        
        private final String description;

        Type(String str) {
            this.description = str;
        }

        @Override // java.lang.Enum
        @NonNull
        public String toString() {
            return C21114v8.C21123i.f54137d + name() + "]: " + this.description;
        }
    }

    public SomaException(@NonNull Type type) {
        this(type, type.description);
    }

    @NonNull
    public Type getType() {
        return this.type;
    }

    public SomaException(@NonNull Type type, @NonNull String str) {
        super(str);
        this.type = type;
    }

    public SomaException(@NonNull Type type, Throwable th) {
        super(th);
        this.type = type;
    }
}
