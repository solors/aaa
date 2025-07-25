package p744jb;

import androidx.annotation.UiThread;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p744jb.DivDataRepository;
import p803nb.RawJson;

@Metadata
/* renamed from: jb.l */
/* loaded from: classes8.dex */
public interface RawJsonRepository {
    @UiThread
    @NotNull
    /* renamed from: a */
    C37341p mo18386a(@NotNull C37340a c37340a);

    @UiThread
    @NotNull
    /* renamed from: b */
    C37341p mo18385b(@NotNull List<String> list);

    @UiThread
    @NotNull
    /* renamed from: c */
    RawJsonRepositoryResult mo18384c(@NotNull Function1<? super RawJson, Boolean> function1);

    /* compiled from: RawJsonRepository.kt */
    @Metadata
    /* renamed from: jb.l$a */
    /* loaded from: classes8.dex */
    public static final class C37340a {
        @NotNull

        /* renamed from: a */
        private final List<RawJson> f98571a;
        @NotNull

        /* renamed from: b */
        private final DivDataRepository.EnumC37318a f98572b;

        /* JADX WARN: Multi-variable type inference failed */
        public C37340a(@NotNull List<? extends RawJson> jsons, @NotNull DivDataRepository.EnumC37318a actionOnError) {
            Intrinsics.checkNotNullParameter(jsons, "jsons");
            Intrinsics.checkNotNullParameter(actionOnError, "actionOnError");
            this.f98571a = jsons;
            this.f98572b = actionOnError;
        }

        @NotNull
        /* renamed from: a */
        public final DivDataRepository.EnumC37318a m18388a() {
            return this.f98572b;
        }

        @NotNull
        /* renamed from: b */
        public final List<RawJson> m18387b() {
            return this.f98571a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37340a)) {
                return false;
            }
            C37340a c37340a = (C37340a) obj;
            if (Intrinsics.m17075f(this.f98571a, c37340a.f98571a) && this.f98572b == c37340a.f98572b) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f98571a.hashCode() * 31) + this.f98572b.hashCode();
        }

        @NotNull
        public String toString() {
            return "Payload(jsons=" + this.f98571a + ", actionOnError=" + this.f98572b + ')';
        }

        public /* synthetic */ C37340a(List list, DivDataRepository.EnumC37318a enumC37318a, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? DivDataRepository.EnumC37318a.ABORT_TRANSACTION : enumC37318a);
        }
    }
}
