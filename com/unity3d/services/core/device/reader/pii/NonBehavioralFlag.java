package com.unity3d.services.core.device.reader.pii;

import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p804nd.C38508r;
import p804nd.Result;

/* compiled from: NonBehavioralFlag.kt */
@Metadata
/* loaded from: classes7.dex */
public enum NonBehavioralFlag {
    UNKNOWN,
    TRUE,
    FALSE;
    
    @NotNull
    public static final Companion Companion = new Companion(null);

    /* compiled from: NonBehavioralFlag.kt */
    @Metadata
    /* loaded from: classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final NonBehavioralFlag fromString(@NotNull String value) {
            NonBehavioralFlag m14549b;
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                Result.C38506a c38506a = Result.f101870c;
                String upperCase = value.toUpperCase(Locale.ROOT);
                Intrinsics.checkNotNullExpressionValue(upperCase, "this as java.lang.String).toUpperCase(Locale.ROOT)");
                m14549b = Result.m14549b(NonBehavioralFlag.valueOf(upperCase));
            } catch (Throwable th) {
                Result.C38506a c38506a2 = Result.f101870c;
                m14549b = Result.m14549b(C38508r.m14540a(th));
            }
            NonBehavioralFlag nonBehavioralFlag = NonBehavioralFlag.UNKNOWN;
            if (Result.m14544g(m14549b)) {
                m14549b = nonBehavioralFlag;
            }
            return (NonBehavioralFlag) m14549b;
        }
    }
}
