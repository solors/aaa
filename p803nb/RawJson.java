package p803nb;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

@Metadata
/* renamed from: nb.a */
/* loaded from: classes8.dex */
public interface RawJson {
    @NotNull

    /* renamed from: c8 */
    public static final C38486a f101835c8 = C38486a.f101836a;

    /* compiled from: RawJson.kt */
    @Metadata
    /* renamed from: nb.a$a */
    /* loaded from: classes8.dex */
    public static final class C38486a {

        /* renamed from: a */
        static final /* synthetic */ C38486a f101836a = new C38486a();

        private C38486a() {
        }

        @NotNull
        /* renamed from: a */
        public final RawJson m14624a(@NotNull String id2, @NotNull JSONObject data) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(data, "data");
            return new C38487b(id2, data);
        }
    }

    /* compiled from: RawJson.kt */
    @Metadata
    /* renamed from: nb.a$b */
    /* loaded from: classes8.dex */
    public static final class C38487b implements RawJson {
        @NotNull

        /* renamed from: b */
        private final String f101837b;
        @NotNull

        /* renamed from: c */
        private final JSONObject f101838c;

        public C38487b(@NotNull String id2, @NotNull JSONObject data) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(data, "data");
            this.f101837b = id2;
            this.f101838c = data;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C38487b)) {
                return false;
            }
            C38487b c38487b = (C38487b) obj;
            if (Intrinsics.m17075f(this.f101837b, c38487b.f101837b) && Intrinsics.m17075f(this.f101838c, c38487b.f101838c)) {
                return true;
            }
            return false;
        }

        @Override // p803nb.RawJson
        @NotNull
        public JSONObject getData() {
            return this.f101838c;
        }

        @Override // p803nb.RawJson
        @NotNull
        public String getId() {
            return this.f101837b;
        }

        public int hashCode() {
            return (this.f101837b.hashCode() * 31) + this.f101838c.hashCode();
        }

        @NotNull
        public String toString() {
            return "Ready(id=" + this.f101837b + ", data=" + this.f101838c + ')';
        }
    }

    @NotNull
    JSONObject getData();

    @NotNull
    String getId();
}
