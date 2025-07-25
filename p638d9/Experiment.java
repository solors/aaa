package p638d9;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Metadata
/* renamed from: d9.a */
/* loaded from: classes8.dex */
public enum Experiment {
    TAP_BEACONS_ENABLED("tap_beacons_enabled", false, 2, null),
    VISIBILITY_BEACONS_ENABLED("visibility_beacons_enabled", false, 2, null),
    LONGTAP_ACTIONS_PASS_TO_CHILD_ENABLED("longtap_actions_pass_to_child", false, 2, null),
    IGNORE_ACTION_MENU_ITEMS_ENABLED("override_context_menu_handler", false, 2, null),
    HYPHENATION_SUPPORT_ENABLED("support_hyphenation", false, 2, null),
    VISUAL_ERRORS_ENABLED("visual_errors", false, 2, null),
    ACCESSIBILITY_ENABLED("accessibility_enabled", true),
    VIEW_POOL_ENABLED("view_pool_enabled", true),
    VIEW_POOL_PROFILING_ENABLED("view_pool_profiling_enabled", false, 2, null),
    VIEW_POOL_OPTIMIZATION_DEBUG("view_pool_optimization_debug", false, 2, null),
    RESOURCE_CACHE_ENABLED("resource_cache_enabled", true),
    SHOW_RENDERING_TIME("demo_activity_rendering_time_enabled", false),
    MULTIPLE_STATE_CHANGE_ENABLED("multiple_state_change_enabled", false, 2, null),
    BIND_ON_ATTACH_ENABLED("bind_on_attach_enabled", false, 2, null),
    COMPLEX_REBIND_ENABLED("complex_rebind_enabled", false, 2, null);
    
    @NotNull

    /* renamed from: b */
    private final String f89562b;

    /* renamed from: c */
    private final boolean f89563c;

    Experiment(String str, boolean z) {
        this.f89562b = str;
        this.f89563c = z;
    }

    /* renamed from: c */
    public final boolean m25678c() {
        return this.f89563c;
    }

    /* synthetic */ Experiment(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? false : z);
    }
}
