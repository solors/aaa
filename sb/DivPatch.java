package sb;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p656eb.JSONSerializable;
import p743ja.Hashable;

@Metadata
/* renamed from: sb.qg */
/* loaded from: classes8.dex */
public class DivPatch implements JSONSerializable, Hashable {

    /* compiled from: DivPatch.kt */
    @Metadata
    /* renamed from: sb.qg$a */
    /* loaded from: classes8.dex */
    public enum EnumC41562a {
        TRANSACTIONAL("transactional"),
        PARTIAL("partial");
        
        @NotNull

        /* renamed from: c */
        public static final C41564b f108788c = new C41564b(null);
        @NotNull

        /* renamed from: d */
        private static final Function1<String, EnumC41562a> f108789d = C41563a.f108794g;
        @NotNull

        /* renamed from: b */
        private final String f108793b;

        /* compiled from: DivPatch.kt */
        @Metadata
        /* renamed from: sb.qg$a$a */
        /* loaded from: classes8.dex */
        static final class C41563a extends Lambda implements Function1<String, EnumC41562a> {

            /* renamed from: g */
            public static final C41563a f108794g = new C41563a();

            C41563a() {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            @Nullable
            /* renamed from: b */
            public final EnumC41562a invoke(@NotNull String string) {
                Intrinsics.checkNotNullParameter(string, "string");
                EnumC41562a enumC41562a = EnumC41562a.TRANSACTIONAL;
                if (!Intrinsics.m17075f(string, enumC41562a.f108793b)) {
                    EnumC41562a enumC41562a2 = EnumC41562a.PARTIAL;
                    if (!Intrinsics.m17075f(string, enumC41562a2.f108793b)) {
                        return null;
                    }
                    return enumC41562a2;
                }
                return enumC41562a;
            }
        }

        /* compiled from: DivPatch.kt */
        @Metadata
        /* renamed from: sb.qg$a$b */
        /* loaded from: classes8.dex */
        public static final class C41564b {
            private C41564b() {
            }

            public /* synthetic */ C41564b(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }
        }

        EnumC41562a(String str) {
            this.f108793b = str;
        }
    }
}
