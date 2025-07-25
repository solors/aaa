package gb;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p1059ya.C45072b;
import p656eb.JsonTemplate;

@Metadata
/* renamed from: gb.b */
/* loaded from: classes8.dex */
public final class InMemoryTemplateProvider<T extends JsonTemplate<?>> implements TemplateProvider<T> {
    @NotNull

    /* renamed from: b */
    private final Map<String, T> f90840b = C45072b.m1011b();

    /* renamed from: b */
    public final void m24220b(@NotNull String templateId, @NotNull T jsonTemplate) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        Intrinsics.checkNotNullParameter(jsonTemplate, "jsonTemplate");
        this.f90840b.put(templateId, jsonTemplate);
    }

    /* renamed from: c */
    public final void m24219c(@NotNull Map<String, T> target) {
        Intrinsics.checkNotNullParameter(target, "target");
        target.putAll(this.f90840b);
    }

    @Override // gb.TemplateProvider
    @Nullable
    public T get(@NotNull String templateId) {
        Intrinsics.checkNotNullParameter(templateId, "templateId");
        return this.f90840b.get(templateId);
    }
}
