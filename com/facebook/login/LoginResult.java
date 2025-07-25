package com.facebook.login;

import com.facebook.AccessToken;
import com.facebook.AuthenticationToken;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: LoginResult.kt */
@Metadata
/* loaded from: classes4.dex */
public final class LoginResult {
    @NotNull
    private final AccessToken accessToken;
    @Nullable
    private final AuthenticationToken authenticationToken;
    @NotNull
    private final Set<String> recentlyDeniedPermissions;
    @NotNull
    private final Set<String> recentlyGrantedPermissions;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LoginResult(@NotNull AccessToken accessToken, @NotNull Set<String> recentlyGrantedPermissions, @NotNull Set<String> recentlyDeniedPermissions) {
        this(accessToken, null, recentlyGrantedPermissions, recentlyDeniedPermissions, 2, null);
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LoginResult copy$default(LoginResult loginResult, AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i, Object obj) {
        if ((i & 1) != 0) {
            accessToken = loginResult.accessToken;
        }
        if ((i & 2) != 0) {
            authenticationToken = loginResult.authenticationToken;
        }
        if ((i & 4) != 0) {
            set = loginResult.recentlyGrantedPermissions;
        }
        if ((i & 8) != 0) {
            set2 = loginResult.recentlyDeniedPermissions;
        }
        return loginResult.copy(accessToken, authenticationToken, set, set2);
    }

    @NotNull
    public final AccessToken component1() {
        return this.accessToken;
    }

    @Nullable
    public final AuthenticationToken component2() {
        return this.authenticationToken;
    }

    @NotNull
    public final Set<String> component3() {
        return this.recentlyGrantedPermissions;
    }

    @NotNull
    public final Set<String> component4() {
        return this.recentlyDeniedPermissions;
    }

    @NotNull
    public final LoginResult copy(@NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @NotNull Set<String> recentlyGrantedPermissions, @NotNull Set<String> recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        return new LoginResult(accessToken, authenticationToken, recentlyGrantedPermissions, recentlyDeniedPermissions);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LoginResult)) {
            return false;
        }
        LoginResult loginResult = (LoginResult) obj;
        if (Intrinsics.m17075f(this.accessToken, loginResult.accessToken) && Intrinsics.m17075f(this.authenticationToken, loginResult.authenticationToken) && Intrinsics.m17075f(this.recentlyGrantedPermissions, loginResult.recentlyGrantedPermissions) && Intrinsics.m17075f(this.recentlyDeniedPermissions, loginResult.recentlyDeniedPermissions)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final AccessToken getAccessToken() {
        return this.accessToken;
    }

    @Nullable
    public final AuthenticationToken getAuthenticationToken() {
        return this.authenticationToken;
    }

    @NotNull
    public final Set<String> getRecentlyDeniedPermissions() {
        return this.recentlyDeniedPermissions;
    }

    @NotNull
    public final Set<String> getRecentlyGrantedPermissions() {
        return this.recentlyGrantedPermissions;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = this.accessToken.hashCode() * 31;
        AuthenticationToken authenticationToken = this.authenticationToken;
        if (authenticationToken == null) {
            hashCode = 0;
        } else {
            hashCode = authenticationToken.hashCode();
        }
        return ((((hashCode2 + hashCode) * 31) + this.recentlyGrantedPermissions.hashCode()) * 31) + this.recentlyDeniedPermissions.hashCode();
    }

    @NotNull
    public String toString() {
        return "LoginResult(accessToken=" + this.accessToken + ", authenticationToken=" + this.authenticationToken + ", recentlyGrantedPermissions=" + this.recentlyGrantedPermissions + ", recentlyDeniedPermissions=" + this.recentlyDeniedPermissions + ')';
    }

    public LoginResult(@NotNull AccessToken accessToken, @Nullable AuthenticationToken authenticationToken, @NotNull Set<String> recentlyGrantedPermissions, @NotNull Set<String> recentlyDeniedPermissions) {
        Intrinsics.checkNotNullParameter(accessToken, "accessToken");
        Intrinsics.checkNotNullParameter(recentlyGrantedPermissions, "recentlyGrantedPermissions");
        Intrinsics.checkNotNullParameter(recentlyDeniedPermissions, "recentlyDeniedPermissions");
        this.accessToken = accessToken;
        this.authenticationToken = authenticationToken;
        this.recentlyGrantedPermissions = recentlyGrantedPermissions;
        this.recentlyDeniedPermissions = recentlyDeniedPermissions;
    }

    public /* synthetic */ LoginResult(AccessToken accessToken, AuthenticationToken authenticationToken, Set set, Set set2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(accessToken, (i & 2) != 0 ? null : authenticationToken, set, set2);
    }
}
