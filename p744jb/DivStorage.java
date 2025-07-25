package p744jb;

import androidx.annotation.AnyThread;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import lb.ExecutionResult;
import lb.StorageException;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p744jb.DivDataRepository;
import p803nb.RawJson;

@Metadata
/* renamed from: jb.c */
/* loaded from: classes8.dex */
public interface DivStorage {

    /* compiled from: DivStorage.kt */
    @Metadata
    /* renamed from: jb.c$a */
    /* loaded from: classes8.dex */
    public static class C37319a<T> {
        @NotNull

        /* renamed from: a */
        private final List<T> f98532a;
        @NotNull

        /* renamed from: b */
        private final List<StorageException> f98533b;

        /* JADX WARN: Multi-variable type inference failed */
        public C37319a(@NotNull List<? extends T> restoredData, @NotNull List<? extends StorageException> errors) {
            Intrinsics.checkNotNullParameter(restoredData, "restoredData");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f98532a = restoredData;
            this.f98533b = errors;
        }

        @NotNull
        /* renamed from: a */
        public final List<T> m18439a() {
            return m18436d();
        }

        @NotNull
        /* renamed from: b */
        public final List<StorageException> m18438b() {
            return m18437c();
        }

        @NotNull
        /* renamed from: c */
        public List<StorageException> m18437c() {
            return this.f98533b;
        }

        @NotNull
        /* renamed from: d */
        public List<T> m18436d() {
            return this.f98532a;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37319a)) {
                return false;
            }
            C37319a c37319a = (C37319a) obj;
            if (Intrinsics.m17075f(m18436d(), c37319a.m18436d()) && Intrinsics.m17075f(m18437c(), c37319a.m18437c())) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (m18436d().hashCode() * 31) + m18437c().hashCode();
        }

        @NotNull
        public String toString() {
            return "LoadDataResult(restoredData=" + m18436d() + ", errors=" + m18437c() + ')';
        }
    }

    /* compiled from: DivStorage.kt */
    @Metadata
    /* renamed from: jb.c$b */
    /* loaded from: classes8.dex */
    public static final class C37320b {
        @NotNull

        /* renamed from: a */
        private final Set<String> f98534a;
        @NotNull

        /* renamed from: b */
        private final List<StorageException> f98535b;

        /* JADX WARN: Multi-variable type inference failed */
        public C37320b(@NotNull Set<String> ids, @NotNull List<? extends StorageException> errors) {
            Intrinsics.checkNotNullParameter(ids, "ids");
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f98534a = ids;
            this.f98535b = errors;
        }

        @NotNull
        /* renamed from: a */
        public final Set<String> m18435a() {
            return this.f98534a;
        }

        @NotNull
        /* renamed from: b */
        public final List<StorageException> m18434b() {
            return this.f98535b;
        }

        public boolean equals(@Nullable Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C37320b)) {
                return false;
            }
            C37320b c37320b = (C37320b) obj;
            if (Intrinsics.m17075f(this.f98534a, c37320b.f98534a) && Intrinsics.m17075f(this.f98535b, c37320b.f98535b)) {
                return true;
            }
            return false;
        }

        public int hashCode() {
            return (this.f98534a.hashCode() * 31) + this.f98535b.hashCode();
        }

        @NotNull
        public String toString() {
            return "RemoveResult(ids=" + this.f98534a + ", errors=" + this.f98535b + ')';
        }
    }

    @AnyThread
    @NotNull
    /* renamed from: a */
    C37319a<RawJson> mo18423a(@NotNull Set<String> set);

    @AnyThread
    @NotNull
    /* renamed from: b */
    ExecutionResult mo18422b(@NotNull List<? extends RawJson> list, @NotNull DivDataRepository.EnumC37318a enumC37318a);

    @AnyThread
    @NotNull
    /* renamed from: c */
    C37320b mo18421c(@NotNull Function1<? super RawJson, Boolean> function1);
}
