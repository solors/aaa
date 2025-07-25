package com.facebook.gamingservices;

import com.facebook.FacebookSdk;
import com.facebook.GraphResponse;
import com.facebook.gamingservices.cloudgaming.CloudGameLoginHandler;
import com.facebook.gamingservices.cloudgaming.DaemonRequest;
import com.facebook.gamingservices.cloudgaming.internal.SDKMessageEnum;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: GamingContext.kt */
@Metadata
/* loaded from: classes3.dex */
public final class GamingContext {
    @NotNull
    public static final Companion Companion = new Companion(null);
    private static final int DEFAULT_TIMEOUT = 5;
    @Nullable
    private static GamingContext currentContext;
    @NotNull
    private final String contextID;

    /* compiled from: GamingContext.kt */
    @Metadata
    /* loaded from: classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @Nullable
        public final GamingContext getCurrentGamingContext() {
            JSONObject jSONObject;
            String string;
            if (!CloudGameLoginHandler.isRunningInCloud()) {
                return GamingContext.currentContext;
            }
            GraphResponse executeAndWait = DaemonRequest.executeAndWait(FacebookSdk.getApplicationContext(), null, SDKMessageEnum.CONTEXT_GET_ID, 5);
            if (executeAndWait == null || (jSONObject = executeAndWait.getJSONObject()) == null) {
                string = null;
            } else {
                string = jSONObject.getString("id");
            }
            if (string == null) {
                return null;
            }
            return new GamingContext(string);
        }

        public final void setCurrentGamingContext(@NotNull GamingContext ctx) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            if (!CloudGameLoginHandler.isRunningInCloud()) {
                GamingContext.currentContext = ctx;
            }
        }
    }

    public GamingContext(@NotNull String contextID) {
        Intrinsics.checkNotNullParameter(contextID, "contextID");
        this.contextID = contextID;
    }

    public static /* synthetic */ GamingContext copy$default(GamingContext gamingContext, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = gamingContext.contextID;
        }
        return gamingContext.copy(str);
    }

    @Nullable
    public static final GamingContext getCurrentGamingContext() {
        return Companion.getCurrentGamingContext();
    }

    public static final void setCurrentGamingContext(@NotNull GamingContext gamingContext) {
        Companion.setCurrentGamingContext(gamingContext);
    }

    @NotNull
    public final String component1() {
        return this.contextID;
    }

    @NotNull
    public final GamingContext copy(@NotNull String contextID) {
        Intrinsics.checkNotNullParameter(contextID, "contextID");
        return new GamingContext(contextID);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof GamingContext) && Intrinsics.m17075f(this.contextID, ((GamingContext) obj).contextID)) {
            return true;
        }
        return false;
    }

    @NotNull
    public final String getContextID() {
        return this.contextID;
    }

    public int hashCode() {
        return this.contextID.hashCode();
    }

    @NotNull
    public String toString() {
        return "GamingContext(contextID=" + this.contextID + ')';
    }
}
