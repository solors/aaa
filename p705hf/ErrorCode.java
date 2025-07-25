package p705hf;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* renamed from: hf.b */
/* loaded from: classes10.dex */
public enum ErrorCode {
    NO_ERROR(0),
    PROTOCOL_ERROR(1),
    INTERNAL_ERROR(2),
    FLOW_CONTROL_ERROR(3),
    SETTINGS_TIMEOUT(4),
    STREAM_CLOSED(5),
    FRAME_SIZE_ERROR(6),
    REFUSED_STREAM(7),
    CANCEL(8),
    COMPRESSION_ERROR(9),
    CONNECT_ERROR(10),
    ENHANCE_YOUR_CALM(11),
    INADEQUATE_SECURITY(12),
    HTTP_1_1_REQUIRED(13);
    
    @NotNull

    /* renamed from: c */
    public static final C33541a f91551c = new C33541a(null);

    /* renamed from: b */
    private final int f91567b;

    /* compiled from: ErrorCode.kt */
    @Metadata
    /* renamed from: hf.b$a */
    /* loaded from: classes10.dex */
    public static final class C33541a {
        private C33541a() {
        }

        public /* synthetic */ C33541a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        /* renamed from: a */
        public final ErrorCode m23554a(int i) {
            ErrorCode[] values;
            boolean z;
            for (ErrorCode errorCode : ErrorCode.values()) {
                if (errorCode.m23555c() == i) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    return errorCode;
                }
            }
            return null;
        }
    }

    ErrorCode(int i) {
        this.f91567b = i;
    }

    /* renamed from: c */
    public final int m23555c() {
        return this.f91567b;
    }
}
