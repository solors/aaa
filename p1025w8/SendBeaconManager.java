package p1025w8;

import android.content.Context;
import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: w8.d */
/* loaded from: classes7.dex */
public final class SendBeaconManager {
    @NotNull

    /* renamed from: b */
    private static final C44592a f117035b = new C44592a(null);
    @NotNull

    /* renamed from: a */
    private final SendBeaconWorkerImpl f117036a;

    /* compiled from: SendBeaconManager.kt */
    @Metadata
    /* renamed from: w8.d$a */
    /* loaded from: classes7.dex */
    private static final class C44592a {
        private C44592a() {
        }

        public /* synthetic */ C44592a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public SendBeaconManager(@NotNull Context context, @NotNull SendBeaconConfiguration configuration) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f117036a = new SendBeaconWorkerImpl(context, configuration);
    }

    /* renamed from: a */
    public final void m2286a(@NotNull Uri url, @NotNull Map<String, String> headers, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f117036a.m2276h(url, headers, jSONObject, true);
    }
}
