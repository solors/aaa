package p1025w8;

import android.net.Uri;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p1041x8.CookieStorage;

@Metadata
/* renamed from: w8.a */
/* loaded from: classes7.dex */
public abstract class BeaconItem {
    @NotNull

    /* renamed from: a */
    private final Uri f117024a;
    @NotNull

    /* renamed from: b */
    private final Map<String, String> f117025b;
    @Nullable

    /* renamed from: c */
    private final JSONObject f117026c;

    /* renamed from: d */
    private final long f117027d;

    public BeaconItem(@NotNull Uri url, @NotNull Map<String, String> headers, @Nullable JSONObject jSONObject, long j) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(headers, "headers");
        this.f117024a = url;
        this.f117025b = headers;
        this.f117026c = jSONObject;
        this.f117027d = j;
    }

    @Nullable
    /* renamed from: a */
    public abstract C44588a mo2300a();

    @Nullable
    /* renamed from: b */
    public abstract CookieStorage mo2299b();

    @NotNull
    /* renamed from: c */
    public final Map<String, String> m2303c() {
        return this.f117025b;
    }

    @Nullable
    /* renamed from: d */
    public final JSONObject m2302d() {
        return this.f117026c;
    }

    @NotNull
    /* renamed from: e */
    public final Uri m2301e() {
        return this.f117024a;
    }

    @NotNull
    public String toString() {
        return "BeaconItem{url=" + this.f117024a + ", headers=" + this.f117025b + ", addTimestamp=" + this.f117027d;
    }

    /* compiled from: BeaconItem.kt */
    @Metadata
    /* renamed from: w8.a$a */
    /* loaded from: classes7.dex */
    public static final class C44588a extends BeaconItem {

        /* renamed from: e */
        private final long f117028e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C44588a(@NotNull Uri url, @NotNull Map<String, String> headers, @Nullable JSONObject jSONObject, long j, long j2) {
            super(url, headers, jSONObject, j);
            Intrinsics.checkNotNullParameter(url, "url");
            Intrinsics.checkNotNullParameter(headers, "headers");
            this.f117028e = j2;
        }

        @Override // p1025w8.BeaconItem
        @Nullable
        /* renamed from: b */
        public CookieStorage mo2299b() {
            return null;
        }

        /* renamed from: f */
        public final long m2298f() {
            return this.f117028e;
        }

        @Override // p1025w8.BeaconItem
        @NotNull
        /* renamed from: a */
        public C44588a mo2300a() {
            return this;
        }
    }
}
