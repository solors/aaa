package androidx.privacysandbox.ads.adservices.appsetid;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: AppSetId.kt */
@Metadata
/* loaded from: classes2.dex */
public final class AppSetId {
    @NotNull
    public static final Companion Companion = new Companion(null);
    public static final int SCOPE_APP = 1;
    public static final int SCOPE_DEVELOPER = 2;
    @NotNull

    /* renamed from: id */
    private final String f1399id;
    private final int scope;

    /* compiled from: AppSetId.kt */
    @Metadata
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public AppSetId(@NotNull String id2, int i) {
        Intrinsics.checkNotNullParameter(id2, "id");
        this.f1399id = id2;
        this.scope = i;
        boolean z = true;
        if (i != 1 && i != 2) {
            z = false;
        }
        if (z) {
            return;
        }
        throw new IllegalArgumentException("Scope undefined.".toString());
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AppSetId)) {
            return false;
        }
        AppSetId appSetId = (AppSetId) obj;
        if (Intrinsics.m17075f(this.f1399id, appSetId.f1399id) && this.scope == appSetId.scope) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getId() {
        return this.f1399id;
    }

    public final int getScope() {
        return this.scope;
    }

    public int hashCode() {
        return (this.f1399id.hashCode() * 31) + Integer.hashCode(this.scope);
    }

    @NotNull
    public String toString() {
        String str;
        if (this.scope == 1) {
            str = "SCOPE_APP";
        } else {
            str = "SCOPE_DEVELOPER";
        }
        return "AppSetId: id=" + this.f1399id + ", scope=" + str;
    }
}
