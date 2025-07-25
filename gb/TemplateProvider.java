package gb;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p656eb.C32965h;
import p656eb.JsonTemplate;
import p656eb.ParsingException;

@Metadata
/* renamed from: gb.c */
/* loaded from: classes8.dex */
public interface TemplateProvider<T extends JsonTemplate<?>> {
    @NotNull

    /* renamed from: a */
    public static final C33294a f90841a = C33294a.f90842a;

    /* compiled from: TemplateProvider.kt */
    @Metadata
    /* renamed from: gb.c$a */
    /* loaded from: classes8.dex */
    public static final class C33294a {

        /* renamed from: a */
        static final /* synthetic */ C33294a f90842a = new C33294a();

        /* compiled from: TemplateProvider.kt */
        @Metadata
        /* renamed from: gb.c$a$a */
        /* loaded from: classes8.dex */
        public static final class C33295a implements TemplateProvider<T> {
            C33295a() {
            }

            @Override // gb.TemplateProvider
            @Nullable
            public T get(@NotNull String templateId) {
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                return null;
            }
        }

        /* compiled from: TemplateProvider.kt */
        @Metadata
        /* renamed from: gb.c$a$b */
        /* loaded from: classes8.dex */
        public static final class C33296b implements TemplateProvider<T> {

            /* renamed from: b */
            final /* synthetic */ Map<String, T> f90843b;

            /* JADX WARN: Multi-variable type inference failed */
            C33296b(Map<String, ? extends T> map) {
                this.f90843b = map;
            }

            @Override // gb.TemplateProvider
            @Nullable
            public T get(@NotNull String templateId) {
                Intrinsics.checkNotNullParameter(templateId, "templateId");
                return this.f90843b.get(templateId);
            }
        }

        private C33294a() {
        }

        @NotNull
        /* renamed from: a */
        public final <T extends JsonTemplate<?>> TemplateProvider<T> m24217a() {
            return new C33295a();
        }

        @NotNull
        /* renamed from: b */
        public final <T extends JsonTemplate<?>> TemplateProvider<T> m24216b(@NotNull Map<String, ? extends T> map) {
            Intrinsics.checkNotNullParameter(map, "map");
            return new C33296b(map);
        }
    }

    @NotNull
    /* renamed from: a */
    default T m24218a(@NotNull String templateId, @NotNull JSONObject json) throws ParsingException {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(json, "json");
        T t = get(templateId);
        if (t != null) {
            return t;
        }
        throw C32965h.m25374p(json, templateId);
    }

    @Nullable
    T get(@NotNull String str);
}
