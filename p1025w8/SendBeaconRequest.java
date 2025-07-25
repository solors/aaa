package p1025w8;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p1041x8.CookieStorage;

@Metadata
/* renamed from: w8.f */
/* loaded from: classes7.dex */
public final class SendBeaconRequest {
    @NotNull

    /* renamed from: d */
    public static final C44593a f117037d = new C44593a(null);
    @NotNull

    /* renamed from: a */
    private final Uri f117038a;
    @NotNull

    /* renamed from: b */
    private final Map<String, String> f117039b;
    @Nullable

    /* renamed from: c */
    private final JSONObject f117040c;

    /* compiled from: SendBeaconRequest.kt */
    @Metadata
    /* renamed from: w8.f$a */
    /* loaded from: classes7.dex */
    public static final class C44593a {
        private C44593a() {
        }

        public /* synthetic */ C44593a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* renamed from: a */
        public final SendBeaconRequest m2284a(@NotNull BeaconItem beaconItem) {
            Intrinsics.checkNotNullParameter(beaconItem, "beaconItem");
            Uri m2301e = beaconItem.m2301e();
            Map<String, String> m2303c = beaconItem.m2303c();
            JSONObject m2302d = beaconItem.m2302d();
            beaconItem.mo2299b();
            return new SendBeaconRequest(m2301e, m2303c, m2302d, null);
        }
    }

    public SendBeaconRequest(@NotNull Uri url, @NotNull Map<String, String> headers, @Nullable JSONObject jSONObject, @Nullable CookieStorage cookieStorage) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f117038a = url;
        this.f117039b = headers;
        this.f117040c = jSONObject;
    }

    @NotNull
    /* renamed from: a */
    public final Uri m2285a() {
        return this.f117038a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendBeaconRequest)) {
            return false;
        }
        SendBeaconRequest sendBeaconRequest = (SendBeaconRequest) obj;
        if (Intrinsics.m17075f(this.f117038a, sendBeaconRequest.f117038a) && Intrinsics.m17075f(this.f117039b, sendBeaconRequest.f117039b) && Intrinsics.m17075f(this.f117040c, sendBeaconRequest.f117040c) && Intrinsics.m17075f(null, null)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        int hashCode;
        int hashCode2 = ((this.f117038a.hashCode() * 31) + this.f117039b.hashCode()) * 31;
        JSONObject jSONObject = this.f117040c;
        if (jSONObject == null) {
            hashCode = 0;
        } else {
            hashCode = jSONObject.hashCode();
        }
        return ((hashCode2 + hashCode) * 31) + 0;
    }

    @NotNull
    public String toString() {
        return "SendBeaconRequest(url=" + this.f117038a + ", headers=" + this.f117039b + ", payload=" + this.f117040c + ", cookieStorage=" + ((Object) null) + ')';
    }
}
