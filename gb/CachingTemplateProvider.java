package gb;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p656eb.JsonTemplate;

@Metadata
/* renamed from: gb.a */
/* loaded from: classes8.dex */
public class CachingTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {
    @NotNull

    /* renamed from: b */
    private final InMemoryTemplateProvider<T> f90838b;
    @NotNull

    /* renamed from: c */
    private TemplateProvider<? extends T> f90839c;

    public CachingTemplateProvider(@NotNull InMemoryTemplateProvider<T> cacheProvider, @NotNull TemplateProvider<? extends T> fallbackProvider) {
        Intrinsics.checkNotNullParameter(cacheProvider, "cacheProvider");
        Intrinsics.checkNotNullParameter(fallbackProvider, "fallbackProvider");
        this.f90838b = cacheProvider;
        this.f90839c = fallbackProvider;
    }

    /* renamed from: b */
    public void m24222b(@NotNull Map<String, ? extends T> parsed) {
        Intrinsics.checkNotNullParameter(parsed, "parsed");
        for (Map.Entry<String, ? extends T> entry : parsed.entrySet()) {
            this.f90838b.m24220b(entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: c */
    public void m24221c(@NotNull Map<String, T> target) {
        Intrinsics.checkNotNullParameter(target, "target");
        this.f90838b.m24219c(target);
    }

    @Override // gb.TemplateProvider
    @Nullable
    public T get(@NotNull String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        T t = this.f90838b.get(templateId);
        if (t != null) {
            return t;
        }
        T t2 = this.f90839c.get(templateId);
        if (t2 != null) {
            this.f90838b.m24220b(templateId, t2);
            return t2;
        }
        return null;
    }
}
