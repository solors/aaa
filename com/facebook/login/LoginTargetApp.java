package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.FacebookSdk;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoginTargetApp.kt */
@Metadata
/* loaded from: classes4.dex */
public enum LoginTargetApp {
    FACEBOOK(AccessToken.DEFAULT_GRAPH_DOMAIN),
    INSTAGRAM(FacebookSdk.INSTAGRAM);
    
    @NotNull
    public static final Companion Companion = new Companion(null);
    @NotNull
    private final String targetApp;

    /* compiled from: LoginTargetApp.kt */
    @Metadata
    /* loaded from: classes4.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoginTargetApp fromString(@Nullable String str) {
            LoginTargetApp[] valuesCustom = LoginTargetApp.valuesCustom();
            int length = valuesCustom.length;
            int i = 0;
            while (i < length) {
                LoginTargetApp loginTargetApp = valuesCustom[i];
                i++;
                if (Intrinsics.m17075f(loginTargetApp.toString(), str)) {
                    return loginTargetApp;
                }
            }
            return LoginTargetApp.FACEBOOK;
        }
    }

    LoginTargetApp(String str) {
        this.targetApp = str;
    }

    @NotNull
    public static final LoginTargetApp fromString(@Nullable String str) {
        return Companion.fromString(str);
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static LoginTargetApp[] valuesCustom() {
        LoginTargetApp[] valuesCustom = values();
        return (LoginTargetApp[]) Arrays.copyOf(valuesCustom, valuesCustom.length);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.targetApp;
    }
}
