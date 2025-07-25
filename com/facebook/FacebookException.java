package com.facebook;

import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.errorreport.ErrorReportHandler;
import java.util.Random;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: FacebookException.kt */
@Metadata
/* loaded from: classes3.dex */
public class FacebookException extends RuntimeException {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final long serialVersionUID = 1;

    /* compiled from: FacebookException.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public FacebookException() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: _init_$lambda-0  reason: not valid java name */
    public static final void m110030_init_$lambda0(String str, boolean z) {
        if (z) {
            try {
                ErrorReportHandler.save(str);
            } catch (Exception unused) {
            }
        }
    }

    @Override // java.lang.Throwable
    @NotNull
    public String toString() {
        String message = getMessage();
        if (message == null) {
            return "";
        }
        return message;
    }

    public FacebookException(@Nullable final String str) {
        super(str);
        Random random = new Random();
        if (str == null || !FacebookSdk.isInitialized() || random.nextInt(100) <= 50) {
            return;
        }
        FeatureManager featureManager = FeatureManager.INSTANCE;
        FeatureManager.checkFeature(FeatureManager.Feature.ErrorReport, new FeatureManager.Callback() { // from class: com.facebook.f
            @Override // com.facebook.internal.FeatureManager.Callback
            public final void onCompleted(boolean z) {
                FacebookException.m110030_init_$lambda0(str, z);
            }
        });
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public FacebookException(@org.jetbrains.annotations.Nullable java.lang.String r2, @org.jetbrains.annotations.NotNull java.lang.Object... r3) {
        /*
            r1 = this;
            java.lang.String r0 = "args"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r0)
            if (r2 != 0) goto L9
            r2 = 0
            goto L1c
        L9:
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            int r0 = r3.length
            java.lang.Object[] r3 = java.util.Arrays.copyOf(r3, r0)
            java.lang.String r2 = java.lang.String.format(r2, r3)
            java.lang.String r3 = "java.lang.String.format(this, *args)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
        L1c:
            r1.<init>(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.FacebookException.<init>(java.lang.String, java.lang.Object[]):void");
    }

    public FacebookException(@Nullable String str, @Nullable Throwable th) {
        super(str, th);
    }

    public FacebookException(@Nullable Throwable th) {
        super(th);
    }
}
